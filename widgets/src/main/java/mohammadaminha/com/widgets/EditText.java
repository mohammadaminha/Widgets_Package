package mohammadaminha.com.widgets;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

/**
 * Created by aj on 1/30/2018.
 */

public class EditText extends AppCompatEditText {



    public EditText(Context context) {
        super(context);
        setTf(context);
    }

    public EditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public EditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }

    private void setTf(Context context) {

        setTypeface(Util.getTypeFace());
    }


}
