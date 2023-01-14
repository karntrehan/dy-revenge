package p174e.p199d.p218c.p246z;

import java.util.ArrayList;
import okhttp3.HttpUrl;

/* renamed from: e.d.c.z.k */
public class C5991k {

    /* renamed from: a */
    private final ArrayList<C5983c> f16564a;

    /* renamed from: b */
    private final String f16565b;

    public C5991k() {
        this(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public C5991k(String str) {
        this.f16564a = new ArrayList<>();
        this.f16565b = str;
    }

    /* renamed from: a */
    public void mo17900a(C5983c cVar) {
        this.f16564a.add(cVar);
    }

    /* renamed from: b */
    public Iterable<C5983c> mo17901b() {
        return this.f16564a;
    }

    /* renamed from: c */
    public String mo17902c() {
        return this.f16565b;
    }

    /* renamed from: d */
    public int mo17903d() {
        return this.f16564a.size();
    }
}
