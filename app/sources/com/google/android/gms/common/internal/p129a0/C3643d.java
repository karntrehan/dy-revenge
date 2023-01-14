package com.google.android.gms.common.internal.p129a0;

import android.content.Context;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3483e;
import com.google.android.gms.common.api.internal.C3574r;
import com.google.android.gms.common.internal.C3717v;
import com.google.android.gms.common.internal.C3723x;
import com.google.android.gms.common.internal.C3726y;
import p174e.p319f.p320a.p335c.p345f.p350e.C6680d;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: com.google.android.gms.common.internal.a0.d */
public final class C3643d extends C3483e<C3726y> implements C3723x {

    /* renamed from: k */
    private static final C3469a.C3479g<C3644e> f10222k;

    /* renamed from: l */
    private static final C3469a.C3470a<C3644e, C3726y> f10223l;

    /* renamed from: m */
    private static final C3469a<C3726y> f10224m;

    /* renamed from: n */
    public static final /* synthetic */ int f10225n = 0;

    static {
        C3469a.C3479g<C3644e> gVar = new C3469a.C3479g<>();
        f10222k = gVar;
        C3642c cVar = new C3642c();
        f10223l = cVar;
        f10224m = new C3469a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C3643d(Context context, C3726y yVar) {
        super(context, f10224m, yVar, C3483e.C3484a.f9847a);
    }

    /* renamed from: a */
    public final C8963l<Void> mo11515a(C3717v vVar) {
        C3574r.C3575a a = C3574r.m13902a();
        a.mo11410d(C6680d.f18336a);
        a.mo11409c(false);
        a.mo11408b(new C3641b(vVar));
        return mo11204d(a.mo11407a());
    }
}
