package org.unipampa.lesse.parser.antlr.internal;

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
import org.unipampa.lesse.services.CanopusGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCanopusParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'as'", "'Monitoring'", "'{'", "'projectLabel'", "'projectAuthor'", "'description'", "'sut'", "'s'", "'loadGenerators'", "'}'", "'SUT'", "'hostname'", "'ip'", "'hardware'", "'type'", "'LoadGenerator'", "'MetricCollection'", "'metric'", "','", "'Memory'", "'threshold'", "'Disk'", "'disk_io_counter'", "'Transaction'", "'-'", "'PHYSICA_MACHINE'", "'VIRTUAL_MACHINE'", "'CLOUD_SERVICE'", "'DESKTOPAPP'", "'DATABASE'", "'WEBAPP'", "'WEBSERVICE'", "'AVG_DISK_SECS_TRANSFER_COUNTER'", "'_IDLE_TIME_COUNTER'", "'DISK_TRANSFERS_SEC_COUNTER'", "'AVG_DISK_QUEUE_LENGTH_COUNTER'", "'SPLIT_IO_SEC_COUNTER'", "'FREE_MEGABYTES_COUNTER'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCanopusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCanopusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCanopusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCanopus.g"; }



     	private CanopusGrammarAccess grammarAccess;

        public InternalCanopusParser(TokenStream input, CanopusGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CanopusGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCanopus.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCanopus.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalCanopus.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalCanopus.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_0_0 = null;

        EObject lv_monitorings_1_0 = null;

        EObject lv_suts_2_0 = null;

        EObject lv_loadGenerators_3_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:78:2: ( ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* ) )
            // InternalCanopus.g:79:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* )
            {
            // InternalCanopus.g:79:2: ( ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )* )
            // InternalCanopus.g:80:3: ( (lv_includes_0_0= ruleInclude ) )* ( (lv_monitorings_1_0= ruleMonitoring ) )* ( (lv_suts_2_0= ruleSUT ) )* ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )*
            {
            // InternalCanopus.g:80:3: ( (lv_includes_0_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCanopus.g:81:4: (lv_includes_0_0= ruleInclude )
            	    {
            	    // InternalCanopus.g:81:4: (lv_includes_0_0= ruleInclude )
            	    // InternalCanopus.g:82:5: lv_includes_0_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_includes_0_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"includes",
            	    						lv_includes_0_0,
            	    						"org.unipampa.lesse.Canopus.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCanopus.g:99:3: ( (lv_monitorings_1_0= ruleMonitoring ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCanopus.g:100:4: (lv_monitorings_1_0= ruleMonitoring )
            	    {
            	    // InternalCanopus.g:100:4: (lv_monitorings_1_0= ruleMonitoring )
            	    // InternalCanopus.g:101:5: lv_monitorings_1_0= ruleMonitoring
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMonitoringsMonitoringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_monitorings_1_0=ruleMonitoring();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"monitorings",
            	    						lv_monitorings_1_0,
            	    						"org.unipampa.lesse.Canopus.Monitoring");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalCanopus.g:118:3: ( (lv_suts_2_0= ruleSUT ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCanopus.g:119:4: (lv_suts_2_0= ruleSUT )
            	    {
            	    // InternalCanopus.g:119:4: (lv_suts_2_0= ruleSUT )
            	    // InternalCanopus.g:120:5: lv_suts_2_0= ruleSUT
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSutsSUTParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_suts_2_0=ruleSUT();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"suts",
            	    						lv_suts_2_0,
            	    						"org.unipampa.lesse.Canopus.SUT");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCanopus.g:137:3: ( (lv_loadGenerators_3_0= ruleLoadGenerator ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCanopus.g:138:4: (lv_loadGenerators_3_0= ruleLoadGenerator )
            	    {
            	    // InternalCanopus.g:138:4: (lv_loadGenerators_3_0= ruleLoadGenerator )
            	    // InternalCanopus.g:139:5: lv_loadGenerators_3_0= ruleLoadGenerator
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getLoadGeneratorsLoadGeneratorParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_loadGenerators_3_0=ruleLoadGenerator();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"loadGenerators",
            	    						lv_loadGenerators_3_0,
            	    						"org.unipampa.lesse.Canopus.LoadGenerator");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleInclude"
    // InternalCanopus.g:160:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalCanopus.g:160:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalCanopus.g:161:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalCanopus.g:167:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalCanopus.g:173:2: ( (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalCanopus.g:174:2: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalCanopus.g:174:2: (otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalCanopus.g:175:3: otherlv_0= 'include' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalCanopus.g:179:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalCanopus.g:180:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalCanopus.g:180:4: (lv_importURI_1_0= RULE_STRING )
            // InternalCanopus.g:181:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.unipampa.lesse.Canopus.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getAsKeyword_2());
            		
            // InternalCanopus.g:201:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCanopus.g:202:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCanopus.g:202:4: (lv_name_3_0= RULE_ID )
            // InternalCanopus.g:203:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getIncludeAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.unipampa.lesse.Canopus.ID");
            				

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMonitoring"
    // InternalCanopus.g:223:1: entryRuleMonitoring returns [EObject current=null] : iv_ruleMonitoring= ruleMonitoring EOF ;
    public final EObject entryRuleMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitoring = null;


        try {
            // InternalCanopus.g:223:51: (iv_ruleMonitoring= ruleMonitoring EOF )
            // InternalCanopus.g:224:2: iv_ruleMonitoring= ruleMonitoring EOF
            {
             newCompositeNode(grammarAccess.getMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitoring=ruleMonitoring();

            state._fsp--;

             current =iv_ruleMonitoring; 
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
    // $ANTLR end "entryRuleMonitoring"


    // $ANTLR start "ruleMonitoring"
    // InternalCanopus.g:230:1: ruleMonitoring returns [EObject current=null] : (otherlv_0= 'Monitoring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'projectLabel' ( (lv_projectLabel_4_0= ruleEString ) ) otherlv_5= 'projectAuthor' ( (lv_projectAuthor_6_0= ruleEString ) ) otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) (otherlv_9= 'sut' (otherlv_10= 's' )* ) ( (otherlv_11= RULE_ID ) )+ otherlv_12= 'loadGenerators' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' ) ;
    public final EObject ruleMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_projectLabel_4_0 = null;

        AntlrDatatypeRuleToken lv_projectAuthor_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:236:2: ( (otherlv_0= 'Monitoring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'projectLabel' ( (lv_projectLabel_4_0= ruleEString ) ) otherlv_5= 'projectAuthor' ( (lv_projectAuthor_6_0= ruleEString ) ) otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) (otherlv_9= 'sut' (otherlv_10= 's' )* ) ( (otherlv_11= RULE_ID ) )+ otherlv_12= 'loadGenerators' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' ) )
            // InternalCanopus.g:237:2: (otherlv_0= 'Monitoring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'projectLabel' ( (lv_projectLabel_4_0= ruleEString ) ) otherlv_5= 'projectAuthor' ( (lv_projectAuthor_6_0= ruleEString ) ) otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) (otherlv_9= 'sut' (otherlv_10= 's' )* ) ( (otherlv_11= RULE_ID ) )+ otherlv_12= 'loadGenerators' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )
            {
            // InternalCanopus.g:237:2: (otherlv_0= 'Monitoring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'projectLabel' ( (lv_projectLabel_4_0= ruleEString ) ) otherlv_5= 'projectAuthor' ( (lv_projectAuthor_6_0= ruleEString ) ) otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) (otherlv_9= 'sut' (otherlv_10= 's' )* ) ( (otherlv_11= RULE_ID ) )+ otherlv_12= 'loadGenerators' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}' )
            // InternalCanopus.g:238:3: otherlv_0= 'Monitoring' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'projectLabel' ( (lv_projectLabel_4_0= ruleEString ) ) otherlv_5= 'projectAuthor' ( (lv_projectAuthor_6_0= ruleEString ) ) otherlv_7= 'description' ( (lv_description_8_0= ruleEString ) ) (otherlv_9= 'sut' (otherlv_10= 's' )* ) ( (otherlv_11= RULE_ID ) )+ otherlv_12= 'loadGenerators' ( (otherlv_13= RULE_ID ) )+ otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMonitoringAccess().getMonitoringKeyword_0());
            		
            // InternalCanopus.g:242:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCanopus.g:243:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCanopus.g:243:4: (lv_name_1_0= RULE_ID )
            // InternalCanopus.g:244:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMonitoringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.unipampa.lesse.Canopus.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMonitoringAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitoringAccess().getProjectLabelKeyword_3());
            		
            // InternalCanopus.g:268:3: ( (lv_projectLabel_4_0= ruleEString ) )
            // InternalCanopus.g:269:4: (lv_projectLabel_4_0= ruleEString )
            {
            // InternalCanopus.g:269:4: (lv_projectLabel_4_0= ruleEString )
            // InternalCanopus.g:270:5: lv_projectLabel_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getProjectLabelEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_projectLabel_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"projectLabel",
            						lv_projectLabel_4_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getMonitoringAccess().getProjectAuthorKeyword_5());
            		
            // InternalCanopus.g:291:3: ( (lv_projectAuthor_6_0= ruleEString ) )
            // InternalCanopus.g:292:4: (lv_projectAuthor_6_0= ruleEString )
            {
            // InternalCanopus.g:292:4: (lv_projectAuthor_6_0= ruleEString )
            // InternalCanopus.g:293:5: lv_projectAuthor_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getProjectAuthorEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_projectAuthor_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"projectAuthor",
            						lv_projectAuthor_6_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMonitoringAccess().getDescriptionKeyword_7());
            		
            // InternalCanopus.g:314:3: ( (lv_description_8_0= ruleEString ) )
            // InternalCanopus.g:315:4: (lv_description_8_0= ruleEString )
            {
            // InternalCanopus.g:315:4: (lv_description_8_0= ruleEString )
            // InternalCanopus.g:316:5: lv_description_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitoringAccess().getDescriptionEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_description_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitoringRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_8_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanopus.g:333:3: (otherlv_9= 'sut' (otherlv_10= 's' )* )
            // InternalCanopus.g:334:4: otherlv_9= 'sut' (otherlv_10= 's' )*
            {
            otherlv_9=(Token)match(input,18,FOLLOW_16); 

            				newLeafNode(otherlv_9, grammarAccess.getMonitoringAccess().getSutKeyword_9_0());
            			
            // InternalCanopus.g:338:4: (otherlv_10= 's' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCanopus.g:339:5: otherlv_10= 's'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_16); 

            	    					newLeafNode(otherlv_10, grammarAccess.getMonitoringAccess().getSKeyword_9_1());
            	    				

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            // InternalCanopus.g:345:3: ( (otherlv_11= RULE_ID ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCanopus.g:346:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalCanopus.g:346:4: (otherlv_11= RULE_ID )
            	    // InternalCanopus.g:347:5: otherlv_11= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMonitoringRule());
            	    					}
            	    				
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    					newLeafNode(otherlv_11, grammarAccess.getMonitoringAccess().getSutsSUTCrossReference_10_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getMonitoringAccess().getLoadGeneratorsKeyword_11());
            		
            // InternalCanopus.g:362:3: ( (otherlv_13= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCanopus.g:363:4: (otherlv_13= RULE_ID )
            	    {
            	    // InternalCanopus.g:363:4: (otherlv_13= RULE_ID )
            	    // InternalCanopus.g:364:5: otherlv_13= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMonitoringRule());
            	    					}
            	    				
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_18); 

            	    					newLeafNode(otherlv_13, grammarAccess.getMonitoringAccess().getLoadGeneratorsLoadGeneratorCrossReference_12_0());
            	    				

            	    }


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

            otherlv_14=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getMonitoringAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleMonitoring"


    // $ANTLR start "entryRuleMetric"
    // InternalCanopus.g:383:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalCanopus.g:383:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalCanopus.g:384:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalCanopus.g:390:1: ruleMetric returns [EObject current=null] : (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk | this_Transaction_2= ruleTransaction ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        EObject this_Memory_0 = null;

        EObject this_Disk_1 = null;

        EObject this_Transaction_2 = null;



        	enterRule();

        try {
            // InternalCanopus.g:396:2: ( (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk | this_Transaction_2= ruleTransaction ) )
            // InternalCanopus.g:397:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk | this_Transaction_2= ruleTransaction )
            {
            // InternalCanopus.g:397:2: (this_Memory_0= ruleMemory | this_Disk_1= ruleDisk | this_Transaction_2= ruleTransaction )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 33:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCanopus.g:398:3: this_Memory_0= ruleMemory
                    {

                    			newCompositeNode(grammarAccess.getMetricAccess().getMemoryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Memory_0=ruleMemory();

                    state._fsp--;


                    			current = this_Memory_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCanopus.g:407:3: this_Disk_1= ruleDisk
                    {

                    			newCompositeNode(grammarAccess.getMetricAccess().getDiskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Disk_1=ruleDisk();

                    state._fsp--;


                    			current = this_Disk_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCanopus.g:416:3: this_Transaction_2= ruleTransaction
                    {

                    			newCompositeNode(grammarAccess.getMetricAccess().getTransactionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Transaction_2=ruleTransaction();

                    state._fsp--;


                    			current = this_Transaction_2;
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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleEString"
    // InternalCanopus.g:428:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCanopus.g:428:47: (iv_ruleEString= ruleEString EOF )
            // InternalCanopus.g:429:2: iv_ruleEString= ruleEString EOF
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
    // InternalCanopus.g:435:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCanopus.g:441:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCanopus.g:442:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCanopus.g:442:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCanopus.g:443:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCanopus.g:451:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSUT"
    // InternalCanopus.g:462:1: entryRuleSUT returns [EObject current=null] : iv_ruleSUT= ruleSUT EOF ;
    public final EObject entryRuleSUT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSUT = null;


        try {
            // InternalCanopus.g:462:44: (iv_ruleSUT= ruleSUT EOF )
            // InternalCanopus.g:463:2: iv_ruleSUT= ruleSUT EOF
            {
             newCompositeNode(grammarAccess.getSUTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSUT=ruleSUT();

            state._fsp--;

             current =iv_ruleSUT; 
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
    // $ANTLR end "entryRuleSUT"


    // $ANTLR start "ruleSUT"
    // InternalCanopus.g:469:1: ruleSUT returns [EObject current=null] : ( () otherlv_1= 'SUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )? otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )? otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHardware ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleSUTType ) )? otherlv_12= '}' ) ;
    public final EObject ruleSUT() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_hostname_5_0 = null;

        AntlrDatatypeRuleToken lv_ip_7_0 = null;

        Enumerator lv_hardware_9_0 = null;

        Enumerator lv_type_11_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:475:2: ( ( () otherlv_1= 'SUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )? otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )? otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHardware ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleSUTType ) )? otherlv_12= '}' ) )
            // InternalCanopus.g:476:2: ( () otherlv_1= 'SUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )? otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )? otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHardware ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleSUTType ) )? otherlv_12= '}' )
            {
            // InternalCanopus.g:476:2: ( () otherlv_1= 'SUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )? otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )? otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHardware ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleSUTType ) )? otherlv_12= '}' )
            // InternalCanopus.g:477:3: () otherlv_1= 'SUT' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'hostname' ( (lv_hostname_5_0= ruleEString ) )? otherlv_6= 'ip' ( (lv_ip_7_0= ruleEString ) )? otherlv_8= 'hardware' ( (lv_hardware_9_0= ruleHardware ) )? otherlv_10= 'type' ( (lv_type_11_0= ruleSUTType ) )? otherlv_12= '}'
            {
            // InternalCanopus.g:477:3: ()
            // InternalCanopus.g:478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSUTAccess().getSUTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSUTAccess().getSUTKeyword_1());
            		
            // InternalCanopus.g:488:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCanopus.g:489:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCanopus.g:489:4: (lv_name_2_0= RULE_ID )
            // InternalCanopus.g:490:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSUTAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSUTRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.unipampa.lesse.Canopus.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSUTAccess().getHostnameKeyword_4());
            		
            // InternalCanopus.g:514:3: ( (lv_hostname_5_0= ruleEString ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCanopus.g:515:4: (lv_hostname_5_0= ruleEString )
                    {
                    // InternalCanopus.g:515:4: (lv_hostname_5_0= ruleEString )
                    // InternalCanopus.g:516:5: lv_hostname_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getSUTAccess().getHostnameEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_hostname_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSUTRule());
                    					}
                    					set(
                    						current,
                    						"hostname",
                    						lv_hostname_5_0,
                    						"org.unipampa.lesse.Canopus.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getSUTAccess().getIpKeyword_6());
            		
            // InternalCanopus.g:537:3: ( (lv_ip_7_0= ruleEString ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCanopus.g:538:4: (lv_ip_7_0= ruleEString )
                    {
                    // InternalCanopus.g:538:4: (lv_ip_7_0= ruleEString )
                    // InternalCanopus.g:539:5: lv_ip_7_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getSUTAccess().getIpEStringParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_23);
                    lv_ip_7_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSUTRule());
                    					}
                    					set(
                    						current,
                    						"ip",
                    						lv_ip_7_0,
                    						"org.unipampa.lesse.Canopus.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getSUTAccess().getHardwareKeyword_8());
            		
            // InternalCanopus.g:560:3: ( (lv_hardware_9_0= ruleHardware ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=37 && LA12_0<=39)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCanopus.g:561:4: (lv_hardware_9_0= ruleHardware )
                    {
                    // InternalCanopus.g:561:4: (lv_hardware_9_0= ruleHardware )
                    // InternalCanopus.g:562:5: lv_hardware_9_0= ruleHardware
                    {

                    					newCompositeNode(grammarAccess.getSUTAccess().getHardwareHardwareEnumRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_hardware_9_0=ruleHardware();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSUTRule());
                    					}
                    					set(
                    						current,
                    						"hardware",
                    						lv_hardware_9_0,
                    						"org.unipampa.lesse.Canopus.Hardware");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getSUTAccess().getTypeKeyword_10());
            		
            // InternalCanopus.g:583:3: ( (lv_type_11_0= ruleSUTType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=40 && LA13_0<=43)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCanopus.g:584:4: (lv_type_11_0= ruleSUTType )
                    {
                    // InternalCanopus.g:584:4: (lv_type_11_0= ruleSUTType )
                    // InternalCanopus.g:585:5: lv_type_11_0= ruleSUTType
                    {

                    					newCompositeNode(grammarAccess.getSUTAccess().getTypeSUTTypeEnumRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_type_11_0=ruleSUTType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSUTRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_11_0,
                    						"org.unipampa.lesse.Canopus.SUTType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSUT"


    // $ANTLR start "entryRuleLoadGenerator"
    // InternalCanopus.g:610:1: entryRuleLoadGenerator returns [EObject current=null] : iv_ruleLoadGenerator= ruleLoadGenerator EOF ;
    public final EObject entryRuleLoadGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadGenerator = null;


        try {
            // InternalCanopus.g:610:54: (iv_ruleLoadGenerator= ruleLoadGenerator EOF )
            // InternalCanopus.g:611:2: iv_ruleLoadGenerator= ruleLoadGenerator EOF
            {
             newCompositeNode(grammarAccess.getLoadGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadGenerator=ruleLoadGenerator();

            state._fsp--;

             current =iv_ruleLoadGenerator; 
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
    // $ANTLR end "entryRuleLoadGenerator"


    // $ANTLR start "ruleLoadGenerator"
    // InternalCanopus.g:617:1: ruleLoadGenerator returns [EObject current=null] : (otherlv_0= 'LoadGenerator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHardware ) ) otherlv_9= '}' ) ;
    public final EObject ruleLoadGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_hostname_4_0 = null;

        AntlrDatatypeRuleToken lv_ip_6_0 = null;

        Enumerator lv_hardware_8_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:623:2: ( (otherlv_0= 'LoadGenerator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHardware ) ) otherlv_9= '}' ) )
            // InternalCanopus.g:624:2: (otherlv_0= 'LoadGenerator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHardware ) ) otherlv_9= '}' )
            {
            // InternalCanopus.g:624:2: (otherlv_0= 'LoadGenerator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHardware ) ) otherlv_9= '}' )
            // InternalCanopus.g:625:3: otherlv_0= 'LoadGenerator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'hostname' ( (lv_hostname_4_0= ruleEString ) ) otherlv_5= 'ip' ( (lv_ip_6_0= ruleEString ) ) otherlv_7= 'hardware' ( (lv_hardware_8_0= ruleHardware ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_0());
            		
            // InternalCanopus.g:629:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCanopus.g:630:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCanopus.g:630:4: (lv_name_1_0= RULE_ID )
            // InternalCanopus.g:631:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLoadGeneratorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoadGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.unipampa.lesse.Canopus.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getLoadGeneratorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadGeneratorAccess().getHostnameKeyword_3());
            		
            // InternalCanopus.g:655:3: ( (lv_hostname_4_0= ruleEString ) )
            // InternalCanopus.g:656:4: (lv_hostname_4_0= ruleEString )
            {
            // InternalCanopus.g:656:4: (lv_hostname_4_0= ruleEString )
            // InternalCanopus.g:657:5: lv_hostname_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHostnameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_hostname_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
            					}
            					set(
            						current,
            						"hostname",
            						lv_hostname_4_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getLoadGeneratorAccess().getIpKeyword_5());
            		
            // InternalCanopus.g:678:3: ( (lv_ip_6_0= ruleEString ) )
            // InternalCanopus.g:679:4: (lv_ip_6_0= ruleEString )
            {
            // InternalCanopus.g:679:4: (lv_ip_6_0= ruleEString )
            // InternalCanopus.g:680:5: lv_ip_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getIpEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_23);
            lv_ip_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_6_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getLoadGeneratorAccess().getHardwareKeyword_7());
            		
            // InternalCanopus.g:701:3: ( (lv_hardware_8_0= ruleHardware ) )
            // InternalCanopus.g:702:4: (lv_hardware_8_0= ruleHardware )
            {
            // InternalCanopus.g:702:4: (lv_hardware_8_0= ruleHardware )
            // InternalCanopus.g:703:5: lv_hardware_8_0= ruleHardware
            {

            					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHardwareHardwareEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
            lv_hardware_8_0=ruleHardware();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
            					}
            					set(
            						current,
            						"hardware",
            						lv_hardware_8_0,
            						"org.unipampa.lesse.Canopus.Hardware");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLoadGeneratorAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleLoadGenerator"


    // $ANTLR start "entryRuleMetricCollection"
    // InternalCanopus.g:728:1: entryRuleMetricCollection returns [EObject current=null] : iv_ruleMetricCollection= ruleMetricCollection EOF ;
    public final EObject entryRuleMetricCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetricCollection = null;


        try {
            // InternalCanopus.g:728:57: (iv_ruleMetricCollection= ruleMetricCollection EOF )
            // InternalCanopus.g:729:2: iv_ruleMetricCollection= ruleMetricCollection EOF
            {
             newCompositeNode(grammarAccess.getMetricCollectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetricCollection=ruleMetricCollection();

            state._fsp--;

             current =iv_ruleMetricCollection; 
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
    // $ANTLR end "entryRuleMetricCollection"


    // $ANTLR start "ruleMetricCollection"
    // InternalCanopus.g:735:1: ruleMetricCollection returns [EObject current=null] : (otherlv_0= 'MetricCollection' otherlv_1= '{' otherlv_2= 'metric' otherlv_3= '{' ( (lv_metric_4_0= ruleMetric ) ) (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleMetricCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_metric_4_0 = null;

        EObject lv_metric_6_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:741:2: ( (otherlv_0= 'MetricCollection' otherlv_1= '{' otherlv_2= 'metric' otherlv_3= '{' ( (lv_metric_4_0= ruleMetric ) ) (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // InternalCanopus.g:742:2: (otherlv_0= 'MetricCollection' otherlv_1= '{' otherlv_2= 'metric' otherlv_3= '{' ( (lv_metric_4_0= ruleMetric ) ) (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalCanopus.g:742:2: (otherlv_0= 'MetricCollection' otherlv_1= '{' otherlv_2= 'metric' otherlv_3= '{' ( (lv_metric_4_0= ruleMetric ) ) (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // InternalCanopus.g:743:3: otherlv_0= 'MetricCollection' otherlv_1= '{' otherlv_2= 'metric' otherlv_3= '{' ( (lv_metric_4_0= ruleMetric ) ) (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricCollectionAccess().getMetricCollectionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMetricCollectionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricCollectionAccess().getMetricKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getMetricCollectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCanopus.g:759:3: ( (lv_metric_4_0= ruleMetric ) )
            // InternalCanopus.g:760:4: (lv_metric_4_0= ruleMetric )
            {
            // InternalCanopus.g:760:4: (lv_metric_4_0= ruleMetric )
            // InternalCanopus.g:761:5: lv_metric_4_0= ruleMetric
            {

            					newCompositeNode(grammarAccess.getMetricCollectionAccess().getMetricMetricParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_metric_4_0=ruleMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetricCollectionRule());
            					}
            					add(
            						current,
            						"metric",
            						lv_metric_4_0,
            						"org.unipampa.lesse.Canopus.Metric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCanopus.g:778:3: (otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCanopus.g:779:4: otherlv_5= ',' ( (lv_metric_6_0= ruleMetric ) )
            	    {
            	    otherlv_5=(Token)match(input,30,FOLLOW_30); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMetricCollectionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCanopus.g:783:4: ( (lv_metric_6_0= ruleMetric ) )
            	    // InternalCanopus.g:784:5: (lv_metric_6_0= ruleMetric )
            	    {
            	    // InternalCanopus.g:784:5: (lv_metric_6_0= ruleMetric )
            	    // InternalCanopus.g:785:6: lv_metric_6_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getMetricCollectionAccess().getMetricMetricParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_metric_6_0=ruleMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMetricCollectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"metric",
            	    							lv_metric_6_0,
            	    							"org.unipampa.lesse.Canopus.Metric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_27); 

            			newLeafNode(otherlv_7, grammarAccess.getMetricCollectionAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMetricCollectionAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMetricCollection"


    // $ANTLR start "entryRuleMemory"
    // InternalCanopus.g:815:1: entryRuleMemory returns [EObject current=null] : iv_ruleMemory= ruleMemory EOF ;
    public final EObject entryRuleMemory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemory = null;


        try {
            // InternalCanopus.g:815:47: (iv_ruleMemory= ruleMemory EOF )
            // InternalCanopus.g:816:2: iv_ruleMemory= ruleMemory EOF
            {
             newCompositeNode(grammarAccess.getMemoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemory=ruleMemory();

            state._fsp--;

             current =iv_ruleMemory; 
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
    // $ANTLR end "entryRuleMemory"


    // $ANTLR start "ruleMemory"
    // InternalCanopus.g:822:1: ruleMemory returns [EObject current=null] : (otherlv_0= 'Memory' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleMemory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:828:2: ( (otherlv_0= 'Memory' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalCanopus.g:829:2: (otherlv_0= 'Memory' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalCanopus.g:829:2: (otherlv_0= 'Memory' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalCanopus.g:830:3: otherlv_0= 'Memory' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMemoryAccess().getMemoryKeyword_0());
            		
            // InternalCanopus.g:834:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCanopus.g:835:4: (lv_name_1_0= ruleEString )
            {
            // InternalCanopus.g:835:4: (lv_name_1_0= ruleEString )
            // InternalCanopus.g:836:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMemoryAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCanopus.g:857:3: (otherlv_3= 'threshold' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCanopus.g:858:4: otherlv_3= 'threshold' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getMemoryAccess().getThresholdKeyword_3_0());
                    			
                    // InternalCanopus.g:862:4: ( ( ruleEString ) )
                    // InternalCanopus.g:863:5: ( ruleEString )
                    {
                    // InternalCanopus.g:863:5: ( ruleEString )
                    // InternalCanopus.g:864:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoryRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMemoryAccess().getThresholdThresholdCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMemory"


    // $ANTLR start "entryRuleDisk"
    // InternalCanopus.g:887:1: entryRuleDisk returns [EObject current=null] : iv_ruleDisk= ruleDisk EOF ;
    public final EObject entryRuleDisk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisk = null;


        try {
            // InternalCanopus.g:887:45: (iv_ruleDisk= ruleDisk EOF )
            // InternalCanopus.g:888:2: iv_ruleDisk= ruleDisk EOF
            {
             newCompositeNode(grammarAccess.getDiskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisk=ruleDisk();

            state._fsp--;

             current =iv_ruleDisk; 
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
    // $ANTLR end "entryRuleDisk"


    // $ANTLR start "ruleDisk"
    // InternalCanopus.g:894:1: ruleDisk returns [EObject current=null] : (otherlv_0= 'Disk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDisk() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:900:2: ( (otherlv_0= 'Disk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalCanopus.g:901:2: (otherlv_0= 'Disk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalCanopus.g:901:2: (otherlv_0= 'Disk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalCanopus.g:902:3: otherlv_0= 'Disk' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getDiskAccess().getDiskKeyword_0());
            		
            // InternalCanopus.g:906:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCanopus.g:907:4: (lv_name_1_0= ruleEString )
            {
            // InternalCanopus.g:907:4: (lv_name_1_0= ruleEString )
            // InternalCanopus.g:908:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDiskAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDiskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getDiskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCanopus.g:929:3: (otherlv_3= 'threshold' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCanopus.g:930:4: otherlv_3= 'threshold' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getDiskAccess().getThresholdKeyword_3_0());
                    			
                    // InternalCanopus.g:934:4: ( ( ruleEString ) )
                    // InternalCanopus.g:935:5: ( ruleEString )
                    {
                    // InternalCanopus.g:935:5: ( ruleEString )
                    // InternalCanopus.g:936:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiskAccess().getThresholdThresholdCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCanopus.g:951:3: (otherlv_5= 'disk_io_counter' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCanopus.g:952:4: otherlv_5= 'disk_io_counter' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getDiskAccess().getDisk_io_counterKeyword_4_0());
                    			
                    // InternalCanopus.g:956:4: ( ( ruleEString ) )
                    // InternalCanopus.g:957:5: ( ruleEString )
                    {
                    // InternalCanopus.g:957:5: ( ruleEString )
                    // InternalCanopus.g:958:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDiskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDiskAccess().getDisk_io_counterDisk_IO_CounterCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDiskAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDisk"


    // $ANTLR start "entryRuleTransaction"
    // InternalCanopus.g:981:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // InternalCanopus.g:981:52: (iv_ruleTransaction= ruleTransaction EOF )
            // InternalCanopus.g:982:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
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
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // InternalCanopus.g:988:1: ruleTransaction returns [EObject current=null] : (otherlv_0= 'Transaction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCanopus.g:994:2: ( (otherlv_0= 'Transaction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalCanopus.g:995:2: (otherlv_0= 'Transaction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalCanopus.g:995:2: (otherlv_0= 'Transaction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalCanopus.g:996:3: otherlv_0= 'Transaction' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'threshold' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
            		
            // InternalCanopus.g:1000:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCanopus.g:1001:4: (lv_name_1_0= ruleEString )
            {
            // InternalCanopus.g:1001:4: (lv_name_1_0= ruleEString )
            // InternalCanopus.g:1002:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransactionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransactionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.unipampa.lesse.Canopus.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCanopus.g:1023:3: (otherlv_3= 'threshold' ( ( ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCanopus.g:1024:4: otherlv_3= 'threshold' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getThresholdKeyword_3_0());
                    			
                    // InternalCanopus.g:1028:4: ( ( ruleEString ) )
                    // InternalCanopus.g:1029:5: ( ruleEString )
                    {
                    // InternalCanopus.g:1029:5: ( ruleEString )
                    // InternalCanopus.g:1030:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransactionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransactionAccess().getThresholdThresholdCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleEInt"
    // InternalCanopus.g:1053:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCanopus.g:1053:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCanopus.g:1054:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCanopus.g:1060:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCanopus.g:1066:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCanopus.g:1067:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCanopus.g:1067:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCanopus.g:1068:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCanopus.g:1068:3: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCanopus.g:1069:4: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_35); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleHardware"
    // InternalCanopus.g:1086:1: ruleHardware returns [Enumerator current=null] : ( (enumLiteral_0= 'PHYSICA_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) ;
    public final Enumerator ruleHardware() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCanopus.g:1092:2: ( ( (enumLiteral_0= 'PHYSICA_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) ) )
            // InternalCanopus.g:1093:2: ( (enumLiteral_0= 'PHYSICA_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            {
            // InternalCanopus.g:1093:2: ( (enumLiteral_0= 'PHYSICA_MACHINE' ) | (enumLiteral_1= 'VIRTUAL_MACHINE' ) | (enumLiteral_2= 'CLOUD_SERVICE' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt20=1;
                }
                break;
            case 38:
                {
                alt20=2;
                }
                break;
            case 39:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalCanopus.g:1094:3: (enumLiteral_0= 'PHYSICA_MACHINE' )
                    {
                    // InternalCanopus.g:1094:3: (enumLiteral_0= 'PHYSICA_MACHINE' )
                    // InternalCanopus.g:1095:4: enumLiteral_0= 'PHYSICA_MACHINE'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getHardwareAccess().getPHYSICA_MACHINEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getHardwareAccess().getPHYSICA_MACHINEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCanopus.g:1102:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    {
                    // InternalCanopus.g:1102:3: (enumLiteral_1= 'VIRTUAL_MACHINE' )
                    // InternalCanopus.g:1103:4: enumLiteral_1= 'VIRTUAL_MACHINE'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getHardwareAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getHardwareAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCanopus.g:1110:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    {
                    // InternalCanopus.g:1110:3: (enumLiteral_2= 'CLOUD_SERVICE' )
                    // InternalCanopus.g:1111:4: enumLiteral_2= 'CLOUD_SERVICE'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getHardwareAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getHardwareAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleHardware"


    // $ANTLR start "ruleSUTType"
    // InternalCanopus.g:1121:1: ruleSUTType returns [Enumerator current=null] : ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) ;
    public final Enumerator ruleSUTType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCanopus.g:1127:2: ( ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) ) )
            // InternalCanopus.g:1128:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            {
            // InternalCanopus.g:1128:2: ( (enumLiteral_0= 'DESKTOPAPP' ) | (enumLiteral_1= 'DATABASE' ) | (enumLiteral_2= 'WEBAPP' ) | (enumLiteral_3= 'WEBSERVICE' ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 43:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalCanopus.g:1129:3: (enumLiteral_0= 'DESKTOPAPP' )
                    {
                    // InternalCanopus.g:1129:3: (enumLiteral_0= 'DESKTOPAPP' )
                    // InternalCanopus.g:1130:4: enumLiteral_0= 'DESKTOPAPP'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSUTTypeAccess().getDESKTOPAPPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSUTTypeAccess().getDESKTOPAPPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCanopus.g:1137:3: (enumLiteral_1= 'DATABASE' )
                    {
                    // InternalCanopus.g:1137:3: (enumLiteral_1= 'DATABASE' )
                    // InternalCanopus.g:1138:4: enumLiteral_1= 'DATABASE'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSUTTypeAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSUTTypeAccess().getDATABASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCanopus.g:1145:3: (enumLiteral_2= 'WEBAPP' )
                    {
                    // InternalCanopus.g:1145:3: (enumLiteral_2= 'WEBAPP' )
                    // InternalCanopus.g:1146:4: enumLiteral_2= 'WEBAPP'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getSUTTypeAccess().getWEBAPPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSUTTypeAccess().getWEBAPPEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCanopus.g:1153:3: (enumLiteral_3= 'WEBSERVICE' )
                    {
                    // InternalCanopus.g:1153:3: (enumLiteral_3= 'WEBSERVICE' )
                    // InternalCanopus.g:1154:4: enumLiteral_3= 'WEBSERVICE'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSUTTypeAccess().getWEBSERVICEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSUTTypeAccess().getWEBSERVICEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleSUTType"


    // $ANTLR start "ruleCOUNTER_DISK"
    // InternalCanopus.g:1164:1: ruleCOUNTER_DISK returns [Enumerator current=null] : ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= '_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) ;
    public final Enumerator ruleCOUNTER_DISK() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalCanopus.g:1170:2: ( ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= '_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) ) )
            // InternalCanopus.g:1171:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= '_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            {
            // InternalCanopus.g:1171:2: ( (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' ) | (enumLiteral_1= '_IDLE_TIME_COUNTER' ) | (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' ) | (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' ) | (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' ) | (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt22=1;
                }
                break;
            case 45:
                {
                alt22=2;
                }
                break;
            case 46:
                {
                alt22=3;
                }
                break;
            case 47:
                {
                alt22=4;
                }
                break;
            case 48:
                {
                alt22=5;
                }
                break;
            case 49:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalCanopus.g:1172:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    {
                    // InternalCanopus.g:1172:3: (enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER' )
                    // InternalCanopus.g:1173:4: enumLiteral_0= 'AVG_DISK_SECS_TRANSFER_COUNTER'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCanopus.g:1180:3: (enumLiteral_1= '_IDLE_TIME_COUNTER' )
                    {
                    // InternalCanopus.g:1180:3: (enumLiteral_1= '_IDLE_TIME_COUNTER' )
                    // InternalCanopus.g:1181:4: enumLiteral_1= '_IDLE_TIME_COUNTER'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().get_IDLE_TIME_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_DISKAccess().get_IDLE_TIME_COUNTEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCanopus.g:1188:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    {
                    // InternalCanopus.g:1188:3: (enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER' )
                    // InternalCanopus.g:1189:4: enumLiteral_2= 'DISK_TRANSFERS_SEC_COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCanopus.g:1196:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    {
                    // InternalCanopus.g:1196:3: (enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER' )
                    // InternalCanopus.g:1197:4: enumLiteral_3= 'AVG_DISK_QUEUE_LENGTH_COUNTER'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCanopus.g:1204:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    {
                    // InternalCanopus.g:1204:3: (enumLiteral_4= 'SPLIT_IO_SEC_COUNTER' )
                    // InternalCanopus.g:1205:4: enumLiteral_4= 'SPLIT_IO_SEC_COUNTER'
                    {
                    enumLiteral_4=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalCanopus.g:1212:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    {
                    // InternalCanopus.g:1212:3: (enumLiteral_5= 'FREE_MEGABYTES_COUNTER' )
                    // InternalCanopus.g:1213:4: enumLiteral_5= 'FREE_MEGABYTES_COUNTER'
                    {
                    enumLiteral_5=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleCOUNTER_DISK"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008402802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000008402002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000E004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000F0000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000500200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});

}