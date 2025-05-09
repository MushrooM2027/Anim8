import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DSLCompiler {
    public static void main(String[] args) {
        try {
            // Check if input file is provided as argument
            String inputFile = args.length > 0 ? args[0] : "script.dsl";
            
            // Read the DSL script
            System.out.println("Reading input file: " + inputFile);
            String sourceCode = new String(Files.readAllBytes(Paths.get(inputFile)));

            // Parse the DSL and generate Java code
            System.out.println("Parsing DSL code...");
            CharStream input = CharStreams.fromString(sourceCode);
            UILexer lexer = new UILexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UIParser parser = new UIParser(tokens);

            ParseTree tree = parser.program();

            System.out.println("Generating JavaFX code...");
            CustomUTToJavaFXVisitor visitor = new CustomUTToJavaFXVisitor();
            String javaCode = visitor.visit(tree);

            // Write the generated Java code to GeneratedApp.java
            System.out.println("Writing generated code to GeneratedApp.java");
            try (PrintWriter out = new PrintWriter("GeneratedApp.java")) {
                out.println(javaCode);
            }

            System.out.println("Code generation completed successfully!");

        } catch (IOException e) {
            System.err.println("Error reading/writing files: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Error during code generation: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}