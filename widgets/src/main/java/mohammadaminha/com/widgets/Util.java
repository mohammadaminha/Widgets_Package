package mohammadaminha.com.widgets;

import android.content.Context;
import android.graphics.Typeface;

public class Util {
    private static String fontAddress = "";
    private static Typeface typeFace;
    private static Context context;

    public Util(String address, Context cnx) {
        fontAddress = address;
        context = cnx;
        typeFace = Typeface.createFromAsset(context.getAssets(), Util.getAddress());
    }

    public static String getAddress() {
        return fontAddress;
    }

    public static Typeface getTypeFace() {
        return typeFace;
    }

    public static Context getContext() {
        return context;
    }
}
