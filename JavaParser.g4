parser grammar JavaParser;

options { tokenVocab=JavaLexer; }

compilationUnit
    : importDeclaration* typeDeclaration* EOF
    ;


importDeclaration
    : IMPORT qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    : classModifier*
      (classDeclaration)
    | ';'
    ;

modifier
    : classModifier
    ;

classModifier
    : PUBLIC
    | PRIVATE
    | STATIC
    | FINAL
    ;

classDeclaration
    : CLASS IDENTIFIER
      classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    : ';'
    | modifier* memberDeclaration
    ;

memberDeclaration
    : methodDeclaration
    | fieldDeclaration
    | constructorDeclaration
    ;


methodDeclaration
    : typeTypeOrVoid IDENTIFIER formalParameters ('[' ']')*
      methodBody
    ;

methodBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

constructorDeclaration
    : IDENTIFIER formalParameters constructorBody=block
    ;

fieldDeclaration
    : typeType variableDeclarators ';'
    ;

variableDeclarator
    : IDENTIFIER ('=' variableInitializer)?
    ;

variableInitializer
    : expression
    ;

classsType
    : IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments?)*
    ;

typeArgument
    : typeType
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)*
    ;

formalParameter
    : typeType IDENTIFIER
    ;


qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

literal
    : integerLiteral
    | floatLiteral
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;


block
    : '{' blockStatement* '}'
    ;

blockStatement
    : localVariableDeclaration ';'
    | statement
    | localTypeDeclaration
    ;

localVariableDeclaration
    : typeType variableDeclarators
    ;

variableDeclarators
    : variableDeclarator (',' variableDeclarator)*
    ;

localTypeDeclaration
    : classModifier*
      (classDeclaration)
    | ';'
    ;

statement
    : blockLabel=block
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | RETURN expression? ';'
    | statementExpression=expression ';'
    ;

forControl
    :  forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : localVariableDeclaration
    | expressionList
    ;


// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

methodCall
    : IDENTIFIER '(' expressionList? ')'
    | THIS '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIER
      | methodCall
      | THIS
      | NEW innerCreator
      )
    | expression '[' expression ']'
    | methodCall
    | NEW creator
    | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix='!' expression
    | expression bop=('*'|'/'|'%') expression
    | expression bop=('+'|'-') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=('==' | '!=') expression
    | expression bop='&&' expression
    | expression bop='||' expression
    ;

primary
    : '(' expression ')'
    | THIS
    | literal
    | IDENTIFIER
    | typeTypeOrVoid '.' CLASS
    ;

classType
    : (classsType '.')? IDENTIFIER typeArguments?
    ;

creator
	: createdName classCreatorRest
	;

createdName
    : IDENTIFIER typeArguments? ('.' IDENTIFIER typeArguments?)*
    | primitiveType
    ;

innerCreator
    : IDENTIFIER classCreatorRest
    ;


classCreatorRest
    : arguments classBody?
    ;


typeType
    : (classsType | primitiveType) ('[' ']')*
    ;

primitiveType
    : BOOLEAN
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    ;

typeArguments
    : '<' typeArgument (',' typeArgument)* '>'
    ;

arguments
    : '(' expressionList? ')'
;