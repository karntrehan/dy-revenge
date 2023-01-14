package com.google.mlkit.vision.barcode.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.List;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p354i.C7162a9;
import p174e.p319f.p320a.p335c.p345f.p354i.C7194cb;
import p174e.p319f.p320a.p335c.p345f.p354i.C7323l8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7351n8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7519z8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p174e.p319f.p406d.p411b.p412a.C9626b;
import p174e.p319f.p406d.p411b.p412a.C9627c;
import p174e.p319f.p406d.p411b.p413b.C9631a;

public class BarcodeScannerImpl extends MobileVisionBase<List<C9625a>> implements C9626b {

    /* renamed from: t */
    private static final C9627c f13804t = new C9627c.C9628a().mo24125a();

    BarcodeScannerImpl(C9627c cVar, C4956i iVar, Executor executor, C7521za zaVar) {
        super(iVar, executor);
        C7519z8 z8Var = new C7519z8();
        z8Var.mo21029i(C4949b.m18822c(cVar));
        C7162a9 j = z8Var.mo21030j();
        C7351n8 n8Var = new C7351n8();
        n8Var.mo20820f(j);
        zaVar.mo21033d(C7194cb.m27198e(n8Var, 1), C7323l8.ON_DEVICE_BARCODE_CREATE);
    }

    /* renamed from: f */
    public final C8963l<List<C9625a>> mo14952f(@RecentlyNonNull C9631a aVar) {
        return super.mo14971a(aVar);
    }
}
