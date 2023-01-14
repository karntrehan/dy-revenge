package p027c.p104x;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import p027c.p104x.p105c.C2253c;
import p027c.p104x.p105c.C2254d;
import p027c.p104x.p105c.C2256e;

/* renamed from: c.x.a */
public class C2249a {
    /* renamed from: a */
    private static C2253c m9497a(WebSettings webSettings) {
        return C2256e.m9513c().mo7562a(webSettings);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m9498b(WebSettings webSettings, int i) {
        C2254d dVar = C2254d.FORCE_DARK;
        if (dVar.mo7561z()) {
            webSettings.setForceDark(i);
        } else if (dVar.mo7560A()) {
            m9497a(webSettings).mo7558a(i);
        } else {
            throw C2254d.m9505g();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m9499c(WebSettings webSettings, int i) {
        if (C2254d.FORCE_DARK_STRATEGY.mo7560A()) {
            m9497a(webSettings).mo7559b(i);
            return;
        }
        throw C2254d.m9505g();
    }
}
