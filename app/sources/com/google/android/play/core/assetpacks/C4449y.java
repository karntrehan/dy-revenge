package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.y */
final class C4449y extends C4359b {

    /* renamed from: b */
    private final int f12706b;

    /* renamed from: c */
    private final String f12707c;

    /* renamed from: d */
    private final String f12708d;

    C4449y(int i, String str, String str2) {
        this.f12706b = i;
        this.f12707c = str;
        this.f12708d = str2;
    }

    /* renamed from: a */
    public final String mo13821a() {
        return this.f12708d;
    }

    /* renamed from: c */
    public final int mo13822c() {
        return this.f12706b;
    }

    /* renamed from: d */
    public final String mo13823d() {
        return this.f12707c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4359b) {
            C4359b bVar = (C4359b) obj;
            if (this.f12706b == bVar.mo13822c() && ((str = this.f12707c) != null ? str.equals(bVar.mo13823d()) : bVar.mo13823d() == null)) {
                String str2 = this.f12708d;
                String a = bVar.mo13821a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f12706b ^ 1000003) * 1000003;
        String str = this.f12707c;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f12708d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f12706b;
        String str = this.f12707c;
        String str2 = this.f12708d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
