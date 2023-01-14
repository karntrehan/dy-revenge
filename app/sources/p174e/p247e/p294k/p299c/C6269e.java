package p174e.p247e.p294k.p299c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.platform.C2444d;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p294k.p302f.C6319a;
import p174e.p247e.p294k.p307k.C6369d;

@TargetApi(11)
/* renamed from: e.e.k.c.e */
public class C6269e extends C6270f {

    /* renamed from: a */
    private static final String f17358a = "e";

    /* renamed from: b */
    private final C6266b f17359b;

    /* renamed from: c */
    private final C2444d f17360c;

    /* renamed from: d */
    private final C6319a f17361d;

    /* renamed from: e */
    private boolean f17362e;

    public C6269e(C6266b bVar, C2444d dVar, C6319a aVar) {
        this.f17359b = bVar;
        this.f17360c = dVar;
        this.f17361d = aVar;
    }

    /* renamed from: e */
    private C6088a<Bitmap> m23743e(int i, int i2, Bitmap.Config config) {
        return this.f17361d.mo18698c(Bitmap.createBitmap(i, i2, config), C6272h.m23750b());
    }

    @TargetApi(12)
    /* renamed from: d */
    public C6088a<Bitmap> mo18581d(int i, int i2, Bitmap.Config config) {
        C6369d dVar;
        if (this.f17362e) {
            return m23743e(i, i2, config);
        }
        C6088a<C6082g> a = this.f17359b.mo18582a((short) i, (short) i2);
        try {
            dVar = new C6369d(a);
            dVar.mo18885H0(C6252b.f17318a);
            C6088a<Bitmap> b = this.f17360c.mo8182b(dVar, config, (Rect) null, a.mo18082w0().size());
            if (!b.mo18082w0().isMutable()) {
                C6088a.m22949v0(b);
                this.f17362e = true;
                C6071a.m22864L(f17358a, "Immutable bitmap returned by decoder");
                C6088a<Bitmap> e = m23743e(i, i2, config);
                C6369d.m24309h(dVar);
                a.close();
                return e;
            }
            b.mo18082w0().setHasAlpha(true);
            b.mo18082w0().eraseColor(0);
            C6369d.m24309h(dVar);
            a.close();
            return b;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
