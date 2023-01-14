package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p455g.C10315m;
import p455g.C10318n;
import p455g.p470y.C10417a;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C10738g {

    /* renamed from: a */
    private static final int f28231a = m36514d(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f28232b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, C10430l<Throwable, Throwable>> f28233c = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.g$a */
    public static final class C10739a extends C10458m implements C10430l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f28234f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10739a(Constructor constructor) {
            super(1);
            this.f28234f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10315m.C10316a aVar = C10315m.f27541f;
                Object newInstance = this.f28234f.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = C10315m.m35012a((Throwable) newInstance);
                    if (C10315m.m35014c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10315m.C10316a aVar2 = C10315m.f27541f;
                obj = C10315m.m35012a(C10318n.m35016a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$b */
    public static final class C10740b extends C10458m implements C10430l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f28235f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10740b(Constructor constructor) {
            super(1);
            this.f28235f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10315m.C10316a aVar = C10315m.f27541f;
                Object newInstance = this.f28235f.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = C10315m.m35012a((Throwable) newInstance);
                    if (C10315m.m35014c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10315m.C10316a aVar2 = C10315m.f27541f;
                obj = C10315m.m35012a(C10318n.m35016a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$c */
    public static final class C10741c extends C10458m implements C10430l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f28236f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10741c(Constructor constructor) {
            super(1);
            this.f28236f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10315m.C10316a aVar = C10315m.f27541f;
                Object newInstance = this.f28236f.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C10315m.m35012a(th2);
                    if (C10315m.m35014c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C10315m.C10316a aVar2 = C10315m.f27541f;
                obj = C10315m.m35012a(C10318n.m35016a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$d */
    public static final class C10742d extends C10458m implements C10430l<Throwable, Throwable> {

        /* renamed from: f */
        final /* synthetic */ Constructor f28237f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10742d(Constructor constructor) {
            super(1);
            this.f28237f = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10315m.C10316a aVar = C10315m.f27541f;
                Object newInstance = this.f28237f.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C10315m.m35012a(th2);
                    if (C10315m.m35014c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C10315m.C10316a aVar2 = C10315m.f27541f;
                obj = C10315m.m35012a(C10318n.m35016a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$e */
    public static final class C10743e<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C10367b.m35206a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$f */
    static final class C10744f extends C10458m implements C10430l {

        /* renamed from: f */
        public static final C10744f f28238f = new C10744f();

        C10744f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$g */
    static final class C10745g extends C10458m implements C10430l {

        /* renamed from: f */
        public static final C10745g f28239f = new C10745g();

        C10745g() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static final C10430l<Throwable, Throwable> m36511a(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C10742d(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C10457l.m35316a(cls2, Throwable.class)) {
                return new C10740b(constructor);
            }
            if (C10457l.m35316a(cls2, cls)) {
                return new C10741c(constructor);
            }
        } else if (length == 2 && C10457l.m35316a(parameterTypes[0], cls) && C10457l.m35316a(parameterTypes[1], Throwable.class)) {
            return new C10739a(constructor);
        }
        return null;
    }

    /* renamed from: b */
    private static final int m36512b(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m36513c(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m36512b(cls, i);
    }

    /* renamed from: d */
    private static final int m36514d(Class<?> cls, int i) {
        Integer num;
        C10417a.m35290b(cls);
        try {
            C10315m.C10316a aVar = C10315m.f27541f;
            num = C10315m.m35012a(Integer.valueOf(m36513c(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            num = C10315m.m35012a(C10318n.m35016a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C10315m.m35014c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: e */
    public static final <E extends java.lang.Throwable> E m36515e(E r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.C10699d0
            r1 = 0
            if (r0 == 0) goto L_0x0028
            g.m$a r0 = p455g.C10315m.f27541f     // Catch:{ all -> 0x0012 }
            kotlinx.coroutines.d0 r9 = (kotlinx.coroutines.C10699d0) r9     // Catch:{ all -> 0x0012 }
            java.lang.Throwable r9 = r9.mo26658a()     // Catch:{ all -> 0x0012 }
            java.lang.Object r9 = p455g.C10315m.m35012a(r9)     // Catch:{ all -> 0x0012 }
            goto L_0x001d
        L_0x0012:
            r9 = move-exception
            g.m$a r0 = p455g.C10315m.f27541f
            java.lang.Object r9 = p455g.C10318n.m35016a(r9)
            java.lang.Object r9 = p455g.C10315m.m35012a(r9)
        L_0x001d:
            boolean r0 = p455g.C10315m.m35014c(r9)
            if (r0 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = r9
        L_0x0025:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0028:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f28232b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, g.y.c.l<java.lang.Throwable, java.lang.Throwable>> r3 = f28233c     // Catch:{ all -> 0x011a }
            java.lang.Class r4 = r9.getClass()     // Catch:{ all -> 0x011a }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x011a }
            g.y.c.l r3 = (p455g.p470y.p471c.C10430l) r3     // Catch:{ all -> 0x011a }
            r2.unlock()
            if (r3 != 0) goto L_0x0113
            int r2 = f28231a
            java.lang.Class r3 = r9.getClass()
            r4 = 0
            int r3 = m36514d(r3, r4)
            if (r2 == r3) goto L_0x0095
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L_0x005e
            int r3 = r0.getReadHoldCount()
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            r5 = 0
        L_0x0060:
            if (r5 >= r3) goto L_0x0068
            r2.unlock()
            int r5 = r5 + 1
            goto L_0x0060
        L_0x0068:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, g.y.c.l<java.lang.Throwable, java.lang.Throwable>> r5 = f28233c     // Catch:{ all -> 0x0088 }
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x0088 }
            kotlinx.coroutines.internal.g$f r6 = kotlinx.coroutines.internal.C10738g.C10744f.f28238f     // Catch:{ all -> 0x0088 }
            r5.put(r9, r6)     // Catch:{ all -> 0x0088 }
            g.s r9 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0088 }
        L_0x007c:
            if (r4 >= r3) goto L_0x0084
            r2.lock()
            int r4 = r4 + 1
            goto L_0x007c
        L_0x0084:
            r0.unlock()
            return r1
        L_0x0088:
            r9 = move-exception
        L_0x0089:
            if (r4 >= r3) goto L_0x0091
            r2.lock()
            int r4 = r4 + 1
            goto L_0x0089
        L_0x0091:
            r0.unlock()
            throw r9
        L_0x0095:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            kotlinx.coroutines.internal.g$e r2 = new kotlinx.coroutines.internal.g$e
            r2.<init>()
            java.util.List r0 = p455g.p460t.C10343h.m35080B(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00ab:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            g.y.c.l r2 = m36511a(r2)
            if (r2 == 0) goto L_0x00ab
        L_0x00bd:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f28232b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00ce
            int r5 = r0.getReadHoldCount()
            goto L_0x00cf
        L_0x00ce:
            r5 = 0
        L_0x00cf:
            r6 = 0
        L_0x00d0:
            if (r6 >= r5) goto L_0x00d8
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x00d0
        L_0x00d8:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, g.y.c.l<java.lang.Throwable, java.lang.Throwable>> r6 = f28233c     // Catch:{ all -> 0x0106 }
            java.lang.Class r7 = r9.getClass()     // Catch:{ all -> 0x0106 }
            if (r2 != 0) goto L_0x00ea
            kotlinx.coroutines.internal.g$g r8 = kotlinx.coroutines.internal.C10738g.C10745g.f28239f     // Catch:{ all -> 0x0106 }
            goto L_0x00eb
        L_0x00ea:
            r8 = r2
        L_0x00eb:
            r6.put(r7, r8)     // Catch:{ all -> 0x0106 }
            g.s r6 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0106 }
        L_0x00f0:
            if (r4 >= r5) goto L_0x00f8
            r3.lock()
            int r4 = r4 + 1
            goto L_0x00f0
        L_0x00f8:
            r0.unlock()
            if (r2 != 0) goto L_0x00fe
            goto L_0x0105
        L_0x00fe:
            java.lang.Object r9 = r2.invoke(r9)
            r1 = r9
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0105:
            return r1
        L_0x0106:
            r9 = move-exception
        L_0x0107:
            if (r4 >= r5) goto L_0x010f
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0107
        L_0x010f:
            r0.unlock()
            throw r9
        L_0x0113:
            java.lang.Object r9 = r3.invoke(r9)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            return r9
        L_0x011a:
            r9 = move-exception
            r2.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10738g.m36515e(java.lang.Throwable):java.lang.Throwable");
    }
}
