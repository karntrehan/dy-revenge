package com.swmansion.rnscreens;

import androidx.activity.C0043b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.C1214c;
import androidx.fragment.app.Fragment;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.s */
public final class C10080s {

    /* renamed from: a */
    private final Fragment f26830a;

    /* renamed from: b */
    private final C0043b f26831b;

    /* renamed from: c */
    private boolean f26832c;

    /* renamed from: d */
    private boolean f26833d = true;

    public C10080s(Fragment fragment, C0043b bVar) {
        C10457l.m35320e(fragment, "fragment");
        C10457l.m35320e(bVar, "mOnBackPressedCallback");
        this.f26830a = fragment;
        this.f26831b = bVar;
    }

    /* renamed from: a */
    public final boolean mo25048a() {
        return this.f26833d;
    }

    /* renamed from: b */
    public final void mo25049b() {
        OnBackPressedDispatcher b;
        if (!this.f26832c && this.f26833d) {
            C1214c l = this.f26830a.mo3909l();
            if (!(l == null || (b = l.mo128b()) == null)) {
                b.mo139a(this.f26830a, this.f26831b);
            }
            this.f26832c = true;
        }
    }

    /* renamed from: c */
    public final void mo25050c() {
        if (this.f26832c) {
            this.f26831b.mo146d();
            this.f26832c = false;
        }
    }

    /* renamed from: d */
    public final void mo25051d(boolean z) {
        this.f26833d = z;
    }
}
