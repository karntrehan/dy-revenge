package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: e.f.a.c.f.m.y1 */
final class C8898y1 implements C4884g {

    /* renamed from: a */
    private boolean f24227a = false;

    /* renamed from: b */
    private boolean f24228b = false;

    /* renamed from: c */
    private C4878c f24229c;

    /* renamed from: d */
    private final C8848u1 f24230d;

    C8898y1(C8848u1 u1Var) {
        this.f24230d = u1Var;
    }

    /* renamed from: b */
    private final void m29760b() {
        if (!this.f24227a) {
            this.f24227a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22714a(C4878c cVar, boolean z) {
        this.f24227a = false;
        this.f24229c = cVar;
        this.f24228b = z;
    }

    /* renamed from: d */
    public final C4884g mo14859d(String str) {
        m29760b();
        this.f24230d.mo22666g(this.f24229c, str, this.f24228b);
        return this;
    }

    /* renamed from: e */
    public final C4884g mo14860e(boolean z) {
        m29760b();
        this.f24230d.mo22667h(this.f24229c, z ? 1 : 0, this.f24228b);
        return this;
    }
}
