package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import com.google.android.gms.common.C3631f;
import p174e.p319f.p320a.p335c.p345f.p354i.C7312kb;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p406d.p407a.p409c.C9599e;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p412a.C9627c;

/* renamed from: com.google.mlkit.vision.barcode.internal.f */
public final class C4953f extends C9599e<C9627c, C4956i> {

    /* renamed from: b */
    private final C9606i f13814b;

    public C4953f(C9606i iVar) {
        this.f13814b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14955a(Object obj) {
        C9627c cVar = (C9627c) obj;
        Context b = this.f13814b.mo24098b();
        C7521za b2 = C7312kb.m27337b(C4949b.m18823d());
        return new C4956i(this.f13814b, cVar, (C4960m.m18844b(b) || C3631f.m14110h().mo11504b(b) >= 204500000) ? new C4960m(b, cVar, b2) : new C4962o(b, cVar, b2), b2);
    }
}
