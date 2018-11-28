package mohammadaminha.com.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.CompoundButtonCompat;
import android.util.AttributeSet;

/**
 * Created by aj on 2/1/2018.
 */

public class CheckBox extends android.support.v7.widget.AppCompatCheckBox {


    public CheckBox(Context context) {
        super(context);
        setTf(context);
    }

    public CheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTf(context);
    }

    public CheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTf(context);
    }

    private void setTf(Context context) {

        ColorStateList colorStateList = new ColorStateList(
                new int[][]{
                        new int[]{-android.R.attr.state_checked}, // unchecked
                        new int[]{android.R.attr.state_checked} , // checked
                },
                new int[]{
                        ContextCompat.getColor(context,R.color.GrayColor),  //unchecked color
                        ContextCompat.getColor(context,R.color.YellowColor),  //checked color
                }
        );
        CompoundButtonCompat.setButtonTintList(this,colorStateList);
        setTypeface(Util.getTypeFace());
    }


}
