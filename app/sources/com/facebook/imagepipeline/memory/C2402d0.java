package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p260g.C6078c;
import p174e.p247e.p253d.p260g.C6079d;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: com.facebook.imagepipeline.memory.d0 */
public class C2402d0 {

    /* renamed from: a */
    private final C2408f0 f7137a;

    /* renamed from: b */
    private final C2410g0 f7138b;

    /* renamed from: c */
    private final C2408f0 f7139c;

    /* renamed from: d */
    private final C6078c f7140d;

    /* renamed from: e */
    private final C2408f0 f7141e;

    /* renamed from: f */
    private final C2410g0 f7142f;

    /* renamed from: g */
    private final C2408f0 f7143g;

    /* renamed from: h */
    private final C2410g0 f7144h;

    /* renamed from: i */
    private final String f7145i;

    /* renamed from: j */
    private final int f7146j;

    /* renamed from: k */
    private final int f7147k;

    /* renamed from: l */
    private final boolean f7148l;

    /* renamed from: m */
    private final boolean f7149m;

    /* renamed from: com.facebook.imagepipeline.memory.d0$b */
    public static class C2404b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2408f0 f7150a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C2410g0 f7151b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2408f0 f7152c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C6078c f7153d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2408f0 f7154e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2410g0 f7155f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C2408f0 f7156g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2410g0 f7157h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f7158i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f7159j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f7160k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f7161l;

        /* renamed from: m */
        public boolean f7162m;

        private C2404b() {
        }

        /* renamed from: m */
        public C2402d0 mo8112m() {
            return new C2402d0(this);
        }
    }

    private C2402d0(C2404b bVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("PoolConfig()");
        }
        this.f7137a = bVar.f7150a == null ? C2416k.m10056a() : bVar.f7150a;
        this.f7138b = bVar.f7151b == null ? C2392a0.m9923h() : bVar.f7151b;
        this.f7139c = bVar.f7152c == null ? C2418m.m10060b() : bVar.f7152c;
        this.f7140d = bVar.f7153d == null ? C6079d.m22926b() : bVar.f7153d;
        this.f7141e = bVar.f7154e == null ? C2419n.m10061a() : bVar.f7154e;
        this.f7142f = bVar.f7155f == null ? C2392a0.m9923h() : bVar.f7155f;
        this.f7143g = bVar.f7156g == null ? C2417l.m10058a() : bVar.f7156g;
        this.f7144h = bVar.f7157h == null ? C2392a0.m9923h() : bVar.f7157h;
        this.f7145i = bVar.f7158i == null ? "legacy" : bVar.f7158i;
        this.f7146j = bVar.f7159j;
        this.f7147k = bVar.f7160k > 0 ? bVar.f7160k : 4194304;
        this.f7148l = bVar.f7161l;
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        this.f7149m = bVar.f7162m;
    }

    /* renamed from: n */
    public static C2404b m9970n() {
        return new C2404b();
    }

    /* renamed from: a */
    public int mo8099a() {
        return this.f7147k;
    }

    /* renamed from: b */
    public int mo8100b() {
        return this.f7146j;
    }

    /* renamed from: c */
    public C2408f0 mo8101c() {
        return this.f7137a;
    }

    /* renamed from: d */
    public C2410g0 mo8102d() {
        return this.f7138b;
    }

    /* renamed from: e */
    public String mo8103e() {
        return this.f7145i;
    }

    /* renamed from: f */
    public C2408f0 mo8104f() {
        return this.f7139c;
    }

    /* renamed from: g */
    public C2408f0 mo8105g() {
        return this.f7141e;
    }

    /* renamed from: h */
    public C2410g0 mo8106h() {
        return this.f7142f;
    }

    /* renamed from: i */
    public C6078c mo8107i() {
        return this.f7140d;
    }

    /* renamed from: j */
    public C2408f0 mo8108j() {
        return this.f7143g;
    }

    /* renamed from: k */
    public C2410g0 mo8109k() {
        return this.f7144h;
    }

    /* renamed from: l */
    public boolean mo8110l() {
        return this.f7149m;
    }

    /* renamed from: m */
    public boolean mo8111m() {
        return this.f7148l;
    }
}
