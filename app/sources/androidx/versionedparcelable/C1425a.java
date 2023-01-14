package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p027c.p060f.C1788a;

/* renamed from: androidx.versionedparcelable.a */
public abstract class C1425a {

    /* renamed from: a */
    protected final C1788a<String, Method> f4164a;

    /* renamed from: b */
    protected final C1788a<String, Method> f4165b;

    /* renamed from: c */
    protected final C1788a<String, Class> f4166c;

    public C1425a(C1788a<String, Method> aVar, C1788a<String, Method> aVar2, C1788a<String, Class> aVar3) {
        this.f4164a = aVar;
        this.f4165b = aVar2;
        this.f4166c = aVar3;
    }

    /* renamed from: N */
    private void m6378N(C1427c cVar) {
        try {
            mo5282I(m6379c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m6379c(Class<? extends C1427c> cls) {
        Class cls2 = this.f4166c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4166c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m6380d(String str) {
        Class<C1425a> cls = C1425a.class;
        Method method = this.f4164a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4164a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m6381e(Class cls) {
        Method method = this.f4165b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m6379c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1425a.class});
        this.f4165b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo5274A(byte[] bArr);

    /* renamed from: B */
    public void mo5275B(byte[] bArr, int i) {
        mo5306w(i);
        mo5274A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo5276C(CharSequence charSequence);

    /* renamed from: D */
    public void mo5277D(CharSequence charSequence, int i) {
        mo5306w(i);
        mo5276C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo5278E(int i);

    /* renamed from: F */
    public void mo5279F(int i, int i2) {
        mo5306w(i2);
        mo5278E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo5280G(Parcelable parcelable);

    /* renamed from: H */
    public void mo5281H(Parcelable parcelable, int i) {
        mo5306w(i);
        mo5280G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo5282I(String str);

    /* renamed from: J */
    public void mo5283J(String str, int i) {
        mo5306w(i);
        mo5282I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C1427c> void mo5284K(T t, C1425a aVar) {
        try {
            m6381e(t.getClass()).invoke((Object) null, new Object[]{t, aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo5285L(C1427c cVar) {
        if (cVar == null) {
            mo5282I((String) null);
            return;
        }
        m6378N(cVar);
        C1425a b = mo5288b();
        mo5284K(cVar, b);
        b.mo5287a();
    }

    /* renamed from: M */
    public void mo5286M(C1427c cVar, int i) {
        mo5306w(i);
        mo5285L(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5287a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1425a mo5288b();

    /* renamed from: f */
    public boolean mo5289f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo5290g();

    /* renamed from: h */
    public boolean mo5291h(boolean z, int i) {
        return !mo5296m(i) ? z : mo5290g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo5292i();

    /* renamed from: j */
    public byte[] mo5293j(byte[] bArr, int i) {
        return !mo5296m(i) ? bArr : mo5292i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo5294k();

    /* renamed from: l */
    public CharSequence mo5295l(CharSequence charSequence, int i) {
        return !mo5296m(i) ? charSequence : mo5294k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo5296m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C1427c> T mo5297n(String str, C1425a aVar) {
        try {
            return (C1427c) m6380d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo5298o();

    /* renamed from: p */
    public int mo5299p(int i, int i2) {
        return !mo5296m(i2) ? i : mo5298o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo5300q();

    /* renamed from: r */
    public <T extends Parcelable> T mo5301r(T t, int i) {
        return !mo5296m(i) ? t : mo5300q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo5302s();

    /* renamed from: t */
    public String mo5303t(String str, int i) {
        return !mo5296m(i) ? str : mo5302s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C1427c> T mo5304u() {
        String s = mo5302s();
        if (s == null) {
            return null;
        }
        return mo5297n(s, mo5288b());
    }

    /* renamed from: v */
    public <T extends C1427c> T mo5305v(T t, int i) {
        return !mo5296m(i) ? t : mo5304u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo5306w(int i);

    /* renamed from: x */
    public void mo5307x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo5308y(boolean z);

    /* renamed from: z */
    public void mo5309z(boolean z, int i) {
        mo5306w(i);
        mo5308y(z);
    }
}
