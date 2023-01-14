package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.C2393b;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6078c;

/* renamed from: com.facebook.imagepipeline.memory.v */
public abstract class C2429v extends C2393b<C2428u> {

    /* renamed from: k */
    private final int[] f7208k;

    C2429v(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var) {
        super(cVar, f0Var, g0Var);
        SparseIntArray sparseIntArray = (SparseIntArray) C6062k.m22839g(f0Var.f7174c);
        this.f7208k = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f7208k;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                mo8077r();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo8071j(C2428u uVar) {
        C6062k.m22839g(uVar);
        uVar.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo8074n(C2428u uVar) {
        C6062k.m22839g(uVar);
        return uVar.mo8054h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo8155C() {
        return this.f7208k[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public boolean mo8079t(C2428u uVar) {
        C6062k.m22839g(uVar);
        return !uVar.isClosed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo8073m(int i) {
        if (i > 0) {
            for (int i2 : this.f7208k) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C2393b.C2395b(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public int mo8075o(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract C2428u mo8046f(int i);
}
