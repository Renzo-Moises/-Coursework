/*
 * generated by Xtext 2.38.0
 */
package org.simplequiz.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.simplequiz.parser.antlr.internal.InternalQuizDSLParser;
import org.simplequiz.services.QuizDSLGrammarAccess;

public class QuizDSLParser extends AbstractAntlrParser {

	@Inject
	private QuizDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalQuizDSLParser createParser(XtextTokenStream stream) {
		return new InternalQuizDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public QuizDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QuizDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
