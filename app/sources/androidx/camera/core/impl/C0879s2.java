package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.s2 */
public abstract class C0879s2 {

    /* renamed from: androidx.camera.core.impl.s2$a */
    public enum C0880a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        

        /* renamed from: t */
        final int f2557t;

        private C0880a(int i) {
            this.f2557t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo3104e() {
            return this.f2557t;
        }
    }

    /* renamed from: androidx.camera.core.impl.s2$b */
    public enum C0881b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    C0879s2() {
    }

    /* renamed from: a */
    public static C0879s2 m3479a(C0881b bVar, C0880a aVar) {
        return new C0903x(bVar, aVar);
    }

    /* renamed from: b */
    public abstract C0880a mo3101b();

    /* renamed from: c */
    public abstract C0881b mo3102c();

    /* renamed from: d */
    public final boolean mo3103d(C0879s2 s2Var) {
        return s2Var.mo3101b().mo3104e() <= mo3101b().mo3104e() && s2Var.mo3102c() == mo3102c();
    }
}
