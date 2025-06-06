/*
 * generated by Xtext 2.38.0
 */
grammar InternalQuizDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.simplequiz.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.simplequiz.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.simplequiz.services.QuizDSLGrammarAccess;

}
@parser::members {
	private QuizDSLGrammarAccess grammarAccess;

	public void setGrammarAccess(QuizDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getQuizzesAssignment()); }
		(rule__Model__QuizzesAssignment)*
		{ after(grammarAccess.getModelAccess().getQuizzesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuiz
entryRuleQuiz
:
{ before(grammarAccess.getQuizRule()); }
	 ruleQuiz
{ after(grammarAccess.getQuizRule()); } 
	 EOF 
;

// Rule Quiz
ruleQuiz 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuizAccess().getGroup()); }
		(rule__Quiz__Group__0)
		{ after(grammarAccess.getQuizAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulebooleanLiteral
entryRulebooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 rulebooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule booleanLiteral
rulebooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); }
		(rule__BooleanLiteral__Alternatives)
		{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQuestion
entryRuleQuestion
:
{ before(grammarAccess.getQuestionRule()); }
	 ruleQuestion
{ after(grammarAccess.getQuestionRule()); } 
	 EOF 
;

// Rule Question
ruleQuestion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQuestionAccess().getGroup()); }
		(rule__Question__Group__0)
		{ after(grammarAccess.getQuestionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getGroup()); }
		(rule__Expression__Group__0)
		{ after(grammarAccess.getExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChoice
entryRuleChoice
:
{ before(grammarAccess.getChoiceRule()); }
	 ruleChoice
{ after(grammarAccess.getChoiceRule()); } 
	 EOF 
;

// Rule Choice
ruleChoice 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChoiceAccess().getGroup()); }
		(rule__Choice__Group__0)
		{ after(grammarAccess.getChoiceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__CorrectnessAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoiceAccess().getCorrectnessCorrectKeyword_2_0_0()); }
		'correct'
		{ after(grammarAccess.getChoiceAccess().getCorrectnessCorrectKeyword_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getChoiceAccess().getCorrectnessIncorrectKeyword_2_0_1()); }
		'incorrect'
		{ after(grammarAccess.getChoiceAccess().getCorrectnessIncorrectKeyword_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__0__Impl
	rule__Quiz__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getQuizKeyword_0()); }
	'quiz'
	{ after(grammarAccess.getQuizAccess().getQuizKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__1__Impl
	rule__Quiz__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getNameAssignment_1()); }
	(rule__Quiz__NameAssignment_1)
	{ after(grammarAccess.getQuizAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__2__Impl
	rule__Quiz__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__3__Impl
	rule__Quiz__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getRandomizeOrderAssignment_3()); }
	(rule__Quiz__RandomizeOrderAssignment_3)
	{ after(grammarAccess.getQuizAccess().getRandomizeOrderAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__4__Impl
	rule__Quiz__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getQuizAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__5__Impl
	rule__Quiz__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getBooleanLiteralParserRuleCall_5()); }
	(rulebooleanLiteral)?
	{ after(grammarAccess.getQuizAccess().getBooleanLiteralParserRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__6__Impl
	rule__Quiz__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getQuestionsAssignment_6()); }
	(rule__Quiz__QuestionsAssignment_6)*
	{ after(grammarAccess.getQuizAccess().getQuestionsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Quiz__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Question__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__0__Impl
	rule__Question__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
	'question'
	{ after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__1__Impl
	rule__Question__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getTextAssignment_1()); }
	(rule__Question__TextAssignment_1)
	{ after(grammarAccess.getQuestionAccess().getTextAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__2__Impl
	rule__Question__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getCalculatedAssignment_2()); }
	(rule__Question__CalculatedAssignment_2)?
	{ after(grammarAccess.getQuestionAccess().getCalculatedAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__3__Impl
	rule__Question__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__4__Impl
	rule__Question__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getExpressionAssignment_4()); }
	(rule__Question__ExpressionAssignment_4)?
	{ after(grammarAccess.getQuestionAccess().getExpressionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__5__Impl
	rule__Question__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getChoicesAssignment_5()); }
	(rule__Question__ChoicesAssignment_5)*
	{ after(grammarAccess.getQuestionAccess().getChoicesAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Question__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Expression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__0__Impl
	rule__Expression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); }
	'expression'
	{ after(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Expression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExpressionAccess().getValueAssignment_1()); }
	(rule__Expression__ValueAssignment_1)
	{ after(grammarAccess.getExpressionAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Choice__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choice__Group__0__Impl
	rule__Choice__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); }
	'choice'
	{ after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choice__Group__1__Impl
	rule__Choice__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoiceAccess().getTextAssignment_1()); }
	(rule__Choice__TextAssignment_1)
	{ after(grammarAccess.getChoiceAccess().getTextAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Choice__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChoiceAccess().getCorrectnessAssignment_2()); }
	(rule__Choice__CorrectnessAssignment_2)
	{ after(grammarAccess.getChoiceAccess().getCorrectnessAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__QuizzesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getQuizzesQuizParserRuleCall_0()); }
		ruleQuiz
		{ after(grammarAccess.getModelAccess().getQuizzesQuizParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuizAccess().getNameSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getQuizAccess().getNameSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__RandomizeOrderAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); }
		(
			{ before(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); }
			'randomizeOrder'
			{ after(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); }
		)
		{ after(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Quiz__QuestionsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuizAccess().getQuestionsQuestionParserRuleCall_6_0()); }
		ruleQuestion
		{ after(grammarAccess.getQuizAccess().getQuestionsQuestionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__CalculatedAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); }
		(
			{ before(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); }
			'calculated'
			{ after(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); }
		)
		{ after(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__ExpressionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getExpressionExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getQuestionAccess().getExpressionExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Question__ChoicesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); }
		ruleChoice
		{ after(grammarAccess.getQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Expression__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__TextAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Choice__CorrectnessAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChoiceAccess().getCorrectnessAlternatives_2_0()); }
		(rule__Choice__CorrectnessAlternatives_2_0)
		{ after(grammarAccess.getChoiceAccess().getCorrectnessAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
