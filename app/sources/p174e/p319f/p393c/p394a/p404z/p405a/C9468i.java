package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: e.f.c.a.z.a.i */
public abstract class C9468i implements Iterable<Byte>, Serializable {

    /* renamed from: f */
    public static final C9468i f25367f = new C9478j(C9431b0.f25307c);

    /* renamed from: o */
    private static final C9474f f25368o = (C9446d.m31453c() ? new C9479k((C9469a) null) : new C9472d((C9469a) null));

    /* renamed from: p */
    private static final Comparator<C9468i> f25369p = new C9470b();

    /* renamed from: q */
    private int f25370q = 0;

    /* renamed from: e.f.c.a.z.a.i$a */
    class C9469a extends C9471c {

        /* renamed from: f */
        private int f25371f = 0;

        /* renamed from: o */
        private final int f25372o;

        C9469a() {
            this.f25372o = C9468i.this.size();
        }

        /* renamed from: a */
        public byte mo23658a() {
            int i = this.f25371f;
            if (i < this.f25372o) {
                this.f25371f = i + 1;
                return C9468i.this.mo23656v(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f25371f < this.f25372o;
        }
    }

    /* renamed from: e.f.c.a.z.a.i$b */
    class C9470b implements Comparator<C9468i> {
        C9470b() {
        }

        /* renamed from: a */
        public int compare(C9468i iVar, C9468i iVar2) {
            C9475g A = iVar.iterator();
            C9475g A2 = iVar2.iterator();
            while (A.hasNext() && A2.hasNext()) {
                int compare = Integer.compare(C9468i.m31667H(A.mo23658a()), C9468i.m31667H(A2.mo23658a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(iVar.size(), iVar2.size());
        }
    }

    /* renamed from: e.f.c.a.z.a.i$c */
    static abstract class C9471c implements C9475g {
        C9471c() {
        }

        /* renamed from: b */
        public final Byte next() {
            return Byte.valueOf(mo23658a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e.f.c.a.z.a.i$d */
    private static final class C9472d implements C9474f {
        private C9472d() {
        }

        /* synthetic */ C9472d(C9469a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo23665a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: e.f.c.a.z.a.i$e */
    private static final class C9473e extends C9478j {

        /* renamed from: s */
        private final int f25374s;

        /* renamed from: t */
        private final int f25375t;

        C9473e(byte[] bArr, int i, int i2) {
            super(bArr);
            C9468i.m31673j(i, i + i2, bArr.length);
            this.f25374s = i;
            this.f25375t = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public int mo23666Q() {
            return this.f25374s;
        }

        /* renamed from: g */
        public byte mo23650g(int i) {
            C9468i.m31672h(i, size());
            return this.f25378r[this.f25374s + i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo23653r(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f25378r, mo23666Q() + i, bArr, i2, i3);
        }

        public int size() {
            return this.f25375t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public byte mo23656v(int i) {
            return this.f25378r[this.f25374s + i];
        }
    }

    /* renamed from: e.f.c.a.z.a.i$f */
    private interface C9474f {
        /* renamed from: a */
        byte[] mo23665a(byte[] bArr, int i, int i2);
    }

    /* renamed from: e.f.c.a.z.a.i$g */
    public interface C9475g extends Iterator<Byte> {
        /* renamed from: a */
        byte mo23658a();
    }

    /* renamed from: e.f.c.a.z.a.i$h */
    static final class C9476h {

        /* renamed from: a */
        private final C9504l f25376a;

        /* renamed from: b */
        private final byte[] f25377b;

        private C9476h(int i) {
            byte[] bArr = new byte[i];
            this.f25377b = bArr;
            this.f25376a = C9504l.m31984d0(bArr);
        }

        /* synthetic */ C9476h(int i, C9469a aVar) {
            this(i);
        }

        /* renamed from: a */
        public C9468i mo23667a() {
            this.f25376a.mo23788c();
            return new C9478j(this.f25377b);
        }

        /* renamed from: b */
        public C9504l mo23668b() {
            return this.f25376a;
        }
    }

    /* renamed from: e.f.c.a.z.a.i$i */
    static abstract class C9477i extends C9468i {
        C9477i() {
        }
    }

    /* renamed from: e.f.c.a.z.a.i$j */
    private static class C9478j extends C9477i {

        /* renamed from: r */
        protected final byte[] f25378r;

        C9478j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f25378r = bArr;
        }

        /* renamed from: C */
        public final C9485j mo23640C() {
            return C9485j.m31734h(this.f25378r, mo23666Q(), size(), true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public final int mo23641D(int i, int i2, int i3) {
            return C9431b0.m31430i(i, this.f25378r, mo23666Q() + i2, i3);
        }

        /* renamed from: F */
        public final C9468i mo23643F(int i, int i2) {
            int j = C9468i.m31673j(i, i2, size());
            return j == 0 ? C9468i.f25367f : new C9473e(this.f25378r, mo23666Q() + i, j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public final String mo23646J(Charset charset) {
            return new String(this.f25378r, mo23666Q(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public final void mo23648O(C9465h hVar) {
            hVar.mo23628a(this.f25378r, mo23666Q(), size());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public final boolean mo23669P(C9468i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + iVar.size());
                } else if (!(iVar instanceof C9478j)) {
                    return iVar.mo23643F(i, i3).equals(mo23643F(0, i2));
                } else {
                    C9478j jVar = (C9478j) iVar;
                    byte[] bArr = this.f25378r;
                    byte[] bArr2 = jVar.f25378r;
                    int Q = mo23666Q() + i2;
                    int Q2 = mo23666Q();
                    int Q3 = jVar.mo23666Q() + i;
                    while (Q2 < Q) {
                        if (bArr[Q2] != bArr2[Q3]) {
                            return false;
                        }
                        Q2++;
                        Q3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public int mo23666Q() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9468i) || size() != ((C9468i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C9478j)) {
                return obj.equals(this);
            }
            C9478j jVar = (C9478j) obj;
            int E = mo23642E();
            int E2 = jVar.mo23642E();
            if (E == 0 || E2 == 0 || E == E2) {
                return mo23669P(jVar, 0, size());
            }
            return false;
        }

        /* renamed from: g */
        public byte mo23650g(int i) {
            return this.f25378r[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo23653r(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f25378r, i, bArr, i2, i3);
        }

        public int size() {
            return this.f25378r.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public byte mo23656v(int i) {
            return this.f25378r[i];
        }

        /* renamed from: z */
        public final boolean mo23657z() {
            int Q = mo23666Q();
            return C9547t1.m32403n(this.f25378r, Q, size() + Q);
        }
    }

    /* renamed from: e.f.c.a.z.a.i$k */
    private static final class C9479k implements C9474f {
        private C9479k() {
        }

        /* synthetic */ C9479k(C9469a aVar) {
            this();
        }

        /* renamed from: a */
        public byte[] mo23665a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    C9468i() {
    }

    /* renamed from: B */
    static C9476h m31666B(int i) {
        return new C9476h(i, (C9469a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static int m31667H(byte b) {
        return b & 255;
    }

    /* renamed from: L */
    private String m31668L() {
        if (size() <= 50) {
            return C9514m1.m32138a(this);
        }
        return C9514m1.m32138a(mo23643F(0, 47)) + "...";
    }

    /* renamed from: M */
    static C9468i m31669M(byte[] bArr) {
        return new C9478j(bArr);
    }

    /* renamed from: N */
    static C9468i m31670N(byte[] bArr, int i, int i2) {
        return new C9473e(bArr, i, i2);
    }

    /* renamed from: h */
    static void m31672h(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: j */
    static int m31673j(int i, int i2, int i3) {
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

    /* renamed from: k */
    public static C9468i m31674k(byte[] bArr) {
        return m31675o(bArr, 0, bArr.length);
    }

    /* renamed from: o */
    public static C9468i m31675o(byte[] bArr, int i, int i2) {
        m31673j(i, i + i2, bArr.length);
        return new C9478j(f25368o.mo23665a(bArr, i, i2));
    }

    /* renamed from: p */
    public static C9468i m31676p(String str) {
        return new C9478j(str.getBytes(C9431b0.f25305a));
    }

    /* renamed from: A */
    public C9475g iterator() {
        return new C9469a();
    }

    /* renamed from: C */
    public abstract C9485j mo23640C();

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract int mo23641D(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo23642E() {
        return this.f25370q;
    }

    /* renamed from: F */
    public abstract C9468i mo23643F(int i, int i2);

    /* renamed from: G */
    public final byte[] mo23644G() {
        int size = size();
        if (size == 0) {
            return C9431b0.f25307c;
        }
        byte[] bArr = new byte[size];
        mo23653r(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: I */
    public final String mo23645I(Charset charset) {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo23646J(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract String mo23646J(Charset charset);

    /* renamed from: K */
    public final String mo23647K() {
        return mo23645I(C9431b0.f25305a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract void mo23648O(C9465h hVar);

    public abstract boolean equals(Object obj);

    /* renamed from: g */
    public abstract byte mo23650g(int i);

    public final int hashCode() {
        int i = this.f25370q;
        if (i == 0) {
            int size = size();
            i = mo23641D(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f25370q = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo23653r(byte[] bArr, int i, int i2, int i3);

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m31668L()});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public abstract byte mo23656v(int i);

    /* renamed from: z */
    public abstract boolean mo23657z();
}
