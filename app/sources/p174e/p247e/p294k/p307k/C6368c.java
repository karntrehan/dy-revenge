package p174e.p247e.p294k.p307k;

import android.graphics.Bitmap;
import com.facebook.imageutils.C2567a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p261h.C6094d;
import p174e.p247e.p253d.p261h.C6098h;

/* renamed from: e.e.k.k.c */
public class C6368c extends C6366a implements C6094d {

    /* renamed from: p */
    private C6088a<Bitmap> f17749p;

    /* renamed from: q */
    private volatile Bitmap f17750q;

    /* renamed from: r */
    private final C6374i f17751r;

    /* renamed from: s */
    private final int f17752s;

    /* renamed from: t */
    private final int f17753t;

    public C6368c(Bitmap bitmap, C6098h<Bitmap> hVar, C6374i iVar, int i) {
        this(bitmap, hVar, iVar, i, 0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e.e.d.h.h<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6368c(android.graphics.Bitmap r1, p174e.p247e.p253d.p261h.C6098h<android.graphics.Bitmap> r2, p174e.p247e.p294k.p307k.C6374i r3, int r4, int r5) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.f17750q = r1
            android.graphics.Bitmap r1 = r0.f17750q
            java.lang.Object r2 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            e.e.d.h.h r2 = (p174e.p247e.p253d.p261h.C6098h) r2
            e.e.d.h.a r1 = p174e.p247e.p253d.p261h.C6088a.m22942C0(r1, r2)
            r0.f17749p = r1
            r0.f17751r = r3
            r0.f17752s = r4
            r0.f17753t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p307k.C6368c.<init>(android.graphics.Bitmap, e.e.d.h.h, e.e.k.k.i, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [e.e.d.h.a<android.graphics.Bitmap>, e.e.d.h.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6368c(p174e.p247e.p253d.p261h.C6088a<android.graphics.Bitmap> r1, p174e.p247e.p294k.p307k.C6374i r2, int r3, int r4) {
        /*
            r0 = this;
            r0.<init>()
            e.e.d.h.a r1 = r1.mo18081s0()
            java.lang.Object r1 = p174e.p247e.p253d.p257d.C6062k.m22839g(r1)
            e.e.d.h.a r1 = (p174e.p247e.p253d.p261h.C6088a) r1
            r0.f17749p = r1
            java.lang.Object r1 = r1.mo18082w0()
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0.f17750q = r1
            r0.f17751r = r2
            r0.f17752s = r3
            r0.f17753t = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p307k.C6368c.<init>(e.e.d.h.a, e.e.k.k.i, int, int):void");
    }

    /* renamed from: I */
    private synchronized C6088a<Bitmap> m24295I() {
        C6088a<Bitmap> aVar;
        aVar = this.f17749p;
        this.f17749p = null;
        this.f17750q = null;
        return aVar;
    }

    /* renamed from: L */
    private static int m24296L(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    /* renamed from: W */
    private static int m24297W(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: E */
    public Bitmap mo18868E() {
        return this.f17750q;
    }

    /* renamed from: X */
    public int mo18877X() {
        return this.f17753t;
    }

    /* renamed from: a */
    public C6374i mo18870a() {
        return this.f17751r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f17753t;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo15981c() {
        /*
            r2 = this;
            int r0 = r2.f17752s
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x0016
            int r0 = r2.f17753t
            r1 = 5
            if (r0 == r1) goto L_0x0016
            r1 = 7
            if (r0 != r1) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            android.graphics.Bitmap r0 = r2.f17750q
            int r0 = m24296L(r0)
            return r0
        L_0x0016:
            android.graphics.Bitmap r0 = r2.f17750q
            int r0 = m24297W(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p307k.C6368c.mo15981c():int");
    }

    public void close() {
        C6088a<Bitmap> I = m24295I();
        if (I != null) {
            I.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f17753t;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo15982e() {
        /*
            r2 = this;
            int r0 = r2.f17752s
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x0016
            int r0 = r2.f17753t
            r1 = 5
            if (r0 == r1) goto L_0x0016
            r1 = 7
            if (r0 != r1) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            android.graphics.Bitmap r0 = r2.f17750q
            int r0 = m24297W(r0)
            return r0
        L_0x0016:
            android.graphics.Bitmap r0 = r2.f17750q
            int r0 = m24296L(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p307k.C6368c.mo15982e():int");
    }

    /* renamed from: e0 */
    public int mo18878e0() {
        return this.f17752s;
    }

    /* renamed from: h */
    public int mo18873h() {
        return C2567a.m10705e(this.f17750q);
    }

    public synchronized boolean isClosed() {
        return this.f17749p == null;
    }
}
