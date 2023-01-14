package com.google.android.gms.vision.face.mlkit;

import android.content.Context;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p357l.C8138bb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8192e8;
import p174e.p319f.p320a.p335c.p345f.p357l.C8230g8;
import p174e.p319f.p320a.p335c.p345f.p357l.C8507va;
import p174e.p319f.p320a.p335c.p345f.p357l.C8579za;

/* renamed from: com.google.android.gms.vision.face.mlkit.b */
final class C4131b {

    /* renamed from: a */
    private final C4133d f11484a;

    C4131b(Context context) {
        this.f11484a = new C4133d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12566a(C8579za zaVar, C8507va vaVar, List<C8138bb> list, long j) {
        this.f11484a.mo12569a(zaVar, C8230g8.EVENT_TYPE_INFERENCE, C8192e8.NO_ERROR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12567b(C8579za zaVar, String str, long j) {
        this.f11484a.mo12569a(zaVar, C8230g8.EVENT_TYPE_CREATE, str != null ? C8192e8.OPTIONAL_MODULE_CREATE_ERROR : C8192e8.NO_ERROR);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12568c(C8579za zaVar) {
        this.f11484a.mo12569a(zaVar, C8230g8.EVENT_TYPE_INIT, C8192e8.NO_ERROR);
    }
}
