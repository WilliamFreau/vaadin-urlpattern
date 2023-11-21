package com.william.lib;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Image;

/**
 * App layout from my library
 * Call a simple image from it's own resources
 */
public class LibAppLayout extends AppLayout {
    
    public LibAppLayout() {
        addToDrawer(new Image("img/logo.png", "logo"));
    }
}
