package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.C2698h;
import com.facebook.react.devsupport.p114j.C2730d;
import com.facebook.react.util.C3089c;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.devsupport.f */
public class C2723f implements C2698h {

    /* renamed from: a */
    private View f7812a;

    /* renamed from: b */
    private C2722e f7813b;

    /* renamed from: c */
    private final C2730d f7814c;

    C2723f(C2730d dVar) {
        this.f7814c = dVar;
    }

    /* renamed from: f */
    private boolean m11011f() {
        return this.f7813b != null;
    }

    /* renamed from: a */
    public void mo8825a() {
        if (!m11011f() && mo8826b()) {
            Activity x = this.f7814c.mo8901x();
            if (x == null || x.isFinishing()) {
                C3089c.m12175a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
                return;
            }
            C2722e eVar = new C2722e(x, this.f7812a);
            this.f7813b = eVar;
            eVar.setCancelable(false);
            this.f7813b.show();
        }
    }

    /* renamed from: b */
    public boolean mo8826b() {
        return this.f7812a != null;
    }

    /* renamed from: c */
    public void mo8827c() {
        View view = this.f7812a;
        if (view != null) {
            this.f7814c.mo8890m(view);
            this.f7812a = null;
        }
    }

    /* renamed from: d */
    public void mo8828d(String str) {
        C6409a.m24520b(str.equals(LogBoxModule.NAME), "This surface manager can only create LogBox React application");
        View c = this.f7814c.mo8880c(LogBoxModule.NAME);
        this.f7812a = c;
        if (c == null) {
            C3089c.m12175a("Unable to launch logbox because react was unable to create the root view");
        }
    }

    /* renamed from: e */
    public void mo8829e() {
        if (m11011f()) {
            View view = this.f7812a;
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) this.f7812a.getParent()).removeView(this.f7812a);
            }
            this.f7813b.dismiss();
            this.f7813b = null;
        }
    }
}
