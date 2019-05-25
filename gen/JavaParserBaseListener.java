// Generated from C:/Users/Mateusz/Desktop/Workspace/Java/ANTLR_tokenizer\JavaParser.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class JavaParserBaseListener implements JavaParserListener {
	public List<String> kod = new ArrayList<String>();
	public String currentLine = "";
	int tab=0;
	@Override public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) { }

	@Override public void exitCompilationUnit(JavaParser.CompilationUnitContext ctx) { }

	@Override public void enterPackageDeclaration(JavaParser.PackageDeclarationContext ctx) { }

	@Override public void exitPackageDeclaration(JavaParser.PackageDeclarationContext ctx) { }

	@Override public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		currentLine+=ctx.IMPORT().getText();
	}

	@Override public void exitImportDeclaration(JavaParser.ImportDeclarationContext ctx) {
		kod.add(currentLine);
		System.out.println(currentLine);
		currentLine="";
	}

	@Override public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) { }

	@Override public void exitTypeDeclaration(JavaParser.TypeDeclarationContext ctx) { }

	@Override public void enterModifier(JavaParser.ModifierContext ctx) { }

	@Override public void exitModifier(JavaParser.ModifierContext ctx) { }

	@Override public void enterClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) { }

	@Override public void exitClassOrInterfaceModifier(JavaParser.ClassOrInterfaceModifierContext ctx) {
//		System.out.println("a");
	}

	@Override public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
		currentLine+="class"+" "+ctx.IDENTIFIER();
	}

	@Override public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) { }

	@Override public void enterInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) { }

	@Override public void exitInterfaceDeclaration(JavaParser.InterfaceDeclarationContext ctx) { }

	@Override public void enterClassBody(JavaParser.ClassBodyContext ctx) {
	currentLine+=":";
	kod.add(currentLine);
	System.out.println(currentLine);
	tab+=1;
	currentLine="";
//	for(int i=0 i<tab;i++)
//		currentLine="    ";

	}

	@Override public void exitClassBody(JavaParser.ClassBodyContext ctx) {
		tab-=1;
//		System.out.println("class body exit");
	}

	@Override public void enterInterfaceBody(JavaParser.InterfaceBodyContext ctx) { }

	@Override public void exitInterfaceBody(JavaParser.InterfaceBodyContext ctx) { }

	@Override public void enterClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
		for(int i=0;i<tab;i++)
			currentLine="    ";

	}

	@Override public void exitClassBodyDeclaration(JavaParser.ClassBodyDeclarationContext ctx) {
		tab-=1;

	}

	@Override public void enterMemberDeclaration(JavaParser.MemberDeclarationContext ctx) { }

	@Override public void exitMemberDeclaration(JavaParser.MemberDeclarationContext ctx) { }

	@Override public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
		currentLine+="def"+" "+ctx.IDENTIFIER();
	}

	@Override public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) { }

	@Override public void enterMethodBody(JavaParser.MethodBodyContext ctx) {
		for(int i=0;i<tab;i++)
			currentLine+="    ";

	}

	@Override public void exitMethodBody(JavaParser.MethodBodyContext ctx) {
		tab=-1;
	}

	@Override public void enterTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx) { }

	@Override public void exitTypeTypeOrVoid(JavaParser.TypeTypeOrVoidContext ctx) { }

	@Override public void enterConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) { }

	@Override public void exitConstructorDeclaration(JavaParser.ConstructorDeclarationContext ctx) { }

	@Override public void enterFieldDeclaration(JavaParser.FieldDeclarationContext ctx) { }

	@Override public void exitFieldDeclaration(JavaParser.FieldDeclarationContext ctx) { }

	@Override public void enterInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) { }

	@Override public void exitInterfaceBodyDeclaration(JavaParser.InterfaceBodyDeclarationContext ctx) { }

	@Override public void enterInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) { }

	@Override public void exitInterfaceMemberDeclaration(JavaParser.InterfaceMemberDeclarationContext ctx) { }

	@Override public void enterInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) { }

	@Override public void exitInterfaceMethodDeclaration(JavaParser.InterfaceMethodDeclarationContext ctx) { }

	@Override public void enterInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx) { }

	@Override public void exitInterfaceMethodModifier(JavaParser.InterfaceMethodModifierContext ctx) { }

	@Override public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
		currentLine+=ctx.IDENTIFIER()+" "+ctx.ASSIGN();
	}

	@Override public void exitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
		kod.add(currentLine);
		System.out.println(currentLine);
		currentLine="";
	}

	@Override public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
