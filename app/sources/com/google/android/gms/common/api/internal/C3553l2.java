package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3511d;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.internal.l2 */
public final class C3553l2<A extends C3511d<? extends C3612k, C3469a.C3471b>> extends C3565o2 {

    /* renamed from: b */
    protected final A f10026b;

    public C3553l2(int i, A a) {
        super(i);
        this.f10026b = (C3511d) C3705r.m14347l(a, "Null methods are not runnable.");
    }

    /* renamed from: a */
    public final void mo11353a(Status status) {
        try {
            this.f10026b.mo11301v(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: b */
    public final void mo11354b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f10026b.mo11301v(new Status(10, sb.toString()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: c */
    public final void mo11355c(C3528g1<?> g1Var) {
        try {
            this.f10026b.mo11300t(g1Var.mo11345v());
        } catch (RuntimeException e) {
            mo11354b(e);
        }
    }

    /* renamed from: d */
    public final void mo11383d(C3595w wVar, boolean z) {
        wVar.mo11429c(this.f10026b, z);
    }
}
