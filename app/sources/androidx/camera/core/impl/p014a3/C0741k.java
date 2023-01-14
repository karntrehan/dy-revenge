package androidx.camera.core.impl.p014a3;

/* renamed from: androidx.camera.core.impl.a3.k */
final class C0741k {

    /* renamed from: a */
    private final long f2283a;

    /* renamed from: b */
    private final long f2284b;

    C0741k(double d) {
        this((long) (d * 10000.0d), 10000);
    }

    C0741k(long j, long j2) {
        this.f2283a = j;
        this.f2284b = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo2875a() {
        return this.f2284b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo2876b() {
        return this.f2283a;
    }

    public String toString() {
        return this.f2283a + "/" + this.f2284b;
    }
}
