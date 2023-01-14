package p455g.p460t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.l */
class C10350l extends C10349k {
    /* renamed from: c */
    public static <T> ArrayList<T> m35134c(T... tArr) {
        C10457l.m35320e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C10333c(tArr, true));
    }

    /* renamed from: d */
    public static final <T> Collection<T> m35135d(T[] tArr) {
        C10457l.m35320e(tArr, "<this>");
        return new C10333c(tArr, false);
    }

    /* renamed from: e */
    public static final <T extends Comparable<? super T>> int m35136e(List<? extends T> list, T t, int i, int i2) {
        C10457l.m35320e(list, "<this>");
        m35144m(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C10367b.m35206a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: f */
    public static /* synthetic */ int m35137f(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m35136e(list, comparable, i, i2);
    }

    /* renamed from: g */
    public static <T> List<T> m35138g() {
        return C10361v.f27561f;
    }

    /* renamed from: h */
    public static <T> int m35139h(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: i */
    public static <T> List<T> m35140i(T... tArr) {
        C10457l.m35320e(tArr, "elements");
        return tArr.length > 0 ? C10341g.m35066b(tArr) : m35138g();
    }

    /* renamed from: j */
    public static <T> List<T> m35141j(T... tArr) {
        C10457l.m35320e(tArr, "elements");
        return C10343h.m35085p(tArr);
    }

    /* renamed from: k */
    public static <T> List<T> m35142k(T... tArr) {
        C10457l.m35320e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C10333c(tArr, true));
    }

    /* renamed from: l */
    public static <T> List<T> m35143l(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C10349k.m35133b(list.get(0)) : m35138g();
    }

    /* renamed from: m */
    private static final void m35144m(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: n */
    public static void m35145n() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: o */
    public static void m35146o() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
