package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.f0 */
public class C2478f0 extends C2473e0 {
    public C2478f0(Executor executor, C6084h hVar) {
        super(executor, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        return mo8261e(new FileInputStream(bVar.mo18937q().toString()), (int) bVar.mo18937q().length());
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "LocalFileFetchProducer";
    }
}
