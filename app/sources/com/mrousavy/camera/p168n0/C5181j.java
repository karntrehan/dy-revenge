package com.mrousavy.camera.p168n0;

import androidx.camera.core.C0693h2;
import androidx.camera.core.C0709i2;
import androidx.camera.core.ImageProxy;
import p455g.C10315m;
import p455g.C10318n;
import p455g.p462v.C10376d;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.j */
public final class C5181j extends C0693h2.C0705i {

    /* renamed from: a */
    final /* synthetic */ C10376d<ImageProxy> f14661a;

    public C5181j(C10376d<? super ImageProxy> dVar) {
        this.f14661a = dVar;
    }

    /* renamed from: a */
    public void mo2786a(ImageProxy imageProxy) {
        C10457l.m35320e(imageProxy, "image");
        super.mo2786a(imageProxy);
        C10376d<ImageProxy> dVar = this.f14661a;
        C10315m.C10316a aVar = C10315m.f27541f;
        dVar.mo25782d(C10315m.m35012a(imageProxy));
    }

    /* renamed from: b */
    public void mo2787b(C0709i2 i2Var) {
        C10457l.m35320e(i2Var, "exception");
        super.mo2787b(i2Var);
        C10376d<ImageProxy> dVar = this.f14661a;
        C10315m.C10316a aVar = C10315m.f27541f;
        dVar.mo25782d(C10315m.m35012a(C10318n.m35016a(i2Var)));
    }
}
