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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class Analisis {

    public Map<String, String> getAnalisisSintactico(String code) {

        //JSON PARA ENVIAR A FRONTEND:
        Map<String, String> json = new HashMap<>();

        MiScannerAS inst = null;
        MiParserAS parser = null;
        ParseTree tree = null;

        CharStream input = null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        input = CharStreams.fromString(code);
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
                if (ac.errorMsgs.size() > 0) {
                    json.put("error", "Compilación Fallida:  Error(es) Contextual(es):\n" + ListToString(ac.errorMsgs));
                    json.put("code", "400");
                } else {
                    json.put("data", "Compilación Exitosa!!");
                    json.put("code", "200");
                    System.out.println("Compilación Exitosa!!\n");
                }
            } catch (RecognitionException e) {
                System.err.println("Error!!!");
                e.printStackTrace();
            }
            System.out.println("Compilación Exitosa!!\n");
        } else {
            json.put("error", "Compilación Fallida:  Error(es) Sintáctico(s):\n" + errorListener.toString());
            json.put("code", "400");
            System.out.println("Compilación Fallida!!\n");
            System.out.println(errorListener.toString());
        }
        return json;
    }

    public String ListToString(ArrayList<String> errores) {
        StringBuilder builder = new StringBuilder();
        for (String s : errores) {
            builder.append(String.format("%s\n", s));
        }
        return builder.toString();

    }
}