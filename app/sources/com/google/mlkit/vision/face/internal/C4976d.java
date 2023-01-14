package com.google.mlkit.vision.face.internal;

import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p406d.p407a.p409c.C9597d;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.d */
public final class C4976d {

    /* renamed from: a */
    private final C4977e f13874a;

    /* renamed from: b */
    private final C9597d f13875b;

    C4976d(C4977e eVar, C9597d dVar) {
        this.f13874a = eVar;
        this.f13875b = dVar;
    }

    /* renamed from: a */
    public final FaceDetectorImpl mo14995a(C9637e eVar) {
        C3705r.m14347l(eVar, "You must provide a valid FaceDetectorOptions.");
        return new FaceDetectorImpl((C4980h) this.f13874a.mo24093b(eVar), this.f13875b, eVar, (C4975c) null);
    }
}
