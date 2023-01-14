package androidx.camera.core;

import androidx.camera.core.C0974t1;

/* renamed from: androidx.camera.core.g1 */
final class C0686g1 extends C0974t1.C0975a {

    /* renamed from: a */
    private final int f2148a;

    /* renamed from: b */
    private final Throwable f2149b;

    C0686g1(int i, Throwable th) {
        this.f2148a = i;
        this.f2149b = th;
    }

    /* renamed from: c */
    public Throwable mo2730c() {
        return this.f2149b;
    }

    /* renamed from: d */
    public int mo2731d() {
        return this.f2148a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0974t1.C0975a)) {
            return false;
        }
        C0974t1.C0975a aVar = (C0974t1.C0975a) obj;
        if (this.f2148a == aVar.mo2731d()) {
            Throwable th = this.f2149b;
            Throwable c = aVar.mo2730c();
            if (th == null) {
                if (c == null) {
                    return true;
                }
            } else if (th.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f2148a ^ 1000003) * 1000003;
        Throwable th = this.f2149b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f2148a + ", cause=" + this.f2149b + "}";
    }
}
