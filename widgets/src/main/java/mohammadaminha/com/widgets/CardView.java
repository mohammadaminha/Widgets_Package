package mohammadaminha.com.widgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

public class CardView extends android.support.v7.widget.CardView {
    public CardView(@NonNull Context context) {
        super(context);
        Customizer(context);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Customizer(context);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Customizer(context);

    }

    private void Customizer(Context context) {
        setLayoutDirection(LAYOUT_DIRECTION_RTL);
        setTextDirection(TEXT_DIRECTION_RTL);
        setPadding(6, 6, 6, 6);
        setCardElevation(12f);
        setUseCompatPadding(true);
    }

}
