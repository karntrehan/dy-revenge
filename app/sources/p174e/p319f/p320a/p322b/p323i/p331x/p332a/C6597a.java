package p174e.p319f.p320a.p322b.p323i.p331x.p332a;

import com.google.firebase.p156m.p159j.C4900f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.p323i.C6578m;

/* renamed from: e.f.a.b.i.x.a.a */
public final class C6597a {

    /* renamed from: a */
    private static final C6597a f18223a = new C6598a().mo19403b();

    /* renamed from: b */
    private final C6608f f18224b;

    /* renamed from: c */
    private final List<C6604d> f18225c;

    /* renamed from: d */
    private final C6599b f18226d;

    /* renamed from: e */
    private final String f18227e;

    /* renamed from: e.f.a.b.i.x.a.a$a */
    public static final class C6598a {

        /* renamed from: a */
        private C6608f f18228a = null;

        /* renamed from: b */
        private List<C6604d> f18229b = new ArrayList();

        /* renamed from: c */
        private C6599b f18230c = null;

        /* renamed from: d */
        private String f18231d = HttpUrl.FRAGMENT_ENCODE_SET;

        C6598a() {
        }

        /* renamed from: a */
        public C6598a mo19402a(C6604d dVar) {
            this.f18229b.add(dVar);
            return this;
        }

        /* renamed from: b */
        public C6597a mo19403b() {
            return new C6597a(this.f18228a, Collections.unmodifiableList(this.f18229b), this.f18230c, this.f18231d);
        }

        /* renamed from: c */
        public C6598a mo19404c(String str) {
            this.f18231d = str;
            return this;
        }

        /* renamed from: d */
        public C6598a mo19405d(C6599b bVar) {
            this.f18230c = bVar;
            return this;
        }

        /* renamed from: e */
        public C6598a mo19406e(C6608f fVar) {
            this.f18228a = fVar;
            return this;
        }
    }

    C6597a(C6608f fVar, List<C6604d> list, C6599b bVar, String str) {
        this.f18224b = fVar;
        this.f18225c = list;
        this.f18226d = bVar;
        this.f18227e = str;
    }

    /* renamed from: e */
    public static C6598a m25201e() {
        return new C6598a();
    }

    @C4900f(tag = 4)
    /* renamed from: a */
    public String mo19397a() {
        return this.f18227e;
    }

    @C4900f(tag = 3)
    /* renamed from: b */
    public C6599b mo19398b() {
        return this.f18226d;
    }

    @C4900f(tag = 2)
    /* renamed from: c */
    public List<C6604d> mo19399c() {
        return this.f18225c;
    }

    @C4900f(tag = 1)
    /* renamed from: d */
    public C6608f mo19400d() {
        return this.f18224b;
    }

    /* renamed from: f */
    public byte[] mo19401f() {
        return C6578m.m25150a(this);
    }
}
