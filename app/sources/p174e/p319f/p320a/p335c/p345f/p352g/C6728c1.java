package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: e.f.a.c.f.g.c1 */
public final class C6728c1 {

    /* renamed from: a */
    final C6974r3 f18413a;

    /* renamed from: b */
    C6991s4 f18414b;

    /* renamed from: c */
    final C6726c f18415c = new C6726c();

    /* renamed from: d */
    private final C6793ff f18416d = new C6793ff();

    public C6728c1() {
        C6974r3 r3Var = new C6974r3();
        this.f18413a = r3Var;
        this.f18414b = r3Var.f18835b.mo20143a();
        r3Var.f18837d.mo20384a("internal.registerCallback", new C6692a(this));
        r3Var.f18837d.mo20384a("internal.eventLogger", new C6710b0(this));
    }

    /* renamed from: a */
    public final C6726c mo19594a() {
        return this.f18415c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C6842j mo19595b() {
        return new C6725bf(this.f18416d);
    }

    /* renamed from: c */
    public final void mo19596c(C6880l5 l5Var) {
        C6842j jVar;
        try {
            this.f18414b = this.f18413a.f18835b.mo20143a();
            if (!(this.f18413a.mo20121a(this.f18414b, (C6960q5[]) l5Var.mo19941z().toArray(new C6960q5[0])) instanceof C6810h)) {
                for (C6848j5 j5Var : l5Var.mo19940x().mo19823A()) {
                    List z = j5Var.mo19876z();
                    String y = j5Var.mo19875y();
                    Iterator it = z.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C6954q a = this.f18413a.mo20121a(this.f18414b, (C6960q5) it.next());
                            if (a instanceof C6906n) {
                                C6991s4 s4Var = this.f18414b;
                                if (!s4Var.mo20150h(y)) {
                                    jVar = null;
                                } else {
                                    C6954q d = s4Var.mo20146d(y);
                                    if (d instanceof C6842j) {
                                        jVar = (C6842j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(y)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo19542a(this.f18414b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(y)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C7068x1(th);
        }
    }

    /* renamed from: d */
    public final void mo19597d(String str, Callable callable) {
        this.f18413a.f18837d.mo20384a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo19598e(C6709b bVar) {
        try {
            this.f18415c.mo19590d(bVar);
            this.f18413a.f18836c.mo20149g("runtime.counter", new C6826i(Double.valueOf(0.0d)));
            this.f18416d.mo19788b(this.f18414b.mo20143a(), this.f18415c);
            return mo19600g() || mo19599f();
        } catch (Throwable th) {
            throw new C7068x1(th);
        }
    }

    /* renamed from: f */
    public final boolean mo19599f() {
        return !this.f18415c.mo19588c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo19600g() {
        C6726c cVar = this.f18415c;
        return !cVar.mo19587b().equals(cVar.mo19586a());
    }
}
