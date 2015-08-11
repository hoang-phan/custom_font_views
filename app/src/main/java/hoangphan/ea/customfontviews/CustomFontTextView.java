package hoangphan.ea.customfontviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Hoang Phan on 8/11/15.
 */
public class CustomFontTextView extends TextView {
    public CustomFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomFontTextView, 0, 0);
        String fontPath = array.getString(R.styleable.CustomFontTextView_fontPath);
        try {
            setCustomFont(fontPath);
        } finally {
            array.recycle();
        }
    }

    private void setCustomFont(String fontPath) {
        setTypeface(FontManager.getFont(fontPath, getContext()));
    }
}
