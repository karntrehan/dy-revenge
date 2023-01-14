package p027c.p064i.p070h;

import android.os.Handler;
import android.os.Looper;

/* renamed from: c.i.h.b */
class C1869b {
    /* renamed from: a */
    static Handler m7887a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
