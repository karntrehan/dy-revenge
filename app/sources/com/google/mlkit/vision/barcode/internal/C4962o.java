package com.google.mlkit.vision.barcode.internal;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4965c;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p354i.C7212e;
import p174e.p319f.p320a.p335c.p345f.p354i.C7242g;
import p174e.p319f.p320a.p335c.p345f.p354i.C7272i;
import p174e.p319f.p320a.p335c.p345f.p354i.C7300k;
import p174e.p319f.p320a.p335c.p345f.p354i.C7309k8;
import p174e.p319f.p320a.p335c.p345f.p354i.C7509yc;
import p174e.p319f.p320a.p335c.p345f.p354i.C7521za;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p412a.C9625a;
import p174e.p319f.p406d.p411b.p412a.C9627c;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.barcode.internal.o */
final class C4962o implements C4957j {

    /* renamed from: a */
    private boolean f13839a;

    /* renamed from: b */
    private final Context f13840b;

    /* renamed from: c */
    private final C7212e f13841c;

    /* renamed from: d */
    private final C7521za f13842d;

    /* renamed from: e */
    private C7242g f13843e;

    C4962o(Context context, C9627c cVar, C7521za zaVar) {
        C7212e eVar = new C7212e();
        this.f13841c = eVar;
        this.f13840b = context;
        eVar.f19251f = cVar.mo24121a();
        this.f13842d = zaVar;
    }

    /* renamed from: a */
    public final boolean mo14962a() {
        if (this.f13843e != null) {
            return false;
        }
        try {
            C7242g K = C7272i.m27311j(DynamiteModule.m14550d(this.f13840b, DynamiteModule.f10463a, "com.google.android.gms.vision.dynamite").mo11738c("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo20744K(C6636b.m25276Y(this.f13840b), this.f13841c);
            this.f13843e = K;
            if (K == null) {
                if (!this.f13839a) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    C9610m.m32725a(this.f13840b, "barcode");
                    this.f13839a = true;
                    C4949b.m18824e(this.f13842d, C7309k8.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C9585a("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
            }
            C4949b.m18824e(this.f13842d, C7309k8.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new C9585a("Failed to create legacy barcode detector.", 13, e);
        } catch (DynamiteModule.C3778a e2) {
            throw new C9585a("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    /* renamed from: c */
    public final List<C9625a> mo14963c(C9631a aVar) {
        C7509yc[] ycVarArr;
        C6634a Y;
        if (this.f13843e == null) {
            mo14962a();
        }
        C7242g gVar = this.f13843e;
        if (gVar != null) {
            C7242g gVar2 = (C7242g) C3705r.m14346k(gVar);
            C7300k kVar = new C7300k(aVar.mo24134k(), aVar.mo24130g(), 0, 0, C4964b.m18857a(aVar.mo24133j()));
            try {
                int f = aVar.mo24129f();
                if (f != -1) {
                    if (f != 17) {
                        if (f != 35) {
                            if (f == 842094169) {
                                Y = C6636b.m25276Y(C4965c.m18859f().mo14977d(aVar, false));
                            }
                        } else if (Build.VERSION.SDK_INT >= 19) {
                            Image.Plane[] planeArr = (Image.Plane[]) C3705r.m14346k(aVar.mo24132i());
                            kVar.f19444f = planeArr[0].getRowStride();
                            Y = C6636b.m25276Y(planeArr[0].getBuffer());
                        }
                        int f2 = aVar.mo24129f();
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Unsupported image format: ");
                        sb.append(f2);
                        throw new C9585a(sb.toString(), 3);
                    }
                    Y = C6636b.m25276Y(aVar.mo24128e());
                    ycVarArr = gVar2.mo20717P0(Y, kVar);
                } else {
                    ycVarArr = gVar2.mo20718Q0(C6636b.m25276Y(aVar.mo24127d()), kVar);
                }
                ArrayList arrayList = new ArrayList();
                for (C7509yc nVar : ycVarArr) {
                    arrayList.add(new C9625a(new C4961n(nVar)));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new C9585a("Failed to detect with legacy barcode detector", 13, e);
            }
        } else {
            throw new C9585a("Error initializing the legacy barcode scanner.", 14);
        }
    }

    public final void zzb() {
        C7242g gVar = this.f13843e;
        if (gVar != null) {
            try {
                gVar.mo20719Y();
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.f13843e = null;
        }
    }
}
