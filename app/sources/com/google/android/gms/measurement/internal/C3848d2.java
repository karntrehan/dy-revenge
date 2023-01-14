package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import java.util.Map;
import p027c.p060f.C1788a;

/* renamed from: com.google.android.gms.measurement.internal.d2 */
public final class C3848d2 extends C3862e3 {

    /* renamed from: b */
    private final Map f10619b = new C1788a();

    /* renamed from: c */
    private final Map f10620c = new C1788a();

    /* renamed from: d */
    private long f10621d;

    public C3848d2(C3955l5 l5Var) {
        super(l5Var);
    }

    /* renamed from: i */
    static /* synthetic */ void m14675i(C3848d2 d2Var, String str, long j) {
        d2Var.mo11931h();
        C3705r.m14342g(str);
        if (d2Var.f10620c.isEmpty()) {
            d2Var.f10621d = j;
        }
        Integer num = (Integer) d2Var.f10620c.get(str);
        if (num != null) {
            d2Var.f10620c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d2Var.f10620c.size() >= 100) {
            d2Var.f10651a.mo11935b().mo12549w().mo12476a("Too many ads visible");
        } else {
            d2Var.f10620c.put(str, 1);
            d2Var.f10619b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m14676j(C3848d2 d2Var, String str, long j) {
        d2Var.mo11931h();
        C3705r.m14342g(str);
        Integer num = (Integer) d2Var.f10620c.get(str);
        if (num != null) {
            C4114y7 t = d2Var.f10651a.mo12158K().mo11980t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                d2Var.f10620c.remove(str);
                Long l = (Long) d2Var.f10619b.get(str);
                if (l == null) {
                    d2Var.f10651a.mo11935b().mo12544r().mo12476a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    d2Var.f10619b.remove(str);
                    d2Var.m14679p(str, j - longValue, t);
                }
                if (d2Var.f10620c.isEmpty()) {
                    long j2 = d2Var.f10621d;
                    if (j2 == 0) {
                        d2Var.f10651a.mo11935b().mo12544r().mo12476a("First ad exposure time was never set");
                        return;
                    }
                    d2Var.m14678o(j - j2, t);
                    d2Var.f10621d = 0;
                    return;
                }
                return;
            }
            d2Var.f10620c.put(str, Integer.valueOf(intValue));
            return;
        }
        d2Var.f10651a.mo11935b().mo12544r().mo12477b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: o */
    private final void m14678o(long j, C4114y7 y7Var) {
        if (y7Var == null) {
            this.f10651a.mo11935b().mo12548v().mo12476a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f10651a.mo11935b().mo12548v().mo12477b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C4105xa.m15408y(y7Var, bundle, true);
            this.f10651a.mo12156I().mo12381u("am", "_xa", bundle);
        }
    }

    /* renamed from: p */
    private final void m14679p(String str, long j, C4114y7 y7Var) {
        if (y7Var == null) {
            this.f10651a.mo11935b().mo12548v().mo12476a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f10651a.mo11935b().mo12548v().mo12477b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C4105xa.m15408y(y7Var, bundle, true);
            this.f10651a.mo12156I().mo12381u("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m14680q(long j) {
        for (String put : this.f10619b.keySet()) {
            this.f10619b.put(put, Long.valueOf(j));
        }
        if (!this.f10619b.isEmpty()) {
            this.f10621d = j;
        }
    }

    /* renamed from: l */
    public final void mo11898l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Ad unit id must be a non-empty string");
        } else {
            this.f10651a.mo11934a().mo12110z(new C3806a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo11899m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Ad unit id must be a non-empty string");
        } else {
            this.f10651a.mo11934a().mo12110z(new C3820b0(this, str, j));
        }
    }

    /* renamed from: n */
    public final void mo11900n(long j) {
        C4114y7 t = this.f10651a.mo12158K().mo11980t(false);
        for (String str : this.f10619b.keySet()) {
            m14679p(str, j - ((Long) this.f10619b.get(str)).longValue(), t);
        }
        if (!this.f10619b.isEmpty()) {
            m14678o(j - this.f10621d, t);
        }
        m14680q(j);
    }
}
