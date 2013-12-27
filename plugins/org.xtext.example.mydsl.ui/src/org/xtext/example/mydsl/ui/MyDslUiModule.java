/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.model.IResourceForEditorInputFactory;
import org.eclipse.xtext.ui.editor.model.ResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapperJdtExtensions;
import org.eclipse.xtext.ui.resource.SimpleResourceSetProvider;
import org.eclipse.xtext.ui.shared.Access;

import com.google.inject.Binder;
import com.google.inject.util.Providers;

/**
 * Use this class to register components to be used within the IDE.
 */
public class MyDslUiModule extends org.xtext.example.mydsl.ui.AbstractMyDslUiModule {
	
	public MyDslUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	// prevent JDT dependencies, see https://bugs.eclipse.org/bugs/show_bug.cgi?id=404322
	
	@Override
	public com.google.inject.Provider<org.eclipse.xtext.resource.containers.IAllContainersState> provideIAllContainersState() {
		return Access.getWorkspaceProjectsState();
	}
	
	@Override
	public Class<? extends IResourceSetProvider> bindIResourceSetProvider() {
		return SimpleResourceSetProvider.class;
	}

	@Override
	public Class<? extends IResourceForEditorInputFactory> bindIResourceForEditorInputFactory() {
		return ResourceForIEditorInputFactory.class;
	}

	// FIXME: due to "Xtext based editor does not start since 2.5 without JDT installed", 
	// https://bugs.eclipse.org/bugs/show_bug.cgi?id=424455
	public void configureIStorage2UriMapperJdtExtensions(Binder binder) {
		binder.bind(IStorage2UriMapperJdtExtensions.class).toProvider(Providers.of((IStorage2UriMapperJdtExtensions)null));
	}
}
