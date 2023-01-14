package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.qa */
final class C6965qa implements C6754da {

    /* renamed from: a */
    private final C6805ga f18816a;

    /* renamed from: b */
    private final String f18817b;

    /* renamed from: c */
    private final Object[] f18818c;

    /* renamed from: d */
    private final int f18819d;

    C6965qa(C6805ga gaVar, String str, Object[] objArr) {
        this.f18816a = gaVar;
        this.f18817b = str;
        this.f18818c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f18819d = charAt;
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
                this.f18819d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo19680a() {
        return (this.f18819d & 1) == 1 ? 1 : 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo20105b() {
        return this.f18817b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object[] mo20106c() {
        return this.f18818c;
    }

    public final C6805ga zza() {
        return this.f18816a;
    }

    public final boolean zzb() {
        return (this.f18819d & 2) == 2;
    }
}
