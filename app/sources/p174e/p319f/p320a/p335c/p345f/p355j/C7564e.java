package p174e.p319f.p320a.p335c.p345f.p355j;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: e.f.a.c.f.j.e */
final class C7564e implements C4884g {

    /* renamed from: a */
    private boolean f20333a = false;

    /* renamed from: b */
    private boolean f20334b = false;

    /* renamed from: c */
    private C4878c f20335c;

    /* renamed from: d */
    private final C7633k8 f20336d;

    C7564e(C7633k8 k8Var) {
        this.f20336d = k8Var;
    }

    /* renamed from: b */
    private final void m27618b() {
        if (!this.f20333a) {
            this.f20333a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21073a(C4878c cVar, boolean z) {
        this.f20333a = false;
        this.f20335c = cVar;
        this.f20334b = z;
    }

    /* renamed from: d */
    public final C4884g mo14859d(String str) {
        m27618b();
        this.f20336d.mo21109g(this.f20335c, str, this.f20334b);
        return this;
    }

    /* renamed from: e */
    public final C4884g mo14860e(boolean z) {
        m27618b();
        this.f20336d.mo21110h(this.f20335c, z ? 1 : 0, this.f20334b);
        return this;
    }
}
