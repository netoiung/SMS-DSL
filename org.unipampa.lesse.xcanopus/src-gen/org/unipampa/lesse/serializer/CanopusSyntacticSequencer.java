/*
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.unipampa.lesse.services.CanopusGrammarAccess;

@SuppressWarnings("all")
public class CanopusSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CanopusGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Monitoring_SKeyword_9_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CanopusGrammarAccess) access;
		match_Monitoring_SKeyword_9_1_a = new TokenAlias(true, true, grammarAccess.getMonitoringAccess().getSKeyword_9_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Monitoring_SKeyword_9_1_a.equals(syntax))
				emit_Monitoring_SKeyword_9_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     's'*
	 *
	 * This ambiguous syntax occurs at:
	 *     description=EString 'sut' (ambiguity) suts+=[SUT|ID]
	 */
	protected void emit_Monitoring_SKeyword_9_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
