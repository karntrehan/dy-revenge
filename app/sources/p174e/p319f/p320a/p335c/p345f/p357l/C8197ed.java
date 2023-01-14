package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p174e.p319f.p320a.p335c.p345f.p357l.C8197ed;
import p174e.p319f.p320a.p335c.p345f.p357l.C8581zc;

/* renamed from: e.f.a.c.f.l.ed */
public abstract class C8197ed<MessageType extends C8197ed<MessageType, BuilderType>, BuilderType extends C8581zc<MessageType, BuilderType>> extends C8346mb<MessageType, BuilderType> {
    private static final Map<Object, C8197ed<?, ?>> zzb = new ConcurrentHashMap();
    protected C8313kf zzc = C8313kf.m28711c();
    protected int zzd = -1;

    /* renamed from: g */
    protected static <E> C8292jd<E> m28466g() {
        return C8475te.m29057g();
    }

    /* renamed from: h */
    static Object m28467h(Method method, Object obj, Object... objArr) {
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

    /* renamed from: i */
    protected static Object m28468i(C8274ie ieVar, String str, Object[] objArr) {
        return new C8493ue(ieVar, str, objArr);
    }

    /* renamed from: j */
    protected static <T extends C8197ed> void m28469j(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: m */
    public static <ContainingType extends C8274ie, Type> C8178dd<ContainingType, Type> m28470m(ContainingType containingtype, C8274ie ieVar, C8254hd hdVar, int i, C8124ag agVar, boolean z, Class cls) {
        return new C8178dd(containingtype, Collections.emptyList(), ieVar, new C8159cd((C8254hd<?>) null, 202056002, agVar, true, false), cls);
    }

    /* renamed from: p */
    static <T extends C8197ed> T m28471p(Class<T> cls) {
        Map<Object, C8197ed<?, ?>> map = zzb;
        T t = (C8197ed) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C8197ed) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C8197ed) ((C8197ed) C8494uf.m29104j(cls)).mo21702k(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: q */
    protected static <T extends C8197ed<T, ?>> T m28472q(T t, byte[] bArr, C8419qc qcVar) {
        T v = m28473v(t, bArr, 0, bArr.length, qcVar);
        if (v == null || v.mo21767r()) {
            return v;
        }
        C8366nd ndVar = new C8366nd(new C8275if(v).getMessage());
        ndVar.mo22033f(v);
        throw ndVar;
    }

    /* renamed from: v */
    static <T extends C8197ed<T, ?>> T m28473v(T t, byte[] bArr, int i, int i2, C8419qc qcVar) {
        T t2 = (C8197ed) t.mo21702k(4, (Object) null, (Object) null);
        try {
            C8511ve<?> b = C8457se.m29041a().mo22144b(t2.getClass());
            b.mo21981g(t2, bArr, 0, i2, new C8418qb(qcVar));
            b.mo21976b(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (C8366nd e) {
            e.mo22033f(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C8366nd) {
                throw ((C8366nd) e2.getCause());
            }
            C8366nd ndVar = new C8366nd(e2);
            ndVar.mo22033f(t2);
            throw ndVar;
        } catch (IndexOutOfBoundsException unused) {
            C8366nd g = C8366nd.m28889g();
            g.mo22033f(t2);
            throw g;
        }
    }

    /* renamed from: c */
    public final void mo21760c(C8310kc kcVar) {
        C8457se.m29041a().mo22144b(getClass()).mo21980f(this, C8329lc.m28736m(kcVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo21761d() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C8457se.m29041a().mo22144b(getClass()).mo21983i(this, (C8197ed) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo21763f(int i) {
        this.zzd = i;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int d = C8457se.m29041a().mo22144b(getClass()).mo21978d(this);
        this.zza = d;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Object mo21702k(int i, Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final <MessageType extends C8197ed<MessageType, BuilderType>, BuilderType extends C8581zc<MessageType, BuilderType>> BuilderType mo21765l() {
        return (C8581zc) mo21702k(5, (Object) null, (Object) null);
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C8255he mo21766n() {
        return (C8581zc) mo21702k(5, (Object) null, (Object) null);
    }

    /* renamed from: r */
    public final boolean mo21767r() {
        byte byteValue = ((Byte) mo21702k(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean h = C8457se.m29041a().mo22144b(getClass()).mo21982h(this);
        mo21702k(2, true != h ? null : this, (Object) null);
        return h;
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C8255he mo21768s() {
        C8581zc zcVar = (C8581zc) mo21702k(5, (Object) null, (Object) null);
        zcVar.mo22293i(this);
        return zcVar;
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C8274ie mo21769t() {
        return (C8197ed) mo21702k(6, (Object) null, (Object) null);
    }

    public final String toString() {
        return C8312ke.m28707a(this, super.toString());
    }

    /* renamed from: u */
    public final int mo21771u() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int a = C8457se.m29041a().mo22144b(getClass()).mo21975a(this);
        this.zzd = a;
        return a;
    }
}
