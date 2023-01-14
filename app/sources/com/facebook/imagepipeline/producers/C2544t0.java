package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: com.facebook.imagepipeline.producers.t0 */
public class C2544t0 extends C2473e0 {

    /* renamed from: c */
    private final ContentResolver f7490c;

    public C2544t0(Executor executor, C6084h hVar, ContentResolver contentResolver) {
        super(executor, hVar);
        this.f7490c = contentResolver;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C6369d mo8228d(C6384b bVar) {
        InputStream openInputStream = this.f7490c.openInputStream(bVar.mo18938r());
        C6062k.m22840h(openInputStream, "ContentResolver returned null InputStream");
        return mo8261e(openInputStream, -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo8229f() {
        return "QualifiedResourceFetchProducer";
    }
}
