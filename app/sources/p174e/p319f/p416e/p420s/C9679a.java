package p174e.p319f.p416e.p420s;

import java.util.Arrays;
import okhttp3.internal.p510ws.WebSocketProtocol;

/* renamed from: e.f.e.s.a */
public final class C9679a implements Cloneable {

    /* renamed from: f */
    private int[] f25892f;

    /* renamed from: o */
    private int f25893o;

    public C9679a() {
        this.f25893o = 0;
        this.f25892f = new int[1];
    }

    public C9679a(int i) {
        this.f25893o = i;
        this.f25892f = m32910l(i);
    }

    C9679a(int[] iArr, int i) {
        this.f25892f = iArr;
        this.f25893o = i;
    }

    /* renamed from: l */
    private static int[] m32910l(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: c */
    public void mo24245c() {
        int length = this.f25892f.length;
        for (int i = 0; i < length; i++) {
            this.f25892f[i] = 0;
        }
    }

    /* renamed from: d */
    public C9679a clone() {
        return new C9679a((int[]) this.f25892f.clone(), this.f25893o);
    }

    /* renamed from: e */
    public boolean mo24248e(int i) {
        return ((1 << (i & 31)) & this.f25892f[i / 32]) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9679a)) {
            return false;
        }
        C9679a aVar = (C9679a) obj;
        return this.f25893o == aVar.f25893o && Arrays.equals(this.f25892f, aVar.f25892f);
    }

    /* renamed from: f */
    public int[] mo24250f() {
        return this.f25892f;
    }

    /* renamed from: g */
    public int mo24251g(int i) {
        int i2 = this.f25893o;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f25892f[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f25892f;
            if (i3 == iArr.length) {
                return this.f25893o;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f25893o;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public int hashCode() {
        return (this.f25893o * 31) + Arrays.hashCode(this.f25892f);
    }

    /* renamed from: i */
    public int mo24253i(int i) {
        int i2 = this.f25893o;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f25892f[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f25892f;
            if (i3 == iArr.length) {
                return this.f25893o;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f25893o;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: j */
    public int mo24254j() {
        return this.f25893o;
    }

    /* renamed from: k */
    public boolean mo24255k(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f25893o) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f25892f[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: m */
    public void mo24256m() {
        int[] iArr = new int[this.f25892f.length];
        int i = (this.f25893o - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f25892f[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.f25893o;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f25892f = iArr;
    }

    /* renamed from: n */
    public void mo24257n(int i) {
        int[] iArr = this.f25892f;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: p */
    public void mo24258p(int i, int i2) {
        this.f25892f[i / 32] = i2;
    }

    public String toString() {
        int i = this.f25893o;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f25893o; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo24248e(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
