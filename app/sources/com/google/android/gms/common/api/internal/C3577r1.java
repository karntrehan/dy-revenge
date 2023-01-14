package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.api.C3480b;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
public final class C3577r1 extends C3594v2 {

    /* renamed from: s */
    private C8965m<Void> f10071s = new C8965m<>();

    private C3577r1(C3531h hVar) {
        super(hVar, C3629e.m14086q());
        this.f9888f.mo11348a("GmsAvailabilityHelper", this);
    }

    /* renamed from: t */
    public static C3577r1 m13914t(Activity activity) {
        C3531h c = LifecycleCallback.m13593c(activity);
        C3577r1 r1Var = (C3577r1) c.mo11349c("GmsAvailabilityHelper", C3577r1.class);
        if (r1Var == null) {
            return new C3577r1(c);
        }
        if (r1Var.f10071s.mo22782a().mo22778n()) {
            r1Var.f10071s = new C8965m<>();
        }
        return r1Var;
    }

    /* renamed from: g */
    public final void mo11252g() {
        super.mo11252g();
        this.f10071s.mo22785d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11400m(C3623b bVar, int i) {
        String p = bVar.mo11463p();
        if (p == null) {
            p = "Error connecting to Google Play services";
        }
        this.f10071s.mo22783b(new C3480b(new Status(bVar, p, bVar.mo11462o())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11401n() {
        Activity d = this.f9888f.mo11350d();
        if (d == null) {
            this.f10071s.mo22785d(new C3480b(new Status(8)));
            return;
        }
        int i = this.f10142r.mo11484i(d);
        if (i == 0) {
            this.f10071s.mo22786e(null);
        } else if (!this.f10071s.mo22782a().mo22778n()) {
            mo11428s(new C3623b(i, (PendingIntent) null), 0);
        }
    }

    /* renamed from: u */
    public final C8963l<Void> mo11413u() {
        return this.f10071s.mo22782a();
    }
}
