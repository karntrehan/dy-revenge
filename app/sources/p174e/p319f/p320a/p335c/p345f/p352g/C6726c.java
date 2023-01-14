package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.c */
public final class C6726c {

    /* renamed from: a */
    private C6709b f18408a;

    /* renamed from: b */
    private C6709b f18409b;

    /* renamed from: c */
    private final List f18410c;

    public C6726c() {
        this.f18408a = new C6709b(HttpUrl.FRAGMENT_ENCODE_SET, 0, (Map) null);
        this.f18409b = new C6709b(HttpUrl.FRAGMENT_ENCODE_SET, 0, (Map) null);
        this.f18410c = new ArrayList();
    }

    public C6726c(C6709b bVar) {
        this.f18408a = bVar;
        this.f18409b = bVar.clone();
        this.f18410c = new ArrayList();
    }

    /* renamed from: a */
    public final C6709b mo19586a() {
        return this.f18408a;
    }

    /* renamed from: b */
    public final C6709b mo19587b() {
        return this.f18409b;
    }

    /* renamed from: c */
    public final List mo19588c() {
        return this.f18410c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C6726c cVar = new C6726c(this.f18408a.clone());
        for (C6709b b : this.f18410c) {
            cVar.f18410c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo19590d(C6709b bVar) {
        this.f18408a = bVar;
        this.f18409b = bVar.clone();
        this.f18410c.clear();
    }

    /* renamed from: e */
    public final void mo19591e(String str, long j, Map map) {
        this.f18410c.add(new C6709b(str, j, map));
    }

    /* renamed from: f */
    public final void mo19592f(C6709b bVar) {
        this.f18409b = bVar;
    }
}
