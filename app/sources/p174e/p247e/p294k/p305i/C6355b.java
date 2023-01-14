package p174e.p247e.p294k.p305i;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.platform.C2444d;
import java.util.Map;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p301e.C6313b;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p307k.C6373h;
import p174e.p247e.p294k.p307k.C6374i;
import p174e.p247e.p294k.p314r.C6408b;

/* renamed from: e.e.k.i.b */
public class C6355b implements C6357c {

    /* renamed from: a */
    private final C6357c f17732a;

    /* renamed from: b */
    private final C6357c f17733b;

    /* renamed from: c */
    private final C2444d f17734c;

    /* renamed from: d */
    private final C6357c f17735d;

    /* renamed from: e */
    private final Map<C6253c, C6357c> f17736e;

    /* renamed from: e.e.k.i.b$a */
    class C6356a implements C6357c {
        C6356a() {
        }

        /* renamed from: a */
        public C6367b mo18855a(C6369d dVar, int i, C6374i iVar, C6313b bVar) {
            C6253c W = dVar.mo18891W();
            if (W == C6252b.f17318a) {
                return C6355b.this.mo18858d(dVar, i, iVar, bVar);
            }
            if (W == C6252b.f17320c) {
                return C6355b.this.mo18857c(dVar, i, iVar, bVar);
            }
            if (W == C6252b.f17327j) {
                return C6355b.this.mo18856b(dVar, i, iVar, bVar);
            }
            if (W != C6253c.f17330a) {
                return C6355b.this.mo18859e(dVar, bVar);
            }
            throw new C6354a("unknown image format", dVar);
        }
    }

    public C6355b(C6357c cVar, C6357c cVar2, C2444d dVar) {
        this(cVar, cVar2, dVar, (Map<C6253c, C6357c>) null);
    }

    public C6355b(C6357c cVar, C6357c cVar2, C2444d dVar, Map<C6253c, C6357c> map) {
        this.f17735d = new C6356a();
        this.f17732a = cVar;
        this.f17733b = cVar2;
        this.f17734c = dVar;
        this.f17736e = map;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r0 = r1.get(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p247e.p294k.p307k.C6367b mo18855a(p174e.p247e.p294k.p307k.C6369d r3, int r4, p174e.p247e.p294k.p307k.C6374i r5, p174e.p247e.p294k.p301e.C6313b r6) {
        /*
            r2 = this;
            e.e.k.i.c r0 = r6.f17450j
            if (r0 == 0) goto L_0x0009
            e.e.k.k.b r3 = r0.mo18855a(r3, r4, r5, r6)
            return r3
        L_0x0009:
            e.e.j.c r0 = r3.mo18891W()
            if (r0 == 0) goto L_0x0013
            e.e.j.c r1 = p174e.p247e.p293j.C6253c.f17330a
            if (r0 != r1) goto L_0x0020
        L_0x0013:
            java.io.InputStream r1 = r3.mo18892X()
            if (r1 == 0) goto L_0x0020
            e.e.j.c r0 = p174e.p247e.p293j.C6255d.m23714c(r1)
            r3.mo18885H0(r0)
        L_0x0020:
            java.util.Map<e.e.j.c, e.e.k.i.c> r1 = r2.f17736e
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.get(r0)
            e.e.k.i.c r0 = (p174e.p247e.p294k.p305i.C6357c) r0
            if (r0 == 0) goto L_0x0031
            e.e.k.k.b r3 = r0.mo18855a(r3, r4, r5, r6)
            return r3
        L_0x0031:
            e.e.k.i.c r0 = r2.f17735d
            e.e.k.k.b r3 = r0.mo18855a(r3, r4, r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p305i.C6355b.mo18855a(e.e.k.k.d, int, e.e.k.k.i, e.e.k.e.b):e.e.k.k.b");
    }

    /* renamed from: b */
    public C6367b mo18856b(C6369d dVar, int i, C6374i iVar, C6313b bVar) {
        C6357c cVar = this.f17733b;
        if (cVar != null) {
            return cVar.mo18855a(dVar, i, iVar, bVar);
        }
        throw new C6354a("Animated WebP support not set up!", dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = r2.f17732a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p247e.p294k.p307k.C6367b mo18857c(p174e.p247e.p294k.p307k.C6369d r3, int r4, p174e.p247e.p294k.p307k.C6374i r5, p174e.p247e.p294k.p301e.C6313b r6) {
        /*
            r2 = this;
            int r0 = r3.mo18896e()
            r1 = -1
            if (r0 == r1) goto L_0x001f
            int r0 = r3.mo18894c()
            if (r0 == r1) goto L_0x001f
            boolean r0 = r6.f17447g
            if (r0 != 0) goto L_0x001a
            e.e.k.i.c r0 = r2.f17732a
            if (r0 == 0) goto L_0x001a
            e.e.k.k.b r3 = r0.mo18855a(r3, r4, r5, r6)
            return r3
        L_0x001a:
            e.e.k.k.c r3 = r2.mo18859e(r3, r6)
            return r3
        L_0x001f:
            e.e.k.i.a r4 = new e.e.k.i.a
            java.lang.String r5 = "image width or height is incorrect"
            r4.<init>(r5, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p305i.C6355b.mo18857c(e.e.k.k.d, int, e.e.k.k.i, e.e.k.e.b):e.e.k.k.b");
    }

    /* renamed from: d */
    public C6368c mo18858d(C6369d dVar, int i, C6374i iVar, C6313b bVar) {
        C6088a<Bitmap> c = this.f17734c.mo8183c(dVar, bVar.f17448h, (Rect) null, i, bVar.f17452l);
        try {
            boolean a = C6408b.m24518a(bVar.f17451k, c);
            C6368c cVar = new C6368c(c, iVar, dVar.mo18898i0(), dVar.mo18886I());
            cVar.mo18876r("is_rounded", false);
            return cVar;
        } finally {
            c.close();
        }
    }

    /* renamed from: e */
    public C6368c mo18859e(C6369d dVar, C6313b bVar) {
        C6088a<Bitmap> a = this.f17734c.mo8181a(dVar, bVar.f17448h, (Rect) null, bVar.f17452l);
        try {
            boolean a2 = C6408b.m24518a(bVar.f17451k, a);
            C6368c cVar = new C6368c(a, C6373h.f17773a, dVar.mo18898i0(), dVar.mo18886I());
            cVar.mo18876r("is_rounded", false);
            return cVar;
        } finally {
            a.close();
        }
    }
}
