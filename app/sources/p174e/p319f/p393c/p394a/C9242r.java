package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import p174e.p319f.p393c.p394a.C9237p;
import p174e.p319f.p393c.p394a.p403y.C9312a0;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p403y.C9424z;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;

/* renamed from: e.f.c.a.r */
public final class C9242r {

    /* renamed from: a */
    private static final Logger f25156a = Logger.getLogger(C9242r.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, C9246d> f25157b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, C9245c> f25158c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f25159d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, ?> f25160e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, C9241q<?, ?>> f25161f = new ConcurrentHashMap();

    /* renamed from: e.f.c.a.r$a */
    class C9243a implements C9246d {

        /* renamed from: a */
        final /* synthetic */ C9227h f25162a;

        C9243a(C9227h hVar) {
            this.f25162a = hVar;
        }

        /* renamed from: a */
        public <Q> C9221e<Q> mo23246a(Class<Q> cls) {
            try {
                return new C9222f(this.f25162a, cls);
            } catch (IllegalArgumentException e) {
                throw new GeneralSecurityException("Primitive type not supported", e);
            }
        }

        /* renamed from: b */
        public C9221e<?> mo23247b() {
            C9227h hVar = this.f25162a;
            return new C9222f(hVar, hVar.mo23198a());
        }

        /* renamed from: c */
        public Class<?> mo23248c() {
            return this.f25162a.getClass();
        }

        /* renamed from: d */
        public Set<Class<?>> mo23249d() {
            return this.f25162a.mo23205h();
        }
    }

    /* renamed from: e.f.c.a.r$b */
    class C9244b implements C9245c {

        /* renamed from: a */
        final /* synthetic */ C9227h f25163a;

        C9244b(C9227h hVar) {
            this.f25163a = hVar;
        }
    }

    /* renamed from: e.f.c.a.r$c */
    private interface C9245c {
    }

    /* renamed from: e.f.c.a.r$d */
    private interface C9246d {
        /* renamed from: a */
        <P> C9221e<P> mo23246a(Class<P> cls);

        /* renamed from: b */
        C9221e<?> mo23247b();

        /* renamed from: c */
        Class<?> mo23248c();

        /* renamed from: d */
        Set<Class<?>> mo23249d();
    }

    private C9242r() {
    }

    /* renamed from: a */
    private static <T> T m30695a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: b */
    private static <KeyProtoT extends C9537s0> C9246d m30696b(C9227h<KeyProtoT> hVar) {
        return new C9243a(hVar);
    }

    /* renamed from: c */
    private static <KeyProtoT extends C9537s0> C9245c m30697c(C9227h<KeyProtoT> hVar) {
        return new C9244b(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m30698d(java.lang.String r5, java.lang.Class<?> r6, boolean r7) {
        /*
            java.lang.Class<e.f.c.a.r> r0 = p174e.p319f.p393c.p394a.C9242r.class
            monitor-enter(r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, e.f.c.a.r$d> r1 = f25157b     // Catch:{ all -> 0x0081 }
            boolean r2 = r1.containsKey(r5)     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0081 }
            e.f.c.a.r$d r1 = (p174e.p319f.p393c.p394a.C9242r.C9246d) r1     // Catch:{ all -> 0x0081 }
            java.lang.Class r2 = r1.mo23248c()     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0047
            if (r7 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r6 = f25159d     // Catch:{ all -> 0x0081 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0081 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0081 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0081 }
            if (r6 == 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r7.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "New keys are already disallowed for key type "
            r7.append(r1)     // Catch:{ all -> 0x0081 }
            r7.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0081 }
            r6.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r6     // Catch:{ all -> 0x0081 }
        L_0x0045:
            monitor-exit(r0)
            return
        L_0x0047:
            java.util.logging.Logger r7 = f25156a     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch:{ all -> 0x0081 }
            r2.append(r5)     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0081 }
            r7.warning(r2)     // Catch:{ all -> 0x0081 }
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0081 }
            r4 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0081 }
            r5 = 1
            java.lang.Class r1 = r1.mo23248c()     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r1     // Catch:{ all -> 0x0081 }
            r5 = 2
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x0081 }
            r3[r5] = r6     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0081 }
            r7.<init>(r5)     // Catch:{ all -> 0x0081 }
            throw r7     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.C9242r.m30698d(java.lang.String, java.lang.Class, boolean):void");
    }

    /* renamed from: e */
    public static Class<?> m30699e(Class<?> cls) {
        C9241q qVar = (C9241q) f25161f.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.mo23243a();
    }

    /* renamed from: f */
    private static synchronized C9246d m30700f(String str) {
        C9246d dVar;
        synchronized (C9242r.class) {
            ConcurrentMap<String, C9246d> concurrentMap = f25157b;
            if (concurrentMap.containsKey(str)) {
                dVar = (C9246d) concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return dVar;
    }

    /* renamed from: g */
    private static <P> C9221e<P> m30701g(String str, Class<P> cls) {
        C9246d f = m30700f(str);
        if (cls == null) {
            return f.mo23247b();
        }
        if (f.mo23249d().contains(cls)) {
            return f.mo23246a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f.mo23248c() + ", supported primitives: " + m30713s(f.mo23249d()));
    }

    /* renamed from: h */
    public static <P> P m30702h(String str, C9468i iVar, Class<P> cls) {
        return m30704j(str, iVar, (Class) m30695a(cls));
    }

    /* renamed from: i */
    public static <P> P m30703i(String str, byte[] bArr, Class<P> cls) {
        return m30702h(str, C9468i.m31674k(bArr), cls);
    }

    /* renamed from: j */
    private static <P> P m30704j(String str, C9468i iVar, Class<P> cls) {
        return m30701g(str, cls).mo23194d(iVar);
    }

    /* renamed from: k */
    public static <P> C9237p<P> m30705k(C9230i iVar, C9221e<P> eVar, Class<P> cls) {
        return m30707m(iVar, eVar, (Class) m30695a(cls));
    }

    /* renamed from: l */
    public static <P> C9237p<P> m30706l(C9230i iVar, Class<P> cls) {
        return m30705k(iVar, (C9221e) null, cls);
    }

    /* renamed from: m */
    private static <P> C9237p<P> m30707m(C9230i iVar, C9221e<P> eVar, Class<P> cls) {
        C9247s.m30726d(iVar.mo23213f());
        C9237p<P> f = C9237p.m30680f(cls);
        for (C9324c0.C9327c next : iVar.mo23213f().mo23365T()) {
            if (next.mo23375U() == C9424z.ENABLED) {
                C9237p.C9239b<P> a = f.mo23228a((eVar == null || !eVar.mo23191a(next.mo23372R().mo23469S())) ? m30704j(next.mo23372R().mo23469S(), next.mo23372R().mo23470T(), cls) : eVar.mo23194d(next.mo23372R().mo23470T()), next);
                if (next.mo23373S() == iVar.mo23213f().mo23366U()) {
                    f.mo23233g(a);
                }
            }
        }
        return f;
    }

    /* renamed from: n */
    public static C9221e<?> m30708n(String str) {
        return m30700f(str).mo23247b();
    }

    /* renamed from: o */
    public static synchronized C9537s0 m30709o(C9312a0 a0Var) {
        C9537s0 b;
        synchronized (C9242r.class) {
            C9221e<?> n = m30708n(a0Var.mo23355S());
            if (((Boolean) f25159d.get(a0Var.mo23355S())).booleanValue()) {
                b = n.mo23192b(a0Var.mo23356T());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.mo23355S());
            }
        }
        return b;
    }

    /* renamed from: p */
    public static synchronized C9419y m30710p(C9312a0 a0Var) {
        C9419y c;
        synchronized (C9242r.class) {
            C9221e<?> n = m30708n(a0Var.mo23355S());
            if (((Boolean) f25159d.get(a0Var.mo23355S())).booleanValue()) {
                c = n.mo23193c(a0Var.mo23356T());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.mo23355S());
            }
        }
        return c;
    }

    /* renamed from: q */
    public static synchronized <KeyProtoT extends C9537s0> void m30711q(C9227h<KeyProtoT> hVar, boolean z) {
        synchronized (C9242r.class) {
            if (hVar != null) {
                String c = hVar.mo23200c();
                m30698d(c, hVar.getClass(), z);
                ConcurrentMap<String, C9246d> concurrentMap = f25157b;
                if (!concurrentMap.containsKey(c)) {
                    concurrentMap.put(c, m30696b(hVar));
                    f25158c.put(c, m30697c(hVar));
                }
                f25159d.put(c, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: r */
    public static synchronized <B, P> void m30712r(C9241q<B, P> qVar) {
        synchronized (C9242r.class) {
            if (qVar != null) {
                Class<P> b = qVar.mo23244b();
                ConcurrentMap<Class<?>, C9241q<?, ?>> concurrentMap = f25161f;
                if (concurrentMap.containsKey(b)) {
                    C9241q qVar2 = (C9241q) concurrentMap.get(b);
                    if (!qVar.getClass().equals(qVar2.getClass())) {
                        Logger logger = f25156a;
                        logger.warning("Attempted overwrite of a registered SetWrapper for type " + b);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{b.getName(), qVar2.getClass().getName(), qVar.getClass().getName()}));
                    }
                }
                concurrentMap.put(b, qVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: s */
    private static String m30713s(Set<Class<?>> set) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class next : set) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(next.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e.f.c.a.p, e.f.c.a.p<B>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <B, P> P m30714t(p174e.p319f.p393c.p394a.C9237p<B> r3, java.lang.Class<P> r4) {
        /*
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, e.f.c.a.q<?, ?>> r0 = f25161f
            java.lang.Object r4 = r0.get(r4)
            e.f.c.a.q r4 = (p174e.p319f.p393c.p394a.C9241q) r4
            if (r4 == 0) goto L_0x0044
            java.lang.Class r0 = r4.mo23243a()
            java.lang.Class r1 = r3.mo23231d()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001d
            java.lang.Object r3 = r4.mo23245c(r3)
            return r3
        L_0x001d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong input primitive class, expected "
            r1.append(r2)
            java.lang.Class r4 = r4.mo23243a()
            r1.append(r4)
            java.lang.String r4 = ", got "
            r1.append(r4)
            java.lang.Class r3 = r3.mo23231d()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0044:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No wrapper found for "
            r0.append(r1)
            java.lang.Class r3 = r3.mo23231d()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.C9242r.m30714t(e.f.c.a.p, java.lang.Class):java.lang.Object");
    }
}
