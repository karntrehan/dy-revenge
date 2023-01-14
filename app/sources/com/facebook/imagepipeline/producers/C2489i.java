package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;

/* renamed from: com.facebook.imagepipeline.producers.i */
public class C2489i implements C2529o0<C6088a<C6367b>> {

    /* renamed from: a */
    private final C2529o0<C6088a<C6367b>> f7337a;

    /* renamed from: b */
    private final int f7338b;

    /* renamed from: c */
    private final int f7339c;

    /* renamed from: d */
    private final boolean f7340d;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    private static class C2490a extends C2530p<C6088a<C6367b>, C6088a<C6367b>> {

        /* renamed from: c */
        private final int f7341c;

        /* renamed from: d */
        private final int f7342d;

        C2490a(C2505l<C6088a<C6367b>> lVar, int i, int i2) {
            super(lVar);
            this.f7341c = i;
            this.f7342d = i2;
        }

        /* renamed from: q */
        private void m10359q(C6088a<C6367b> aVar) {
            C6367b w0;
            Bitmap E;
            int rowBytes;
            if (aVar != null && aVar.mo18084y0() && (w0 = aVar.mo18082w0()) != null && !w0.isClosed() && (w0 instanceof C6368c) && (E = ((C6368c) w0).mo18868E()) != null && (rowBytes = E.getRowBytes() * E.getHeight()) >= this.f7341c && rowBytes <= this.f7342d) {
                E.prepareToDraw();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo8209i(C6088a<C6367b> aVar, int i) {
            m10359q(aVar);
            mo8320p().mo8223d(aVar, i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.imagepipeline.producers.o0<e.e.d.h.a<e.e.k.k.b>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2489i(com.facebook.imagepipeline.producers.C2529o0<p174e.p247e.p253d.p261h.C6088a<p174e.p247e.p294k.p307k.C6367b>> r2, int r3, int r4, boolean r5) {
        /*
            r1 = this;
            r1.<init>()
            if (r3 > r4) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            p174e.p247e.p253d.p257d.C6062k.m22834b(r0)
            java.lang.Object r2 = p174e.p247e.p253d.p257d.C6062k.m22839g(r2)
            com.facebook.imagepipeline.producers.o0 r2 = (com.facebook.imagepipeline.producers.C2529o0) r2
            r1.f7337a = r2
            r1.f7338b = r3
            r1.f7339c = r4
            r1.f7340d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2489i.<init>(com.facebook.imagepipeline.producers.o0, int, int, boolean):void");
    }

    /* renamed from: b */
    public void mo8198b(C2505l<C6088a<C6367b>> lVar, C2531p0 p0Var) {
        if (!p0Var.mo8246l() || this.f7340d) {
            this.f7337a.mo8198b(new C2490a(lVar, this.f7338b, this.f7339c), p0Var);
        } else {
            this.f7337a.mo8198b(lVar, p0Var);
        }
    }
}
