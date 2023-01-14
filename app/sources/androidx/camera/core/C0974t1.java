package androidx.camera.core;

/* renamed from: androidx.camera.core.t1 */
public abstract class C0974t1 {

    /* renamed from: androidx.camera.core.t1$a */
    public static abstract class C0975a {
        /* renamed from: a */
        public static C0975a m3790a(int i) {
            return m3791b(i, (Throwable) null);
        }

        /* renamed from: b */
        public static C0975a m3791b(int i, Throwable th) {
            return new C0686g1(i, th);
        }

        /* renamed from: c */
        public abstract Throwable mo2730c();

        /* renamed from: d */
        public abstract int mo2731d();
    }

    /* renamed from: androidx.camera.core.t1$b */
    public enum C0976b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: a */
    public static C0974t1 m3786a(C0976b bVar) {
        return m3787b(bVar, (C0975a) null);
    }

    /* renamed from: b */
    public static C0974t1 m3787b(C0976b bVar, C0975a aVar) {
        return new C0681f1(bVar, aVar);
    }

    /* renamed from: c */
    public abstract C0975a mo2722c();

    /* renamed from: d */
    public abstract C0976b mo2723d();
}
