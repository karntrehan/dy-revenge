package p174e.p319f.p320a.p335c.p345f.p357l;

import com.google.firebase.p156m.C4877b;
import com.google.firebase.p156m.C4878c;
import com.google.firebase.p156m.C4884g;

/* renamed from: e.f.a.c.f.l.g2 */
final class C8224g2 implements C4884g {

    /* renamed from: a */
    private boolean f22526a = false;

    /* renamed from: b */
    private boolean f22527b = false;

    /* renamed from: c */
    private C4878c f22528c;

    /* renamed from: d */
    private final C8129b2 f22529d;

    C8224g2(C8129b2 b2Var) {
        this.f22529d = b2Var;
    }

    /* renamed from: b */
    private final void m28527b() {
        if (!this.f22526a) {
            this.f22526a = true;
            return;
        }
        throw new C4877b("Cannot encode a second value in the ValueEncoderContext");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo21824a(C4878c cVar, boolean z) {
        this.f22526a = false;
        this.f22528c = cVar;
        this.f22527b = z;
    }

    /* renamed from: d */
    public final C4884g mo14859d(String str) {
        m28527b();
        this.f22529d.mo21679g(this.f22528c, str, this.f22527b);
        return this;
    }

    /* renamed from: e */
    public final C4884g mo14860e(boolean z) {
        m28527b();
        this.f22529d.mo21680h(this.f22528c, z ? 1 : 0, this.f22527b);
        return this;
    }
}
