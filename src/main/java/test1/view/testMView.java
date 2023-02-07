package test1.view;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.linkki.framework.ui.component.Headline;
import test1.ui.testMLayout;

@PageTitle("testM")
@Route(value = "", layout = testMLayout.class)
public class testMView extends VerticalLayout{

    private static final long serialVersionUID = 1L;

    public testMView() {
        add(new Headline("testM"));
        setSizeFull();
        testMPage page = new testMPage();
        page.init();
        add(page);
    }
}