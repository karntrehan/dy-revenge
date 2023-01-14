package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.api.C3469a;

/* renamed from: com.google.android.gms.common.internal.n0 */
public final class C3692n0 {

    /* renamed from: a */
    private final SparseIntArray f10345a = new SparseIntArray();

    /* renamed from: b */
    private C3631f f10346b;

    public C3692n0(C3631f fVar) {
        C3705r.m14346k(fVar);
        this.f10346b = fVar;
    }

    /* renamed from: a */
    public final int mo11636a(Context context, int i) {
        return this.f10345a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo11637b(Context context, C3469a.C3478f fVar) {
        C3705r.m14346k(context);
        C3705r.m14346k(fVar);
        int i = 0;
        if (!fVar.mo11196l()) {
            return 0;
        }
        int n = fVar.mo11136n();
        int a = mo11636a(context, n);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f10345a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f10345a.keyAt(i2);
                if (keyAt > n && this.f10345a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f10346b.mo11485j(context, n) : i;
            this.f10345a.put(n, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo11638c() {
        this.f10345a.clear();
    }
}
