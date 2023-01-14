package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.internal.C3562o;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p027c.p092r.p094b.C2075a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C3445g extends C2075a implements C3562o {

    /* renamed from: p */
    private final Semaphore f9791p = new Semaphore(0);

    /* renamed from: q */
    private final Set f9792q;

    public C3445g(Context context, Set set) {
        super(context);
        this.f9792q = set;
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ Object mo6974B() {
        int i = 0;
        for (C3486f l : this.f9792q) {
            if (l.mo11223l(this)) {
                i++;
            }
        }
        try {
            this.f9791p.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo11132a() {
        this.f9791p.release();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo6999p() {
        this.f9791p.drainPermits();
        mo6994i();
    }
}
