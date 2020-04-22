package es.manolo.mixed.views.empty1;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "2")
@PageTitle("Empty1")
@CssImport("views/empty1/empty1-view.css")
public class ServerView2 extends Div {

    public ServerView2() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setId("empty1-view");
        add(new Label("Server View2 (sleeps 2 seconds)"));
    }

}
