package org.ros.model.ros_package.diagram;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ComponentDeveloperPerspectiveFactory implements IPerspectiveFactory {

	
	    public void createInitialLayout(IPageLayout layout) {
	        defineActions(layout);
	        defineLayout(layout);
	     }
	    
	    public void defineActions(IPageLayout layout) {
	        // Add "new wizards".
	        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
	        layout.addNewWizardShortcut("org.ros.model.ros_package.diagram.part.RosCreationWizardID");

	        // Add "show views".
	        layout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
	        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	        layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
	        layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
	    }
	    public void defineLayout(IPageLayout layout) {

	        String editorArea = layout.getEditorArea();
        
	        layout.addView("org.eclipse.ui.navigator.ProjectExplorer", IPageLayout.LEFT, (float) 0.2, editorArea);
        
	        IFolderLayout bottom = layout.createFolder("topLeft", IPageLayout.BOTTOM, 0.75f,editorArea);
	        bottom.addView(IPageLayout.ID_PROP_SHEET);
	        bottom.addView("org.eclipse.ui.console.ConsoleView");
            
            
	}
}
