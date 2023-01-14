package com.google.mlkit.vision.face.internal;

import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p345f.p356k.C7778a8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7791b8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7855g7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7881i7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7894j7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7907k7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7920l7;
import p174e.p319f.p320a.p335c.p345f.p356k.C7923la;
import p174e.p319f.p320a.p335c.p345f.p356k.C7933m7;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.j */
public final class C4982j {

    /* renamed from: a */
    static final AtomicReference<String> f13894a = new AtomicReference<>();

    /* renamed from: a */
    public static C7933m7 m18900a(C9637e eVar) {
        C7855g7 g7Var = new C7855g7();
        int d = eVar.mo24159d();
        g7Var.mo21359d(d != 1 ? d != 2 ? C7907k7.UNKNOWN_LANDMARKS : C7907k7.ALL_LANDMARKS : C7907k7.NO_LANDMARKS);
        int b = eVar.mo24157b();
        g7Var.mo21356a(b != 1 ? b != 2 ? C7881i7.UNKNOWN_CLASSIFICATIONS : C7881i7.ALL_CLASSIFICATIONS : C7881i7.NO_CLASSIFICATIONS);
        int e = eVar.mo24160e();
        g7Var.mo21361f(e != 1 ? e != 2 ? C7920l7.UNKNOWN_PERFORMANCE : C7920l7.ACCURATE : C7920l7.FAST);
        int c = eVar.mo24158c();
        g7Var.mo21357b(c != 1 ? c != 2 ? C7894j7.UNKNOWN_CONTOURS : C7894j7.ALL_CONTOURS : C7894j7.NO_CONTOURS);
        g7Var.mo21358c(Boolean.valueOf(eVar.mo24163g()));
        g7Var.mo21360e(Float.valueOf(eVar.mo24156a()));
        return g7Var.mo21362k();
    }

    /* renamed from: b */
    public static String m18901b() {
        AtomicReference<String> atomicReference = f13894a;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        String str = true != C4973a.m18881a(C9606i.m32708c().mo24098b()) ? "play-services-mlkit-face-detection" : "face-detection";
        atomicReference.set(str);
        return str;
    }

    /* renamed from: c */
    public static void m18902c(C7923la laVar, boolean z, C7778a8 a8Var) {
        laVar.mo21441b(new C4981i(z, a8Var), C7791b8.ON_DEVICE_FACE_LOAD);
    }
}
