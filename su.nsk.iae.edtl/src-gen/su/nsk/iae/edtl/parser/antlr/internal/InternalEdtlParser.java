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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECL_SYMB", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_INTEGER", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'BOOL'", "'INT'", "'VAR_INPUT'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "':'", "'ABBR'", "'END_ABBR'", "'MACROS'", "'('", "')'", "'END_MACROS'", "','", "'REQ'", "'END_REQ'", "'TRIGGER'", "'INV'", "'FINAL'", "'DELAY'", "'REACTION'", "'RELEASE'", "'XOR'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'#T'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=7;
    public static final int RULE_DECL_SYMB=5;
    public static final int T__19=19;
    public static final int RULE_BIT=11;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_OR_OPERATOR=6;
    public static final int RULE_SL_COMMENT=15;
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
    public static final int RULE_WS=16;
    public static final int RULE_LETTER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=13;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=8;
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
    // InternalEdtl.g:72:1: ruleModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:78:2: ( ( () ( (lv_elements_1_0= ruleStatement ) )* ) )
            // InternalEdtl.g:79:2: ( () ( (lv_elements_1_0= ruleStatement ) )* )
            {
            // InternalEdtl.g:79:2: ( () ( (lv_elements_1_0= ruleStatement ) )* )
            // InternalEdtl.g:80:3: () ( (lv_elements_1_0= ruleStatement ) )*
            {
            // InternalEdtl.g:80:3: ()
            // InternalEdtl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getWAction_0(),
            					current);
            			

            }

            // InternalEdtl.g:87:3: ( (lv_elements_1_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==22||LA1_0==24||LA1_0==26||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEdtl.g:88:4: (lv_elements_1_0= ruleStatement )
            	    {
            	    // InternalEdtl.g:88:4: (lv_elements_1_0= ruleStatement )
            	    // InternalEdtl.g:89:5: lv_elements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getElementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_1_0,
            	    						"su.nsk.iae.edtl.Edtl.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatement"
    // InternalEdtl.g:110:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEdtl.g:110:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEdtl.g:111:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEdtl.g:117:1: ruleStatement returns [EObject current=null] : (this_DeclVarInput_0= ruleDeclVarInput | this_DeclVarOutput_1= ruleDeclVarOutput | this_Abbr_2= ruleAbbr | this_Macros_3= ruleMacros | this_Requirement_4= ruleRequirement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_DeclVarInput_0 = null;

        EObject this_DeclVarOutput_1 = null;

        EObject this_Abbr_2 = null;

        EObject this_Macros_3 = null;

        EObject this_Requirement_4 = null;



        	enterRule();

        try {
            // InternalEdtl.g:123:2: ( (this_DeclVarInput_0= ruleDeclVarInput | this_DeclVarOutput_1= ruleDeclVarOutput | this_Abbr_2= ruleAbbr | this_Macros_3= ruleMacros | this_Requirement_4= ruleRequirement ) )
            // InternalEdtl.g:124:2: (this_DeclVarInput_0= ruleDeclVarInput | this_DeclVarOutput_1= ruleDeclVarOutput | this_Abbr_2= ruleAbbr | this_Macros_3= ruleMacros | this_Requirement_4= ruleRequirement )
            {
            // InternalEdtl.g:124:2: (this_DeclVarInput_0= ruleDeclVarInput | this_DeclVarOutput_1= ruleDeclVarOutput | this_Abbr_2= ruleAbbr | this_Macros_3= ruleMacros | this_Requirement_4= ruleRequirement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 31:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEdtl.g:125:3: this_DeclVarInput_0= ruleDeclVarInput
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeclVarInputParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclVarInput_0=ruleDeclVarInput();

                    state._fsp--;


                    			current = this_DeclVarInput_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:134:3: this_DeclVarOutput_1= ruleDeclVarOutput
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getDeclVarOutputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclVarOutput_1=ruleDeclVarOutput();

                    state._fsp--;


                    			current = this_DeclVarOutput_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:143:3: this_Abbr_2= ruleAbbr
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAbbrParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Abbr_2=ruleAbbr();

                    state._fsp--;


                    			current = this_Abbr_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:152:3: this_Macros_3= ruleMacros
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMacrosParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Macros_3=ruleMacros();

                    state._fsp--;


                    			current = this_Macros_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:161:3: this_Requirement_4= ruleRequirement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getRequirementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Requirement_4=ruleRequirement();

                    state._fsp--;


                    			current = this_Requirement_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableTypeName"
    // InternalEdtl.g:173:1: entryRuleVariableTypeName returns [String current=null] : iv_ruleVariableTypeName= ruleVariableTypeName EOF ;
    public final String entryRuleVariableTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableTypeName = null;


        try {
            // InternalEdtl.g:173:56: (iv_ruleVariableTypeName= ruleVariableTypeName EOF )
            // InternalEdtl.g:174:2: iv_ruleVariableTypeName= ruleVariableTypeName EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableTypeName=ruleVariableTypeName();

            state._fsp--;

             current =iv_ruleVariableTypeName.getText(); 
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
    // $ANTLR end "entryRuleVariableTypeName"


    // $ANTLR start "ruleVariableTypeName"
    // InternalEdtl.g:180:1: ruleVariableTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:186:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalEdtl.g:187:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalEdtl.g:187:2: (kw= 'BOOL' | kw= 'INT' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEdtl.g:188:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeNameAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:194:3: kw= 'INT'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeNameAccess().getINTKeyword_1());
                    		

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
    // $ANTLR end "ruleVariableTypeName"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalEdtl.g:203:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalEdtl.g:203:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalEdtl.g:204:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
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
    // InternalEdtl.g:210:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:216:2: ( ( () otherlv_1= 'VAR_INPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) )
            // InternalEdtl.g:217:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            {
            // InternalEdtl.g:217:2: ( () otherlv_1= 'VAR_INPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            // InternalEdtl.g:218:3: () otherlv_1= 'VAR_INPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR'
            {
            // InternalEdtl.g:218:3: ()
            // InternalEdtl.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalEdtl.g:229:3: ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEdtl.g:230:4: ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalEdtl.g:230:4: ( (lv_value_2_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:231:5: (lv_value_2_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:231:5: (lv_value_2_0= ruleVarDeclaration )
            	    // InternalEdtl.g:232:6: lv_value_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getValueVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_value_2_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_2_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_3());
            		

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
    // InternalEdtl.g:262:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalEdtl.g:262:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalEdtl.g:263:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
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
    // InternalEdtl.g:269:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:275:2: ( ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' ) )
            // InternalEdtl.g:276:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            {
            // InternalEdtl.g:276:2: ( () otherlv_1= 'VAR_OUTPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR' )
            // InternalEdtl.g:277:3: () otherlv_1= 'VAR_OUTPUT' ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )* otherlv_4= 'END_VAR'
            {
            // InternalEdtl.g:277:3: ()
            // InternalEdtl.g:278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalEdtl.g:288:3: ( ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEdtl.g:289:4: ( (lv_value_2_0= ruleVarDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalEdtl.g:289:4: ( (lv_value_2_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:290:5: (lv_value_2_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:290:5: (lv_value_2_0= ruleVarDeclaration )
            	    // InternalEdtl.g:291:6: lv_value_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getValueVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_value_2_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_2_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,20,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_3());
            		

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
    // InternalEdtl.g:321:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalEdtl.g:321:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalEdtl.g:322:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
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
    // InternalEdtl.g:328:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableTypeName ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:334:2: ( ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableTypeName ) ) ) )
            // InternalEdtl.g:335:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableTypeName ) ) )
            {
            // InternalEdtl.g:335:2: ( ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableTypeName ) ) )
            // InternalEdtl.g:336:3: ( (lv_var_0_0= ruleVariable ) ) otherlv_1= ':' ( (lv_type_2_0= ruleVariableTypeName ) )
            {
            // InternalEdtl.g:336:3: ( (lv_var_0_0= ruleVariable ) )
            // InternalEdtl.g:337:4: (lv_var_0_0= ruleVariable )
            {
            // InternalEdtl.g:337:4: (lv_var_0_0= ruleVariable )
            // InternalEdtl.g:338:5: lv_var_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_var_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getColonKeyword_1());
            		
            // InternalEdtl.g:359:3: ( (lv_type_2_0= ruleVariableTypeName ) )
            // InternalEdtl.g:360:4: (lv_type_2_0= ruleVariableTypeName )
            {
            // InternalEdtl.g:360:4: (lv_type_2_0= ruleVariableTypeName )
            // InternalEdtl.g:361:5: lv_type_2_0= ruleVariableTypeName
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleVariableTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"su.nsk.iae.edtl.Edtl.VariableTypeName");
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
    // InternalEdtl.g:382:1: entryRuleAbbr returns [EObject current=null] : iv_ruleAbbr= ruleAbbr EOF ;
    public final EObject entryRuleAbbr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbr = null;


        try {
            // InternalEdtl.g:382:45: (iv_ruleAbbr= ruleAbbr EOF )
            // InternalEdtl.g:383:2: iv_ruleAbbr= ruleAbbr EOF
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
    // InternalEdtl.g:389:1: ruleAbbr returns [EObject current=null] : (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleExpression ) )* otherlv_3= 'END_ABBR' ) ;
    public final EObject ruleAbbr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:395:2: ( (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleExpression ) )* otherlv_3= 'END_ABBR' ) )
            // InternalEdtl.g:396:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleExpression ) )* otherlv_3= 'END_ABBR' )
            {
            // InternalEdtl.g:396:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleExpression ) )* otherlv_3= 'END_ABBR' )
            // InternalEdtl.g:397:3: otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleExpression ) )* otherlv_3= 'END_ABBR'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAbbrAccess().getABBRKeyword_0());
            		
            // InternalEdtl.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            // InternalEdtl.g:419:3: ( (lv_value_2_0= ruleExpression ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_INTEGER||LA6_0==27||(LA6_0>=42 && LA6_0<=48)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEdtl.g:420:4: (lv_value_2_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:420:4: (lv_value_2_0= ruleExpression )
            	    // InternalEdtl.g:421:5: lv_value_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getAbbrAccess().getValueExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_value_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbbrRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
            	    						"su.nsk.iae.edtl.Edtl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEdtl.g:446:1: entryRuleMacros returns [EObject current=null] : iv_ruleMacros= ruleMacros EOF ;
    public final EObject entryRuleMacros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacros = null;


        try {
            // InternalEdtl.g:446:47: (iv_ruleMacros= ruleMacros EOF )
            // InternalEdtl.g:447:2: iv_ruleMacros= ruleMacros EOF
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
    // InternalEdtl.g:453:1: ruleMacros returns [EObject current=null] : (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_value_5_0= ruleExpression ) )* otherlv_6= 'END_MACROS' ) ;
    public final EObject ruleMacros() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:459:2: ( (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_value_5_0= ruleExpression ) )* otherlv_6= 'END_MACROS' ) )
            // InternalEdtl.g:460:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_value_5_0= ruleExpression ) )* otherlv_6= 'END_MACROS' )
            {
            // InternalEdtl.g:460:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_value_5_0= ruleExpression ) )* otherlv_6= 'END_MACROS' )
            // InternalEdtl.g:461:3: otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_value_5_0= ruleExpression ) )* otherlv_6= 'END_MACROS'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMacrosAccess().getMACROSKeyword_0());
            		
            // InternalEdtl.g:465:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:466:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:466:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:467:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMacrosAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEdtl.g:487:3: ( (lv_args_3_0= ruleVarList ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEdtl.g:488:4: (lv_args_3_0= ruleVarList )
                    {
                    // InternalEdtl.g:488:4: (lv_args_3_0= ruleVarList )
                    // InternalEdtl.g:489:5: lv_args_3_0= ruleVarList
                    {

                    					newCompositeNode(grammarAccess.getMacrosAccess().getArgsVarListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
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

            otherlv_4=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getMacrosAccess().getRightParenthesisKeyword_4());
            		
            // InternalEdtl.g:510:3: ( (lv_value_5_0= ruleExpression ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==RULE_INTEGER||LA8_0==27||(LA8_0>=42 && LA8_0<=48)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEdtl.g:511:4: (lv_value_5_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:511:4: (lv_value_5_0= ruleExpression )
            	    // InternalEdtl.g:512:5: lv_value_5_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getMacrosAccess().getValueExpressionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_value_5_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMacrosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"value",
            	    						lv_value_5_0,
            	    						"su.nsk.iae.edtl.Edtl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalEdtl.g:537:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalEdtl.g:537:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalEdtl.g:538:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalEdtl.g:544:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:550:2: ( ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) )
            // InternalEdtl.g:551:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            {
            // InternalEdtl.g:551:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            // InternalEdtl.g:552:3: ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            {
            // InternalEdtl.g:552:3: ( (lv_vars_0_0= ruleVariable ) )
            // InternalEdtl.g:553:4: (lv_vars_0_0= ruleVariable )
            {
            // InternalEdtl.g:553:4: (lv_vars_0_0= ruleVariable )
            // InternalEdtl.g:554:5: lv_vars_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalEdtl.g:571:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEdtl.g:572:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:576:4: ( (lv_vars_2_0= ruleVariable ) )
            	    // InternalEdtl.g:577:5: (lv_vars_2_0= ruleVariable )
            	    {
            	    // InternalEdtl.g:577:5: (lv_vars_2_0= ruleVariable )
            	    // InternalEdtl.g:578:6: lv_vars_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
    // InternalEdtl.g:600:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalEdtl.g:600:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalEdtl.g:601:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalEdtl.g:607:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= 'END_REQ' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_DECL_SYMB_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_attribute_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:613:2: ( (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= 'END_REQ' ) )
            // InternalEdtl.g:614:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= 'END_REQ' )
            {
            // InternalEdtl.g:614:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= 'END_REQ' )
            // InternalEdtl.g:615:3: otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )* otherlv_6= 'END_REQ'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getREQKeyword_0());
            		
            // InternalEdtl.g:619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:620:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:621:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            // InternalEdtl.g:637:3: ( ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=33 && LA10_0<=38)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEdtl.g:638:4: ( (lv_attribute_2_0= ruleAttribute ) ) this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_value_4_0= ruleExpression ) ) otherlv_5= ';'
            	    {
            	    // InternalEdtl.g:638:4: ( (lv_attribute_2_0= ruleAttribute ) )
            	    // InternalEdtl.g:639:5: (lv_attribute_2_0= ruleAttribute )
            	    {
            	    // InternalEdtl.g:639:5: (lv_attribute_2_0= ruleAttribute )
            	    // InternalEdtl.g:640:6: lv_attribute_2_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementAccess().getAttributeAttributeParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_attribute_2_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attribute",
            	    							lv_attribute_2_0,
            	    							"su.nsk.iae.edtl.Edtl.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_17); 

            	    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_1());
            	    			
            	    // InternalEdtl.g:661:4: ( (lv_value_4_0= ruleExpression ) )
            	    // InternalEdtl.g:662:5: (lv_value_4_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:662:5: (lv_value_4_0= ruleExpression )
            	    // InternalEdtl.g:663:6: lv_value_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRequirementAccess().getValueExpressionParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_value_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"su.nsk.iae.edtl.Edtl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getEND_REQKeyword_3());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalEdtl.g:693:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // InternalEdtl.g:693:49: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEdtl.g:694:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute.getText(); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEdtl.g:700:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRIGGER' | kw= 'INV' | kw= 'FINAL' | kw= 'DELAY' | kw= 'REACTION' | kw= 'RELEASE' ) ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:706:2: ( (kw= 'TRIGGER' | kw= 'INV' | kw= 'FINAL' | kw= 'DELAY' | kw= 'REACTION' | kw= 'RELEASE' ) )
            // InternalEdtl.g:707:2: (kw= 'TRIGGER' | kw= 'INV' | kw= 'FINAL' | kw= 'DELAY' | kw= 'REACTION' | kw= 'RELEASE' )
            {
            // InternalEdtl.g:707:2: (kw= 'TRIGGER' | kw= 'INV' | kw= 'FINAL' | kw= 'DELAY' | kw= 'REACTION' | kw= 'RELEASE' )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
                {
                alt11=5;
                }
                break;
            case 38:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEdtl.g:708:3: kw= 'TRIGGER'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getTRIGGERKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:714:3: kw= 'INV'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getINVKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:720:3: kw= 'FINAL'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getFINALKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:726:3: kw= 'DELAY'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getDELAYKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:732:3: kw= 'REACTION'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getREACTIONKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalEdtl.g:738:3: kw= 'RELEASE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAttributeAccess().getRELEASEKeyword_5());
                    		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleVariable"
    // InternalEdtl.g:747:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEdtl.g:747:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEdtl.g:748:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalEdtl.g:754:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:760:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEdtl.g:761:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEdtl.g:761:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEdtl.g:762:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEdtl.g:762:3: (lv_name_0_0= RULE_ID )
            // InternalEdtl.g:763:4: lv_name_0_0= RULE_ID
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
    // InternalEdtl.g:782:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEdtl.g:782:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEdtl.g:783:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEdtl.g:789:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:795:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalEdtl.g:796:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalEdtl.g:796:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalEdtl.g:797:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:805:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OR_OPERATOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEdtl.g:806:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalEdtl.g:806:4: ()
            	    // InternalEdtl.g:807:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:813:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalEdtl.g:814:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalEdtl.g:814:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalEdtl.g:815:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_17); 

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

            	    // InternalEdtl.g:831:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalEdtl.g:832:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalEdtl.g:832:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalEdtl.g:833:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop12;
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
    // InternalEdtl.g:855:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalEdtl.g:855:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalEdtl.g:856:2: iv_ruleXorExpression= ruleXorExpression EOF
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
    // InternalEdtl.g:862:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:868:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:869:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:869:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:870:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:878:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEdtl.g:879:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:879:4: ()
            	    // InternalEdtl.g:880:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_17);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalEdtl.g:893:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:894:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:894:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:895:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop13;
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
    // InternalEdtl.g:917:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalEdtl.g:917:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalEdtl.g:918:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
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
    // InternalEdtl.g:924:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:930:2: (kw= 'XOR' )
            // InternalEdtl.g:931:2: kw= 'XOR'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalEdtl.g:939:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEdtl.g:939:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEdtl.g:940:2: iv_ruleAndExpression= ruleAndExpression EOF
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
    // InternalEdtl.g:946:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:952:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalEdtl.g:953:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalEdtl.g:953:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalEdtl.g:954:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:962:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }
                else if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEdtl.g:963:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalEdtl.g:963:4: ()
            	    // InternalEdtl.g:964:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:970:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalEdtl.g:971:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalEdtl.g:971:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalEdtl.g:972:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalEdtl.g:989:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalEdtl.g:990:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalEdtl.g:990:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalEdtl.g:991:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop14;
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
    // InternalEdtl.g:1013:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalEdtl.g:1013:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalEdtl.g:1014:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
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
    // InternalEdtl.g:1020:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'AND' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1026:2: ( (kw= '&&' | kw= 'AND' ) )
            // InternalEdtl.g:1027:2: (kw= '&&' | kw= 'AND' )
            {
            // InternalEdtl.g:1027:2: (kw= '&&' | kw= 'AND' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdtl.g:1028:3: kw= '&&'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1034:3: kw= 'AND'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

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
    // InternalEdtl.g:1043:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalEdtl.g:1043:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalEdtl.g:1044:2: iv_ruleCompExpression= ruleCompExpression EOF
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
    // InternalEdtl.g:1050:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1056:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1057:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1057:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1058:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1066:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt16=1;
                    }
                    break;
                case 53:
                    {
                    alt16=1;
                    }
                    break;
                case 54:
                    {
                    alt16=1;
                    }
                    break;
                case 55:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalEdtl.g:1067:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1067:4: ()
            	    // InternalEdtl.g:1068:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1074:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalEdtl.g:1075:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalEdtl.g:1075:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalEdtl.g:1076:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalEdtl.g:1093:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1094:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1094:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1095:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop16;
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
    // InternalEdtl.g:1117:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalEdtl.g:1117:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalEdtl.g:1118:2: iv_ruleEquExpression= ruleEquExpression EOF
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
    // InternalEdtl.g:1124:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1130:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalEdtl.g:1131:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalEdtl.g:1131:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalEdtl.g:1132:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1140:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=50 && LA17_0<=51)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEdtl.g:1141:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalEdtl.g:1141:4: ()
            	    // InternalEdtl.g:1142:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1148:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalEdtl.g:1149:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalEdtl.g:1149:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalEdtl.g:1150:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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

            	    // InternalEdtl.g:1167:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalEdtl.g:1168:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalEdtl.g:1168:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalEdtl.g:1169:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop17;
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
    // InternalEdtl.g:1191:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalEdtl.g:1191:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalEdtl.g:1192:2: iv_ruleUnOperator= ruleUnOperator EOF
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
    // InternalEdtl.g:1198:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1204:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalEdtl.g:1205:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalEdtl.g:1205:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 46:
            case 47:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalEdtl.g:1206:3: this_NotOperator_0= ruleNotOperator
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
                    // InternalEdtl.g:1217:3: kw= 'FE'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1223:3: kw= 'RE'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1229:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1235:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

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
    // InternalEdtl.g:1244:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalEdtl.g:1244:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalEdtl.g:1245:2: iv_ruleNotOperator= ruleNotOperator EOF
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
    // InternalEdtl.g:1251:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1257:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalEdtl.g:1258:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalEdtl.g:1258:2: (kw= 'NOT' | kw= '!' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==46) ) {
                alt19=1;
            }
            else if ( (LA19_0==47) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEdtl.g:1259:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1265:3: kw= '!'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

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
    // InternalEdtl.g:1274:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalEdtl.g:1274:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalEdtl.g:1275:2: iv_ruleUnExpression= ruleUnExpression EOF
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
    // InternalEdtl.g:1281:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1287:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalEdtl.g:1288:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalEdtl.g:1288:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_INTEGER||LA20_0==27||LA20_0==48) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=42 && LA20_0<=47)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEdtl.g:1289:3: this_PrimaryExpression_0= rulePrimaryExpression
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
                    // InternalEdtl.g:1298:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalEdtl.g:1298:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalEdtl.g:1299:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalEdtl.g:1299:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalEdtl.g:1300:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalEdtl.g:1300:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalEdtl.g:1301:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalEdtl.g:1318:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalEdtl.g:1319:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalEdtl.g:1319:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalEdtl.g:1320:6: lv_right_2_0= rulePrimaryExpression
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
    // InternalEdtl.g:1342:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalEdtl.g:1342:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalEdtl.g:1343:2: iv_ruleTauExpression= ruleTauExpression EOF
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
    // InternalEdtl.g:1349:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1355:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalEdtl.g:1356:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalEdtl.g:1356:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalEdtl.g:1357:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEdtl.g:1365:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalEdtl.g:1366:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalEdtl.g:1366:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalEdtl.g:1367:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

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
    // InternalEdtl.g:1392:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEdtl.g:1392:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEdtl.g:1393:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalEdtl.g:1399:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1405:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalEdtl.g:1406:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalEdtl.g:1406:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalEdtl.g:1407:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1414:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalEdtl.g:1415:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalEdtl.g:1415:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalEdtl.g:1416:5: lv_interval_1_0= RULE_INTERVAL
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
    // InternalEdtl.g:1436:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalEdtl.g:1436:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalEdtl.g:1437:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
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
    // InternalEdtl.g:1443:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#T' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1449:2: (kw= '#T' )
            // InternalEdtl.g:1450:2: kw= '#T'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

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
    // InternalEdtl.g:1458:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalEdtl.g:1458:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalEdtl.g:1459:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalEdtl.g:1465:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' ) | ( (lv_tau_6_0= ruleTauExpression ) ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_args_4_0 = null;

        EObject lv_tau_6_0 = null;

        EObject lv_nestExpr_8_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1471:2: ( ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' ) | ( (lv_tau_6_0= ruleTauExpression ) ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalEdtl.g:1472:2: ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' ) | ( (lv_tau_6_0= ruleTauExpression ) ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalEdtl.g:1472:2: ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' ) | ( (lv_tau_6_0= ruleTauExpression ) ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalEdtl.g:1473:3: ( (lv_const_0_0= RULE_INTEGER ) )
                    {
                    // InternalEdtl.g:1473:3: ( (lv_const_0_0= RULE_INTEGER ) )
                    // InternalEdtl.g:1474:4: (lv_const_0_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:1474:4: (lv_const_0_0= RULE_INTEGER )
                    // InternalEdtl.g:1475:5: lv_const_0_0= RULE_INTEGER
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
                    // InternalEdtl.g:1492:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalEdtl.g:1492:3: ( (otherlv_1= RULE_ID ) )
                    // InternalEdtl.g:1493:4: (otherlv_1= RULE_ID )
                    {
                    // InternalEdtl.g:1493:4: (otherlv_1= RULE_ID )
                    // InternalEdtl.g:1494:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getVarCrossVarAbbrCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1506:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' )
                    {
                    // InternalEdtl.g:1506:3: ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' )
                    // InternalEdtl.g:1507:4: ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')'
                    {
                    // InternalEdtl.g:1507:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEdtl.g:1508:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEdtl.g:1508:5: (otherlv_2= RULE_ID )
                    // InternalEdtl.g:1509:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getMacrosMacrosCrossReference_2_0_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalEdtl.g:1524:4: ( (lv_args_4_0= ruleParamAssignmentElements ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalEdtl.g:1525:5: (lv_args_4_0= ruleParamAssignmentElements )
                            {
                            // InternalEdtl.g:1525:5: (lv_args_4_0= ruleParamAssignmentElements )
                            // InternalEdtl.g:1526:6: lv_args_4_0= ruleParamAssignmentElements
                            {

                            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsParamAssignmentElementsParserRuleCall_2_2_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_args_4_0=ruleParamAssignmentElements();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            						}
                            						set(
                            							current,
                            							"args",
                            							lv_args_4_0,
                            							"su.nsk.iae.edtl.Edtl.ParamAssignmentElements");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1549:3: ( (lv_tau_6_0= ruleTauExpression ) )
                    {
                    // InternalEdtl.g:1549:3: ( (lv_tau_6_0= ruleTauExpression ) )
                    // InternalEdtl.g:1550:4: (lv_tau_6_0= ruleTauExpression )
                    {
                    // InternalEdtl.g:1550:4: (lv_tau_6_0= ruleTauExpression )
                    // InternalEdtl.g:1551:5: lv_tau_6_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_6_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_6_0,
                    						"su.nsk.iae.edtl.Edtl.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1569:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalEdtl.g:1569:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalEdtl.g:1570:4: otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalEdtl.g:1574:4: ( (lv_nestExpr_8_0= ruleExpression ) )
                    // InternalEdtl.g:1575:5: (lv_nestExpr_8_0= ruleExpression )
                    {
                    // InternalEdtl.g:1575:5: (lv_nestExpr_8_0= ruleExpression )
                    // InternalEdtl.g:1576:6: lv_nestExpr_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    otherlv_9=(Token)match(input,28,FOLLOW_2); 

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
    // InternalEdtl.g:1602:1: entryRuleParamAssignmentElements returns [EObject current=null] : iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF ;
    public final EObject entryRuleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignmentElements = null;


        try {
            // InternalEdtl.g:1602:64: (iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF )
            // InternalEdtl.g:1603:2: iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF
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
    // InternalEdtl.g:1609:1: ruleParamAssignmentElements returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:1615:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalEdtl.g:1616:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalEdtl.g:1616:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalEdtl.g:1617:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalEdtl.g:1617:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:1618:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:1618:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:1619:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getParamAssignmentElementsAccess().getElementsVariableCrossReference_0_0());
            				

            }


            }

            // InternalEdtl.g:1630:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEdtl.g:1631:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamAssignmentElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:1635:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalEdtl.g:1636:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalEdtl.g:1636:5: (otherlv_2= RULE_ID )
            	    // InternalEdtl.g:1637:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamAssignmentElementsAccess().getElementsVariableCrossReference_1_1_0());
            	    					

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
    // $ANTLR end "ruleParamAssignmentElements"


    // $ANTLR start "ruleEquOperator"
    // InternalEdtl.g:1653:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:1659:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalEdtl.g:1660:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalEdtl.g:1660:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            else if ( (LA24_0==51) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEdtl.g:1661:3: (enumLiteral_0= '==' )
                    {
                    // InternalEdtl.g:1661:3: (enumLiteral_0= '==' )
                    // InternalEdtl.g:1662:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1669:3: (enumLiteral_1= '<>' )
                    {
                    // InternalEdtl.g:1669:3: (enumLiteral_1= '<>' )
                    // InternalEdtl.g:1670:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalEdtl.g:1680:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEdtl.g:1686:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalEdtl.g:1687:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalEdtl.g:1687:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            case 55:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalEdtl.g:1688:3: (enumLiteral_0= '<' )
                    {
                    // InternalEdtl.g:1688:3: (enumLiteral_0= '<' )
                    // InternalEdtl.g:1689:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1696:3: (enumLiteral_1= '>' )
                    {
                    // InternalEdtl.g:1696:3: (enumLiteral_1= '>' )
                    // InternalEdtl.g:1697:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1704:3: (enumLiteral_2= '<=' )
                    {
                    // InternalEdtl.g:1704:3: (enumLiteral_2= '<=' )
                    // InternalEdtl.g:1705:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1712:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEdtl.g:1712:3: (enumLiteral_3= '>=' )
                    // InternalEdtl.g:1713:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\uffff\1\5\7\uffff";
    static final String dfa_3s = "\1\4\1\uffff\1\4\3\uffff\1\4\1\6\2\uffff";
    static final String dfa_4s = "\1\60\1\uffff\1\67\3\uffff\1\60\1\67\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\2\2\uffff\1\3\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\3\uffff\1\1\22\uffff\1\4\24\uffff\1\3",
            "",
            "\1\5\1\uffff\1\5\1\uffff\1\5\13\uffff\1\5\4\uffff\1\5\1\uffff\1\6\2\5\11\uffff\12\5\1\uffff\6\5",
            "",
            "",
            "",
            "\1\7\3\uffff\1\5\22\uffff\1\5\1\10\15\uffff\7\5",
            "\1\11\24\uffff\2\11\1\uffff\1\10\10\uffff\3\11\10\uffff\6\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1472:2: ( ( (lv_const_0_0= RULE_INTEGER ) ) | ( (otherlv_1= RULE_ID ) ) | ( ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_args_4_0= ruleParamAssignmentElements ) )? otherlv_5= ')' ) | ( (lv_tau_6_0= ruleTauExpression ) ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000085480002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001FC000A000110L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001FC0028000110L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001FC0008000110L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0001000008000110L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});

}