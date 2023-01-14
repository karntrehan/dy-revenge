package p027c.p043d.p044a;

import android.net.Uri;
import java.util.Objects;

/* renamed from: c.d.a.k0 */
final class C1562k0 extends C1723w0 {

    /* renamed from: a */
    private final Uri f4845a;

    C1562k0(Uri uri) {
        Objects.requireNonNull(uri, "Null outputUri");
        this.f4845a = uri;
    }

    /* renamed from: a */
    public Uri mo5719a() {
        return this.f4845a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1723w0) {
            return this.f4845a.equals(((C1723w0) obj).mo5719a());
        }
        return false;
    }

    public int hashCode() {
        return this.f4845a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f4845a + "}";
    }
}
