package com.google.android.play.core.install;

import java.util.Objects;

/* renamed from: com.google.android.play.core.install.c */
final class C4463c extends InstallState {

    /* renamed from: a */
    private final int f12740a;

    /* renamed from: b */
    private final long f12741b;

    /* renamed from: c */
    private final long f12742c;

    /* renamed from: d */
    private final int f12743d;

    /* renamed from: e */
    private final String f12744e;

    C4463c(int i, long j, long j2, int i2, String str) {
        this.f12740a = i;
        this.f12741b = j;
        this.f12742c = j2;
        this.f12743d = i2;
        Objects.requireNonNull(str, "Null packageName");
        this.f12744e = str;
    }

    /* renamed from: b */
    public final long mo13986b() {
        return this.f12741b;
    }

    /* renamed from: c */
    public final int mo13987c() {
        return this.f12743d;
    }

    /* renamed from: d */
    public final int mo13988d() {
        return this.f12740a;
    }

    /* renamed from: e */
    public final String mo13989e() {
        return this.f12744e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f12740a == installState.mo13988d() && this.f12741b == installState.mo13986b() && this.f12742c == installState.mo13990f() && this.f12743d == installState.mo13987c() && this.f12744e.equals(installState.mo13989e());
        }
    }

    /* renamed from: f */
    public final long mo13990f() {
        return this.f12742c;
    }

    public final int hashCode() {
        int i = this.f12740a;
        long j = this.f12741b;
        long j2 = this.f12742c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12743d) * 1000003) ^ this.f12744e.hashCode();
    }

    public final String toString() {
        int i = this.f12740a;
        long j = this.f12741b;
        long j2 = this.f12742c;
        int i2 = this.f12743d;
        String str = this.f12744e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
