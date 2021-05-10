package com.example.ProyectoCompilador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class ProyectoCompiladorApplication {

	public static void main(String[] args) {
		MiScannerAS inst = null;
        MiParserAS parser = null;
        ParseTree tree = null;

        CharStream input = null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new MiScannerAS(input);
            tokens = new CommonTokenStream(inst);
            parser = new MiParserAS(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener(errorListener);

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            try {
                tree = parser.program();
                ContextualAnalysis ac = new ContextualAnalysis();
                ac.visit(tree);
                ac.table.imprimir();
            } catch (RecognitionException e) {
                System.out.println("Error!!!");
                e.printStackTrace();
            }
            if (!errorListener.hasErrors()) {
                System.out.println("Compilación Exitosa!!\n");
                java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);
            } else {
                //falta separarlos
                System.out.println("Compilación Fallida!!\n");
                System.out.println(errorListener.toString());
            }
        } catch (InterruptedException | ExecutionException | IOException e) {
            e.printStackTrace();
        }
		//SpringApplication.run(ProyectoCompiladorApplication.class, args);
	}

}
