package test1.ui;

import java.time.Year;

import org.linkki.framework.ui.application.ApplicationInfo;

public class testMInfo implements ApplicationInfo {

    public static final String APPLICATION_NAME = "testM";

    @Override
    public String getApplicationName() {
        return APPLICATION_NAME;
    }

    @Override
    public String getApplicationVersion() {
        return "1.0";
    }

    @Override
    public String getApplicationDescription() {
        return "testM";
    }

    @Override
    public String getCopyright() {
        return "© Faktor Zehn " + Year.now();
    }
}