package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C3380f;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.p323i.C6573j;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C3373a extends C3380f {

    /* renamed from: a */
    private final Iterable<C6573j> f9583a;

    /* renamed from: b */
    private final byte[] f9584b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class C3375b extends C3380f.C3381a {

        /* renamed from: a */
        private Iterable<C6573j> f9585a;

        /* renamed from: b */
        private byte[] f9586b;

        C3375b() {
        }

        /* renamed from: a */
        public C3380f mo10955a() {
            Iterable<C6573j> iterable = this.f9585a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (iterable == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new C3373a(this.f9585a, this.f9586b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3380f.C3381a mo10956b(Iterable<C6573j> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f9585a = iterable;
            return this;
        }

        /* renamed from: c */
        public C3380f.C3381a mo10957c(byte[] bArr) {
            this.f9586b = bArr;
            return this;
        }
    }

    private C3373a(Iterable<C6573j> iterable, byte[] bArr) {
        this.f9583a = iterable;
        this.f9584b = bArr;
    }

    /* renamed from: b */
    public Iterable<C6573j> mo10950b() {
        return this.f9583a;
    }

    /* renamed from: c */
    public byte[] mo10951c() {
        return this.f9584b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3380f)) {
            return false;
        }
        C3380f fVar = (C3380f) obj;
        if (this.f9583a.equals(fVar.mo10950b())) {
            if (Arrays.equals(this.f9584b, fVar instanceof C3373a ? ((C3373a) fVar).f9584b : fVar.mo10951c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9583a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9584b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f9583a + ", extras=" + Arrays.toString(this.f9584b) + "}";
    }
}
