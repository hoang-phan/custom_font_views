package hoangphan.ea.customfontviews.layouts;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import hoangphan.ea.customfontviews.R;
import hoangphan.ea.customfontviews.utils.FontManager;
import hoangphan.ea.customfontviews.utils.IFontChangeable;

/**
 * Created by Hoang Phan on 8/13/15.
 */
public class LayoutFontSetter {
    private ViewGroup mViewGroup;
    private Typeface mTypeface = null;

    public LayoutFontSetter(ViewGroup viewGroup, AttributeSet attrs) {
        mViewGroup = viewGroup;
        TypedArray array = mViewGroup.getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.IFontChangeable, 0, 0);
        String fontPath = array.getString(R.styleable.IFontChangeable_fontPath);
        try {
            mTypeface = FontManager.getFont(fontPath, mViewGroup.getContext());
        } finally {
            array.recycle();
        }
    }

    public void setFont() {
        for (int i = 0; i < mViewGroup.getChildCount(); i++) {
            View view = mViewGroup.getChildAt(i);
            if (view instanceof IFontChangeable) {
                ((IFontChangeable)view).setFont(mTypeface);
            } else if (view instanceof TextView) {
                ((TextView)view).setTypeface(mTypeface);
            }
        }
    }
}
