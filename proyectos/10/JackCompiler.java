import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class JackCompiler{
    /** 
     * This class provides an empty implementation of JackGrammarListener,
     * which can be extended to create a listener which only needs to handle a subset
     * of the available methods.
     */ // Generated from JackGrammar.g4 by ANTLR 4.7
    public class JackGrammarBaseListener implements JackGrammarListener {
	public void enterClasss(JackGrammarParser.ClasssContext ctx) { }
	public void exitClasss(JackGrammarParser.ClasssContext ctx) { }
	public void enterClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { }
	public void exitClassVarDec(JackGrammarParser.ClassVarDecContext ctx) { }
	public void enterType(JackGrammarParser.TypeContext ctx) { }
	public void exitType(JackGrammarParser.TypeContext ctx) { }
	public void enterSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) { }
	public void exitSubroutineDec(JackGrammarParser.SubroutineDecContext ctx) { }
	public void enterParameterList(JackGrammarParser.ParameterListContext ctx) { }
	public void exitParameterList(JackGrammarParser.ParameterListContext ctx) { }
	public void enterSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) { }
	public void exitSubroutineBody(JackGrammarParser.SubroutineBodyContext ctx) { }
	public void enterVarDec(JackGrammarParser.VarDecContext ctx) { }
	public void exitVarDec(JackGrammarParser.VarDecContext ctx) { }
	public void enterClassName(JackGrammarParser.ClassNameContext ctx) { }
	public void exitClassName(JackGrammarParser.ClassNameContext ctx) { }
	public void enterSubroutineName(JackGrammarParser.SubroutineNameContext ctx) { }
	public void exitSubroutineName(JackGrammarParser.SubroutineNameContext ctx) { }
	public void enterVarName(JackGrammarParser.VarNameContext ctx) { }
	public void exitVarName(JackGrammarParser.VarNameContext ctx) { }
	public void enterStatements(JackGrammarParser.StatementsContext ctx) { }
	public void exitStatements(JackGrammarParser.StatementsContext ctx) { }
	public void enterStatement(JackGrammarParser.StatementContext ctx) { }
	public void exitStatement(JackGrammarParser.StatementContext ctx) { }
	public void enterLetStatement(JackGrammarParser.LetStatementContext ctx) { }
	public void exitLetStatement(JackGrammarParser.LetStatementContext ctx) { }
	public void enterIfStatement(JackGrammarParser.IfStatementContext ctx) { }
	public void exitIfStatement(JackGrammarParser.IfStatementContext ctx) { }
	public void enterWhileStatement(JackGrammarParser.WhileStatementContext ctx) { }
	public void exitWhileStatement(JackGrammarParser.WhileStatementContext ctx) { }
	public void enterDoStatement(JackGrammarParser.DoStatementContext ctx) { }
	public void exitDoStatement(JackGrammarParser.DoStatementContext ctx) { }
	public void enterReturnStatement(JackGrammarParser.ReturnStatementContext ctx) { }
	public void exitReturnStatement(JackGrammarParser.ReturnStatementContext ctx) { }
	public void enterExpression(JackGrammarParser.ExpressionContext ctx) { }
	public void exitExpression(JackGrammarParser.ExpressionContext ctx) { }
	public void enterTerm(JackGrammarParser.TermContext ctx) { }
	public void exitTerm(JackGrammarParser.TermContext ctx) { }
	public void enterSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) { }
	public void exitSubroutineCall(JackGrammarParser.SubroutineCallContext ctx) { }
	public void enterExpressionList(JackGrammarParser.ExpressionListContext ctx) { }
	public void exitExpressionList(JackGrammarParser.ExpressionListContext ctx) { }
	public void enterOp(JackGrammarParser.OpContext ctx) { }
	public void exitOp(JackGrammarParser.OpContext ctx) { }
	public void enterUnaryOp(JackGrammarParser.UnaryOpContext ctx) { }
	public void exitUnaryOp(JackGrammarParser.UnaryOpContext ctx) { }
	public void enterKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) { }
	public void exitKeywordConstant(JackGrammarParser.KeywordConstantContext ctx) { }

	public void enterEveryRule(ParserRuleContext ctx) { }
	public void exitEveryRule(ParserRuleContext ctx) { }
	public void visitTerminal(TerminalNode node) { }
	public void visitErrorNode(ErrorNode node) { }
    }
    public static void main(String[] args) {
	try {
	    ANTLRInputStream input = new ANTLRInputStream( new FileInputStream(args[0]));

	    JackGrammarLexer lexer = new JackGrammarLexer(input);
	    JackGrammarParser parser = new JackGrammarParser(new CommonTokenStream(lexer));

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
