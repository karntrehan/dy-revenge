package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4965c;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p358m.C8615c2;
import p174e.p319f.p320a.p335c.p345f.p358m.C8671g6;
import p174e.p319f.p320a.p335c.p345f.p358m.C8699i8;
import p174e.p319f.p320a.p335c.p345f.p358m.C8741lb;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p415d.C9641a;

/* renamed from: com.google.mlkit.vision.text.internal.c */
final class C4988c implements C4995j {

    /* renamed from: a */
    private final Context f13909a;

    /* renamed from: b */
    private final C8741lb f13910b = new C8741lb((String) null);

    /* renamed from: c */
    private boolean f13911c;

    /* renamed from: d */
    private C8671g6 f13912d;

    C4988c(Context context) {
        this.f13909a = context;
    }

    /* renamed from: a */
    public final void mo15001a() {
        C8671g6 g6Var = this.f13912d;
        if (g6Var != null) {
            try {
                g6Var.mo22419Y();
            } catch (RemoteException e) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
            }
            this.f13912d = null;
        }
    }

    /* renamed from: c */
    public final C9641a mo15002c(C9631a aVar) {
        int i;
        Bitmap bitmap;
        if (this.f13912d == null) {
            zzb();
        }
        if (this.f13912d != null) {
            if (aVar.mo24129f() == -1) {
                bitmap = aVar.mo24127d();
                i = C4964b.m18857a(aVar.mo24133j());
            } else {
                bitmap = C4965c.m18859f().mo14978e(aVar);
                i = 0;
            }
            try {
                return C4994i.m18922a(((C8671g6) C3705r.m14346k(this.f13912d)).mo22418P0(C6636b.m25276Y(bitmap), new C8615c2(aVar.mo24134k(), aVar.mo24130g(), 0, 0, i)));
            } catch (RemoteException e) {
                throw new C9585a("Failed to run legacy text recognizer.", 13, e);
            }
        } else {
            throw new C9585a("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
    }

    public final void zzb() {
        if (this.f13912d == null) {
            try {
                C8671g6 K0 = C8699i8.m29517j(DynamiteModule.m14550d(this.f13909a, DynamiteModule.f10463a, "com.google.android.gms.vision.dynamite").mo11738c("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).mo22446K0(C6636b.m25276Y(this.f13909a), this.f13910b);
                this.f13912d = K0;
                if (K0 == null && !this.f13911c) {
                    Log.d("LegacyTextDelegate", "Request OCR optional module download.");
                    C9610m.m32725a(this.f13909a, "ocr");
                    this.f13911c = true;
                }
            } catch (RemoteException e) {
                throw new C9585a("Failed to create legacy text recognizer.", 13, e);
            } catch (DynamiteModule.C3778a e2) {
                throw new C9585a("Failed to load deprecated vision dynamite module.", 13, e2);
            }
        }
    }
}
