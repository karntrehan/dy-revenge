package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C3570q;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.h */
public final class C3492h {
    /* renamed from: a */
    public static <R extends C3612k> C3490g<R> m13574a(R r, C3486f fVar) {
        C3705r.m14347l(r, "Result must not be null");
        C3705r.m14337b(!r.mo11102k().mo11167E(), "Status code must not be SUCCESS");
        C3620s sVar = new C3620s(fVar, r);
        sVar.mo11242h(r);
        return sVar;
    }

    /* renamed from: b */
    public static C3490g<Status> m13575b(Status status, C3486f fVar) {
        C3705r.m14347l(status, "Result must not be null");
        C3570q qVar = new C3570q(fVar);
        qVar.mo11242h(status);
        return qVar;
    }
}
