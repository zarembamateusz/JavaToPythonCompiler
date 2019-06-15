import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PythonLoader extends JavaParserBaseListener {
    public List<String> kod = new ArrayList<String>();
    public String currentLine = "";
    int tab=0;

    @Override public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        currentLine+=ctx.IMPORT().getText();
    }

    @Override public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
        addNewLine();
        cleanAndReTab();
    }

    @Override public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        currentLine+="class"+" "+ctx.IDENTIFIER();
    }

    @Override public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) { }

    @Override public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        currentLine+=":";
        addNewLine();
        tab+=1;
        cleanAndReTab();
    }

    @Override public void exitClassBody(JavaParser.ClassBodyContext ctx) {
        tab-=1;
        cleanAndReTab();
    }

    @Override public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        cleanAndReTab();
    }

    @Override public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
        tab-=1;
        cleanAndReTab();
    }

    @Override public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        currentLine+="def"+" "+ctx.IDENTIFIER();
    }

    @Override public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) { }

    @Override public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
        cleanAndReTab();
    }

    @Override public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
        tab=-1;
        cleanAndReTab();
    }

    @Override public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) {
        currentLine += "def __init__";
    }

    @Override public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) { }

    @Override public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        currentLine+=ctx.IDENTIFIER()+" "+ctx.ASSIGN();
    }

    @Override public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        addNewLine();
        cleanAndReTab();
    }

    @Override public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {
        currentLine+="(self";
    }

    @Override public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
        currentLine+="):";
        addNewLine();
        tab+=1;
        cleanAndReTab();
    }


    @Override public void enterFormalParameter(JavaParser.FormalParameterContext ctx) {
        currentLine+=","+ ctx.IDENTIFIER();
    }

    @Override public void exitFormalParameter(JavaParser.FormalParameterContext ctx) { }

    @Override public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        currentLine+=" ";
        currentLine+=ctx.getText();
    }

    @Override public void exitQualifiedName(JavaParser.QualifiedNameContext ctx) { }

    @Override public void enterLiteral(JavaParser.LiteralContext ctx) {
        if(ctx.NULL_LITERAL()!=null)
            currentLine+=" null";
        else if(ctx.STRING_LITERAL()!=null)
            currentLine+=" "+ ctx.STRING_LITERAL();
    }

    @Override public void exitLiteral(JavaParser.LiteralContext ctx) { }

    @Override public void enterIntegerLiteral(JavaParser.IntegerLiteralContext ctx) {
        currentLine+=" "+ctx.DECIMAL_LITERAL();
    }

    @Override public void exitIntegerLiteral(JavaParser.IntegerLiteralContext ctx) { }

    @Override public void enterFloatLiteral(JavaParser.FloatLiteralContext ctx) {
        currentLine+=" "+ctx.FLOAT_LITERAL();
    }

    @Override public void exitFloatLiteral(JavaParser.FloatLiteralContext ctx) { }


    @Override public void enterStatement(JavaParser.StatementContext ctx) {
        cleanAndReTab();
        if(ctx.IF()!=null){
            currentLine += "if ";
            currentLine += ctx.parExpression().expression().getText();
            currentLine += ":";
            addNewLine();
            tab++;
            cleanAndReTab();
        }
        else if(ctx.WHILE()!=null){
            currentLine += "while ";
            currentLine += ctx.parExpression().expression().getText();
            currentLine += ":";
            addNewLine();
            tab++;
            cleanAndReTab();
        }
        else if(ctx.FOR()!= null){
            //przypadek typu i=0;i<5;i++ bo do takich używa się pętli for w Pythonie
            //wartość początkowa
            String initValue = ctx.forControl().forInit().localVariableDeclaration().variableDeclarators().variableDeclarator(0).variableInitializer().getText();

            //wartość graniczna
            String conditionValue = ctx.forControl().expression().expression().get(1).getText();

            //co ile zwiększamy/zmniejszamy
            //sytuacja kiedy używamy post/preinkrementacji
            Token prefix = ctx.forControl().forUpdate.expression(0).prefix;
            Token postfix = ctx.forControl().forUpdate.expression(0).postfix;
            String updateToken = prefix!=null ? prefix.getText() : postfix.getText();
            String updateValue = updateToken=="++" ? "1" : "-1";

            // TODO
            //sytuacja kiedy używamy +=/-=

            //budowa pętli
            currentLine += "for x in range(";
            currentLine += initValue + ", ";
            currentLine += conditionValue + ", ";
            currentLine += updateValue + "):";

            addNewLine();
            tab++;
            cleanAndReTab();
        }
    }

    @Override public void exitStatement(JavaParser.StatementContext ctx) {
        if(ctx.IF()!=null || ctx.WHILE()!=null || ctx.FOR() != null){
            tab--;
        }
        cleanAndReTab();
    }

    @Override public void enterExpression(JavaParser.ExpressionContext ctx) {
        if(ctx.OR()!=null)
            currentLine+=" ||";
        else if(ctx.ADD()!=null)
            currentLine+=" &&";
    }

    @Override public void exitExpression(JavaParser.ExpressionContext ctx) { }

    //w python nie trzeba pisać typów
    @Override public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) {
    }

    @Override public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) { }

    private void cleanAndReTab(){
        currentLine = "";
        for(int i=0; i<tab; i++){
            currentLine += "\t";
        }
    }

    private void addNewLine() {
        kod.add(currentLine + "\n");
    }
}

