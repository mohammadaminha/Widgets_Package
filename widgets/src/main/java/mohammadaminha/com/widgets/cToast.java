package mohammadaminha.com.widgets;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by amin on 1/18/18.
 */

public class cToast {
    /**
     * برای تعیین مدت زمان نمایش پیام
     *
     * @param ToastLengh 0_Toast.LENGTH_SHORT
     *                   1_Toast.LENGTH_LONG
     */
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static void show(Activity activity, String message, int ToastLengh) {
        Toast toast = Toast.makeText(activity, message, ToastLengh);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        android.widget.TextView toastTV = (android.widget.TextView) toastLayout.getChildAt(0);
        toastTV.setText(message);
        toastTV.setTypeface(Util.getTypeFace());
        toast.show();
    }

    public static void show(Context context, String message, int ToastLengh) {
        Toast toast = Toast.makeText(context, message, ToastLengh);
        LinearLayout toastLayout = (LinearLayout) toast.getView();
        android.widget.TextView toastTV = (android.widget.TextView) toastLayout.getChildAt(0);
        toastTV.setText(message);
        toastTV.setTypeface(Util.getTypeFace());
        toast.show();
    }

}
