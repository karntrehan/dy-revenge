package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p174e.p319f.p393c.p394a.p404z.p405a.C9426a;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9449e;
import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9555u1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9563v;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9578a;

/* renamed from: e.f.c.a.z.a.z */
public abstract class C9577z<MessageType extends C9577z<MessageType, BuilderType>, BuilderType extends C9578a<MessageType, BuilderType>> extends C9426a<MessageType, BuilderType> {
    private static Map<Object, C9577z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected C9525p1 unknownFields = C9525p1.m32204e();

    /* renamed from: e.f.c.a.z.a.z$a */
    public static abstract class C9578a<MessageType extends C9577z<MessageType, BuilderType>, BuilderType extends C9578a<MessageType, BuilderType>> extends C9426a.C9427a<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f25643f;

        /* renamed from: o */
        protected MessageType f25644o;

        /* renamed from: p */
        protected boolean f25645p = false;

        protected C9578a(MessageType messagetype) {
            this.f25643f = messagetype;
            this.f25644o = (C9577z) messagetype.mo24059s(C9583f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: y */
        private void m32659y(MessageType messagetype, MessageType messagetype2) {
            C9448d1.m31455a().mo23523e(messagetype).mo23629a(messagetype, messagetype2);
        }

        /* renamed from: q */
        public final MessageType mo23985b() {
            MessageType r = mo23984X();
            if (r.mo24006l()) {
                return r;
            }
            throw C9426a.C9427a.m31398p(r);
        }

        /* renamed from: r */
        public MessageType mo23984X() {
            if (this.f25645p) {
                return this.f25644o;
            }
            this.f25644o.mo24052A();
            this.f25645p = true;
            return this.f25644o;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType C = mo24005c().mo23982j();
            C.mo24071x(mo23984X());
            return C;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public final void mo24067t() {
            if (this.f25645p) {
                mo24068u();
                this.f25645p = false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo24068u() {
            MessageType messagetype = (C9577z) this.f25644o.mo24059s(C9583f.NEW_MUTABLE_INSTANCE);
            m32659y(messagetype, this.f25644o);
            this.f25644o = messagetype;
        }

        /* renamed from: v */
        public MessageType mo24005c() {
            return this.f25643f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public BuilderType mo23483m(MessageType messagetype) {
            return mo24071x(messagetype);
        }

        /* renamed from: x */
        public BuilderType mo24071x(MessageType messagetype) {
            mo24067t();
            m32659y(this.f25644o, messagetype);
            return this;
        }
    }

    /* renamed from: e.f.c.a.z.a.z$b */
    protected static class C9579b<T extends C9577z<T, ?>> extends C9430b<T> {

        /* renamed from: b */
        private final T f25646b;

        public C9579b(T t) {
            this.f25646b = t;
        }

        /* renamed from: g */
        public T mo23507b(C9485j jVar, C9526q qVar) {
            return C9577z.m32633I(this.f25646b, jVar, qVar);
        }
    }

    /* renamed from: e.f.c.a.z.a.z$c */
    public static abstract class C9580c<MessageType extends C9580c<MessageType, BuilderType>, BuilderType> extends C9577z<MessageType, BuilderType> implements C9546t0 {
        protected C9563v<C9581d> extensions = C9563v.m32451h();

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public C9563v<C9581d> mo24073M() {
            if (this.extensions.mo24022n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* renamed from: e.f.c.a.z.a.z$d */
    static final class C9581d implements C9563v.C9565b<C9581d> {

        /* renamed from: f */
        final C9431b0.C9435d<?> f25647f;

        /* renamed from: o */
        final int f25648o;

        /* renamed from: p */
        final C9555u1.C9557b f25649p;

        /* renamed from: q */
        final boolean f25650q;

        /* renamed from: r */
        final boolean f25651r;

        /* renamed from: I */
        public C9555u1.C9562c mo24028I() {
            return this.f25649p.mo24011e();
        }

        /* renamed from: J */
        public boolean mo24029J() {
            return this.f25651r;
        }

        /* renamed from: d */
        public int mo24030d() {
            return this.f25648o;
        }

        /* renamed from: e */
        public int compareTo(C9581d dVar) {
            return this.f25648o - dVar.f25648o;
        }

        /* renamed from: f */
        public boolean mo24031f() {
            return this.f25650q;
        }

        /* renamed from: g */
        public C9431b0.C9435d<?> mo24076g() {
            return this.f25647f;
        }

        /* renamed from: i */
        public C9555u1.C9557b mo24032i() {
            return this.f25649p;
        }

        /* renamed from: w */
        public C9537s0.C9538a mo24033w(C9537s0.C9538a aVar, C9537s0 s0Var) {
            return ((C9578a) aVar).mo24071x((C9577z) s0Var);
        }
    }

    /* renamed from: e.f.c.a.z.a.z$e */
    public static class C9582e<ContainingType extends C9537s0, Type> extends C9520o<ContainingType, Type> {

        /* renamed from: a */
        final C9537s0 f25652a;

        /* renamed from: b */
        final C9581d f25653b;

        /* renamed from: a */
        public C9555u1.C9557b mo24077a() {
            return this.f25653b.mo24032i();
        }

        /* renamed from: b */
        public C9537s0 mo24078b() {
            return this.f25652a;
        }

        /* renamed from: c */
        public int mo24079c() {
            return this.f25653b.mo24030d();
        }

        /* renamed from: d */
        public boolean mo24080d() {
            return this.f25653b.f25650q;
        }
    }

    /* renamed from: e.f.c.a.z.a.z$f */
    public enum C9583f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: B */
    protected static <E> C9431b0.C9440i<E> m32628B(C9431b0.C9440i<E> iVar) {
        int size = iVar.size();
        return iVar.mo23497n(size == 0 ? 10 : size * 2);
    }

    /* renamed from: D */
    protected static Object m32629D(C9537s0 s0Var, String str, Object[] objArr) {
        return new C9461f1(s0Var, str, objArr);
    }

    /* renamed from: F */
    protected static <T extends C9577z<T, ?>> T m32630F(T t, C9468i iVar, C9526q qVar) {
        return m32636q(m32632H(t, iVar, qVar));
    }

    /* renamed from: G */
    protected static <T extends C9577z<T, ?>> T m32631G(T t, byte[] bArr, C9526q qVar) {
        return m32636q(m32634J(t, bArr, 0, bArr.length, qVar));
    }

    /* renamed from: H */
    private static <T extends C9577z<T, ?>> T m32632H(T t, C9468i iVar, C9526q qVar) {
        T I;
        try {
            C9485j C = iVar.mo23640C();
            I = m32633I(t, C, qVar);
            C.mo23677a(0);
            return I;
        } catch (C9443c0 e) {
            throw e.mo23518i(I);
        } catch (C9443c0 e2) {
            throw e2;
        }
    }

    /* renamed from: I */
    static <T extends C9577z<T, ?>> T m32633I(T t, C9485j jVar, C9526q qVar) {
        T t2 = (C9577z) t.mo24059s(C9583f.NEW_MUTABLE_INSTANCE);
        try {
            C9467h1 e = C9448d1.m31455a().mo23523e(t2);
            e.mo23634f(t2, C9490k.m31866Q(jVar), qVar);
            e.mo23630b(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C9443c0) {
                throw ((C9443c0) e2.getCause());
            }
            throw new C9443c0(e2.getMessage()).mo23518i(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof C9443c0) {
                throw ((C9443c0) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: J */
    static <T extends C9577z<T, ?>> T m32634J(T t, byte[] bArr, int i, int i2, C9526q qVar) {
        T t2 = (C9577z) t.mo24059s(C9583f.NEW_MUTABLE_INSTANCE);
        try {
            C9467h1 e = C9448d1.m31455a().mo23523e(t2);
            e.mo23632d(t2, bArr, i, i + i2, new C9449e.C9451b(qVar));
            e.mo23630b(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof C9443c0) {
                throw ((C9443c0) e2.getCause());
            }
            throw new C9443c0(e2.getMessage()).mo23518i(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw C9443c0.m31449j().mo23518i(t2);
        }
    }

    /* renamed from: K */
    protected static <T extends C9577z<?, ?>> void m32635K(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: q */
    private static <T extends C9577z<T, ?>> T m32636q(T t) {
        if (t == null || t.mo24006l()) {
            return t;
        }
        throw t.mo23480n().mo23897a().mo23518i(t);
    }

    /* renamed from: v */
    protected static <E> C9431b0.C9440i<E> m32637v() {
        return C9456e1.m31504h();
    }

    /* renamed from: w */
    static <T extends C9577z<?, ?>> T m32638w(Class<T> cls) {
        T t = (C9577z) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C9577z) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C9577z) C9539s1.m32325i(cls)).mo24005c();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: y */
    static Object m32639y(Method method, Object obj, Object... objArr) {
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

    /* renamed from: z */
    protected static final <T extends C9577z<T, ?>> boolean m32640z(T t, boolean z) {
        byte byteValue = ((Byte) t.mo24059s(C9583f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c = C9448d1.m31455a().mo23523e(t).mo23631c(t);
        if (z) {
            t.mo24060t(C9583f.SET_MEMOIZED_IS_INITIALIZED, c ? t : null);
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo24052A() {
        C9448d1.m31455a().mo23523e(this).mo23630b(this);
    }

    /* renamed from: C */
    public final BuilderType mo23982j() {
        return (C9578a) mo24059s(C9583f.NEW_BUILDER);
    }

    /* renamed from: L */
    public final BuilderType mo23979d() {
        BuilderType buildertype = (C9578a) mo24059s(C9583f.NEW_BUILDER);
        buildertype.mo24071x(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo23476a() {
        return this.memoizedSerializedSize;
    }

    /* renamed from: e */
    public void mo23980e(C9504l lVar) {
        C9448d1.m31455a().mo23523e(this).mo23633e(this, C9511m.m32083P(lVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mo24005c().getClass().isInstance(obj)) {
            return false;
        }
        return C9448d1.m31455a().mo23523e(this).mo23635g(this, (C9577z) obj);
    }

    /* renamed from: g */
    public int mo23981g() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C9448d1.m31455a().mo23523e(this).mo23636h(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int j = C9448d1.m31455a().mo23523e(this).mo23638j(this);
        this.memoizedHashCode = j;
        return j;
    }

    /* renamed from: k */
    public final C9429a1<MessageType> mo23983k() {
        return (C9429a1) mo24059s(C9583f.GET_PARSER);
    }

    /* renamed from: l */
    public final boolean mo24006l() {
        return m32640z(this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo23481o(int i) {
        this.memoizedSerializedSize = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Object mo24057p() {
        return mo24059s(C9583f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final <MessageType extends C9577z<MessageType, BuilderType>, BuilderType extends C9578a<MessageType, BuilderType>> BuilderType mo24058r() {
        return (C9578a) mo24059s(C9583f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Object mo24059s(C9583f fVar) {
        return mo23350u(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Object mo24060t(C9583f fVar, Object obj) {
        return mo23350u(fVar, obj, (Object) null);
    }

    public String toString() {
        return C9554u0.m32442e(this, super.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract Object mo23350u(C9583f fVar, Object obj, Object obj2);

    /* renamed from: x */
    public final MessageType mo24005c() {
        return (C9577z) mo24059s(C9583f.GET_DEFAULT_INSTANCE);
    }
}
