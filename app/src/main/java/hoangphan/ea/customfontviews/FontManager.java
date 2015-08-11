package hoangphan.ea.customfontviews;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by Hoang Phan on 8/11/15.
 */
public class FontManager {
    private static Hashtable<String, Typeface> fontCache = new Hashtable<>();

    public static Typeface getFont(String name, Context context) {
        Typeface typeface = fontCache.get(name);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), name);
            } catch (Exception e) {
                return null;
            }
            fontCache.put(name, typeface);
        }
        return typeface;
    }

}
