package p174e.p319f.p320a.p382e.p383a.p385b;

import java.util.Objects;

/* renamed from: e.f.a.e.a.b.v */
final class C9143v extends C9137s {

    /* renamed from: a */
    private final C9141u f25022a = new C9141u();

    C9143v() {
    }

    /* renamed from: a */
    public final void mo23112a(Throwable th, Throwable th2) {
        if (th2 != th) {
            Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
            this.f25022a.mo23118a(th).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
