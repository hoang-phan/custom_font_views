package hoangphan.ea.customfontviews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import hoangphan.ea.customfontviews.utils.IFontChangeable;

/**
 * Created by Hoang Phan on 8/11/15.
 */
public class FontTextView extends TextView implements IFontChangeable {
    private ChildViewFontSetter mViewHelper;

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mViewHelper = new ChildViewFontSetter(this, attrs);
    }

    @Override
    public void setFont(Typeface defaultFont) {
        mViewHelper.setFont(defaultFont);
    }
}
