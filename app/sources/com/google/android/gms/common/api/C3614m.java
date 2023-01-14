package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.C3612k;

/* renamed from: com.google.android.gms.common.api.m */
public abstract class C3614m<R extends C3612k> implements C3613l<R> {
    /* renamed from: a */
    public final void mo11371a(R r) {
        Status k = r.mo11102k();
        if (k.mo11167E()) {
            mo11449c(r);
            return;
        }
        mo11448b(k);
        if (r instanceof C3493i) {
            try {
                ((C3493i) r).mo11237a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(r);
                valueOf.length();
                Log.w("ResultCallbacks", "Unable to release ".concat(valueOf), e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo11448b(Status status);

    /* renamed from: c */
    public abstract void mo11449c(R r);
}
