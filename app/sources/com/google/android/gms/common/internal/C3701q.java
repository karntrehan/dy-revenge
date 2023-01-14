package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.C3612k;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.internal.q */
public class C3701q {

    /* renamed from: a */
    private static final C3709s0 f10358a = new C3699p0();

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public interface C3702a<R extends C3612k, T> {
        /* renamed from: a */
        T mo11151a(R r);
    }

    /* renamed from: a */
    public static <R extends C3612k, T> C8963l<T> m14328a(C3490g<R> gVar, C3702a<R, T> aVar) {
        C3709s0 s0Var = f10358a;
        C8965m mVar = new C8965m();
        gVar.mo11234a(new C3703q0(gVar, mVar, aVar, s0Var));
        return mVar.mo22782a();
    }

    /* renamed from: b */
    public static <R extends C3612k> C8963l<Void> m14329b(C3490g<R> gVar) {
        return m14328a(gVar, new C3706r0());
    }
}
