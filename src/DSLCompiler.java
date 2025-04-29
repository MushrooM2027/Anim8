import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import parser.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DSLCompiler {
    public static void main(String[] args) throws IOException {
        String sourceCode = new String(Files.readAllBytes(Paths.get("script.dsl")));

        ANTLRInputStream input = new ANTLRInputStream(sourceCode);
        UILexer lexer = new UILexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        UIParser parser = new UIParser(tokens);

        ParseTree tree = parser.program();

        CustomUTToJavaFXVisitor visitor = new CustomUTToJavaFXVisitor();
        String javaCode = visitor.visit(tree);

        Files.write(Paths.get("GeneratedApp.java"), javaCode.getBytes());
        System.out.println("JavaFX code generated in GeneratedApp.java");
    }
}





// import org.antlr.v4.runtime.*;
// import org.antlr.v4.runtime.tree.*;

// import java.nio.file.*;

// public class DSLCompiler {
//     public static void main(String[] args) throws Exception {
//         String input = Files.readString(Path.of("input.ui"));
//         ANTLRInputStream inputStream = new ANTLRInputStream(input);
//         SimpleUILexer lexer = new SimpleUILexer(inputStream);
//         CommonTokenStream tokens = new CommonTokenStream(lexer);
//         SimpleUIParser parser = new SimpleUIParser(tokens);

//         ParseTree tree = parser.program();
//         SimpleUIVisitor visitor = new SimpleUIVisitor();
//         String code = visitor.visit(tree);

//         Files.writeString(Path.of("GeneratedUI.java"), code);
//         System.out.println("JavaFX code written to GeneratedUI.java");
//     }
// }
