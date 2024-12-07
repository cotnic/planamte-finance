package com.colatio.views.goals;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Goals")
@Route("goals")
@Menu(order = 5, icon = LineAwesomeIconUrl.PENCIL_RULER_SOLID)
public class GoalsView extends Composite<VerticalLayout> {

    public GoalsView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
