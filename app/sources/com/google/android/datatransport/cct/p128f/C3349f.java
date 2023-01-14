package com.google.android.datatransport.cct.p128f;

import com.google.android.datatransport.cct.p128f.C3363l;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: com.google.android.datatransport.cct.f.f */
final class C3349f extends C3363l {

    /* renamed from: a */
    private final long f9491a;

    /* renamed from: b */
    private final Integer f9492b;

    /* renamed from: c */
    private final long f9493c;

    /* renamed from: d */
    private final byte[] f9494d;

    /* renamed from: e */
    private final String f9495e;

    /* renamed from: f */
    private final long f9496f;

    /* renamed from: g */
    private final C3368o f9497g;

    /* renamed from: com.google.android.datatransport.cct.f.f$b */
    static final class C3351b extends C3363l.C3364a {

        /* renamed from: a */
        private Long f9498a;

        /* renamed from: b */
        private Integer f9499b;

        /* renamed from: c */
        private Long f9500c;

        /* renamed from: d */
        private byte[] f9501d;

        /* renamed from: e */
        private String f9502e;

        /* renamed from: f */
        private Long f9503f;

        /* renamed from: g */
        private C3368o f9504g;

        C3351b() {
        }

        /* renamed from: a */
        public C3363l mo10907a() {
            Long l = this.f9498a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " eventTimeMs";
            }
            if (this.f9500c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f9503f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C3349f(this.f9498a.longValue(), this.f9499b, this.f9500c.longValue(), this.f9501d, this.f9502e, this.f9503f.longValue(), this.f9504g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C3363l.C3364a mo10908b(Integer num) {
            this.f9499b = num;
            return this;
        }

        /* renamed from: c */
        public C3363l.C3364a mo10909c(long j) {
            this.f9498a = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C3363l.C3364a mo10910d(long j) {
            this.f9500c = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C3363l.C3364a mo10911e(C3368o oVar) {
            this.f9504g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3363l.C3364a mo10912f(byte[] bArr) {
            this.f9501d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3363l.C3364a mo10913g(String str) {
            this.f9502e = str;
            return this;
        }

        /* renamed from: h */
        public C3363l.C3364a mo10914h(long j) {
            this.f9503f = Long.valueOf(j);
            return this;
        }
    }

    private C3349f(long j, Integer num, long j2, byte[] bArr, String str, long j3, C3368o oVar) {
        this.f9491a = j;
        this.f9492b = num;
        this.f9493c = j2;
        this.f9494d = bArr;
        this.f9495e = str;
        this.f9496f = j3;
        this.f9497g = oVar;
    }

    /* renamed from: b */
    public Integer mo10897b() {
        return this.f9492b;
    }

    /* renamed from: c */
    public long mo10898c() {
        return this.f9491a;
    }

    /* renamed from: d */
    public long mo10899d() {
        return this.f9493c;
    }

    /* renamed from: e */
    public C3368o mo10900e() {
        return this.f9497g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3363l)) {
            return false;
        }
        C3363l lVar = (C3363l) obj;
        if (this.f9491a == lVar.mo10898c() && ((num = this.f9492b) != null ? num.equals(lVar.mo10897b()) : lVar.mo10897b() == null) && this.f9493c == lVar.mo10899d()) {
            if (Arrays.equals(this.f9494d, lVar instanceof C3349f ? ((C3349f) lVar).f9494d : lVar.mo10902f()) && ((str = this.f9495e) != null ? str.equals(lVar.mo10903g()) : lVar.mo10903g() == null) && this.f9496f == lVar.mo10904h()) {
                C3368o oVar = this.f9497g;
                C3368o e = lVar.mo10900e();
                if (oVar == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (oVar.equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo10902f() {
        return this.f9494d;
    }

    /* renamed from: g */
    public String mo10903g() {
        return this.f9495e;
    }

    /* renamed from: h */
    public long mo10904h() {
        return this.f9496f;
    }

    public int hashCode() {
        long j = this.f9491a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f9492b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f9493c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f9494d)) * 1000003;
        String str = this.f9495e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f9496f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C3368o oVar = this.f9497g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f9491a + ", eventCode=" + this.f9492b + ", eventUptimeMs=" + this.f9493c + ", sourceExtension=" + Arrays.toString(this.f9494d) + ", sourceExtensionJsonProto3=" + this.f9495e + ", timezoneOffsetSeconds=" + this.f9496f + ", networkConnectionInfo=" + this.f9497g + "}";
    }
}
