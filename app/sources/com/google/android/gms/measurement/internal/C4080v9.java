package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p174e.p319f.p320a.p335c.p345f.p352g.C6840id;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
final class C4080v9 {

    /* renamed from: a */
    protected long f11348a;

    /* renamed from: b */
    protected long f11349b;

    /* renamed from: c */
    private final C4010q f11350c;

    /* renamed from: d */
    final /* synthetic */ C4104x9 f11351d;

    public C4080v9(C4104x9 x9Var) {
        this.f11351d = x9Var;
        this.f11350c = new C4068u9(this, x9Var.f10651a);
        long b = x9Var.f10651a.mo11936c().mo11731b();
        this.f11348a = b;
        this.f11349b = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12460a() {
        this.f11350c.mo12311b();
        this.f11348a = 0;
        this.f11349b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12461b(long j) {
        this.f11350c.mo12311b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12462c(long j) {
        this.f11351d.mo11931h();
        this.f11350c.mo12311b();
        this.f11348a = j;
        this.f11349b = j;
    }

    /* renamed from: d */
    public final boolean mo12463d(boolean z, boolean z2, long j) {
        this.f11351d.mo11931h();
        this.f11351d.mo11949i();
        C6840id.m25913b();
        if (!this.f11351d.f10651a.mo12181z().mo12010B((String) null, C3966m3.f10997f0) || this.f11351d.f10651a.mo12174o()) {
            this.f11351d.f10651a.mo12154F().f11120p.mo12148b(this.f11351d.f10651a.mo11936c().mo11730a());
        }
        long j2 = j - this.f11348a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f11349b;
                this.f11349b = j;
            }
            this.f11351d.f10651a.mo11935b().mo12548v().mo12477b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C4105xa.m15408y(this.f11351d.f10651a.mo12158K().mo11980t(!this.f11351d.f10651a.mo12181z().mo12012D()), bundle, true);
            if (!z2) {
                this.f11351d.f10651a.mo12156I().mo12381u("auto", "_e", bundle);
            }
            this.f11348a = j;
            this.f11350c.mo12311b();
            this.f11350c.mo12313d(3600000);
            return true;
        }
        this.f11351d.f10651a.mo11935b().mo12548v().mo12477b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
