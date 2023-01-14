package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3705r;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
public final class C3507c0 implements C3592v0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3604y0 f9905a;

    /* renamed from: b */
    private boolean f9906b = false;

    public C3507c0(C3604y0 y0Var) {
        this.f9905a = y0Var;
    }

    /* renamed from: a */
    public final void mo11282a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo11283b() {
        if (this.f9906b) {
            this.f9906b = false;
            this.f9905a.mo11443p(new C3501b0(this, this));
        }
    }

    /* renamed from: c */
    public final void mo11284c(C3623b bVar, C3469a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo11285d(int i) {
        this.f9905a.mo11442o((C3623b) null);
        this.f9905a.f10170o.mo11306b(i, this.f9906b);
    }

    /* renamed from: e */
    public final void mo11286e() {
    }

    /* renamed from: f */
    public final boolean mo11287f() {
        if (this.f9906b) {
            return false;
        }
        Set<C3540i2> set = this.f9905a.f10169n.f10129w;
        if (set == null || set.isEmpty()) {
            this.f9905a.mo11442o((C3623b) null);
            return true;
        }
        this.f9906b = true;
        for (C3540i2 f : set) {
            f.mo11372f();
        }
        return false;
    }

    /* renamed from: g */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11288g(T t) {
        try {
            this.f9905a.f10169n.f10130x.mo11381a(t);
            C3588u0 u0Var = this.f9905a.f10169n;
            C3469a.C3478f fVar = u0Var.f10121o.get(t.mo11298r());
            C3705r.m14347l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo11186a() || !this.f9905a.f10162g.containsKey(t.mo11298r())) {
                t.mo11300t(fVar);
            } else {
                t.mo11301v(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f9905a.mo11443p(new C3496a0(this, this));
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11289i() {
        if (this.f9906b) {
            this.f9906b = false;
            this.f9905a.f10169n.f10130x.mo11382b();
            mo11287f();
        }
    }
}
