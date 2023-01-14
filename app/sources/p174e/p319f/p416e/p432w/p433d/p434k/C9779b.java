package p174e.p319f.p416e.p432w.p433d.p434k;

/* renamed from: e.f.e.w.d.k.b */
public final class C9779b {

    /* renamed from: a */
    public static final C9779b f26201a = new C9779b(929, 3);

    /* renamed from: b */
    private final int[] f26202b;

    /* renamed from: c */
    private final int[] f26203c;

    /* renamed from: d */
    private final C9780c f26204d;

    /* renamed from: e */
    private final C9780c f26205e;

    /* renamed from: f */
    private final int f26206f;

    private C9779b(int i, int i2) {
        this.f26206f = i;
        this.f26202b = new int[i];
        this.f26203c = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f26202b[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f26203c[this.f26202b[i5]] = i5;
        }
        this.f26204d = new C9780c(this, new int[]{0});
        this.f26205e = new C9780c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo24485a(int i, int i2) {
        return (i + i2) % this.f26206f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9780c mo24486b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f26204d;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C9780c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo24487c(int i) {
        return this.f26202b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9780c mo24488d() {
        return this.f26205e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo24489e() {
        return this.f26206f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C9780c mo24490f() {
        return this.f26204d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo24491g(int i) {
        if (i != 0) {
            return this.f26202b[(this.f26206f - this.f26203c[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo24492h(int i) {
        if (i != 0) {
            return this.f26203c[i];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo24493i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f26202b;
        int[] iArr2 = this.f26203c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f26206f - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo24494j(int i, int i2) {
        int i3 = this.f26206f;
        return ((i + i3) - i2) % i3;
    }
}
