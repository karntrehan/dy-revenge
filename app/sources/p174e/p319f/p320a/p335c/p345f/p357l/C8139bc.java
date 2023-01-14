package p174e.p319f.p320a.p335c.p345f.p357l;

import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: e.f.a.c.f.l.bc */
class C8139bc extends C8120ac {

    /* renamed from: r */
    protected final byte[] f22125r;

    C8139bc(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f22125r = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo21688D() {
        return 0;
    }

    /* renamed from: b */
    public byte mo21689b(int i) {
        return this.f22125r[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8177dc) || mo21692h() != ((C8177dc) obj).mo21692h()) {
            return false;
        }
        if (mo21692h() == 0) {
            return true;
        }
        if (!(obj instanceof C8139bc)) {
            return obj.equals(this);
        }
        C8139bc bcVar = (C8139bc) obj;
        int z = mo21752z();
        int z2 = bcVar.mo21752z();
        if (z != 0 && z2 != 0 && z != z2) {
            return false;
        }
        int h = mo21692h();
        if (h > bcVar.mo21692h()) {
            int h2 = mo21692h();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(h);
            sb.append(h2);
            throw new IllegalArgumentException(sb.toString());
        } else if (h <= bcVar.mo21692h()) {
            byte[] bArr = this.f22125r;
            byte[] bArr2 = bcVar.f22125r;
            bcVar.mo21688D();
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
            int h3 = bcVar.mo21692h();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(h);
            sb2.append(", ");
            sb2.append(h3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public byte mo21691g(int i) {
        return this.f22125r[i];
    }

    /* renamed from: h */
    public int mo21692h() {
        return this.f22125r.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int mo21693j(int i, int i2, int i3) {
        return C8311kd.m28700d(i, this.f22125r, 0, i3);
    }

    /* renamed from: k */
    public final C8177dc mo21694k(int i, int i2) {
        int v = C8177dc.m28421v(0, i2, mo21692h());
        return v == 0 ? C8177dc.f22199f : new C8562yb(this.f22125r, 0, v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final String mo21695o(Charset charset) {
        return new String(this.f22125r, 0, mo21692h(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo21696p(C8472tb tbVar) {
        ((C8272ic) tbVar).mo21859H(this.f22125r, 0, mo21692h());
    }

    /* renamed from: r */
    public final boolean mo21697r() {
        return C8584zf.m29354f(this.f22125r, 0, mo21692h());
    }
}
