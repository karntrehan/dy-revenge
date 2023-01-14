package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.internal.u2 */
final class C3590u2 implements Runnable {

    /* renamed from: f */
    private final C3582s2 f10133f;

    /* renamed from: o */
    final /* synthetic */ C3594v2 f10134o;

    C3590u2(C3594v2 v2Var, C3582s2 s2Var) {
        this.f10134o = v2Var;
        this.f10133f = s2Var;
    }

    public final void run() {
        if (this.f10134o.f10139o) {
            C3623b b = this.f10133f.mo11419b();
            if (b.mo11457C()) {
                C3594v2 v2Var = this.f10134o;
                v2Var.f9888f.startActivityForResult(GoogleApiActivity.m13496a(v2Var.mo11249b(), (PendingIntent) C3705r.m14346k(b.mo11464r()), this.f10133f.mo11418a(), false), 1);
                return;
            }
            C3594v2 v2Var2 = this.f10134o;
            if (v2Var2.f10142r.mo11481d(v2Var2.mo11249b(), b.mo11462o(), (String) null) != null) {
                C3594v2 v2Var3 = this.f10134o;
                v2Var3.f10142r.mo11479A(v2Var3.mo11249b(), this.f10134o.f9888f, b.mo11462o(), 2, this.f10134o);
            } else if (b.mo11462o() == 18) {
                C3594v2 v2Var4 = this.f10134o;
                Dialog v = v2Var4.f10142r.mo11494v(v2Var4.mo11249b(), this.f10134o);
                C3594v2 v2Var5 = this.f10134o;
                v2Var5.f10142r.mo11495w(v2Var5.mo11249b().getApplicationContext(), new C3586t2(this, v));
            } else {
                this.f10134o.m13990l(b, this.f10133f.mo11418a());
            }
        }
    }
}
