package hoangphan.ea.customfontviews.layouts;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Hoang Phan on 8/12/15.
 */
public class FontFrameLayout extends FrameLayout {
    private LayoutFontSetter mFontSetter;

    public FontFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mFontSetter = new LayoutFontSetter(this, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mFontSetter.setFont();
    }
}
