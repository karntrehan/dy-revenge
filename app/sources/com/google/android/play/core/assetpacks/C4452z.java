package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.z */
final class C4452z extends AssetPackState {

    /* renamed from: a */
    private final String f12723a;

    /* renamed from: b */
    private final int f12724b;

    /* renamed from: c */
    private final int f12725c;

    /* renamed from: d */
    private final long f12726d;

    /* renamed from: e */
    private final long f12727e;

    /* renamed from: f */
    private final int f12728f;

    /* renamed from: g */
    private final int f12729g;

    C4452z(String str, int i, int i2, long j, long j2, int i3, int i4) {
        Objects.requireNonNull(str, "Null name");
        this.f12723a = str;
        this.f12724b = i;
        this.f12725c = i2;
        this.f12726d = j;
        this.f12727e = j2;
        this.f12728f = i3;
        this.f12729g = i4;
    }

    /* renamed from: a */
    public final int mo13791a() {
        return this.f12729g;
    }

    /* renamed from: c */
    public final long mo13792c() {
        return this.f12726d;
    }

    /* renamed from: e */
    public final int mo13793e() {
        return this.f12725c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f12723a.equals(assetPackState.mo13794f()) && this.f12724b == assetPackState.mo13795g() && this.f12725c == assetPackState.mo13793e() && this.f12726d == assetPackState.mo13792c() && this.f12727e == assetPackState.mo13796h() && this.f12728f == assetPackState.mo13797i() && this.f12729g == assetPackState.mo13791a();
        }
    }

    /* renamed from: f */
    public final String mo13794f() {
        return this.f12723a;
    }

    /* renamed from: g */
    public final int mo13795g() {
        return this.f12724b;
    }

    /* renamed from: h */
    public final long mo13796h() {
        return this.f12727e;
    }

    public final int hashCode() {
        int hashCode = this.f12723a.hashCode();
        int i = this.f12724b;
        int i2 = this.f12725c;
        long j = this.f12726d;
        long j2 = this.f12727e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12728f) * 1000003) ^ this.f12729g;
    }

    /* renamed from: i */
    public final int mo13797i() {
        return this.f12728f;
    }

    public final String toString() {
        String str = this.f12723a;
        int i = this.f12724b;
        int i2 = this.f12725c;
        long j = this.f12726d;
        long j2 = this.f12727e;
        int i3 = this.f12728f;
        int i4 = this.f12729g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
