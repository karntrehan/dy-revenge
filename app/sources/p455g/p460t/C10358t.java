package p455g.p460t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;
import p455g.p456a0.C10243c;
import p455g.p458c0.C10268d;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.t */
class C10358t extends C10357s {

    /* renamed from: g.t.t$a */
    public static final class C10359a implements C10268d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f27559a;

        public C10359a(Iterable iterable) {
            this.f27559a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f27559a.iterator();
        }
    }

    /* renamed from: A */
    public static final <T> T m35154A(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        if (iterable instanceof List) {
            return m35155B((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: B */
    public static <T> T m35155B(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: C */
    public static <T> T m35156C(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: D */
    public static final <T> int m35157D(Iterable<? extends T> iterable, T t) {
        C10457l.m35320e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C10350l.m35146o();
            }
            if (C10457l.m35316a(t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: E */
    public static final <T, A extends Appendable> A m35158E(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super T, ? extends CharSequence> lVar) {
        C10457l.m35320e(iterable, "<this>");
        C10457l.m35320e(a, "buffer");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C10289h.m34911a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: F */
    public static /* synthetic */ Appendable m35159F(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        int i3 = i2 & 4;
        CharSequence charSequence5 = HttpUrl.FRAGMENT_ENCODE_SET;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m35158E(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: G */
    public static final <T> String m35160G(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super T, ? extends CharSequence> lVar) {
        C10457l.m35320e(iterable, "<this>");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        String sb = ((StringBuilder) m35158E(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C10457l.m35319d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: H */
    public static /* synthetic */ String m35161H(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = HttpUrl.FRAGMENT_ENCODE_SET;
        CharSequence charSequence6 = i3 != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i4 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m35160G(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    /* renamed from: I */
    public static <T> T m35162I(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C10350l.m35139h(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: J */
    public static <T extends Comparable<? super T>> T m35163J(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: K */
    public static <T> List<T> m35164K(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C10457l.m35320e(collection, "<this>");
        C10457l.m35320e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = C10355q.m35149r(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: L */
    public static <T> List<T> m35165L(Collection<? extends T> collection, T t) {
        C10457l.m35320e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: M */
    public static <T> T m35166M(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        if (iterable instanceof List) {
            return m35167N((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: N */
    public static final <T> T m35167N(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: O */
    public static <T> List<T> m35168O(List<? extends T> list, C10243c cVar) {
        C10457l.m35320e(list, "<this>");
        C10457l.m35320e(cVar, "indices");
        return cVar.isEmpty() ? C10350l.m35138g() : m35171R(list.subList(cVar.mo25561r().intValue(), cVar.mo25560p().intValue() + 1));
    }

    /* renamed from: P */
    public static final <T> List<T> m35169P(Iterable<? extends T> iterable, int i) {
        C10457l.m35320e(iterable, "<this>");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C10350l.m35138g();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m35171R(iterable);
                }
                if (i == 1) {
                    return C10349k.m35133b(m35154A(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C10350l.m35143l(arrayList);
        }
    }

    /* renamed from: Q */
    public static final <T, C extends Collection<? super T>> C m35170Q(Iterable<? extends T> iterable, C c) {
        C10457l.m35320e(iterable, "<this>");
        C10457l.m35320e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: R */
    public static <T> List<T> m35171R(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C10350l.m35143l(m35172S(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10350l.m35138g();
        }
        if (size != 1) {
            return m35173T(collection);
        }
        return C10349k.m35133b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: S */
    public static final <T> List<T> m35172S(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        return iterable instanceof Collection ? m35173T((Collection) iterable) : (List) m35170Q(iterable, new ArrayList());
    }

    /* renamed from: T */
    public static <T> List<T> m35173T(Collection<? extends T> collection) {
        C10457l.m35320e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: U */
    public static <T> Set<T> m35174U(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C10346i0.m35099c((Set) m35170Q(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10346i0.m35098b();
        }
        if (size != 1) {
            return (Set) m35170Q(iterable, new LinkedHashSet(C10332b0.m35030a(collection.size())));
        }
        return C10344h0.m35096a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: w */
    public static <T> C10268d<T> m35175w(Iterable<? extends T> iterable) {
        C10457l.m35320e(iterable, "<this>");
        return new C10359a(iterable);
    }

    /* renamed from: x */
    public static double m35176x(Iterable<Double> iterable) {
        C10457l.m35320e(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double doubleValue : iterable) {
            d += doubleValue.doubleValue();
            i++;
            if (i < 0) {
                C10350l.m35145n();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    /* renamed from: y */
    public static <T> boolean m35177y(Iterable<? extends T> iterable, T t) {
        C10457l.m35320e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : m35157D(iterable, t) >= 0;
    }

    /* renamed from: z */
    public static <T> List<T> m35178z(List<? extends T> list, int i) {
        C10457l.m35320e(list, "<this>");
        if (i >= 0) {
            return m35169P(list, C10247f.m34826b(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }
}
