/**
 * generated by Xtext 2.13.0
 */
package it.unibz.inf.ontouml.xtext;

import com.google.inject.Injector;
import it.unibz.inf.ontouml.xtext.OntoUMLStandaloneSetupGenerated;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;
import org.eclipse.emf.ecore.EPackage;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class OntoUMLStandaloneSetup extends OntoUMLStandaloneSetupGenerated {
  public static void doSetup() {
    new OntoUMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
  
  @Override
  public void register(final Injector injector) {
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey("http://www.inf.unibz.it/ontouml/xtext/xcore");
    boolean _not = (!_containsKey);
    if (_not) {
      EPackage.Registry.INSTANCE.put("http://www.inf.unibz.it/ontouml/xtext/xcore", XcorePackage.eINSTANCE);
    }
    super.register(injector);
  }
}
