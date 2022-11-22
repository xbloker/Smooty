package ru.xdi.iconpack.applications;

import androidx.annotation.NonNull;

import candybar.lib.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    // TODO: Remove '/*' and '*/' to Enable OneSignal
    /*
    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId("YOUR_ONESIGNAL_APP_ID_HERE");
    }
    */

    @NonNull
    @Override
    public Configuration onInit() {
        // Sample configuration
        Configuration configuration = new Configuration();
        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        return configuration;
    }
}
