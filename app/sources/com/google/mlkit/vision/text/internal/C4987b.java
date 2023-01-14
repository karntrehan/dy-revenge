package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.vision.common.internal.C4964b;
import com.google.mlkit.vision.common.internal.C4966d;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p358m.C8857ua;
import p174e.p319f.p320a.p335c.p345f.p358m.C8883wa;
import p174e.p319f.p320a.p335c.p345f.p358m.C8907ya;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p407a.p409c.C9610m;
import p174e.p319f.p406d.p411b.p413b.C9631a;
import p174e.p319f.p406d.p411b.p415d.C9641a;
import p174e.p319f.p406d.p411b.p415d.C9650e;

/* renamed from: com.google.mlkit.vision.text.internal.b */
final class C4987b implements C4995j {

    /* renamed from: a */
    private final Context f13904a;

    /* renamed from: b */
    private final C9650e f13905b;

    /* renamed from: c */
    private boolean f13906c;

    /* renamed from: d */
    private boolean f13907d;

    /* renamed from: e */
    private C8883wa f13908e;

    C4987b(Context context, C9650e eVar) {
        this.f13904a = context;
        this.f13905b = eVar;
    }

    /* renamed from: a */
    public final void mo15001a() {
        C8883wa waVar = this.f13908e;
        if (waVar != null) {
            try {
                waVar.mo22686P0();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.f13905b.mo24187b());
                Log.e("DecoupledTextDelegate", valueOf.length() != 0 ? "Failed to release text recognizer ".concat(valueOf) : new String("Failed to release text recognizer "), e);
            }
            this.f13908e = null;
        }
        this.f13906c = false;
    }

    /* renamed from: c */
    public final C9641a mo15002c(C9631a aVar) {
        if (this.f13908e == null) {
            zzb();
        }
        C8883wa waVar = (C8883wa) C3705r.m14346k(this.f13908e);
        if (!this.f13906c) {
            try {
                waVar.mo22688c();
                this.f13906c = true;
            } catch (RemoteException e) {
                String valueOf = String.valueOf(this.f13905b.mo24187b());
                throw new C9585a(valueOf.length() != 0 ? "Failed to init text recognizer ".concat(valueOf) : new String("Failed to init text recognizer "), 13, e);
            }
        }
        try {
            return new C9641a(waVar.mo22687Y(C4966d.m18871b().mo14981a(aVar), new C8857ua(aVar.mo24129f(), aVar.mo24134k(), aVar.mo24130g(), C4964b.m18857a(aVar.mo24133j()), SystemClock.elapsedRealtime())));
        } catch (RemoteException e2) {
            String valueOf2 = String.valueOf(this.f13905b.mo24187b());
            throw new C9585a(valueOf2.length() != 0 ? "Failed to run text recognizer ".concat(valueOf2) : new String("Failed to run text recognizer "), 13, e2);
        }
    }

    public final void zzb() {
        if (this.f13908e == null) {
            try {
                this.f13908e = C8907ya.m29770j(DynamiteModule.m14550d(this.f13904a, this.f13905b.mo24189d() ? DynamiteModule.f10464b : DynamiteModule.f10463a, this.f13905b.mo24192f()).mo11738c(this.f13905b.mo24188c())).mo22702A0(C6636b.m25276Y(this.f13904a));
            } catch (DynamiteModule.C3778a e) {
                if (!this.f13905b.mo24189d()) {
                    if (!this.f13907d) {
                        C9610m.m32725a(this.f13904a, "ocr");
                        this.f13907d = true;
                    }
                    throw new C9585a("Waiting for the text optional module to be downloaded. Please wait.", 14);
                }
                throw new C9585a(String.format("Failed to load text module %s. %s", new Object[]{this.f13905b.mo24187b(), e.getMessage()}), 13, e);
            } catch (RemoteException e2) {
                String valueOf = String.valueOf(this.f13905b.mo24187b());
                throw new C9585a(valueOf.length() != 0 ? "Failed to create text recognizer ".concat(valueOf) : new String("Failed to create text recognizer "), 13, e2);
            }
        }
    }
}
