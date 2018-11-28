package mohammadaminha.com.widgets;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by aj on 1/30/2018.
 */

public class TextView extends android.support.v7.widget.AppCompatTextView {


    public TextView(Context context) {
        super(context);
        setTf(context);
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }

    private void setTf(Context context) {

        setTypeface(Util.getTypeFace());

    }



    public void setText(Context context) {
    }

    public void setText() {
    }
}
