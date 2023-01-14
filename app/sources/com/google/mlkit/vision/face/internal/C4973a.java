package com.google.mlkit.vision.face.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4965c;
import com.google.mlkit.vision.common.internal.C4966d;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p356k.C7778a8;
import p174e.p319f.p320a.p335c.p345f.p356k.C7807cb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7833eb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7859gb;
import p174e.p319f.p320a.p335c.p345f.p356k.C7885ib;
import p174e.p319f.p320a.p335c.p345f.p356k.C7923la;
import p174e.p319f.p320a.p335c.p345f.p356k.C8092ya;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9637e;

/* renamed from: com.google.mlkit.vision.face.internal.a */
final class C4973a implements C4974b {

    /* renamed from: a */
    private final Context f13866a;

    /* renamed from: b */
    private final C9637e f13867b;

    /* renamed from: c */
    private boolean f13868c;

    /* renamed from: d */
    private boolean f13869d;

    /* renamed from: e */
    private boolean f13870e;

    /* renamed from: f */
    private final C7923la f13871f;

    /* renamed from: g */
    private C7859gb f13872g;

    /* renamed from: h */
    private C7859gb f13873h;

    C4973a(Context context, C9637e eVar, C7923la laVar) {
        this.f13866a = context;
        this.f13867b = eVar;
        this.f13871f = laVar;
    }

    /* renamed from: a */
    static boolean m18881a(Context context) {
        return DynamiteModule.m14548a(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    /* renamed from: e */
    private final void m18882e() {
        C7807cb cbVar;
        if (this.f13867b.mo24158c() == 2) {
            if (this.f13872g == null) {
                this.f13872g = m18883f(new C7807cb(this.f13867b.mo24160e(), 1, 1, 2, false, this.f13867b.mo24156a()));
            }
            if ((this.f13867b.mo24159d() == 2 || this.f13867b.mo24157b() == 2 || this.f13867b.mo24160e() == 2) && this.f13873h == null) {
                cbVar = new C7807cb(this.f13867b.mo24160e(), this.f13867b.mo24159d(), this.f13867b.mo24157b(), 1, this.f13867b.mo24163g(), this.f13867b.mo24156a());
            } else {
                return;
            }
        } else if (this.f13873h == null) {
            cbVar = new C7807cb(this.f13867b.mo24160e(), this.f13867b.mo24159d(), this.f13867b.mo24157b(), 1, this.f13867b.mo24163g(), this.f13867b.mo24156a());
        } else {
            return;
        }
        this.f13873h = m18883f(cbVar);
    }

    /* renamed from: f */
    private final C7859gb m18883f(C7807cb cbVar) {
        DynamiteModule.C3779b bVar;
        String str;
        if (this.f13869d) {
            bVar = DynamiteModule.f10464b;
            str = ModuleDescriptor.MODULE_ID;
        } else {
            bVar = DynamiteModule.f10463a;
            str = "com.google.android.gms.vision.face";
        }
        return mo14993d(bVar, str, "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", cbVar);
    }

    /* renamed from: g */
    private static List<C9633a> m18884g(C7859gb gbVar, C9631a aVar) {
        if (aVar.mo24129f() == -1) {
            aVar = C9631a.m32747b(C4965c.m18859f().mo14977d(aVar, false), aVar.mo24134k(), aVar.mo24130g(), aVar.mo24133j(), 17);
        }
        try {
            List<C7833eb> Y = gbVar.mo21367Y(C4966d.m18871b().mo14981a(aVar), new C8092ya(aVar.mo24129f(), aVar.mo24134k(), aVar.mo24130g(), C4964b.m18857a(aVar.mo24133j()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            for (C7833eb aVar2 : Y) {
                arrayList.add(new C9633a(aVar2));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C9585a("Failed to run face detector.", 13, e);
        }
    }

    /* renamed from: b */
    public final boolean mo14991b() {
        if (this.f13873h != null || this.f13872g != null) {
            return this.f13869d;
        }
        if (DynamiteModule.m14548a(this.f13866a, ModuleDescriptor.MODULE_ID) > 0) {
            this.f13869d = true;
            try {
                m18882e();
            } catch (DynamiteModule.C3778a e) {
                throw new C9585a("Failed to load the bundled face module.", 13, e);
            } catch (RemoteException e2) {
                throw new C9585a("Failed to create thick face detector.", 13, e2);
            }
        } else {
            this.f13869d = false;
            try {
                m18882e();
            } catch (DynamiteModule.C3778a unused) {
                if (!this.f13870e) {
                    C9610m.m32725a(this.f13866a, "face");
                    this.f13870e = true;
                }
                C4982j.m18902c(this.f13871f, this.f13869d, C7778a8.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new C9585a("Waiting for the face module to be downloaded. Please wait.", 14);
            } catch (RemoteException e3) {
                C4982j.m18902c(this.f13871f, this.f13869d, C7778a8.OPTIONAL_MODULE_INIT_ERROR);
                throw new C9585a("Failed to create thin face detector.", 13, e3);
            }
        }
        C4982j.m18902c(this.f13871f, this.f13869d, C7778a8.NO_ERROR);
        return this.f13869d;
    }

    /* renamed from: c */
    public final Pair<List<C9633a>, List<C9633a>> mo14992c(C9631a aVar) {
        List<C9633a> list;
        if (this.f13873h == null && this.f13872g == null) {
            mo14991b();
        }
        if (!this.f13868c) {
            try {
                C7859gb gbVar = this.f13873h;
                if (gbVar != null) {
                    gbVar.mo21368c();
                }
                C7859gb gbVar2 = this.f13872g;
                if (gbVar2 != null) {
                    gbVar2.mo21368c();
                }
                this.f13868c = true;
            } catch (RemoteException e) {
                throw new C9585a("Failed to init face detector.", 13, e);
            }
        }
        C7859gb gbVar3 = this.f13873h;
        List<C9633a> list2 = null;
        if (gbVar3 != null) {
            list = m18884g(gbVar3, aVar);
            if (!this.f13867b.mo24163g()) {
                C4980h.m18892j(list);
            }
        } else {
            list = null;
        }
        C7859gb gbVar4 = this.f13872g;
        if (gbVar4 != null) {
            list2 = m18884g(gbVar4, aVar);
            C4980h.m18892j(list2);
        }
        return new Pair<>(list, list2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C7859gb mo14993d(DynamiteModule.C3779b bVar, String str, String str2, C7807cb cbVar) {
        return C7885ib.m28038j(DynamiteModule.m14550d(this.f13866a, bVar, str).mo11738c("com.google.android.gms.vision.face.mlkit.FaceDetectorCreator")).mo21380O(C6636b.m25276Y(this.f13866a), cbVar);
    }

    public final void zzb() {
        try {
            C7859gb gbVar = this.f13873h;
            if (gbVar != null) {
                gbVar.mo21366P0();
                this.f13873h = null;
            }
            C7859gb gbVar2 = this.f13872g;
            if (gbVar2 != null) {
                gbVar2.mo21366P0();
                this.f13872g = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.f13868c = false;
    }
}
