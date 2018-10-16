/*
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.unipampa.lesse.xcanopus.ui.internal.XcanopusActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CanopusExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XcanopusActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XcanopusActivator activator = XcanopusActivator.getInstance();
		return activator != null ? activator.getInjector(XcanopusActivator.ORG_UNIPAMPA_LESSE_CANOPUS) : null;
	}

}