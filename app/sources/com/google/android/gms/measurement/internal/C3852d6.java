package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.C3738j;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3768o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p352g.C6709b;
import p174e.p319f.p320a.p335c.p345f.p352g.C6728c1;
import p174e.p319f.p320a.p335c.p345f.p352g.C7068x1;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
public final class C3852d6 extends C3990o3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4009pa f10629a;

    /* renamed from: b */
    private Boolean f10630b;

    /* renamed from: c */
    private String f10631c = null;

    public C3852d6(C4009pa paVar, String str) {
        C3705r.m14346k(paVar);
        this.f10629a = paVar;
    }

    /* renamed from: S0 */
    private final void m14686S0(C3844cb cbVar, boolean z) {
        C3705r.m14346k(cbVar);
        C3705r.m14342g(cbVar.f10593f);
        m14687T0(cbVar.f10593f, false);
        this.f10629a.mo12289h0().mo12495L(cbVar.f10594o, cbVar.f10585D);
    }

    /* renamed from: T0 */
    private final void m14687T0(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f10630b == null) {
                        if (!"com.google.android.gms".equals(this.f10631c) && !C3768o.m14536a(this.f10629a.mo11938f(), Binder.getCallingUid())) {
                            if (!C3738j.m14462a(this.f10629a.mo11938f()).mo11706c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f10630b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f10630b = Boolean.valueOf(z2);
                    }
                    if (this.f10630b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f10629a.mo11935b().mo12544r().mo12477b("Measurement Service called with invalid calling package. appId", C4122z3.m15469z(str));
                    throw e;
                }
            }
            if (this.f10631c == null && C3637i.m14133j(this.f10629a.mo11938f(), Binder.getCallingUid(), str)) {
                this.f10631c = str;
            }
            if (!str.equals(this.f10631c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f10629a.mo11935b().mo12544r().mo12476a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: k */
    private final void m14689k(C4094x xVar, C3844cb cbVar) {
        this.f10629a.mo12284e();
        this.f10629a.mo12292j(xVar, cbVar);
    }

    /* renamed from: A */
    public final byte[] mo11902A(C4094x xVar, String str) {
        C3705r.m14342g(str);
        C3705r.m14346k(xVar);
        m14687T0(str, true);
        this.f10629a.mo11935b().mo12543q().mo12477b("Log and bundle. event", this.f10629a.mo12278X().mo12438d(xVar.f11381f));
        long nanoTime = this.f10629a.mo11936c().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f10629a.mo11934a().mo12108t(new C4112y5(this, xVar, str)).get();
            if (bArr == null) {
                this.f10629a.mo11935b().mo12544r().mo12477b("Log and bundle returned null. appId", C4122z3.m15469z(str));
                bArr = new byte[0];
            }
            this.f10629a.mo11935b().mo12543q().mo12479d("Log and bundle processed. event, size, time_ms", this.f10629a.mo12278X().mo12438d(xVar.f11381f), Integer.valueOf(bArr.length), Long.valueOf((this.f10629a.mo11936c().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12479d("Failed to log and bundle. appId, event, error", C4122z3.m15469z(str), this.f10629a.mo12278X().mo12438d(xVar.f11381f), e);
            return null;
        }
    }

    /* renamed from: B0 */
    public final void mo11903B0(C3844cb cbVar) {
        C3705r.m14342g(cbVar.f10593f);
        m14687T0(cbVar.f10593f, false);
        mo11909R0(new C4052t5(this, cbVar));
    }

    /* renamed from: D */
    public final String mo11904D(C3844cb cbVar) {
        m14686S0(cbVar, false);
        return this.f10629a.mo12293j0(cbVar);
    }

    /* renamed from: F0 */
    public final void mo11905F0(C3845d dVar, C3844cb cbVar) {
        C3705r.m14346k(dVar);
        C3705r.m14346k(dVar.f10608p);
        m14686S0(cbVar, false);
        C3845d dVar2 = new C3845d(dVar);
        dVar2.f10606f = cbVar.f10593f;
        mo11909R0(new C3980n5(this, dVar2, cbVar));
    }

    /* renamed from: J */
    public final List mo11906J(String str, String str2, String str3) {
        m14687T0(str, true);
        try {
            return (List) this.f10629a.mo11934a().mo12107s(new C4040s5(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12477b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public final void mo11907P0(C4094x xVar, C3844cb cbVar) {
        C4098x3 v;
        String str;
        String str2;
        if (!this.f10629a.mo12281a0().mo11869C(cbVar.f10593f)) {
            m14689k(xVar, cbVar);
            return;
        }
        this.f10629a.mo11935b().mo12548v().mo12477b("EES config found for", cbVar.f10593f);
        C3838c5 a0 = this.f10629a.mo12281a0();
        String str3 = cbVar.f10593f;
        C6728c1 c1Var = TextUtils.isEmpty(str3) ? null : (C6728c1) a0.f10566j.mo6177c(str3);
        if (c1Var != null) {
            try {
                Map I = this.f10629a.mo12287g0().mo12395I(xVar.f11382o.mo12453r(), true);
                String a = C3930j6.m14950a(xVar.f11381f);
                if (a == null) {
                    a = xVar.f11381f;
                }
                if (c1Var.mo19598e(new C6709b(a, xVar.f11384q, I))) {
                    if (c1Var.mo19600g()) {
                        this.f10629a.mo11935b().mo12548v().mo12477b("EES edited event", xVar.f11381f);
                        xVar = this.f10629a.mo12287g0().mo12389A(c1Var.mo19594a().mo19587b());
                    }
                    m14689k(xVar, cbVar);
                    if (c1Var.mo19599f()) {
                        for (C6709b bVar : c1Var.mo19594a().mo19588c()) {
                            this.f10629a.mo11935b().mo12548v().mo12477b("EES logging created event", bVar.mo19547d());
                            m14689k(this.f10629a.mo12287g0().mo12389A(bVar), cbVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (C7068x1 unused) {
                this.f10629a.mo11935b().mo12544r().mo12478c("EES error. appId, eventName", cbVar.f10594o, xVar.f11381f);
            }
            v = this.f10629a.mo11935b().mo12548v();
            str = xVar.f11381f;
            str2 = "EES was not applied to event";
        } else {
            v = this.f10629a.mo11935b().mo12548v();
            str = cbVar.f10593f;
            str2 = "EES not loaded for";
        }
        v.mo12477b(str2, str);
        m14689k(xVar, cbVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public final /* synthetic */ void mo11908Q0(String str, Bundle bundle) {
        C3974n W = this.f10629a.mo12277W();
        W.mo11931h();
        W.mo11893i();
        byte[] k = W.f10552b.mo12287g0().mo12390B(new C4034s(W.f10651a, HttpUrl.FRAGMENT_ENCODE_SET, str, "dep", 0, 0, bundle)).mo19840k();
        W.f10651a.mo11935b().mo12548v().mo12478c("Saving default event parameters, appId, data size", W.f10651a.mo12152D().mo12438d(str), Integer.valueOf(k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", k);
        try {
            if (W.mo12202P().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                W.f10651a.mo11935b().mo12544r().mo12477b("Failed to insert default event parameters (got -1). appId", C4122z3.m15469z(str));
            }
        } catch (SQLiteException e) {
            W.f10651a.mo11935b().mo12544r().mo12478c("Error storing default event parameters. appId", C4122z3.m15469z(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public final void mo11909R0(Runnable runnable) {
        C3705r.m14346k(runnable);
        if (this.f10629a.mo11934a().mo12105C()) {
            runnable.run();
        } else {
            this.f10629a.mo11934a().mo12110z(runnable);
        }
    }

    /* renamed from: V */
    public final void mo11910V(C4094x xVar, C3844cb cbVar) {
        C3705r.m14346k(xVar);
        m14686S0(cbVar, false);
        mo11909R0(new C4088w5(this, xVar, cbVar));
    }

    /* renamed from: b0 */
    public final void mo11911b0(C3844cb cbVar) {
        m14686S0(cbVar, false);
        mo11909R0(new C3826b6(this, cbVar));
    }

    /* renamed from: d0 */
    public final List mo11912d0(String str, String str2, C3844cb cbVar) {
        m14686S0(cbVar, false);
        String str3 = cbVar.f10593f;
        C3705r.m14346k(str3);
        try {
            return (List) this.f10629a.mo11934a().mo12107s(new C4028r5(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12477b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: j0 */
    public final void mo11913j0(long j, String str, String str2, String str3) {
        mo11909R0(new C3839c6(this, str2, str3, str, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final C4094x mo11914m(C4094x xVar, C3844cb cbVar) {
        C4070v vVar;
        if (!(!"_cmp".equals(xVar.f11381f) || (vVar = xVar.f11382o) == null || vVar.mo12452o() == 0)) {
            String H = xVar.f11382o.mo12450H("_cis");
            if ("referrer broadcast".equals(H) || "referrer API".equals(H)) {
                this.f10629a.mo11935b().mo12547u().mo12477b("Event has been filtered ", xVar.toString());
                return new C4094x("_cmpx", xVar.f11382o, xVar.f11383p, xVar.f11384q);
            }
        }
        return xVar;
    }

    /* renamed from: m0 */
    public final void mo11915m0(C4094x xVar, String str, String str2) {
        C3705r.m14346k(xVar);
        C3705r.m14342g(str);
        m14687T0(str, true);
        mo11909R0(new C4100x5(this, xVar, str));
    }

    /* renamed from: q */
    public final void mo11916q(C3844cb cbVar) {
        m14686S0(cbVar, false);
        mo11909R0(new C4064u5(this, cbVar));
    }

    /* renamed from: u */
    public final void mo11917u(Bundle bundle, C3844cb cbVar) {
        m14686S0(cbVar, false);
        String str = cbVar.f10593f;
        C3705r.m14346k(str);
        mo11909R0(new C3968m5(this, str, bundle));
    }

    /* renamed from: u0 */
    public final void mo11918u0(C3844cb cbVar) {
        C3705r.m14342g(cbVar.f10593f);
        C3705r.m14346k(cbVar.f10590I);
        C4076v5 v5Var = new C4076v5(this, cbVar);
        C3705r.m14346k(v5Var);
        if (this.f10629a.mo11934a().mo12105C()) {
            v5Var.run();
        } else {
            this.f10629a.mo11934a().mo12104A(v5Var);
        }
    }

    /* renamed from: v0 */
    public final List mo11919v0(String str, String str2, boolean z, C3844cb cbVar) {
        m14686S0(cbVar, false);
        String str3 = cbVar.f10593f;
        C3705r.m14346k(str3);
        try {
            List<C4069ua> list = (List) this.f10629a.mo11934a().mo12107s(new C4004p5(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4069ua uaVar : list) {
                if (z || !C4105xa.m15394W(uaVar.f11330c)) {
                    arrayList.add(new C4045sa(uaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12478c("Failed to query user properties. appId", C4122z3.m15469z(cbVar.f10593f), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: w */
    public final List mo11920w(String str, String str2, String str3, boolean z) {
        m14687T0(str, true);
        try {
            List<C4069ua> list = (List) this.f10629a.mo11934a().mo12107s(new C4016q5(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4069ua uaVar : list) {
                if (z || !C4105xa.m15394W(uaVar.f11330c)) {
                    arrayList.add(new C4045sa(uaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12478c("Failed to get user properties as. appId", C4122z3.m15469z(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: x */
    public final void mo11921x(C3845d dVar) {
        C3705r.m14346k(dVar);
        C3705r.m14346k(dVar.f10608p);
        C3705r.m14342g(dVar.f10606f);
        m14687T0(dVar.f10606f, true);
        mo11909R0(new C3992o5(this, new C3845d(dVar)));
    }

    /* renamed from: z */
    public final List mo11922z(C3844cb cbVar, boolean z) {
        m14686S0(cbVar, false);
        String str = cbVar.f10593f;
        C3705r.m14346k(str);
        try {
            List<C4069ua> list = (List) this.f10629a.mo11934a().mo12107s(new C3813a6(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C4069ua uaVar : list) {
                if (z || !C4105xa.m15394W(uaVar.f11330c)) {
                    arrayList.add(new C4045sa(uaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f10629a.mo11935b().mo12544r().mo12478c("Failed to get user properties. appId", C4122z3.m15469z(cbVar.f10593f), e);
            return null;
        }
    }

    /* renamed from: z0 */
    public final void mo11923z0(C4045sa saVar, C3844cb cbVar) {
        C3705r.m14346k(saVar);
        m14686S0(cbVar, false);
        mo11909R0(new C4124z5(this, saVar, cbVar));
    }
}
