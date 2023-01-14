package p174e.p319f.p320a.p382e.p383a.p384a;

/* renamed from: e.f.a.e.a.a.w */
final class C9097w extends C9077d {

    /* renamed from: a */
    private final int f24977a;

    /* renamed from: b */
    private final boolean f24978b;

    /* synthetic */ C9097w(int i, boolean z) {
        this.f24977a = i;
        this.f24978b = z;
    }

    /* renamed from: a */
    public final boolean mo23058a() {
        return this.f24978b;
    }

    /* renamed from: b */
    public final int mo23059b() {
        return this.f24977a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9077d) {
            C9077d dVar = (C9077d) obj;
            return this.f24977a == dVar.mo23059b() && this.f24978b == dVar.mo23058a();
        }
    }

    public final int hashCode() {
        return ((this.f24977a ^ 1000003) * 1000003) ^ (true != this.f24978b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f24977a;
        boolean z = this.f24978b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
