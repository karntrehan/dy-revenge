package p027c.p064i.p069g;

import android.content.res.Configuration;
import android.os.Build;

/* renamed from: c.i.g.c */
public final class C1851c {
    /* renamed from: a */
    public static C1856f m7865a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1856f.m7873e(configuration.getLocales());
        }
        return C1856f.m7871a(configuration.locale);
    }
}
