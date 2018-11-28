package mohammadaminha.com.widgets;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by aj on 2/5/2018.
 */

public class TextInputLayout extends android.support.design.widget.TextInputLayout {


    public TextInputLayout(Context context) {
        super(context);
        setTf(context);
    }

    public TextInputLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public TextInputLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }

    private void setTf(Context context) {

        setTypeface(Util.getTypeFace());
    }


}
