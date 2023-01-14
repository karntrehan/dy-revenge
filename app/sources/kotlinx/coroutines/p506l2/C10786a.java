package kotlinx.coroutines.p506l2;

import kotlinx.coroutines.internal.C10737f;
import p455g.C10315m;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;

/* renamed from: kotlinx.coroutines.l2.a */
public final class C10786a {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m36639b(C10376d<?> dVar, Throwable th) {
        C10315m.C10316a aVar = C10315m.f27541f;
        dVar.mo25782d(C10315m.m35012a(C10318n.m35016a(th)));
        throw th;
    }

    /* renamed from: c */
    public static final void m36640c(C10376d<? super C10323s> dVar, C10376d<?> dVar2) {
        try {
            C10376d<? super C10323s> b = C10392c.m35241b(dVar);
            C10315m.C10316a aVar = C10315m.f27541f;
            C10737f.m36510c(b, C10315m.m35012a(C10323s.f27547a), (C10430l) null, 2, (Object) null);
        } catch (Throwable th) {
            m36639b(dVar2, th);
        }
    }

    /* renamed from: d */
    public static final <R, T> void m36641d(C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar, R r, C10376d<? super T> dVar, C10430l<? super Throwable, C10323s> lVar) {
        try {
            C10376d<C10323s> b = C10392c.m35241b(C10392c.m35240a(pVar, r, dVar));
            C10315m.C10316a aVar = C10315m.f27541f;
            C10737f.m36509b(b, C10315m.m35012a(C10323s.f27547a), lVar);
        } catch (Throwable th) {
            m36639b(dVar, th);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m36642e(C10434p pVar, Object obj, C10376d dVar, C10430l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m36641d(pVar, obj, dVar, lVar);
    }
}
