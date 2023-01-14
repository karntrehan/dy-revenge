package androidx.camera.core.impl;

import java.util.Objects;

/* renamed from: androidx.camera.core.impl.u */
final class C0887u extends C0835l1 {

    /* renamed from: a */
    private final Object f2566a;

    C0887u(Object obj) {
        Objects.requireNonNull(obj, "Null value");
        this.f2566a = obj;
    }

    /* renamed from: b */
    public Object mo3020b() {
        return this.f2566a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0835l1) {
            return this.f2566a.equals(((C0835l1) obj).mo3020b());
        }
        return false;
    }

    public int hashCode() {
        return this.f2566a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f2566a + "}";
    }
}
