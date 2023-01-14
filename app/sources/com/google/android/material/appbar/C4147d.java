package com.google.android.material.appbar;

import android.view.View;
import p027c.p064i.p072j.C1988t;

/* renamed from: com.google.android.material.appbar.d */
class C4147d {

    /* renamed from: a */
    private final View f11543a;

    /* renamed from: b */
    private int f11544b;

    /* renamed from: c */
    private int f11545c;

    /* renamed from: d */
    private int f11546d;

    /* renamed from: e */
    private int f11547e;

    /* renamed from: f */
    private boolean f11548f = true;

    /* renamed from: g */
    private boolean f11549g = true;

    public C4147d(View view) {
        this.f11543a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12664a() {
        View view = this.f11543a;
        C1988t.m8367Y(view, this.f11546d - (view.getTop() - this.f11544b));
        View view2 = this.f11543a;
        C1988t.m8366X(view2, this.f11547e - (view2.getLeft() - this.f11545c));
    }

    /* renamed from: b */
    public int mo12665b() {
        return this.f11546d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo12666c() {
        this.f11544b = this.f11543a.getTop();
        this.f11545c = this.f11543a.getLeft();
    }

    /* renamed from: d */
    public boolean mo12667d(int i) {
        if (!this.f11549g || this.f11547e == i) {
            return false;
        }
        this.f11547e = i;
        mo12664a();
        return true;
    }

    /* renamed from: e */
    public boolean mo12668e(int i) {
        if (!this.f11548f || this.f11546d == i) {
            return false;
        }
        this.f11546d = i;
        mo12664a();
        return true;
    }
}
