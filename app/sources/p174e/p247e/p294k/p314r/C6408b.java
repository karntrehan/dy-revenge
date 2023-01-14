package p174e.p247e.p294k.p314r;

import android.graphics.Bitmap;
import android.os.Build;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: e.e.k.r.b */
public final class C6408b {
    /* renamed from: a */
    public static boolean m24518a(C6407a aVar, C6088a<Bitmap> aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Bitmap w0 = aVar2.mo18082w0();
        if (Build.VERSION.SDK_INT >= 12 && aVar.mo18986a()) {
            w0.setHasAlpha(true);
        }
        aVar.mo18987b(w0);
        return true;
    }
}
