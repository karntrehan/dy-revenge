package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Arrays;

/* renamed from: e.f.a.c.f.g.kb */
public final class C6870kb {

    /* renamed from: a */
    private static final C6870kb f18598a = new C6870kb(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f18599b;

    /* renamed from: c */
    private int[] f18600c;

    /* renamed from: d */
    private Object[] f18601d;

    /* renamed from: e */
    private int f18602e;

    /* renamed from: f */
    private boolean f18603f;

    private C6870kb() {
        this(0, new int[8], new Object[8], true);
    }

    private C6870kb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f18602e = -1;
        this.f18599b = i;
        this.f18600c = iArr;
        this.f18601d = objArr;
        this.f18603f = z;
    }

    /* renamed from: c */
    public static C6870kb m26079c() {
        return f18598a;
    }

    /* renamed from: d */
    static C6870kb m26080d(C6870kb kbVar, C6870kb kbVar2) {
        int i = kbVar.f18599b + kbVar2.f18599b;
        int[] copyOf = Arrays.copyOf(kbVar.f18600c, i);
        System.arraycopy(kbVar2.f18600c, 0, copyOf, kbVar.f18599b, kbVar2.f18599b);
        Object[] copyOf2 = Arrays.copyOf(kbVar.f18601d, i);
        System.arraycopy(kbVar2.f18601d, 0, copyOf2, kbVar.f18599b, kbVar2.f18599b);
        return new C6870kb(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static C6870kb m26081e() {
        return new C6870kb(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo19926a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f18602e;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f18599b; i6++) {
            int i7 = this.f18600c[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f18601d[i6]).longValue();
                    i = C6819h8.m25806a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C6819h8.m25806a(i8 << 3);
                    int h = ((C7106z7) this.f18601d[i6]).mo20156h();
                    i5 += a + C6819h8.m25806a(h) + h;
                } else if (i9 == 3) {
                    int D = C6819h8.m25805D(i8);
                    i3 = D + D;
                    i2 = ((C6870kb) this.f18601d[i6]).mo19926a();
                } else if (i9 == 5) {
                    ((Integer) this.f18601d[i6]).intValue();
                    i = C6819h8.m25806a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(C6852j9.m25975a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f18601d[i6]).longValue();
                i3 = C6819h8.m25806a(i8 << 3);
                i2 = C6819h8.m25807b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f18602e = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo19927b() {
        int i = this.f18602e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18599b; i3++) {
            int i4 = this.f18600c[i3];
            int a = C6819h8.m25806a(8);
            int h = ((C7106z7) this.f18601d[i3]).mo20156h();
            i2 += a + a + C6819h8.m25806a(16) + C6819h8.m25806a(i4 >>> 3) + C6819h8.m25806a(24) + C6819h8.m25806a(h) + h;
        }
        this.f18602e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6870kb)) {
            return false;
        }
        C6870kb kbVar = (C6870kb) obj;
        int i = this.f18599b;
        if (i == kbVar.f18599b) {
            int[] iArr = this.f18600c;
            int[] iArr2 = kbVar.f18600c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f18601d;
                    Object[] objArr2 = kbVar.f18601d;
                    int i3 = this.f18599b;
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
    public final void mo19929f() {
        this.f18603f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo19930g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f18599b; i2++) {
            C6837ia.m25910b(sb, i, String.valueOf(this.f18600c[i2] >>> 3), this.f18601d[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo19931h(int i, Object obj) {
        if (this.f18603f) {
            int i2 = this.f18599b;
            int[] iArr = this.f18600c;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f18600c = Arrays.copyOf(iArr, i3);
                this.f18601d = Arrays.copyOf(this.f18601d, i3);
            }
            int[] iArr2 = this.f18600c;
            int i4 = this.f18599b;
            iArr2[i4] = i;
            this.f18601d[i4] = obj;
            this.f18599b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f18599b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f18600c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f18601d;
        int i7 = this.f18599b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo19933i(C6739cc ccVar) {
        if (this.f18599b != 0) {
            for (int i = 0; i < this.f18599b; i++) {
                int i2 = this.f18600c[i];
                Object obj = this.f18601d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ccVar.mo19633h(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ccVar.mo19622G(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ccVar.mo19642q(i3, (C7106z7) obj);
                } else if (i4 == 3) {
                    ccVar.mo19619D(i3);
                    ((C6870kb) obj).mo19933i(ccVar);
                    ccVar.mo19625J(i3);
                } else if (i4 == 5) {
                    ccVar.mo19629d(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C6852j9.m25975a());
                }
            }
        }
    }
}
