import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PythonLoader extends JavaParserBaseListener {
    private List<String> errors = new ArrayList<String>();
    public List<String> kod = new ArrayList<String>();

    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);
    }

    @Override
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        super.exitMethodDeclaration(ctx);
    }
}
