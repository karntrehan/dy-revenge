package p174e.p319f.p416e.p432w.p433d;

/* renamed from: e.f.e.w.d.d */
final class C9769d {

    /* renamed from: a */
    private final int f26175a;

    /* renamed from: b */
    private final int f26176b;

    /* renamed from: c */
    private final int f26177c;

    /* renamed from: d */
    private final int f26178d;

    /* renamed from: e */
    private int f26179e = -1;

    C9769d(int i, int i2, int i3, int i4) {
        this.f26175a = i;
        this.f26176b = i2;
        this.f26177c = i3;
        this.f26178d = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo24453a() {
        return this.f26177c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24454b() {
        return this.f26176b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24455c() {
        return this.f26179e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo24456d() {
        return this.f26175a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo24457e() {
        return this.f26178d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo24458f() {
        return this.f26176b - this.f26175a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo24459g() {
        return mo24460h(this.f26179e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo24460h(int i) {
        return i != -1 && this.f26177c == (i % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo24461i(int i) {
        this.f26179e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo24462j() {
        this.f26179e = ((this.f26178d / 30) * 3) + (this.f26177c / 3);
    }

    public String toString() {
        return this.f26179e + "|" + this.f26178d;
    }
}
