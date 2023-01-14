package p174e.p319f.p320a.p382e.p383a.p384a;

import android.app.PendingIntent;
import java.util.Objects;

/* renamed from: e.f.a.e.a.a.u */
final class C9095u extends C9074a {

    /* renamed from: a */
    private final String f24961a;

    /* renamed from: b */
    private final int f24962b;

    /* renamed from: c */
    private final int f24963c;

    /* renamed from: d */
    private final int f24964d;

    /* renamed from: e */
    private final Integer f24965e;

    /* renamed from: f */
    private final int f24966f;

    /* renamed from: g */
    private final long f24967g;

    /* renamed from: h */
    private final long f24968h;

    /* renamed from: i */
    private final long f24969i;

    /* renamed from: j */
    private final long f24970j;

    /* renamed from: k */
    private final PendingIntent f24971k;

    /* renamed from: l */
    private final PendingIntent f24972l;

    /* renamed from: m */
    private final PendingIntent f24973m;

    /* renamed from: n */
    private final PendingIntent f24974n;

    C9095u(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f24961a = str;
        this.f24962b = i;
        this.f24963c = i2;
        this.f24964d = i3;
        this.f24965e = num;
        this.f24966f = i4;
        this.f24967g = j;
        this.f24968h = j2;
        this.f24969i = j3;
        this.f24970j = j4;
        this.f24971k = pendingIntent;
        this.f24972l = pendingIntent2;
        this.f24973m = pendingIntent3;
        this.f24974n = pendingIntent4;
    }

    /* renamed from: b */
    public final int mo23036b() {
        return this.f24962b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo23037c() {
        return this.f24969i;
    }

    /* renamed from: d */
    public final long mo23038d() {
        return this.f24967g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo23039e() {
        return this.f24970j;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9074a) {
            C9074a aVar = (C9074a) obj;
            if (this.f24961a.equals(aVar.mo23049p()) && this.f24962b == aVar.mo23036b() && this.f24963c == aVar.mo23051r() && this.f24964d == aVar.mo23046m() && ((num = this.f24965e) != null ? num.equals(aVar.mo23040f()) : aVar.mo23040f() == null) && this.f24966f == aVar.mo23052s() && this.f24967g == aVar.mo23038d() && this.f24968h == aVar.mo23050q() && this.f24969i == aVar.mo23037c() && this.f24970j == aVar.mo23039e() && ((pendingIntent = this.f24971k) != null ? pendingIntent.equals(aVar.mo23041g()) : aVar.mo23041g() == null) && ((pendingIntent2 = this.f24972l) != null ? pendingIntent2.equals(aVar.mo23042h()) : aVar.mo23042h() == null) && ((pendingIntent3 = this.f24973m) != null ? pendingIntent3.equals(aVar.mo23043i()) : aVar.mo23043i() == null)) {
                PendingIntent pendingIntent4 = this.f24974n;
                PendingIntent j = aVar.mo23044j();
                if (pendingIntent4 != null ? pendingIntent4.equals(j) : j == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Integer mo23040f() {
        return this.f24965e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final PendingIntent mo23041g() {
        return this.f24971k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final PendingIntent mo23042h() {
        return this.f24972l;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f24961a.hashCode() ^ 1000003) * 1000003) ^ this.f24962b) * 1000003) ^ this.f24963c) * 1000003) ^ this.f24964d) * 1000003;
        Integer num = this.f24965e;
        int i = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i2 = this.f24966f;
        long j = this.f24967g;
        long j2 = this.f24968h;
        long j3 = this.f24969i;
        long j4 = this.f24970j;
        int i3 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        PendingIntent pendingIntent = this.f24971k;
        int hashCode3 = (i3 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f24972l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f24973m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.f24974n;
        if (pendingIntent4 != null) {
            i = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final PendingIntent mo23043i() {
        return this.f24973m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final PendingIntent mo23044j() {
        return this.f24974n;
    }

    /* renamed from: m */
    public final int mo23046m() {
        return this.f24964d;
    }

    /* renamed from: p */
    public final String mo23049p() {
        return this.f24961a;
    }

    /* renamed from: q */
    public final long mo23050q() {
        return this.f24968h;
    }

    /* renamed from: r */
    public final int mo23051r() {
        return this.f24963c;
    }

    /* renamed from: s */
    public final int mo23052s() {
        return this.f24966f;
    }

    public final String toString() {
        String str = this.f24961a;
        int i = this.f24962b;
        int i2 = this.f24963c;
        int i3 = this.f24964d;
        String valueOf = String.valueOf(this.f24965e);
        int i4 = this.f24966f;
        long j = this.f24967g;
        long j2 = this.f24968h;
        long j3 = this.f24969i;
        long j4 = this.f24970j;
        String valueOf2 = String.valueOf(this.f24971k);
        long j5 = j4;
        String valueOf3 = String.valueOf(this.f24972l);
        String valueOf4 = String.valueOf(this.f24973m);
        long j6 = j3;
        String valueOf5 = String.valueOf(this.f24974n);
        int length = str.length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + valueOf4.length() + valueOf5.length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i);
        sb.append(", updateAvailability=");
        sb.append(i2);
        sb.append(", installStatus=");
        sb.append(i3);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", additionalSpaceRequired=");
        sb.append(j6);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