//		System.out.println("init");
	}

	@Override public void exitVariableInitializer(JavaParser.VariableInitializerContext ctx) { }

	@Override public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) { }

	@Override public void exitClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) { }

	@Override public void enterTypeArgument(JavaParser.TypeArgumentContext ctx) { }

	@Override public void exitTypeArgument(JavaParser.TypeArgumentContext ctx) { }

	@Override public void enterQualifiedNameList(JavaParser.QualifiedNameListContext ctx) { }

	@Override public void exitQualifiedNameList(JavaParser.QualifiedNameListContext ctx) { }

	@Override public void enterFormalParameters(JavaParser.FormalParametersContext ctx) {

		currentLine+="(self";
	}

	@Override public void exitFormalParameters(JavaParser.FormalParametersContext ctx) {
		currentLine+="):";
		kod.add(currentLine);
		System.out.println(currentLine);
		currentLine="";
		tab+=1;
	}

	@Override public void enterFormalParameterList(JavaParser.FormalParameterListContext ctx) { }

	@Override public void exitFormalParameterList(JavaParser.FormalParameterListContext ctx) { }

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

	@Override public void enterBlock(JavaParser.BlockContext ctx) { }

	@Override public void exitBlock(JavaParser.BlockContext ctx) { }

	@Override public void enterBlockStatement(JavaParser.BlockStatementContext ctx) {
//		System.out.println("statement enter");
	}

	@Override public void exitBlockStatement(JavaParser.BlockStatementContext ctx) {
//		System.out.println("statement exit");
	}

	@Override public void enterLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { }

	@Override public void exitLocalVariableDeclaration(JavaParser.LocalVariableDeclarationContext ctx) { }

	@Override public void enterVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {
//		System.out.println("rs");
	}

	@Override public void exitVariableDeclarators(JavaParser.VariableDeclaratorsContext ctx) {

	}

	@Override public void enterLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) { }

	@Override public void exitLocalTypeDeclaration(JavaParser.LocalTypeDeclarationContext ctx) { }

	@Override public void enterStatement(JavaParser.StatementContext ctx) {
		currentLine+="if";
	}

	@Override public void exitStatement(JavaParser.StatementContext ctx) { }

	@Override public void enterForControl(JavaParser.ForControlContext ctx) { }

	@Override public void exitForControl(JavaParser.ForControlContext ctx) { }

	@Override public void enterForInit(JavaParser.ForInitContext ctx) { }

	@Override public void exitForInit(JavaParser.ForInitContext ctx) { }

	@Override public void enterParExpression(JavaParser.ParExpressionContext ctx) { }

	@Override public void exitParExpression(JavaParser.ParExpressionContext ctx) { }

	@Override public void enterExpressionList(JavaParser.ExpressionListContext ctx) { }

	@Override public void exitExpressionList(JavaParser.ExpressionListContext ctx) { }

	@Override public void enterMethodCall(JavaParser.MethodCallContext ctx) { }

	@Override public void exitMethodCall(JavaParser.MethodCallContext ctx) { }

	@Override public void enterExpression(JavaParser.ExpressionContext ctx) {
		if(ctx.OR()!=null)
			currentLine+=" ||";
		else if(ctx.ADD()!=null)
			currentLine+=" &&";
	}

	@Override public void exitExpression(JavaParser.ExpressionContext ctx) { }

	@Override public void enterPrimary(JavaParser.PrimaryContext ctx) { }

	@Override public void exitPrimary(JavaParser.PrimaryContext ctx) { }

	@Override public void enterClassType(JavaParser.ClassTypeContext ctx) { }

	@Override public void exitClassType(JavaParser.ClassTypeContext ctx) { }

	@Override public void enterCreator(JavaParser.CreatorContext ctx) { }

	@Override public void exitCreator(JavaParser.CreatorContext ctx) { }

	@Override public void enterCreatedName(JavaParser.CreatedNameContext ctx) { }

	@Override public void exitCreatedName(JavaParser.CreatedNameContext ctx) { }

	@Override public void enterInnerCreator(JavaParser.InnerCreatorContext ctx) { }

	@Override public void exitInnerCreator(JavaParser.InnerCreatorContext ctx) { }

	@Override public void enterClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) { }

	@Override public void exitClassCreatorRest(JavaParser.ClassCreatorRestContext ctx) { }

	@Override public void enterTypeType(JavaParser.TypeTypeContext ctx) { }

	@Override public void exitTypeType(JavaParser.TypeTypeContext ctx) { }

	@Override public void enterPrimitiveType(JavaParser.PrimitiveTypeContext ctx) { }

	@Override public void exitPrimitiveType(JavaParser.PrimitiveTypeContext ctx) { }

	@Override public void enterTypeArguments(JavaParser.TypeArgumentsContext ctx) { }

	@Override public void exitTypeArguments(JavaParser.TypeArgumentsContext ctx) { }

	@Override public void enterArguments(JavaParser.ArgumentsContext ctx) { }

	@Override public void exitArguments(JavaParser.ArgumentsContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) {

//		currentLine+="import";
	}

	@Override public void exitEveryRule(ParserRuleContext ctx) { }

	@Override public void visitTerminal(TerminalNode node) {
//		if(node.getText().equals(";")){
//
//		}else
//			currentLine += node.getText();

	}

	@Override public void visitErrorNode(ErrorNode node) { }
}