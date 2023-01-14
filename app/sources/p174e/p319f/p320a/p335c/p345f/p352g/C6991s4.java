package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.s4 */
public final class C6991s4 {

    /* renamed from: a */
    public final C6991s4 f18866a;

    /* renamed from: b */
    final C7082y f18867b;

    /* renamed from: c */
    final Map f18868c = new HashMap();

    /* renamed from: d */
    final Map f18869d = new HashMap();

    public C6991s4(C6991s4 s4Var, C7082y yVar) {
        this.f18866a = s4Var;
        this.f18867b = yVar;
    }

    /* renamed from: a */
    public final C6991s4 mo20143a() {
        return new C6991s4(this, this.f18867b);
    }

    /* renamed from: b */
    public final C6954q mo20144b(C6954q qVar) {
        return this.f18867b.mo20441a(this, qVar);
    }

    /* renamed from: c */
    public final C6954q mo20145c(C6777f fVar) {
        C6954q qVar = C6954q.f18804c;
        Iterator C = fVar.mo19731C();
        while (C.hasNext()) {
            qVar = this.f18867b.mo20441a(this, fVar.mo19729A(((Integer) C.next()).intValue()));
            if (qVar instanceof C6810h) {
                break;
            }
        }
        return qVar;
    }

    /* renamed from: d */
    public final C6954q mo20146d(String str) {
        if (this.f18868c.containsKey(str)) {
            return (C6954q) this.f18868c.get(str);
        }
        C6991s4 s4Var = this.f18866a;
        if (s4Var != null) {
            return s4Var.mo20146d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
    }

    /* renamed from: e */
    public final void mo20147e(String str, C6954q qVar) {
        if (!this.f18869d.containsKey(str)) {
            if (qVar == null) {
                this.f18868c.remove(str);
            } else {
                this.f18868c.put(str, qVar);
            }
        }
    }

    /* renamed from: f */
    public final void mo20148f(String str, C6954q qVar) {
        mo20147e(str, qVar);
        this.f18869d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void mo20149g(String str, C6954q qVar) {
        C6991s4 s4Var;
        if (!this.f18868c.containsKey(str) && (s4Var = this.f18866a) != null && s4Var.mo20150h(str)) {
            this.f18866a.mo20149g(str, qVar);
        } else if (!this.f18869d.containsKey(str)) {
            if (qVar == null) {
                this.f18868c.remove(str);
            } else {
                this.f18868c.put(str, qVar);
            }
        }
    }

    /* renamed from: h */
    public final boolean mo20150h(String str) {
        if (this.f18868c.containsKey(str)) {
            return true;
        }
        C6991s4 s4Var = this.f18866a;
        if (s4Var != null) {
            return s4Var.mo20150h(str);
        }
        return false;
    }
}
