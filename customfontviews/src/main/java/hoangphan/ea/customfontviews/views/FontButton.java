package hoangphan.ea.customfontviews.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

import hoangphan.ea.customfontviews.utils.IFontChangeable;

/**
 * Created by Hoang Phan on 8/12/15.
 */
public class FontButton extends Button implements IFontChangeable {
    private ChildViewFontSetter mViewHelper;

    public FontButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mViewHelper = new ChildViewFontSetter(this, attrs);
    }

    @Override
    public void setFont(Typeface defaultFont) {
        mViewHelper.setFont(defaultFont);
    }
}
