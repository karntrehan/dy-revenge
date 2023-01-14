package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3629e;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

/* renamed from: com.google.android.gms.common.api.internal.v2 */
public abstract class C3594v2 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: o */
    protected volatile boolean f10139o;

    /* renamed from: p */
    protected final AtomicReference<C3582s2> f10140p = new AtomicReference<>((Object) null);

    /* renamed from: q */
    private final Handler f10141q = new C6686j(Looper.getMainLooper());

    /* renamed from: r */
    protected final C3629e f10142r;

    C3594v2(C3531h hVar, C3629e eVar) {
        super(hVar);
        this.f10142r = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m13990l(C3623b bVar, int i) {
        this.f10140p.set((Object) null);
        mo11400m(bVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m13991o() {
        this.f10140p.set((Object) null);
        mo11401n();
    }

    /* renamed from: p */
    private static final int m13992p(C3582s2 s2Var) {
        if (s2Var == null) {
            return -1;
        }
        return s2Var.mo11418a();
    }

    /* renamed from: e */
    public final void mo11250e(int i, int i2, Intent intent) {
        C3582s2 s2Var = this.f10140p.get();
        if (i != 1) {
            if (i == 2) {
                int i3 = this.f10142r.mo11484i(mo11249b());
                if (i3 == 0) {
                    m13991o();
                    return;
                } else if (s2Var != null) {
                    if (s2Var.mo11419b().mo11462o() == 18 && i3 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m13991o();
            return;
        } else if (i2 == 0) {
            if (s2Var != null) {
                int i4 = 13;
                if (intent != null) {
                    i4 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m13990l(new C3623b(i4, (PendingIntent) null, s2Var.mo11419b().toString()), m13992p(s2Var));
                return;
            }
            return;
        }
        if (s2Var != null) {
            m13990l(s2Var.mo11419b(), s2Var.mo11418a());
        }
    }

    /* renamed from: f */
    public final void mo11251f(Bundle bundle) {
        super.mo11251f(bundle);
        if (bundle != null) {
            this.f10140p.set(bundle.getBoolean("resolving_error", false) ? new C3582s2(new C3623b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: i */
    public final void mo11254i(Bundle bundle) {
        super.mo11254i(bundle);
        C3582s2 s2Var = this.f10140p.get();
        if (s2Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", s2Var.mo11418a());
            bundle.putInt("failed_status", s2Var.mo11419b().mo11462o());
            bundle.putParcelable("failed_resolution", s2Var.mo11419b().mo11464r());
        }
    }

    /* renamed from: j */
    public void mo11255j() {
        super.mo11255j();
        this.f10139o = true;
    }

    /* renamed from: k */
    public void mo11256k() {
        super.mo11256k();
        this.f10139o = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo11400m(C3623b bVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo11401n();

    public final void onCancel(DialogInterface dialogInterface) {
        m13990l(new C3623b(13, (PendingIntent) null), m13992p(this.f10140p.get()));
    }

    /* renamed from: s */
    public final void mo11428s(C3623b bVar, int i) {
        C3582s2 s2Var = new C3582s2(bVar, i);
        if (this.f10140p.compareAndSet((Object) null, s2Var)) {
            this.f10141q.post(new C3590u2(this, s2Var));
        }
    }
}
