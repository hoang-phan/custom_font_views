package hoangphan.ea.customfontviews.utils;

import android.graphics.Typeface;
import android.test.AndroidTestCase;
import android.test.mock.MockContext;

import java.util.Hashtable;

/**
 * Created by EastAgile Team on 8/20/15.
 */

public class FontManagerTest extends AndroidTestCase {
    public void testGetFontFromCache() throws Exception {
        Typeface mockTypeface = Typeface.DEFAULT;

        Hashtable<String, Typeface> mockFontCache = new Hashtable<>();
        mockFontCache.put("myFont.ttf", mockTypeface);
        hoangphan.ea.customfontviews.utils.FontManager.setFontCache(mockFontCache);

        assertEquals(1, hoangphan.ea.customfontviews.utils.FontManager.getFont("myFont.ttf", new MockContext()));
    }
}
