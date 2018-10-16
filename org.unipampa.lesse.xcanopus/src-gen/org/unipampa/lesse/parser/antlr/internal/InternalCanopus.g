/*
 * generated by Xtext 2.14.0
 */
grammar InternalCanopus;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.unipampa.lesse.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getIncludesIncludeParserRuleCall_0_0());
				}
				lv_includes_0_0=ruleInclude
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"includes",
						lv_includes_0_0,
						"org.unipampa.lesse.Canopus.Include");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getMonitoringsMonitoringParserRuleCall_1_0());
				}
				lv_monitorings_1_0=ruleMonitoring
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"monitorings",
						lv_monitorings_1_0,
						"org.unipampa.lesse.Canopus.Monitoring");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getSutsSUTParserRuleCall_2_0());
				}
				lv_suts_2_0=ruleSUT
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"suts",
						lv_suts_2_0,
						"org.unipampa.lesse.Canopus.SUT");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getLoadGeneratorsLoadGeneratorParserRuleCall_3_0());
				}
				lv_loadGenerators_3_0=ruleLoadGenerator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"loadGenerators",
						lv_loadGenerators_3_0,
						"org.unipampa.lesse.Canopus.LoadGenerator");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInclude
entryRuleInclude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncludeRule()); }
	iv_ruleInclude=ruleInclude
	{ $current=$iv_ruleInclude.current; }
	EOF;

// Rule Include
ruleInclude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='include'
		{
			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
		}
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.unipampa.lesse.Canopus.STRING");
				}
			)
		)
		otherlv_2='as'
		{
			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getAsKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getIncludeAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncludeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.unipampa.lesse.Canopus.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleMonitoring
entryRuleMonitoring returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMonitoringRule()); }
	iv_ruleMonitoring=ruleMonitoring
	{ $current=$iv_ruleMonitoring.current; }
	EOF;

// Rule Monitoring
ruleMonitoring returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Monitoring'
		{
			newLeafNode(otherlv_0, grammarAccess.getMonitoringAccess().getMonitoringKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMonitoringAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonitoringRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.unipampa.lesse.Canopus.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMonitoringAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='projectLabel'
		{
			newLeafNode(otherlv_3, grammarAccess.getMonitoringAccess().getProjectLabelKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonitoringAccess().getProjectLabelEStringParserRuleCall_4_0());
				}
				lv_projectLabel_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonitoringRule());
					}
					set(
						$current,
						"projectLabel",
						lv_projectLabel_4_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='projectAuthor'
		{
			newLeafNode(otherlv_5, grammarAccess.getMonitoringAccess().getProjectAuthorKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonitoringAccess().getProjectAuthorEStringParserRuleCall_6_0());
				}
				lv_projectAuthor_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonitoringRule());
					}
					set(
						$current,
						"projectAuthor",
						lv_projectAuthor_6_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='description'
		{
			newLeafNode(otherlv_7, grammarAccess.getMonitoringAccess().getDescriptionKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMonitoringAccess().getDescriptionEStringParserRuleCall_8_0());
				}
				lv_description_8_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMonitoringRule());
					}
					set(
						$current,
						"description",
						lv_description_8_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_9='sut'
			{
				newLeafNode(otherlv_9, grammarAccess.getMonitoringAccess().getSutKeyword_9_0());
			}
			(
				otherlv_10='s'
				{
					newLeafNode(otherlv_10, grammarAccess.getMonitoringAccess().getSKeyword_9_1());
				}
			)*
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonitoringRule());
					}
				}
				otherlv_11=RULE_ID
				{
					newLeafNode(otherlv_11, grammarAccess.getMonitoringAccess().getSutsSUTCrossReference_10_0());
				}
			)
		)+
		otherlv_12='loadGenerators'
		{
			newLeafNode(otherlv_12, grammarAccess.getMonitoringAccess().getLoadGeneratorsKeyword_11());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMonitoringRule());
					}
				}
				otherlv_13=RULE_ID
				{
					newLeafNode(otherlv_13, grammarAccess.getMonitoringAccess().getLoadGeneratorsLoadGeneratorCrossReference_12_0());
				}
			)
		)+
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getMonitoringAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleMetric
entryRuleMetric returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetricRule()); }
	iv_ruleMetric=ruleMetric
	{ $current=$iv_ruleMetric.current; }
	EOF;

