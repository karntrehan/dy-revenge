package p174e.p247e.p294k.p299c;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p261h.C6098h;

/* renamed from: e.e.k.c.h */
public class C6272h implements C6098h<Bitmap> {

    /* renamed from: a */
    private static C6272h f17363a;

    private C6272h() {
    }

    /* renamed from: b */
    public static C6272h m23750b() {
        if (f17363a == null) {
            f17363a = new C6272h();
        }
        return f17363a;
    }

    /* renamed from: c */
    public void mo8068a(Bitmap bitmap) {
        bitmap.recycle();
    }
}
