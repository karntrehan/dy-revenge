package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;

/* renamed from: com.google.android.play.core.assetpacks.n2 */
public final class C4410n2 implements C9106c0<?> {

    /* renamed from: a */
    private final C9106c0 f12590a;

    /* renamed from: b */
    private final C9106c0 f12591b;

    /* renamed from: c */
    private final /* synthetic */ int f12592c = 0;

    public C4410n2(C9106c0<C4386h2> c0Var, C9106c0<Context> c0Var2) {
        this.f12590a = c0Var;
        this.f12591b = c0Var2;
    }

    public C4410n2(C9106c0<Context> c0Var, C9106c0<C4439v> c0Var2, byte[] bArr) {
        this.f12591b = c0Var;
        this.f12590a = c0Var2;
    }

    public C4410n2(C9106c0<Context> c0Var, C9106c0<C4412o0> c0Var2, char[] cArr) {
        this.f12590a = c0Var;
        this.f12591b = c0Var2;
    }

    public C4410n2(C9106c0<C4439v> c0Var, C9106c0<C4430s2> c0Var2, int[] iArr) {
        this.f12591b = c0Var;
        this.f12590a = c0Var2;
    }

    public C4410n2(C9106c0<Context> c0Var, C9106c0<C4437u1> c0Var2, short[] sArr) {
        this.f12590a = c0Var;
        this.f12591b = c0Var2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        int i = this.f12592c;
        if (i == 0) {
            Object a = this.f12590a.mo13826a();
            Context b = ((C4414o2) this.f12591b).mo13826a();
            C4386h2 h2Var = (C4386h2) a;
            C9127n.m30385a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
            C9127n.m30385a(b.getPackageManager(), new ComponentName(b.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
            PlayCoreDialogWrapperActivity.m17030a(b);
            C9127n.m30388d(h2Var);
            return h2Var;
        } else if (i == 1) {
            return new C4360b0(((C4414o2) this.f12591b).mo13826a(), (C4439v) this.f12590a.mo13826a());
        } else {
            if (i == 2) {
                return new C4411o(((C4414o2) this.f12590a).mo13826a(), (C4412o0) this.f12591b.mo13826a());
            }
            if (i == 3) {
                return new C4439v(((C4414o2) this.f12590a).mo13826a(), (C4437u1) this.f12591b.mo13826a());
            }
            return new C4445w1((C4439v) this.f12591b.mo13826a(), C9104b0.m30332c(this.f12590a));
        }
    }
}