// Rule Metric
ruleMetric returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMetricAccess().getMemoryParserRuleCall_0());
		}
		this_Memory_0=ruleMemory
		{
			$current = $this_Memory_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMetricAccess().getDiskParserRuleCall_1());
		}
		this_Disk_1=ruleDisk
		{
			$current = $this_Disk_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMetricAccess().getTransactionParserRuleCall_2());
		}
		this_Transaction_2=ruleTransaction
		{
			$current = $this_Transaction_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleSUT
entryRuleSUT returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSUTRule()); }
	iv_ruleSUT=ruleSUT
	{ $current=$iv_ruleSUT.current; }
	EOF;

// Rule SUT
ruleSUT returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSUTAccess().getSUTAction_0(),
					$current);
			}
		)
		otherlv_1='SUT'
		{
			newLeafNode(otherlv_1, grammarAccess.getSUTAccess().getSUTKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getSUTAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSUTRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.unipampa.lesse.Canopus.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getSUTAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='hostname'
		{
			newLeafNode(otherlv_4, grammarAccess.getSUTAccess().getHostnameKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSUTAccess().getHostnameEStringParserRuleCall_5_0());
				}
				lv_hostname_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSUTRule());
					}
					set(
						$current,
						"hostname",
						lv_hostname_5_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_6='ip'
		{
			newLeafNode(otherlv_6, grammarAccess.getSUTAccess().getIpKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSUTAccess().getIpEStringParserRuleCall_7_0());
				}
				lv_ip_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSUTRule());
					}
					set(
						$current,
						"ip",
						lv_ip_7_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_8='hardware'
		{
			newLeafNode(otherlv_8, grammarAccess.getSUTAccess().getHardwareKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSUTAccess().getHardwareHardwareEnumRuleCall_9_0());
				}
				lv_hardware_9_0=ruleHardware
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSUTRule());
					}
					set(
						$current,
						"hardware",
						lv_hardware_9_0,
						"org.unipampa.lesse.Canopus.Hardware");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_10='type'
		{
			newLeafNode(otherlv_10, grammarAccess.getSUTAccess().getTypeKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSUTAccess().getTypeSUTTypeEnumRuleCall_11_0());
				}
				lv_type_11_0=ruleSUTType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSUTRule());
					}
					set(
						$current,
						"type",
						lv_type_11_0,
						"org.unipampa.lesse.Canopus.SUTType");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getSUTAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleLoadGenerator
entryRuleLoadGenerator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoadGeneratorRule()); }
	iv_ruleLoadGenerator=ruleLoadGenerator
	{ $current=$iv_ruleLoadGenerator.current; }
	EOF;

// Rule LoadGenerator
ruleLoadGenerator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LoadGenerator'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoadGeneratorAccess().getLoadGeneratorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getLoadGeneratorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLoadGeneratorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.unipampa.lesse.Canopus.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLoadGeneratorAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='hostname'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoadGeneratorAccess().getHostnameKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHostnameEStringParserRuleCall_4_0());
				}
				lv_hostname_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
					}
					set(
						$current,
						"hostname",
						lv_hostname_4_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='ip'
		{
			newLeafNode(otherlv_5, grammarAccess.getLoadGeneratorAccess().getIpKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getIpEStringParserRuleCall_6_0());
				}
				lv_ip_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
					}
					set(
						$current,
						"ip",
						lv_ip_6_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='hardware'
		{
			newLeafNode(otherlv_7, grammarAccess.getLoadGeneratorAccess().getHardwareKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadGeneratorAccess().getHardwareHardwareEnumRuleCall_8_0());
				}
				lv_hardware_8_0=ruleHardware
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadGeneratorRule());
					}
					set(
						$current,
						"hardware",
						lv_hardware_8_0,
						"org.unipampa.lesse.Canopus.Hardware");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getLoadGeneratorAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleMetricCollection
entryRuleMetricCollection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMetricCollectionRule()); }
	iv_ruleMetricCollection=ruleMetricCollection
	{ $current=$iv_ruleMetricCollection.current; }
	EOF;

// Rule MetricCollection
ruleMetricCollection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MetricCollection'
		{
			newLeafNode(otherlv_0, grammarAccess.getMetricCollectionAccess().getMetricCollectionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getMetricCollectionAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='metric'
		{
			newLeafNode(otherlv_2, grammarAccess.getMetricCollectionAccess().getMetricKeyword_2());
		}
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getMetricCollectionAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMetricCollectionAccess().getMetricMetricParserRuleCall_4_0());
				}
				lv_metric_4_0=ruleMetric
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMetricCollectionRule());
					}
					add(
						$current,
						"metric",
						lv_metric_4_0,
						"org.unipampa.lesse.Canopus.Metric");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getMetricCollectionAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMetricCollectionAccess().getMetricMetricParserRuleCall_5_1_0());
					}
					lv_metric_6_0=ruleMetric
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMetricCollectionRule());
						}
						add(
							$current,
							"metric",
							lv_metric_6_0,
							"org.unipampa.lesse.Canopus.Metric");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getMetricCollectionAccess().getRightCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getMetricCollectionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleMemory
