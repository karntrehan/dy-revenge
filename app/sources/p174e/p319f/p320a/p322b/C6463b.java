package p174e.p319f.p320a.p322b;

import java.util.Objects;

/* renamed from: e.f.a.b.b */
public final class C6463b {

    /* renamed from: a */
    private final String f18004a;

    private C6463b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f18004a = str;
    }

    /* renamed from: b */
    public static C6463b m24863b(String str) {
        return new C6463b(str);
    }

    /* renamed from: a */
    public String mo19239a() {
        return this.f18004a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6463b)) {
            return false;
        }
        return this.f18004a.equals(((C6463b) obj).f18004a);
    }

    public int hashCode() {
        return this.f18004a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f18004a + "\"}";
    }
}
