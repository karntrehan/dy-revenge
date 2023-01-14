package com.google.firebase.p156m.p159j;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: com.google.firebase.m.j.i */
class C4906i implements C4884g {

    /* renamed from: a */
    private boolean f13760a = false;

    /* renamed from: b */
    private boolean f13761b = false;

    /* renamed from: c */
    private C4878c f13762c;

    /* renamed from: d */
    private final C4902g f13763d;

    C4906i(C4902g gVar) {
        this.f13763d = gVar;
    }

    /* renamed from: a */
    private void m18750a() {
        if (!this.f13760a) {
            this.f13760a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14908b(C4878c cVar, boolean z) {
        this.f13760a = false;
        this.f13762c = cVar;
        this.f13761b = z;
    }

    /* renamed from: d */
    public C4884g mo14859d(String str) {
        m18750a();
        this.f13763d.mo14895g(this.f13762c, str, this.f13761b);
        return this;
    }

    /* renamed from: e */
    public C4884g mo14860e(boolean z) {
        m18750a();
        this.f13763d.mo14901m(this.f13762c, z, this.f13761b);
        return this;
    }
}
