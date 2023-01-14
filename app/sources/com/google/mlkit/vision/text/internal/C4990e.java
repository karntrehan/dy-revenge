package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p358m.C8612c;
import p174e.p319f.p320a.p335c.p345f.p358m.C8767nb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8806qb;
import p174e.p319f.p406d.p411b.p415d.C9641a;

/* renamed from: com.google.mlkit.vision.text.internal.e */
public final /* synthetic */ class C4990e implements C8806qb {

    /* renamed from: a */
    public static final /* synthetic */ C4990e f13914a = new C4990e();

    private /* synthetic */ C4990e() {
    }

    /* renamed from: a */
    public final Object mo15004a(Object obj) {
        C8767nb nbVar = (C8767nb) obj;
        List<Point> b = C4986a.m18913b(nbVar.f23951o);
        return new C9641a.C9642a(C8612c.m29392b(nbVar.f23953q) ? HttpUrl.FRAGMENT_ENCODE_SET : nbVar.f23953q, C4986a.m18912a(b), b, C8612c.m29392b(nbVar.f23955s) ? "und" : nbVar.f23955s);
    }
}
