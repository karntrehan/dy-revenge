package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: e.f.a.c.f.i.j2 */
final class C7289j2 implements C4884g {

    /* renamed from: a */
    private boolean f19425a = false;

    /* renamed from: b */
    private boolean f19426b = false;

    /* renamed from: c */
    private C4878c f19427c;

    /* renamed from: d */
    private final C7230f2 f19428d;

    C7289j2(C7230f2 f2Var) {
        this.f19428d = f2Var;
    }

    /* renamed from: b */
    private final void m27324b() {
        if (!this.f19425a) {
            this.f19425a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20778a(C4878c cVar, boolean z) {
        this.f19425a = false;
        this.f19427c = cVar;
        this.f19426b = z;
    }

    /* renamed from: d */
    public final C4884g mo14859d(String str) {
        m27324b();
        this.f19428d.mo20695g(this.f19427c, str, this.f19426b);
        return this;
    }

    /* renamed from: e */
    public final C4884g mo14860e(boolean z) {
        m27324b();
        this.f19428d.mo20696h(this.f19427c, z ? 1 : 0, this.f19426b);
        return this;
    }
}
