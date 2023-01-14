package com.facebook.imagepipeline.producers;

import android.util.Pair;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.s */
public class C2540s extends C2491i0<Pair<C5999d, C6384b.C6387c>, C6369d> {

    /* renamed from: f */
    private final C6283f f7482f;

    public C2540s(C6283f fVar, boolean z, C2529o0 o0Var) {
        super(o0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z);
        this.f7482f = fVar;
    }

    /* renamed from: l */
    public C6369d mo8274g(C6369d dVar) {
        return C6369d.m24308b(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Pair<C5999d, C6384b.C6387c> mo8275j(C2531p0 p0Var) {
        return Pair.create(this.f7482f.mo18610d(p0Var.mo8240f(), p0Var.mo8237c()), p0Var.mo8252r());
    }
}
