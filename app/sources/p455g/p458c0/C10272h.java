package p455g.p458c0;

import java.util.Iterator;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.c0.h */
class C10272h extends C10271g {

    /* renamed from: g.c0.h$a */
    public static final class C10273a implements C10268d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f27498a;

        public C10273a(Iterator it) {
            this.f27498a = it;
        }

        public Iterator<T> iterator() {
            return this.f27498a;
        }
    }

    /* renamed from: a */
    public static <T> C10268d<T> m34849a(Iterator<? extends T> it) {
        C10457l.m35320e(it, "<this>");
        return m34850b(new C10273a(it));
    }

    /* renamed from: b */
    public static final <T> C10268d<T> m34850b(C10268d<? extends T> dVar) {
        C10457l.m35320e(dVar, "<this>");
        return dVar instanceof C10264a ? dVar : new C10264a(dVar);
    }
}
