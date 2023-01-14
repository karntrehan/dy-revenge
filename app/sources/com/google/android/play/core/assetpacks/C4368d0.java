package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.d0 */
final class C4368d0 extends FilterInputStream {

    /* renamed from: f */
    private final C4401l1 f12406f = new C4401l1();

    /* renamed from: o */
    private byte[] f12407o = new byte[4096];

    /* renamed from: p */
    private long f12408p;

    /* renamed from: q */
    private boolean f12409q = false;

    /* renamed from: r */
    private boolean f12410r = false;

    C4368d0(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: A */
    private final int m16797A(byte[] bArr, int i, int i2) {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* renamed from: r */
    private final boolean m16798r(int i) {
        int A = m16797A(this.f12407o, 0, i);
        if (A != i) {
            int i2 = i - A;
            if (m16797A(this.f12407o, A, i2) != i2) {
                this.f12406f.mo13893a(this.f12407o, 0, A);
                return false;
            }
        }
        this.f12406f.mo13893a(this.f12407o, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4370d2 mo13831a() {
        byte[] bArr;
        if (this.f12408p > 0) {
            do {
                bArr = this.f12407o;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f12409q || this.f12410r) {
            return new C4370d2((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m16798r(30)) {
            this.f12409q = true;
            return this.f12406f.mo13894b();
        }
        C4370d2 b = this.f12406f.mo13894b();
        if (b.mo13845h()) {
            this.f12410r = true;
            return b;
        } else if (b.mo13841e() != 4294967295L) {
            int c = this.f12406f.mo13895c() - 30;
            long j = (long) c;
            int length = this.f12407o.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f12407o = Arrays.copyOf(this.f12407o, length);
            }
            if (!m16798r(c)) {
                this.f12409q = true;
                return this.f12406f.mo13894b();
            }
            C4370d2 b2 = this.f12406f.mo13894b();
            this.f12408p = b2.mo13841e();
            return b2;
        } else {
            throw new C4396k0("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo13832b() {
        return this.f12409q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo13833h() {
        return this.f12410r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final long mo13834o() {
        return this.f12408p;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f12408p;
        if (j <= 0 || this.f12409q) {
            return -1;
        }
        int A = m16797A(bArr, i, (int) Math.min(j, (long) i2));
        this.f12408p -= (long) A;
        if (A != 0) {
            return A;
        }
        this.f12409q = true;
        return 0;
    }
}
