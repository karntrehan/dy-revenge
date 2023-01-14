package p174e.p319f.p320a.p335c.p345f.p352g;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: e.f.a.c.f.g.w7 */
class C7058w7 extends C7026u7 {

    /* renamed from: r */
    protected final byte[] f19036r;

    C7058w7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f19036r = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo20153D() {
        return 0;
    }

    /* renamed from: b */
    public byte mo20154b(int i) {
        return this.f19036r[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7106z7) || mo20156h() != ((C7106z7) obj).mo20156h()) {
            return false;
        }
        if (mo20156h() == 0) {
            return true;
        }
        if (!(obj instanceof C7058w7)) {
            return obj.equals(this);
        }
        C7058w7 w7Var = (C7058w7) obj;
        int z = mo20477z();
        int z2 = w7Var.mo20477z();
        if (z != 0 && z2 != 0 && z != z2) {
            return false;
        }
        int h = mo20156h();
        if (h > w7Var.mo20156h()) {
            int h2 = mo20156h();
            throw new IllegalArgumentException("Length too large: " + h + h2);
        } else if (h <= w7Var.mo20156h()) {
            byte[] bArr = this.f19036r;
            byte[] bArr2 = w7Var.f19036r;
            w7Var.mo20153D();
            int i = 0;
            int i2 = 0;
            while (i < h) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            int h3 = w7Var.mo20156h();
            throw new IllegalArgumentException("Ran off end of other: 0, " + h + ", " + h3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public byte mo20155g(int i) {
        return this.f19036r[i];
    }

    /* renamed from: h */
    public int mo20156h() {
        return this.f19036r.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo20413j(int i, int i2, int i3) {
        return C6820h9.m25835d(i, this.f19036r, 0, i3);
    }

    /* renamed from: k */
    public final C7106z7 mo20414k(int i, int i2) {
        int v = C7106z7.m27076v(0, i2, mo20156h());
        return v == 0 ? C7106z7.f19078f : new C6994s7(this.f19036r, 0, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo20415o(Charset charset) {
        return new String(this.f19036r, 0, mo20156h(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo20416p(C6930o7 o7Var) {
        ((C6769e8) o7Var).mo19706E(this.f19036r, 0, mo20156h());
    }

    /* renamed from: r */
    public final boolean mo20417r() {
        return C7110zb.m27094f(this.f19036r, 0, mo20156h());
    }
}
