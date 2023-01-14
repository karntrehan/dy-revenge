package p174e.p319f.p320a.p322b.p323i.p331x.p332a;

import com.google.firebase.p156m.p159j.C4900f;

/* renamed from: e.f.a.b.i.x.a.f */
public final class C6608f {

    /* renamed from: a */
    private static final C6608f f18259a = new C6609a().mo19427a();

    /* renamed from: b */
    private final long f18260b;

    /* renamed from: c */
    private final long f18261c;

    /* renamed from: e.f.a.b.i.x.a.f$a */
    public static final class C6609a {

        /* renamed from: a */
        private long f18262a = 0;

        /* renamed from: b */
        private long f18263b = 0;

        C6609a() {
        }

        /* renamed from: a */
        public C6608f mo19427a() {
            return new C6608f(this.f18262a, this.f18263b);
        }

        /* renamed from: b */
        public C6609a mo19428b(long j) {
            this.f18263b = j;
            return this;
        }

        /* renamed from: c */
        public C6609a mo19429c(long j) {
            this.f18262a = j;
            return this;
        }
    }

    C6608f(long j, long j2) {
        this.f18260b = j;
        this.f18261c = j2;
    }

    /* renamed from: c */
    public static C6609a m25235c() {
        return new C6609a();
    }

    @C4900f(tag = 2)
    /* renamed from: a */
    public long mo19425a() {
        return this.f18261c;
    }

    @C4900f(tag = 1)
    /* renamed from: b */
    public long mo19426b() {
        return this.f18260b;
    }
}
