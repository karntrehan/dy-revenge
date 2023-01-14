package p174e.p319f.p320a.p382e.p383a.p385b;

import p027c.p028a.C1444j;

/* renamed from: e.f.a.e.a.b.b0 */
public final class C9104b0<T> implements C9106c0, C9147z {

    /* renamed from: a */
    private static final Object f24990a = new Object();

    /* renamed from: b */
    private volatile C9106c0<T> f24991b;

    /* renamed from: c */
    private volatile Object f24992c = f24990a;

    private C9104b0(C9106c0<T> c0Var) {
        this.f24991b = c0Var;
    }

    /* renamed from: b */
    public static <P extends C9106c0<T>, T> C9106c0<T> m30331b(P p) {
        C9127n.m30387c(p);
        return p instanceof C9104b0 ? p : new C9104b0(p);
    }

    /* renamed from: c */
    public static <P extends C9106c0<T>, T> C9147z<T> m30332c(P p) {
        if (p instanceof C9147z) {
            return (C9147z) p;
        }
        C9127n.m30387c(p);
        return new C9104b0(p);
    }

    /* renamed from: a */
    public final T mo13826a() {
        T t = this.f24992c;
        T t2 = f24990a;
        if (t == t2) {
            synchronized (this) {
                t = this.f24992c;
                if (t == t2) {
                    t = this.f24991b.mo13826a();
                    T t3 = this.f24992c;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(valueOf.length() + C1444j.f4236H0 + valueOf2.length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f24992c = t;
                    this.f24991b = null;
                }
            }
        }
        return t;
    }
}
