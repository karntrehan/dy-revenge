package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.y9 */
final class C7092y9 implements C6997sa {

    /* renamed from: a */
    private static final C6771ea f19064a = new C7060w9();

    /* renamed from: b */
    private final C6771ea f19065b;

    public C7092y9() {
        C6771ea eaVar;
        C6771ea[] eaVarArr = new C6771ea[2];
        eaVarArr[0] = C7043v8.m26930c();
        try {
            eaVar = (C6771ea) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            eaVar = f19064a;
        }
        eaVarArr[1] = eaVar;
        C7076x9 x9Var = new C7076x9(eaVarArr);
        C6820h9.m25837f(x9Var, "messageInfoFactory");
        this.f19065b = x9Var;
    }

    /* renamed from: b */
    private static boolean m27045b(C6754da daVar) {
        return daVar.mo19680a() == 1;
    }

    /* renamed from: a */
    public final C6981ra mo20158a(Class cls) {
        C6720ba baVar;
        C6915n8 n8Var;
        C6854jb jbVar;
        C7012t9 t9Var;
        C6885la laVar;
        C6915n8 n8Var2;
        C6854jb b0;
        C6915n8 a;
        Class<C6702a9> cls2 = C6702a9.class;
        C7013ta.m26585g(cls);
        C6754da a2 = this.f19065b.mo19725a(cls);
        if (a2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                b0 = C7013ta.m26579b();
                a = C6947p8.m26365b();
            } else {
                b0 = C7013ta.m26580b0();
                a = C6947p8.m26364a();
            }
            return C6869ka.m26069j(b0, a, a2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b = m27045b(a2);
            laVar = C6901ma.m26151b();
            t9Var = C7012t9.m26548d();
            jbVar = C7013ta.m26579b();
            n8Var = b ? C6947p8.m26365b() : null;
            baVar = C6737ca.m25525b();
        } else {
            boolean b2 = m27045b(a2);
            laVar = C6901ma.m26150a();
            t9Var = C7012t9.m26547c();
            if (b2) {
                jbVar = C7013ta.m26580b0();
                n8Var2 = C6947p8.m26364a();
            } else {
                jbVar = C7013ta.m26577a();
                n8Var2 = null;
            }
            baVar = C6737ca.m25524a();
        }
        return C6853ja.m25985F(cls, a2, laVar, t9Var, jbVar, n8Var, baVar);
    }
}
