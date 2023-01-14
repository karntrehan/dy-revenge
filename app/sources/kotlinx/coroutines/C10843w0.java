package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10736e;
import kotlinx.coroutines.internal.C10767z;
import p455g.C10315m;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.w0 */
public final class C10843w0 {
    /* renamed from: a */
    public static final <T> void m36925a(C10840v0<? super T> v0Var, int i) {
        boolean z = true;
        if (C10819p0.m36781a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        C10376d<? super T> f = v0Var.mo26708f();
        if (i != 4) {
            z = false;
        }
        if (z || !(f instanceof C10736e) || m36926b(i) != m36926b(v0Var.f28386p)) {
            m36928d(v0Var, f, z);
            return;
        }
        C10707f0 f0Var = ((C10736e) f).f28225r;
        C10381g a = f.mo25781a();
        if (f0Var.mo26626v0(a)) {
            f0Var.mo26625u0(a, v0Var);
        } else {
            m36929e(v0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m36926b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m36927c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m36928d(C10840v0<? super T> v0Var, C10376d<? super T> dVar, boolean z) {
        Object obj;
        Object o = v0Var.mo26709o();
        Throwable h = v0Var.mo26818h(o);
        if (h != null) {
            C10315m.C10316a aVar = C10315m.f27541f;
            obj = C10318n.m35016a(h);
        } else {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = v0Var.mo26819j(o);
        }
        Object a = C10315m.m35012a(obj);
        if (z) {
            C10736e eVar = (C10736e) dVar;
            C10376d<T> dVar2 = eVar.f28226s;
            Object obj2 = eVar.f28228u;
            C10381g a2 = dVar2.mo25781a();
            Object c = C10767z.m36612c(a2, obj2);
            C10723h2<?> e = c != C10767z.f28271a ? C10703e0.m36422e(dVar2, a2, c) : null;
            try {
                eVar.f28226s.mo25782d(a);
                C10323s sVar = C10323s.f27547a;
            } finally {
                if (e == null || e.mo26679B0()) {
                    C10767z.m36610a(a2, c);
                }
            }
        } else {
            dVar.mo25782d(a);
        }
    }

    /* renamed from: e */
    private static final void m36929e(C10840v0<?> v0Var) {
        C10683a1 a = C10711f2.f28192a.mo26664a();
        if (a.mo26609C0()) {
            a.mo26614y0(v0Var);
            return;
        }
        a.mo26608A0(true);
        try {
            m36928d(v0Var, v0Var.mo26708f(), true);
            do {
            } while (a.mo26611E0());
        } catch (Throwable th) {
            a.mo26613w0(true);
            throw th;
        }
        a.mo26613w0(true);
    }
}
