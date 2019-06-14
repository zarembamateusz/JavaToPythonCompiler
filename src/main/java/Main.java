import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class Main {
    public static final String INPUT_CSV = "Test.java";




    public static void main(String[] args) {
        String file = FileManager.readFile();

        String javaClassContent = "import name; public class nothing{public void rrrrar() {if(b==true){int a =0;}}}";

        String javaContent =
                "import library;" +
                        "public class Book{" +
                        "public Book() {" +
                        "String bookName = \"Harry Potter\";" +
                        "}" +
                        "public void rrrrar() {" +
                        "int a = 3;" +
                        "if (a > 3) {" +
                        "int c = 5;" +
                        "}" +
                        "double d = 3.4;" +
                        "while (d < b) {" +
                        "int e = 1;" +
                        "}" +
                        "for (int i=0; i<6; i++) {" +
                        "int f = 4;" +
                        "}" +
                        "}" +
                        "}";

        String javaClassContent2 = "import name;" +
                "public class nothing{" +
                "public void rrrrar(int a) {" +
                "int a = 3;" +
                "if (a > 3) {" +
                "int c = 5;" +
                "}" +
                "double d = 3.4;" +
                "while (d < b) {" +
                "int e = 1;" +
                "}" +
                "for (int i=0; i<6; i++) {" +
                "int f = 4;" +
                "}" +
                "}" +
                "}";
        JavaLexer java8Lexer = new JavaLexer(CharStreams.fromString(file));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        PythonLoader listener= new PythonLoader();

        walker.walk(listener, tree);
        FileManager.saveFile(listener.kod);
    }
}