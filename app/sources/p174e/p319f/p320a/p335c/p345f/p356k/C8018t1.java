package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: e.f.a.c.f.k.t1 */
final class C8018t1 implements C4884g {

    /* renamed from: a */
    private boolean f21784a = false;

    /* renamed from: b */
    private boolean f21785b = false;

    /* renamed from: c */
    private C4878c f21786c;

    /* renamed from: d */
    private final C7966p1 f21787d;

    C8018t1(C7966p1 p1Var) {
        this.f21787d = p1Var;
    }

    /* renamed from: b */
    private final void m28196b() {
        if (!this.f21784a) {
            this.f21784a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21576a(C4878c cVar, boolean z) {
        this.f21784a = false;
        this.f21786c = cVar;
        this.f21785b = z;
    }

    /* renamed from: d */
    public final C4884g mo14859d(String str) {
        m28196b();
        this.f21787d.mo21529g(this.f21786c, str, this.f21785b);
        return this;
    }

    /* renamed from: e */
    public final C4884g mo14860e(boolean z) {
        m28196b();
        this.f21787d.mo21530h(this.f21786c, z ? 1 : 0, this.f21785b);
        return this;
    }
}
