package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import p174e.p319f.p320a.p335c.p345f.p357l.C8192e8;
import p174e.p319f.p320a.p335c.p345f.p357l.C8194ea;
import p174e.p319f.p320a.p335c.p345f.p357l.C8211f8;
import p174e.p319f.p320a.p335c.p345f.p357l.C8213fa;
import p174e.p319f.p320a.p335c.p345f.p357l.C8230g8;
import p174e.p319f.p320a.p335c.p345f.p357l.C8308ka;
import p174e.p319f.p320a.p335c.p345f.p357l.C8579za;
import p174e.p319f.p406d.p407a.p409c.C9611n;

/* renamed from: com.google.android.gms.vision.face.mlkit.d */
final class C4133d {

    /* renamed from: a */
    private final C8308ka f11488a;

    C4133d(Context context) {
        C8194ea c = C8194ea.m28459d("optional-module-face").mo21685c();
        this.f11488a = new C8308ka(context, new C9611n(context), new C8213fa(context, c), c.mo21705b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12569a(C8579za zaVar, C8230g8 g8Var, C8192e8 e8Var) {
        this.f11488a.mo21924b(new C4132c(zaVar, g8Var, e8Var), C8211f8.OPTIONAL_MODULE_FACE_DETECTION);
    }
}
