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
    public static void main(String[] args) {
        String file = FileManager.readFile();

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