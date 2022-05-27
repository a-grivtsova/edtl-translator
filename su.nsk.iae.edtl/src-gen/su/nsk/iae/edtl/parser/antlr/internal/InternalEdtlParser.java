package su.nsk.iae.edtl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECL_SYMB", "RULE_INTEGER", "RULE_DIRECT_VARIABLE", "RULE_ID", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_OCTAL_DIGIT", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'BOOL'", "'INT'", "'VAR_INPUT'", "'INPUT_PORTS_COUNTER'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "'OUTPUT_PORTS_COUNTER'", "'AT'", "':'", "'ABBR'", "'END_ABBR'", "'MACROS'", "'('", "')'", "'END_MACROS'", "','", "'REQ'", "'TRIGGER'", "'NL:'", "'\"'", "'INVARIANT'", "'FINAL'", "'DELAY'", "'REACTION'", "'RELEASE'", "'END_REQ'", "'XOR'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'#T'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=9;
    public static final int RULE_DECL_SYMB=4;
    public static final int RULE_BIT=15;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIRECT_SIZE_PREFIX=11;
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_DIRECT_VARIABLE=6;
    public static final int RULE_DIRECT_TYPE_PREFIX=10;
    public static final int RULE_OR_OPERATOR=8;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=12;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=19;
    public static final int RULE_LETTER=14;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=16;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEdtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEdtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEdtlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEdtl.g"; }



     	private EdtlGrammarAccess grammarAccess;

        public InternalEdtlParser(TokenStream input, EdtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EdtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEdtl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEdtl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEdtl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalEdtl.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_abbrs_2_0= ruleAbbr ) ) | ( (lv_macroses_3_0= ruleMacros ) ) | ( (lv_reqs_4_0= ruleRequirement ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declVarInput_0_0 = null;

        EObject lv_declVarOutput_1_0 = null;

        EObject lv_abbrs_2_0 = null;

        EObject lv_macroses_3_0 = null;

        EObject lv_reqs_4_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:78:2: ( ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_abbrs_2_0= ruleAbbr ) ) | ( (lv_macroses_3_0= ruleMacros ) ) | ( (lv_reqs_4_0= ruleRequirement ) ) )* )
            // InternalEdtl.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_abbrs_2_0= ruleAbbr ) ) | ( (lv_macroses_3_0= ruleMacros ) ) | ( (lv_reqs_4_0= ruleRequirement ) ) )*
            {
            // InternalEdtl.g:79:2: ( ( (lv_declVarInput_0_0= ruleDeclVarInput ) ) | ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) ) | ( (lv_abbrs_2_0= ruleAbbr ) ) | ( (lv_macroses_3_0= ruleMacros ) ) | ( (lv_reqs_4_0= ruleRequirement ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 22:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 30:
                    {
                    alt1=3;
                    }
                    break;
                case 32:
                    {
                    alt1=4;
                    }
                    break;
                case 37:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalEdtl.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    {
            	    // InternalEdtl.g:80:3: ( (lv_declVarInput_0_0= ruleDeclVarInput ) )
            	    // InternalEdtl.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    {
            	    // InternalEdtl.g:81:4: (lv_declVarInput_0_0= ruleDeclVarInput )
            	    // InternalEdtl.g:82:5: lv_declVarInput_0_0= ruleDeclVarInput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarInput_0_0=ruleDeclVarInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarInput",
            	    						lv_declVarInput_0_0,
            	    						"su.nsk.iae.edtl.Edtl.DeclVarInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEdtl.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    {
            	    // InternalEdtl.g:100:3: ( (lv_declVarOutput_1_0= ruleDeclVarOutput ) )
            	    // InternalEdtl.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    {
            	    // InternalEdtl.g:101:4: (lv_declVarOutput_1_0= ruleDeclVarOutput )
            	    // InternalEdtl.g:102:5: lv_declVarOutput_1_0= ruleDeclVarOutput
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_declVarOutput_1_0=ruleDeclVarOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declVarOutput",
            	    						lv_declVarOutput_1_0,
            	    						"su.nsk.iae.edtl.Edtl.DeclVarOutput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEdtl.g:120:3: ( (lv_abbrs_2_0= ruleAbbr ) )
            	    {
            	    // InternalEdtl.g:120:3: ( (lv_abbrs_2_0= ruleAbbr ) )
            	    // InternalEdtl.g:121:4: (lv_abbrs_2_0= ruleAbbr )
            	    {
            	    // InternalEdtl.g:121:4: (lv_abbrs_2_0= ruleAbbr )
            	    // InternalEdtl.g:122:5: lv_abbrs_2_0= ruleAbbr
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAbbrsAbbrParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_abbrs_2_0=ruleAbbr();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"abbrs",
            	    						lv_abbrs_2_0,
            	    						"su.nsk.iae.edtl.Edtl.Abbr");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEdtl.g:140:3: ( (lv_macroses_3_0= ruleMacros ) )
            	    {
            	    // InternalEdtl.g:140:3: ( (lv_macroses_3_0= ruleMacros ) )
            	    // InternalEdtl.g:141:4: (lv_macroses_3_0= ruleMacros )
            	    {
            	    // InternalEdtl.g:141:4: (lv_macroses_3_0= ruleMacros )
            	    // InternalEdtl.g:142:5: lv_macroses_3_0= ruleMacros
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMacrosesMacrosParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_macroses_3_0=ruleMacros();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"macroses",
            	    						lv_macroses_3_0,
            	    						"su.nsk.iae.edtl.Edtl.Macros");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEdtl.g:160:3: ( (lv_reqs_4_0= ruleRequirement ) )
            	    {
            	    // InternalEdtl.g:160:3: ( (lv_reqs_4_0= ruleRequirement ) )
            	    // InternalEdtl.g:161:4: (lv_reqs_4_0= ruleRequirement )
            	    {
            	    // InternalEdtl.g:161:4: (lv_reqs_4_0= ruleRequirement )
            	    // InternalEdtl.g:162:5: lv_reqs_4_0= ruleRequirement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getReqsRequirementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_reqs_4_0=ruleRequirement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reqs",
            	    						lv_reqs_4_0,
            	    						"su.nsk.iae.edtl.Edtl.Requirement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


    // $ANTLR start "entryRuleVariableType"
    // InternalEdtl.g:183:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalEdtl.g:183:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalEdtl.g:184:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalEdtl.g:190:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:196:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalEdtl.g:197:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalEdtl.g:197:2: (kw= 'BOOL' | kw= 'INT' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEdtl.g:198:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:204:3: kw= 'INT'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTKeyword_1());
                    		

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalEdtl.g:213:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalEdtl.g:213:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalEdtl.g:214:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarInput=ruleDeclVarInput();

            state._fsp--;

             current =iv_ruleDeclVarInput; 
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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalEdtl.g:220:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_inputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:226:2: ( ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:227:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:227:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:228:3: () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:228:3: ()
            // InternalEdtl.g:229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalEdtl.g:239:3: (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdtl.g:240:4: otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarInputAccess().getINPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarInputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:248:4: ( (lv_inputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:249:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:249:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:250:6: lv_inputCounter_4_0= RULE_INTEGER
                    {
                    lv_inputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_inputCounter_4_0, grammarAccess.getDeclVarInputAccess().getInputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"inputCounter",
                    							lv_inputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:271:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEdtl.g:272:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:272:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:273:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:273:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:274:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalEdtl.g:304:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalEdtl.g:304:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalEdtl.g:305:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarOutput=ruleDeclVarOutput();

            state._fsp--;

             current =iv_ruleDeclVarOutput; 
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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalEdtl.g:311:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_outputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:317:2: ( ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:318:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:318:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:319:3: () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:319:3: ()
            // InternalEdtl.g:320:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalEdtl.g:330:3: (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEdtl.g:331:4: otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarOutputAccess().getOUTPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarOutputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:339:4: ( (lv_outputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:340:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:340:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:341:6: lv_outputCounter_4_0= RULE_INTEGER
                    {
                    lv_outputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_outputCounter_4_0, grammarAccess.getDeclVarOutputAccess().getOutputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"outputCounter",
                    							lv_outputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:362:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEdtl.g:363:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:363:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:364:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:364:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:365:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,24,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalEdtl.g:395:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalEdtl.g:395:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalEdtl.g:396:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalEdtl.g:402:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        EObject lv_v_0_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:408:2: ( ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) )
            // InternalEdtl.g:409:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            {
            // InternalEdtl.g:409:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            // InternalEdtl.g:410:3: ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) )
            {
            // InternalEdtl.g:410:3: ( (lv_v_0_0= ruleVariable ) )
            // InternalEdtl.g:411:4: (lv_v_0_0= ruleVariable )
            {
            // InternalEdtl.g:411:4: (lv_v_0_0= ruleVariable )
            // InternalEdtl.g:412:5: lv_v_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_v_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"v",
            						lv_v_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:429:3: (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEdtl.g:430:4: otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getATKeyword_1_0());
                    			
                    // InternalEdtl.g:434:4: ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    // InternalEdtl.g:435:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    {
                    // InternalEdtl.g:435:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    // InternalEdtl.g:436:6: lv_location_2_0= RULE_DIRECT_VARIABLE
                    {
                    lv_location_2_0=(Token)match(input,RULE_DIRECT_VARIABLE,FOLLOW_12); 

                    						newLeafNode(lv_location_2_0, grammarAccess.getVarDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_0,
                    							"su.nsk.iae.edtl.Edtl.DIRECT_VARIABLE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getColonKeyword_2());
            		
            // InternalEdtl.g:457:3: ( (lv_type_4_0= ruleVariableType ) )
            // InternalEdtl.g:458:4: (lv_type_4_0= ruleVariableType )
            {
            // InternalEdtl.g:458:4: (lv_type_4_0= ruleVariableType )
            // InternalEdtl.g:459:5: lv_type_4_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"su.nsk.iae.edtl.Edtl.VariableType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleAbbr"
    // InternalEdtl.g:480:1: entryRuleAbbr returns [EObject current=null] : iv_ruleAbbr= ruleAbbr EOF ;
    public final EObject entryRuleAbbr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbr = null;


        try {
            // InternalEdtl.g:480:45: (iv_ruleAbbr= ruleAbbr EOF )
            // InternalEdtl.g:481:2: iv_ruleAbbr= ruleAbbr EOF
            {
             newCompositeNode(grammarAccess.getAbbrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbbr=ruleAbbr();

            state._fsp--;

             current =iv_ruleAbbr; 
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
    // $ANTLR end "entryRuleAbbr"


    // $ANTLR start "ruleAbbr"
    // InternalEdtl.g:487:1: ruleAbbr returns [EObject current=null] : (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) ;
    public final EObject ruleAbbr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:493:2: ( (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) )
            // InternalEdtl.g:494:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            {
            // InternalEdtl.g:494:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            // InternalEdtl.g:495:3: otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAbbrAccess().getABBRKeyword_0());
            		
            // InternalEdtl.g:499:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:500:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:500:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:501:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbbrAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbbrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:517:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEdtl.g:518:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEdtl.g:518:4: (lv_expr_2_0= ruleExpression )
            // InternalEdtl.g:519:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAbbrAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbbrRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAbbrAccess().getEND_ABBRKeyword_3());
            		

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
    // $ANTLR end "ruleAbbr"


    // $ANTLR start "entryRuleMacros"
    // InternalEdtl.g:544:1: entryRuleMacros returns [EObject current=null] : iv_ruleMacros= ruleMacros EOF ;
    public final EObject entryRuleMacros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacros = null;


        try {
            // InternalEdtl.g:544:47: (iv_ruleMacros= ruleMacros EOF )
            // InternalEdtl.g:545:2: iv_ruleMacros= ruleMacros EOF
            {
             newCompositeNode(grammarAccess.getMacrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacros=ruleMacros();

            state._fsp--;

             current =iv_ruleMacros; 
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
    // $ANTLR end "entryRuleMacros"


    // $ANTLR start "ruleMacros"
    // InternalEdtl.g:551:1: ruleMacros returns [EObject current=null] : (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) ;
    public final EObject ruleMacros() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:557:2: ( (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) )
            // InternalEdtl.g:558:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            {
            // InternalEdtl.g:558:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            // InternalEdtl.g:559:3: otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMacrosAccess().getMACROSKeyword_0());
            		
            // InternalEdtl.g:563:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:564:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:564:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:565:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMacrosAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacrosRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMacrosAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEdtl.g:585:3: ( (lv_args_3_0= ruleVarList ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEdtl.g:586:4: (lv_args_3_0= ruleVarList )
                    {
                    // InternalEdtl.g:586:4: (lv_args_3_0= ruleVarList )
                    // InternalEdtl.g:587:5: lv_args_3_0= ruleVarList
                    {

                    					newCompositeNode(grammarAccess.getMacrosAccess().getArgsVarListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_args_3_0=ruleVarList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMacrosRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_3_0,
                    						"su.nsk.iae.edtl.Edtl.VarList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMacrosAccess().getRightParenthesisKeyword_4());
            		
            // InternalEdtl.g:608:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalEdtl.g:609:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalEdtl.g:609:4: (lv_expr_5_0= ruleExpression )
            // InternalEdtl.g:610:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMacrosAccess().getExprExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacrosRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMacrosAccess().getEND_MACROSKeyword_6());
            		

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
    // $ANTLR end "ruleMacros"


    // $ANTLR start "entryRuleVarList"
    // InternalEdtl.g:635:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalEdtl.g:635:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalEdtl.g:636:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
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
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalEdtl.g:642:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:648:2: ( ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) )
            // InternalEdtl.g:649:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            {
            // InternalEdtl.g:649:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            // InternalEdtl.g:650:3: ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            {
            // InternalEdtl.g:650:3: ( (lv_vars_0_0= ruleVariable ) )
            // InternalEdtl.g:651:4: (lv_vars_0_0= ruleVariable )
            {
            // InternalEdtl.g:651:4: (lv_vars_0_0= ruleVariable )
            // InternalEdtl.g:652:5: lv_vars_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_vars_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:669:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==36) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEdtl.g:670:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:674:4: ( (lv_vars_2_0= ruleVariable ) )
            	    // InternalEdtl.g:675:5: (lv_vars_2_0= ruleVariable )
            	    {
            	    // InternalEdtl.g:675:5: (lv_vars_2_0= ruleVariable )
            	    // InternalEdtl.g:676:6: lv_vars_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_vars_2_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.edtl.Edtl.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleRequirement"
    // InternalEdtl.g:698:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalEdtl.g:698:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalEdtl.g:699:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalEdtl.g:705:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )? (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )? (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )? (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )? (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )? (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )? otherlv_56= 'END_REQ' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_nlTrig_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_DECL_SYMB_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_nlInv_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token this_DECL_SYMB_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_nlFinal_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token this_DECL_SYMB_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_nlDelay_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token this_DECL_SYMB_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token lv_nlReac_44_0=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token this_DECL_SYMB_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token lv_nlRel_53_0=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        EObject lv_trigExpr_4_0 = null;

        EObject lv_invExpr_13_0 = null;

        EObject lv_finalExpr_22_0 = null;

        EObject lv_delayExpr_31_0 = null;

        EObject lv_reacExpr_40_0 = null;

        EObject lv_relExpr_49_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:711:2: ( (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )? (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )? (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )? (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )? (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )? (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )? otherlv_56= 'END_REQ' ) )
            // InternalEdtl.g:712:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )? (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )? (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )? (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )? (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )? (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )? otherlv_56= 'END_REQ' )
            {
            // InternalEdtl.g:712:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )? (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )? (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )? (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )? (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )? (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )? otherlv_56= 'END_REQ' )
            // InternalEdtl.g:713:3: otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )? (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )? (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )? (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )? (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )? (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )? otherlv_56= 'END_REQ'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getREQKeyword_0());
            		
            // InternalEdtl.g:717:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:718:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:718:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:719:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:735:3: (otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEdtl.g:736:4: otherlv_2= 'TRIGGER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_trigExpr_4_0= ruleExpression ) ) otherlv_5= ';' (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )?
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getTRIGGERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:744:4: ( (lv_trigExpr_4_0= ruleExpression ) )
                    // InternalEdtl.g:745:5: (lv_trigExpr_4_0= ruleExpression )
                    {
                    // InternalEdtl.g:745:5: (lv_trigExpr_4_0= ruleExpression )
                    // InternalEdtl.g:746:6: lv_trigExpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTrigExprExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_trigExpr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"trigExpr",
                    							lv_trigExpr_4_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_3());
                    			
                    // InternalEdtl.g:767:4: (otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==39) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalEdtl.g:768:5: otherlv_6= 'NL:' otherlv_7= '\"' ( (lv_nlTrig_8_0= RULE_ID ) ) otherlv_9= '\"' otherlv_10= ';'
                            {
                            otherlv_6=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getNLKeyword_2_4_0());
                            				
                            otherlv_7=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_2_4_1());
                            				
                            // InternalEdtl.g:776:5: ( (lv_nlTrig_8_0= RULE_ID ) )
                            // InternalEdtl.g:777:6: (lv_nlTrig_8_0= RULE_ID )
                            {
                            // InternalEdtl.g:777:6: (lv_nlTrig_8_0= RULE_ID )
                            // InternalEdtl.g:778:7: lv_nlTrig_8_0= RULE_ID
                            {
                            lv_nlTrig_8_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlTrig_8_0, grammarAccess.getRequirementAccess().getNlTrigIDTerminalRuleCall_2_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlTrig",
                            								lv_nlTrig_8_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_2_4_3());
                            				
                            otherlv_10=(Token)match(input,24,FOLLOW_25); 

                            					newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:804:3: (otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEdtl.g:805:4: otherlv_11= 'INVARIANT' this_DECL_SYMB_12= RULE_DECL_SYMB ( (lv_invExpr_13_0= ruleExpression ) ) otherlv_14= ';' (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )?
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getINVARIANTKeyword_3_0());
                    			
                    this_DECL_SYMB_12=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_12, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_3_1());
                    			
                    // InternalEdtl.g:813:4: ( (lv_invExpr_13_0= ruleExpression ) )
                    // InternalEdtl.g:814:5: (lv_invExpr_13_0= ruleExpression )
                    {
                    // InternalEdtl.g:814:5: (lv_invExpr_13_0= ruleExpression )
                    // InternalEdtl.g:815:6: lv_invExpr_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getInvExprExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_invExpr_13_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"invExpr",
                    							lv_invExpr_13_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,24,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getSemicolonKeyword_3_3());
                    			
                    // InternalEdtl.g:836:4: (otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==39) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEdtl.g:837:5: otherlv_15= 'NL:' otherlv_16= '\"' ( (lv_nlInv_17_0= RULE_ID ) ) otherlv_18= '\"' otherlv_19= ';'
                            {
                            otherlv_15=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getNLKeyword_3_4_0());
                            				
                            otherlv_16=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_3_4_1());
                            				
                            // InternalEdtl.g:845:5: ( (lv_nlInv_17_0= RULE_ID ) )
                            // InternalEdtl.g:846:6: (lv_nlInv_17_0= RULE_ID )
                            {
                            // InternalEdtl.g:846:6: (lv_nlInv_17_0= RULE_ID )
                            // InternalEdtl.g:847:7: lv_nlInv_17_0= RULE_ID
                            {
                            lv_nlInv_17_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlInv_17_0, grammarAccess.getRequirementAccess().getNlInvIDTerminalRuleCall_3_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlInv",
                            								lv_nlInv_17_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_18=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_3_4_3());
                            				
                            otherlv_19=(Token)match(input,24,FOLLOW_27); 

                            					newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getSemicolonKeyword_3_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:873:3: (otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )? )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdtl.g:874:4: otherlv_20= 'FINAL' this_DECL_SYMB_21= RULE_DECL_SYMB ( (lv_finalExpr_22_0= ruleExpression ) ) otherlv_23= ';' (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )?
                    {
                    otherlv_20=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getFINALKeyword_4_0());
                    			
                    this_DECL_SYMB_21=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_21, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_4_1());
                    			
                    // InternalEdtl.g:882:4: ( (lv_finalExpr_22_0= ruleExpression ) )
                    // InternalEdtl.g:883:5: (lv_finalExpr_22_0= ruleExpression )
                    {
                    // InternalEdtl.g:883:5: (lv_finalExpr_22_0= ruleExpression )
                    // InternalEdtl.g:884:6: lv_finalExpr_22_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getFinalExprExpressionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_finalExpr_22_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"finalExpr",
                    							lv_finalExpr_22_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getSemicolonKeyword_4_3());
                    			
                    // InternalEdtl.g:905:4: (otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==39) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalEdtl.g:906:5: otherlv_24= 'NL:' otherlv_25= '\"' ( (lv_nlFinal_26_0= RULE_ID ) ) otherlv_27= '\"' otherlv_28= ';'
                            {
                            otherlv_24=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getNLKeyword_4_4_0());
                            				
                            otherlv_25=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_4_4_1());
                            				
                            // InternalEdtl.g:914:5: ( (lv_nlFinal_26_0= RULE_ID ) )
                            // InternalEdtl.g:915:6: (lv_nlFinal_26_0= RULE_ID )
                            {
                            // InternalEdtl.g:915:6: (lv_nlFinal_26_0= RULE_ID )
                            // InternalEdtl.g:916:7: lv_nlFinal_26_0= RULE_ID
                            {
                            lv_nlFinal_26_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlFinal_26_0, grammarAccess.getRequirementAccess().getNlFinalIDTerminalRuleCall_4_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlFinal",
                            								lv_nlFinal_26_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_27=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_4_4_3());
                            				
                            otherlv_28=(Token)match(input,24,FOLLOW_29); 

                            					newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getSemicolonKeyword_4_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:942:3: (otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEdtl.g:943:4: otherlv_29= 'DELAY' this_DECL_SYMB_30= RULE_DECL_SYMB ( (lv_delayExpr_31_0= ruleExpression ) ) otherlv_32= ';' (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )?
                    {
                    otherlv_29=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getDELAYKeyword_5_0());
                    			
                    this_DECL_SYMB_30=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_30, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_5_1());
                    			
                    // InternalEdtl.g:951:4: ( (lv_delayExpr_31_0= ruleExpression ) )
                    // InternalEdtl.g:952:5: (lv_delayExpr_31_0= ruleExpression )
                    {
                    // InternalEdtl.g:952:5: (lv_delayExpr_31_0= ruleExpression )
                    // InternalEdtl.g:953:6: lv_delayExpr_31_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDelayExprExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_delayExpr_31_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"delayExpr",
                    							lv_delayExpr_31_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_32=(Token)match(input,24,FOLLOW_30); 

                    				newLeafNode(otherlv_32, grammarAccess.getRequirementAccess().getSemicolonKeyword_5_3());
                    			
                    // InternalEdtl.g:974:4: (otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==39) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEdtl.g:975:5: otherlv_33= 'NL:' otherlv_34= '\"' ( (lv_nlDelay_35_0= RULE_ID ) ) otherlv_36= '\"' otherlv_37= ';'
                            {
                            otherlv_33=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getNLKeyword_5_4_0());
                            				
                            otherlv_34=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_34, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_5_4_1());
                            				
                            // InternalEdtl.g:983:5: ( (lv_nlDelay_35_0= RULE_ID ) )
                            // InternalEdtl.g:984:6: (lv_nlDelay_35_0= RULE_ID )
                            {
                            // InternalEdtl.g:984:6: (lv_nlDelay_35_0= RULE_ID )
                            // InternalEdtl.g:985:7: lv_nlDelay_35_0= RULE_ID
                            {
                            lv_nlDelay_35_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlDelay_35_0, grammarAccess.getRequirementAccess().getNlDelayIDTerminalRuleCall_5_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlDelay",
                            								lv_nlDelay_35_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_36=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_36, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_5_4_3());
                            				
                            otherlv_37=(Token)match(input,24,FOLLOW_31); 

                            					newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getSemicolonKeyword_5_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1011:3: (otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEdtl.g:1012:4: otherlv_38= 'REACTION' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_reacExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )?
                    {
                    otherlv_38=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_38, grammarAccess.getRequirementAccess().getREACTIONKeyword_6_0());
                    			
                    this_DECL_SYMB_39=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_39, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_6_1());
                    			
                    // InternalEdtl.g:1020:4: ( (lv_reacExpr_40_0= ruleExpression ) )
                    // InternalEdtl.g:1021:5: (lv_reacExpr_40_0= ruleExpression )
                    {
                    // InternalEdtl.g:1021:5: (lv_reacExpr_40_0= ruleExpression )
                    // InternalEdtl.g:1022:6: lv_reacExpr_40_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getReacExprExpressionParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_reacExpr_40_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"reacExpr",
                    							lv_reacExpr_40_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_41=(Token)match(input,24,FOLLOW_32); 

                    				newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getSemicolonKeyword_6_3());
                    			
                    // InternalEdtl.g:1043:4: (otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==39) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEdtl.g:1044:5: otherlv_42= 'NL:' otherlv_43= '\"' ( (lv_nlReac_44_0= RULE_ID ) ) otherlv_45= '\"' otherlv_46= ';'
                            {
                            otherlv_42=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_42, grammarAccess.getRequirementAccess().getNLKeyword_6_4_0());
                            				
                            otherlv_43=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_6_4_1());
                            				
                            // InternalEdtl.g:1052:5: ( (lv_nlReac_44_0= RULE_ID ) )
                            // InternalEdtl.g:1053:6: (lv_nlReac_44_0= RULE_ID )
                            {
                            // InternalEdtl.g:1053:6: (lv_nlReac_44_0= RULE_ID )
                            // InternalEdtl.g:1054:7: lv_nlReac_44_0= RULE_ID
                            {
                            lv_nlReac_44_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlReac_44_0, grammarAccess.getRequirementAccess().getNlReacIDTerminalRuleCall_6_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlReac",
                            								lv_nlReac_44_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_45=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_45, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_6_4_3());
                            				
                            otherlv_46=(Token)match(input,24,FOLLOW_33); 

                            					newLeafNode(otherlv_46, grammarAccess.getRequirementAccess().getSemicolonKeyword_6_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalEdtl.g:1080:3: (otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )? )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEdtl.g:1081:4: otherlv_47= 'RELEASE' this_DECL_SYMB_48= RULE_DECL_SYMB ( (lv_relExpr_49_0= ruleExpression ) ) otherlv_50= ';' (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )?
                    {
                    otherlv_47=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_47, grammarAccess.getRequirementAccess().getRELEASEKeyword_7_0());
                    			
                    this_DECL_SYMB_48=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

                    				newLeafNode(this_DECL_SYMB_48, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_7_1());
                    			
                    // InternalEdtl.g:1089:4: ( (lv_relExpr_49_0= ruleExpression ) )
                    // InternalEdtl.g:1090:5: (lv_relExpr_49_0= ruleExpression )
                    {
                    // InternalEdtl.g:1090:5: (lv_relExpr_49_0= ruleExpression )
                    // InternalEdtl.g:1091:6: lv_relExpr_49_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getRelExprExpressionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_relExpr_49_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"relExpr",
                    							lv_relExpr_49_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_50=(Token)match(input,24,FOLLOW_34); 

                    				newLeafNode(otherlv_50, grammarAccess.getRequirementAccess().getSemicolonKeyword_7_3());
                    			
                    // InternalEdtl.g:1112:4: (otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==39) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalEdtl.g:1113:5: otherlv_51= 'NL:' otherlv_52= '\"' ( (lv_nlRel_53_0= RULE_ID ) ) otherlv_54= '\"' otherlv_55= ';'
                            {
                            otherlv_51=(Token)match(input,39,FOLLOW_24); 

                            					newLeafNode(otherlv_51, grammarAccess.getRequirementAccess().getNLKeyword_7_4_0());
                            				
                            otherlv_52=(Token)match(input,40,FOLLOW_14); 

                            					newLeafNode(otherlv_52, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_7_4_1());
                            				
                            // InternalEdtl.g:1121:5: ( (lv_nlRel_53_0= RULE_ID ) )
                            // InternalEdtl.g:1122:6: (lv_nlRel_53_0= RULE_ID )
                            {
                            // InternalEdtl.g:1122:6: (lv_nlRel_53_0= RULE_ID )
                            // InternalEdtl.g:1123:7: lv_nlRel_53_0= RULE_ID
                            {
                            lv_nlRel_53_0=(Token)match(input,RULE_ID,FOLLOW_24); 

                            							newLeafNode(lv_nlRel_53_0, grammarAccess.getRequirementAccess().getNlRelIDTerminalRuleCall_7_4_2_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRequirementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"nlRel",
                            								lv_nlRel_53_0,
                            								"su.nsk.iae.edtl.Edtl.ID");
                            						

                            }


                            }

                            otherlv_54=(Token)match(input,40,FOLLOW_7); 

                            					newLeafNode(otherlv_54, grammarAccess.getRequirementAccess().getQuotationMarkKeyword_7_4_3());
                            				
                            otherlv_55=(Token)match(input,24,FOLLOW_35); 

                            					newLeafNode(otherlv_55, grammarAccess.getRequirementAccess().getSemicolonKeyword_7_4_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_56=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_56, grammarAccess.getRequirementAccess().getEND_REQKeyword_8());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleVariable"
    // InternalEdtl.g:1157:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEdtl.g:1157:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEdtl.g:1158:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEdtl.g:1164:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1170:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEdtl.g:1171:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEdtl.g:1171:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEdtl.g:1172:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEdtl.g:1172:3: (lv_name_0_0= RULE_ID )
            // InternalEdtl.g:1173:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"su.nsk.iae.edtl.Edtl.ID");
            			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalEdtl.g:1192:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEdtl.g:1192:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEdtl.g:1193:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEdtl.g:1199:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1205:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalEdtl.g:1206:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalEdtl.g:1206:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalEdtl.g:1207:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1215:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_OR_OPERATOR) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEdtl.g:1216:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalEdtl.g:1216:4: ()
            	    // InternalEdtl.g:1217:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1223:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalEdtl.g:1224:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalEdtl.g:1224:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalEdtl.g:1225:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_15); 

            	    						newLeafNode(lv_orOp_2_0, grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"orOp",
            	    							lv_orOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.OR_OPERATOR");
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1241:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalEdtl.g:1242:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalEdtl.g:1242:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalEdtl.g:1243:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


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


    // $ANTLR start "entryRuleXorExpression"
    // InternalEdtl.g:1265:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalEdtl.g:1265:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalEdtl.g:1266:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalEdtl.g:1272:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1278:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1279:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1279:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1280:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1288:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==47) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEdtl.g:1289:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1289:4: ()
            	    // InternalEdtl.g:1290:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_15);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalEdtl.g:1303:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1304:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1304:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1305:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalEdtl.g:1327:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalEdtl.g:1327:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalEdtl.g:1328:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXOR_OPERATOR=ruleXOR_OPERATOR();

            state._fsp--;

             current =iv_ruleXOR_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalEdtl.g:1334:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1340:2: (kw= 'XOR' )
            // InternalEdtl.g:1341:2: kw= 'XOR'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXOR_OPERATORAccess().getXORKeyword());
            	

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
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalEdtl.g:1349:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEdtl.g:1349:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEdtl.g:1350:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalEdtl.g:1356:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1362:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalEdtl.g:1363:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalEdtl.g:1363:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalEdtl.g:1364:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_38);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1372:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }
                else if ( (LA24_0==49) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEdtl.g:1373:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalEdtl.g:1373:4: ()
            	    // InternalEdtl.g:1374:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1380:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalEdtl.g:1381:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalEdtl.g:1381:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalEdtl.g:1382:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_andOp_2_0=ruleAND_OPERATOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"andOp",
            	    							lv_andOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.AND_OPERATOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1399:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalEdtl.g:1400:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalEdtl.g:1400:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalEdtl.g:1401:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalEdtl.g:1423:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalEdtl.g:1423:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalEdtl.g:1424:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND_OPERATOR=ruleAND_OPERATOR();

            state._fsp--;

             current =iv_ruleAND_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalEdtl.g:1430:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'AND' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1436:2: ( (kw= '&&' | kw= 'AND' ) )
            // InternalEdtl.g:1437:2: (kw= '&&' | kw= 'AND' )
            {
            // InternalEdtl.g:1437:2: (kw= '&&' | kw= 'AND' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            else if ( (LA25_0==49) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEdtl.g:1438:3: kw= '&&'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1444:3: kw= 'AND'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getANDKeyword_1());
                    		

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
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalEdtl.g:1453:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalEdtl.g:1453:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalEdtl.g:1454:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalEdtl.g:1460:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1466:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1467:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1467:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1468:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_39);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1476:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case 60:
                    {
                    alt26=1;
                    }
                    break;
                case 61:
                    {
                    alt26=1;
                    }
                    break;
                case 62:
                    {
                    alt26=1;
                    }
                    break;
                case 63:
                    {
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // InternalEdtl.g:1477:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1477:4: ()
            	    // InternalEdtl.g:1478:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1484:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalEdtl.g:1485:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalEdtl.g:1485:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalEdtl.g:1486:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_compOp_2_0=ruleCompOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compOp",
            	    							lv_compOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.CompOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1503:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1504:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1504:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1505:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalEdtl.g:1527:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalEdtl.g:1527:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalEdtl.g:1528:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
             newCompositeNode(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;

             current =iv_ruleEquExpression; 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalEdtl.g:1534:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1540:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalEdtl.g:1541:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalEdtl.g:1541:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalEdtl.g:1542:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_40);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1550:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=58 && LA27_0<=59)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEdtl.g:1551:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalEdtl.g:1551:4: ()
            	    // InternalEdtl.g:1552:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1558:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalEdtl.g:1559:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalEdtl.g:1559:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalEdtl.g:1560:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_equOp_2_0=ruleEquOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"equOp",
            	    							lv_equOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.EquOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1577:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalEdtl.g:1578:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalEdtl.g:1578:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalEdtl.g:1579:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleUnExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.UnExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalEdtl.g:1601:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalEdtl.g:1601:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalEdtl.g:1602:2: iv_ruleUnOperator= ruleUnOperator EOF
            {
             newCompositeNode(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOperator=ruleUnOperator();

            state._fsp--;

             current =iv_ruleUnOperator.getText(); 
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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalEdtl.g:1608:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1614:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalEdtl.g:1615:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalEdtl.g:1615:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 54:
            case 55:
                {
                alt28=1;
                }
                break;
            case 50:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            case 52:
                {
                alt28=4;
                }
                break;
            case 53:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalEdtl.g:1616:3: this_NotOperator_0= ruleNotOperator
                    {

                    			newCompositeNode(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotOperator_0=ruleNotOperator();

                    state._fsp--;


                    			current.merge(this_NotOperator_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1627:3: kw= 'FE'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1633:3: kw= 'RE'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1639:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1645:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getLOWKeyword_4());
                    		

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
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalEdtl.g:1654:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalEdtl.g:1654:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalEdtl.g:1655:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
             newCompositeNode(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;

             current =iv_ruleNotOperator.getText(); 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalEdtl.g:1661:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1667:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalEdtl.g:1668:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalEdtl.g:1668:2: (kw= 'NOT' | kw= '!' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            else if ( (LA29_0==55) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEdtl.g:1669:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1675:3: kw= '!'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1());
                    		

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalEdtl.g:1684:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalEdtl.g:1684:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalEdtl.g:1685:2: iv_ruleUnExpression= ruleUnExpression EOF
            {
             newCompositeNode(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnExpression=ruleUnExpression();

            state._fsp--;

             current =iv_ruleUnExpression; 
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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalEdtl.g:1691:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1697:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalEdtl.g:1698:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalEdtl.g:1698:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INTEGER||LA30_0==RULE_ID||LA30_0==33||LA30_0==56) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=50 && LA30_0<=55)) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEdtl.g:1699:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1708:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalEdtl.g:1708:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalEdtl.g:1709:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalEdtl.g:1709:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalEdtl.g:1710:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalEdtl.g:1710:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalEdtl.g:1711:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_unOp_1_0=ruleUnOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"unOp",
                    							lv_unOp_1_0,
                    							"su.nsk.iae.edtl.Edtl.UnOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdtl.g:1728:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalEdtl.g:1729:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalEdtl.g:1729:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalEdtl.g:1730:6: lv_right_2_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.edtl.Edtl.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalEdtl.g:1752:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalEdtl.g:1752:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalEdtl.g:1753:2: iv_ruleTauExpression= ruleTauExpression EOF
            {
             newCompositeNode(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTauExpression=ruleTauExpression();

            state._fsp--;

             current =iv_ruleTauExpression; 
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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalEdtl.g:1759:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1765:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalEdtl.g:1766:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalEdtl.g:1766:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalEdtl.g:1767:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEdtl.g:1775:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalEdtl.g:1776:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalEdtl.g:1776:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalEdtl.g:1777:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_time_2_0=ruleTimeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTauExpressionRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"su.nsk.iae.edtl.Edtl.TimeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalEdtl.g:1802:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEdtl.g:1802:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEdtl.g:1803:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;

             current =iv_ruleTimeLiteral; 
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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalEdtl.g:1809:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1815:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalEdtl.g:1816:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalEdtl.g:1816:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalEdtl.g:1817:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_43);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1824:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalEdtl.g:1825:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalEdtl.g:1825:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalEdtl.g:1826:5: lv_interval_1_0= RULE_INTERVAL
            {
            lv_interval_1_0=(Token)match(input,RULE_INTERVAL,FOLLOW_2); 

            					newLeafNode(lv_interval_1_0, grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"su.nsk.iae.edtl.Edtl.INTERVAL");
            				

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
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalEdtl.g:1846:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalEdtl.g:1846:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalEdtl.g:1847:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME_PREF_LITERAL=ruleTIME_PREF_LITERAL();

            state._fsp--;

             current =iv_ruleTIME_PREF_LITERAL.getText(); 
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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalEdtl.g:1853:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#T' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1859:2: (kw= '#T' )
            // InternalEdtl.g:1860:2: kw= '#T'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword());
            	

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
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalEdtl.g:1868:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalEdtl.g:1868:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalEdtl.g:1869:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalEdtl.g:1875:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_tau_1_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_nestExpr_8_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1881:2: ( ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalEdtl.g:1882:2: ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalEdtl.g:1882:2: ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt32=1;
                }
                break;
            case 56:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==33) ) {
                    alt32=4;
                }
                else if ( (LA32_3==EOF||LA32_3==RULE_OR_OPERATOR||LA32_3==24||LA32_3==31||(LA32_3>=34 && LA32_3<=35)||(LA32_3>=47 && LA32_3<=49)||(LA32_3>=58 && LA32_3<=63)) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalEdtl.g:1883:3: ( (lv_const_0_0= RULE_INTEGER ) )
                    {
                    // InternalEdtl.g:1883:3: ( (lv_const_0_0= RULE_INTEGER ) )
                    // InternalEdtl.g:1884:4: (lv_const_0_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:1884:4: (lv_const_0_0= RULE_INTEGER )
                    // InternalEdtl.g:1885:5: lv_const_0_0= RULE_INTEGER
                    {
                    lv_const_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    					newLeafNode(lv_const_0_0, grammarAccess.getPrimaryExpressionAccess().getConstINTEGERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"const",
                    						lv_const_0_0,
                    						"su.nsk.iae.edtl.Edtl.INTEGER");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1902:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    {
                    // InternalEdtl.g:1902:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    // InternalEdtl.g:1903:4: (lv_tau_1_0= ruleTauExpression )
                    {
                    // InternalEdtl.g:1903:4: (lv_tau_1_0= ruleTauExpression )
                    // InternalEdtl.g:1904:5: lv_tau_1_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_1_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_1_0,
                    						"su.nsk.iae.edtl.Edtl.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1922:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEdtl.g:1922:3: ( (otherlv_2= RULE_ID ) )
                    // InternalEdtl.g:1923:4: (otherlv_2= RULE_ID )
                    {
                    // InternalEdtl.g:1923:4: (otherlv_2= RULE_ID )
                    // InternalEdtl.g:1924:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getVCrossVarAbbrCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1936:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    {
                    // InternalEdtl.g:1936:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    // InternalEdtl.g:1937:4: ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')'
                    {
                    // InternalEdtl.g:1937:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEdtl.g:1938:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEdtl.g:1938:5: (otherlv_3= RULE_ID )
                    // InternalEdtl.g:1939:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getMacrosMacrosCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalEdtl.g:1954:4: ( (lv_args_5_0= ruleParamAssignmentElements ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_ID) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEdtl.g:1955:5: (lv_args_5_0= ruleParamAssignmentElements )
                            {
                            // InternalEdtl.g:1955:5: (lv_args_5_0= ruleParamAssignmentElements )
                            // InternalEdtl.g:1956:6: lv_args_5_0= ruleParamAssignmentElements
                            {

                            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsParamAssignmentElementsParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_19);
                            lv_args_5_0=ruleParamAssignmentElements();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            						}
                            						set(
                            							current,
                            							"args",
                            							lv_args_5_0,
                            							"su.nsk.iae.edtl.Edtl.ParamAssignmentElements");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1979:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalEdtl.g:1979:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalEdtl.g:1980:4: otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalEdtl.g:1984:4: ( (lv_nestExpr_8_0= ruleExpression ) )
                    // InternalEdtl.g:1985:5: (lv_nestExpr_8_0= ruleExpression )
                    {
                    // InternalEdtl.g:1985:5: (lv_nestExpr_8_0= ruleExpression )
                    // InternalEdtl.g:1986:6: lv_nestExpr_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_nestExpr_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"nestExpr",
                    							lv_nestExpr_8_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,34,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleParamAssignmentElements"
    // InternalEdtl.g:2012:1: entryRuleParamAssignmentElements returns [EObject current=null] : iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF ;
    public final EObject entryRuleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignmentElements = null;


        try {
            // InternalEdtl.g:2012:64: (iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF )
            // InternalEdtl.g:2013:2: iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF
            {
             newCompositeNode(grammarAccess.getParamAssignmentElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamAssignmentElements=ruleParamAssignmentElements();

            state._fsp--;

             current =iv_ruleParamAssignmentElements; 
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
    // $ANTLR end "entryRuleParamAssignmentElements"


    // $ANTLR start "ruleParamAssignmentElements"
    // InternalEdtl.g:2019:1: ruleParamAssignmentElements returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:2025:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalEdtl.g:2026:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalEdtl.g:2026:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalEdtl.g:2027:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalEdtl.g:2027:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:2028:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:2028:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:2029:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_0, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_0_0());
            				

            }


            }

            // InternalEdtl.g:2040:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEdtl.g:2041:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamAssignmentElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:2045:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalEdtl.g:2046:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalEdtl.g:2046:5: (otherlv_2= RULE_ID )
            	    // InternalEdtl.g:2047:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // $ANTLR end "ruleParamAssignmentElements"


    // $ANTLR start "ruleEquOperator"
    // InternalEdtl.g:2063:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:2069:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalEdtl.g:2070:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalEdtl.g:2070:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            else if ( (LA34_0==59) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalEdtl.g:2071:3: (enumLiteral_0= '==' )
                    {
                    // InternalEdtl.g:2071:3: (enumLiteral_0= '==' )
                    // InternalEdtl.g:2072:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2079:3: (enumLiteral_1= '<>' )
                    {
                    // InternalEdtl.g:2079:3: (enumLiteral_1= '<>' )
                    // InternalEdtl.g:2080:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalEdtl.g:2090:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEdtl.g:2096:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalEdtl.g:2097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalEdtl.g:2097:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt35=1;
                }
                break;
            case 61:
                {
                alt35=2;
                }
                break;
            case 62:
                {
                alt35=3;
                }
                break;
            case 63:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEdtl.g:2098:3: (enumLiteral_0= '<' )
                    {
                    // InternalEdtl.g:2098:3: (enumLiteral_0= '<' )
                    // InternalEdtl.g:2099:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2106:3: (enumLiteral_1= '>' )
                    {
                    // InternalEdtl.g:2106:3: (enumLiteral_1= '>' )
                    // InternalEdtl.g:2107:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:2114:3: (enumLiteral_2= '<=' )
                    {
                    // InternalEdtl.g:2114:3: (enumLiteral_2= '<=' )
                    // InternalEdtl.g:2115:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:2122:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEdtl.g:2122:3: (enumLiteral_3= '>=' )
                    // InternalEdtl.g:2123:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleCompOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000002144400002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002800080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000A000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x01FC0002000000A0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00007E4000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00007E8000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00007C8000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000788000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000708000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000608000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x01000002000000A0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000200L});

}