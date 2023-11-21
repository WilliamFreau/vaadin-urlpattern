package com.william;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.william.lib.LibAppLayout;

/**
 * Simple view with the AppLayout from the lib
 */
@Route(value = "", layout = LibAppLayout.class)
public class View extends VerticalLayout {
    
    public View() {
        this.add("No URL mapping resource from vaadin-lib is working");
    }
}
