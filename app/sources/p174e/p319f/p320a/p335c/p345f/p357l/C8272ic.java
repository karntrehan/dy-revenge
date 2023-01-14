package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Objects;

/* renamed from: e.f.a.c.f.l.ic */
final class C8272ic extends C8310kc {

    /* renamed from: d */
    private final byte[] f22638d;

    /* renamed from: e */
    private final int f22639e;

    /* renamed from: f */
    private int f22640f;

    C8272ic(byte[] bArr, int i, int i2) {
        super((C8253hc) null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.f22638d = bArr;
            this.f22640f = 0;
            this.f22639e = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    /* renamed from: H */
    public final void mo21859H(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.f22638d, this.f22640f, i2);
            this.f22640f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: I */
    public final void mo21860I(String str) {
        int i = this.f22640f;
        try {
            int d = C8310kc.m28674d(str.length() * 3);
            int d2 = C8310kc.m28674d(str.length());
            if (d2 == d) {
                int i2 = i + d2;
                this.f22640f = i2;
                int b = C8584zf.m29350b(str, this.f22638d, i2, this.f22639e - i2);
                this.f22640f = i;
                mo21875x((b - i) - d2);
                this.f22640f = b;
                return;
            }
            mo21875x(C8584zf.m29351c(str));
            byte[] bArr = this.f22638d;
            int i3 = this.f22640f;
            this.f22640f = C8584zf.m29350b(str, bArr, i3, this.f22639e - i3);
        } catch (C8566yf e) {
            this.f22640f = i;
            mo21927h(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C8291jc(e2);
        }
    }

    /* renamed from: j */
    public final int mo21861j() {
        return this.f22639e - this.f22640f;
    }

    /* renamed from: k */
    public final void mo21862k(byte b) {
        try {
            byte[] bArr = this.f22638d;
            int i = this.f22640f;
            this.f22640f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), 1}), e);
        }
    }

    /* renamed from: l */
    public final void mo21863l(int i, boolean z) {
        mo21875x(i << 3);
        mo21862k(z ? (byte) 1 : 0);
    }

    /* renamed from: m */
    public final void mo21864m(int i, C8177dc dcVar) {
        mo21875x((i << 3) | 2);
        mo21875x(dcVar.mo21692h());
        dcVar.mo21696p(this);
    }

    /* renamed from: n */
    public final void mo21865n(int i, int i2) {
        mo21875x((i << 3) | 5);
        mo21866o(i2);
    }

    /* renamed from: o */
    public final void mo21866o(int i) {
        try {
            byte[] bArr = this.f22638d;
            int i2 = this.f22640f;
            int i3 = i2 + 1;
            this.f22640f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f22640f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f22640f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f22640f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), 1}), e);
        }
    }

    /* renamed from: p */
    public final void mo21867p(int i, long j) {
        mo21875x((i << 3) | 1);
        mo21868q(j);
    }

    /* renamed from: q */
    public final void mo21868q(long j) {
        try {
            byte[] bArr = this.f22638d;
            int i = this.f22640f;
            int i2 = i + 1;
            this.f22640f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.f22640f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.f22640f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.f22640f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.f22640f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f22640f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f22640f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f22640f = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), 1}), e);
        }
    }

    /* renamed from: r */
    public final void mo21869r(int i, int i2) {
        mo21875x(i << 3);
        mo21870s(i2);
    }

    /* renamed from: s */
    public final void mo21870s(int i) {
        if (i >= 0) {
            mo21875x(i);
        } else {
            mo21877z((long) i);
        }
    }

    /* renamed from: t */
    public final void mo21871t(byte[] bArr, int i, int i2) {
        mo21859H(bArr, 0, i2);
    }

    /* renamed from: u */
    public final void mo21872u(int i, String str) {
        mo21875x((i << 3) | 2);
        mo21860I(str);
    }

    /* renamed from: v */
    public final void mo21873v(int i, int i2) {
        mo21875x((i << 3) | i2);
    }

    /* renamed from: w */
    public final void mo21874w(int i, int i2) {
        mo21875x(i << 3);
        mo21875x(i2);
    }

    /* renamed from: x */
    public final void mo21875x(int i) {
        if (C8310kc.f22723b) {
            int i2 = C8400pb.f22907a;
        }
        while ((i & -128) != 0) {
            byte[] bArr = this.f22638d;
            int i3 = this.f22640f;
            this.f22640f = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        try {
            byte[] bArr2 = this.f22638d;
            int i4 = this.f22640f;
            this.f22640f = i4 + 1;
            bArr2[i4] = (byte) i;
        } catch (IndexOutOfBoundsException e) {
            throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), 1}), e);
        }
    }

    /* renamed from: y */
    public final void mo21876y(int i, long j) {
        mo21875x(i << 3);
        mo21877z(j);
    }

    /* renamed from: z */
    public final void mo21877z(long j) {
        if (!C8310kc.f22723b || this.f22639e - this.f22640f < 10) {
            while ((j & -128) != 0) {
                byte[] bArr = this.f22638d;
                int i = this.f22640f;
                this.f22640f = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            }
            try {
                byte[] bArr2 = this.f22638d;
                int i2 = this.f22640f;
                this.f22640f = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e) {
                throw new C8291jc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22640f), Integer.valueOf(this.f22639e), 1}), e);
            }
        } else {
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f22638d;
                int i3 = this.f22640f;
                this.f22640f = i3 + 1;
                C8494uf.m29113s(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f22638d;
            int i4 = this.f22640f;
            this.f22640f = i4 + 1;
            C8494uf.m29113s(bArr4, (long) i4, (byte) ((int) j));
        }
    }
}
