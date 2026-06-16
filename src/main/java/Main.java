import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import  java.io.IOException;

import ast.*; // Importamos tus nodos también acá

public class Main {
    public static void main(String[] args) throws Exception {
        // Tu código de prueba respetando la gramática que diseñaste
        String input = "src/test/prueba01.prg";

        // Leer la ruta del archivo fuente e iniciar el Lexer
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromFileName(input));

        // Generar el flujo de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pasarle los tokens al Parser
        GramaticaParser parser = new GramaticaParser(tokens);

        System.out.println("--- Ejecutando el Compilador ---");

        // Llamar a la regla raíz 'program'.
        // Parsear y armar el AST, y ejecutar el 'n.execute()' de cada nodo.
        parser.program();

        System.out.println("--------------------------------");
    }
}