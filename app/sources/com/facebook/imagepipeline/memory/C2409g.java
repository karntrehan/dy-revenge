package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.imagepipeline.memory.g */
class C2409g<V> {

    /* renamed from: a */
    public final int f7179a;

    /* renamed from: b */
    public final int f7180b;

    /* renamed from: c */
    final Queue f7181c;

    /* renamed from: d */
    private final boolean f7182d;

    /* renamed from: e */
    private int f7183e;

    public C2409g(int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        C6062k.m22841i(i > 0);
        C6062k.m22841i(i2 >= 0);
        C6062k.m22841i(i3 < 0 ? false : z2);
        this.f7179a = i;
        this.f7180b = i2;
        this.f7181c = new LinkedList();
        this.f7183e = i3;
        this.f7182d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8085a(V v) {
        this.f7181c.add(v);
    }

    /* renamed from: b */
    public void mo8126b() {
        C6062k.m22841i(this.f7183e > 0);
        this.f7183e--;
    }

    @Deprecated
    /* renamed from: c */
    public V mo8127c() {
        V g = mo8086g();
        if (g != null) {
            this.f7183e++;
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo8128d() {
        return this.f7181c.size();
    }

    /* renamed from: e */
    public void mo8129e() {
        this.f7183e++;
    }

    /* renamed from: f */
    public boolean mo8130f() {
        return this.f7183e + mo8128d() > this.f7180b;
    }

    /* renamed from: g */
    public V mo8086g() {
        return this.f7181c.poll();
    }

    /* renamed from: h */
    public void mo8131h(V v) {
        int i;
        C6062k.m22839g(v);
        boolean z = false;
        if (this.f7182d) {
            if (this.f7183e > 0) {
                z = true;
            }
            C6062k.m22841i(z);
            i = this.f7183e;
        } else {
            i = this.f7183e;
            if (i <= 0) {
                C6071a.m22877k("BUCKET", "Tried to release value %s from an empty bucket!", v);
                return;
            }
        }
        this.f7183e = i - 1;
        mo8085a(v);
    }
}
