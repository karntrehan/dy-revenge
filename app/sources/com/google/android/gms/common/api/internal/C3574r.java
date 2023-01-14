package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3471b;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.r */
public abstract class C3574r<A extends C3469a.C3471b, ResultT> {

    /* renamed from: a */
    private final C3627d[] f10063a;

    /* renamed from: b */
    private final boolean f10064b;

    /* renamed from: c */
    private final int f10065c;

    /* renamed from: com.google.android.gms.common.api.internal.r$a */
    public static class C3575a<A extends C3469a.C3471b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C3558n<A, C8965m<ResultT>> f10066a;

        /* renamed from: b */
        private boolean f10067b = true;

        /* renamed from: c */
        private C3627d[] f10068c;

        /* renamed from: d */
        private int f10069d = 0;

        /* synthetic */ C3575a(C3519e2 e2Var) {
        }

        /* renamed from: a */
        public C3574r<A, ResultT> mo11407a() {
            C3705r.m14337b(this.f10066a != null, "execute parameter required");
            return new C3514d2(this, this.f10068c, this.f10067b, this.f10069d);
        }

        /* renamed from: b */
        public C3575a<A, ResultT> mo11408b(C3558n<A, C8965m<ResultT>> nVar) {
            this.f10066a = nVar;
            return this;
        }

        /* renamed from: c */
        public C3575a<A, ResultT> mo11409c(boolean z) {
            this.f10067b = z;
            return this;
        }

        /* renamed from: d */
        public C3575a<A, ResultT> mo11410d(C3627d... dVarArr) {
            this.f10068c = dVarArr;
            return this;
        }

        /* renamed from: e */
        public C3575a<A, ResultT> mo11411e(int i) {
            this.f10069d = i;
            return this;
        }
    }

    protected C3574r(C3627d[] dVarArr, boolean z, int i) {
        this.f10063a = dVarArr;
        boolean z2 = false;
        if (dVarArr != null && z) {
            z2 = true;
        }
        this.f10064b = z2;
        this.f10065c = i;
    }

    /* renamed from: a */
    public static <A extends C3469a.C3471b, ResultT> C3575a<A, ResultT> m13902a() {
        return new C3575a<>((C3519e2) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo11304b(A a, C8965m<ResultT> mVar);

    /* renamed from: c */
    public boolean mo11404c() {
        return this.f10064b;
    }

    /* renamed from: d */
    public final int mo11405d() {
        return this.f10065c;
    }

    /* renamed from: e */
    public final C3627d[] mo11406e() {
        return this.f10063a;
    }
}
