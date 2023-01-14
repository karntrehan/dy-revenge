package com.google.mlkit.vision.face.internal;

import android.content.Context;
import com.google.android.gms.common.C3631f;
import p174e.p319f.p320a.p335c.p345f.p356k.C7923la;
import p174e.p319f.p320a.p335c.p345f.p356k.C8066wa;
import p174e.p319f.p406d.p407a.p409c.C9599e;
import p174e.p319f.p406d.p407a.p409c.C9606i;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.e */
public final class C4977e extends C9599e<C9637e, C4980h> {

    /* renamed from: b */
    private final C9606i f13876b;

    public C4977e(C9606i iVar) {
        this.f13876b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14955a(Object obj) {
        C9637e eVar = (C9637e) obj;
        Context b = this.f13876b.mo24098b();
        C7923la b2 = C8066wa.m28280b(C4982j.m18901b());
        return new C4980h(C8066wa.m28280b(C4982j.m18901b()), eVar, (C4973a.m18881a(b) || C3631f.m14110h().mo11504b(b) >= 204500000) ? new C4973a(b, eVar, b2) : new C4985m(b, eVar, b2));
    }
}
