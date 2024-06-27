package mdu.mydsl.ide.contentassist.antlr.internal;

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
import mdu.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Library'", "'{'", "'}'", "'books'", "','", "'members'", "'loans'", "'Book'", "'name'", "'available'", "'author'", "'Member'", "'memberId'", "'('", "')'", "'Loan'", "'loanDate'", "'dueDate'", "'book'", "'borrower'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleLibrary"
    // InternalMyDsl.g:53:1: entryRuleLibrary : ruleLibrary EOF ;
    public final void entryRuleLibrary() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleLibrary EOF )
            // InternalMyDsl.g:55:1: ruleLibrary EOF
            {
             before(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleLibrary();

            state._fsp--;

             after(grammarAccess.getLibraryRule()); 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalMyDsl.g:62:1: ruleLibrary : ( ( rule__Library__Group__0 ) ) ;
    public final void ruleLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Library__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Library__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Library__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Library__Group__0 )
            {
             before(grammarAccess.getLibraryAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Library__Group__0 )
            // InternalMyDsl.g:69:4: rule__Library__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getGroup()); 

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:78:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBook EOF )
            // InternalMyDsl.g:80:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:87:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Book__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Book__Group__0 )
            // InternalMyDsl.g:94:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleMember"
    // InternalMyDsl.g:103:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMember EOF )
            // InternalMyDsl.g:105:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMyDsl.g:112:1: ruleMember : ( ( rule__Member__Group__0 ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Member__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Member__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Member__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Member__Group__0 )
            {
             before(grammarAccess.getMemberAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Member__Group__0 )
            // InternalMyDsl.g:119:4: rule__Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getGroup()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLoan"
    // InternalMyDsl.g:128:1: entryRuleLoan : ruleLoan EOF ;
    public final void entryRuleLoan() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleLoan EOF )
            // InternalMyDsl.g:130:1: ruleLoan EOF
            {
             before(grammarAccess.getLoanRule()); 
            pushFollow(FOLLOW_1);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLoanRule()); 
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
    // $ANTLR end "entryRuleLoan"


    // $ANTLR start "ruleLoan"
    // InternalMyDsl.g:137:1: ruleLoan : ( ( rule__Loan__Group__0 ) ) ;
    public final void ruleLoan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Loan__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Loan__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Loan__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Loan__Group__0 )
            {
             before(grammarAccess.getLoanAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Loan__Group__0 )
            // InternalMyDsl.g:144:4: rule__Loan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getGroup()); 

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
    // $ANTLR end "ruleLoan"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEString EOF )
            // InternalMyDsl.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:178:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:180:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:187:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:194:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:202:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:207:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:207:2: ( RULE_STRING )
                    // InternalMyDsl.g:208:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:213:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:213:2: ( RULE_ID )
                    // InternalMyDsl.g:214:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:223:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalMyDsl.g:228:2: ( 'true' )
                    {
                    // InternalMyDsl.g:228:2: ( 'true' )
                    // InternalMyDsl.g:229:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( 'false' )
                    {
                    // InternalMyDsl.g:234:2: ( 'false' )
                    // InternalMyDsl.g:235:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Library__Group__0"
    // InternalMyDsl.g:244:1: rule__Library__Group__0 : rule__Library__Group__0__Impl rule__Library__Group__1 ;
    public final void rule__Library__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( rule__Library__Group__0__Impl rule__Library__Group__1 )
            // InternalMyDsl.g:249:2: rule__Library__Group__0__Impl rule__Library__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Library__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__1();

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
    // $ANTLR end "rule__Library__Group__0"


    // $ANTLR start "rule__Library__Group__0__Impl"
    // InternalMyDsl.g:256:1: rule__Library__Group__0__Impl : ( () ) ;
    public final void rule__Library__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( ( () ) )
            // InternalMyDsl.g:261:1: ( () )
            {
            // InternalMyDsl.g:261:1: ( () )
            // InternalMyDsl.g:262:2: ()
            {
             before(grammarAccess.getLibraryAccess().getLibraryAction_0()); 
            // InternalMyDsl.g:263:2: ()
            // InternalMyDsl.g:263:3: 
            {
            }

             after(grammarAccess.getLibraryAccess().getLibraryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Library__Group__0__Impl"


    // $ANTLR start "rule__Library__Group__1"
    // InternalMyDsl.g:271:1: rule__Library__Group__1 : rule__Library__Group__1__Impl rule__Library__Group__2 ;
    public final void rule__Library__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:275:1: ( rule__Library__Group__1__Impl rule__Library__Group__2 )
            // InternalMyDsl.g:276:2: rule__Library__Group__1__Impl rule__Library__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Library__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__2();

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
    // $ANTLR end "rule__Library__Group__1"


    // $ANTLR start "rule__Library__Group__1__Impl"
    // InternalMyDsl.g:283:1: rule__Library__Group__1__Impl : ( 'Library' ) ;
    public final void rule__Library__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( ( 'Library' ) )
            // InternalMyDsl.g:288:1: ( 'Library' )
            {
            // InternalMyDsl.g:288:1: ( 'Library' )
            // InternalMyDsl.g:289:2: 'Library'
            {
             before(grammarAccess.getLibraryAccess().getLibraryKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLibraryKeyword_1()); 

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
    // $ANTLR end "rule__Library__Group__1__Impl"


    // $ANTLR start "rule__Library__Group__2"
    // InternalMyDsl.g:298:1: rule__Library__Group__2 : rule__Library__Group__2__Impl rule__Library__Group__3 ;
    public final void rule__Library__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:302:1: ( rule__Library__Group__2__Impl rule__Library__Group__3 )
            // InternalMyDsl.g:303:2: rule__Library__Group__2__Impl rule__Library__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__3();

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
    // $ANTLR end "rule__Library__Group__2"


    // $ANTLR start "rule__Library__Group__2__Impl"
    // InternalMyDsl.g:310:1: rule__Library__Group__2__Impl : ( ( rule__Library__NameAssignment_2 ) ) ;
    public final void rule__Library__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ( rule__Library__NameAssignment_2 ) ) )
            // InternalMyDsl.g:315:1: ( ( rule__Library__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:315:1: ( ( rule__Library__NameAssignment_2 ) )
            // InternalMyDsl.g:316:2: ( rule__Library__NameAssignment_2 )
            {
             before(grammarAccess.getLibraryAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:317:2: ( rule__Library__NameAssignment_2 )
            // InternalMyDsl.g:317:3: rule__Library__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Library__Group__2__Impl"


    // $ANTLR start "rule__Library__Group__3"
    // InternalMyDsl.g:325:1: rule__Library__Group__3 : rule__Library__Group__3__Impl rule__Library__Group__4 ;
    public final void rule__Library__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:329:1: ( rule__Library__Group__3__Impl rule__Library__Group__4 )
            // InternalMyDsl.g:330:2: rule__Library__Group__3__Impl rule__Library__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__4();

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
    // $ANTLR end "rule__Library__Group__3"


    // $ANTLR start "rule__Library__Group__3__Impl"
    // InternalMyDsl.g:337:1: rule__Library__Group__3__Impl : ( '{' ) ;
    public final void rule__Library__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( ( '{' ) )
            // InternalMyDsl.g:342:1: ( '{' )
            {
            // InternalMyDsl.g:342:1: ( '{' )
            // InternalMyDsl.g:343:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Library__Group__3__Impl"


    // $ANTLR start "rule__Library__Group__4"
    // InternalMyDsl.g:352:1: rule__Library__Group__4 : rule__Library__Group__4__Impl rule__Library__Group__5 ;
    public final void rule__Library__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( rule__Library__Group__4__Impl rule__Library__Group__5 )
            // InternalMyDsl.g:357:2: rule__Library__Group__4__Impl rule__Library__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__5();

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
    // $ANTLR end "rule__Library__Group__4"


    // $ANTLR start "rule__Library__Group__4__Impl"
    // InternalMyDsl.g:364:1: rule__Library__Group__4__Impl : ( ( rule__Library__Group_4__0 )? ) ;
    public final void rule__Library__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( ( ( rule__Library__Group_4__0 )? ) )
            // InternalMyDsl.g:369:1: ( ( rule__Library__Group_4__0 )? )
            {
            // InternalMyDsl.g:369:1: ( ( rule__Library__Group_4__0 )? )
            // InternalMyDsl.g:370:2: ( rule__Library__Group_4__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_4()); 
            // InternalMyDsl.g:371:2: ( rule__Library__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:371:3: rule__Library__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Library__Group__4__Impl"


    // $ANTLR start "rule__Library__Group__5"
    // InternalMyDsl.g:379:1: rule__Library__Group__5 : rule__Library__Group__5__Impl rule__Library__Group__6 ;
    public final void rule__Library__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( rule__Library__Group__5__Impl rule__Library__Group__6 )
            // InternalMyDsl.g:384:2: rule__Library__Group__5__Impl rule__Library__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__6();

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
    // $ANTLR end "rule__Library__Group__5"


    // $ANTLR start "rule__Library__Group__5__Impl"
    // InternalMyDsl.g:391:1: rule__Library__Group__5__Impl : ( ( rule__Library__Group_5__0 )? ) ;
    public final void rule__Library__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ( rule__Library__Group_5__0 )? ) )
            // InternalMyDsl.g:396:1: ( ( rule__Library__Group_5__0 )? )
            {
            // InternalMyDsl.g:396:1: ( ( rule__Library__Group_5__0 )? )
            // InternalMyDsl.g:397:2: ( rule__Library__Group_5__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_5()); 
            // InternalMyDsl.g:398:2: ( rule__Library__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:398:3: rule__Library__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Library__Group__5__Impl"


    // $ANTLR start "rule__Library__Group__6"
    // InternalMyDsl.g:406:1: rule__Library__Group__6 : rule__Library__Group__6__Impl rule__Library__Group__7 ;
    public final void rule__Library__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__Library__Group__6__Impl rule__Library__Group__7 )
            // InternalMyDsl.g:411:2: rule__Library__Group__6__Impl rule__Library__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Library__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group__7();

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
    // $ANTLR end "rule__Library__Group__6"


    // $ANTLR start "rule__Library__Group__6__Impl"
    // InternalMyDsl.g:418:1: rule__Library__Group__6__Impl : ( ( rule__Library__Group_6__0 )? ) ;
    public final void rule__Library__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( ( rule__Library__Group_6__0 )? ) )
            // InternalMyDsl.g:423:1: ( ( rule__Library__Group_6__0 )? )
            {
            // InternalMyDsl.g:423:1: ( ( rule__Library__Group_6__0 )? )
            // InternalMyDsl.g:424:2: ( rule__Library__Group_6__0 )?
            {
             before(grammarAccess.getLibraryAccess().getGroup_6()); 
            // InternalMyDsl.g:425:2: ( rule__Library__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:425:3: rule__Library__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Library__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLibraryAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Library__Group__6__Impl"


    // $ANTLR start "rule__Library__Group__7"
    // InternalMyDsl.g:433:1: rule__Library__Group__7 : rule__Library__Group__7__Impl ;
    public final void rule__Library__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__Library__Group__7__Impl )
            // InternalMyDsl.g:438:2: rule__Library__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group__7__Impl();

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
    // $ANTLR end "rule__Library__Group__7"


    // $ANTLR start "rule__Library__Group__7__Impl"
    // InternalMyDsl.g:444:1: rule__Library__Group__7__Impl : ( '}' ) ;
    public final void rule__Library__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( '}' ) )
            // InternalMyDsl.g:449:1: ( '}' )
            {
            // InternalMyDsl.g:449:1: ( '}' )
            // InternalMyDsl.g:450:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Library__Group__7__Impl"


    // $ANTLR start "rule__Library__Group_4__0"
    // InternalMyDsl.g:460:1: rule__Library__Group_4__0 : rule__Library__Group_4__0__Impl rule__Library__Group_4__1 ;
    public final void rule__Library__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__Library__Group_4__0__Impl rule__Library__Group_4__1 )
            // InternalMyDsl.g:465:2: rule__Library__Group_4__0__Impl rule__Library__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_4__1();

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
    // $ANTLR end "rule__Library__Group_4__0"


    // $ANTLR start "rule__Library__Group_4__0__Impl"
    // InternalMyDsl.g:472:1: rule__Library__Group_4__0__Impl : ( 'books' ) ;
    public final void rule__Library__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( 'books' ) )
            // InternalMyDsl.g:477:1: ( 'books' )
            {
            // InternalMyDsl.g:477:1: ( 'books' )
            // InternalMyDsl.g:478:2: 'books'
            {
             before(grammarAccess.getLibraryAccess().getBooksKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getBooksKeyword_4_0()); 

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
    // $ANTLR end "rule__Library__Group_4__0__Impl"


    // $ANTLR start "rule__Library__Group_4__1"
    // InternalMyDsl.g:487:1: rule__Library__Group_4__1 : rule__Library__Group_4__1__Impl rule__Library__Group_4__2 ;
    public final void rule__Library__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__Library__Group_4__1__Impl rule__Library__Group_4__2 )
            // InternalMyDsl.g:492:2: rule__Library__Group_4__1__Impl rule__Library__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Library__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_4__2();

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
    // $ANTLR end "rule__Library__Group_4__1"


    // $ANTLR start "rule__Library__Group_4__1__Impl"
    // InternalMyDsl.g:499:1: rule__Library__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( ( '{' ) )
            // InternalMyDsl.g:504:1: ( '{' )
            {
            // InternalMyDsl.g:504:1: ( '{' )
            // InternalMyDsl.g:505:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Library__Group_4__1__Impl"


    // $ANTLR start "rule__Library__Group_4__2"
    // InternalMyDsl.g:514:1: rule__Library__Group_4__2 : rule__Library__Group_4__2__Impl rule__Library__Group_4__3 ;
    public final void rule__Library__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__Library__Group_4__2__Impl rule__Library__Group_4__3 )
            // InternalMyDsl.g:519:2: rule__Library__Group_4__2__Impl rule__Library__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_4__3();

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
    // $ANTLR end "rule__Library__Group_4__2"


    // $ANTLR start "rule__Library__Group_4__2__Impl"
    // InternalMyDsl.g:526:1: rule__Library__Group_4__2__Impl : ( ( rule__Library__BooksAssignment_4_2 ) ) ;
    public final void rule__Library__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( ( rule__Library__BooksAssignment_4_2 ) ) )
            // InternalMyDsl.g:531:1: ( ( rule__Library__BooksAssignment_4_2 ) )
            {
            // InternalMyDsl.g:531:1: ( ( rule__Library__BooksAssignment_4_2 ) )
            // InternalMyDsl.g:532:2: ( rule__Library__BooksAssignment_4_2 )
            {
             before(grammarAccess.getLibraryAccess().getBooksAssignment_4_2()); 
            // InternalMyDsl.g:533:2: ( rule__Library__BooksAssignment_4_2 )
            // InternalMyDsl.g:533:3: rule__Library__BooksAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__BooksAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getBooksAssignment_4_2()); 

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
    // $ANTLR end "rule__Library__Group_4__2__Impl"


    // $ANTLR start "rule__Library__Group_4__3"
    // InternalMyDsl.g:541:1: rule__Library__Group_4__3 : rule__Library__Group_4__3__Impl rule__Library__Group_4__4 ;
    public final void rule__Library__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__Library__Group_4__3__Impl rule__Library__Group_4__4 )
            // InternalMyDsl.g:546:2: rule__Library__Group_4__3__Impl rule__Library__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_4__4();

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
    // $ANTLR end "rule__Library__Group_4__3"


    // $ANTLR start "rule__Library__Group_4__3__Impl"
    // InternalMyDsl.g:553:1: rule__Library__Group_4__3__Impl : ( ( rule__Library__Group_4_3__0 )* ) ;
    public final void rule__Library__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( ( ( rule__Library__Group_4_3__0 )* ) )
            // InternalMyDsl.g:558:1: ( ( rule__Library__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:558:1: ( ( rule__Library__Group_4_3__0 )* )
            // InternalMyDsl.g:559:2: ( rule__Library__Group_4_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_4_3()); 
            // InternalMyDsl.g:560:2: ( rule__Library__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:560:3: rule__Library__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Library__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Library__Group_4__3__Impl"


    // $ANTLR start "rule__Library__Group_4__4"
    // InternalMyDsl.g:568:1: rule__Library__Group_4__4 : rule__Library__Group_4__4__Impl ;
    public final void rule__Library__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Library__Group_4__4__Impl )
            // InternalMyDsl.g:573:2: rule__Library__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_4__4__Impl();

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
    // $ANTLR end "rule__Library__Group_4__4"


    // $ANTLR start "rule__Library__Group_4__4__Impl"
    // InternalMyDsl.g:579:1: rule__Library__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( '}' ) )
            // InternalMyDsl.g:584:1: ( '}' )
            {
            // InternalMyDsl.g:584:1: ( '}' )
            // InternalMyDsl.g:585:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Library__Group_4__4__Impl"


    // $ANTLR start "rule__Library__Group_4_3__0"
    // InternalMyDsl.g:595:1: rule__Library__Group_4_3__0 : rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1 ;
    public final void rule__Library__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1 )
            // InternalMyDsl.g:600:2: rule__Library__Group_4_3__0__Impl rule__Library__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Library__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_4_3__1();

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
    // $ANTLR end "rule__Library__Group_4_3__0"


    // $ANTLR start "rule__Library__Group_4_3__0__Impl"
    // InternalMyDsl.g:607:1: rule__Library__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( ',' ) )
            // InternalMyDsl.g:612:1: ( ',' )
            {
            // InternalMyDsl.g:612:1: ( ',' )
            // InternalMyDsl.g:613:2: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Library__Group_4_3__0__Impl"


    // $ANTLR start "rule__Library__Group_4_3__1"
    // InternalMyDsl.g:622:1: rule__Library__Group_4_3__1 : rule__Library__Group_4_3__1__Impl ;
    public final void rule__Library__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Library__Group_4_3__1__Impl )
            // InternalMyDsl.g:627:2: rule__Library__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Library__Group_4_3__1"


    // $ANTLR start "rule__Library__Group_4_3__1__Impl"
    // InternalMyDsl.g:633:1: rule__Library__Group_4_3__1__Impl : ( ( rule__Library__BooksAssignment_4_3_1 ) ) ;
    public final void rule__Library__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( ( rule__Library__BooksAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:638:1: ( ( rule__Library__BooksAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:638:1: ( ( rule__Library__BooksAssignment_4_3_1 ) )
            // InternalMyDsl.g:639:2: ( rule__Library__BooksAssignment_4_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getBooksAssignment_4_3_1()); 
            // InternalMyDsl.g:640:2: ( rule__Library__BooksAssignment_4_3_1 )
            // InternalMyDsl.g:640:3: rule__Library__BooksAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__BooksAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getBooksAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Library__Group_4_3__1__Impl"


    // $ANTLR start "rule__Library__Group_5__0"
    // InternalMyDsl.g:649:1: rule__Library__Group_5__0 : rule__Library__Group_5__0__Impl rule__Library__Group_5__1 ;
    public final void rule__Library__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Library__Group_5__0__Impl rule__Library__Group_5__1 )
            // InternalMyDsl.g:654:2: rule__Library__Group_5__0__Impl rule__Library__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5__1();

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
    // $ANTLR end "rule__Library__Group_5__0"


    // $ANTLR start "rule__Library__Group_5__0__Impl"
    // InternalMyDsl.g:661:1: rule__Library__Group_5__0__Impl : ( 'members' ) ;
    public final void rule__Library__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( 'members' ) )
            // InternalMyDsl.g:666:1: ( 'members' )
            {
            // InternalMyDsl.g:666:1: ( 'members' )
            // InternalMyDsl.g:667:2: 'members'
            {
             before(grammarAccess.getLibraryAccess().getMembersKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getMembersKeyword_5_0()); 

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
    // $ANTLR end "rule__Library__Group_5__0__Impl"


    // $ANTLR start "rule__Library__Group_5__1"
    // InternalMyDsl.g:676:1: rule__Library__Group_5__1 : rule__Library__Group_5__1__Impl rule__Library__Group_5__2 ;
    public final void rule__Library__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Library__Group_5__1__Impl rule__Library__Group_5__2 )
            // InternalMyDsl.g:681:2: rule__Library__Group_5__1__Impl rule__Library__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__Library__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5__2();

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
    // $ANTLR end "rule__Library__Group_5__1"


    // $ANTLR start "rule__Library__Group_5__1__Impl"
    // InternalMyDsl.g:688:1: rule__Library__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( '{' ) )
            // InternalMyDsl.g:693:1: ( '{' )
            {
            // InternalMyDsl.g:693:1: ( '{' )
            // InternalMyDsl.g:694:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Library__Group_5__1__Impl"


    // $ANTLR start "rule__Library__Group_5__2"
    // InternalMyDsl.g:703:1: rule__Library__Group_5__2 : rule__Library__Group_5__2__Impl rule__Library__Group_5__3 ;
    public final void rule__Library__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Library__Group_5__2__Impl rule__Library__Group_5__3 )
            // InternalMyDsl.g:708:2: rule__Library__Group_5__2__Impl rule__Library__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5__3();

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
    // $ANTLR end "rule__Library__Group_5__2"


    // $ANTLR start "rule__Library__Group_5__2__Impl"
    // InternalMyDsl.g:715:1: rule__Library__Group_5__2__Impl : ( ( rule__Library__MembersAssignment_5_2 ) ) ;
    public final void rule__Library__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ( rule__Library__MembersAssignment_5_2 ) ) )
            // InternalMyDsl.g:720:1: ( ( rule__Library__MembersAssignment_5_2 ) )
            {
            // InternalMyDsl.g:720:1: ( ( rule__Library__MembersAssignment_5_2 ) )
            // InternalMyDsl.g:721:2: ( rule__Library__MembersAssignment_5_2 )
            {
             before(grammarAccess.getLibraryAccess().getMembersAssignment_5_2()); 
            // InternalMyDsl.g:722:2: ( rule__Library__MembersAssignment_5_2 )
            // InternalMyDsl.g:722:3: rule__Library__MembersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__MembersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getMembersAssignment_5_2()); 

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
    // $ANTLR end "rule__Library__Group_5__2__Impl"


    // $ANTLR start "rule__Library__Group_5__3"
    // InternalMyDsl.g:730:1: rule__Library__Group_5__3 : rule__Library__Group_5__3__Impl rule__Library__Group_5__4 ;
    public final void rule__Library__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Library__Group_5__3__Impl rule__Library__Group_5__4 )
            // InternalMyDsl.g:735:2: rule__Library__Group_5__3__Impl rule__Library__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5__4();

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
    // $ANTLR end "rule__Library__Group_5__3"


    // $ANTLR start "rule__Library__Group_5__3__Impl"
    // InternalMyDsl.g:742:1: rule__Library__Group_5__3__Impl : ( ( rule__Library__Group_5_3__0 )* ) ;
    public final void rule__Library__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( ( ( rule__Library__Group_5_3__0 )* ) )
            // InternalMyDsl.g:747:1: ( ( rule__Library__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:747:1: ( ( rule__Library__Group_5_3__0 )* )
            // InternalMyDsl.g:748:2: ( rule__Library__Group_5_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_5_3()); 
            // InternalMyDsl.g:749:2: ( rule__Library__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:749:3: rule__Library__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Library__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Library__Group_5__3__Impl"


    // $ANTLR start "rule__Library__Group_5__4"
    // InternalMyDsl.g:757:1: rule__Library__Group_5__4 : rule__Library__Group_5__4__Impl ;
    public final void rule__Library__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Library__Group_5__4__Impl )
            // InternalMyDsl.g:762:2: rule__Library__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_5__4__Impl();

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
    // $ANTLR end "rule__Library__Group_5__4"


    // $ANTLR start "rule__Library__Group_5__4__Impl"
    // InternalMyDsl.g:768:1: rule__Library__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( '}' ) )
            // InternalMyDsl.g:773:1: ( '}' )
            {
            // InternalMyDsl.g:773:1: ( '}' )
            // InternalMyDsl.g:774:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Library__Group_5__4__Impl"


    // $ANTLR start "rule__Library__Group_5_3__0"
    // InternalMyDsl.g:784:1: rule__Library__Group_5_3__0 : rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1 ;
    public final void rule__Library__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1 )
            // InternalMyDsl.g:789:2: rule__Library__Group_5_3__0__Impl rule__Library__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Library__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_5_3__1();

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
    // $ANTLR end "rule__Library__Group_5_3__0"


    // $ANTLR start "rule__Library__Group_5_3__0__Impl"
    // InternalMyDsl.g:796:1: rule__Library__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( ( ',' ) )
            // InternalMyDsl.g:801:1: ( ',' )
            {
            // InternalMyDsl.g:801:1: ( ',' )
            // InternalMyDsl.g:802:2: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Library__Group_5_3__0__Impl"


    // $ANTLR start "rule__Library__Group_5_3__1"
    // InternalMyDsl.g:811:1: rule__Library__Group_5_3__1 : rule__Library__Group_5_3__1__Impl ;
    public final void rule__Library__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Library__Group_5_3__1__Impl )
            // InternalMyDsl.g:816:2: rule__Library__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Library__Group_5_3__1"


    // $ANTLR start "rule__Library__Group_5_3__1__Impl"
    // InternalMyDsl.g:822:1: rule__Library__Group_5_3__1__Impl : ( ( rule__Library__MembersAssignment_5_3_1 ) ) ;
    public final void rule__Library__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( ( rule__Library__MembersAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:827:1: ( ( rule__Library__MembersAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:827:1: ( ( rule__Library__MembersAssignment_5_3_1 ) )
            // InternalMyDsl.g:828:2: ( rule__Library__MembersAssignment_5_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getMembersAssignment_5_3_1()); 
            // InternalMyDsl.g:829:2: ( rule__Library__MembersAssignment_5_3_1 )
            // InternalMyDsl.g:829:3: rule__Library__MembersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__MembersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getMembersAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Library__Group_5_3__1__Impl"


    // $ANTLR start "rule__Library__Group_6__0"
    // InternalMyDsl.g:838:1: rule__Library__Group_6__0 : rule__Library__Group_6__0__Impl rule__Library__Group_6__1 ;
    public final void rule__Library__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Library__Group_6__0__Impl rule__Library__Group_6__1 )
            // InternalMyDsl.g:843:2: rule__Library__Group_6__0__Impl rule__Library__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Library__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_6__1();

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
    // $ANTLR end "rule__Library__Group_6__0"


    // $ANTLR start "rule__Library__Group_6__0__Impl"
    // InternalMyDsl.g:850:1: rule__Library__Group_6__0__Impl : ( 'loans' ) ;
    public final void rule__Library__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( 'loans' ) )
            // InternalMyDsl.g:855:1: ( 'loans' )
            {
            // InternalMyDsl.g:855:1: ( 'loans' )
            // InternalMyDsl.g:856:2: 'loans'
            {
             before(grammarAccess.getLibraryAccess().getLoansKeyword_6_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLoansKeyword_6_0()); 

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
    // $ANTLR end "rule__Library__Group_6__0__Impl"


    // $ANTLR start "rule__Library__Group_6__1"
    // InternalMyDsl.g:865:1: rule__Library__Group_6__1 : rule__Library__Group_6__1__Impl rule__Library__Group_6__2 ;
    public final void rule__Library__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Library__Group_6__1__Impl rule__Library__Group_6__2 )
            // InternalMyDsl.g:870:2: rule__Library__Group_6__1__Impl rule__Library__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Library__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_6__2();

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
    // $ANTLR end "rule__Library__Group_6__1"


    // $ANTLR start "rule__Library__Group_6__1__Impl"
    // InternalMyDsl.g:877:1: rule__Library__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Library__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( ( '{' ) )
            // InternalMyDsl.g:882:1: ( '{' )
            {
            // InternalMyDsl.g:882:1: ( '{' )
            // InternalMyDsl.g:883:2: '{'
            {
             before(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Library__Group_6__1__Impl"


    // $ANTLR start "rule__Library__Group_6__2"
    // InternalMyDsl.g:892:1: rule__Library__Group_6__2 : rule__Library__Group_6__2__Impl rule__Library__Group_6__3 ;
    public final void rule__Library__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__Library__Group_6__2__Impl rule__Library__Group_6__3 )
            // InternalMyDsl.g:897:2: rule__Library__Group_6__2__Impl rule__Library__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_6__3();

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
    // $ANTLR end "rule__Library__Group_6__2"


    // $ANTLR start "rule__Library__Group_6__2__Impl"
    // InternalMyDsl.g:904:1: rule__Library__Group_6__2__Impl : ( ( rule__Library__LoansAssignment_6_2 ) ) ;
    public final void rule__Library__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( ( rule__Library__LoansAssignment_6_2 ) ) )
            // InternalMyDsl.g:909:1: ( ( rule__Library__LoansAssignment_6_2 ) )
            {
            // InternalMyDsl.g:909:1: ( ( rule__Library__LoansAssignment_6_2 ) )
            // InternalMyDsl.g:910:2: ( rule__Library__LoansAssignment_6_2 )
            {
             before(grammarAccess.getLibraryAccess().getLoansAssignment_6_2()); 
            // InternalMyDsl.g:911:2: ( rule__Library__LoansAssignment_6_2 )
            // InternalMyDsl.g:911:3: rule__Library__LoansAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Library__LoansAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLoansAssignment_6_2()); 

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
    // $ANTLR end "rule__Library__Group_6__2__Impl"


    // $ANTLR start "rule__Library__Group_6__3"
    // InternalMyDsl.g:919:1: rule__Library__Group_6__3 : rule__Library__Group_6__3__Impl rule__Library__Group_6__4 ;
    public final void rule__Library__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__Library__Group_6__3__Impl rule__Library__Group_6__4 )
            // InternalMyDsl.g:924:2: rule__Library__Group_6__3__Impl rule__Library__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Library__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_6__4();

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
    // $ANTLR end "rule__Library__Group_6__3"


    // $ANTLR start "rule__Library__Group_6__3__Impl"
    // InternalMyDsl.g:931:1: rule__Library__Group_6__3__Impl : ( ( rule__Library__Group_6_3__0 )* ) ;
    public final void rule__Library__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( ( ( rule__Library__Group_6_3__0 )* ) )
            // InternalMyDsl.g:936:1: ( ( rule__Library__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:936:1: ( ( rule__Library__Group_6_3__0 )* )
            // InternalMyDsl.g:937:2: ( rule__Library__Group_6_3__0 )*
            {
             before(grammarAccess.getLibraryAccess().getGroup_6_3()); 
            // InternalMyDsl.g:938:2: ( rule__Library__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:938:3: rule__Library__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Library__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getLibraryAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Library__Group_6__3__Impl"


    // $ANTLR start "rule__Library__Group_6__4"
    // InternalMyDsl.g:946:1: rule__Library__Group_6__4 : rule__Library__Group_6__4__Impl ;
    public final void rule__Library__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__Library__Group_6__4__Impl )
            // InternalMyDsl.g:951:2: rule__Library__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_6__4__Impl();

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
    // $ANTLR end "rule__Library__Group_6__4"


    // $ANTLR start "rule__Library__Group_6__4__Impl"
    // InternalMyDsl.g:957:1: rule__Library__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Library__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( '}' ) )
            // InternalMyDsl.g:962:1: ( '}' )
            {
            // InternalMyDsl.g:962:1: ( '}' )
            // InternalMyDsl.g:963:2: '}'
            {
             before(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Library__Group_6__4__Impl"


    // $ANTLR start "rule__Library__Group_6_3__0"
    // InternalMyDsl.g:973:1: rule__Library__Group_6_3__0 : rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1 ;
    public final void rule__Library__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1 )
            // InternalMyDsl.g:978:2: rule__Library__Group_6_3__0__Impl rule__Library__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Library__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Library__Group_6_3__1();

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
    // $ANTLR end "rule__Library__Group_6_3__0"


    // $ANTLR start "rule__Library__Group_6_3__0__Impl"
    // InternalMyDsl.g:985:1: rule__Library__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Library__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ',' ) )
            // InternalMyDsl.g:990:1: ( ',' )
            {
            // InternalMyDsl.g:990:1: ( ',' )
            // InternalMyDsl.g:991:2: ','
            {
             before(grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Library__Group_6_3__0__Impl"


    // $ANTLR start "rule__Library__Group_6_3__1"
    // InternalMyDsl.g:1000:1: rule__Library__Group_6_3__1 : rule__Library__Group_6_3__1__Impl ;
    public final void rule__Library__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Library__Group_6_3__1__Impl )
            // InternalMyDsl.g:1005:2: rule__Library__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Library__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Library__Group_6_3__1"


    // $ANTLR start "rule__Library__Group_6_3__1__Impl"
    // InternalMyDsl.g:1011:1: rule__Library__Group_6_3__1__Impl : ( ( rule__Library__LoansAssignment_6_3_1 ) ) ;
    public final void rule__Library__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( ( rule__Library__LoansAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:1016:1: ( ( rule__Library__LoansAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:1016:1: ( ( rule__Library__LoansAssignment_6_3_1 ) )
            // InternalMyDsl.g:1017:2: ( rule__Library__LoansAssignment_6_3_1 )
            {
             before(grammarAccess.getLibraryAccess().getLoansAssignment_6_3_1()); 
            // InternalMyDsl.g:1018:2: ( rule__Library__LoansAssignment_6_3_1 )
            // InternalMyDsl.g:1018:3: rule__Library__LoansAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Library__LoansAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLibraryAccess().getLoansAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Library__Group_6_3__1__Impl"


    // $ANTLR start "rule__Book__Group__0"
    // InternalMyDsl.g:1027:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalMyDsl.g:1032:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

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
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalMyDsl.g:1039:1: rule__Book__Group__0__Impl : ( 'Book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( ( 'Book' ) )
            // InternalMyDsl.g:1044:1: ( 'Book' )
            {
            // InternalMyDsl.g:1044:1: ( 'Book' )
            // InternalMyDsl.g:1045:2: 'Book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

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
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalMyDsl.g:1054:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalMyDsl.g:1059:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

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
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalMyDsl.g:1066:1: rule__Book__Group__1__Impl : ( ( rule__Book__IsbnAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ( rule__Book__IsbnAssignment_1 ) ) )
            // InternalMyDsl.g:1071:1: ( ( rule__Book__IsbnAssignment_1 ) )
            {
            // InternalMyDsl.g:1071:1: ( ( rule__Book__IsbnAssignment_1 ) )
            // InternalMyDsl.g:1072:2: ( rule__Book__IsbnAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getIsbnAssignment_1()); 
            // InternalMyDsl.g:1073:2: ( rule__Book__IsbnAssignment_1 )
            // InternalMyDsl.g:1073:3: rule__Book__IsbnAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__IsbnAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getIsbnAssignment_1()); 

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
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalMyDsl.g:1081:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // InternalMyDsl.g:1086:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__3();

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
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalMyDsl.g:1093:1: rule__Book__Group__2__Impl : ( '{' ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( '{' ) )
            // InternalMyDsl.g:1098:1: ( '{' )
            {
            // InternalMyDsl.g:1098:1: ( '{' )
            // InternalMyDsl.g:1099:2: '{'
            {
             before(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // InternalMyDsl.g:1108:1: rule__Book__Group__3 : rule__Book__Group__3__Impl rule__Book__Group__4 ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Book__Group__3__Impl rule__Book__Group__4 )
            // InternalMyDsl.g:1113:2: rule__Book__Group__3__Impl rule__Book__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__4();

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
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // InternalMyDsl.g:1120:1: rule__Book__Group__3__Impl : ( 'name' ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( 'name' ) )
            // InternalMyDsl.g:1125:1: ( 'name' )
            {
            // InternalMyDsl.g:1125:1: ( 'name' )
            // InternalMyDsl.g:1126:2: 'name'
            {
             before(grammarAccess.getBookAccess().getNameKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getNameKeyword_3()); 

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
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__Book__Group__4"
    // InternalMyDsl.g:1135:1: rule__Book__Group__4 : rule__Book__Group__4__Impl rule__Book__Group__5 ;
    public final void rule__Book__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Book__Group__4__Impl rule__Book__Group__5 )
            // InternalMyDsl.g:1140:2: rule__Book__Group__4__Impl rule__Book__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Book__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__5();

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
    // $ANTLR end "rule__Book__Group__4"


    // $ANTLR start "rule__Book__Group__4__Impl"
    // InternalMyDsl.g:1147:1: rule__Book__Group__4__Impl : ( ( rule__Book__NameAssignment_4 ) ) ;
    public final void rule__Book__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ( rule__Book__NameAssignment_4 ) ) )
            // InternalMyDsl.g:1152:1: ( ( rule__Book__NameAssignment_4 ) )
            {
            // InternalMyDsl.g:1152:1: ( ( rule__Book__NameAssignment_4 ) )
            // InternalMyDsl.g:1153:2: ( rule__Book__NameAssignment_4 )
            {
             before(grammarAccess.getBookAccess().getNameAssignment_4()); 
            // InternalMyDsl.g:1154:2: ( rule__Book__NameAssignment_4 )
            // InternalMyDsl.g:1154:3: rule__Book__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Book__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Book__Group__4__Impl"


    // $ANTLR start "rule__Book__Group__5"
    // InternalMyDsl.g:1162:1: rule__Book__Group__5 : rule__Book__Group__5__Impl rule__Book__Group__6 ;
    public final void rule__Book__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__Book__Group__5__Impl rule__Book__Group__6 )
            // InternalMyDsl.g:1167:2: rule__Book__Group__5__Impl rule__Book__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Book__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__6();

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
    // $ANTLR end "rule__Book__Group__5"


    // $ANTLR start "rule__Book__Group__5__Impl"
    // InternalMyDsl.g:1174:1: rule__Book__Group__5__Impl : ( ( rule__Book__Group_5__0 )? ) ;
    public final void rule__Book__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( ( rule__Book__Group_5__0 )? ) )
            // InternalMyDsl.g:1179:1: ( ( rule__Book__Group_5__0 )? )
            {
            // InternalMyDsl.g:1179:1: ( ( rule__Book__Group_5__0 )? )
            // InternalMyDsl.g:1180:2: ( rule__Book__Group_5__0 )?
            {
             before(grammarAccess.getBookAccess().getGroup_5()); 
            // InternalMyDsl.g:1181:2: ( rule__Book__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1181:3: rule__Book__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Book__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBookAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Book__Group__5__Impl"


    // $ANTLR start "rule__Book__Group__6"
    // InternalMyDsl.g:1189:1: rule__Book__Group__6 : rule__Book__Group__6__Impl rule__Book__Group__7 ;
    public final void rule__Book__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__Book__Group__6__Impl rule__Book__Group__7 )
            // InternalMyDsl.g:1194:2: rule__Book__Group__6__Impl rule__Book__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Book__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__7();

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
    // $ANTLR end "rule__Book__Group__6"


    // $ANTLR start "rule__Book__Group__6__Impl"
    // InternalMyDsl.g:1201:1: rule__Book__Group__6__Impl : ( 'available' ) ;
    public final void rule__Book__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( 'available' ) )
            // InternalMyDsl.g:1206:1: ( 'available' )
            {
            // InternalMyDsl.g:1206:1: ( 'available' )
            // InternalMyDsl.g:1207:2: 'available'
            {
             before(grammarAccess.getBookAccess().getAvailableKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getAvailableKeyword_6()); 

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
    // $ANTLR end "rule__Book__Group__6__Impl"


    // $ANTLR start "rule__Book__Group__7"
    // InternalMyDsl.g:1216:1: rule__Book__Group__7 : rule__Book__Group__7__Impl rule__Book__Group__8 ;
    public final void rule__Book__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( rule__Book__Group__7__Impl rule__Book__Group__8 )
            // InternalMyDsl.g:1221:2: rule__Book__Group__7__Impl rule__Book__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Book__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__8();

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
    // $ANTLR end "rule__Book__Group__7"


    // $ANTLR start "rule__Book__Group__7__Impl"
    // InternalMyDsl.g:1228:1: rule__Book__Group__7__Impl : ( ( rule__Book__AvailableAssignment_7 ) ) ;
    public final void rule__Book__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( ( ( rule__Book__AvailableAssignment_7 ) ) )
            // InternalMyDsl.g:1233:1: ( ( rule__Book__AvailableAssignment_7 ) )
            {
            // InternalMyDsl.g:1233:1: ( ( rule__Book__AvailableAssignment_7 ) )
            // InternalMyDsl.g:1234:2: ( rule__Book__AvailableAssignment_7 )
            {
             before(grammarAccess.getBookAccess().getAvailableAssignment_7()); 
            // InternalMyDsl.g:1235:2: ( rule__Book__AvailableAssignment_7 )
            // InternalMyDsl.g:1235:3: rule__Book__AvailableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Book__AvailableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getAvailableAssignment_7()); 

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
    // $ANTLR end "rule__Book__Group__7__Impl"


    // $ANTLR start "rule__Book__Group__8"
    // InternalMyDsl.g:1243:1: rule__Book__Group__8 : rule__Book__Group__8__Impl ;
    public final void rule__Book__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1247:1: ( rule__Book__Group__8__Impl )
            // InternalMyDsl.g:1248:2: rule__Book__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__8__Impl();

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
    // $ANTLR end "rule__Book__Group__8"


    // $ANTLR start "rule__Book__Group__8__Impl"
    // InternalMyDsl.g:1254:1: rule__Book__Group__8__Impl : ( '}' ) ;
    public final void rule__Book__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( '}' ) )
            // InternalMyDsl.g:1259:1: ( '}' )
            {
            // InternalMyDsl.g:1259:1: ( '}' )
            // InternalMyDsl.g:1260:2: '}'
            {
             before(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Book__Group__8__Impl"


    // $ANTLR start "rule__Book__Group_5__0"
    // InternalMyDsl.g:1270:1: rule__Book__Group_5__0 : rule__Book__Group_5__0__Impl rule__Book__Group_5__1 ;
    public final void rule__Book__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1274:1: ( rule__Book__Group_5__0__Impl rule__Book__Group_5__1 )
            // InternalMyDsl.g:1275:2: rule__Book__Group_5__0__Impl rule__Book__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group_5__1();

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
    // $ANTLR end "rule__Book__Group_5__0"


    // $ANTLR start "rule__Book__Group_5__0__Impl"
    // InternalMyDsl.g:1282:1: rule__Book__Group_5__0__Impl : ( 'author' ) ;
    public final void rule__Book__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( ( 'author' ) )
            // InternalMyDsl.g:1287:1: ( 'author' )
            {
            // InternalMyDsl.g:1287:1: ( 'author' )
            // InternalMyDsl.g:1288:2: 'author'
            {
             before(grammarAccess.getBookAccess().getAuthorKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getAuthorKeyword_5_0()); 

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
    // $ANTLR end "rule__Book__Group_5__0__Impl"


    // $ANTLR start "rule__Book__Group_5__1"
    // InternalMyDsl.g:1297:1: rule__Book__Group_5__1 : rule__Book__Group_5__1__Impl ;
    public final void rule__Book__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1301:1: ( rule__Book__Group_5__1__Impl )
            // InternalMyDsl.g:1302:2: rule__Book__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group_5__1__Impl();

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
    // $ANTLR end "rule__Book__Group_5__1"


    // $ANTLR start "rule__Book__Group_5__1__Impl"
    // InternalMyDsl.g:1308:1: rule__Book__Group_5__1__Impl : ( ( rule__Book__AuthorAssignment_5_1 ) ) ;
    public final void rule__Book__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( ( ( rule__Book__AuthorAssignment_5_1 ) ) )
            // InternalMyDsl.g:1313:1: ( ( rule__Book__AuthorAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1313:1: ( ( rule__Book__AuthorAssignment_5_1 ) )
            // InternalMyDsl.g:1314:2: ( rule__Book__AuthorAssignment_5_1 )
            {
             before(grammarAccess.getBookAccess().getAuthorAssignment_5_1()); 
            // InternalMyDsl.g:1315:2: ( rule__Book__AuthorAssignment_5_1 )
            // InternalMyDsl.g:1315:3: rule__Book__AuthorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__AuthorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getAuthorAssignment_5_1()); 

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
    // $ANTLR end "rule__Book__Group_5__1__Impl"


    // $ANTLR start "rule__Member__Group__0"
    // InternalMyDsl.g:1324:1: rule__Member__Group__0 : rule__Member__Group__0__Impl rule__Member__Group__1 ;
    public final void rule__Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( rule__Member__Group__0__Impl rule__Member__Group__1 )
            // InternalMyDsl.g:1329:2: rule__Member__Group__0__Impl rule__Member__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__1();

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
    // $ANTLR end "rule__Member__Group__0"


    // $ANTLR start "rule__Member__Group__0__Impl"
    // InternalMyDsl.g:1336:1: rule__Member__Group__0__Impl : ( 'Member' ) ;
    public final void rule__Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( 'Member' ) )
            // InternalMyDsl.g:1341:1: ( 'Member' )
            {
            // InternalMyDsl.g:1341:1: ( 'Member' )
            // InternalMyDsl.g:1342:2: 'Member'
            {
             before(grammarAccess.getMemberAccess().getMemberKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getMemberKeyword_0()); 

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
    // $ANTLR end "rule__Member__Group__0__Impl"


    // $ANTLR start "rule__Member__Group__1"
    // InternalMyDsl.g:1351:1: rule__Member__Group__1 : rule__Member__Group__1__Impl rule__Member__Group__2 ;
    public final void rule__Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( rule__Member__Group__1__Impl rule__Member__Group__2 )
            // InternalMyDsl.g:1356:2: rule__Member__Group__1__Impl rule__Member__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__2();

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
    // $ANTLR end "rule__Member__Group__1"


    // $ANTLR start "rule__Member__Group__1__Impl"
    // InternalMyDsl.g:1363:1: rule__Member__Group__1__Impl : ( ( rule__Member__NameAssignment_1 ) ) ;
    public final void rule__Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ( rule__Member__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1368:1: ( ( rule__Member__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1368:1: ( ( rule__Member__NameAssignment_1 ) )
            // InternalMyDsl.g:1369:2: ( rule__Member__NameAssignment_1 )
            {
             before(grammarAccess.getMemberAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1370:2: ( rule__Member__NameAssignment_1 )
            // InternalMyDsl.g:1370:3: rule__Member__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Member__Group__1__Impl"


    // $ANTLR start "rule__Member__Group__2"
    // InternalMyDsl.g:1378:1: rule__Member__Group__2 : rule__Member__Group__2__Impl rule__Member__Group__3 ;
    public final void rule__Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1382:1: ( rule__Member__Group__2__Impl rule__Member__Group__3 )
            // InternalMyDsl.g:1383:2: rule__Member__Group__2__Impl rule__Member__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Member__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__3();

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
    // $ANTLR end "rule__Member__Group__2"


    // $ANTLR start "rule__Member__Group__2__Impl"
    // InternalMyDsl.g:1390:1: rule__Member__Group__2__Impl : ( '{' ) ;
    public final void rule__Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( ( '{' ) )
            // InternalMyDsl.g:1395:1: ( '{' )
            {
            // InternalMyDsl.g:1395:1: ( '{' )
            // InternalMyDsl.g:1396:2: '{'
            {
             before(grammarAccess.getMemberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Member__Group__2__Impl"


    // $ANTLR start "rule__Member__Group__3"
    // InternalMyDsl.g:1405:1: rule__Member__Group__3 : rule__Member__Group__3__Impl rule__Member__Group__4 ;
    public final void rule__Member__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1409:1: ( rule__Member__Group__3__Impl rule__Member__Group__4 )
            // InternalMyDsl.g:1410:2: rule__Member__Group__3__Impl rule__Member__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Member__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__4();

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
    // $ANTLR end "rule__Member__Group__3"


    // $ANTLR start "rule__Member__Group__3__Impl"
    // InternalMyDsl.g:1417:1: rule__Member__Group__3__Impl : ( 'memberId' ) ;
    public final void rule__Member__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( ( 'memberId' ) )
            // InternalMyDsl.g:1422:1: ( 'memberId' )
            {
            // InternalMyDsl.g:1422:1: ( 'memberId' )
            // InternalMyDsl.g:1423:2: 'memberId'
            {
             before(grammarAccess.getMemberAccess().getMemberIdKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getMemberIdKeyword_3()); 

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
    // $ANTLR end "rule__Member__Group__3__Impl"


    // $ANTLR start "rule__Member__Group__4"
    // InternalMyDsl.g:1432:1: rule__Member__Group__4 : rule__Member__Group__4__Impl rule__Member__Group__5 ;
    public final void rule__Member__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1436:1: ( rule__Member__Group__4__Impl rule__Member__Group__5 )
            // InternalMyDsl.g:1437:2: rule__Member__Group__4__Impl rule__Member__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Member__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__5();

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
    // $ANTLR end "rule__Member__Group__4"


    // $ANTLR start "rule__Member__Group__4__Impl"
    // InternalMyDsl.g:1444:1: rule__Member__Group__4__Impl : ( ( rule__Member__MemberIdAssignment_4 ) ) ;
    public final void rule__Member__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( ( rule__Member__MemberIdAssignment_4 ) ) )
            // InternalMyDsl.g:1449:1: ( ( rule__Member__MemberIdAssignment_4 ) )
            {
            // InternalMyDsl.g:1449:1: ( ( rule__Member__MemberIdAssignment_4 ) )
            // InternalMyDsl.g:1450:2: ( rule__Member__MemberIdAssignment_4 )
            {
             before(grammarAccess.getMemberAccess().getMemberIdAssignment_4()); 
            // InternalMyDsl.g:1451:2: ( rule__Member__MemberIdAssignment_4 )
            // InternalMyDsl.g:1451:3: rule__Member__MemberIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Member__MemberIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getMemberIdAssignment_4()); 

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
    // $ANTLR end "rule__Member__Group__4__Impl"


    // $ANTLR start "rule__Member__Group__5"
    // InternalMyDsl.g:1459:1: rule__Member__Group__5 : rule__Member__Group__5__Impl rule__Member__Group__6 ;
    public final void rule__Member__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( rule__Member__Group__5__Impl rule__Member__Group__6 )
            // InternalMyDsl.g:1464:2: rule__Member__Group__5__Impl rule__Member__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Member__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group__6();

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
    // $ANTLR end "rule__Member__Group__5"


    // $ANTLR start "rule__Member__Group__5__Impl"
    // InternalMyDsl.g:1471:1: rule__Member__Group__5__Impl : ( ( rule__Member__Group_5__0 )? ) ;
    public final void rule__Member__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( ( rule__Member__Group_5__0 )? ) )
            // InternalMyDsl.g:1476:1: ( ( rule__Member__Group_5__0 )? )
            {
            // InternalMyDsl.g:1476:1: ( ( rule__Member__Group_5__0 )? )
            // InternalMyDsl.g:1477:2: ( rule__Member__Group_5__0 )?
            {
             before(grammarAccess.getMemberAccess().getGroup_5()); 
            // InternalMyDsl.g:1478:2: ( rule__Member__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1478:3: rule__Member__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Member__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMemberAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Member__Group__5__Impl"


    // $ANTLR start "rule__Member__Group__6"
    // InternalMyDsl.g:1486:1: rule__Member__Group__6 : rule__Member__Group__6__Impl ;
    public final void rule__Member__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( rule__Member__Group__6__Impl )
            // InternalMyDsl.g:1491:2: rule__Member__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group__6__Impl();

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
    // $ANTLR end "rule__Member__Group__6"


    // $ANTLR start "rule__Member__Group__6__Impl"
    // InternalMyDsl.g:1497:1: rule__Member__Group__6__Impl : ( '}' ) ;
    public final void rule__Member__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( ( '}' ) )
            // InternalMyDsl.g:1502:1: ( '}' )
            {
            // InternalMyDsl.g:1502:1: ( '}' )
            // InternalMyDsl.g:1503:2: '}'
            {
             before(grammarAccess.getMemberAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Member__Group__6__Impl"


    // $ANTLR start "rule__Member__Group_5__0"
    // InternalMyDsl.g:1513:1: rule__Member__Group_5__0 : rule__Member__Group_5__0__Impl rule__Member__Group_5__1 ;
    public final void rule__Member__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1517:1: ( rule__Member__Group_5__0__Impl rule__Member__Group_5__1 )
            // InternalMyDsl.g:1518:2: rule__Member__Group_5__0__Impl rule__Member__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Member__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_5__1();

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
    // $ANTLR end "rule__Member__Group_5__0"


    // $ANTLR start "rule__Member__Group_5__0__Impl"
    // InternalMyDsl.g:1525:1: rule__Member__Group_5__0__Impl : ( 'loans' ) ;
    public final void rule__Member__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( ( 'loans' ) )
            // InternalMyDsl.g:1530:1: ( 'loans' )
            {
            // InternalMyDsl.g:1530:1: ( 'loans' )
            // InternalMyDsl.g:1531:2: 'loans'
            {
             before(grammarAccess.getMemberAccess().getLoansKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getLoansKeyword_5_0()); 

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
    // $ANTLR end "rule__Member__Group_5__0__Impl"


    // $ANTLR start "rule__Member__Group_5__1"
    // InternalMyDsl.g:1540:1: rule__Member__Group_5__1 : rule__Member__Group_5__1__Impl rule__Member__Group_5__2 ;
    public final void rule__Member__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1544:1: ( rule__Member__Group_5__1__Impl rule__Member__Group_5__2 )
            // InternalMyDsl.g:1545:2: rule__Member__Group_5__1__Impl rule__Member__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Member__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_5__2();

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
    // $ANTLR end "rule__Member__Group_5__1"


    // $ANTLR start "rule__Member__Group_5__1__Impl"
    // InternalMyDsl.g:1552:1: rule__Member__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Member__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( ( '(' ) )
            // InternalMyDsl.g:1557:1: ( '(' )
            {
            // InternalMyDsl.g:1557:1: ( '(' )
            // InternalMyDsl.g:1558:2: '('
            {
             before(grammarAccess.getMemberAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Member__Group_5__1__Impl"


    // $ANTLR start "rule__Member__Group_5__2"
    // InternalMyDsl.g:1567:1: rule__Member__Group_5__2 : rule__Member__Group_5__2__Impl rule__Member__Group_5__3 ;
    public final void rule__Member__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1571:1: ( rule__Member__Group_5__2__Impl rule__Member__Group_5__3 )
            // InternalMyDsl.g:1572:2: rule__Member__Group_5__2__Impl rule__Member__Group_5__3
            {
            pushFollow(FOLLOW_19);
            rule__Member__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_5__3();

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
    // $ANTLR end "rule__Member__Group_5__2"


    // $ANTLR start "rule__Member__Group_5__2__Impl"
    // InternalMyDsl.g:1579:1: rule__Member__Group_5__2__Impl : ( ( rule__Member__LoansAssignment_5_2 ) ) ;
    public final void rule__Member__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( ( ( rule__Member__LoansAssignment_5_2 ) ) )
            // InternalMyDsl.g:1584:1: ( ( rule__Member__LoansAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1584:1: ( ( rule__Member__LoansAssignment_5_2 ) )
            // InternalMyDsl.g:1585:2: ( rule__Member__LoansAssignment_5_2 )
            {
             before(grammarAccess.getMemberAccess().getLoansAssignment_5_2()); 
            // InternalMyDsl.g:1586:2: ( rule__Member__LoansAssignment_5_2 )
            // InternalMyDsl.g:1586:3: rule__Member__LoansAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Member__LoansAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getLoansAssignment_5_2()); 

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
    // $ANTLR end "rule__Member__Group_5__2__Impl"


    // $ANTLR start "rule__Member__Group_5__3"
    // InternalMyDsl.g:1594:1: rule__Member__Group_5__3 : rule__Member__Group_5__3__Impl rule__Member__Group_5__4 ;
    public final void rule__Member__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1598:1: ( rule__Member__Group_5__3__Impl rule__Member__Group_5__4 )
            // InternalMyDsl.g:1599:2: rule__Member__Group_5__3__Impl rule__Member__Group_5__4
            {
            pushFollow(FOLLOW_19);
            rule__Member__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_5__4();

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
    // $ANTLR end "rule__Member__Group_5__3"


    // $ANTLR start "rule__Member__Group_5__3__Impl"
    // InternalMyDsl.g:1606:1: rule__Member__Group_5__3__Impl : ( ( rule__Member__Group_5_3__0 )* ) ;
    public final void rule__Member__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( ( ( rule__Member__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1611:1: ( ( rule__Member__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1611:1: ( ( rule__Member__Group_5_3__0 )* )
            // InternalMyDsl.g:1612:2: ( rule__Member__Group_5_3__0 )*
            {
             before(grammarAccess.getMemberAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1613:2: ( rule__Member__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1613:3: rule__Member__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Member__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMemberAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Member__Group_5__3__Impl"


    // $ANTLR start "rule__Member__Group_5__4"
    // InternalMyDsl.g:1621:1: rule__Member__Group_5__4 : rule__Member__Group_5__4__Impl ;
    public final void rule__Member__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1625:1: ( rule__Member__Group_5__4__Impl )
            // InternalMyDsl.g:1626:2: rule__Member__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_5__4__Impl();

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
    // $ANTLR end "rule__Member__Group_5__4"


    // $ANTLR start "rule__Member__Group_5__4__Impl"
    // InternalMyDsl.g:1632:1: rule__Member__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Member__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( ( ')' ) )
            // InternalMyDsl.g:1637:1: ( ')' )
            {
            // InternalMyDsl.g:1637:1: ( ')' )
            // InternalMyDsl.g:1638:2: ')'
            {
             before(grammarAccess.getMemberAccess().getRightParenthesisKeyword_5_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getRightParenthesisKeyword_5_4()); 

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
    // $ANTLR end "rule__Member__Group_5__4__Impl"


    // $ANTLR start "rule__Member__Group_5_3__0"
    // InternalMyDsl.g:1648:1: rule__Member__Group_5_3__0 : rule__Member__Group_5_3__0__Impl rule__Member__Group_5_3__1 ;
    public final void rule__Member__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1652:1: ( rule__Member__Group_5_3__0__Impl rule__Member__Group_5_3__1 )
            // InternalMyDsl.g:1653:2: rule__Member__Group_5_3__0__Impl rule__Member__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Member__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Member__Group_5_3__1();

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
    // $ANTLR end "rule__Member__Group_5_3__0"


    // $ANTLR start "rule__Member__Group_5_3__0__Impl"
    // InternalMyDsl.g:1660:1: rule__Member__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Member__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ',' ) )
            // InternalMyDsl.g:1665:1: ( ',' )
            {
            // InternalMyDsl.g:1665:1: ( ',' )
            // InternalMyDsl.g:1666:2: ','
            {
             before(grammarAccess.getMemberAccess().getCommaKeyword_5_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMemberAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Member__Group_5_3__0__Impl"


    // $ANTLR start "rule__Member__Group_5_3__1"
    // InternalMyDsl.g:1675:1: rule__Member__Group_5_3__1 : rule__Member__Group_5_3__1__Impl ;
    public final void rule__Member__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1679:1: ( rule__Member__Group_5_3__1__Impl )
            // InternalMyDsl.g:1680:2: rule__Member__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Member__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Member__Group_5_3__1"


    // $ANTLR start "rule__Member__Group_5_3__1__Impl"
    // InternalMyDsl.g:1686:1: rule__Member__Group_5_3__1__Impl : ( ( rule__Member__LoansAssignment_5_3_1 ) ) ;
    public final void rule__Member__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( ( ( rule__Member__LoansAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1691:1: ( ( rule__Member__LoansAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1691:1: ( ( rule__Member__LoansAssignment_5_3_1 ) )
            // InternalMyDsl.g:1692:2: ( rule__Member__LoansAssignment_5_3_1 )
            {
             before(grammarAccess.getMemberAccess().getLoansAssignment_5_3_1()); 
            // InternalMyDsl.g:1693:2: ( rule__Member__LoansAssignment_5_3_1 )
            // InternalMyDsl.g:1693:3: rule__Member__LoansAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Member__LoansAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getLoansAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Member__Group_5_3__1__Impl"


    // $ANTLR start "rule__Loan__Group__0"
    // InternalMyDsl.g:1702:1: rule__Loan__Group__0 : rule__Loan__Group__0__Impl rule__Loan__Group__1 ;
    public final void rule__Loan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1706:1: ( rule__Loan__Group__0__Impl rule__Loan__Group__1 )
            // InternalMyDsl.g:1707:2: rule__Loan__Group__0__Impl rule__Loan__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Loan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__1();

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
    // $ANTLR end "rule__Loan__Group__0"


    // $ANTLR start "rule__Loan__Group__0__Impl"
    // InternalMyDsl.g:1714:1: rule__Loan__Group__0__Impl : ( 'Loan' ) ;
    public final void rule__Loan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( ( 'Loan' ) )
            // InternalMyDsl.g:1719:1: ( 'Loan' )
            {
            // InternalMyDsl.g:1719:1: ( 'Loan' )
            // InternalMyDsl.g:1720:2: 'Loan'
            {
             before(grammarAccess.getLoanAccess().getLoanKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getLoanKeyword_0()); 

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
    // $ANTLR end "rule__Loan__Group__0__Impl"


    // $ANTLR start "rule__Loan__Group__1"
    // InternalMyDsl.g:1729:1: rule__Loan__Group__1 : rule__Loan__Group__1__Impl rule__Loan__Group__2 ;
    public final void rule__Loan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1733:1: ( rule__Loan__Group__1__Impl rule__Loan__Group__2 )
            // InternalMyDsl.g:1734:2: rule__Loan__Group__1__Impl rule__Loan__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Loan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__2();

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
    // $ANTLR end "rule__Loan__Group__1"


    // $ANTLR start "rule__Loan__Group__1__Impl"
    // InternalMyDsl.g:1741:1: rule__Loan__Group__1__Impl : ( '{' ) ;
    public final void rule__Loan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( ( '{' ) )
            // InternalMyDsl.g:1746:1: ( '{' )
            {
            // InternalMyDsl.g:1746:1: ( '{' )
            // InternalMyDsl.g:1747:2: '{'
            {
             before(grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Loan__Group__1__Impl"


    // $ANTLR start "rule__Loan__Group__2"
    // InternalMyDsl.g:1756:1: rule__Loan__Group__2 : rule__Loan__Group__2__Impl rule__Loan__Group__3 ;
    public final void rule__Loan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1760:1: ( rule__Loan__Group__2__Impl rule__Loan__Group__3 )
            // InternalMyDsl.g:1761:2: rule__Loan__Group__2__Impl rule__Loan__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Loan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__3();

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
    // $ANTLR end "rule__Loan__Group__2"


    // $ANTLR start "rule__Loan__Group__2__Impl"
    // InternalMyDsl.g:1768:1: rule__Loan__Group__2__Impl : ( 'loanDate' ) ;
    public final void rule__Loan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( 'loanDate' ) )
            // InternalMyDsl.g:1773:1: ( 'loanDate' )
            {
            // InternalMyDsl.g:1773:1: ( 'loanDate' )
            // InternalMyDsl.g:1774:2: 'loanDate'
            {
             before(grammarAccess.getLoanAccess().getLoanDateKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getLoanDateKeyword_2()); 

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
    // $ANTLR end "rule__Loan__Group__2__Impl"


    // $ANTLR start "rule__Loan__Group__3"
    // InternalMyDsl.g:1783:1: rule__Loan__Group__3 : rule__Loan__Group__3__Impl rule__Loan__Group__4 ;
    public final void rule__Loan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1787:1: ( rule__Loan__Group__3__Impl rule__Loan__Group__4 )
            // InternalMyDsl.g:1788:2: rule__Loan__Group__3__Impl rule__Loan__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Loan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__4();

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
    // $ANTLR end "rule__Loan__Group__3"


    // $ANTLR start "rule__Loan__Group__3__Impl"
    // InternalMyDsl.g:1795:1: rule__Loan__Group__3__Impl : ( ( rule__Loan__LoanDateAssignment_3 ) ) ;
    public final void rule__Loan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( ( ( rule__Loan__LoanDateAssignment_3 ) ) )
            // InternalMyDsl.g:1800:1: ( ( rule__Loan__LoanDateAssignment_3 ) )
            {
            // InternalMyDsl.g:1800:1: ( ( rule__Loan__LoanDateAssignment_3 ) )
            // InternalMyDsl.g:1801:2: ( rule__Loan__LoanDateAssignment_3 )
            {
             before(grammarAccess.getLoanAccess().getLoanDateAssignment_3()); 
            // InternalMyDsl.g:1802:2: ( rule__Loan__LoanDateAssignment_3 )
            // InternalMyDsl.g:1802:3: rule__Loan__LoanDateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Loan__LoanDateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getLoanDateAssignment_3()); 

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
    // $ANTLR end "rule__Loan__Group__3__Impl"


    // $ANTLR start "rule__Loan__Group__4"
    // InternalMyDsl.g:1810:1: rule__Loan__Group__4 : rule__Loan__Group__4__Impl rule__Loan__Group__5 ;
    public final void rule__Loan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1814:1: ( rule__Loan__Group__4__Impl rule__Loan__Group__5 )
            // InternalMyDsl.g:1815:2: rule__Loan__Group__4__Impl rule__Loan__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Loan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__5();

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
    // $ANTLR end "rule__Loan__Group__4"


    // $ANTLR start "rule__Loan__Group__4__Impl"
    // InternalMyDsl.g:1822:1: rule__Loan__Group__4__Impl : ( 'dueDate' ) ;
    public final void rule__Loan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( ( 'dueDate' ) )
            // InternalMyDsl.g:1827:1: ( 'dueDate' )
            {
            // InternalMyDsl.g:1827:1: ( 'dueDate' )
            // InternalMyDsl.g:1828:2: 'dueDate'
            {
             before(grammarAccess.getLoanAccess().getDueDateKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getDueDateKeyword_4()); 

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
    // $ANTLR end "rule__Loan__Group__4__Impl"


    // $ANTLR start "rule__Loan__Group__5"
    // InternalMyDsl.g:1837:1: rule__Loan__Group__5 : rule__Loan__Group__5__Impl rule__Loan__Group__6 ;
    public final void rule__Loan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1841:1: ( rule__Loan__Group__5__Impl rule__Loan__Group__6 )
            // InternalMyDsl.g:1842:2: rule__Loan__Group__5__Impl rule__Loan__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Loan__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__6();

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
    // $ANTLR end "rule__Loan__Group__5"


    // $ANTLR start "rule__Loan__Group__5__Impl"
    // InternalMyDsl.g:1849:1: rule__Loan__Group__5__Impl : ( ( rule__Loan__DueDateAssignment_5 ) ) ;
    public final void rule__Loan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ( rule__Loan__DueDateAssignment_5 ) ) )
            // InternalMyDsl.g:1854:1: ( ( rule__Loan__DueDateAssignment_5 ) )
            {
            // InternalMyDsl.g:1854:1: ( ( rule__Loan__DueDateAssignment_5 ) )
            // InternalMyDsl.g:1855:2: ( rule__Loan__DueDateAssignment_5 )
            {
             before(grammarAccess.getLoanAccess().getDueDateAssignment_5()); 
            // InternalMyDsl.g:1856:2: ( rule__Loan__DueDateAssignment_5 )
            // InternalMyDsl.g:1856:3: rule__Loan__DueDateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Loan__DueDateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getDueDateAssignment_5()); 

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
    // $ANTLR end "rule__Loan__Group__5__Impl"


    // $ANTLR start "rule__Loan__Group__6"
    // InternalMyDsl.g:1864:1: rule__Loan__Group__6 : rule__Loan__Group__6__Impl rule__Loan__Group__7 ;
    public final void rule__Loan__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1868:1: ( rule__Loan__Group__6__Impl rule__Loan__Group__7 )
            // InternalMyDsl.g:1869:2: rule__Loan__Group__6__Impl rule__Loan__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Loan__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__7();

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
    // $ANTLR end "rule__Loan__Group__6"


    // $ANTLR start "rule__Loan__Group__6__Impl"
    // InternalMyDsl.g:1876:1: rule__Loan__Group__6__Impl : ( 'book' ) ;
    public final void rule__Loan__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( ( 'book' ) )
            // InternalMyDsl.g:1881:1: ( 'book' )
            {
            // InternalMyDsl.g:1881:1: ( 'book' )
            // InternalMyDsl.g:1882:2: 'book'
            {
             before(grammarAccess.getLoanAccess().getBookKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getBookKeyword_6()); 

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
    // $ANTLR end "rule__Loan__Group__6__Impl"


    // $ANTLR start "rule__Loan__Group__7"
    // InternalMyDsl.g:1891:1: rule__Loan__Group__7 : rule__Loan__Group__7__Impl rule__Loan__Group__8 ;
    public final void rule__Loan__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1895:1: ( rule__Loan__Group__7__Impl rule__Loan__Group__8 )
            // InternalMyDsl.g:1896:2: rule__Loan__Group__7__Impl rule__Loan__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Loan__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__8();

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
    // $ANTLR end "rule__Loan__Group__7"


    // $ANTLR start "rule__Loan__Group__7__Impl"
    // InternalMyDsl.g:1903:1: rule__Loan__Group__7__Impl : ( ( rule__Loan__BookAssignment_7 ) ) ;
    public final void rule__Loan__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__Loan__BookAssignment_7 ) ) )
            // InternalMyDsl.g:1908:1: ( ( rule__Loan__BookAssignment_7 ) )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__Loan__BookAssignment_7 ) )
            // InternalMyDsl.g:1909:2: ( rule__Loan__BookAssignment_7 )
            {
             before(grammarAccess.getLoanAccess().getBookAssignment_7()); 
            // InternalMyDsl.g:1910:2: ( rule__Loan__BookAssignment_7 )
            // InternalMyDsl.g:1910:3: rule__Loan__BookAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Loan__BookAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getBookAssignment_7()); 

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
    // $ANTLR end "rule__Loan__Group__7__Impl"


    // $ANTLR start "rule__Loan__Group__8"
    // InternalMyDsl.g:1918:1: rule__Loan__Group__8 : rule__Loan__Group__8__Impl rule__Loan__Group__9 ;
    public final void rule__Loan__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1922:1: ( rule__Loan__Group__8__Impl rule__Loan__Group__9 )
            // InternalMyDsl.g:1923:2: rule__Loan__Group__8__Impl rule__Loan__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Loan__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__9();

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
    // $ANTLR end "rule__Loan__Group__8"


    // $ANTLR start "rule__Loan__Group__8__Impl"
    // InternalMyDsl.g:1930:1: rule__Loan__Group__8__Impl : ( 'borrower' ) ;
    public final void rule__Loan__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( ( 'borrower' ) )
            // InternalMyDsl.g:1935:1: ( 'borrower' )
            {
            // InternalMyDsl.g:1935:1: ( 'borrower' )
            // InternalMyDsl.g:1936:2: 'borrower'
            {
             before(grammarAccess.getLoanAccess().getBorrowerKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getBorrowerKeyword_8()); 

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
    // $ANTLR end "rule__Loan__Group__8__Impl"


    // $ANTLR start "rule__Loan__Group__9"
    // InternalMyDsl.g:1945:1: rule__Loan__Group__9 : rule__Loan__Group__9__Impl rule__Loan__Group__10 ;
    public final void rule__Loan__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1949:1: ( rule__Loan__Group__9__Impl rule__Loan__Group__10 )
            // InternalMyDsl.g:1950:2: rule__Loan__Group__9__Impl rule__Loan__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Loan__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loan__Group__10();

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
    // $ANTLR end "rule__Loan__Group__9"


    // $ANTLR start "rule__Loan__Group__9__Impl"
    // InternalMyDsl.g:1957:1: rule__Loan__Group__9__Impl : ( ( rule__Loan__BorrowerAssignment_9 ) ) ;
    public final void rule__Loan__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( ( ( rule__Loan__BorrowerAssignment_9 ) ) )
            // InternalMyDsl.g:1962:1: ( ( rule__Loan__BorrowerAssignment_9 ) )
            {
            // InternalMyDsl.g:1962:1: ( ( rule__Loan__BorrowerAssignment_9 ) )
            // InternalMyDsl.g:1963:2: ( rule__Loan__BorrowerAssignment_9 )
            {
             before(grammarAccess.getLoanAccess().getBorrowerAssignment_9()); 
            // InternalMyDsl.g:1964:2: ( rule__Loan__BorrowerAssignment_9 )
            // InternalMyDsl.g:1964:3: rule__Loan__BorrowerAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Loan__BorrowerAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getLoanAccess().getBorrowerAssignment_9()); 

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
    // $ANTLR end "rule__Loan__Group__9__Impl"


    // $ANTLR start "rule__Loan__Group__10"
    // InternalMyDsl.g:1972:1: rule__Loan__Group__10 : rule__Loan__Group__10__Impl ;
    public final void rule__Loan__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1976:1: ( rule__Loan__Group__10__Impl )
            // InternalMyDsl.g:1977:2: rule__Loan__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loan__Group__10__Impl();

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
    // $ANTLR end "rule__Loan__Group__10"


    // $ANTLR start "rule__Loan__Group__10__Impl"
    // InternalMyDsl.g:1983:1: rule__Loan__Group__10__Impl : ( '}' ) ;
    public final void rule__Loan__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( ( '}' ) )
            // InternalMyDsl.g:1988:1: ( '}' )
            {
            // InternalMyDsl.g:1988:1: ( '}' )
            // InternalMyDsl.g:1989:2: '}'
            {
             before(grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__Loan__Group__10__Impl"


    // $ANTLR start "rule__Library__NameAssignment_2"
    // InternalMyDsl.g:1999:1: rule__Library__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Library__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2004:2: ( ruleEString )
            {
            // InternalMyDsl.g:2004:2: ( ruleEString )
            // InternalMyDsl.g:2005:3: ruleEString
            {
             before(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Library__NameAssignment_2"


    // $ANTLR start "rule__Library__BooksAssignment_4_2"
    // InternalMyDsl.g:2014:1: rule__Library__BooksAssignment_4_2 : ( ruleBook ) ;
    public final void rule__Library__BooksAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( ( ruleBook ) )
            // InternalMyDsl.g:2019:2: ( ruleBook )
            {
            // InternalMyDsl.g:2019:2: ( ruleBook )
            // InternalMyDsl.g:2020:3: ruleBook
            {
             before(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Library__BooksAssignment_4_2"


    // $ANTLR start "rule__Library__BooksAssignment_4_3_1"
    // InternalMyDsl.g:2029:1: rule__Library__BooksAssignment_4_3_1 : ( ruleBook ) ;
    public final void rule__Library__BooksAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2033:1: ( ( ruleBook ) )
            // InternalMyDsl.g:2034:2: ( ruleBook )
            {
            // InternalMyDsl.g:2034:2: ( ruleBook )
            // InternalMyDsl.g:2035:3: ruleBook
            {
             before(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Library__BooksAssignment_4_3_1"


    // $ANTLR start "rule__Library__MembersAssignment_5_2"
    // InternalMyDsl.g:2044:1: rule__Library__MembersAssignment_5_2 : ( ruleMember ) ;
    public final void rule__Library__MembersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( ( ruleMember ) )
            // InternalMyDsl.g:2049:2: ( ruleMember )
            {
            // InternalMyDsl.g:2049:2: ( ruleMember )
            // InternalMyDsl.g:2050:3: ruleMember
            {
             before(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Library__MembersAssignment_5_2"


    // $ANTLR start "rule__Library__MembersAssignment_5_3_1"
    // InternalMyDsl.g:2059:1: rule__Library__MembersAssignment_5_3_1 : ( ruleMember ) ;
    public final void rule__Library__MembersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2063:1: ( ( ruleMember ) )
            // InternalMyDsl.g:2064:2: ( ruleMember )
            {
            // InternalMyDsl.g:2064:2: ( ruleMember )
            // InternalMyDsl.g:2065:3: ruleMember
            {
             before(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Library__MembersAssignment_5_3_1"


    // $ANTLR start "rule__Library__LoansAssignment_6_2"
    // InternalMyDsl.g:2074:1: rule__Library__LoansAssignment_6_2 : ( ruleLoan ) ;
    public final void rule__Library__LoansAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2078:1: ( ( ruleLoan ) )
            // InternalMyDsl.g:2079:2: ( ruleLoan )
            {
            // InternalMyDsl.g:2079:2: ( ruleLoan )
            // InternalMyDsl.g:2080:3: ruleLoan
            {
             before(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Library__LoansAssignment_6_2"


    // $ANTLR start "rule__Library__LoansAssignment_6_3_1"
    // InternalMyDsl.g:2089:1: rule__Library__LoansAssignment_6_3_1 : ( ruleLoan ) ;
    public final void rule__Library__LoansAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2093:1: ( ( ruleLoan ) )
            // InternalMyDsl.g:2094:2: ( ruleLoan )
            {
            // InternalMyDsl.g:2094:2: ( ruleLoan )
            // InternalMyDsl.g:2095:3: ruleLoan
            {
             before(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLoan();

            state._fsp--;

             after(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Library__LoansAssignment_6_3_1"


    // $ANTLR start "rule__Book__IsbnAssignment_1"
    // InternalMyDsl.g:2104:1: rule__Book__IsbnAssignment_1 : ( ruleEString ) ;
    public final void rule__Book__IsbnAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2109:2: ( ruleEString )
            {
            // InternalMyDsl.g:2109:2: ( ruleEString )
            // InternalMyDsl.g:2110:3: ruleEString
            {
             before(grammarAccess.getBookAccess().getIsbnEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBookAccess().getIsbnEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Book__IsbnAssignment_1"


    // $ANTLR start "rule__Book__NameAssignment_4"
    // InternalMyDsl.g:2119:1: rule__Book__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Book__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2124:2: ( ruleEString )
            {
            // InternalMyDsl.g:2124:2: ( ruleEString )
            // InternalMyDsl.g:2125:3: ruleEString
            {
             before(grammarAccess.getBookAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBookAccess().getNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Book__NameAssignment_4"


    // $ANTLR start "rule__Book__AuthorAssignment_5_1"
    // InternalMyDsl.g:2134:1: rule__Book__AuthorAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Book__AuthorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2138:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2139:2: ( ruleEString )
            {
            // InternalMyDsl.g:2139:2: ( ruleEString )
            // InternalMyDsl.g:2140:3: ruleEString
            {
             before(grammarAccess.getBookAccess().getAuthorEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBookAccess().getAuthorEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Book__AuthorAssignment_5_1"


    // $ANTLR start "rule__Book__AvailableAssignment_7"
    // InternalMyDsl.g:2149:1: rule__Book__AvailableAssignment_7 : ( ruleEBoolean ) ;
    public final void rule__Book__AvailableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2153:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:2154:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:2154:2: ( ruleEBoolean )
            // InternalMyDsl.g:2155:3: ruleEBoolean
            {
             before(grammarAccess.getBookAccess().getAvailableEBooleanParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBookAccess().getAvailableEBooleanParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Book__AvailableAssignment_7"


    // $ANTLR start "rule__Member__NameAssignment_1"
    // InternalMyDsl.g:2164:1: rule__Member__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Member__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2169:2: ( ruleEString )
            {
            // InternalMyDsl.g:2169:2: ( ruleEString )
            // InternalMyDsl.g:2170:3: ruleEString
            {
             before(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Member__NameAssignment_1"


    // $ANTLR start "rule__Member__MemberIdAssignment_4"
    // InternalMyDsl.g:2179:1: rule__Member__MemberIdAssignment_4 : ( ruleEString ) ;
    public final void rule__Member__MemberIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2184:2: ( ruleEString )
            {
            // InternalMyDsl.g:2184:2: ( ruleEString )
            // InternalMyDsl.g:2185:3: ruleEString
            {
             before(grammarAccess.getMemberAccess().getMemberIdEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getMemberIdEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Member__MemberIdAssignment_4"


    // $ANTLR start "rule__Member__LoansAssignment_5_2"
    // InternalMyDsl.g:2194:1: rule__Member__LoansAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Member__LoansAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2198:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2199:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2199:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2200:3: ( ruleEString )
            {
             before(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_2_0()); 
            // InternalMyDsl.g:2201:3: ( ruleEString )
            // InternalMyDsl.g:2202:4: ruleEString
            {
             before(grammarAccess.getMemberAccess().getLoansLoanEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getLoansLoanEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Member__LoansAssignment_5_2"


    // $ANTLR start "rule__Member__LoansAssignment_5_3_1"
    // InternalMyDsl.g:2213:1: rule__Member__LoansAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Member__LoansAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2218:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2218:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2219:3: ( ruleEString )
            {
             before(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_3_1_0()); 
            // InternalMyDsl.g:2220:3: ( ruleEString )
            // InternalMyDsl.g:2221:4: ruleEString
            {
             before(grammarAccess.getMemberAccess().getLoansLoanEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMemberAccess().getLoansLoanEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_3_1_0()); 

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
    // $ANTLR end "rule__Member__LoansAssignment_5_3_1"


    // $ANTLR start "rule__Loan__LoanDateAssignment_3"
    // InternalMyDsl.g:2232:1: rule__Loan__LoanDateAssignment_3 : ( ruleEString ) ;
    public final void rule__Loan__LoanDateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2237:2: ( ruleEString )
            {
            // InternalMyDsl.g:2237:2: ( ruleEString )
            // InternalMyDsl.g:2238:3: ruleEString
            {
             before(grammarAccess.getLoanAccess().getLoanDateEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getLoanDateEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Loan__LoanDateAssignment_3"


    // $ANTLR start "rule__Loan__DueDateAssignment_5"
    // InternalMyDsl.g:2247:1: rule__Loan__DueDateAssignment_5 : ( ruleEString ) ;
    public final void rule__Loan__DueDateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2252:2: ( ruleEString )
            {
            // InternalMyDsl.g:2252:2: ( ruleEString )
            // InternalMyDsl.g:2253:3: ruleEString
            {
             before(grammarAccess.getLoanAccess().getDueDateEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getDueDateEStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Loan__DueDateAssignment_5"


    // $ANTLR start "rule__Loan__BookAssignment_7"
    // InternalMyDsl.g:2262:1: rule__Loan__BookAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Loan__BookAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2267:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2267:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2268:3: ( ruleEString )
            {
             before(grammarAccess.getLoanAccess().getBookBookCrossReference_7_0()); 
            // InternalMyDsl.g:2269:3: ( ruleEString )
            // InternalMyDsl.g:2270:4: ruleEString
            {
             before(grammarAccess.getLoanAccess().getBookBookEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getBookBookEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getLoanAccess().getBookBookCrossReference_7_0()); 

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
    // $ANTLR end "rule__Loan__BookAssignment_7"


    // $ANTLR start "rule__Loan__BorrowerAssignment_9"
    // InternalMyDsl.g:2281:1: rule__Loan__BorrowerAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Loan__BorrowerAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2286:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2286:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2287:3: ( ruleEString )
            {
             before(grammarAccess.getLoanAccess().getBorrowerMemberCrossReference_9_0()); 
            // InternalMyDsl.g:2288:3: ( ruleEString )
            // InternalMyDsl.g:2289:4: ruleEString
            {
             before(grammarAccess.getLoanAccess().getBorrowerMemberEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoanAccess().getBorrowerMemberEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getLoanAccess().getBorrowerMemberCrossReference_9_0()); 

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
    // $ANTLR end "rule__Loan__BorrowerAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000D8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});

}