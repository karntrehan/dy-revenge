package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Objects;

/* renamed from: e.f.a.c.f.g.e8 */
final class C6769e8 extends C6819h8 {

    /* renamed from: d */
    private final byte[] f18465d;

    /* renamed from: e */
    private final int f18466e;

    /* renamed from: f */
    private int f18467f;

    C6769e8(byte[] bArr, int i, int i2) {
        super((C6803g8) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f18465d = bArr;
            this.f18467f = 0;
            this.f18466e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: E */
    public final void mo19706E(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f18465d, this.f18467f, i2);
            this.f18467f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: F */
    public final void mo19707F(String str) {
        int i = this.f18467f;
        try {
            int a = C6819h8.m25806a(str.length() * 3);
            int a2 = C6819h8.m25806a(str.length());
            if (a2 == a) {
                int i2 = i + a2;
                this.f18467f = i2;
                int b = C7110zb.m27090b(str, this.f18465d, i2, this.f18466e - i2);
                this.f18467f = i;
                mo19722u((b - i) - a2);
                this.f18467f = b;
                return;
            }
            mo19722u(C7110zb.m27091c(str));
            byte[] bArr = this.f18465d;
            int i3 = this.f18467f;
            this.f18467f = C7110zb.m27090b(str, bArr, i3, this.f18466e - i3);
        } catch (C7094yb e) {
            this.f18467f = i;
            mo19829e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C6786f8(e2);
        }
    }

    /* renamed from: g */
    public final int mo19708g() {
        return this.f18466e - this.f18467f;
    }

    /* renamed from: h */
    public final void mo19709h(byte b) {
        try {
            byte[] bArr = this.f18465d;
            int i = this.f18467f;
            this.f18467f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), 1}), e);
        }
    }

    /* renamed from: i */
    public final void mo19710i(int i, boolean z) {
        mo19722u(i << 3);
        mo19709h(z ? (byte) 1 : 0);
    }

    /* renamed from: j */
    public final void mo19711j(int i, C7106z7 z7Var) {
        mo19722u((i << 3) | 2);
        mo19722u(z7Var.mo20156h());
        z7Var.mo20416p(this);
    }

    /* renamed from: k */
    public final void mo19712k(int i, int i2) {
        mo19722u((i << 3) | 5);
        mo19713l(i2);
    }

    /* renamed from: l */
    public final void mo19713l(int i) {
        try {
            byte[] bArr = this.f18465d;
            int i2 = this.f18467f;
            int i3 = i2 + 1;
            this.f18467f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f18467f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f18467f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f18467f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), 1}), e);
        }
    }

    /* renamed from: m */
    public final void mo19714m(int i, long j) {
        mo19722u((i << 3) | 1);
        mo19715n(j);
    }

    /* renamed from: n */
    public final void mo19715n(long j) {
        try {
            byte[] bArr = this.f18465d;
            int i = this.f18467f;
            int i2 = i + 1;
            this.f18467f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f18467f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f18467f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f18467f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f18467f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f18467f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f18467f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f18467f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), 1}), e);
        }
    }

    /* renamed from: o */
    public final void mo19716o(int i, int i2) {
        mo19722u(i << 3);
        mo19717p(i2);
    }

    /* renamed from: p */
    public final void mo19717p(int i) {
        if (i >= 0) {
            mo19722u(i);
        } else {
            mo19724w((long) i);
        }
    }

    /* renamed from: q */
    public final void mo19718q(byte[] bArr, int i, int i2) {
        mo19706E(bArr, 0, i2);
    }

    /* renamed from: r */
    public final void mo19719r(int i, String str) {
        mo19722u((i << 3) | 2);
        mo19707F(str);
    }

    /* renamed from: s */
    public final void mo19720s(int i, int i2) {
        mo19722u((i << 3) | i2);
    }

    /* renamed from: t */
    public final void mo19721t(int i, int i2) {
        mo19722u(i << 3);
        mo19722u(i2);
    }

    /* renamed from: u */
    public final void mo19722u(int i) {
        while ((i & -128) != 0) {
            byte[] bArr = this.f18465d;
            int i2 = this.f18467f;
            this.f18467f = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f18465d;
            int i3 = this.f18467f;
            this.f18467f = i3 + 1;
            bArr2[i3] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), 1}), e);
        }
    }

    /* renamed from: v */
    public final void mo19723v(int i, long j) {
        mo19722u(i << 3);
        mo19724w(j);
    }

    /* renamed from: w */
    public final void mo19724w(long j) {
        if (!C6819h8.f18517b || this.f18466e - this.f18467f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f18465d;
                int i = this.f18467f;
                this.f18467f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f18465d;
                int i2 = this.f18467f;
                this.f18467f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C6786f8(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f18467f), Integer.valueOf(this.f18466e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f18465d;
                int i3 = this.f18467f;
                this.f18467f = i3 + 1;
                C7014tb.m26628s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f18465d;
            int i4 = this.f18467f;
            this.f18467f = i4 + 1;
            C7014tb.m26628s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
