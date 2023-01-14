package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10762u;
import p455g.C10315m;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.c0 */
public final class C10695c0 {
    /* renamed from: a */
    public static final <T> Object m36406a(Object obj, C10376d<? super T> dVar) {
        if (obj instanceof C10848y) {
            C10315m.C10316a aVar = C10315m.f27541f;
            Throwable th = ((C10848y) obj).f28406b;
            if (C10819p0.m36784d() && (dVar instanceof C10400e)) {
                th = C10762u.m36593j(th, (C10400e) dVar);
            }
            obj = C10318n.m35016a(th);
        } else {
            C10315m.C10316a aVar2 = C10315m.f27541f;
        }
        return C10315m.m35012a(obj);
    }

    /* renamed from: b */
    public static final <T> Object m36407b(Object obj, C10430l<? super Throwable, C10323s> lVar) {
        Throwable b = C10315m.m35013b(obj);
        return b == null ? lVar != null ? new C10851z(obj, lVar) : obj : new C10848y(b, false, 2, (C10452g) null);
    }

    /* renamed from: c */
    public static final <T> Object m36408c(Object obj, C10808n<?> nVar) {
        Throwable b = C10315m.m35013b(obj);
        if (b != null) {
            if (C10819p0.m36784d() && (nVar instanceof C10400e)) {
                b = C10762u.m36593j(b, (C10400e) nVar);
            }
            obj = new C10848y(b, false, 2, (C10452g) null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m36409d(Object obj, C10430l lVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        return m36407b(obj, lVar);
    }
}
