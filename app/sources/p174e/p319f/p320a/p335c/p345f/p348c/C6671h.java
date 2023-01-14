package p174e.p319f.p320a.p335c.p345f.p348c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import p174e.p319f.p320a.p335c.p338b.p339a.C6619a;

/* renamed from: e.f.a.c.f.c.h */
public final class C6671h extends C3669g {

    /* renamed from: I */
    private final C6619a.C6620a f18329I;

    public C6671h(Context context, Looper looper, C3659d dVar, C6619a.C6620a aVar, C3486f.C3488b bVar, C3486f.C3489c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        C6619a.C6620a.C6621a aVar2 = new C6619a.C6620a.C6621a(aVar == null ? C6619a.C6620a.f18288f : aVar);
        aVar2.mo19443a(C6666c.m25312a());
        this.f18329I = new C6619a.C6620a(aVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo11517F() {
        return this.f18329I.mo19439a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: n */
    public final int mo11136n() {
        return 12800000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public final C6619a.C6620a mo19467r0() {
        return this.f18329I;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof C6672i ? (C6672i) queryLocalInterface : new C6672i(iBinder);
    }
}
