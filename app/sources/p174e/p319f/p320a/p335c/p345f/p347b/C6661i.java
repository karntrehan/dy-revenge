package p174e.p319f.p320a.p335c.p345f.p347b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3550l;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import okhttp3.internal.p510ws.WebSocketProtocol;

/* renamed from: e.f.a.c.f.b.i */
public final class C6661i extends C3669g<C6658f> {
    public C6661i(Context context, Looper looper, C3659d dVar, C3516e eVar, C3550l lVar) {
        super(context, looper, (int) WebSocketProtocol.PAYLOAD_SHORT, dVar, eVar, lVar);
    }

    /* renamed from: A */
    public final C3627d[] mo11516A() {
        return C6655c.f18320e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    /* renamed from: X */
    public final boolean mo11545X() {
        return true;
    }

    /* renamed from: n */
    public final int mo11136n() {
        return C3637i.f10216a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* bridge */ /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof C6658f ? (C6658f) queryLocalInterface : new C6658f(iBinder);
    }
}
