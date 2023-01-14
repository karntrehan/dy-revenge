package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.r3 */
public final class C6974r3 {

    /* renamed from: a */
    final C7082y f18834a;

    /* renamed from: b */
    final C6991s4 f18835b;

    /* renamed from: c */
    final C6991s4 f18836c;

    /* renamed from: d */
    final C7042v7 f18837d;

    public C6974r3() {
        C7082y yVar = new C7082y();
        this.f18834a = yVar;
        C6991s4 s4Var = new C6991s4((C6991s4) null, yVar);
        this.f18836c = s4Var;
        this.f18835b = s4Var.mo20143a();
        C7042v7 v7Var = new C7042v7();
        this.f18837d = v7Var;
        s4Var.mo20149g("require", new C6742cf(v7Var));
        v7Var.mo20384a("internal.platform", C6957q2.f18815a);
        s4Var.mo20149g("runtime.counter", new C6826i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C6954q mo20121a(C6991s4 s4Var, C6960q5... q5VarArr) {
        C6954q qVar = C6954q.f18804c;
        for (C6960q5 a : q5VarArr) {
            qVar = C7025u6.m26735a(a);
            C7008t5.m26533c(this.f18836c);
            if ((qVar instanceof C6970r) || (qVar instanceof C6938p)) {
                qVar = this.f18834a.mo20441a(s4Var, qVar);
            }
        }
        return qVar;
    }
}
