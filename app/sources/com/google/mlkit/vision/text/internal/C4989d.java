package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import java.util.Arrays;
import java.util.List;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p358m.C8612c;
import p174e.p319f.p320a.p335c.p345f.p358m.C8727ka;
import p174e.p319f.p320a.p335c.p345f.p358m.C8806qb;
import p174e.p319f.p320a.p335c.p345f.p358m.C8847u0;
import p174e.p319f.p406d.p411b.p415d.C9641a;

/* renamed from: com.google.mlkit.vision.text.internal.d */
public final /* synthetic */ class C4989d implements C8806qb {

    /* renamed from: a */
    public static final /* synthetic */ C4989d f13913a = new C4989d();

    private /* synthetic */ C4989d() {
    }

    /* renamed from: a */
    public final Object mo15004a(Object obj) {
        C8727ka kaVar = (C8727ka) obj;
        List<Point> b = C4986a.m18913b(kaVar.f23853o);
        return new C9641a.C9643b(C8612c.m29392b(kaVar.f23856r) ? HttpUrl.FRAGMENT_ENCODE_SET : kaVar.f23856r, C4986a.m18912a(b), b, C8612c.m29392b(kaVar.f23858t) ? "und" : kaVar.f23858t, C8847u0.m29704a(Arrays.asList(kaVar.f23852f), C4990e.f13914a));
    }
}
