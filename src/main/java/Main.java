import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import  java.io.IOException;

import ast.*; // Importamos tus nodos también acá

public class Main {
    public static void main(String[] args) throws Exception {
        // Tu código de prueba respetando la gramática que diseñaste
        String input = "program miPrimerPrograma {\n" +
                "    var x;\n" +
                "    x = 100;\n" +
                "    println x;\n" +
                "    if (false) {\n" +
                "        println 10;\n" +
                "    } else {\n" +
                "        println 0;\n" +
                "    }\n" +
                "}";

        // 1. Leer el código fuente e iniciar el Lexer
        GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(input));

        // 2. Generar el flujo de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // 3. Pasarle los tokens al Parser
        GramaticaParser parser = new GramaticaParser(tokens);

        System.out.println("--- Ejecutando el Compilador ---");

        // 4. Llamar a la regla raíz 'program'.
        // Esto va a parsear, armar el AST y ejecutar el 'n.execute()' de cada nodo.
        parser.program();

        System.out.println("--------------------------------");
    }
}