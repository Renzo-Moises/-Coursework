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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuizDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'correct'", "'incorrect'", "'quiz'", "'{'", "'='", "'}'", "'question'", "'expression'", "'choice'", "'randomizeOrder'", "'calculated'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalQuizDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuizDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuizDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuizDSL.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalQuizDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalQuizDSL.g:54:1: ( ruleModel EOF )
            // InternalQuizDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalQuizDSL.g:62:1: ruleModel : ( ( rule__Model__QuizzesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:66:2: ( ( ( rule__Model__QuizzesAssignment )* ) )
            // InternalQuizDSL.g:67:2: ( ( rule__Model__QuizzesAssignment )* )
            {
            // InternalQuizDSL.g:67:2: ( ( rule__Model__QuizzesAssignment )* )
            // InternalQuizDSL.g:68:3: ( rule__Model__QuizzesAssignment )*
            {
             before(grammarAccess.getModelAccess().getQuizzesAssignment()); 
            // InternalQuizDSL.g:69:3: ( rule__Model__QuizzesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuizDSL.g:69:4: rule__Model__QuizzesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__QuizzesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQuizzesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuiz"
    // InternalQuizDSL.g:78:1: entryRuleQuiz : ruleQuiz EOF ;
    public final void entryRuleQuiz() throws RecognitionException {
        try {
            // InternalQuizDSL.g:79:1: ( ruleQuiz EOF )
            // InternalQuizDSL.g:80:1: ruleQuiz EOF
            {
             before(grammarAccess.getQuizRule()); 
            pushFollow(FOLLOW_1);
            ruleQuiz();

            state._fsp--;

             after(grammarAccess.getQuizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // InternalQuizDSL.g:87:1: ruleQuiz : ( ( rule__Quiz__Group__0 ) ) ;
    public final void ruleQuiz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:91:2: ( ( ( rule__Quiz__Group__0 ) ) )
            // InternalQuizDSL.g:92:2: ( ( rule__Quiz__Group__0 ) )
            {
            // InternalQuizDSL.g:92:2: ( ( rule__Quiz__Group__0 ) )
            // InternalQuizDSL.g:93:3: ( rule__Quiz__Group__0 )
            {
             before(grammarAccess.getQuizAccess().getGroup()); 
            // InternalQuizDSL.g:94:3: ( rule__Quiz__Group__0 )
            // InternalQuizDSL.g:94:4: rule__Quiz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quiz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRulebooleanLiteral"
    // InternalQuizDSL.g:103:1: entryRulebooleanLiteral : rulebooleanLiteral EOF ;
    public final void entryRulebooleanLiteral() throws RecognitionException {
        try {
            // InternalQuizDSL.g:104:1: ( rulebooleanLiteral EOF )
            // InternalQuizDSL.g:105:1: rulebooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            rulebooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulebooleanLiteral"


    // $ANTLR start "rulebooleanLiteral"
    // InternalQuizDSL.g:112:1: rulebooleanLiteral : ( ( rule__BooleanLiteral__Alternatives ) ) ;
    public final void rulebooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:116:2: ( ( ( rule__BooleanLiteral__Alternatives ) ) )
            // InternalQuizDSL.g:117:2: ( ( rule__BooleanLiteral__Alternatives ) )
            {
            // InternalQuizDSL.g:117:2: ( ( rule__BooleanLiteral__Alternatives ) )
            // InternalQuizDSL.g:118:3: ( rule__BooleanLiteral__Alternatives )
            {
             before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 
            // InternalQuizDSL.g:119:3: ( rule__BooleanLiteral__Alternatives )
            // InternalQuizDSL.g:119:4: rule__BooleanLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebooleanLiteral"


    // $ANTLR start "entryRuleQuestion"
    // InternalQuizDSL.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalQuizDSL.g:129:1: ( ruleQuestion EOF )
            // InternalQuizDSL.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQuizDSL.g:137:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:141:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalQuizDSL.g:142:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalQuizDSL.g:142:2: ( ( rule__Question__Group__0 ) )
            // InternalQuizDSL.g:143:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalQuizDSL.g:144:3: ( rule__Question__Group__0 )
            // InternalQuizDSL.g:144:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleExpression"
    // InternalQuizDSL.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalQuizDSL.g:154:1: ( ruleExpression EOF )
            // InternalQuizDSL.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQuizDSL.g:162:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:166:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalQuizDSL.g:167:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalQuizDSL.g:167:2: ( ( rule__Expression__Group__0 ) )
            // InternalQuizDSL.g:168:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalQuizDSL.g:169:3: ( rule__Expression__Group__0 )
            // InternalQuizDSL.g:169:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleChoice"
    // InternalQuizDSL.g:178:1: entryRuleChoice : ruleChoice EOF ;
    public final void entryRuleChoice() throws RecognitionException {
        try {
            // InternalQuizDSL.g:179:1: ( ruleChoice EOF )
            // InternalQuizDSL.g:180:1: ruleChoice EOF
            {
             before(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getChoiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalQuizDSL.g:187:1: ruleChoice : ( ( rule__Choice__Group__0 ) ) ;
    public final void ruleChoice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:191:2: ( ( ( rule__Choice__Group__0 ) ) )
            // InternalQuizDSL.g:192:2: ( ( rule__Choice__Group__0 ) )
            {
            // InternalQuizDSL.g:192:2: ( ( rule__Choice__Group__0 ) )
            // InternalQuizDSL.g:193:3: ( rule__Choice__Group__0 )
            {
             before(grammarAccess.getChoiceAccess().getGroup()); 
            // InternalQuizDSL.g:194:3: ( rule__Choice__Group__0 )
            // InternalQuizDSL.g:194:4: rule__Choice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChoice"


    // $ANTLR start "rule__BooleanLiteral__Alternatives"
    // InternalQuizDSL.g:202:1: rule__BooleanLiteral__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BooleanLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:206:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuizDSL.g:207:2: ( 'true' )
                    {
                    // InternalQuizDSL.g:207:2: ( 'true' )
                    // InternalQuizDSL.g:208:3: 'true'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuizDSL.g:213:2: ( 'false' )
                    {
                    // InternalQuizDSL.g:213:2: ( 'false' )
                    // InternalQuizDSL.g:214:3: 'false'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Alternatives"


    // $ANTLR start "rule__Choice__CorrectnessAlternatives_2_0"
    // InternalQuizDSL.g:223:1: rule__Choice__CorrectnessAlternatives_2_0 : ( ( 'correct' ) | ( 'incorrect' ) );
    public final void rule__Choice__CorrectnessAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:227:1: ( ( 'correct' ) | ( 'incorrect' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuizDSL.g:228:2: ( 'correct' )
                    {
                    // InternalQuizDSL.g:228:2: ( 'correct' )
                    // InternalQuizDSL.g:229:3: 'correct'
                    {
                     before(grammarAccess.getChoiceAccess().getCorrectnessCorrectKeyword_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getChoiceAccess().getCorrectnessCorrectKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuizDSL.g:234:2: ( 'incorrect' )
                    {
                    // InternalQuizDSL.g:234:2: ( 'incorrect' )
                    // InternalQuizDSL.g:235:3: 'incorrect'
                    {
                     before(grammarAccess.getChoiceAccess().getCorrectnessIncorrectKeyword_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getChoiceAccess().getCorrectnessIncorrectKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__CorrectnessAlternatives_2_0"


    // $ANTLR start "rule__Quiz__Group__0"
    // InternalQuizDSL.g:244:1: rule__Quiz__Group__0 : rule__Quiz__Group__0__Impl rule__Quiz__Group__1 ;
    public final void rule__Quiz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:248:1: ( rule__Quiz__Group__0__Impl rule__Quiz__Group__1 )
            // InternalQuizDSL.g:249:2: rule__Quiz__Group__0__Impl rule__Quiz__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Quiz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__0"


    // $ANTLR start "rule__Quiz__Group__0__Impl"
    // InternalQuizDSL.g:256:1: rule__Quiz__Group__0__Impl : ( 'quiz' ) ;
    public final void rule__Quiz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:260:1: ( ( 'quiz' ) )
            // InternalQuizDSL.g:261:1: ( 'quiz' )
            {
            // InternalQuizDSL.g:261:1: ( 'quiz' )
            // InternalQuizDSL.g:262:2: 'quiz'
            {
             before(grammarAccess.getQuizAccess().getQuizKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getQuizKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__0__Impl"


    // $ANTLR start "rule__Quiz__Group__1"
    // InternalQuizDSL.g:271:1: rule__Quiz__Group__1 : rule__Quiz__Group__1__Impl rule__Quiz__Group__2 ;
    public final void rule__Quiz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:275:1: ( rule__Quiz__Group__1__Impl rule__Quiz__Group__2 )
            // InternalQuizDSL.g:276:2: rule__Quiz__Group__1__Impl rule__Quiz__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Quiz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__1"


    // $ANTLR start "rule__Quiz__Group__1__Impl"
    // InternalQuizDSL.g:283:1: rule__Quiz__Group__1__Impl : ( ( rule__Quiz__NameAssignment_1 ) ) ;
    public final void rule__Quiz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:287:1: ( ( ( rule__Quiz__NameAssignment_1 ) ) )
            // InternalQuizDSL.g:288:1: ( ( rule__Quiz__NameAssignment_1 ) )
            {
            // InternalQuizDSL.g:288:1: ( ( rule__Quiz__NameAssignment_1 ) )
            // InternalQuizDSL.g:289:2: ( rule__Quiz__NameAssignment_1 )
            {
             before(grammarAccess.getQuizAccess().getNameAssignment_1()); 
            // InternalQuizDSL.g:290:2: ( rule__Quiz__NameAssignment_1 )
            // InternalQuizDSL.g:290:3: rule__Quiz__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Quiz__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__1__Impl"


    // $ANTLR start "rule__Quiz__Group__2"
    // InternalQuizDSL.g:298:1: rule__Quiz__Group__2 : rule__Quiz__Group__2__Impl rule__Quiz__Group__3 ;
    public final void rule__Quiz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:302:1: ( rule__Quiz__Group__2__Impl rule__Quiz__Group__3 )
            // InternalQuizDSL.g:303:2: rule__Quiz__Group__2__Impl rule__Quiz__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Quiz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__2"


    // $ANTLR start "rule__Quiz__Group__2__Impl"
    // InternalQuizDSL.g:310:1: rule__Quiz__Group__2__Impl : ( '{' ) ;
    public final void rule__Quiz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:314:1: ( ( '{' ) )
            // InternalQuizDSL.g:315:1: ( '{' )
            {
            // InternalQuizDSL.g:315:1: ( '{' )
            // InternalQuizDSL.g:316:2: '{'
            {
             before(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__2__Impl"


    // $ANTLR start "rule__Quiz__Group__3"
    // InternalQuizDSL.g:325:1: rule__Quiz__Group__3 : rule__Quiz__Group__3__Impl rule__Quiz__Group__4 ;
    public final void rule__Quiz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:329:1: ( rule__Quiz__Group__3__Impl rule__Quiz__Group__4 )
            // InternalQuizDSL.g:330:2: rule__Quiz__Group__3__Impl rule__Quiz__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Quiz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__3"


    // $ANTLR start "rule__Quiz__Group__3__Impl"
    // InternalQuizDSL.g:337:1: rule__Quiz__Group__3__Impl : ( ( rule__Quiz__RandomizeOrderAssignment_3 ) ) ;
    public final void rule__Quiz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:341:1: ( ( ( rule__Quiz__RandomizeOrderAssignment_3 ) ) )
            // InternalQuizDSL.g:342:1: ( ( rule__Quiz__RandomizeOrderAssignment_3 ) )
            {
            // InternalQuizDSL.g:342:1: ( ( rule__Quiz__RandomizeOrderAssignment_3 ) )
            // InternalQuizDSL.g:343:2: ( rule__Quiz__RandomizeOrderAssignment_3 )
            {
             before(grammarAccess.getQuizAccess().getRandomizeOrderAssignment_3()); 
            // InternalQuizDSL.g:344:2: ( rule__Quiz__RandomizeOrderAssignment_3 )
            // InternalQuizDSL.g:344:3: rule__Quiz__RandomizeOrderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Quiz__RandomizeOrderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuizAccess().getRandomizeOrderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__3__Impl"


    // $ANTLR start "rule__Quiz__Group__4"
    // InternalQuizDSL.g:352:1: rule__Quiz__Group__4 : rule__Quiz__Group__4__Impl rule__Quiz__Group__5 ;
    public final void rule__Quiz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:356:1: ( rule__Quiz__Group__4__Impl rule__Quiz__Group__5 )
            // InternalQuizDSL.g:357:2: rule__Quiz__Group__4__Impl rule__Quiz__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Quiz__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__4"


    // $ANTLR start "rule__Quiz__Group__4__Impl"
    // InternalQuizDSL.g:364:1: rule__Quiz__Group__4__Impl : ( '=' ) ;
    public final void rule__Quiz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:368:1: ( ( '=' ) )
            // InternalQuizDSL.g:369:1: ( '=' )
            {
            // InternalQuizDSL.g:369:1: ( '=' )
            // InternalQuizDSL.g:370:2: '='
            {
             before(grammarAccess.getQuizAccess().getEqualsSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__4__Impl"


    // $ANTLR start "rule__Quiz__Group__5"
    // InternalQuizDSL.g:379:1: rule__Quiz__Group__5 : rule__Quiz__Group__5__Impl rule__Quiz__Group__6 ;
    public final void rule__Quiz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:383:1: ( rule__Quiz__Group__5__Impl rule__Quiz__Group__6 )
            // InternalQuizDSL.g:384:2: rule__Quiz__Group__5__Impl rule__Quiz__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Quiz__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__5"


    // $ANTLR start "rule__Quiz__Group__5__Impl"
    // InternalQuizDSL.g:391:1: rule__Quiz__Group__5__Impl : ( ( rulebooleanLiteral )? ) ;
    public final void rule__Quiz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:395:1: ( ( ( rulebooleanLiteral )? ) )
            // InternalQuizDSL.g:396:1: ( ( rulebooleanLiteral )? )
            {
            // InternalQuizDSL.g:396:1: ( ( rulebooleanLiteral )? )
            // InternalQuizDSL.g:397:2: ( rulebooleanLiteral )?
            {
             before(grammarAccess.getQuizAccess().getBooleanLiteralParserRuleCall_5()); 
            // InternalQuizDSL.g:398:2: ( rulebooleanLiteral )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuizDSL.g:398:3: rulebooleanLiteral
                    {
                    pushFollow(FOLLOW_2);
                    rulebooleanLiteral();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuizAccess().getBooleanLiteralParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__5__Impl"


    // $ANTLR start "rule__Quiz__Group__6"
    // InternalQuizDSL.g:406:1: rule__Quiz__Group__6 : rule__Quiz__Group__6__Impl rule__Quiz__Group__7 ;
    public final void rule__Quiz__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:410:1: ( rule__Quiz__Group__6__Impl rule__Quiz__Group__7 )
            // InternalQuizDSL.g:411:2: rule__Quiz__Group__6__Impl rule__Quiz__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Quiz__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quiz__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__6"


    // $ANTLR start "rule__Quiz__Group__6__Impl"
    // InternalQuizDSL.g:418:1: rule__Quiz__Group__6__Impl : ( ( rule__Quiz__QuestionsAssignment_6 )* ) ;
    public final void rule__Quiz__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:422:1: ( ( ( rule__Quiz__QuestionsAssignment_6 )* ) )
            // InternalQuizDSL.g:423:1: ( ( rule__Quiz__QuestionsAssignment_6 )* )
            {
            // InternalQuizDSL.g:423:1: ( ( rule__Quiz__QuestionsAssignment_6 )* )
            // InternalQuizDSL.g:424:2: ( rule__Quiz__QuestionsAssignment_6 )*
            {
             before(grammarAccess.getQuizAccess().getQuestionsAssignment_6()); 
            // InternalQuizDSL.g:425:2: ( rule__Quiz__QuestionsAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQuizDSL.g:425:3: rule__Quiz__QuestionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Quiz__QuestionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQuizAccess().getQuestionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__6__Impl"


    // $ANTLR start "rule__Quiz__Group__7"
    // InternalQuizDSL.g:433:1: rule__Quiz__Group__7 : rule__Quiz__Group__7__Impl ;
    public final void rule__Quiz__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:437:1: ( rule__Quiz__Group__7__Impl )
            // InternalQuizDSL.g:438:2: rule__Quiz__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quiz__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__7"


    // $ANTLR start "rule__Quiz__Group__7__Impl"
    // InternalQuizDSL.g:444:1: rule__Quiz__Group__7__Impl : ( '}' ) ;
    public final void rule__Quiz__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:448:1: ( ( '}' ) )
            // InternalQuizDSL.g:449:1: ( '}' )
            {
            // InternalQuizDSL.g:449:1: ( '}' )
            // InternalQuizDSL.g:450:2: '}'
            {
             before(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__Group__7__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalQuizDSL.g:460:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:464:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalQuizDSL.g:465:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalQuizDSL.g:472:1: rule__Question__Group__0__Impl : ( 'question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:476:1: ( ( 'question' ) )
            // InternalQuizDSL.g:477:1: ( 'question' )
            {
            // InternalQuizDSL.g:477:1: ( 'question' )
            // InternalQuizDSL.g:478:2: 'question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalQuizDSL.g:487:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:491:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalQuizDSL.g:492:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalQuizDSL.g:499:1: rule__Question__Group__1__Impl : ( ( rule__Question__TextAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:503:1: ( ( ( rule__Question__TextAssignment_1 ) ) )
            // InternalQuizDSL.g:504:1: ( ( rule__Question__TextAssignment_1 ) )
            {
            // InternalQuizDSL.g:504:1: ( ( rule__Question__TextAssignment_1 ) )
            // InternalQuizDSL.g:505:2: ( rule__Question__TextAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getTextAssignment_1()); 
            // InternalQuizDSL.g:506:2: ( rule__Question__TextAssignment_1 )
            // InternalQuizDSL.g:506:3: rule__Question__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalQuizDSL.g:514:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:518:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalQuizDSL.g:519:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalQuizDSL.g:526:1: rule__Question__Group__2__Impl : ( ( rule__Question__CalculatedAssignment_2 )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:530:1: ( ( ( rule__Question__CalculatedAssignment_2 )? ) )
            // InternalQuizDSL.g:531:1: ( ( rule__Question__CalculatedAssignment_2 )? )
            {
            // InternalQuizDSL.g:531:1: ( ( rule__Question__CalculatedAssignment_2 )? )
            // InternalQuizDSL.g:532:2: ( rule__Question__CalculatedAssignment_2 )?
            {
             before(grammarAccess.getQuestionAccess().getCalculatedAssignment_2()); 
            // InternalQuizDSL.g:533:2: ( rule__Question__CalculatedAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuizDSL.g:533:3: rule__Question__CalculatedAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__CalculatedAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getCalculatedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalQuizDSL.g:541:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:545:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalQuizDSL.g:546:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalQuizDSL.g:553:1: rule__Question__Group__3__Impl : ( '{' ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:557:1: ( ( '{' ) )
            // InternalQuizDSL.g:558:1: ( '{' )
            {
            // InternalQuizDSL.g:558:1: ( '{' )
            // InternalQuizDSL.g:559:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalQuizDSL.g:568:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:572:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalQuizDSL.g:573:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalQuizDSL.g:580:1: rule__Question__Group__4__Impl : ( ( rule__Question__ExpressionAssignment_4 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:584:1: ( ( ( rule__Question__ExpressionAssignment_4 )? ) )
            // InternalQuizDSL.g:585:1: ( ( rule__Question__ExpressionAssignment_4 )? )
            {
            // InternalQuizDSL.g:585:1: ( ( rule__Question__ExpressionAssignment_4 )? )
            // InternalQuizDSL.g:586:2: ( rule__Question__ExpressionAssignment_4 )?
            {
             before(grammarAccess.getQuestionAccess().getExpressionAssignment_4()); 
            // InternalQuizDSL.g:587:2: ( rule__Question__ExpressionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuizDSL.g:587:3: rule__Question__ExpressionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__ExpressionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalQuizDSL.g:595:1: rule__Question__Group__5 : rule__Question__Group__5__Impl rule__Question__Group__6 ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:599:1: ( rule__Question__Group__5__Impl rule__Question__Group__6 )
            // InternalQuizDSL.g:600:2: rule__Question__Group__5__Impl rule__Question__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalQuizDSL.g:607:1: rule__Question__Group__5__Impl : ( ( rule__Question__ChoicesAssignment_5 )* ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:611:1: ( ( ( rule__Question__ChoicesAssignment_5 )* ) )
            // InternalQuizDSL.g:612:1: ( ( rule__Question__ChoicesAssignment_5 )* )
            {
            // InternalQuizDSL.g:612:1: ( ( rule__Question__ChoicesAssignment_5 )* )
            // InternalQuizDSL.g:613:2: ( rule__Question__ChoicesAssignment_5 )*
            {
             before(grammarAccess.getQuestionAccess().getChoicesAssignment_5()); 
            // InternalQuizDSL.g:614:2: ( rule__Question__ChoicesAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuizDSL.g:614:3: rule__Question__ChoicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Question__ChoicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getChoicesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group__6"
    // InternalQuizDSL.g:622:1: rule__Question__Group__6 : rule__Question__Group__6__Impl ;
    public final void rule__Question__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:626:1: ( rule__Question__Group__6__Impl )
            // InternalQuizDSL.g:627:2: rule__Question__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6"


    // $ANTLR start "rule__Question__Group__6__Impl"
    // InternalQuizDSL.g:633:1: rule__Question__Group__6__Impl : ( '}' ) ;
    public final void rule__Question__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:637:1: ( ( '}' ) )
            // InternalQuizDSL.g:638:1: ( '}' )
            {
            // InternalQuizDSL.g:638:1: ( '}' )
            // InternalQuizDSL.g:639:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__6__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalQuizDSL.g:649:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:653:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalQuizDSL.g:654:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalQuizDSL.g:661:1: rule__Expression__Group__0__Impl : ( 'expression' ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:665:1: ( ( 'expression' ) )
            // InternalQuizDSL.g:666:1: ( 'expression' )
            {
            // InternalQuizDSL.g:666:1: ( 'expression' )
            // InternalQuizDSL.g:667:2: 'expression'
            {
             before(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalQuizDSL.g:676:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:680:1: ( rule__Expression__Group__1__Impl )
            // InternalQuizDSL.g:681:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalQuizDSL.g:687:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ValueAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:691:1: ( ( ( rule__Expression__ValueAssignment_1 ) ) )
            // InternalQuizDSL.g:692:1: ( ( rule__Expression__ValueAssignment_1 ) )
            {
            // InternalQuizDSL.g:692:1: ( ( rule__Expression__ValueAssignment_1 ) )
            // InternalQuizDSL.g:693:2: ( rule__Expression__ValueAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getValueAssignment_1()); 
            // InternalQuizDSL.g:694:2: ( rule__Expression__ValueAssignment_1 )
            // InternalQuizDSL.g:694:3: rule__Expression__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__0"
    // InternalQuizDSL.g:703:1: rule__Choice__Group__0 : rule__Choice__Group__0__Impl rule__Choice__Group__1 ;
    public final void rule__Choice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:707:1: ( rule__Choice__Group__0__Impl rule__Choice__Group__1 )
            // InternalQuizDSL.g:708:2: rule__Choice__Group__0__Impl rule__Choice__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Choice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0"


    // $ANTLR start "rule__Choice__Group__0__Impl"
    // InternalQuizDSL.g:715:1: rule__Choice__Group__0__Impl : ( 'choice' ) ;
    public final void rule__Choice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:719:1: ( ( 'choice' ) )
            // InternalQuizDSL.g:720:1: ( 'choice' )
            {
            // InternalQuizDSL.g:720:1: ( 'choice' )
            // InternalQuizDSL.g:721:2: 'choice'
            {
             before(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getChoiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__0__Impl"


    // $ANTLR start "rule__Choice__Group__1"
    // InternalQuizDSL.g:730:1: rule__Choice__Group__1 : rule__Choice__Group__1__Impl rule__Choice__Group__2 ;
    public final void rule__Choice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:734:1: ( rule__Choice__Group__1__Impl rule__Choice__Group__2 )
            // InternalQuizDSL.g:735:2: rule__Choice__Group__1__Impl rule__Choice__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Choice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Choice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1"


    // $ANTLR start "rule__Choice__Group__1__Impl"
    // InternalQuizDSL.g:742:1: rule__Choice__Group__1__Impl : ( ( rule__Choice__TextAssignment_1 ) ) ;
    public final void rule__Choice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:746:1: ( ( ( rule__Choice__TextAssignment_1 ) ) )
            // InternalQuizDSL.g:747:1: ( ( rule__Choice__TextAssignment_1 ) )
            {
            // InternalQuizDSL.g:747:1: ( ( rule__Choice__TextAssignment_1 ) )
            // InternalQuizDSL.g:748:2: ( rule__Choice__TextAssignment_1 )
            {
             before(grammarAccess.getChoiceAccess().getTextAssignment_1()); 
            // InternalQuizDSL.g:749:2: ( rule__Choice__TextAssignment_1 )
            // InternalQuizDSL.g:749:3: rule__Choice__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Choice__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__1__Impl"


    // $ANTLR start "rule__Choice__Group__2"
    // InternalQuizDSL.g:757:1: rule__Choice__Group__2 : rule__Choice__Group__2__Impl ;
    public final void rule__Choice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:761:1: ( rule__Choice__Group__2__Impl )
            // InternalQuizDSL.g:762:2: rule__Choice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Choice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2"


    // $ANTLR start "rule__Choice__Group__2__Impl"
    // InternalQuizDSL.g:768:1: rule__Choice__Group__2__Impl : ( ( rule__Choice__CorrectnessAssignment_2 ) ) ;
    public final void rule__Choice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:772:1: ( ( ( rule__Choice__CorrectnessAssignment_2 ) ) )
            // InternalQuizDSL.g:773:1: ( ( rule__Choice__CorrectnessAssignment_2 ) )
            {
            // InternalQuizDSL.g:773:1: ( ( rule__Choice__CorrectnessAssignment_2 ) )
            // InternalQuizDSL.g:774:2: ( rule__Choice__CorrectnessAssignment_2 )
            {
             before(grammarAccess.getChoiceAccess().getCorrectnessAssignment_2()); 
            // InternalQuizDSL.g:775:2: ( rule__Choice__CorrectnessAssignment_2 )
            // InternalQuizDSL.g:775:3: rule__Choice__CorrectnessAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Choice__CorrectnessAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getCorrectnessAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__Group__2__Impl"


    // $ANTLR start "rule__Model__QuizzesAssignment"
    // InternalQuizDSL.g:784:1: rule__Model__QuizzesAssignment : ( ruleQuiz ) ;
    public final void rule__Model__QuizzesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:788:1: ( ( ruleQuiz ) )
            // InternalQuizDSL.g:789:2: ( ruleQuiz )
            {
            // InternalQuizDSL.g:789:2: ( ruleQuiz )
            // InternalQuizDSL.g:790:3: ruleQuiz
            {
             before(grammarAccess.getModelAccess().getQuizzesQuizParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQuiz();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQuizzesQuizParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QuizzesAssignment"


    // $ANTLR start "rule__Quiz__NameAssignment_1"
    // InternalQuizDSL.g:799:1: rule__Quiz__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Quiz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:803:1: ( ( RULE_STRING ) )
            // InternalQuizDSL.g:804:2: ( RULE_STRING )
            {
            // InternalQuizDSL.g:804:2: ( RULE_STRING )
            // InternalQuizDSL.g:805:3: RULE_STRING
            {
             before(grammarAccess.getQuizAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__NameAssignment_1"


    // $ANTLR start "rule__Quiz__RandomizeOrderAssignment_3"
    // InternalQuizDSL.g:814:1: rule__Quiz__RandomizeOrderAssignment_3 : ( ( 'randomizeOrder' ) ) ;
    public final void rule__Quiz__RandomizeOrderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:818:1: ( ( ( 'randomizeOrder' ) ) )
            // InternalQuizDSL.g:819:2: ( ( 'randomizeOrder' ) )
            {
            // InternalQuizDSL.g:819:2: ( ( 'randomizeOrder' ) )
            // InternalQuizDSL.g:820:3: ( 'randomizeOrder' )
            {
             before(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); 
            // InternalQuizDSL.g:821:3: ( 'randomizeOrder' )
            // InternalQuizDSL.g:822:4: 'randomizeOrder'
            {
             before(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); 

            }

             after(grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__RandomizeOrderAssignment_3"


    // $ANTLR start "rule__Quiz__QuestionsAssignment_6"
    // InternalQuizDSL.g:833:1: rule__Quiz__QuestionsAssignment_6 : ( ruleQuestion ) ;
    public final void rule__Quiz__QuestionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:837:1: ( ( ruleQuestion ) )
            // InternalQuizDSL.g:838:2: ( ruleQuestion )
            {
            // InternalQuizDSL.g:838:2: ( ruleQuestion )
            // InternalQuizDSL.g:839:3: ruleQuestion
            {
             before(grammarAccess.getQuizAccess().getQuestionsQuestionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuizAccess().getQuestionsQuestionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Quiz__QuestionsAssignment_6"


    // $ANTLR start "rule__Question__TextAssignment_1"
    // InternalQuizDSL.g:848:1: rule__Question__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:852:1: ( ( RULE_STRING ) )
            // InternalQuizDSL.g:853:2: ( RULE_STRING )
            {
            // InternalQuizDSL.g:853:2: ( RULE_STRING )
            // InternalQuizDSL.g:854:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TextAssignment_1"


    // $ANTLR start "rule__Question__CalculatedAssignment_2"
    // InternalQuizDSL.g:863:1: rule__Question__CalculatedAssignment_2 : ( ( 'calculated' ) ) ;
    public final void rule__Question__CalculatedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:867:1: ( ( ( 'calculated' ) ) )
            // InternalQuizDSL.g:868:2: ( ( 'calculated' ) )
            {
            // InternalQuizDSL.g:868:2: ( ( 'calculated' ) )
            // InternalQuizDSL.g:869:3: ( 'calculated' )
            {
             before(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); 
            // InternalQuizDSL.g:870:3: ( 'calculated' )
            // InternalQuizDSL.g:871:4: 'calculated'
            {
             before(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); 

            }

             after(grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__CalculatedAssignment_2"


    // $ANTLR start "rule__Question__ExpressionAssignment_4"
    // InternalQuizDSL.g:882:1: rule__Question__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Question__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:886:1: ( ( ruleExpression ) )
            // InternalQuizDSL.g:887:2: ( ruleExpression )
            {
            // InternalQuizDSL.g:887:2: ( ruleExpression )
            // InternalQuizDSL.g:888:3: ruleExpression
            {
             before(grammarAccess.getQuestionAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ExpressionAssignment_4"


    // $ANTLR start "rule__Question__ChoicesAssignment_5"
    // InternalQuizDSL.g:897:1: rule__Question__ChoicesAssignment_5 : ( ruleChoice ) ;
    public final void rule__Question__ChoicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:901:1: ( ( ruleChoice ) )
            // InternalQuizDSL.g:902:2: ( ruleChoice )
            {
            // InternalQuizDSL.g:902:2: ( ruleChoice )
            // InternalQuizDSL.g:903:3: ruleChoice
            {
             before(grammarAccess.getQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleChoice();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getChoicesChoiceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__ChoicesAssignment_5"


    // $ANTLR start "rule__Expression__ValueAssignment_1"
    // InternalQuizDSL.g:912:1: rule__Expression__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Expression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:916:1: ( ( RULE_STRING ) )
            // InternalQuizDSL.g:917:2: ( RULE_STRING )
            {
            // InternalQuizDSL.g:917:2: ( RULE_STRING )
            // InternalQuizDSL.g:918:3: RULE_STRING
            {
             before(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ValueAssignment_1"


    // $ANTLR start "rule__Choice__TextAssignment_1"
    // InternalQuizDSL.g:927:1: rule__Choice__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Choice__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:931:1: ( ( RULE_STRING ) )
            // InternalQuizDSL.g:932:2: ( RULE_STRING )
            {
            // InternalQuizDSL.g:932:2: ( RULE_STRING )
            // InternalQuizDSL.g:933:3: RULE_STRING
            {
             before(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__TextAssignment_1"


    // $ANTLR start "rule__Choice__CorrectnessAssignment_2"
    // InternalQuizDSL.g:942:1: rule__Choice__CorrectnessAssignment_2 : ( ( rule__Choice__CorrectnessAlternatives_2_0 ) ) ;
    public final void rule__Choice__CorrectnessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuizDSL.g:946:1: ( ( ( rule__Choice__CorrectnessAlternatives_2_0 ) ) )
            // InternalQuizDSL.g:947:2: ( ( rule__Choice__CorrectnessAlternatives_2_0 ) )
            {
            // InternalQuizDSL.g:947:2: ( ( rule__Choice__CorrectnessAlternatives_2_0 ) )
            // InternalQuizDSL.g:948:3: ( rule__Choice__CorrectnessAlternatives_2_0 )
            {
             before(grammarAccess.getChoiceAccess().getCorrectnessAlternatives_2_0()); 
            // InternalQuizDSL.g:949:3: ( rule__Choice__CorrectnessAlternatives_2_0 )
            // InternalQuizDSL.g:949:4: rule__Choice__CorrectnessAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Choice__CorrectnessAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAccess().getCorrectnessAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Choice__CorrectnessAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C1800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006000L});

}