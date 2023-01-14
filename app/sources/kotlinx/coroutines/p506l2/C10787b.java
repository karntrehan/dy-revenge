package kotlinx.coroutines.p506l2;

import kotlinx.coroutines.C10819p0;
import kotlinx.coroutines.C10841v1;
import kotlinx.coroutines.C10848y;
import kotlinx.coroutines.internal.C10761t;
import kotlinx.coroutines.internal.C10762u;
import kotlinx.coroutines.internal.C10767z;
import p455g.C10315m;
import p455g.C10318n;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10443a0;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.l2.b */
public final class C10787b {
    /* renamed from: a */
    public static final <R, T> void m36643a(C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar, R r, C10376d<? super T> dVar) {
        Object obj;
        C10381g a;
        Object c;
        C10376d<? super T> a2 = C10403h.m35272a(dVar);
        try {
            a = dVar.mo25781a();
            c = C10767z.m36612c(a, (Object) null);
            if (pVar != null) {
                obj = ((C10434p) C10443a0.m35295c(pVar, 2)).mo15709j(r, a2);
                C10767z.m36610a(a, c);
                if (obj != C10395d.m35244c()) {
                    C10315m.C10316a aVar = C10315m.f27541f;
                    a2.mo25782d(C10315m.m35012a(obj));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = C10318n.m35016a(th);
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m36644b(C10761t<? super T> tVar, R r, C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object U;
        if (pVar != null) {
            try {
                obj = ((C10434p) C10443a0.m35295c(pVar, 2)).mo15709j(r, tVar);
            } catch (Throwable th) {
                obj = new C10848y(th, false, 2, (C10452g) null);
            }
            if (obj == C10395d.m35244c() || (U = tVar.mo26845U(obj)) == C10841v1.f28388b) {
                return C10395d.m35244c();
            }
            if (!(U instanceof C10848y)) {
                return C10841v1.m36924h(U);
            }
            Throwable th2 = ((C10848y) U).f28406b;
            C10376d<T> dVar = tVar.f28266p;
            if (C10819p0.m36784d() && (dVar instanceof C10400e)) {
                th2 = C10762u.m36593j(th2, (C10400e) dVar);
            }
            throw th2;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
