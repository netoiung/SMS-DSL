/*
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.unipampa.lesse.ide.contentassist.antlr.internal.InternalCanopusParser;
import org.unipampa.lesse.services.CanopusGrammarAccess;

public class CanopusParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CanopusGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CanopusGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getMetricAccess().getAlternatives(), "rule__Metric__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getHardwareAccess().getAlternatives(), "rule__Hardware__Alternatives");
			builder.put(grammarAccess.getSUTTypeAccess().getAlternatives(), "rule__SUTType__Alternatives");
			builder.put(grammarAccess.getCOUNTER_DISKAccess().getAlternatives(), "rule__COUNTER_DISK__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup(), "rule__Monitoring__Group__0");
			builder.put(grammarAccess.getMonitoringAccess().getGroup_9(), "rule__Monitoring__Group_9__0");
			builder.put(grammarAccess.getSUTAccess().getGroup(), "rule__SUT__Group__0");
			builder.put(grammarAccess.getLoadGeneratorAccess().getGroup(), "rule__LoadGenerator__Group__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup(), "rule__Monitor__Group__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_3(), "rule__Monitor__Group_3__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_4(), "rule__Monitor__Group_4__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_5(), "rule__Monitor__Group_5__0");
			builder.put(grammarAccess.getMonitorAccess().getGroup_6(), "rule__Monitor__Group_6__0");
			builder.put(grammarAccess.getMetricModelAccess().getGroup(), "rule__MetricModel__Group__0");
			builder.put(grammarAccess.getMetricModelAccess().getGroup_3(), "rule__MetricModel__Group_3__0");
			builder.put(grammarAccess.getMetricModelAccess().getGroup_3_3(), "rule__MetricModel__Group_3_3__0");
			builder.put(grammarAccess.getMetricCollectionAccess().getGroup(), "rule__MetricCollection__Group__0");
			builder.put(grammarAccess.getMetricCollectionAccess().getGroup_5(), "rule__MetricCollection__Group_5__0");
			builder.put(grammarAccess.getThresholdAccess().getGroup(), "rule__Threshold__Group__0");
			builder.put(grammarAccess.getThresholdAccess().getGroup_3(), "rule__Threshold__Group_3__0");
			builder.put(grammarAccess.getMemoryAccess().getGroup(), "rule__Memory__Group__0");
			builder.put(grammarAccess.getMemoryAccess().getGroup_3(), "rule__Memory__Group_3__0");
			builder.put(grammarAccess.getDiskAccess().getGroup(), "rule__Disk__Group__0");
			builder.put(grammarAccess.getDiskAccess().getGroup_3(), "rule__Disk__Group_3__0");
			builder.put(grammarAccess.getDiskAccess().getGroup_4(), "rule__Disk__Group_4__0");
			builder.put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
			builder.put(grammarAccess.getTransactionAccess().getGroup_3(), "rule__Transaction__Group_3__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getGroup(), "rule__Disk_IO_Counter__Group__0");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getGroup_3(), "rule__Disk_IO_Counter__Group_3__0");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getGroup_3_3(), "rule__Disk_IO_Counter__Group_3_3__0");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getGroup_4(), "rule__Disk_IO_Counter__Group_4__0");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getGroup_5(), "rule__Disk_IO_Counter__Group_5__0");
			builder.put(grammarAccess.getCriteriaAccess().getGroup(), "rule__Criteria__Group__0");
			builder.put(grammarAccess.getCriteriaAccess().getGroup_3(), "rule__Criteria__Group_3__0");
			builder.put(grammarAccess.getCriteriaAccess().getGroup_4(), "rule__Criteria__Group_4__0");
			builder.put(grammarAccess.getModelAccess().getIncludesAssignment_0(), "rule__Model__IncludesAssignment_0");
			builder.put(grammarAccess.getModelAccess().getMonitoringsAssignment_1(), "rule__Model__MonitoringsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getSutsAssignment_2(), "rule__Model__SutsAssignment_2");
			builder.put(grammarAccess.getModelAccess().getLoadGeneratorsAssignment_3(), "rule__Model__LoadGeneratorsAssignment_3");
			builder.put(grammarAccess.getIncludeAccess().getImportURIAssignment_1(), "rule__Include__ImportURIAssignment_1");
			builder.put(grammarAccess.getIncludeAccess().getNameAssignment_3(), "rule__Include__NameAssignment_3");
			builder.put(grammarAccess.getMonitoringAccess().getNameAssignment_1(), "rule__Monitoring__NameAssignment_1");
			builder.put(grammarAccess.getMonitoringAccess().getProjectLabelAssignment_4(), "rule__Monitoring__ProjectLabelAssignment_4");
			builder.put(grammarAccess.getMonitoringAccess().getProjectAuthorAssignment_6(), "rule__Monitoring__ProjectAuthorAssignment_6");
			builder.put(grammarAccess.getMonitoringAccess().getDescriptionAssignment_8(), "rule__Monitoring__DescriptionAssignment_8");
			builder.put(grammarAccess.getMonitoringAccess().getSutsAssignment_10(), "rule__Monitoring__SutsAssignment_10");
			builder.put(grammarAccess.getMonitoringAccess().getLoadGeneratorsAssignment_12(), "rule__Monitoring__LoadGeneratorsAssignment_12");
			builder.put(grammarAccess.getSUTAccess().getNameAssignment_2(), "rule__SUT__NameAssignment_2");
			builder.put(grammarAccess.getSUTAccess().getHostnameAssignment_5(), "rule__SUT__HostnameAssignment_5");
			builder.put(grammarAccess.getSUTAccess().getIpAssignment_7(), "rule__SUT__IpAssignment_7");
			builder.put(grammarAccess.getSUTAccess().getHardwareAssignment_9(), "rule__SUT__HardwareAssignment_9");
			builder.put(grammarAccess.getSUTAccess().getTypeAssignment_11(), "rule__SUT__TypeAssignment_11");
			builder.put(grammarAccess.getLoadGeneratorAccess().getNameAssignment_1(), "rule__LoadGenerator__NameAssignment_1");
			builder.put(grammarAccess.getLoadGeneratorAccess().getHostnameAssignment_4(), "rule__LoadGenerator__HostnameAssignment_4");
			builder.put(grammarAccess.getLoadGeneratorAccess().getIpAssignment_6(), "rule__LoadGenerator__IpAssignment_6");
			builder.put(grammarAccess.getLoadGeneratorAccess().getHardwareAssignment_8(), "rule__LoadGenerator__HardwareAssignment_8");
			builder.put(grammarAccess.getMonitorAccess().getHostnameAssignment_3_1(), "rule__Monitor__HostnameAssignment_3_1");
			builder.put(grammarAccess.getMonitorAccess().getIpAssignment_4_1(), "rule__Monitor__IpAssignment_4_1");
			builder.put(grammarAccess.getMonitorAccess().getHardwareAssignment_5_1(), "rule__Monitor__HardwareAssignment_5_1");
			builder.put(grammarAccess.getMonitorAccess().getSutAssignment_6_1(), "rule__Monitor__SutAssignment_6_1");
			builder.put(grammarAccess.getMetricModelAccess().getNameAssignment_1(), "rule__MetricModel__NameAssignment_1");
			builder.put(grammarAccess.getMetricModelAccess().getMetricmodelAssignment_3_2(), "rule__MetricModel__MetricmodelAssignment_3_2");
			builder.put(grammarAccess.getMetricModelAccess().getMetricmodelAssignment_3_3_1(), "rule__MetricModel__MetricmodelAssignment_3_3_1");
			builder.put(grammarAccess.getMetricCollectionAccess().getMetricAssignment_4(), "rule__MetricCollection__MetricAssignment_4");
			builder.put(grammarAccess.getMetricCollectionAccess().getMetricAssignment_5_1(), "rule__MetricCollection__MetricAssignment_5_1");
			builder.put(grammarAccess.getThresholdAccess().getValueAssignment_3_1(), "rule__Threshold__ValueAssignment_3_1");
			builder.put(grammarAccess.getMemoryAccess().getNameAssignment_1(), "rule__Memory__NameAssignment_1");
			builder.put(grammarAccess.getMemoryAccess().getThresholdAssignment_3_1(), "rule__Memory__ThresholdAssignment_3_1");
			builder.put(grammarAccess.getDiskAccess().getNameAssignment_1(), "rule__Disk__NameAssignment_1");
			builder.put(grammarAccess.getDiskAccess().getThresholdAssignment_3_1(), "rule__Disk__ThresholdAssignment_3_1");
			builder.put(grammarAccess.getDiskAccess().getDisk_io_counterAssignment_4_1(), "rule__Disk__Disk_io_counterAssignment_4_1");
			builder.put(grammarAccess.getTransactionAccess().getNameAssignment_1(), "rule__Transaction__NameAssignment_1");
			builder.put(grammarAccess.getTransactionAccess().getThresholdAssignment_3_1(), "rule__Transaction__ThresholdAssignment_3_1");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getNameAssignment_1(), "rule__Disk_IO_Counter__NameAssignment_1");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskAssignment_3_2(), "rule__Disk_IO_Counter__CounterDiskAssignment_3_2");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getCounterDiskAssignment_3_3_1(), "rule__Disk_IO_Counter__CounterDiskAssignment_3_3_1");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getThresholdAssignment_4_1(), "rule__Disk_IO_Counter__ThresholdAssignment_4_1");
			builder.put(grammarAccess.getDisk_IO_CounterAccess().getCriteriaAssignment_5_1(), "rule__Disk_IO_Counter__CriteriaAssignment_5_1");
			builder.put(grammarAccess.getCriteriaAccess().getValueAssignment_3_1(), "rule__Criteria__ValueAssignment_3_1");
			builder.put(grammarAccess.getCriteriaAccess().getThresholdAssignment_4_1(), "rule__Criteria__ThresholdAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CanopusGrammarAccess grammarAccess;

	@Override
	protected InternalCanopusParser createParser() {
		InternalCanopusParser result = new InternalCanopusParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CanopusGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CanopusGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
