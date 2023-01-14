package org.greenrobot.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.android.C10874b;
import org.greenrobot.eventbus.p512r.C10900b;

/* renamed from: org.greenrobot.eventbus.c */
public class C10878c {

    /* renamed from: a */
    static volatile C10878c f28441a;

    /* renamed from: b */
    private static final C10882d f28442b = new C10882d();

    /* renamed from: c */
    private static final Map<Class<?>, List<Class<?>>> f28443c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, CopyOnWriteArrayList<C10898q>> f28444d;

    /* renamed from: e */
    private final Map<Object, List<Class<?>>> f28445e;

    /* renamed from: f */
    private final Map<Class<?>, Object> f28446f;

    /* renamed from: g */
    private final ThreadLocal<C10881c> f28447g;

    /* renamed from: h */
    private final C10888h f28448h;

    /* renamed from: i */
    private final C10892l f28449i;

    /* renamed from: j */
    private final C10877b f28450j;

    /* renamed from: k */
    private final C10872a f28451k;

    /* renamed from: l */
    private final C10896p f28452l;

    /* renamed from: m */
    private final ExecutorService f28453m;

    /* renamed from: n */
    private final boolean f28454n;

    /* renamed from: o */
    private final boolean f28455o;

    /* renamed from: p */
    private final boolean f28456p;

    /* renamed from: q */
    private final boolean f28457q;

    /* renamed from: r */
    private final boolean f28458r;

    /* renamed from: s */
    private final boolean f28459s;

    /* renamed from: t */
    private final int f28460t;

    /* renamed from: u */
    private final C10885g f28461u;

    /* renamed from: org.greenrobot.eventbus.c$a */
    class C10879a extends ThreadLocal<C10881c> {
        C10879a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C10881c initialValue() {
            return new C10881c();
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$b */
    static /* synthetic */ class C10880b {

        /* renamed from: a */
        static final /* synthetic */ int[] f28463a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28463a = r0
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28463a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28463a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28463a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28463a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C10878c.C10880b.<clinit>():void");
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$c */
    static final class C10881c {

        /* renamed from: a */
        final List<Object> f28464a = new ArrayList();

        /* renamed from: b */
        boolean f28465b;

        /* renamed from: c */
        boolean f28466c;

        /* renamed from: d */
        C10898q f28467d;

        /* renamed from: e */
        Object f28468e;

        /* renamed from: f */
        boolean f28469f;

        C10881c() {
        }
    }

    public C10878c() {
        this(f28442b);
    }

    C10878c(C10882d dVar) {
        this.f28447g = new C10879a();
        this.f28461u = dVar.mo28485a();
        this.f28444d = new HashMap();
        this.f28445e = new HashMap();
        this.f28446f = new ConcurrentHashMap();
        C10888h b = dVar.mo28486b();
        this.f28448h = b;
        this.f28449i = b != null ? b.mo28471a(this) : null;
        this.f28450j = new C10877b(this);
        this.f28451k = new C10872a(this);
        List<C10900b> list = dVar.f28480k;
        this.f28460t = list != null ? list.size() : 0;
        this.f28452l = new C10896p(dVar.f28480k, dVar.f28478i, dVar.f28477h);
        this.f28455o = dVar.f28471b;
        this.f28456p = dVar.f28472c;
        this.f28457q = dVar.f28473d;
        this.f28458r = dVar.f28474e;
        this.f28454n = dVar.f28475f;
        this.f28459s = dVar.f28476g;
        this.f28453m = dVar.f28479j;
    }

    /* renamed from: a */
    static void m37001a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m37001a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    private void m37002b(C10898q qVar, Object obj) {
        if (obj != null) {
            m37009o(qVar, obj, m37005i());
        }
    }

    /* renamed from: c */
    public static C10878c m37003c() {
        C10878c cVar = f28441a;
        if (cVar == null) {
            synchronized (C10878c.class) {
                cVar = f28441a;
                if (cVar == null) {
                    cVar = new C10878c();
                    f28441a = cVar;
                }
            }
        }
        return cVar;
    }

    /* renamed from: f */
    private void m37004f(C10898q qVar, Object obj, Throwable th) {
        if (obj instanceof C10894n) {
            if (this.f28455o) {
                C10885g gVar = this.f28461u;
                Level level = Level.SEVERE;
                gVar.mo28470b(level, "SubscriberExceptionEvent subscriber " + qVar.f28518a.getClass() + " threw an exception", th);
                C10894n nVar = (C10894n) obj;
                C10885g gVar2 = this.f28461u;
                gVar2.mo28470b(level, "Initial event " + nVar.f28497c + " caused exception in " + nVar.f28498d, nVar.f28496b);
            }
        } else if (!this.f28454n) {
            if (this.f28455o) {
                C10885g gVar3 = this.f28461u;
                Level level2 = Level.SEVERE;
                gVar3.mo28470b(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.f28518a.getClass(), th);
            }
            if (this.f28457q) {
                mo28479l(new C10894n(this, th, obj, qVar.f28518a));
            }
        } else {
            throw new C10883e("Invoking subscriber failed", th);
        }
    }

    /* renamed from: i */
    private boolean m37005i() {
        C10888h hVar = this.f28448h;
        return hVar == null || hVar.mo28472b();
    }

    /* renamed from: k */
    private static List<Class<?>> m37006k(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f28443c;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m37001a(list, cls2.getInterfaces());
                }
                f28443c.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: m */
    private void m37007m(Object obj, C10881c cVar) {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.f28459s) {
            List<Class<?>> k = m37006k(cls);
            int size = k.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m37008n(obj, cVar, k.get(i));
            }
        } else {
            z = m37008n(obj, cVar, cls);
        }
        if (!z) {
            if (this.f28456p) {
                C10885g gVar = this.f28461u;
                Level level = Level.FINE;
                gVar.mo28469a(level, "No subscribers registered for event " + cls);
            }
            if (this.f28458r && cls != C10889i.class && cls != C10894n.class) {
                mo28479l(new C10889i(this, obj));
            }
        }
    }

