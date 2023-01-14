package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3493i;
import com.google.android.gms.common.api.C3612k;
import com.google.android.gms.common.api.C3613l;
import com.google.android.gms.common.api.C3614m;
import com.google.android.gms.common.api.C3615n;
import com.google.android.gms.common.api.C3616o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3705r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.i2 */
public final class C3540i2<R extends C3612k> extends C3616o<R> implements C3613l<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3615n<? super R, ? extends C3612k> f9987a;

    /* renamed from: b */
    private C3540i2<? extends C3612k> f9988b;

    /* renamed from: c */
    private volatile C3614m<? super R> f9989c;

    /* renamed from: d */
    private final Object f9990d;

    /* renamed from: e */
    private Status f9991e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<C3486f> f9992f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3529g2 f9993g;

    /* renamed from: g */
    private final void m13761g(Status status) {
        synchronized (this.f9990d) {
            this.f9991e = status;
            m13762h(status);
        }
    }

    /* renamed from: h */
    private final void m13762h(Status status) {
        synchronized (this.f9990d) {
            C3615n<? super R, ? extends C3612k> nVar = this.f9987a;
            if (nVar != null) {
                ((C3540i2) C3705r.m14346k(this.f9988b)).m13761g((Status) C3705r.m14347l(nVar.mo11450a(status), "onFailure must not return null"));
            } else if (m13763i()) {
                ((C3614m) C3705r.m14346k(this.f9989c)).mo11448b(status);
            }
        }
    }

    /* renamed from: i */
    private final boolean m13763i() {
        return (this.f9989c == null || ((C3486f) this.f9992f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m13764j(C3612k kVar) {
        if (kVar instanceof C3493i) {
            try {
                ((C3493i) kVar).mo11237a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                valueOf.length();
                Log.w("TransformedResultImpl", "Unable to release ".concat(valueOf), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo11371a(R r) {
        synchronized (this.f9990d) {
            if (!r.mo11102k().mo11167E()) {
                m13761g(r.mo11102k());
                m13764j(r);
            } else if (this.f9987a != null) {
                C3605y1.m14041a().submit(new C3524f2(this, r));
            } else if (m13763i()) {
                ((C3614m) C3705r.m14346k(this.f9989c)).mo11449c(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo11372f() {
        this.f9989c = null;
    }
}
