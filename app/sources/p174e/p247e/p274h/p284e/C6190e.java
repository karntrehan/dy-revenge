package p174e.p247e.p274h.p284e;

import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.e */
public class C6190e {
    /* renamed from: a */
    public static void m23428a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: b */
    public static int m23429b(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: c */
    public static int m23430c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: d */
    public static void m23431d(Drawable drawable, Drawable.Callback callback, C6221s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof C6220r) {
                ((C6220r) drawable).mo18337c(sVar);
            }
        }
    }

    /* renamed from: e */
    public static void m23432e(Drawable drawable, C6189d dVar) {
        if (drawable != null && dVar != null) {
            dVar.mo18366a(drawable);
        }
    }
}
