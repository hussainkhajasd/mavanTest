package test1.ui;

import org.linkki.framework.ui.application.ApplicationConfig;
import org.linkki.framework.ui.application.menu.ApplicationMenuItemDefinition;
import org.linkki.util.Sequence;

public class testMConfig implements ApplicationConfig {

    @Override
    public testMInfo getApplicationInfo() {
        return new testMInfo();
    }

    @Override
    public Sequence<ApplicationMenuItemDefinition> getMenuItemDefinitions() {
        return Sequence.empty();
    }

}