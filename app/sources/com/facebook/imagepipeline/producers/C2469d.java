package com.facebook.imagepipeline.producers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174e.p247e.p253d.p257d.C6056h;
import p174e.p247e.p294k.p301e.C6315d;
import p174e.p247e.p294k.p302f.C6335j;
import p174e.p247e.p294k.p307k.C6370e;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.d */
public class C2469d implements C2531p0 {

    /* renamed from: a */
    public static final Set<String> f7284a = C6056h.m22823g("id", "uri_source");

    /* renamed from: b */
    private final C6384b f7285b;

    /* renamed from: c */
    private final String f7286c;

    /* renamed from: d */
    private final String f7287d;

    /* renamed from: e */
    private final C2539r0 f7288e;

    /* renamed from: f */
    private final Object f7289f;

    /* renamed from: g */
    private final C6384b.C6387c f7290g;

    /* renamed from: h */
    private final Map<String, Object> f7291h;

    /* renamed from: i */
    private boolean f7292i;

    /* renamed from: j */
    private C6315d f7293j;

    /* renamed from: k */
    private boolean f7294k;

    /* renamed from: l */
    private boolean f7295l;

    /* renamed from: m */
    private final List<C2535q0> f7296m;

    /* renamed from: n */
    private final C6335j f7297n;

    /* renamed from: o */
    private C6370e f7298o;

    public C2469d(C6384b bVar, String str, C2539r0 r0Var, Object obj, C6384b.C6387c cVar, boolean z, boolean z2, C6315d dVar, C6335j jVar) {
        this(bVar, str, (String) null, r0Var, obj, cVar, z, z2, dVar, jVar);
    }

    public C2469d(C6384b bVar, String str, String str2, C2539r0 r0Var, Object obj, C6384b.C6387c cVar, boolean z, boolean z2, C6315d dVar, C6335j jVar) {
        this.f7298o = C6370e.NOT_SET;
        this.f7285b = bVar;
        this.f7286c = str;
        HashMap hashMap = new HashMap();
        this.f7291h = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", bVar == null ? "null-request" : bVar.mo18938r());
        this.f7287d = str2;
        this.f7288e = r0Var;
        this.f7289f = obj;
        this.f7290g = cVar;
        this.f7292i = z;
        this.f7293j = dVar;
        this.f7294k = z2;
        this.f7295l = false;
        this.f7296m = new ArrayList();
        this.f7297n = jVar;
    }

    /* renamed from: s */
    public static void m10249s(List<C2535q0> list) {
        if (list != null) {
            for (C2535q0 a : list) {
                a.mo8208a();
            }
        }
    }

    /* renamed from: t */
    public static void m10250t(List<C2535q0> list) {
        if (list != null) {
            for (C2535q0 b : list) {
                b.mo8257b();
            }
        }
    }

    /* renamed from: u */
    public static void m10251u(List<C2535q0> list) {
        if (list != null) {
            for (C2535q0 d : list) {
                d.mo8259d();
            }
        }
    }

    /* renamed from: v */
    public static void m10252v(List<C2535q0> list) {
        if (list != null) {
            for (C2535q0 c : list) {
                c.mo8258c();
            }
        }
    }

    /* renamed from: A */
    public synchronized List<C2535q0> mo8234A(C6315d dVar) {
        if (dVar == this.f7293j) {
            return null;
        }
        this.f7293j = dVar;
        return new ArrayList(this.f7296m);
    }

    /* renamed from: a */
    public String mo8235a() {
        return this.f7286c;
    }

    /* renamed from: b */
    public Map<String, Object> mo8236b() {
        return this.f7291h;
    }

    /* renamed from: c */
    public Object mo8237c() {
        return this.f7289f;
    }

    /* renamed from: d */
    public synchronized C6315d mo8238d() {
        return this.f7293j;
    }

    /* renamed from: e */
    public void mo8239e(String str, Object obj) {
        if (!f7284a.contains(str)) {
            this.f7291h.put(str, obj);
        }
    }

    /* renamed from: f */
    public C6384b mo8240f() {
        return this.f7285b;
    }

    /* renamed from: g */
    public void mo8241g(C2535q0 q0Var) {
        boolean z;
        synchronized (this) {
            this.f7296m.add(q0Var);
            z = this.f7295l;
        }
        if (z) {
            q0Var.mo8208a();
        }
    }

    /* renamed from: h */
    public C6335j mo8242h() {
        return this.f7297n;
    }

    /* renamed from: i */
    public void mo8243i(C6370e eVar) {
        this.f7298o = eVar;
    }

    /* renamed from: j */
    public void mo8244j(String str, String str2) {
        this.f7291h.put("origin", str);
        this.f7291h.put("origin_sub", str2);
    }

    /* renamed from: k */
    public void mo8245k(Map<String, ?> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                mo8239e((String) next.getKey(), next.getValue());
            }
        }
    }

    /* renamed from: l */
    public synchronized boolean mo8246l() {
        return this.f7292i;
    }

    /* renamed from: m */
    public <T> T mo8247m(String str) {
        return this.f7291h.get(str);
    }

    /* renamed from: n */
    public String mo8248n() {
        return this.f7287d;
    }

    /* renamed from: o */
    public void mo8249o(String str) {
        mo8244j(str, "default");
    }

    /* renamed from: p */
    public C2539r0 mo8250p() {
        return this.f7288e;
    }

    /* renamed from: q */
    public synchronized boolean mo8251q() {
        return this.f7294k;
    }

    /* renamed from: r */
    public C6384b.C6387c mo8252r() {
        return this.f7290g;
    }

    /* renamed from: w */
    public void mo8253w() {
        m10249s(mo8254x());
    }

    /* renamed from: x */
    public synchronized List<C2535q0> mo8254x() {
        if (this.f7295l) {
            return null;
        }
        this.f7295l = true;
        return new ArrayList(this.f7296m);
    }

    /* renamed from: y */
    public synchronized List<C2535q0> mo8255y(boolean z) {
        if (z == this.f7294k) {
            return null;
        }
        this.f7294k = z;
        return new ArrayList(this.f7296m);
    }

    /* renamed from: z */
    public synchronized List<C2535q0> mo8256z(boolean z) {
        if (z == this.f7292i) {
            return null;
        }
        this.f7292i = z;
        return new ArrayList(this.f7296m);
    }
}
