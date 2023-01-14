package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6078c;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p261h.C6098h;

/* renamed from: com.facebook.imagepipeline.memory.q */
public class C2422q {

    /* renamed from: a */
    private final C6098h<byte[]> f7197a;

    /* renamed from: b */
    final C2424b f7198b;

    /* renamed from: com.facebook.imagepipeline.memory.q$a */
    class C2423a implements C6098h<byte[]> {
        C2423a() {
        }

        /* renamed from: b */
        public void mo8068a(byte[] bArr) {
            C2422q.this.mo8146b(bArr);
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.q$b */
    static class C2424b extends C2425r {
        public C2424b(C6078c cVar, C2408f0 f0Var, C2410g0 g0Var) {
            super(cVar, f0Var, g0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public C2409g<byte[]> mo8080w(int i) {
            return new C2397b0(mo8075o(i), this.f7117c.f7178g, 0);
        }
    }

    public C2422q(C6078c cVar, C2408f0 f0Var) {
        C6062k.m22834b(Boolean.valueOf(f0Var.f7178g > 0));
        this.f7198b = new C2424b(cVar, f0Var, C2392a0.m9923h());
        this.f7197a = new C2423a();
    }

    /* renamed from: a */
    public C6088a<byte[]> mo8145a(int i) {
        return C6088a.m22942C0(this.f7198b.get(i), this.f7197a);
    }

    /* renamed from: b */
    public void mo8146b(byte[] bArr) {
        this.f7198b.mo8068a(bArr);
    }
}
