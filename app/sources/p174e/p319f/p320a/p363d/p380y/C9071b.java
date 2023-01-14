package p174e.p319f.p320a.p363d.p380y;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: e.f.a.d.y.b */
public class C9071b {

    /* renamed from: a */
    public static final boolean f24905a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f24906b = {16842919};

    /* renamed from: c */
    private static final int[] f24907c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f24908d = {16842908};

    /* renamed from: e */
    private static final int[] f24909e = {16843623};

    /* renamed from: f */
    private static final int[] f24910f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f24911g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f24912h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f24913i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f24914j = {16842913};

    /* renamed from: k */
    private static final int[] f24915k = {16842910, 16842919};

    /* renamed from: l */
    static final String f24916l = C9071b.class.getSimpleName();

    private C9071b() {
    }

    /* renamed from: a */
    public static ColorStateList m30223a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f24915k, 0)) != 0) {
            Log.w(f24916l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m30224b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
