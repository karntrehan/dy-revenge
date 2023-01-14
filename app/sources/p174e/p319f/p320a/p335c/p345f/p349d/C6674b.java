package p174e.p319f.p320a.p335c.p345f.p349d;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3550l;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import p174e.p319f.p320a.p335c.p338b.p339a.C6622b;
import p174e.p319f.p320a.p335c.p338b.p339a.C6623c;

/* renamed from: e.f.a.c.f.d.b */
public final class C6674b extends C3669g<C6675c> {

    /* renamed from: I */
    private final Bundle f18332I;

    public C6674b(Context context, Looper looper, C3659d dVar, C6623c cVar, C3516e eVar, C3550l lVar) {
        super(context, looper, 16, dVar, eVar, lVar);
        this.f18332I = cVar == null ? new Bundle() : cVar.mo19444a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo11517F() {
        return this.f18332I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: X */
    public final boolean mo11545X() {
        return true;
    }

    /* renamed from: n */
    public final int mo11136n() {
        return C3637i.f10216a;
    }

    /* renamed from: t */
    public final boolean mo11560t() {
        C3659d o0 = mo11596o0();
        return !TextUtils.isEmpty(o0.mo11569b()) && !o0.mo11572e(C6622b.f18294a).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C6675c ? (C6675c) queryLocalInterface : new C6675c(iBinder);
    }
}
