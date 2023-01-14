package p027c.p064i.p072j;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: c.i.j.c0 */
public final class C1912c0 {

    /* renamed from: c.i.j.c0$a */
    private static class C1913a {
        /* renamed from: a */
        static void m8009a(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
        }
    }

    /* renamed from: c.i.j.c0$b */
    private static class C1914b {
        /* renamed from: a */
        static void m8010a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    /* renamed from: a */
    public static void m8008a(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C1914b.m8010a(window, z);
        } else if (i >= 16) {
            C1913a.m8009a(window, z);
        }
    }
}
