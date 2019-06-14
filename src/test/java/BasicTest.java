import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class BasicTest {


    // Niestety wszystkie struktury budujemy na podstawie Stringa z kodem Javy, więc nie możemy wydzielić nic do @Before czy @BeforeClass

    @Test
    public void basicJavaContentTest(){
        String javaContent = "import name; " +
                "public class nothing {" +
                "public void rrrrar() {" +
                "if(b==true) {" +
                "int a =0; }" +
                "}" +
                "}";

        String expectedContent = "import name\n" +
                "class nothing:\n" +
                "\tdef rrrrar(self):\n" +
                "\t\tif b==true:\n" +
                "\t\t\ta = 0\n";

        JavaLexer java8Lexer = new JavaLexer(CharStreams.fromString(javaContent));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        PythonLoader listener= new PythonLoader();

        walker.walk(listener, tree);


        StringBuilder pythonCode = new StringBuilder();
        for (String line : listener.kod) {
            pythonCode.append(line);
        }

        assertEquals(expectedContent, pythonCode.toString());
    }

    @Test
    public void basicJavaContentTest2(){
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

        String expectedContent =
                "import library\n" +
                "class Book:\n" +
                "\tdef __init__(self):\n" +
                "\t\tbookName = \"Harry Potter\"\n" +
                "\tdef rrrrar(self):\n" +
                "\t\ta = 3\n" +
                "\t\tif a>3:\n" +
                "\t\t\tc = 5\n" +
                "\t\td = 3.4\n" +
                "\t\twhile d<b:\n" +
                "\t\t\te = 1\n" +
                "\t\tfor x in range(0, 6, -1):\n" +
                "\t\t\ti = 0\n" +
                "\t\t\tf = 4\n";

        JavaLexer java8Lexer = new JavaLexer(CharStreams.fromString(javaContent));
        CommonTokenStream tokens = new CommonTokenStream(java8Lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        PythonLoader listener= new PythonLoader();

        walker.walk(listener, tree);

        StringBuilder pythonCode = new StringBuilder();
        for (String line : listener.kod) {
            pythonCode.append(line);
        }

        assertEquals(expectedContent, pythonCode.toString());
    }
}
