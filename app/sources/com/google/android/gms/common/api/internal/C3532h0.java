package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3692n0;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
final class C3532h0 extends C3563o0 {

    /* renamed from: o */
    private final Map<C3469a.C3478f, C3517e0> f9972o;

    /* renamed from: p */
    final /* synthetic */ C3567p0 f9973p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3532h0(C3567p0 p0Var, Map<C3469a.C3478f, C3517e0> map) {
        super(p0Var, (C3559n0) null);
        this.f9973p = p0Var;
        this.f9972o = map;
    }

    /* renamed from: a */
    public final void mo11352a() {
        C3692n0 n0Var = new C3692n0(this.f9973p.f10039d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3469a.C3478f next : this.f9972o.keySet()) {
            if (!next.mo11196l() || this.f9972o.get(next).f9925c) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                i = n0Var.mo11637b(this.f9973p.f10038c, (C3469a.C3478f) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                i = n0Var.mo11637b(this.f9973p.f10038c, (C3469a.C3478f) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            C3623b bVar = new C3623b(i, (PendingIntent) null);
            C3567p0 p0Var = this.f9973p;
            p0Var.f10036a.mo11443p(new C3522f0(this, p0Var, bVar));
            return;
        }
        C3567p0 p0Var2 = this.f9973p;
        if (p0Var2.f10048m && p0Var2.f10046k != null) {
            p0Var2.f10046k.mo22732u();
        }
        for (C3469a.C3478f next2 : this.f9972o.keySet()) {
            C3651c.C3654c cVar = this.f9972o.get(next2);
            if (!next2.mo11196l() || n0Var.mo11637b(this.f9973p.f10038c, next2) == 0) {
                next2.mo11192h(cVar);
            } else {
                C3567p0 p0Var3 = this.f9973p;
                p0Var3.f10036a.mo11443p(new C3527g0(this, p0Var3, cVar));
            }
        }
    }
}
