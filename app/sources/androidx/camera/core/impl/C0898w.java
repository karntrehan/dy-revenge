package androidx.camera.core.impl;

import androidx.camera.core.impl.C0864q2;
import java.util.Objects;

/* renamed from: androidx.camera.core.impl.w */
final class C0898w extends C0864q2.C0865a {

    /* renamed from: a */
    private final Throwable f2578a;

    C0898w(Throwable th) {
        Objects.requireNonNull(th, "Null error");
        this.f2578a = th;
    }

    /* renamed from: a */
    public Throwable mo3087a() {
        return this.f2578a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0864q2.C0865a) {
            return this.f2578a.equals(((C0864q2.C0865a) obj).mo3087a());
        }
        return false;
    }

    public int hashCode() {
        return this.f2578a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f2578a + "}";
    }
}
