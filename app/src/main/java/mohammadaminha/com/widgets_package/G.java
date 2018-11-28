package mohammadaminha.com.widgets_package;

import android.app.Application;

import mohammadaminha.com.widgets.Util;

public class G extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Util("font/BYekan.ttf", getApplicationContext());
    }

}
