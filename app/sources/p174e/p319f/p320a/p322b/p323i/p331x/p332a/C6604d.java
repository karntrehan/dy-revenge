package p174e.p319f.p320a.p322b.p323i.p331x.p332a;

import com.google.firebase.p156m.p159j.C4900f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.b.i.x.a.d */
public final class C6604d {

    /* renamed from: a */
    private static final C6604d f18249a = new C6605a().mo19417a();

    /* renamed from: b */
    private final String f18250b;

    /* renamed from: c */
    private final List<C6601c> f18251c;

    /* renamed from: e.f.a.b.i.x.a.d$a */
    public static final class C6605a {

        /* renamed from: a */
        private String f18252a = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: b */
        private List<C6601c> f18253b = new ArrayList();

        C6605a() {
        }

        /* renamed from: a */
        public C6604d mo19417a() {
            return new C6604d(this.f18252a, Collections.unmodifiableList(this.f18253b));
        }

        /* renamed from: b */
        public C6605a mo19418b(List<C6601c> list) {
            this.f18253b = list;
            return this;
        }

        /* renamed from: c */
        public C6605a mo19419c(String str) {
            this.f18252a = str;
            return this;
        }
    }

    C6604d(String str, List<C6601c> list) {
        this.f18250b = str;
        this.f18251c = list;
    }

    /* renamed from: c */
    public static C6605a m25223c() {
        return new C6605a();
    }

    @C4900f(tag = 2)
    /* renamed from: a */
    public List<C6601c> mo19415a() {
        return this.f18251c;
    }

    @C4900f(tag = 1)
    /* renamed from: b */
    public String mo19416b() {
        return this.f18250b;
    }
}
