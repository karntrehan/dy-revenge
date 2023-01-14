package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ue */
final class C8493ue implements C8217fe {

    /* renamed from: a */
    private final C8274ie f23128a;

    /* renamed from: b */
    private final String f23129b;

    /* renamed from: c */
    private final Object[] f23130c;

    /* renamed from: d */
    private final int f23131d;

    C8493ue(C8274ie ieVar, String str, Object[] objArr) {
        this.f23128a = ieVar;
        this.f23129b = str;
        this.f23130c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f23131d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f23131d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo21803a() {
        return (this.f23131d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo22172b() {
        return this.f23129b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo22173c() {
        return this.f23130c;
    }

    public final C8274ie zza() {
        return this.f23128a;
    }

    public final boolean zzb() {
        return (this.f23131d & 2) == 2;
    }
}
