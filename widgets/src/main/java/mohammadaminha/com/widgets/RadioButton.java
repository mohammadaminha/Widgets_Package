package mohammadaminha.com.widgets;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by amin on 2/21/18.
 */

public class RadioButton extends android.support.v7.widget.AppCompatRadioButton {

    public RadioButton(Context context) {
        super(context);
    }

    public RadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public RadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }



    private void setTf(Context context) {

        setTypeface(Util.getTypeFace());
    }


}

