import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import  java.io.IOException;

import ast.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // La ruta donde se encuentra el archivo de prueba basico
            String input = "src/test/prueba01.prg";

            // Leer la ruta del archivo fuente e iniciar el Lexer
            GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromFileName(input));

            // Generar el flujo de tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Pasarle los tokens al Parser
            GramaticaParser parser = new GramaticaParser(tokens);

            System.out.println("--- Ejecutando el Compilador ---\n");

            // Llamar a la regla raíz 'program'.
            // Parsear y armar el AST, y ejecutar el 'n.execute()' de cada nodo.
            parser.program();
        }
        catch (RuntimeException e) {
            // intercepta cualquier RuntimeException lanzada desde los execute() en las clases
            System.err.println("*** ¡Error en tiempo de ejecución! ***");
            System.err.println("Detalle: " + e.getMessage());
            System.err.println("**************************************");
        }
        System.out.println("\n---------------Fin-----------------");
    }
}