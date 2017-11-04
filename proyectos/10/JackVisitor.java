import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class JackVisitor extends JackGrammarBaseVisitor {
    private String result = "";
    private void addLine(String line) {
	//result += indent() + line + "\n";
	result += line + "\n";
    }
    public String getResult() {
	return result;
    }
    public Object visitChildren(RuleNode node) {
	return super.visitChildren(node);
    }
    public Object visitTerminal(TerminalNode node) {
	Token t = node.getSymbol();
	String type = JackCompiler.getTokenType(t);
	String text = JackCompiler.getTokenText(t);
	addLine("<" + type + "> " + text + " </" + type + ">");	 
	return super.visitTerminal(node);
    }
    public Object visitClazz(JackGrammarParser.ClazzContext ctx) {
	addLine("<class>");
	//pushIndent();
	super.visitClazz(ctx);
	//popIndent();
	addLine("</class>");
	return null;
    }
    public Object visitClassVarDec(JackGrammarParser.ClassVarDecContext ctx) {
	addLine("<classVarDec>");
	//pushIndent();
	super.visitClassVarDec(ctx);
	//popIndent();
	addLine("</classVarDec>");
	return null;
    }
    public Object visitType(JackGrammarParser.TypeContext ctx) { return visitChildren(ctx); }
    public Object visitSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) {
	addLine("<subroutineDec>");
	//pushIndent();
	super.visitSubroutineDec(ctx);
	//popIndent();
	addLine("</subroutineDec>");
	return null;
    }
    public Object visitParameterList(JackGrammarParser.ParameterListContext ctx) { addLine("<parameterList>");
	//pushIndent();
	super.visitParameterList(ctx);
	//popIndent();
	addLine("</parameterList>");
	return null;
    }
    public Object visitSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) {
	addLine("<subroutineBody>");
	//pushIndent();
	super.visitSubroutineBody(ctx);
	//popIndent();
	addLine("</subroutineBody>");
	return null;
    }
    public Object visitVarDec(JackGrammarParser.VarDecContext ctx) {
	addLine("<varDec>");
	//pushIndent();
	super.visitVarDec(ctx);
	//popIndent();
	addLine("</varDec>");
	return null;
    }
    public Object visitStatements(JackGrammarParser.StatementsContext ctx) {
	addLine("<statements>");
	//pushIndent();
	super.visitStatements(ctx);
	//popIndent();
	addLine("</statements>");
	return null;
    }
    public Object visitLetStatement(JackGrammarParser.LetStatementContext ctx) {
	addLine("<letStatement>");
	//pushIndent();
	super.visitLetStatement(ctx);
	//popIndent();
	addLine("</letStatement>");
	return null;
    }
    public Object visitIfStatement(JackGrammarParser.IfStatementContext ctx) {
	addLine("<ifStatement>");
	//pushIndent();
	super.visitIfStatement(ctx);
	//popIndent();
	addLine("</ifStatement>");
	return null;
    }
    public Object visitWhileStatement(JackGrammarParser.WhileStatementContext ctx) {
	addLine("<whileStatement>");
	//pushIndent();
	super.visitWhileStatement(ctx);
	//popIndent();
	addLine("</whileStatement>");
	return null;
    }
    public Object visitDoStatement(JackGrammarParser.DoStatementContext ctx) {
	addLine("<doStatement>");
	//pushIndent();
	super.visitDoStatement(ctx);
	//popIndent();
	addLine("</doStatement>");
	return null;
    }
    public Object visitReturnStatement(JackGrammarParser.ReturnStatementContext ctx) {
	addLine("<returnStatement>");
	//pushIndent();
	super.visitReturnStatement(ctx);
	//popIndent();
	addLine("</returnStatement>");
	return null;
    }
    public Object visitExpression(JackGrammarParser.ExpressionContext ctx) {
	addLine("<expression>");
	//pushIndent();
	super.visitExpression(ctx);
	//popIndent();
	addLine("</expression>");
	return null;
    }
    public Object visitTerm(JackGrammarParser.TermContext ctx) {
	addLine("<term>");
	//pushIndent();
	super.visitTerm(ctx);
	//popIndent();
	addLine("</term>");
	return null;
    }
    public Object visitExpressionList(JackGrammarParser.ExpressionListContext ctx) {
	addLine("<expressionList>");
	//pushIndent();
	super.visitExpressionList(ctx);
	//popIndent();
	addLine("</expressionList>");
	return null;
    }
}
