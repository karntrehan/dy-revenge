package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6086j;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: com.facebook.imagepipeline.memory.z */
public class C2433z extends C6086j {

    /* renamed from: f */
    private final C2429v f7213f;

    /* renamed from: o */
    private C6088a<C2428u> f7214o;

    /* renamed from: p */
    private int f7215p;

    /* renamed from: com.facebook.imagepipeline.memory.z$a */
    public static class C2434a extends RuntimeException {
        public C2434a() {
            super("OutputStream no longer valid");
        }
    }

    public C2433z(C2429v vVar) {
        this(vVar, vVar.mo8155C());
    }

    public C2433z(C2429v vVar, int i) {
        C6062k.m22834b(Boolean.valueOf(i > 0));
        C2429v vVar2 = (C2429v) C6062k.m22839g(vVar);
        this.f7213f = vVar2;
        this.f7215p = 0;
        this.f7214o = C6088a.m22942C0(vVar2.get(i), vVar2);
    }

    /* renamed from: b */
    private void m10126b() {
        if (!C6088a.m22950z0(this.f7214o)) {
            throw new C2434a();
        }
    }

    public void close() {
        C6088a.m22949v0(this.f7214o);
        this.f7214o = null;
        this.f7215p = -1;
        super.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8176h(int i) {
        m10126b();
        C6062k.m22839g(this.f7214o);
        if (i > this.f7214o.mo18082w0().mo8054h()) {
            C2428u uVar = (C2428u) this.f7213f.get(i);
            C6062k.m22839g(this.f7214o);
            this.f7214o.mo18082w0().mo8050b(0, uVar, 0, this.f7215p);
            this.f7214o.close();
            this.f7214o = C6088a.m22942C0(uVar, this.f7213f);
        }
    }

    /* renamed from: o */
    public C2431x mo8174a() {
        m10126b();
        return new C2431x((C6088a) C6062k.m22839g(this.f7214o), this.f7215p);
    }

    public int size() {
        return this.f7215p;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        m10126b();
        mo8176h(this.f7215p + i2);
        ((C2428u) ((C6088a) C6062k.m22839g(this.f7214o)).mo18082w0()).mo8058o(this.f7215p, bArr, i, i2);
        this.f7215p += i2;
    }
}
