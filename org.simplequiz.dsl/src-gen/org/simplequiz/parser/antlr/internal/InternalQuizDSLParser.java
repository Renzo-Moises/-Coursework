package org.simplequiz.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.simplequiz.services.QuizDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuizDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'quiz'", "'{'", "'randomizeOrder'", "'='", "'}'", "'true'", "'false'", "'question'", "'calculated'", "'expression'", "'choice'", "'correct'", "'incorrect'"
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

        public InternalQuizDSLParser(TokenStream input, QuizDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected QuizDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalQuizDSL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQuizDSL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalQuizDSL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalQuizDSL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_quizzes_0_0= ruleQuiz ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_quizzes_0_0 = null;



        	enterRule();

        try {
            // InternalQuizDSL.g:77:2: ( ( (lv_quizzes_0_0= ruleQuiz ) )* )
            // InternalQuizDSL.g:78:2: ( (lv_quizzes_0_0= ruleQuiz ) )*
            {
            // InternalQuizDSL.g:78:2: ( (lv_quizzes_0_0= ruleQuiz ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQuizDSL.g:79:3: (lv_quizzes_0_0= ruleQuiz )
            	    {
            	    // InternalQuizDSL.g:79:3: (lv_quizzes_0_0= ruleQuiz )
            	    // InternalQuizDSL.g:80:4: lv_quizzes_0_0= ruleQuiz
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getQuizzesQuizParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_quizzes_0_0=ruleQuiz();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"quizzes",
            	    					lv_quizzes_0_0,
            	    					"org.simplequiz.QuizDSL.Quiz");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuiz"
    // InternalQuizDSL.g:100:1: entryRuleQuiz returns [EObject current=null] : iv_ruleQuiz= ruleQuiz EOF ;
    public final EObject entryRuleQuiz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuiz = null;


        try {
            // InternalQuizDSL.g:100:45: (iv_ruleQuiz= ruleQuiz EOF )
            // InternalQuizDSL.g:101:2: iv_ruleQuiz= ruleQuiz EOF
            {
             newCompositeNode(grammarAccess.getQuizRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuiz=ruleQuiz();

            state._fsp--;

             current =iv_ruleQuiz; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuiz"


    // $ANTLR start "ruleQuiz"
    // InternalQuizDSL.g:107:1: ruleQuiz returns [EObject current=null] : (otherlv_0= 'quiz' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) ) otherlv_4= '=' ( rulebooleanLiteral )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' ) ;
    public final EObject ruleQuiz() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_randomizeOrder_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_questions_6_0 = null;



        	enterRule();

        try {
            // InternalQuizDSL.g:113:2: ( (otherlv_0= 'quiz' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) ) otherlv_4= '=' ( rulebooleanLiteral )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' ) )
            // InternalQuizDSL.g:114:2: (otherlv_0= 'quiz' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) ) otherlv_4= '=' ( rulebooleanLiteral )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' )
            {
            // InternalQuizDSL.g:114:2: (otherlv_0= 'quiz' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) ) otherlv_4= '=' ( rulebooleanLiteral )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}' )
            // InternalQuizDSL.g:115:3: otherlv_0= 'quiz' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) ) otherlv_4= '=' ( rulebooleanLiteral )? ( (lv_questions_6_0= ruleQuestion ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuizAccess().getQuizKeyword_0());
            		
            // InternalQuizDSL.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalQuizDSL.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalQuizDSL.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalQuizDSL.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuizAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuizRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getQuizAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuizDSL.g:141:3: ( (lv_randomizeOrder_3_0= 'randomizeOrder' ) )
            // InternalQuizDSL.g:142:4: (lv_randomizeOrder_3_0= 'randomizeOrder' )
            {
            // InternalQuizDSL.g:142:4: (lv_randomizeOrder_3_0= 'randomizeOrder' )
            // InternalQuizDSL.g:143:5: lv_randomizeOrder_3_0= 'randomizeOrder'
            {
            lv_randomizeOrder_3_0=(Token)match(input,13,FOLLOW_7); 

            					newLeafNode(lv_randomizeOrder_3_0, grammarAccess.getQuizAccess().getRandomizeOrderRandomizeOrderKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuizRule());
            					}
            					setWithLastConsumed(current, "randomizeOrder", lv_randomizeOrder_3_0 != null, "randomizeOrder");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getQuizAccess().getEqualsSignKeyword_4());
            		
            // InternalQuizDSL.g:159:3: ( rulebooleanLiteral )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQuizDSL.g:160:4: rulebooleanLiteral
                    {

                    				newCompositeNode(grammarAccess.getQuizAccess().getBooleanLiteralParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_9);
                    rulebooleanLiteral();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalQuizDSL.g:168:3: ( (lv_questions_6_0= ruleQuestion ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalQuizDSL.g:169:4: (lv_questions_6_0= ruleQuestion )
            	    {
            	    // InternalQuizDSL.g:169:4: (lv_questions_6_0= ruleQuestion )
            	    // InternalQuizDSL.g:170:5: lv_questions_6_0= ruleQuestion
            	    {

            	    					newCompositeNode(grammarAccess.getQuizAccess().getQuestionsQuestionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_questions_6_0=ruleQuestion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuizRule());
            	    					}
            	    					add(
            	    						current,
            	    						"questions",
            	    						lv_questions_6_0,
            	    						"org.simplequiz.QuizDSL.Question");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQuizAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuiz"


    // $ANTLR start "entryRulebooleanLiteral"
    // InternalQuizDSL.g:195:1: entryRulebooleanLiteral returns [String current=null] : iv_rulebooleanLiteral= rulebooleanLiteral EOF ;
    public final String entryRulebooleanLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulebooleanLiteral = null;


        try {
            // InternalQuizDSL.g:195:54: (iv_rulebooleanLiteral= rulebooleanLiteral EOF )
            // InternalQuizDSL.g:196:2: iv_rulebooleanLiteral= rulebooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebooleanLiteral=rulebooleanLiteral();

            state._fsp--;

             current =iv_rulebooleanLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebooleanLiteral"


    // $ANTLR start "rulebooleanLiteral"
    // InternalQuizDSL.g:202:1: rulebooleanLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulebooleanLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalQuizDSL.g:208:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalQuizDSL.g:209:2: (kw= 'true' | kw= 'false' )
            {
            // InternalQuizDSL.g:209:2: (kw= 'true' | kw= 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuizDSL.g:210:3: kw= 'true'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQuizDSL.g:216:3: kw= 'false'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebooleanLiteral"


    // $ANTLR start "entryRuleQuestion"
    // InternalQuizDSL.g:225:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalQuizDSL.g:225:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalQuizDSL.g:226:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalQuizDSL.g:232:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_calculated_2_0= 'calculated' ) )? otherlv_3= '{' ( (lv_expression_4_0= ruleExpression ) )? ( (lv_choices_5_0= ruleChoice ) )* otherlv_6= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token lv_calculated_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_expression_4_0 = null;

        EObject lv_choices_5_0 = null;



        	enterRule();

        try {
            // InternalQuizDSL.g:238:2: ( (otherlv_0= 'question' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_calculated_2_0= 'calculated' ) )? otherlv_3= '{' ( (lv_expression_4_0= ruleExpression ) )? ( (lv_choices_5_0= ruleChoice ) )* otherlv_6= '}' ) )
            // InternalQuizDSL.g:239:2: (otherlv_0= 'question' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_calculated_2_0= 'calculated' ) )? otherlv_3= '{' ( (lv_expression_4_0= ruleExpression ) )? ( (lv_choices_5_0= ruleChoice ) )* otherlv_6= '}' )
            {
            // InternalQuizDSL.g:239:2: (otherlv_0= 'question' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_calculated_2_0= 'calculated' ) )? otherlv_3= '{' ( (lv_expression_4_0= ruleExpression ) )? ( (lv_choices_5_0= ruleChoice ) )* otherlv_6= '}' )
            // InternalQuizDSL.g:240:3: otherlv_0= 'question' ( (lv_text_1_0= RULE_STRING ) ) ( (lv_calculated_2_0= 'calculated' ) )? otherlv_3= '{' ( (lv_expression_4_0= ruleExpression ) )? ( (lv_choices_5_0= ruleChoice ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalQuizDSL.g:244:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalQuizDSL.g:245:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalQuizDSL.g:245:4: (lv_text_1_0= RULE_STRING )
            // InternalQuizDSL.g:246:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_text_1_0, grammarAccess.getQuestionAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQuizDSL.g:262:3: ( (lv_calculated_2_0= 'calculated' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQuizDSL.g:263:4: (lv_calculated_2_0= 'calculated' )
                    {
                    // InternalQuizDSL.g:263:4: (lv_calculated_2_0= 'calculated' )
                    // InternalQuizDSL.g:264:5: lv_calculated_2_0= 'calculated'
                    {
                    lv_calculated_2_0=(Token)match(input,19,FOLLOW_5); 

                    					newLeafNode(lv_calculated_2_0, grammarAccess.getQuestionAccess().getCalculatedCalculatedKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionRule());
                    					}
                    					setWithLastConsumed(current, "calculated", lv_calculated_2_0 != null, "calculated");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuizDSL.g:280:3: ( (lv_expression_4_0= ruleExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuizDSL.g:281:4: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalQuizDSL.g:281:4: (lv_expression_4_0= ruleExpression )
                    // InternalQuizDSL.g:282:5: lv_expression_4_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getQuestionAccess().getExpressionExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_4_0,
                    						"org.simplequiz.QuizDSL.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalQuizDSL.g:299:3: ( (lv_choices_5_0= ruleChoice ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQuizDSL.g:300:4: (lv_choices_5_0= ruleChoice )
            	    {
            	    // InternalQuizDSL.g:300:4: (lv_choices_5_0= ruleChoice )
            	    // InternalQuizDSL.g:301:5: lv_choices_5_0= ruleChoice
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getChoicesChoiceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_choices_5_0=ruleChoice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"choices",
            	    						lv_choices_5_0,
            	    						"org.simplequiz.QuizDSL.Choice");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleExpression"
    // InternalQuizDSL.g:326:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalQuizDSL.g:326:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalQuizDSL.g:327:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalQuizDSL.g:333:1: ruleExpression returns [EObject current=null] : (otherlv_0= 'expression' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalQuizDSL.g:339:2: ( (otherlv_0= 'expression' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalQuizDSL.g:340:2: (otherlv_0= 'expression' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalQuizDSL.g:340:2: (otherlv_0= 'expression' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalQuizDSL.g:341:3: otherlv_0= 'expression' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getExpressionKeyword_0());
            		
            // InternalQuizDSL.g:345:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalQuizDSL.g:346:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalQuizDSL.g:346:4: (lv_value_1_0= RULE_STRING )
            // InternalQuizDSL.g:347:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getExpressionAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleChoice"
    // InternalQuizDSL.g:367:1: entryRuleChoice returns [EObject current=null] : iv_ruleChoice= ruleChoice EOF ;
    public final EObject entryRuleChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoice = null;


        try {
            // InternalQuizDSL.g:367:47: (iv_ruleChoice= ruleChoice EOF )
            // InternalQuizDSL.g:368:2: iv_ruleChoice= ruleChoice EOF
            {
             newCompositeNode(grammarAccess.getChoiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChoice=ruleChoice();

            state._fsp--;

             current =iv_ruleChoice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoice"


    // $ANTLR start "ruleChoice"
    // InternalQuizDSL.g:374:1: ruleChoice returns [EObject current=null] : (otherlv_0= 'choice' ( (lv_text_1_0= RULE_STRING ) ) ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) ) ) ;
    public final EObject ruleChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_text_1_0=null;
        Token lv_correctness_2_1=null;
        Token lv_correctness_2_2=null;


        	enterRule();

        try {
            // InternalQuizDSL.g:380:2: ( (otherlv_0= 'choice' ( (lv_text_1_0= RULE_STRING ) ) ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) ) ) )
            // InternalQuizDSL.g:381:2: (otherlv_0= 'choice' ( (lv_text_1_0= RULE_STRING ) ) ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) ) )
            {
            // InternalQuizDSL.g:381:2: (otherlv_0= 'choice' ( (lv_text_1_0= RULE_STRING ) ) ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) ) )
            // InternalQuizDSL.g:382:3: otherlv_0= 'choice' ( (lv_text_1_0= RULE_STRING ) ) ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChoiceAccess().getChoiceKeyword_0());
            		
            // InternalQuizDSL.g:386:3: ( (lv_text_1_0= RULE_STRING ) )
            // InternalQuizDSL.g:387:4: (lv_text_1_0= RULE_STRING )
            {
            // InternalQuizDSL.g:387:4: (lv_text_1_0= RULE_STRING )
            // InternalQuizDSL.g:388:5: lv_text_1_0= RULE_STRING
            {
            lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_text_1_0, grammarAccess.getChoiceAccess().getTextSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChoiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalQuizDSL.g:404:3: ( ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) ) )
            // InternalQuizDSL.g:405:4: ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) )
            {
            // InternalQuizDSL.g:405:4: ( (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' ) )
            // InternalQuizDSL.g:406:5: (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' )
            {
            // InternalQuizDSL.g:406:5: (lv_correctness_2_1= 'correct' | lv_correctness_2_2= 'incorrect' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQuizDSL.g:407:6: lv_correctness_2_1= 'correct'
                    {
                    lv_correctness_2_1=(Token)match(input,22,FOLLOW_2); 

                    						newLeafNode(lv_correctness_2_1, grammarAccess.getChoiceAccess().getCorrectnessCorrectKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoiceRule());
                    						}
                    						setWithLastConsumed(current, "correctness", lv_correctness_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalQuizDSL.g:418:6: lv_correctness_2_2= 'incorrect'
                    {
                    lv_correctness_2_2=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_correctness_2_2, grammarAccess.getChoiceAccess().getCorrectnessIncorrectKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChoiceRule());
                    						}
                    						setWithLastConsumed(current, "correctness", lv_correctness_2_2, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoice"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});

}