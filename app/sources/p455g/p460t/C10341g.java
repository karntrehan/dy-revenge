package p455g.p460t;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.g */
class C10341g extends C10339f {
    /* renamed from: b */
    public static <T> List<T> m35066b(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        List<T> a = C10345i.m35097a(tArr);
        C10457l.m35319d(a, "asList(this)");
        return a;
    }

    /* renamed from: c */
    public static byte[] m35067c(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C10457l.m35320e(bArr, "<this>");
        C10457l.m35320e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: d */
    public static <T> T[] m35068d(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    /* renamed from: e */
    public static /* synthetic */ byte[] m35069e(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return m35067c(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: f */
    public static /* synthetic */ Object[] m35070f(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return m35068d(objArr, objArr2, i, i2, i3);
    }

    /* renamed from: g */
    public static byte[] m35071g(byte[] bArr, int i, int i2) {
        C10457l.m35320e(bArr, "<this>");
        C10337e.m35064a(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C10457l.m35319d(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: h */
    public static final void m35072h(int[] iArr, int i, int i2, int i3) {
        C10457l.m35320e(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    /* renamed from: i */
    public static <T> void m35073i(T[] tArr, T t, int i, int i2) {
        C10457l.m35320e(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    /* renamed from: j */
    public static /* synthetic */ void m35074j(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        m35072h(iArr, i, i2, i3);
    }

    /* renamed from: k */
    public static /* synthetic */ void m35075k(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        m35073i(objArr, obj, i, i2);
    }

    /* renamed from: l */
    public static final <T> void m35076l(T[] tArr, Comparator<? super T> comparator) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    /* renamed from: m */
    public static <T> void m35077m(T[] tArr, Comparator<? super T> comparator, int i, int i2) {
        C10457l.m35320e(tArr, "<this>");
        C10457l.m35320e(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }
}
