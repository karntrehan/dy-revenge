package p455g.p458c0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.c0.j */
class C10275j extends C10274i {

    /* renamed from: g.c0.j$a */
    public static final class C10276a implements Iterable<T>, C10445a {

        /* renamed from: f */
        final /* synthetic */ C10268d f27499f;

        public C10276a(C10268d dVar) {
            this.f27499f = dVar;
        }

        public Iterator<T> iterator() {
            return this.f27499f.iterator();
        }
    }

    /* renamed from: c */
    public static <T> Iterable<T> m34851c(C10268d<? extends T> dVar) {
        C10457l.m35320e(dVar, "<this>");
        return new C10276a(dVar);
    }

    /* renamed from: d */
    public static <T> C10268d<T> m34852d(C10268d<? extends T> dVar, int i) {
        C10457l.m35320e(dVar, "<this>");
        if (i >= 0) {
            return i == 0 ? dVar : dVar instanceof C10267c ? ((C10267c) dVar).mo25581a(i) : new C10265b(dVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: e */
    public static final <T, A extends Appendable> A m34853e(C10268d<? extends T> dVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super T, ? extends CharSequence> lVar) {
        C10457l.m35320e(dVar, "<this>");
        C10457l.m35320e(a, "buffer");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : dVar) {
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

    /* renamed from: f */
    public static final <T> String m34854f(C10268d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l<? super T, ? extends CharSequence> lVar) {
        C10457l.m35320e(dVar, "<this>");
        C10457l.m35320e(charSequence, "separator");
        C10457l.m35320e(charSequence2, "prefix");
        C10457l.m35320e(charSequence3, "postfix");
        C10457l.m35320e(charSequence4, "truncated");
        String sb = ((StringBuilder) m34853e(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C10457l.m35319d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: g */
    public static /* synthetic */ String m34855g(C10268d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C10430l lVar, int i2, Object obj) {
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
        return m34854f(dVar, charSequence, charSequence6, charSequence5, i4, charSequence7, lVar);
    }

    /* renamed from: h */
    public static <T, R> C10268d<R> m34856h(C10268d<? extends T> dVar, C10430l<? super T, ? extends R> lVar) {
        C10457l.m35320e(dVar, "<this>");
        C10457l.m35320e(lVar, "transform");
        return new C10277k(dVar, lVar);
    }

    /* renamed from: i */
    public static final <T, C extends Collection<? super T>> C m34857i(C10268d<? extends T> dVar, C c) {
        C10457l.m35320e(dVar, "<this>");
        C10457l.m35320e(c, "destination");
        for (Object add : dVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: j */
    public static <T> List<T> m34858j(C10268d<? extends T> dVar) {
        C10457l.m35320e(dVar, "<this>");
        return C10350l.m35143l(m34859k(dVar));
    }

    /* renamed from: k */
    public static final <T> List<T> m34859k(C10268d<? extends T> dVar) {
        C10457l.m35320e(dVar, "<this>");
        return (List) m34857i(dVar, new ArrayList());
    }
}
