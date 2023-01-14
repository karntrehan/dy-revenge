package com.facebook.imagepipeline.producers;

import android.util.Pair;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.g */
public class C2482g extends C2491i0<Pair<C5999d, C6384b.C6387c>, C6088a<C6367b>> {

    /* renamed from: f */
    private final C6283f f7321f;

    public C2482g(C6283f fVar, C2529o0 o0Var) {
        super(o0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f7321f = fVar;
    }

    /* renamed from: l */
    public C6088a<C6367b> mo8274g(C6088a<C6367b> aVar) {
        return C6088a.m22948u0(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Pair<C5999d, C6384b.C6387c> mo8275j(C2531p0 p0Var) {
        return Pair.create(this.f7321f.mo18607a(p0Var.mo8240f(), p0Var.mo8237c()), p0Var.mo8252r());
    }
}
