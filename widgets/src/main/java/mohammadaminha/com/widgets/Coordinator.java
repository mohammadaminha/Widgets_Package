package mohammadaminha.com.widgets;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;

public class Coordinator extends CoordinatorLayout {
    public Coordinator(Context context) {
        super(context);
        Customizer();
    }

    public Coordinator(Context context, AttributeSet attrs) {
        super(context, attrs);
        Customizer();
    }

    public Coordinator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Customizer();
    }
    private void Customizer(){
        setLayoutDirection(LAYOUT_DIRECTION_RTL);
    }
}
