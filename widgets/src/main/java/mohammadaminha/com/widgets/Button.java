package mohammadaminha.com.widgets;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by aj on 2/1/2018.
 */

public class Button extends android.support.v7.widget.AppCompatButton{


    public Button(Context context) {
        super(context);

        setTf(context);
    }


    public Button(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public Button(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }


    private void setTf(Context context) {
        setTypeface(Util.getTypeFace());
    }


}
