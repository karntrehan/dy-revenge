package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4966d;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p354i.C7165ac;
import p174e.p319f.p320a.p335c.p345f.p354i.C7195cc;
import p174e.p319f.p320a.p335c.p345f.p354i.C7309k8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7313kc;
import p174e.p319f.p320a.p335c.p345f.p354i.C7355nc;
import p174e.p319f.p320a.p335c.p345f.p354i.C7453uc;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p174e.p319f.p406d.p411b.p412a.C9627c;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.barcode.internal.m */
final class C4960m implements C4957j {

    /* renamed from: a */
    private boolean f13831a;

    /* renamed from: b */
    private boolean f13832b;

    /* renamed from: c */
    private boolean f13833c;

    /* renamed from: d */
    private final Context f13834d;

    /* renamed from: e */
    private final C9627c f13835e;

    /* renamed from: f */
    private final C7521za f13836f;

    /* renamed from: g */
    private C7313kc f13837g;

    C4960m(Context context, C9627c cVar, C7521za zaVar) {
        this.f13834d = context;
        this.f13835e = cVar;
        this.f13836f = zaVar;
    }

    /* renamed from: b */
    static boolean m18844b(Context context) {
        return DynamiteModule.m14548a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    /* renamed from: a */
    public final boolean mo14962a() {
        if (this.f13837g != null) {
            return this.f13832b;
        }
        if (m18844b(this.f13834d)) {
            this.f13832b = true;
            try {
                this.f13837g = mo14970d(DynamiteModule.f10464b, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (DynamiteModule.C3778a e) {
                throw new C9585a("Failed to load the bundled barcode module.", 13, e);
            } catch (RemoteException e2) {
                throw new C9585a("Failed to create thick barcode scanner.", 13, e2);
            }
        } else {
            this.f13832b = false;
            try {
                this.f13837g = mo14970d(DynamiteModule.f10463a, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (DynamiteModule.C3778a unused) {
                if (!this.f13833c) {
                    C9610m.m32725a(this.f13834d, "barcode");
                    this.f13833c = true;
                }
                C4949b.m18824e(this.f13836f, C7309k8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C9585a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            } catch (RemoteException e3) {
                C4949b.m18824e(this.f13836f, C7309k8.OPTIONAL_MODULE_INIT_ERROR);
                throw new C9585a("Failed to create thin barcode scanner.", 13, e3);
            }
        }
        C4949b.m18824e(this.f13836f, C7309k8.NO_ERROR);
        return this.f13832b;
    }

    /* renamed from: c */
    public final List<C9625a> mo14963c(C9631a aVar) {
        if (this.f13837g == null) {
            mo14962a();
        }
        C7313kc kcVar = (C7313kc) C3705r.m14346k(this.f13837g);
        if (!this.f13831a) {
            try {
                kcVar.mo20796c();
                this.f13831a = true;
            } catch (RemoteException e) {
                throw new C9585a("Failed to init barcode scanner.", 13, e);
            }
        }
        int k = aVar.mo24134k();
        if (aVar.mo24129f() == 35 && Build.VERSION.SDK_INT >= 19) {
            k = ((Image.Plane[]) C3705r.m14346k(aVar.mo24132i()))[0].getRowStride();
        }
        try {
            List<C7165ac> Y = kcVar.mo20795Y(C4966d.m18871b().mo14981a(aVar), new C7453uc(aVar.mo24129f(), k, aVar.mo24130g(), C4964b.m18857a(aVar.mo24133j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (C7165ac lVar : Y) {
                arrayList.add(new C9625a(new C4959l(lVar)));
            }
            return arrayList;
        } catch (RemoteException e2) {
            throw new C9585a("Failed to run barcode scanner.", 13, e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C7313kc mo14970d(DynamiteModule.C3779b bVar, String str, String str2) {
        return C7355nc.m27382j(DynamiteModule.m14550d(this.f13834d, bVar, str).mo11738c(str2)).mo20812a0(C6636b.m25276Y(this.f13834d), new C7195cc(this.f13835e.mo24121a()));
    }

    public final void zzb() {
        C7313kc kcVar = this.f13837g;
        if (kcVar != null) {
            try {
                kcVar.mo20794P0();
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.f13837g = null;
            this.f13831a = false;
        }
    }
}
