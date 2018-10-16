/**
 * generated by Xtext 2.14.0
 */
package org.unipampa.lesse.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.unipampa.lesse.CanopusRuntimeModule;
import org.unipampa.lesse.CanopusStandaloneSetup;
import org.unipampa.lesse.ide.CanopusIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class CanopusIdeSetup extends CanopusStandaloneSetup {
  @Override
  public Injector createInjector() {
    CanopusRuntimeModule _canopusRuntimeModule = new CanopusRuntimeModule();
    CanopusIdeModule _canopusIdeModule = new CanopusIdeModule();
    return Guice.createInjector(Modules2.mixin(_canopusRuntimeModule, _canopusIdeModule));
  }
}
