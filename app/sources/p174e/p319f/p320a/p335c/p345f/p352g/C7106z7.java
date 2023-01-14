package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.z7 */
public abstract class C7106z7 implements Iterable, Serializable {

    /* renamed from: f */
    public static final C7106z7 f19078f = new C7058w7(C6820h9.f18522d);

    /* renamed from: o */
    private static final Comparator f19079o = new C6962q7();

    /* renamed from: p */
    private static final C7090y7 f19080p = new C7090y7((C7074x7) null);

    /* renamed from: q */
    private int f19081q = 0;

    static {
        int i = C6866k7.f18579a;
    }

    C7106z7() {
    }

    /* renamed from: A */
    public static C7106z7 m27074A(byte[] bArr, int i, int i2) {
        m27076v(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C7058w7(bArr2);
    }

    /* renamed from: B */
    public static C7106z7 m27075B(String str) {
        return new C7058w7(str.getBytes(C6820h9.f18520b));
    }

    /* renamed from: v */
    static int m27076v(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: C */
    public final String mo20473C(Charset charset) {
        return mo20156h() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo20415o(charset);
    }

    /* renamed from: b */
    public abstract byte mo20154b(int i);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract byte mo20155g(int i);

    /* renamed from: h */
    public abstract int mo20156h();

    public final int hashCode() {
        int i = this.f19081q;
        if (i == 0) {
            int h = mo20156h();
            i = mo20413j(h, 0, h);
            if (i == 0) {
                i = 1;
            }
            this.f19081q = i;
        }
        return i;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C6946p7(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo20413j(int i, int i2, int i3);

    /* renamed from: k */
    public abstract C7106z7 mo20414k(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo20415o(Charset charset);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo20416p(C6930o7 o7Var);

    /* renamed from: r */
    public abstract boolean mo20417r();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo20156h());
        objArr[2] = mo20156h() <= 50 ? C6822hb.m25842a(this) : C6822hb.m25842a(mo20414k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo20477z() {
        return this.f19081q;
    }
}
