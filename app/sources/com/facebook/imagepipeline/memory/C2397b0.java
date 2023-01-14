package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6096f;

/* renamed from: com.facebook.imagepipeline.memory.b0 */
class C2397b0<V> extends C2409g<V> {

    /* renamed from: f */
    private LinkedList<C6096f<V>> f7127f = new LinkedList<>();

    public C2397b0(int i, int i2, int i3) {
        super(i, i2, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8085a(V v) {
        C6096f poll = this.f7127f.poll();
        if (poll == null) {
            poll = new C6096f();
        }
        poll.mo18090c(v);
        this.f7181c.add(poll);
    }

    /* renamed from: g */
    public V mo8086g() {
        C6096f fVar = (C6096f) this.f7181c.poll();
        C6062k.m22839g(fVar);
        V b = fVar.mo18089b();
        fVar.mo18088a();
        this.f7127f.add(fVar);
        return b;
    }
}
