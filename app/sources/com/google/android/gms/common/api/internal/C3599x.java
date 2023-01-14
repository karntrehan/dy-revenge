package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.internal.C3705r;
import p027c.p060f.C1790b;

/* renamed from: com.google.android.gms.common.api.internal.x */
public final class C3599x extends C3594v2 {

    /* renamed from: s */
    private final C1790b<C3500b<?>> f10149s = new C1790b<>();

    /* renamed from: t */
    private final C3521f f10150t;

    C3599x(C3531h hVar, C3521f fVar, C3629e eVar) {
        super(hVar, eVar);
        this.f10150t = fVar;
        this.f9888f.mo11348a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m14013u(Activity activity, C3521f fVar, C3500b<?> bVar) {
        C3531h c = LifecycleCallback.m13593c(activity);
        C3599x xVar = (C3599x) c.mo11349c("ConnectionlessLifecycleHelper", C3599x.class);
        if (xVar == null) {
            xVar = new C3599x(c, fVar, C3629e.m14086q());
        }
        C3705r.m14347l(bVar, "ApiKey cannot be null");
        xVar.f10149s.add(bVar);
        fVar.mo11316d(xVar);
    }

    /* renamed from: v */
    private final void m14014v() {
        if (!this.f10149s.isEmpty()) {
            this.f10150t.mo11316d(this);
        }
    }

    /* renamed from: h */
    public final void mo11253h() {
        super.mo11253h();
        m14014v();
    }

    /* renamed from: j */
    public final void mo11255j() {
        super.mo11255j();
        m14014v();
    }

    /* renamed from: k */
    public final void mo11256k() {
        super.mo11256k();
        this.f10150t.mo11317e(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11400m(C3623b bVar, int i) {
        this.f10150t.mo11313H(bVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo11401n() {
        this.f10150t.mo11314b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C1790b<C3500b<?>> mo11436t() {
        return this.f10149s;
    }
}
