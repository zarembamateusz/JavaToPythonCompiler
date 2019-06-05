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
//        try {
//            FileInputStream fileInputStream = new FileInputStream(INPUT_CSV);
//            JavaLexer lexer;
//
//            lexer = new JavaLexer(new ANTLRInputStream(fileInputStream));
//            CommonTokenStream tokens = new CommonTokenStream(lexer);
//            JavaParser parser = new JavaParser(tokens);
//            ParserRuleContext ruleContext = parser.file();
//            Trees.inspect(ruleContext, parser);
//
//
//
//        } catch (FileNotFoundException e) {
//            System.err.println("Input file not found.");
//            return;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String javaClassContent = "public class SampleClass { void DoSomething(){} }";
        String javaClassContent = "import name; public class nothing{public void rrrrar() {if(b==true){int a =0;}}}";

        String javaClassContentWithOutIF = "import name;" +
                "public class nothing{"+
                "public void rrrrar(String t,int h) {" +
                "String a = \"hahah\";" +
                "}" +
                "}";
        JavaLexer java8Lexer = new JavaLexer(CharStreams.fromString(javaClassContentWithOutIF));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        PythonLoader listener= new PythonLoader();

        walker.walk(listener, tree);

        for(String s : listener.kod){
            System.out.println(s);
        }



//        assertThat(listener.getErrors().size(), is(1));
//        assertThat(listener.getErrors().get(0),
//                is("Method DoSomething is uppercased!"));

    }

}