import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;

public class JackCompiler{
    public static void main(String[] args) throws Exception {
	JackVisitor jackVisitor = new JackVisitor();

	JackGrammarLexer lexer = new JackGrammarLexer( new ANTLRFileStream( args[0] ));
	CommonTokenStream tokens = new CommonTokenStream( lexer );
	JackGrammarParser parser = new JackGrammarParser( tokens );

	JackGrammarParser.ClazzContext clazz = parser.clazz();

	clazz.accept(jackVisitor);
	System.out.println("NOSENOSEJAJAJAJA\n" + jackVisitor.getResult());
    }
    public static String getTokenType(Token t) {
	switch (t.getType()) {
	case 0: return "stringConstant";
	case 1: return "integerConstant";
	case 2: return "identifier";
	}
	return t.getText().length() == 1 ? "symbol" : "keyword";
    }
    public static String getTokenText(Token t) {
	String text = t.getText();
	if (t.getType() == 1) {
	    text = text.substring(1, text.length() - 1);
	}
	return text;
    }
}
