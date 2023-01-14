package p455g.p466w;

import p455g.p470y.p472d.C10457l;

/* renamed from: g.w.b */
public final class C10410b {

    /* renamed from: a */
    public static final C10408a f27602a;

    static {
        C10408a aVar;
        Object newInstance;
        Object newInstance2;
        Class<C10408a> cls = C10408a.class;
        int a = m35280a();
        if (a >= 65544 || a < 65536) {
            try {
                newInstance2 = Class.forName("g.w.e.a").newInstance();
                C10457l.m35319d(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    aVar = (C10408a) newInstance2;
                    f27602a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!C10457l.m35316a(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C10457l.m35319d(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            aVar = (C10408a) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!C10457l.m35316a(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543 || a < 65536) {
            try {
                newInstance = Class.forName("g.w.d.a").newInstance();
                C10457l.m35319d(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    aVar = (C10408a) newInstance;
                    f27602a = aVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!C10457l.m35316a(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C10457l.m35319d(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            aVar = (C10408a) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!C10457l.m35316a(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        aVar = new C10408a();
        f27602a = aVar;
    }

    /* renamed from: a */
    private static final int m35280a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int Q = C10300q.m34960Q(property, '.', 0, false, 6, (Object) null);
        if (Q < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = Q + 1;
            int Q2 = C10300q.m34960Q(property, '.', i, false, 4, (Object) null);
            if (Q2 < 0) {
                Q2 = property.length();
            }
            String substring = property.substring(0, Q);
            C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, Q2);
            C10457l.m35319d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
