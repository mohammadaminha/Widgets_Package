package mohammadaminha.com.widgets;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by aj on 2/6/2018.
 */

public class Switch extends android.widget.Switch {

    public Switch(Context context) {
        super(context);
        setTf(context);
    }

    public Switch(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public Switch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }
    private void setTf(Context context) {

        setTypeface(Util.getTypeFace());

    }


}
