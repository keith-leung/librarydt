package mdu.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdu.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'books'", "','", "'}'", "'members'", "'loans'", "'Book'", "'name'", "'author'", "'available'", "'Member'", "'memberId'", "'('", "')'", "'Loan'", "'loanDate'", "'dueDate'", "'book'", "'borrower'", "'true'", "'false'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Library";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLibrary"
    // InternalMyDsl.g:64:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalMyDsl.g:65:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalMyDsl.g:71:1: ruleLibrary returns [EObject current=null] : ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )? (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_books_6_0 = null;

        EObject lv_books_8_0 = null;

        EObject lv_members_12_0 = null;

        EObject lv_members_14_0 = null;

        EObject lv_loans_18_0 = null;

        EObject lv_loans_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )? (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )? (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )? (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'Library' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )? (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )? (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLibraryAccess().getLibraryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLibraryAccess().getLibraryKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLibraryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLibraryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:113:3: (otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:114:4: otherlv_4= 'books' otherlv_5= '{' ( (lv_books_6_0= ruleBook ) ) (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getBooksKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:122:4: ( (lv_books_6_0= ruleBook ) )
                    // InternalMyDsl.g:123:5: (lv_books_6_0= ruleBook )
                    {
                    // InternalMyDsl.g:123:5: (lv_books_6_0= ruleBook )
                    // InternalMyDsl.g:124:6: lv_books_6_0= ruleBook
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_books_6_0=ruleBook();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"books",
                    							lv_books_6_0,
                    							"mdu.mydsl.MyDsl.Book");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:141:4: (otherlv_7= ',' ( (lv_books_8_0= ruleBook ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:142:5: otherlv_7= ',' ( (lv_books_8_0= ruleBook ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLibraryAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:146:5: ( (lv_books_8_0= ruleBook ) )
                    	    // InternalMyDsl.g:147:6: (lv_books_8_0= ruleBook )
                    	    {
                    	    // InternalMyDsl.g:147:6: (lv_books_8_0= ruleBook )
                    	    // InternalMyDsl.g:148:7: lv_books_8_0= ruleBook
                    	    {

                    	    							newCompositeNode(grammarAccess.getLibraryAccess().getBooksBookParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_books_8_0=ruleBook();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"books",
                    	    								lv_books_8_0,
                    	    								"mdu.mydsl.MyDsl.Book");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:171:3: (otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:172:4: otherlv_10= 'members' otherlv_11= '{' ( (lv_members_12_0= ruleMember ) ) (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getLibraryAccess().getMembersKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:180:4: ( (lv_members_12_0= ruleMember ) )
                    // InternalMyDsl.g:181:5: (lv_members_12_0= ruleMember )
                    {
                    // InternalMyDsl.g:181:5: (lv_members_12_0= ruleMember )
                    // InternalMyDsl.g:182:6: lv_members_12_0= ruleMember
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_members_12_0=ruleMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_12_0,
                    							"mdu.mydsl.MyDsl.Member");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:199:4: (otherlv_13= ',' ( (lv_members_14_0= ruleMember ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:200:5: otherlv_13= ',' ( (lv_members_14_0= ruleMember ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getLibraryAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:204:5: ( (lv_members_14_0= ruleMember ) )
                    	    // InternalMyDsl.g:205:6: (lv_members_14_0= ruleMember )
                    	    {
                    	    // InternalMyDsl.g:205:6: (lv_members_14_0= ruleMember )
                    	    // InternalMyDsl.g:206:7: lv_members_14_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getLibraryAccess().getMembersMemberParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_members_14_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_14_0,
                    	    								"mdu.mydsl.MyDsl.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:229:3: (otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:230:4: otherlv_16= 'loans' otherlv_17= '{' ( (lv_loans_18_0= ruleLoan ) ) (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getLibraryAccess().getLoansKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:238:4: ( (lv_loans_18_0= ruleLoan ) )
                    // InternalMyDsl.g:239:5: (lv_loans_18_0= ruleLoan )
                    {
                    // InternalMyDsl.g:239:5: (lv_loans_18_0= ruleLoan )
                    // InternalMyDsl.g:240:6: lv_loans_18_0= ruleLoan
                    {

                    						newCompositeNode(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_loans_18_0=ruleLoan();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibraryRule());
                    						}
                    						add(
                    							current,
                    							"loans",
                    							lv_loans_18_0,
                    							"mdu.mydsl.MyDsl.Loan");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:257:4: (otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:258:5: otherlv_19= ',' ( (lv_loans_20_0= ruleLoan ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getLibraryAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:262:5: ( (lv_loans_20_0= ruleLoan ) )
                    	    // InternalMyDsl.g:263:6: (lv_loans_20_0= ruleLoan )
                    	    {
                    	    // InternalMyDsl.g:263:6: (lv_loans_20_0= ruleLoan )
                    	    // InternalMyDsl.g:264:7: lv_loans_20_0= ruleLoan
                    	    {

                    	    							newCompositeNode(grammarAccess.getLibraryAccess().getLoansLoanParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_loans_20_0=ruleLoan();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLibraryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loans",
                    	    								lv_loans_20_0,
                    	    								"mdu.mydsl.MyDsl.Loan");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:295:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalMyDsl.g:295:45: (iv_ruleBook= ruleBook EOF )
            // InternalMyDsl.g:296:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:302:1: ruleBook returns [EObject current=null] : (otherlv_0= 'Book' ( (lv_isbn_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )? otherlv_7= 'available' ( (lv_available_8_0= ruleEBoolean ) ) otherlv_9= '}' ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_isbn_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_author_6_0 = null;

        AntlrDatatypeRuleToken lv_available_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:308:2: ( (otherlv_0= 'Book' ( (lv_isbn_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )? otherlv_7= 'available' ( (lv_available_8_0= ruleEBoolean ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:309:2: (otherlv_0= 'Book' ( (lv_isbn_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )? otherlv_7= 'available' ( (lv_available_8_0= ruleEBoolean ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:309:2: (otherlv_0= 'Book' ( (lv_isbn_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )? otherlv_7= 'available' ( (lv_available_8_0= ruleEBoolean ) ) otherlv_9= '}' )
            // InternalMyDsl.g:310:3: otherlv_0= 'Book' ( (lv_isbn_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )? otherlv_7= 'available' ( (lv_available_8_0= ruleEBoolean ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
            		
            // InternalMyDsl.g:314:3: ( (lv_isbn_1_0= ruleEString ) )
            // InternalMyDsl.g:315:4: (lv_isbn_1_0= ruleEString )
            {
            // InternalMyDsl.g:315:4: (lv_isbn_1_0= ruleEString )
            // InternalMyDsl.g:316:5: lv_isbn_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBookAccess().getIsbnEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_isbn_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"isbn",
            						lv_isbn_1_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBookAccess().getNameKeyword_3());
            		
            // InternalMyDsl.g:341:3: ( (lv_name_4_0= ruleEString ) )
            // InternalMyDsl.g:342:4: (lv_name_4_0= ruleEString )
            {
            // InternalMyDsl.g:342:4: (lv_name_4_0= ruleEString )
            // InternalMyDsl.g:343:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBookAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:360:3: (otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:361:4: otherlv_5= 'author' ( (lv_author_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getBookAccess().getAuthorKeyword_5_0());
                    			
                    // InternalMyDsl.g:365:4: ( (lv_author_6_0= ruleEString ) )
                    // InternalMyDsl.g:366:5: (lv_author_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:366:5: (lv_author_6_0= ruleEString )
                    // InternalMyDsl.g:367:6: lv_author_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getBookAccess().getAuthorEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_author_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBookRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_6_0,
                    							"mdu.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getBookAccess().getAvailableKeyword_6());
            		
            // InternalMyDsl.g:389:3: ( (lv_available_8_0= ruleEBoolean ) )
            // InternalMyDsl.g:390:4: (lv_available_8_0= ruleEBoolean )
            {
            // InternalMyDsl.g:390:4: (lv_available_8_0= ruleEBoolean )
            // InternalMyDsl.g:391:5: lv_available_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBookAccess().getAvailableEBooleanParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_available_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"available",
            						lv_available_8_0,
            						"mdu.mydsl.MyDsl.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBookAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleMember"
    // InternalMyDsl.g:416:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMyDsl.g:416:47: (iv_ruleMember= ruleMember EOF )
            // InternalMyDsl.g:417:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMyDsl.g:423:1: ruleMember returns [EObject current=null] : (otherlv_0= 'Member' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'memberId' ( (lv_memberId_4_0= ruleEString ) ) (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_memberId_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( (otherlv_0= 'Member' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'memberId' ( (lv_memberId_4_0= ruleEString ) ) (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:430:2: (otherlv_0= 'Member' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'memberId' ( (lv_memberId_4_0= ruleEString ) ) (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:430:2: (otherlv_0= 'Member' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'memberId' ( (lv_memberId_4_0= ruleEString ) ) (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalMyDsl.g:431:3: otherlv_0= 'Member' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'memberId' ( (lv_memberId_4_0= ruleEString ) ) (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberAccess().getMemberKeyword_0());
            		
            // InternalMyDsl.g:435:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:436:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:436:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:437:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMemberAccess().getMemberIdKeyword_3());
            		
            // InternalMyDsl.g:462:3: ( (lv_memberId_4_0= ruleEString ) )
            // InternalMyDsl.g:463:4: (lv_memberId_4_0= ruleEString )
            {
            // InternalMyDsl.g:463:4: (lv_memberId_4_0= ruleEString )
            // InternalMyDsl.g:464:5: lv_memberId_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemberAccess().getMemberIdEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_memberId_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemberRule());
            					}
            					set(
            						current,
            						"memberId",
            						lv_memberId_4_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:481:3: (otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:482:4: otherlv_5= 'loans' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getMemberAccess().getLoansKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getMemberAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyDsl.g:490:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:491:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:491:5: ( ruleEString )
                    // InternalMyDsl.g:492:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemberRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:506:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:507:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMemberAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:511:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:512:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:512:6: ( ruleEString )
                    	    // InternalMyDsl.g:513:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getMemberRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getMemberAccess().getLoansLoanCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getMemberAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMemberAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLoan"
    // InternalMyDsl.g:541:1: entryRuleLoan returns [EObject current=null] : iv_ruleLoan= ruleLoan EOF ;
    public final EObject entryRuleLoan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoan = null;


        try {
            // InternalMyDsl.g:541:45: (iv_ruleLoan= ruleLoan EOF )
            // InternalMyDsl.g:542:2: iv_ruleLoan= ruleLoan EOF
            {
             newCompositeNode(grammarAccess.getLoanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoan=ruleLoan();

            state._fsp--;

             current =iv_ruleLoan; 
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
    // $ANTLR end "entryRuleLoan"


    // $ANTLR start "ruleLoan"
    // InternalMyDsl.g:548:1: ruleLoan returns [EObject current=null] : (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'loanDate' ( (lv_loanDate_3_0= ruleEString ) ) otherlv_4= 'dueDate' ( (lv_dueDate_5_0= ruleEString ) ) otherlv_6= 'book' ( ( ruleEString ) ) otherlv_8= 'borrower' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleLoan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_loanDate_3_0 = null;

        AntlrDatatypeRuleToken lv_dueDate_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:554:2: ( (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'loanDate' ( (lv_loanDate_3_0= ruleEString ) ) otherlv_4= 'dueDate' ( (lv_dueDate_5_0= ruleEString ) ) otherlv_6= 'book' ( ( ruleEString ) ) otherlv_8= 'borrower' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:555:2: (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'loanDate' ( (lv_loanDate_3_0= ruleEString ) ) otherlv_4= 'dueDate' ( (lv_dueDate_5_0= ruleEString ) ) otherlv_6= 'book' ( ( ruleEString ) ) otherlv_8= 'borrower' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:555:2: (otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'loanDate' ( (lv_loanDate_3_0= ruleEString ) ) otherlv_4= 'dueDate' ( (lv_dueDate_5_0= ruleEString ) ) otherlv_6= 'book' ( ( ruleEString ) ) otherlv_8= 'borrower' ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalMyDsl.g:556:3: otherlv_0= 'Loan' otherlv_1= '{' otherlv_2= 'loanDate' ( (lv_loanDate_3_0= ruleEString ) ) otherlv_4= 'dueDate' ( (lv_dueDate_5_0= ruleEString ) ) otherlv_6= 'book' ( ( ruleEString ) ) otherlv_8= 'borrower' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLoanAccess().getLoanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLoanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getLoanAccess().getLoanDateKeyword_2());
            		
            // InternalMyDsl.g:568:3: ( (lv_loanDate_3_0= ruleEString ) )
            // InternalMyDsl.g:569:4: (lv_loanDate_3_0= ruleEString )
            {
            // InternalMyDsl.g:569:4: (lv_loanDate_3_0= ruleEString )
            // InternalMyDsl.g:570:5: lv_loanDate_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoanAccess().getLoanDateEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_loanDate_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoanRule());
            					}
            					set(
            						current,
            						"loanDate",
            						lv_loanDate_3_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLoanAccess().getDueDateKeyword_4());
            		
            // InternalMyDsl.g:591:3: ( (lv_dueDate_5_0= ruleEString ) )
            // InternalMyDsl.g:592:4: (lv_dueDate_5_0= ruleEString )
            {
            // InternalMyDsl.g:592:4: (lv_dueDate_5_0= ruleEString )
            // InternalMyDsl.g:593:5: lv_dueDate_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoanAccess().getDueDateEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_dueDate_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoanRule());
            					}
            					set(
            						current,
            						"dueDate",
            						lv_dueDate_5_0,
            						"mdu.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getLoanAccess().getBookKeyword_6());
            		
            // InternalMyDsl.g:614:3: ( ( ruleEString ) )
            // InternalMyDsl.g:615:4: ( ruleEString )
            {
            // InternalMyDsl.g:615:4: ( ruleEString )
            // InternalMyDsl.g:616:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoanRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLoanAccess().getBookBookCrossReference_7_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getLoanAccess().getBorrowerKeyword_8());
            		
            // InternalMyDsl.g:634:3: ( ( ruleEString ) )
            // InternalMyDsl.g:635:4: ( ruleEString )
            {
            // InternalMyDsl.g:635:4: ( ruleEString )
            // InternalMyDsl.g:636:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoanRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLoanAccess().getBorrowerMemberCrossReference_9_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoanAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleLoan"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:658:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:658:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:659:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:665:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:671:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:672:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:672:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:673:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:681:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:692:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:692:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:693:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:699:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:705:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:706:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:706:2: (kw= 'true' | kw= 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:707:3: kw= 'true'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:713:3: kw= 'false'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}