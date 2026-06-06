import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Validamos estrictamente que nos pasen el archivo de prueba
        if (args.length == 0) {
            System.err.println("Error: No test file provided.");
            System.err.println("Usage: java Main <path-to-test-file>");
            System.exit(1);
        }

        String rutaArchivo = args[0];

        try {
            // 1. Leer el archivo de testeo directo a un CharStream
            CharStream input = CharStreams.fromFileName(rutaArchivo);

            // 2. Canalizar el flujo a las clases mínimas de ANTLR
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaParser parser = new GramaticaParser(tokens);

            // 3. Disparar la regla inicial (Punto de entrada de tu gramática)
            ParseTree tree = parser.program();

            // 4. Imprimir el árbol LISP limpio para corroborar la estructura
            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            System.err.println("File system error: Could not read " + rutaArchivo);
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Syntax/Parsing error: " + e.getMessage());
            System.exit(1);
        }
    }
}