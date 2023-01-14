package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: com.facebook.imagepipeline.memory.x */
public class C2431x implements C6082g {

    /* renamed from: f */
    private final int f7209f;

    /* renamed from: o */
    C6088a<C2428u> f7210o;

    public C2431x(C6088a<C2428u> aVar, int i) {
        C6062k.m22839g(aVar);
        C6062k.m22834b(Boolean.valueOf(i >= 0 && i <= aVar.mo18082w0().mo8054h()));
        this.f7210o = aVar.clone();
        this.f7209f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo8157a() {
        if (isClosed()) {
            throw new C6082g.C6083a();
        }
    }

    public synchronized void close() {
        C6088a.m22949v0(this.f7210o);
        this.f7210o = null;
    }

    public synchronized boolean isClosed() {
        return !C6088a.m22950z0(this.f7210o);
    }

    /* renamed from: j */
    public synchronized byte mo8160j(int i) {
        mo8157a();
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f7209f) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return this.f7210o.mo18082w0().mo8056j(i);
    }

    /* renamed from: k */
    public synchronized int mo8161k(int i, byte[] bArr, int i2, int i3) {
        mo8157a();
        C6062k.m22834b(Boolean.valueOf(i + i3 <= this.f7209f));
        return this.f7210o.mo18082w0().mo8057k(i, bArr, i2, i3);
    }

    public synchronized int size() {
        mo8157a();
        return this.f7209f;
    }
}
