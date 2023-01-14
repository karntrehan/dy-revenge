package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.p512r.C10899a;
import org.greenrobot.eventbus.p512r.C10900b;

/* renamed from: org.greenrobot.eventbus.p */
class C10896p {

    /* renamed from: a */
    private static final Map<Class<?>, List<C10895o>> f28505a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final C10897a[] f28506b = new C10897a[4];

    /* renamed from: c */
    private List<C10900b> f28507c;

    /* renamed from: d */
    private final boolean f28508d;

    /* renamed from: e */
    private final boolean f28509e;

    /* renamed from: org.greenrobot.eventbus.p$a */
    static class C10897a {

        /* renamed from: a */
        final List<C10895o> f28510a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f28511b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f28512c = new HashMap();

        /* renamed from: d */
        final StringBuilder f28513d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f28514e;

        /* renamed from: f */
        Class<?> f28515f;

        /* renamed from: g */
        boolean f28516g;

        /* renamed from: h */
        C10899a f28517h;

        C10897a() {
        }

        /* renamed from: b */
        private boolean m37045b(Method method, Class<?> cls) {
            this.f28513d.setLength(0);
            this.f28513d.append(method.getName());
            StringBuilder sb = this.f28513d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f28513d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f28512c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f28512c.put(sb2, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo28497a(Method method, Class<?> cls) {
            Object put = this.f28511b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m37045b((Method) put, cls)) {
                    this.f28511b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m37045b(method, cls);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo28498c(Class<?> cls) {
            this.f28515f = cls;
            this.f28514e = cls;
            this.f28516g = false;
            this.f28517h = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo28499d() {
            if (!this.f28516g) {
                Class<? super Object> superclass = this.f28515f.getSuperclass();
                this.f28515f = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && !name.startsWith("androidx.")) {
                    return;
                }
            }
            this.f28515f = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo28500e() {
            this.f28510a.clear();
            this.f28511b.clear();
            this.f28512c.clear();
            this.f28513d.setLength(0);
            this.f28514e = null;
            this.f28515f = null;
            this.f28516g = false;
            this.f28517h = null;
        }
    }

    C10896p(List<C10900b> list, boolean z, boolean z2) {
        this.f28507c = list;
        this.f28508d = z;
        this.f28509e = z2;
    }

    /* renamed from: b */
    private List<C10895o> m37038b(Class<?> cls) {
        C10897a g = m37043g();
        g.mo28498c(cls);
        while (g.f28515f != null) {
            C10899a f = m37042f(g);
            g.f28517h = f;
            if (f != null) {
                for (C10895o oVar : f.mo28503a()) {
                    if (g.mo28497a(oVar.f28499a, oVar.f28501c)) {
                        g.f28510a.add(oVar);
                    }
                }
            } else {
                m37040d(g);
            }
            g.mo28499d();
        }
        return m37041e(g);
    }

    /* renamed from: c */
    private List<C10895o> m37039c(Class<?> cls) {
        C10897a g = m37043g();
        g.mo28498c(cls);
        while (g.f28515f != null) {
            m37040d(g);
            g.mo28499d();
        }
        return m37041e(g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        r15 = "Could not inspect methods of " + r15.f28515f.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        if (r14.f28509e != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r15);
        r15 = ". Please consider using EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0115, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r15);
        r15 = ". Please make this class visible to EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011f, code lost:
        r1.append(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012b, code lost:
        throw new org.greenrobot.eventbus.C10883e(r1.toString(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = r15.f28515f.getMethods();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r15.f28516g = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m37040d(org.greenrobot.eventbus.C10896p.C10897a r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.Class<?> r1 = r15.f28515f     // Catch:{ all -> 0x0008 }
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch:{ all -> 0x0008 }
            goto L_0x0010
        L_0x0008:
            java.lang.Class<?> r1 = r15.f28515f     // Catch:{ LinkageError -> 0x00ee }
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch:{ LinkageError -> 0x00ee }
            r15.f28516g = r0
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x00ed
            r6 = r1[r4]
            int r5 = r6.getModifiers()
            r7 = r5 & 1
            java.lang.String r8 = "."
            if (r7 == 0) goto L_0x00a7
            r5 = r5 & 5192(0x1448, float:7.276E-42)
            if (r5 != 0) goto L_0x00a7
            java.lang.Class[] r5 = r6.getParameterTypes()
            int r7 = r5.length
            if (r7 != r0) goto L_0x005b
            java.lang.Class<org.greenrobot.eventbus.m> r7 = org.greenrobot.eventbus.C10893m.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            org.greenrobot.eventbus.m r7 = (org.greenrobot.eventbus.C10893m) r7
            if (r7 == 0) goto L_0x00e9
            r8 = r5[r3]
            boolean r5 = r15.mo28497a(r6, r8)
            if (r5 == 0) goto L_0x00e9
            org.greenrobot.eventbus.ThreadMode r9 = r7.threadMode()
            java.util.List<org.greenrobot.eventbus.o> r11 = r15.f28510a
            org.greenrobot.eventbus.o r12 = new org.greenrobot.eventbus.o
            int r10 = r7.priority()
            boolean r13 = r7.sticky()
            r5 = r12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11.add(r12)
            goto L_0x00e9
        L_0x005b:
            boolean r7 = r14.f28508d
            if (r7 == 0) goto L_0x00e9
            java.lang.Class<org.greenrobot.eventbus.m> r7 = org.greenrobot.eventbus.C10893m.class
            boolean r7 = r6.isAnnotationPresent(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x00e9
        L_0x0069:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.e r0 = new org.greenrobot.eventbus.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@Subscribe method "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = "must have exactly 1 parameter but has "
            r1.append(r15)
            int r15 = r5.length
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00a7:
            boolean r5 = r14.f28508d
            if (r5 == 0) goto L_0x00e9
            java.lang.Class<org.greenrobot.eventbus.m> r5 = org.greenrobot.eventbus.C10893m.class
            boolean r5 = r6.isAnnotationPresent(r5)
            if (r5 != 0) goto L_0x00b4
            goto L_0x00e9
        L_0x00b4:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.e r0 = new org.greenrobot.eventbus.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = " is a illegal @Subscribe method: must be public, non-static, and non-abstract"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00e9:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x00ed:
            return
        L_0x00ee:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not inspect methods of "
            r1.append(r2)
            java.lang.Class<?> r15 = r15.f28515f
            java.lang.String r15 = r15.getName()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            boolean r1 = r14.f28509e
            if (r1 == 0) goto L_0x0115
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please consider using EventBus annotation processor to avoid reflection."
            goto L_0x011f
        L_0x0115:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please make this class visible to EventBus annotation processor to avoid reflection."
        L_0x011f:
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            org.greenrobot.eventbus.e r1 = new org.greenrobot.eventbus.e
            r1.<init>(r15, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C10896p.m37040d(org.greenrobot.eventbus.p$a):void");
    }

    /* renamed from: e */
    private List<C10895o> m37041e(C10897a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f28510a);
        aVar.mo28500e();
        synchronized (f28506b) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                C10897a[] aVarArr = f28506b;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private C10899a m37042f(C10897a aVar) {
        C10899a aVar2 = aVar.f28517h;
        if (!(aVar2 == null || aVar2.mo28504b() == null)) {
            C10899a b = aVar.f28517h.mo28504b();
            if (aVar.f28515f == b.mo28505c()) {
                return b;
            }
        }
        List<C10900b> list = this.f28507c;
        if (list == null) {
            return null;
        }
        for (C10900b a : list) {
            C10899a a2 = a.mo28506a(aVar.f28515f);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* renamed from: g */
    private C10897a m37043g() {
        synchronized (f28506b) {
            for (int i = 0; i < 4; i++) {
                C10897a[] aVarArr = f28506b;
                C10897a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new C10897a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C10895o> mo28496a(Class<?> cls) {
        Map<Class<?>, List<C10895o>> map = f28505a;
        List<C10895o> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<C10895o> c = this.f28509e ? m37039c(cls) : m37038b(cls);
        if (!c.isEmpty()) {
            map.put(cls, c);
            return c;
        }
        throw new C10883e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
