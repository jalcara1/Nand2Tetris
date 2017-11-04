import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

import java.util.Stack;

public class JackCompiler{
    /** 
     * This class provides an empty implementation of JackGrammarListener,
     * which can be extended to create a listener which only needs to handle a subset
     * of the available methods.
     */ // Generated from JackGrammar.g4 by ANTLR 4.7
    public static class JackGrammarBaseListener implements JackGrammarListener {
	String output = "";
	String outputT = "";
	Stack<String> indents = new Stack<>();	
	public void pushIndent() { indents.push(indent() + "  ");}
	public void popIndent() { indents.pop();}
	public String indent() { return indents.isEmpty() ? "" : indents.peek();}
	public String getOutput() { return output;}	
	public String getOutputT() { return outputT;}
	public void enterClazz(JackGrammarParser.ClazzContext ctx) { output += "<class>\n";}
	public void exitClazz(JackGrammarParser.ClazzContext ctx) { output += "</class>\n";}
	public void enterClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { output += "<classVarDec>\n";}
	public void exitClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { output += "</classVarDec>\n";}
	public void enterType(JackGrammarParser.TypeContext ctx) { }//output += "<type>\n";}
	public void exitType(JackGrammarParser.TypeContext ctx) { }//output += "</type>\n";}
	public void enterSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) { output += "<subroutineDec>\n";}
	public void exitSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) { output += "</subroutineDec>\n";}
	public void enterParameterList(JackGrammarParser.ParameterListContext ctx) { output += "<parameterList>\n";}
	public void exitParameterList(JackGrammarParser.ParameterListContext ctx) { output += "</parameterList>\n";}
	public void enterSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) { output += "<subroutineBody>\n";}
	public void exitSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) { output += "</subroutineBody>\n";}
	public void enterVarDec(JackGrammarParser.VarDecContext ctx) { output += "<varDec>\n";}
	public void exitVarDec(JackGrammarParser.VarDecContext ctx) { output += "</varDec>\n";}
	public void enterClassName(JackGrammarParser.ClassNameContext ctx) { }//output += "<className>\n";}
	public void exitClassName(JackGrammarParser.ClassNameContext ctx) { }//output += "</className>\n";}
	public void enterSubroutineName(JackGrammarParser.SubroutineNameContext ctx) { }//output += "<subroutineName>\n";}
	public void exitSubroutineName(JackGrammarParser.SubroutineNameContext ctx) { }//output += "</subroutineName>\n";}
	public void enterVarName(JackGrammarParser.VarNameContext ctx) { }//output += "<varName>\n";}
	public void exitVarName(JackGrammarParser.VarNameContext ctx) { }//output += "</varName>\n";}
	public void enterStatements(JackGrammarParser.StatementsContext ctx) { output += "<statements>\n";}
	public void exitStatements(JackGrammarParser.StatementsContext ctx) { output += "</statements>\n";}
	public void enterStatement(JackGrammarParser.StatementContext ctx) { }//output += "<statement>\n";}
	public void exitStatement(JackGrammarParser.StatementContext ctx) { }//output += "</statement>\n";}
	public void enterLetStatement(JackGrammarParser.LetStatementContext ctx) { output += "<letStatement>\n";}
	public void exitLetStatement(JackGrammarParser.LetStatementContext ctx) { output += "</letStatement>\n";}
	public void enterIfStatement(JackGrammarParser.IfStatementContext ctx) { output += "<ifStatement>\n";}
	public void exitIfStatement(JackGrammarParser.IfStatementContext ctx) { output += "</ifStatement>\n";}
	public void enterWhileStatement(JackGrammarParser.WhileStatementContext ctx) { output += "<whileStatement>\n";}
	public void exitWhileStatement(JackGrammarParser.WhileStatementContext ctx) { output += "</whileStatement>\n";}
	public void enterDoStatement(JackGrammarParser.DoStatementContext ctx) { output += "<doStatement>\n";}
	public void exitDoStatement(JackGrammarParser.DoStatementContext ctx) { output += "</doStatement>\n";}
	public void enterReturnStatement(JackGrammarParser.ReturnStatementContext ctx) { output += "<returnStatement>\n";}
	public void exitReturnStatement(JackGrammarParser.ReturnStatementContext ctx) { output += "</returnStatement>\n";}
	public void enterExpression(JackGrammarParser.ExpressionContext ctx) { output += "<expression>\n";}
	public void exitExpression(JackGrammarParser.ExpressionContext ctx) { output += "</expression>\n";}
	public void enterTerm(JackGrammarParser.TermContext ctx) { output += "<term>\n";}
	public void exitTerm(JackGrammarParser.TermContext ctx) { output += "</term>\n";}
	public void enterSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) { }//output += "<subroutineCall>\n";}
	public void exitSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) { }//output += "</subroutineCall>\n";}
	public void enterExpressionList(JackGrammarParser.ExpressionListContext ctx) { output += "<expressionList>\n";}
	public void exitExpressionList(JackGrammarParser.ExpressionListContext ctx) { output += "</expressionList>\n";}
	public void enterOp(JackGrammarParser.OpContext ctx) { }//output += "<op>\n";}
	public void exitOp(JackGrammarParser.OpContext ctx) { }//output += "</op>\n";}
	public void enterUnaryOp(JackGrammarParser.UnaryOpContext ctx) { output += "<unaryOp>\n";}
	public void exitUnaryOp(JackGrammarParser.UnaryOpContext ctx) { output += "</unaryOp>\n";}
	public void enterKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) { output += "<keywordConstant>\n";}
	public void exitKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) { output += "</keyworkConstant>\n";}

	public void enterEveryRule(ParserRuleContext ctx) { }//output += "enterEveryRule ::-=>  " + ctx.getText()+ "\n";}
	public void exitEveryRule(ParserRuleContext ctx) { }//output += "exitEveryRule ::-=>  " + ctx.getText()+ "\n";}
	public void visitTerminal(TerminalNode node) {	    
	    String child = node.getText();
	    if(child.equals("class")|| child.equals("constructor")|| child.equals("function")|| child.equals("method")|| child.equals("field")|| child.equals("static")
	       || child.equals("var")|| child.equals("int")|| child.equals("char")|| child.equals("boolean")|| child.equals("void")|| child.equals("true")
	       || child.equals("false")|| child.equals("null")|| child.equals("this")|| child.equals("let")|| child.equals("do")|| child.equals("if")
	       || child.equals("else")|| child.equals("while")|| child.equals("return")){
	    	output += indent() + "<keyword> " + child + " </keyword>\n";
		outputT += indent() + "<keyword> " + child + " </keyword>\n";
	    }else if(child.equals("{")|| child.equals("}")|| child.equals("(")|| child.equals(")")|| child.equals("[")|| child.equals("]")|| child.equals(".")
	    	     || child.equals(",")|| child.equals(";")|| child.equals("+")|| child.equals("-")|| child.equals("*")|| child.equals("/")|| child.equals("&")
	    	     || child.equals("|")|| child.equals("|") || child.equals("<")|| child.equals(">\n")|| child.equals("~")|| child.equals("=")){
	    	output += indent() + "<symbol> " + child + " </symbol>\n";
		outputT += indent() + "<symbol> " + child + " </symbol>\n";
	    }else if(isInteger(child)){
	    	output += indent() + "<integerConstant> " + child + " </integerConstant>\n";
		outputT += indent() + "<integerConstant> " + child + " </integerConstant>\n";
	    }else if(child.charAt(0) == '"' && child.charAt(child.length()-1) == '"'){
	    	output += indent() + "<stringConstant> " + child.substring(1, child.length()-1) + " </stringConstant>\n";
		outputT += indent() + "<stringConstant> " + child.substring(1, child.length()-1) + " </stringConstant>\n";
	    }else{
	    	output += indent() + "<identifier> " + child + " </identifier>\n";
		outputT += indent() + "<identifier> " + child + " </identifier>\n";
	    }
	}
	public void visitErrorNode(ErrorNode node) { }//output += "visitErrorNode ::-=>  "+ node.getText()+ "\n";}
	public boolean isInteger(String numero){
	    try{
		Integer.parseInt(numero);
		return true;
	    }catch(NumberFormatException e){
		return false;
	    }
	}
    }
    public static void main(String[] args) throws Exception {
	JackGrammarLexer lexer = new JackGrammarLexer( new ANTLRFileStream( args[0] ));
	CommonTokenStream tokens = new CommonTokenStream( lexer );
	JackGrammarParser parser = new JackGrammarParser( tokens );

	ParseTree tree = parser.clazz();
	ParseTreeWalker walker = new ParseTreeWalker();
	JackGrammarBaseListener Listener = new JackGrammarBaseListener();
	walker.walk(Listener, tree);
	//String output = "<tokens>\n" + getOutput() + "</tokens>" ;
	String output = Listener.getOutput();
	String outputT = Listener.getOutputT();
	System.out.println(output);
	System.out.println("<tokens>\n" + outputT + "</tokens>");
    }
}
