package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6078c;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.i */
public class C2414i extends C2393b<Bitmap> implements C2405e {
    public C2414i(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var, boolean z) {
        super(cVar, f0Var, g0Var, z);
        mo8077r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo8071j(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        bitmap.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo8074n(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.imagepipeline.memory.g<android.graphics.Bitmap>, com.facebook.imagepipeline.memory.g] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo8076p(com.facebook.imagepipeline.memory.C2409g<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            java.lang.Object r2 = super.mo8076p(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto L_0x000c
            r0 = 0
            r2.eraseColor(r0)
        L_0x000c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C2414i.mo8076p(com.facebook.imagepipeline.memory.g):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo8079t(Bitmap bitmap) {
        C6062k.m22839g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo8073m(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo8075o(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Bitmap mo8046f(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
