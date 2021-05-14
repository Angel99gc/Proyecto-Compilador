package ContextualA;

import org.antlr.v4.runtime.*;

import java.util.LinkedList;


public class SymbolsTable {
    LinkedList<Object> tabla;

    private int nivelActual;

    public class Ident {
        Token tok;
        int type;
        int nivel;
        int valor;
        ParserRuleContext declCtx;

        public Ident(Token t, int tp, ParserRuleContext decl) {
            tok = t;
            type = tp;
            nivel = nivelActual;
            valor = 0;
            declCtx = decl;
        }

        public void setValue(int v) {
            valor = v;
        }

        public int getNivel() {
            return nivel;
        }
    }

    public SymbolsTable() {
        tabla = new LinkedList<Object>();
        this.nivelActual = -1;
    }

    public void insertar(Token id, int tipo, ParserRuleContext decl) {
        //no se puede insertar un elemento repetido en el mismo nivel
        Ident i = new Ident(id, tipo, decl);
        tabla.addFirst(i);
    }

    public Ident buscar(String nombre) {
        Ident temp = null;
        for (Object id : tabla) {
            if (((Ident) id).tok.getText().equals(nombre)) {
                if (((Ident) id).nivel == nivelActual) {
                    return ((Ident) id);
                }
            }
        }
        for (Object id : tabla) {
            if (((Ident) id).tok.getText().equals(nombre)) {
                return ((Ident) id);
            }
        }
        return temp;
    }

    public void openScope() {
        nivelActual++;
    }

    public void closeScope() {
        tabla.removeIf(n -> (((Ident) n).nivel == nivelActual));
        nivelActual--;
    }

    public void imprimir() {
        System.out.println("----- INICIO TABLA ------");
        for (int i = 0; i < tabla.size(); i++) {
            Token s = (Token) ((Ident) tabla.get(i)).tok;
            System.out.println("Nombre: " + s.getText() + " - " + ((Ident) tabla.get(i)).nivel + " - " + ((Ident) tabla.get(i)).type);
        }
        System.out.println("----- FIN TABLA ------");
    }
}
