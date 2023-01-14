package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.f */
final class C4721f extends C4655a0.C4661d.C4663b {

    /* renamed from: a */
    private final String f13276a;

    /* renamed from: b */
    private final byte[] f13277b;

    /* renamed from: com.google.firebase.crashlytics.h.l.f$b */
    static final class C4723b extends C4655a0.C4661d.C4663b.C4664a {

        /* renamed from: a */
        private String f13278a;

        /* renamed from: b */
        private byte[] f13279b;

        C4723b() {
        }

        /* renamed from: a */
        public C4655a0.C4661d.C4663b mo14352a() {
            String str = this.f13278a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " filename";
            }
            if (this.f13279b == null) {
                str2 = str2 + " contents";
            }
            if (str2.isEmpty()) {
                return new C4721f(this.f13278a, this.f13279b);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4661d.C4663b.C4664a mo14353b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f13279b = bArr;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4661d.C4663b.C4664a mo14354c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f13278a = str;
            return this;
        }
    }

    private C4721f(String str, byte[] bArr) {
        this.f13276a = str;
        this.f13277b = bArr;
    }

    /* renamed from: b */
    public byte[] mo14350b() {
        return this.f13277b;
    }

    /* renamed from: c */
    public String mo14351c() {
        return this.f13276a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4661d.C4663b)) {
            return false;
        }
        C4655a0.C4661d.C4663b bVar = (C4655a0.C4661d.C4663b) obj;
        if (this.f13276a.equals(bVar.mo14351c())) {
            if (Arrays.equals(this.f13277b, bVar instanceof C4721f ? ((C4721f) bVar).f13277b : bVar.mo14350b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f13276a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13277b);
    }

    public String toString() {
        return "File{filename=" + this.f13276a + ", contents=" + Arrays.toString(this.f13277b) + "}";
    }
}
