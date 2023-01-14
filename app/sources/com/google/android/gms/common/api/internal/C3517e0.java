package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3705r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.e0 */
final class C3517e0 implements C3651c.C3654c {

    /* renamed from: a */
    private final WeakReference<C3567p0> f9923a;

    /* renamed from: b */
    private final C3469a<?> f9924b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final boolean f9925c;

    public C3517e0(C3567p0 p0Var, C3469a<?> aVar, boolean z) {
        this.f9923a = new WeakReference<>(p0Var);
        this.f9924b = aVar;
        this.f9925c = z;
    }

    /* renamed from: a */
    public final void mo11308a(C3623b bVar) {
        C3567p0 p0Var = (C3567p0) this.f9923a.get();
        if (p0Var != null) {
            C3705r.m14350o(Looper.myLooper() == p0Var.f10036a.f10169n.mo11222k(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            p0Var.f10037b.lock();
            try {
                if (p0Var.m13854n(0)) {
                    if (!bVar.mo11458E()) {
                        p0Var.m13852l(bVar, this.f9924b, this.f9925c);
                    }
                    if (p0Var.m13855o()) {
                        p0Var.m13853m();
                    }
                }
            } finally {
                p0Var.f10037b.unlock();
            }
        }
    }
}
