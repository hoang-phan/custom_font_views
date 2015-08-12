package hoangphan.ea.customfontviews.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Hoang Phan on 8/13/15.
 */
public class FontRelativeLayout extends RelativeLayout {
    private LayoutFontSetter mFontSetter;

    public FontRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mFontSetter = new LayoutFontSetter(this, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mFontSetter.setFont();
    }
}
