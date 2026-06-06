import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharStream input = null;

        // 1. EVALUAR LA ENTRADA
        if (args.length > 0) {
            // Caso A: Si el usuario pasó un argumento (ej: java Main programa.txt)
            String rutaArchivo = args[0];
            try {
                System.out.println("Reading file: " + rutaArchivo);
                input = CharStreams.fromFileName(rutaArchivo);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
                return;
            }
        } else {
            // Caso B: Si no pasó argumentos, se queda esperando el teclado
            System.out.println("=== Interactive Mode ===");
            System.out.println("Write your code below. Press Ctrl+D (Linux) or Ctrl+Z (Windows) when finished to compile:");

            try {
                Scanner scanner = new Scanner(System.in);
                StringBuilder buffer = new StringBuilder();

                // Lee línea por línea hasta que el usuario mande el fin de archivo (EOF)
                while (scanner.hasNextLine()) {
                    buffer.append(scanner.nextLine()).append("\n");
                }
                scanner.close();

                // Convertimos todo lo que se escribió por teclado en el stream para ANTLR
                input = CharStreams.fromString(buffer.toString());
            } catch (Exception e) {
                System.err.println("Error reading from keyboard: " + e.getMessage());
                return;
            }
        }

        // 2. DISPARAR EL COMPILADOR (Instanciación de clases de ANTLR)
        System.out.println("\n=== Starting Compilation ===");
        try {
            // Instanciamos el Lexer con la entrada seleccionada (archivo o teclado)
            GramaticaLexer lexer = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Instanciamos el Parser
            GramaticaParser parser = new GramaticaParser(tokens);

            // Reemplazá 'prog' por el nombre de tu regla inicial/principal del .g4
            ParseTree tree = parser.programa();

            // Mostramos el árbol en la consola para verificar que todo se entendió bien
            System.out.println("\nParse Tree (LISP format):");
            System.out.println(tree.toStringTree(parser));
            System.out.println("\n=== Compilation Finished Successfully ===");

        } catch (Exception e) {
            System.err.println("Compilation error: " + e.getMessage());
        }
    }
}
