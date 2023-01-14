package p174e.p319f.p320a.p322b.p323i;

import java.util.Arrays;
import java.util.Objects;
import p174e.p319f.p320a.p322b.C6463b;

/* renamed from: e.f.a.b.i.i */
public final class C6572i {

    /* renamed from: a */
    private final C6463b f18194a;

    /* renamed from: b */
    private final byte[] f18195b;

    public C6572i(C6463b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f18194a = bVar;
        this.f18195b = bArr;
    }

    /* renamed from: a */
    public byte[] mo19370a() {
        return this.f18195b;
    }

    /* renamed from: b */
    public C6463b mo19371b() {
        return this.f18194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6572i)) {
            return false;
        }
        C6572i iVar = (C6572i) obj;
        if (!this.f18194a.equals(iVar.f18194a)) {
            return false;
        }
        return Arrays.equals(this.f18195b, iVar.f18195b);
    }

    public int hashCode() {
        return ((this.f18194a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18195b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f18194a + ", bytes=[...]}";
    }
}
