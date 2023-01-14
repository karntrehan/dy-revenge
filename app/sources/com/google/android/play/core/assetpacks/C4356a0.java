package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.a0 */
final class C4356a0 extends C4363c {

    /* renamed from: a */
    private final long f12378a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f12379b;

    C4356a0(long j, Map<String, AssetPackState> map) {
        this.f12378a = j;
        this.f12379b = map;
    }

    /* renamed from: e */
    public final Map<String, AssetPackState> mo13801e() {
        return this.f12379b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4363c) {
            C4363c cVar = (C4363c) obj;
            return this.f12378a == cVar.mo13803f() && this.f12379b.equals(cVar.mo13801e());
        }
    }

    /* renamed from: f */
    public final long mo13803f() {
        return this.f12378a;
    }

    public final int hashCode() {
        long j = this.f12378a;
        return this.f12379b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f12378a;
        String valueOf = String.valueOf(this.f12379b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
