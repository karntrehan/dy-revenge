package p455g.p462v.p464k.p465a;

import java.lang.reflect.Method;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.k.a.i */
final class C10404i {

    /* renamed from: a */
    public static final C10404i f27592a = new C10404i();

    /* renamed from: b */
    private static final C10405a f27593b = new C10405a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C10405a f27594c;

    /* renamed from: g.v.k.a.i$a */
    private static final class C10405a {

        /* renamed from: a */
        public final Method f27595a;

        /* renamed from: b */
        public final Method f27596b;

        /* renamed from: c */
        public final Method f27597c;

        public C10405a(Method method, Method method2, Method method3) {
            this.f27595a = method;
            this.f27596b = method2;
            this.f27597c = method3;
        }
    }

    private C10404i() {
    }

    /* renamed from: a */
    private final C10405a m35275a(C10396a aVar) {
        try {
            C10405a aVar2 = new C10405a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f27594c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C10405a aVar3 = f27593b;
            f27594c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo25802b(C10396a aVar) {
        C10457l.m35320e(aVar, "continuation");
        C10405a aVar2 = f27594c;
        if (aVar2 == null) {
            aVar2 = m35275a(aVar);
        }
        if (aVar2 == f27593b) {
            return null;
        }
        Method method = aVar2.f27595a;
        Object invoke = method != null ? method.invoke(aVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar2.f27596b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar2.f27597c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
