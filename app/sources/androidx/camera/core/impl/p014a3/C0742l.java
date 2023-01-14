package androidx.camera.core.impl.p014a3;

import android.os.Handler;
import android.os.Looper;
import p027c.p064i.p069g.C1854e;

/* renamed from: androidx.camera.core.impl.a3.l */
public final class C0742l {

    /* renamed from: a */
    private static volatile Handler f2285a;

    private C0742l() {
    }

    /* renamed from: a */
    public static Handler m3041a() {
        if (f2285a != null) {
            return f2285a;
        }
        synchronized (C0742l.class) {
            if (f2285a == null) {
                f2285a = C1854e.m7867a(Looper.getMainLooper());
            }
        }
        return f2285a;
    }
}
