package p174e.p319f.p416e;

import okhttp3.HttpUrl;
import p174e.p319f.p416e.p420s.C9679a;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.c */
public final class C9657c {

    /* renamed from: a */
    private final C9656b f25815a;

    /* renamed from: b */
    private C9680b f25816b;

    public C9657c(C9656b bVar) {
        if (bVar != null) {
            this.f25815a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C9680b mo24201a() {
        if (this.f25816b == null) {
            this.f25816b = this.f25815a.mo24196b();
        }
        return this.f25816b;
    }

    /* renamed from: b */
    public C9679a mo24202b(int i, C9679a aVar) {
        return this.f25815a.mo24197c(i, aVar);
    }

    /* renamed from: c */
    public int mo24203c() {
        return this.f25815a.mo24198d();
    }

    /* renamed from: d */
    public int mo24204d() {
        return this.f25815a.mo24200f();
    }

    /* renamed from: e */
    public boolean mo24205e() {
        return this.f25815a.mo24199e().mo24210f();
    }

    /* renamed from: f */
    public C9657c mo24206f() {
        return new C9657c(this.f25815a.mo24195a(this.f25815a.mo24199e().mo24211g()));
    }

    public String toString() {
        try {
            return mo24201a().toString();
        } catch (C9664j unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
