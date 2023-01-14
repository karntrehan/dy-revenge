package p493i;

import p455g.p470y.p472d.C10457l;
import p493i.p494g0.C10610b;
import p493i.p494g0.C10614e;

/* renamed from: i.a0 */
public final class C10588a0 extends C10616i {

    /* renamed from: s */
    private final transient byte[][] f28027s;

    /* renamed from: t */
    private final transient int[] f28028t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10588a0(byte[][] bArr, int[] iArr) {
        super(C10616i.f28049f.mo26412B());
        C10457l.m35320e(bArr, "segments");
        C10457l.m35320e(iArr, "directory");
        this.f28027s = bArr;
        this.f28028t = iArr;
    }

    /* renamed from: g0 */
    private final C10616i m35949g0() {
        return new C10616i(mo26268b0());
    }

    /* renamed from: F */
    public int mo26261F() {
        return mo26271e0()[mo26273f0().length - 1];
    }

    /* renamed from: N */
    public String mo26262N() {
        return m35949g0().mo26262N();
    }

    /* renamed from: O */
    public byte[] mo26263O() {
        return mo26268b0();
    }

    /* renamed from: P */
    public byte mo26264P(int i) {
        C10591c.m35966b((long) mo26271e0()[mo26273f0().length - 1], (long) i, 1);
        int b = C10614e.m36084b(this, i);
        return mo26273f0()[b][(i - (b == 0 ? 0 : mo26271e0()[b - 1])) + mo26271e0()[mo26273f0().length + b]];
    }

    /* renamed from: S */
    public boolean mo26265S(int i, C10616i iVar, int i2, int i3) {
        C10457l.m35320e(iVar, "other");
        if (i < 0 || i > mo26420Y() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = C10614e.m36084b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : mo26271e0()[b - 1];
            int i6 = mo26271e0()[mo26273f0().length + b];
            int min = Math.min(i4, (mo26271e0()[b] - i5) + i5) - i;
            if (!iVar.mo26266T(i2, mo26273f0()[b], i6 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    /* renamed from: T */
    public boolean mo26266T(int i, byte[] bArr, int i2, int i3) {
        C10457l.m35320e(bArr, "other");
        if (i < 0 || i > mo26420Y() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = C10614e.m36084b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : mo26271e0()[b - 1];
            int i6 = mo26271e0()[mo26273f0().length + b];
            int min = Math.min(i4, (mo26271e0()[b] - i5) + i5) - i;
            if (!C10591c.m35965a(mo26273f0()[b], i6 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    /* renamed from: a0 */
    public C10616i mo26267a0() {
        return m35949g0().mo26267a0();
    }

    /* renamed from: b0 */
    public byte[] mo26268b0() {
        byte[] bArr = new byte[mo26420Y()];
        int length = mo26273f0().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = mo26271e0()[length + i];
            int i5 = mo26271e0()[i];
            int i6 = i5 - i2;
            byte[] unused = C10341g.m35067c(mo26273f0()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* renamed from: d0 */
    public void mo26269d0(C10603f fVar, int i, int i2) {
        C10457l.m35320e(fVar, "buffer");
        int i3 = i + i2;
        int b = C10614e.m36084b(this, i);
        while (i < i3) {
            int i4 = b == 0 ? 0 : mo26271e0()[b - 1];
            int i5 = mo26271e0()[mo26273f0().length + b];
            int min = Math.min(i3, (mo26271e0()[b] - i4) + i4) - i;
            int i6 = i5 + (i - i4);
            C10636y yVar = new C10636y(mo26273f0()[b], i6, i6 + min, true, false);
            C10636y yVar2 = fVar.f28034f;
            if (yVar2 == null) {
                yVar.f28096h = yVar;
                yVar.f28095g = yVar;
                fVar.f28034f = yVar;
            } else {
                C10457l.m35317b(yVar2);
                C10636y yVar3 = yVar2.f28096h;
                C10457l.m35317b(yVar3);
                yVar3.mo26477c(yVar);
            }
            i += min;
            b++;
        }
        fVar.mo26322L0(fVar.size() + ((long) i2));
    }

    /* renamed from: e */
    public String mo26270e() {
        return m35949g0().mo26270e();
    }

    /* renamed from: e0 */
    public final int[] mo26271e0() {
        return this.f28028t;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10616i) {
            C10616i iVar = (C10616i) obj;
            return iVar.mo26420Y() == mo26420Y() && mo26265S(0, iVar, 0, mo26420Y());
        }
    }

    /* renamed from: f0 */
    public final byte[][] mo26273f0() {
        return this.f28027s;
    }

    public int hashCode() {
        int D = mo26413D();
        if (D != 0) {
            return D;
        }
        int length = mo26273f0().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = mo26271e0()[length + i];
            int i5 = mo26271e0()[i];
            byte[] bArr = mo26273f0()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        mo26416U(i2);
        return i2;
    }

    public String toString() {
        return m35949g0().toString();
    }

    /* renamed from: v */
    public C10616i mo26276v(String str) {
        C10457l.m35320e(str, "algorithm");
        return C10610b.m36074e(this, str);
    }
}
