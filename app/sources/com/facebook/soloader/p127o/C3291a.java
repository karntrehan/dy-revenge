package com.facebook.soloader.p127o;

/* renamed from: com.facebook.soloader.o.a */
public class C3291a {

    /* renamed from: a */
    private static C3292b f9301a;

    private C3291a() {
    }

    /* renamed from: a */
    public static synchronized void m12872a(C3292b bVar) {
        synchronized (C3291a.class) {
            if (f9301a == null) {
                f9301a = bVar;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m12873b(C3292b bVar) {
        synchronized (C3291a.class) {
            if (!m12874c()) {
                m12872a(bVar);
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m12874c() {
        boolean z;
        synchronized (C3291a.class) {
            z = f9301a != null;
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m12875d(String str) {
        return m12876e(str, 0);
    }

    /* renamed from: e */
    public static boolean m12876e(String str, int i) {
        C3292b bVar;
        synchronized (C3291a.class) {
            bVar = f9301a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.mo10742a(str, i);
    }
}
