package com.example.ProyectoCompilador.Analisis;

import org.springframework.stereotype.Service;
import ContextualA.*;
import ErrorHandling.*;
import Generated.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class Analisis {
    
    public Map<String, String> getAnalisisSintactico(String code){

        //JSON PARA ENVIAR A FRONTEND:
        Map<String, String> json = new HashMap<>();

        MiScannerAS inst = null;
        MiParserAS parser = null;
        ParseTree tree = null;

        CharStream input = null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        //try {
            input = CharStreams.fromString(code);
            //input = CharStreams.fromFileName("test.txt");
            inst = new MiScannerAS(input);
            tokens = new CommonTokenStream(inst);
            parser = new MiParserAS(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener(errorListener);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            tree = parser.program();


            if (!errorListener.hasErrors()) {
                try {
                    ContextualAnalysis ac = new ContextualAnalysis();
                    ac.table.openScope();
                    ac.visit(tree);
                    if (ac.errorMsgs.size() > 0){
                        json.put("data", "Compilacion Fallida: \n Error(es) Contextual(es): " + ac.errorMsgs.toString());
                        json.put("code", "400");
                    }else{
                        json.put("data", "Compilacion Exitosa!!");
                        json.put("code", "200");
                    }
                } catch (RecognitionException e) {

                    System.err.println("Error!!!");
                    e.printStackTrace();
                }
                json.put("data", "Compilacion Exitosa!!");
                json.put("code", "200");
                System.out.println("Compilación Exitosa!!\n");
                //  java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //  treeGUI.get().setVisible(true);
            } else {
                json.put("error", "Compilacion Fallida: \n" + errorListener.toString());
                json.put("code", "400");
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
            }
        /*} catch (InterruptedException | ExecutionException |  IOException e) {
            e.printStackTrace();
            json.put("error", "Ha ocurrido un error en el servidor.");
            json.put("code", "500");
        }*/
        return json;
    }
}
