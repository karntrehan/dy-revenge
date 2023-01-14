package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4965c;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p356k.C7778a8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7826e4;
import p174e.p319f.p320a.p335c.p345f.p356k.C7854g6;
import p174e.p319f.p320a.p335c.p345f.p356k.C7882i8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7910ka;
import p174e.p319f.p320a.p335c.p345f.p356k.C7911kb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7923la;
import p174e.p319f.p320a.p335c.p345f.p356k.C7976pb;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.m */
final class C4985m implements C4974b {

    /* renamed from: a */
    private boolean f13897a;

    /* renamed from: b */
    private final Context f13898b;

    /* renamed from: c */
    private final C9637e f13899c;

    /* renamed from: d */
    private final int f13900d;

    /* renamed from: e */
    private final C7923la f13901e;

    /* renamed from: f */
    private C7882i8 f13902f;

    /* renamed from: g */
    private C7882i8 f13903g;

    C4985m(Context context, C9637e eVar, C7923la laVar) {
        this.f13898b = context;
        this.f13899c = eVar;
        this.f13900d = C3631f.m14110h().mo11504b(context);
        this.f13901e = laVar;
    }

    /* renamed from: a */
    static int m18905a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Invalid classification type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    static int m18906d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    private static int m18907e(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid mode type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    private final List<C9633a> m18908f(C7882i8 i8Var, C9631a aVar) {
        C7826e4[] e4VarArr;
        try {
            C7976pb pbVar = new C7976pb(aVar.mo24134k(), aVar.mo24130g(), 0, SystemClock.elapsedRealtime(), C4964b.m18857a(aVar.mo24133j()));
            if (aVar.mo24129f() != 35 || Build.VERSION.SDK_INT < 19 || this.f13900d < 201500000) {
                e4VarArr = i8Var.mo21397P0(C6636b.m25276Y(C4965c.m18859f().mo14977d(aVar, false)), pbVar);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) C3705r.m14346k(aVar.mo24132i());
                e4VarArr = i8Var.mo21398Q0(C6636b.m25276Y(planeArr[0].getBuffer()), C6636b.m25276Y(planeArr[1].getBuffer()), C6636b.m25276Y(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), pbVar);
            }
            ArrayList arrayList = new ArrayList();
            for (C7826e4 aVar2 : e4VarArr) {
                arrayList.add(new C9633a(aVar2));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C9585a("Failed to detect with legacy face detector", 13, e);
        }
    }

    /* renamed from: b */
    public final boolean mo14991b() {
        C7882i8 i0;
        if (this.f13902f != null || this.f13903g != null) {
            return false;
        }
        try {
            C7911kb j = C7910ka.m28056j(DynamiteModule.m14550d(this.f13898b, DynamiteModule.f10463a, "com.google.android.gms.vision.dynamite").mo11738c("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            C6634a Y = C6636b.m25276Y(this.f13898b);
            if (this.f13899c.mo24158c() == 2) {
                if (this.f13903g == null) {
                    this.f13903g = j.mo21423i0(Y, new C7854g6(2, 2, 0, true, false, this.f13899c.mo24156a()));
                }
                if ((this.f13899c.mo24159d() == 2 || this.f13899c.mo24157b() == 2 || this.f13899c.mo24160e() == 2) && this.f13902f == null) {
                    i0 = j.mo21423i0(Y, new C7854g6(m18907e(this.f13899c.mo24160e()), m18906d(this.f13899c.mo24159d()), m18905a(this.f13899c.mo24157b()), false, this.f13899c.mo24163g(), this.f13899c.mo24156a()));
                }
                if (this.f13902f == null && this.f13903g == null && !this.f13897a) {
                    Log.d("LegacyFaceDelegate", "Request face optional module download.");
                    C9610m.m32725a(this.f13898b, "barcode");
                    this.f13897a = true;
                }
                C4982j.m18902c(this.f13901e, false, C7778a8.NO_ERROR);
                return false;
            }
            if (this.f13902f == null) {
                i0 = j.mo21423i0(Y, new C7854g6(m18907e(this.f13899c.mo24160e()), m18906d(this.f13899c.mo24159d()), m18905a(this.f13899c.mo24157b()), false, this.f13899c.mo24163g(), this.f13899c.mo24156a()));
            }
            Log.d("LegacyFaceDelegate", "Request face optional module download.");
            C9610m.m32725a(this.f13898b, "barcode");
            this.f13897a = true;
            C4982j.m18902c(this.f13901e, false, C7778a8.NO_ERROR);
            return false;
            this.f13902f = i0;
            Log.d("LegacyFaceDelegate", "Request face optional module download.");
            C9610m.m32725a(this.f13898b, "barcode");
            this.f13897a = true;
            C4982j.m18902c(this.f13901e, false, C7778a8.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new C9585a("Failed to create legacy face detector.", 13, e);
        } catch (DynamiteModule.C3778a e2) {
            throw new C9585a("Failed to load deprecated vision dynamite module.", 13, e2);
        }
    }

    /* renamed from: c */
    public final Pair<List<C9633a>, List<C9633a>> mo14992c(C9631a aVar) {
        List<C9633a> list;
        if (this.f13902f == null && this.f13903g == null) {
            mo14991b();
        }
        C7882i8 i8Var = this.f13902f;
        if (i8Var == null && this.f13903g == null) {
            throw new C9585a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List<C9633a> list2 = null;
        if (i8Var != null) {
            list = m18908f(i8Var, aVar);
            if (!this.f13899c.mo24163g()) {
                C4980h.m18892j(list);
            }
        } else {
            list = null;
        }
        C7882i8 i8Var2 = this.f13903g;
        if (i8Var2 != null) {
            list2 = m18908f(i8Var2, aVar);
            C4980h.m18892j(list2);
        }
        return new Pair<>(list, list2);
    }

    public final void zzb() {
        C7882i8 i8Var = this.f13902f;
        if (i8Var != null) {
            try {
                i8Var.mo21399Y();
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.f13902f = null;
        }
        C7882i8 i8Var2 = this.f13903g;
        if (i8Var2 != null) {
            try {
                i8Var2.mo21399Y();
            } catch (RemoteException e2) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e2);
            }
            this.f13903g = null;
        }
    }
}
