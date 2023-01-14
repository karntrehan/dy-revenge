package p174e.p175a.p176a.p177i;

import p174e.p175a.p176a.C5377b;

/* renamed from: e.a.a.i.e */
class C5388e {
    /* renamed from: a */
    public static void m19918a(String str) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Empty array name", 4);
        }
    }

    /* renamed from: b */
    public static void m19919b(Object obj) {
        if (obj == null) {
            throw new C5377b("Parameter must not be null", 4);
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new C5377b("Parameter must not be null or empty", 4);
        }
    }

    /* renamed from: c */
    public static void m19920c(String str) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Empty prefix", 4);
        }
    }

    /* renamed from: d */
    public static void m19921d(String str) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Empty property name", 4);
        }
    }

    /* renamed from: e */
    public static void m19922e(String str) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Empty schema namespace URI", 4);
        }
    }

    /* renamed from: f */
    public static void m19923f(String str) {
        if (str == null || str.length() == 0) {
            throw new C5377b("Empty specific language", 4);
        }
    }
}