    /* renamed from: n */
    private boolean m37008n(Object obj, C10881c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f28444d.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C10898q qVar = (C10898q) it.next();
            cVar.f28468e = obj;
            cVar.f28467d = qVar;
            try {
                m37009o(qVar, obj, cVar.f28466c);
                if (cVar.f28469f) {
                    return true;
                }
            } finally {
                cVar.f28468e = null;
                cVar.f28467d = null;
                cVar.f28469f = false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r5 != null) goto L_0x004e;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m37009o(org.greenrobot.eventbus.C10898q r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            int[] r0 = org.greenrobot.eventbus.C10878c.C10880b.f28463a
            org.greenrobot.eventbus.o r1 = r3.f28519b
            org.greenrobot.eventbus.ThreadMode r1 = r1.f28500b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0052
            r1 = 2
            if (r0 == r1) goto L_0x0049
            r1 = 3
            if (r0 == r1) goto L_0x0044
            r1 = 4
            if (r0 == r1) goto L_0x003c
            r5 = 5
            if (r0 != r5) goto L_0x0021
            org.greenrobot.eventbus.a r5 = r2.f28451k
            r5.mo28467a(r3, r4)
            goto L_0x0055
        L_0x0021:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown thread mode: "
            r5.append(r0)
            org.greenrobot.eventbus.o r3 = r3.f28519b
            org.greenrobot.eventbus.ThreadMode r3 = r3.f28500b
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x003c:
            if (r5 == 0) goto L_0x0052
            org.greenrobot.eventbus.b r5 = r2.f28450j
            r5.mo28467a(r3, r4)
            goto L_0x0055
        L_0x0044:
            org.greenrobot.eventbus.l r5 = r2.f28449i
            if (r5 == 0) goto L_0x0052
            goto L_0x004e
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            org.greenrobot.eventbus.l r5 = r2.f28449i
        L_0x004e:
            r5.mo28467a(r3, r4)
            goto L_0x0055
        L_0x0052:
            r2.mo28477h(r3, r4)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C10878c.m37009o(org.greenrobot.eventbus.q, java.lang.Object, boolean):void");
    }

    /* renamed from: q */
    private void m37010q(Object obj, C10895o oVar) {
        Class<?> cls = oVar.f28501c;
        C10898q qVar = new C10898q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f28444d.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f28444d.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new C10883e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || oVar.f28502d > ((C10898q) copyOnWriteArrayList.get(i)).f28519b.f28502d) {
                copyOnWriteArrayList.add(i, qVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, qVar);
        List list = this.f28445e.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f28445e.put(obj, list);
        }
        list.add(cls);
        if (!oVar.f28503e) {
            return;
        }
        if (this.f28459s) {
            for (Map.Entry next : this.f28446f.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey())) {
                    m37002b(qVar, next.getValue());
                }
            }
            return;
        }
        m37002b(qVar, this.f28446f.get(cls));
    }

    /* renamed from: s */
    private void m37011s(Object obj, Class<?> cls) {
        List list = this.f28444d.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C10898q qVar = (C10898q) list.get(i);
                if (qVar.f28518a == obj) {
                    qVar.f28520c = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ExecutorService mo28474d() {
        return this.f28453m;
    }

    /* renamed from: e */
    public C10885g mo28475e() {
        return this.f28461u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo28476g(C10890j jVar) {
        Object obj = jVar.f28490b;
        C10898q qVar = jVar.f28491c;
        C10890j.m37032b(jVar);
        if (qVar.f28520c) {
            mo28477h(qVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo28477h(C10898q qVar, Object obj) {
        try {
            qVar.f28519b.f28499a.invoke(qVar.f28518a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m37004f(qVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: j */
    public synchronized boolean mo28478j(Object obj) {
        return this.f28445e.containsKey(obj);
    }

    /* renamed from: l */
    public void mo28479l(Object obj) {
        C10881c cVar = this.f28447g.get();
        List<Object> list = cVar.f28464a;
        list.add(obj);
        if (!cVar.f28465b) {
            cVar.f28466c = m37005i();
            cVar.f28465b = true;
            if (!cVar.f28469f) {
                while (!list.isEmpty()) {
                    try {
                        m37007m(list.remove(0), cVar);
                    } finally {
                        cVar.f28465b = false;
                        cVar.f28466c = false;
                    }
                }
                return;
            }
            throw new C10883e("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: p */
    public void mo28480p(Object obj) {
        if (!C10874b.m36994c() || C10874b.m36992a()) {
            List<C10895o> a = this.f28452l.mo28496a(obj.getClass());
            synchronized (this) {
                for (C10895o q : a) {
                    m37010q(obj, q);
                }
            }
            return;
        }
        throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
    }

    /* renamed from: r */
    public synchronized void mo28481r(Object obj) {
        List<Class> list = this.f28445e.get(obj);
        if (list != null) {
            for (Class s : list) {
                m37011s(obj, s);
            }
            this.f28445e.remove(obj);
        } else {
            C10885g gVar = this.f28461u;
            Level level = Level.WARNING;
            gVar.mo28469a(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f28460t + ", eventInheritance=" + this.f28459s + "]";
    }
}
