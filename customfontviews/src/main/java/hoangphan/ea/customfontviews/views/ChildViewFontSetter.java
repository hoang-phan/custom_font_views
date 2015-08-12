package hoangphan.ea.customfontviews.views;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

import hoangphan.ea.customfontviews.R;
import hoangphan.ea.customfontviews.utils.FontManager;

/**
 * Created by Hoang Phan on 8/13/15.
 */
public class ChildViewFontSetter {
    private TextView mTextView;
    private AttributeSet mAttributeSet;

    public ChildViewFontSetter(TextView view, AttributeSet attributeSet) {
        this.mTextView = view;
        mAttributeSet = attributeSet;
    }

    public void setFont(Typeface defaultFont) {
        TypedArray array = null;
        try {
            array = mTextView.getContext().getTheme().obtainStyledAttributes(mAttributeSet, R.styleable.IFontChangeable, 0, 0);
            String fontPath = array.getString(R.styleable.IFontChangeable_fontPath);
            Typeface font;
            if (!TextUtils.isEmpty(fontPath) && (font = FontManager.getFont(fontPath, mTextView.getContext())) != null) {
                mTextView.setTypeface(font);
            } else if (defaultFont != null) {
                mTextView.setTypeface(defaultFont);
            }
        } finally {
            if (array != null) {
                array.recycle();
            }
        }
    }
}
