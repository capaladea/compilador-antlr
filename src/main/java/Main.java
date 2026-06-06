import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. El texto de prueba que queremos parsear (simulando un archivo de entrada)
            String entrada = "base = 10; altura = 5;";

            // 2. Pasamos el texto al Lexer para que genere los tokens
            GramaticaLexer lexer = new GramaticaLexer(CharStreams.fromString(entrada));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 3. El Parser toma los tokens y construye el árbol según las reglas sintácticas
            GramaticaParser parser = new GramaticaParser(tokens);
            ParseTree tree = parser.programa(); // 'programa' es nuestra regla raíz en el .g4

            // 4. Imprimimos el árbol en la terminal para verificar que se leyó bien
            System.out.println("Árbol Sintáctico:");
            System.out.println(tree.toStringTree(parser));

        } catch (Exception e) {
            System.err.println("Error durante el análisis: " + e.getMessage());
        }
    }
}