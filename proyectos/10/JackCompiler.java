import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class JackCompiler{
    /** 
     * This class provides an empty implementation of JackGrammarListener,
     * which can be extended to create a listener which only needs to handle a subset
     * of the available methods.
     */ // Generated from JackGrammar.g4 by ANTLR 4.7
    public static class JackGrammarBaseListener implements JackGrammarListener {
	public void enterClasss(JackGrammarParser.ClasssContext ctx) { }
	public void exitClasss(JackGrammarParser.ClasssContext ctx) { }
	public void enterClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { }
	public void exitClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { }
	public void enterType(JackGrammarParser.TypeContext ctx) {  }
	public void exitType(JackGrammarParser.TypeContext ctx) {  }
	public void enterSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) {  }
	public void exitSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) {  }
	public void enterParameterList(JackGrammarParser.ParameterListContext ctx) {  }
	public void exitParameterList(JackGrammarParser.ParameterListContext ctx) {  }
	public void enterSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) {  }
	public void exitSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) {  }
	public void enterVarDec(JackGrammarParser.VarDecContext ctx) {
	    //System.out.println("enterVarDec - " + ctx.getText() + " ::-=>  " + ctx.getChildCount());
	    //System.out.println("»» " + ctx.getChild(0) + " $ " + ctx.getChild(1) + " # " + ctx.getChild(2));
	}
	public void exitVarDec(JackGrammarParser.VarDecContext ctx) { }
	public void enterClassName(JackGrammarParser.ClassNameContext ctx) {  }
	public void exitClassName(JackGrammarParser.ClassNameContext ctx) {  }
	public void enterSubroutineName(JackGrammarParser.SubroutineNameContext ctx) {  }
	public void exitSubroutineName(JackGrammarParser.SubroutineNameContext ctx) {  }
	public void enterVarName(JackGrammarParser.VarNameContext ctx) {  }
	public void exitVarName(JackGrammarParser.VarNameContext ctx) {  }
	public void enterStatements(JackGrammarParser.StatementsContext ctx) {  }
	public void exitStatements(JackGrammarParser.StatementsContext ctx) {  }
	public void enterStatement(JackGrammarParser.StatementContext ctx) {  }
	public void exitStatement(JackGrammarParser.StatementContext ctx) {  }
	public void enterLetStatement(JackGrammarParser.LetStatementContext ctx) { }
	public void exitLetStatement(JackGrammarParser.LetStatementContext ctx) { }
	public void enterIfStatement(JackGrammarParser.IfStatementContext ctx) {  }
	public void exitIfStatement(JackGrammarParser.IfStatementContext ctx) {  }
	public void enterWhileStatement(JackGrammarParser.WhileStatementContext ctx) {  }
	public void exitWhileStatement(JackGrammarParser.WhileStatementContext ctx) {  }
	public void enterDoStatement(JackGrammarParser.DoStatementContext ctx) {  }
	public void exitDoStatement(JackGrammarParser.DoStatementContext ctx) {  }
	public void enterReturnStatement(JackGrammarParser.ReturnStatementContext ctx) {  }
	public void exitReturnStatement(JackGrammarParser.ReturnStatementContext ctx) {  }
	public void enterExpression(JackGrammarParser.ExpressionContext ctx) {  }
	public void exitExpression(JackGrammarParser.ExpressionContext ctx) {  }
	public void enterTerm(JackGrammarParser.TermContext ctx) {  }
	public void exitTerm(JackGrammarParser.TermContext ctx) {  }
	public void enterSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) {  }
	public void exitSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) {  }
	public void enterExpressionList(JackGrammarParser.ExpressionListContext ctx) {  }
	public void exitExpressionList(JackGrammarParser.ExpressionListContext ctx) {  }
	public void enterOp(JackGrammarParser.OpContext ctx) {  }
	public void exitOp(JackGrammarParser.OpContext ctx) {  }
	public void enterUnaryOp(JackGrammarParser.UnaryOpContext ctx) {  }
	public void exitUnaryOp(JackGrammarParser.UnaryOpContext ctx) {  }
	public void enterKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) {  }
	public void exitKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) {  }

	public void enterEveryRule(ParserRuleContext ctx) { }//System.out.println("enterEveryRule ::-=>  " + ctx.getText()+ "\n");}
	public void exitEveryRule(ParserRuleContext ctx) { }//System.out.println("exitEveryRule ::-=>  " + ctx.getText()+ "\n");}
	public void visitTerminal(TerminalNode node) {	    
	    String child = node.getText();
	    if(child.equals("class")|| child.equals("constructor")|| child.equals("function")|| child.equals("method")|| child.equals("field")|| child.equals("static")
	       || child.equals("var")|| child.equals("int")|| child.equals("char")|| child.equals("boolean")|| child.equals("void")|| child.equals("true")
	       || child.equals("false")|| child.equals("null")|| child.equals("this")|| child.equals("let")|| child.equals("do")|| child.equals("if")
	       || child.equals("else")|| child.equals("while")|| child.equals("return")){
		System.out.println("<keyword> " + child + " </keyword>");
	    }else if(child.equals("{")|| child.equals("}")|| child.equals("(")|| child.equals(")")|| child.equals("[")|| child.equals("]")|| child.equals(".")
		     || child.equals(",")|| child.equals(";")|| child.equals("+")|| child.equals("-")|| child.equals("*")|| child.equals("/")|| child.equals("&")
		     || child.equals("|")|| child.equals("|") || child.equals("<")|| child.equals(">")|| child.equals("~")|| child.equals("=")){
		System.out.println("<symbol> " + child + " </symbol>");
	    }else if(isInteger(child)){
		System.out.println("<integerConstant> " + child + " </integerConstant>");
	    }else if(child.charAt(0) == '"'){
		System.out.println("<stringConstant> " + child.substring(1, child.length()-1) + " </stringConstant>");
	    }else{
		System.out.println("<identifier> " + child + " </identifier>");
	    }
	}
	public void visitErrorNode(ErrorNode node) { }//System.out.println("visitErrorNode ::-=>  "+ node.getText()+ "\n");}
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
	//System.out.println("-> " + args[0]);
	System.out.println("<tokens>");
	JackGrammarLexer lexer = new JackGrammarLexer( new ANTLRFileStream( args[0] ));
	CommonTokenStream tokens = new CommonTokenStream( lexer );
	JackGrammarParser parser = new JackGrammarParser( tokens );

	ParseTree tree = parser.classs();
	ParseTreeWalker walker = new ParseTreeWalker();
	walker.walk(new JackGrammarBaseListener(), tree);
	System.out.println("</tokens>");	
    }
}