entryRuleMemory returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemoryRule()); }
	iv_ruleMemory=ruleMemory
	{ $current=$iv_ruleMemory.current; }
	EOF;

// Rule Memory
ruleMemory returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Memory'
		{
			newLeafNode(otherlv_0, grammarAccess.getMemoryAccess().getMemoryKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMemoryAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMemoryRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMemoryAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='threshold'
			{
				newLeafNode(otherlv_3, grammarAccess.getMemoryAccess().getThresholdKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMemoryRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getMemoryAccess().getThresholdThresholdCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getMemoryAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDisk
entryRuleDisk returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDiskRule()); }
	iv_ruleDisk=ruleDisk
	{ $current=$iv_ruleDisk.current; }
	EOF;

// Rule Disk
ruleDisk returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Disk'
		{
			newLeafNode(otherlv_0, grammarAccess.getDiskAccess().getDiskKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDiskAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDiskRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDiskAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='threshold'
			{
				newLeafNode(otherlv_3, grammarAccess.getDiskAccess().getThresholdKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDiskRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getDiskAccess().getThresholdThresholdCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='disk_io_counter'
			{
				newLeafNode(otherlv_5, grammarAccess.getDiskAccess().getDisk_io_counterKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDiskRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getDiskAccess().getDisk_io_counterDisk_IO_CounterCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getDiskAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleTransaction
entryRuleTransaction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransactionRule()); }
	iv_ruleTransaction=ruleTransaction
	{ $current=$iv_ruleTransaction.current; }
	EOF;

// Rule Transaction
ruleTransaction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transaction'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransactionAccess().getTransactionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTransactionAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransactionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.unipampa.lesse.Canopus.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransactionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='threshold'
			{
				newLeafNode(otherlv_3, grammarAccess.getTransactionAccess().getThresholdKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransactionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTransactionAccess().getThresholdThresholdCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getTransactionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Rule Hardware
ruleHardware returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='PHYSICA_MACHINE'
			{
				$current = grammarAccess.getHardwareAccess().getPHYSICA_MACHINEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getHardwareAccess().getPHYSICA_MACHINEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='VIRTUAL_MACHINE'
			{
				$current = grammarAccess.getHardwareAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getHardwareAccess().getVIRTUAL_MACHINEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CLOUD_SERVICE'
			{
				$current = grammarAccess.getHardwareAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getHardwareAccess().getCLOUD_SERVICEEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule SUTType
ruleSUTType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DESKTOPAPP'
			{
				$current = grammarAccess.getSUTTypeAccess().getDESKTOPAPPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSUTTypeAccess().getDESKTOPAPPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='DATABASE'
			{
				$current = grammarAccess.getSUTTypeAccess().getDATABASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSUTTypeAccess().getDATABASEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='WEBAPP'
			{
				$current = grammarAccess.getSUTTypeAccess().getWEBAPPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSUTTypeAccess().getWEBAPPEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='WEBSERVICE'
			{
				$current = grammarAccess.getSUTTypeAccess().getWEBSERVICEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getSUTTypeAccess().getWEBSERVICEEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule COUNTER_DISK
ruleCOUNTER_DISK returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='AVG_DISK_SECS_TRANSFER_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_SECS_TRANSFER_COUNTEREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='_IDLE_TIME_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().get_IDLE_TIME_COUNTEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCOUNTER_DISKAccess().get_IDLE_TIME_COUNTEREnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='DISK_TRANSFERS_SEC_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCOUNTER_DISKAccess().getDISK_TRANSFERS_SEC_COUNTEREnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='AVG_DISK_QUEUE_LENGTH_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCOUNTER_DISKAccess().getAVG_DISK_QUEUE_LENGTH_COUNTEREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='SPLIT_IO_SEC_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getCOUNTER_DISKAccess().getSPLIT_IO_SEC_COUNTEREnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='FREE_MEGABYTES_COUNTER'
			{
				$current = grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getCOUNTER_DISKAccess().getFREE_MEGABYTES_COUNTEREnumLiteralDeclaration_5());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
