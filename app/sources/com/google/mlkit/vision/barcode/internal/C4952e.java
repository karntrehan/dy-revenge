package com.google.mlkit.vision.barcode.internal;

import p174e.p319f.p320a.p335c.p345f.p354i.C7312kb;
import p174e.p319f.p406d.p407a.p409c.C9597d;
import p174e.p319f.p406d.p411b.p412a.C9627c;

/* renamed from: com.google.mlkit.vision.barcode.internal.e */
public final class C4952e {

    /* renamed from: a */
    private final C4953f f13812a;

    /* renamed from: b */
    private final C9597d f13813b;

    C4952e(C4953f fVar, C9597d dVar) {
        this.f13812a = fVar;
        this.f13813b = dVar;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl mo14954a(C9627c cVar) {
        return new BarcodeScannerImpl(cVar, (C4956i) this.f13812a.mo24093b(cVar), this.f13813b.mo24091a(cVar.mo24122b()), C7312kb.m27337b(C4949b.m18823d()));
    }
}
