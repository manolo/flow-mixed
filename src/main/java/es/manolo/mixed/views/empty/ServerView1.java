package es.manolo.mixed.views.empty;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;


import es.manolo.mixed.views.empty.ServerView1.EmptyViewModel;

@Route(value = "1")
@JsModule("views/empty/empty-view.js")
@Tag("empty-view")
public class ServerView1 extends PolymerTemplate<EmptyViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/views/empty/empty-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface EmptyViewModel extends TemplateModel {
    }

    public ServerView1() {
    }
}
