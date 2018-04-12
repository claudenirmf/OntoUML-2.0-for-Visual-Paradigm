/*
 * generated by Xtext 2.12.0
 */
package it.unibz.inf.ontouml.xtext.parser.antlr;

import com.google.inject.Inject;
import it.unibz.inf.ontouml.xtext.parser.antlr.internal.InternalOntoUMLParser;
import it.unibz.inf.ontouml.xtext.services.OntoUMLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class OntoUMLParser extends AbstractAntlrParser {

	@Inject
	private OntoUMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalOntoUMLParser createParser(XtextTokenStream stream) {
		return new InternalOntoUMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public OntoUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OntoUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
