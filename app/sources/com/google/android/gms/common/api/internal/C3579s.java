package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3480b;
import com.google.android.gms.common.api.Status;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.s */
public class C3579s {
    /* renamed from: a */
    public static void m13921a(Status status, C8965m<Void> mVar) {
        m13922b(status, (Object) null, mVar);
    }

    /* renamed from: b */
    public static <TResult> void m13922b(Status status, TResult tresult, C8965m<TResult> mVar) {
        if (status.mo11167E()) {
            mVar.mo22784c(tresult);
        } else {
            mVar.mo22783b(new C3480b(status));
        }
    }
}
