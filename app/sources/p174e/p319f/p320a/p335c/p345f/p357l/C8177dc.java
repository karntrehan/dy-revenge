package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.dc */
public abstract class C8177dc implements Iterable<Byte>, Serializable {

    /* renamed from: f */
    public static final C8177dc f22199f = new C8139bc(C8311kd.f22727c);

    /* renamed from: o */
    private static final Comparator<C8177dc> f22200o = new C8526wb();

    /* renamed from: p */
    private static final C8158cc f22201p = new C8158cc((C8490ub) null);

    /* renamed from: q */
    private int f22202q = 0;

    static {
        int i = C8400pb.f22907a;
    }

    C8177dc() {
    }

    /* renamed from: A */
    public static C8177dc m28419A(byte[] bArr, int i, int i2) {
        m28421v(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C8139bc(bArr2);
    }

    /* renamed from: B */
    public static C8177dc m28420B(String str) {
        return new C8139bc(str.getBytes(C8311kd.f22725a));
    }

    /* renamed from: v */
    static int m28421v(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: C */
    public final String mo21748C(Charset charset) {
        return mo21692h() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo21695o(charset);
    }

    /* renamed from: b */
    public abstract byte mo21689b(int i);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract byte mo21691g(int i);

    /* renamed from: h */
    public abstract int mo21692h();

    public final int hashCode() {
        int i = this.f22202q;
        if (i == 0) {
            int h = mo21692h();
            i = mo21693j(h, 0, h);
            if (i == 0) {
                i = 1;
            }
            this.f22202q = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C8490ub(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo21693j(int i, int i2, int i3);

    /* renamed from: k */
    public abstract C8177dc mo21694k(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo21695o(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo21696p(C8472tb tbVar);

    /* renamed from: r */
    public abstract boolean mo21697r();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo21692h());
        objArr[2] = mo21692h() <= 50 ? C8256hf.m28549a(this) : String.valueOf(C8256hf.m28549a(mo21694k(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo21752z() {
        return this.f22202q;
    }
}
