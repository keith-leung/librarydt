/*
 * generated by Xtext 2.35.0
 */
package mdu.mydsl.ui.tests;

import com.google.inject.Injector;
import mdu.mydsl.ui.internal.MydslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MydslActivator.getInstance().getInjector("mdu.mydsl.MyDsl");
	}

}
