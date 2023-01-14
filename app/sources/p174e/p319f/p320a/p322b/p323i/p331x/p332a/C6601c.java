package p174e.p319f.p320a.p322b.p323i.p331x.p332a;

import com.google.firebase.p156m.p159j.C4899e;
import com.google.firebase.p156m.p159j.C4900f;

/* renamed from: e.f.a.b.i.x.a.c */
public final class C6601c {

    /* renamed from: a */
    private static final C6601c f18235a = new C6602a().mo19412a();

    /* renamed from: b */
    private final long f18236b;

    /* renamed from: c */
    private final C6603b f18237c;

    /* renamed from: e.f.a.b.i.x.a.c$a */
    public static final class C6602a {

        /* renamed from: a */
        private long f18238a = 0;

        /* renamed from: b */
        private C6603b f18239b = C6603b.REASON_UNKNOWN;

        C6602a() {
        }

        /* renamed from: a */
        public C6601c mo19412a() {
            return new C6601c(this.f18238a, this.f18239b);
        }

        /* renamed from: b */
        public C6602a mo19413b(long j) {
            this.f18238a = j;
            return this;
        }

        /* renamed from: c */
        public C6602a mo19414c(C6603b bVar) {
            this.f18239b = bVar;
            return this;
        }
    }

    /* renamed from: e.f.a.b.i.x.a.c$b */
    public enum C6603b implements C4899e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: v */
        private final int f18248v;

        private C6603b(int i) {
            this.f18248v = i;
        }

        /* renamed from: d */
        public int mo14892d() {
            return this.f18248v;
        }
    }

    C6601c(long j, C6603b bVar) {
        this.f18236b = j;
        this.f18237c = bVar;
    }

    /* renamed from: c */
    public static C6602a m25216c() {
        return new C6602a();
    }

    @C4900f(tag = 1)
    /* renamed from: a */
    public long mo19410a() {
        return this.f18236b;
    }

    @C4900f(tag = 3)
    /* renamed from: b */
    public C6603b mo19411b() {
        return this.f18237c;
    }
}
