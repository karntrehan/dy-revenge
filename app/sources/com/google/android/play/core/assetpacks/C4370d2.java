package com.google.android.play.core.assetpacks;

import java.util.Arrays;
import okhttp3.internal.p510ws.WebSocketProtocol;

/* renamed from: com.google.android.play.core.assetpacks.d2 */
final class C4370d2 {

    /* renamed from: a */
    private final String f12415a;

    /* renamed from: b */
    private final long f12416b;

    /* renamed from: c */
    private final int f12417c;

    /* renamed from: d */
    private final boolean f12418d;

    /* renamed from: e */
    private final boolean f12419e;

    /* renamed from: f */
    private final byte[] f12420f;

    C4370d2() {
    }

    C4370d2(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f12415a = str;
        this.f12416b = j;
        this.f12417c = i;
        this.f12418d = z;
        this.f12419e = z2;
        this.f12420f = bArr;
    }

    /* renamed from: a */
    static C4370d2 m16806a(String str, long j, int i, boolean z, byte[] bArr, boolean z2) {
        return new C4370d2(str, j, i, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo13838b() {
        if (mo13840d() == null) {
            return false;
        }
        return mo13840d().endsWith("/");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo13839c() {
        return mo13843f() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo13840d() {
        return this.f12415a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo13841e() {
        return this.f12416b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4370d2) {
            C4370d2 d2Var = (C4370d2) obj;
            String str = this.f12415a;
            if (str != null ? str.equals(d2Var.mo13840d()) : d2Var.mo13840d() == null) {
                return this.f12416b == d2Var.mo13841e() && this.f12417c == d2Var.mo13843f() && this.f12418d == d2Var.mo13844g() && this.f12419e == d2Var.mo13845h() && Arrays.equals(this.f12420f, d2Var.f12420f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo13843f() {
        return this.f12417c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo13844g() {
        return this.f12418d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo13845h() {
        return this.f12419e;
    }

    public int hashCode() {
        String str = this.f12415a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f12416b;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f12417c) * 1000003) ^ (true != this.f12418d ? 1237 : 1231)) * 1000003;
        if (true == this.f12419e) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ Arrays.hashCode(this.f12420f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] mo13847i() {
        return this.f12420f;
    }

    public String toString() {
        String str = this.f12415a;
        long j = this.f12416b;
        int i = this.f12417c;
        boolean z = this.f12418d;
        boolean z2 = this.f12419e;
        String arrays = Arrays.toString(this.f12420f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + WebSocketProtocol.PAYLOAD_SHORT + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
