package su.nsk.iae.edtl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdtlLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_INTERVAL=7;
    public static final int RULE_DECL_SYMB=4;
    public static final int T__19=19;
    public static final int RULE_BIT=11;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
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

    public InternalEdtlLexer() {;} 
    public InternalEdtlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEdtlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEdtl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:11:7: ( 'XOR' )
            // InternalEdtl.g:11:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:12:7: ( '#T' )
            // InternalEdtl.g:12:9: '#T'
            {
            match("#T"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:13:7: ( 'BOOL' )
            // InternalEdtl.g:13:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:14:7: ( 'INT' )
            // InternalEdtl.g:14:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:15:7: ( 'TRIGGER' )
            // InternalEdtl.g:15:9: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:16:7: ( 'INV' )
            // InternalEdtl.g:16:9: 'INV'
            {
            match("INV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:17:7: ( 'FINAL' )
            // InternalEdtl.g:17:9: 'FINAL'
            {
            match("FINAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:18:7: ( 'DELAY' )
            // InternalEdtl.g:18:9: 'DELAY'
            {
            match("DELAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:19:7: ( 'REACTION' )
            // InternalEdtl.g:19:9: 'REACTION'
            {
            match("REACTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:20:7: ( 'RELEASE' )
            // InternalEdtl.g:20:9: 'RELEASE'
            {
            match("RELEASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:21:7: ( '&&' )
            // InternalEdtl.g:21:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:22:7: ( 'AND' )
            // InternalEdtl.g:22:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:23:7: ( 'FE' )
            // InternalEdtl.g:23:9: 'FE'
            {
            match("FE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:24:7: ( 'RE' )
            // InternalEdtl.g:24:9: 'RE'
            {
            match("RE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:25:7: ( 'HIGH' )
            // InternalEdtl.g:25:9: 'HIGH'
            {
            match("HIGH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:26:7: ( 'LOW' )
            // InternalEdtl.g:26:9: 'LOW'
            {
            match("LOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:27:7: ( 'NOT' )
            // InternalEdtl.g:27:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:28:7: ( '!' )
            // InternalEdtl.g:28:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:29:7: ( '==' )
            // InternalEdtl.g:29:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:30:7: ( '<>' )
            // InternalEdtl.g:30:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:31:7: ( '<' )
            // InternalEdtl.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:32:7: ( '>' )
            // InternalEdtl.g:32:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:33:7: ( '<=' )
            // InternalEdtl.g:33:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:34:7: ( '>=' )
            // InternalEdtl.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:35:7: ( 'VAR_INPUT' )
            // InternalEdtl.g:35:9: 'VAR_INPUT'
            {
            match("VAR_INPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:36:7: ( 'END_VAR' )
            // InternalEdtl.g:36:9: 'END_VAR'
            {
            match("END_VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:37:7: ( ';' )
            // InternalEdtl.g:37:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:38:7: ( 'VAR_OUTPUT' )
            // InternalEdtl.g:38:9: 'VAR_OUTPUT'
            {
            match("VAR_OUTPUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:39:7: ( ':' )
            // InternalEdtl.g:39:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:40:7: ( 'ABBR' )
            // InternalEdtl.g:40:9: 'ABBR'
            {
            match("ABBR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:41:7: ( 'END_ABBR' )
            // InternalEdtl.g:41:9: 'END_ABBR'
            {
            match("END_ABBR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:42:7: ( 'MACROS' )
            // InternalEdtl.g:42:9: 'MACROS'
            {
            match("MACROS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:43:7: ( '(' )
            // InternalEdtl.g:43:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:44:7: ( ')' )
            // InternalEdtl.g:44:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:45:7: ( 'END_MACROS' )
            // InternalEdtl.g:45:9: 'END_MACROS'
            {
            match("END_MACROS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:46:7: ( ',' )
            // InternalEdtl.g:46:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:47:7: ( 'REQ' )
            // InternalEdtl.g:47:9: 'REQ'
            {
            match("REQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:48:7: ( 'END_REQ' )
            // InternalEdtl.g:48:9: 'END_REQ'
            {
            match("END_REQ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:49:7: ( 'TAU' )
            // InternalEdtl.g:49:9: 'TAU'
            {
            match("TAU"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "RULE_DECL_SYMB"
    public final void mRULE_DECL_SYMB() throws RecognitionException {
        try {
            int _type = RULE_DECL_SYMB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3898:16: ( ':=' )
            // InternalEdtl.g:3898:18: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECL_SYMB"

    // $ANTLR start "RULE_OR_OPERATOR"
    public final void mRULE_OR_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OR_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3900:18: ( ( '||' | 'OR' ) )
            // InternalEdtl.g:3900:20: ( '||' | 'OR' )
            {
            // InternalEdtl.g:3900:20: ( '||' | 'OR' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='|') ) {
                alt1=1;
            }
            else if ( (LA1_0=='O') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEdtl.g:3900:21: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:3900:26: 'OR'
                    {
                    match("OR"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OPERATOR"

    // $ANTLR start "RULE_INTERVAL"
    public final void mRULE_INTERVAL() throws RecognitionException {
        try {
            int _type = RULE_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3902:15: ( ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )? )
            // InternalEdtl.g:3902:17: ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )?
            {
            // InternalEdtl.g:3902:17: ( RULE_INTEGER 'd' )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEdtl.g:3902:18: RULE_INTEGER 'd'
                    {
                    mRULE_INTEGER(); 
                    match('d'); 

                    }
                    break;

            }

            // InternalEdtl.g:3902:37: ( RULE_INTEGER 'h' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEdtl.g:3902:38: RULE_INTEGER 'h'
                    {
                    mRULE_INTEGER(); 
                    match('h'); 

                    }
                    break;

            }

            // InternalEdtl.g:3902:57: ( RULE_INTEGER 'm' )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEdtl.g:3902:58: RULE_INTEGER 'm'
                    {
                    mRULE_INTEGER(); 
                    match('m'); 

                    }
                    break;

            }

            // InternalEdtl.g:3902:77: ( RULE_INTEGER 's' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEdtl.g:3902:78: RULE_INTEGER 's'
                    {
                    mRULE_INTEGER(); 
                    match('s'); 

                    }
                    break;

            }

            // InternalEdtl.g:3902:97: ( RULE_INTEGER 'ms' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEdtl.g:3902:98: RULE_INTEGER 'ms'
                    {
                    mRULE_INTEGER(); 
                    match("ms"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERVAL"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3904:14: ( ( RULE_DIGIT )+ )
            // InternalEdtl.g:3904:16: ( RULE_DIGIT )+
            {
            // InternalEdtl.g:3904:16: ( RULE_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEdtl.g:3904:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalEdtl.g:3906:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalEdtl.g:3906:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            // InternalEdtl.g:3908:19: ( ( '0' | '1' ) )
            // InternalEdtl.g:3908:21: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:3910:27: ( '0' .. '7' )
            // InternalEdtl.g:3910:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:3912:21: ( '0' .. '9' )
            // InternalEdtl.g:3912:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalEdtl.g:3914:25: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // InternalEdtl.g:3914:27: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3916:9: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // InternalEdtl.g:3916:11: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalEdtl.g:3916:23: ( RULE_LETTER | RULE_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEdtl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3918:17: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' ) )
            // InternalEdtl.g:3918:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            {
            // InternalEdtl.g:3918:19: ( '/*' ( options {greedy=false; } : . )* '*/' | '(*' ( options {greedy=false; } : . )* '*)' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='/') ) {
                alt11=1;
            }
            else if ( (LA11_0=='(') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEdtl.g:3918:20: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // InternalEdtl.g:3918:25: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEdtl.g:3918:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:3918:62: '(*' ( options {greedy=false; } : . )* '*)'
                    {
                    match("(*"); 

                    // InternalEdtl.g:3918:67: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='*') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==')') ) {
                                alt10=2;
                            }
                            else if ( ((LA10_1>='\u0000' && LA10_1<='(')||(LA10_1>='*' && LA10_1<='\uFFFF')) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEdtl.g:3918:95: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match("*)"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3920:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEdtl.g:3920:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEdtl.g:3920:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEdtl.g:3920:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalEdtl.g:3920:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEdtl.g:3920:41: ( '\\r' )? '\\n'
                    {
                    // InternalEdtl.g:3920:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEdtl.g:3920:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEdtl.g:3922:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEdtl.g:3922:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEdtl.g:3922:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalEdtl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalEdtl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_DECL_SYMB | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_INTEGER | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt16=47;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalEdtl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalEdtl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalEdtl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalEdtl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalEdtl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalEdtl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalEdtl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalEdtl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalEdtl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalEdtl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalEdtl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalEdtl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalEdtl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalEdtl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalEdtl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalEdtl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalEdtl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalEdtl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalEdtl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalEdtl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalEdtl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalEdtl.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalEdtl.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalEdtl.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalEdtl.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalEdtl.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalEdtl.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalEdtl.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalEdtl.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalEdtl.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalEdtl.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalEdtl.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalEdtl.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalEdtl.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalEdtl.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalEdtl.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalEdtl.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalEdtl.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalEdtl.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalEdtl.g:1:244: RULE_DECL_SYMB
                {
                mRULE_DECL_SYMB(); 

                }
                break;
            case 41 :
                // InternalEdtl.g:1:259: RULE_OR_OPERATOR
                {
                mRULE_OR_OPERATOR(); 

                }
                break;
            case 42 :
                // InternalEdtl.g:1:276: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 43 :
                // InternalEdtl.g:1:290: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 44 :
                // InternalEdtl.g:1:303: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalEdtl.g:1:311: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 46 :
                // InternalEdtl.g:1:327: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalEdtl.g:1:343: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA2_eotS =
        "\1\2\3\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\2\60\2\uffff";
    static final String DFA2_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\12\1",
            "\12\1\52\uffff\1\3\3\uffff\1\2\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "3902:17: ( RULE_INTEGER 'd' )?";
        }
    }
    static final String DFA3_eotS =
        "\1\2\3\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\60\2\uffff";
    static final String DFA3_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\12\1\56\uffff\1\3\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "3902:37: ( RULE_INTEGER 'h' )?";
        }
    }
    static final String DFA4_eotS =
        "\1\2\2\uffff\1\4\1\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\2\60\1\uffff\1\163\1\uffff";
    static final String DFA4_maxS =
        "\1\71\1\163\1\uffff\1\163\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\3\5\uffff\1\2",
            "",
            "\1\2",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "3902:57: ( RULE_INTEGER 'm' )?";
        }
    }
    static final String DFA5_eotS =
        "\1\2\3\uffff";
    static final String DFA5_eofS =
        "\4\uffff";
    static final String DFA5_minS =
        "\2\60\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA5_specialS =
        "\4\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "3902:77: ( RULE_INTEGER 's' )?";
        }
    }
    static final String DFA16_eotS =
        "\1\35\1\36\1\uffff\6\36\1\uffff\4\36\2\uffff\1\61\1\63\2\36\1\uffff\1\67\1\36\1\72\3\uffff\1\36\1\74\4\uffff\6\36\1\105\1\36\1\112\5\36\5\uffff\2\36\2\uffff\1\36\2\uffff\1\32\2\uffff\1\123\1\36\1\125\1\126\1\36\1\130\1\36\1\uffff\3\36\1\135\1\uffff\1\136\2\36\1\141\1\142\3\36\1\uffff\1\146\2\uffff\1\36\1\uffff\4\36\2\uffff\1\154\1\155\2\uffff\3\36\1\uffff\1\36\1\166\1\167\2\36\2\uffff\10\36\2\uffff\10\36\1\u008a\1\u008b\1\36\1\u008d\2\36\1\u0090\2\36\1\u0093\2\uffff\1\u0094\1\uffff\2\36\1\uffff\1\u0097\1\36\2\uffff\1\u0099\1\36\1\uffff\1\36\1\uffff\1\u009c\1\u009d\2\uffff";
    static final String DFA16_eofS =
        "\u009e\uffff";
    static final String DFA16_minS =
        "\1\11\1\117\1\uffff\1\117\1\116\1\101\3\105\1\uffff\1\102\1\111\2\117\2\uffff\2\75\1\101\1\116\1\uffff\1\75\1\101\1\52\3\uffff\1\122\1\60\2\uffff\1\52\1\uffff\1\122\1\117\1\124\1\111\1\125\1\116\1\60\1\114\1\60\1\104\1\102\1\107\1\127\1\124\5\uffff\1\122\1\104\2\uffff\1\103\2\uffff\1\60\2\uffff\1\60\1\114\2\60\1\107\1\60\1\101\1\uffff\1\101\1\103\1\105\1\60\1\uffff\1\60\1\122\1\110\2\60\2\137\1\122\1\uffff\1\60\2\uffff\1\107\1\uffff\1\114\1\131\1\124\1\101\2\uffff\2\60\2\uffff\1\111\1\101\1\117\1\uffff\1\105\2\60\1\111\1\123\2\uffff\1\116\1\125\1\101\1\102\1\101\1\105\1\123\1\122\2\uffff\1\117\1\105\1\120\1\124\1\122\1\102\1\103\1\121\2\60\1\116\1\60\1\125\1\120\1\60\2\122\1\60\2\uffff\1\60\1\uffff\1\124\1\125\1\uffff\1\60\1\117\2\uffff\1\60\1\124\1\uffff\1\123\1\uffff\2\60\2\uffff";
    static final String DFA16_maxS =
        "\1\174\1\117\1\uffff\1\117\1\116\1\122\1\111\2\105\1\uffff\1\116\1\111\2\117\2\uffff\1\76\1\75\1\101\1\116\1\uffff\1\75\1\101\1\52\3\uffff\1\122\1\163\2\uffff\1\57\1\uffff\1\122\1\117\1\126\1\111\1\125\1\116\1\172\1\114\1\172\1\104\1\102\1\107\1\127\1\124\5\uffff\1\122\1\104\2\uffff\1\103\2\uffff\1\172\2\uffff\1\172\1\114\2\172\1\107\1\172\1\101\1\uffff\1\101\1\103\1\105\1\172\1\uffff\1\172\1\122\1\110\2\172\2\137\1\122\1\uffff\1\172\2\uffff\1\107\1\uffff\1\114\1\131\1\124\1\101\2\uffff\2\172\2\uffff\1\117\1\126\1\117\1\uffff\1\105\2\172\1\111\1\123\2\uffff\1\116\1\125\1\101\1\102\1\101\1\105\1\123\1\122\2\uffff\1\117\1\105\1\120\1\124\1\122\1\102\1\103\1\121\2\172\1\116\1\172\1\125\1\120\1\172\2\122\1\172\2\uffff\1\172\1\uffff\1\124\1\125\1\uffff\1\172\1\117\2\uffff\1\172\1\124\1\uffff\1\123\1\uffff\2\172\2\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\6\uffff\1\13\4\uffff\1\22\1\23\4\uffff\1\33\3\uffff\1\42\1\44\1\51\2\uffff\1\52\1\54\1\uffff\1\57\16\uffff\1\24\1\27\1\25\1\30\1\26\2\uffff\1\50\1\35\1\uffff\1\55\1\41\1\uffff\1\53\1\56\7\uffff\1\15\4\uffff\1\16\10\uffff\1\1\1\uffff\1\4\1\6\1\uffff\1\47\4\uffff\1\45\1\14\2\uffff\1\20\1\21\3\uffff\1\3\5\uffff\1\36\1\17\10\uffff\1\7\1\10\22\uffff\1\40\1\5\1\uffff\1\12\2\uffff\1\32\2\uffff\1\46\1\11\2\uffff\1\37\1\uffff\1\31\2\uffff\1\34\1\43";
    static final String DFA16_specialS =
        "\u009e\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\16\1\uffff\1\2\2\uffff\1\11\1\uffff\1\27\1\30\2\uffff\1\31\2\uffff\1\37\12\34\1\25\1\24\1\20\1\17\1\21\2\uffff\1\12\1\3\1\36\1\7\1\23\1\6\1\36\1\13\1\4\2\36\1\14\1\26\1\15\1\33\2\36\1\10\1\36\1\5\1\36\1\22\1\36\1\1\2\36\4\uffff\1\36\1\uffff\32\36\1\uffff\1\32",
            "\1\41",
            "",
            "\1\42",
            "\1\43",
            "\1\45\20\uffff\1\44",
            "\1\47\3\uffff\1\46",
            "\1\50",
            "\1\51",
            "",
            "\1\53\13\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\60\1\57",
            "\1\62",
            "\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\73",
            "\12\34\52\uffff\1\35\3\uffff\1\35\4\uffff\1\35\5\uffff\1\35",
            "",
            "",
            "\1\71\4\uffff\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100\1\uffff\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\106",
            "\12\36\7\uffff\1\107\12\36\1\110\4\36\1\111\11\36\4\uffff\1\36\1\uffff\32\36",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\124",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\127",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\137",
            "\1\140",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\1\156\5\uffff\1\157",
            "\1\161\13\uffff\1\162\4\uffff\1\163\3\uffff\1\160",
            "\1\164",
            "",
            "\1\165",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "\1\171",
            "",
            "",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008c",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008e",
            "\1\u008f",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0091",
            "\1\u0092",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0095",
            "\1\u0096",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u0098",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | RULE_DECL_SYMB | RULE_OR_OPERATOR | RULE_INTERVAL | RULE_INTEGER | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}