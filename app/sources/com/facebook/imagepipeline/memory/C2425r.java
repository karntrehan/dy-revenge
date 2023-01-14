package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.C2393b;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6076a;
import p174e.p247e.p253d.p260g.C6078c;

/* renamed from: com.facebook.imagepipeline.memory.r */
public class C2425r extends C2393b<byte[]> implements C6076a {

    /* renamed from: k */
    private final int[] f7200k;

    public C2425r(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var) {
        super(cVar, f0Var, g0Var);
        SparseIntArray sparseIntArray = (SparseIntArray) C6062k.m22839g(f0Var.f7174c);
        this.f7200k = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f7200k[i] = sparseIntArray.keyAt(i);
        }
        mo8077r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo8071j(byte[] bArr) {
        C6062k.m22839g(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo8074n(byte[] bArr) {
        C6062k.m22839g(bArr);
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo8073m(int i) {
        if (i > 0) {
            for (int i2 : this.f7200k) {
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
    public byte[] mo8046f(int i) {
        return new byte[i];
    }
}
