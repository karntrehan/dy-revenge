package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p174e.p319f.p320a.p335c.p345f.p352g.C6702a9;
import p174e.p319f.p320a.p335c.p345f.p352g.C7075x8;

/* renamed from: e.f.a.c.f.g.a9 */
public abstract class C6702a9<MessageType extends C6702a9<MessageType, BuilderType>, BuilderType extends C7075x8<MessageType, BuilderType>> extends C6834i7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C6870kb zzc = C6870kb.m26079c();
    protected int zzd = -1;

    /* renamed from: l */
    protected static C6770e9 m25411l() {
        return C6719b9.m25459h();
    }

    /* renamed from: m */
    protected static C6787f9 m25412m() {
        return C7044v9.m26933g();
    }

    /* renamed from: n */
    protected static C6787f9 m25413n(C6787f9 f9Var) {
        int size = f9Var.size();
        return f9Var.mo19764m(size == 0 ? 10 : size + size);
    }

    /* renamed from: o */
    protected static C6804g9 m25414o() {
        return C6949pa.m26368g();
    }

    /* renamed from: p */
    protected static C6804g9 m25415p(C6804g9 g9Var) {
        int size = g9Var.size();
        return g9Var.mo19570f(size == 0 ? 10 : size + size);
    }

    /* renamed from: q */
    static Object m25416q(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: r */
    protected static Object m25417r(C6805ga gaVar, String str, Object[] objArr) {
        return new C6965qa(gaVar, str, objArr);
    }

    /* renamed from: s */
    protected static void m25418s(Class cls, C6702a9 a9Var) {
        zza.put(cls, a9Var);
    }

    /* renamed from: v */
    static C6702a9 m25419v(Class cls) {
        Map map = zza;
        C6702a9 a9Var = (C6702a9) map.get(cls);
        if (a9Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a9Var = (C6702a9) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (a9Var == null) {
            a9Var = (C6702a9) ((C6702a9) C7014tb.m26619j(cls)).mo19497w(6, (Object) null, (Object) null);
            if (a9Var != null) {
                map.put(cls, a9Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return a9Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo19515a() {
        return this.zzd;
    }

    /* renamed from: d */
    public final /* synthetic */ C6805ga mo19516d() {
        return (C6702a9) mo19497w(6, (Object) null, (Object) null);
    }

    /* renamed from: e */
    public final /* synthetic */ C6788fa mo19517e() {
        return (C7075x8) mo19497w(5, (Object) null, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C6933oa.m26315a().mo20068b(getClass()).mo19900i(this, (C6702a9) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ C6788fa mo19519f() {
        C7075x8 x8Var = (C7075x8) mo19497w(5, (Object) null, (Object) null);
        x8Var.mo20434p(this);
        return x8Var;
    }

    /* renamed from: g */
    public final int mo19520g() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = C6933oa.m26315a().mo20068b(getClass()).mo19892a(this);
        this.zzd = a;
        return a;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int d = C6933oa.m26315a().mo20068b(getClass()).mo19895d(this);
        this.zzb = d;
        return d;
    }

    /* renamed from: i */
    public final void mo19522i(C6819h8 h8Var) {
        C6933oa.m26315a().mo20068b(getClass()).mo19898g(this, C6835i8.m25872K(h8Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo19523j(int i) {
        this.zzd = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final C7075x8 mo19524t() {
        return (C7075x8) mo19497w(5, (Object) null, (Object) null);
    }

    public final String toString() {
        return C6837ia.m25909a(this, super.toString());
    }

    /* renamed from: u */
    public final C7075x8 mo19526u() {
        C7075x8 x8Var = (C7075x8) mo19497w(5, (Object) null, (Object) null);
        x8Var.mo20434p(this);
        return x8Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract Object mo19497w(int i, Object obj, Object obj2);
}
