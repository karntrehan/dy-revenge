package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Arrays;

/* renamed from: e.f.a.c.f.l.kf */
public final class C8313kf {

    /* renamed from: a */
    private static final C8313kf f22730a = new C8313kf(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f22731b;

    /* renamed from: c */
    private int[] f22732c;

    /* renamed from: d */
    private Object[] f22733d;

    /* renamed from: e */
    private int f22734e;

    /* renamed from: f */
    private boolean f22735f;

    private C8313kf() {
        this(0, new int[8], new Object[8], true);
    }

    private C8313kf(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f22734e = -1;
        this.f22731b = i;
        this.f22732c = iArr;
        this.f22733d = objArr;
        this.f22735f = z;
    }

    /* renamed from: c */
    public static C8313kf m28711c() {
        return f22730a;
    }

    /* renamed from: d */
    static C8313kf m28712d(C8313kf kfVar, C8313kf kfVar2) {
        int i = kfVar.f22731b + kfVar2.f22731b;
        int[] copyOf = Arrays.copyOf(kfVar.f22732c, i);
        System.arraycopy(kfVar2.f22732c, 0, copyOf, kfVar.f22731b, kfVar2.f22731b);
        Object[] copyOf2 = Arrays.copyOf(kfVar.f22733d, i);
        System.arraycopy(kfVar2.f22733d, 0, copyOf2, kfVar.f22731b, kfVar2.f22731b);
        return new C8313kf(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static C8313kf m28713e() {
        return new C8313kf(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo21928a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f22734e;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f22731b; i6++) {
            int i7 = this.f22732c[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f22733d[i6]).longValue();
                    i = C8310kc.m28674d(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int d = C8310kc.m28674d(i8 << 3);
                    int h = ((C8177dc) this.f22733d[i6]).mo21692h();
                    i5 += d + C8310kc.m28674d(h) + h;
                } else if (i9 == 3) {
                    int c = C8310kc.m28673c(i8);
                    i3 = c + c;
                    i2 = ((C8313kf) this.f22733d[i6]).mo21928a();
                } else if (i9 == 5) {
                    ((Integer) this.f22733d[i6]).intValue();
                    i = C8310kc.m28674d(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(C8366nd.m28884a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f22733d[i6]).longValue();
                i3 = C8310kc.m28674d(i8 << 3);
                i2 = C8310kc.m28675e(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f22734e = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo21929b() {
        int i = this.f22734e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f22731b; i3++) {
            int i4 = this.f22732c[i3];
            int d = C8310kc.m28674d(8);
            int h = ((C8177dc) this.f22733d[i3]).mo21692h();
            i2 += d + d + C8310kc.m28674d(16) + C8310kc.m28674d(i4 >>> 3) + C8310kc.m28674d(24) + C8310kc.m28674d(h) + h;
        }
        this.f22734e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8313kf)) {
            return false;
        }
        C8313kf kfVar = (C8313kf) obj;
        int i = this.f22731b;
        if (i == kfVar.f22731b) {
            int[] iArr = this.f22732c;
            int[] iArr2 = kfVar.f22732c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f22733d;
                    Object[] objArr2 = kfVar.f22733d;
                    int i3 = this.f22731b;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo21931f() {
        this.f22735f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo21932g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f22731b; i2++) {
            C8312ke.m28708b(sb, i, String.valueOf(this.f22732c[i2] >>> 3), this.f22733d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo21933h(int i, Object obj) {
        if (this.f22735f) {
            int i2 = this.f22731b;
            int[] iArr = this.f22732c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f22732c = Arrays.copyOf(iArr, i3);
                this.f22733d = Arrays.copyOf(this.f22733d, i3);
            }
            int[] iArr2 = this.f22732c;
            int i4 = this.f22731b;
            iArr2[i4] = i;
            this.f22733d[i4] = obj;
            this.f22731b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f22731b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f22732c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f22733d;
        int i7 = this.f22731b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo21935i(C8329lc lcVar) {
        for (int i = 0; i < this.f22731b; i++) {
            lcVar.mo21945I(this.f22732c[i] >>> 3, this.f22733d[i]);
        }
    }

    /* renamed from: j */
    public final void mo21936j(C8329lc lcVar) {
        if (this.f22731b != 0) {
            for (int i = 0; i < this.f22731b; i++) {
                int i2 = this.f22732c[i];
                Object obj = this.f22733d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    lcVar.mo21942F(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    lcVar.mo21972y(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    lcVar.mo21963p(i3, (C8177dc) obj);
                } else if (i4 == 3) {
                    lcVar.mo21954f(i3);
                    ((C8313kf) obj).mo21936j(lcVar);
                    lcVar.mo21967t(i3);
                } else if (i4 == 5) {
                    lcVar.mo21970w(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C8366nd.m28884a());
                }
            }
        }
    }
}
