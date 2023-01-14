package p174e.p319f.p320a.p335c.p360g.p361b;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.C3441c;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.C3712t0;
import com.google.android.gms.common.internal.C3718v0;
import p174e.p319f.p320a.p335c.p360g.C8939g;

/* renamed from: e.f.a.c.g.b.a */
public class C8922a extends C3669g<C8928g> implements C8939g {

    /* renamed from: I */
    public static final /* synthetic */ int f24323I = 0;

    /* renamed from: J */
    private final boolean f24324J = true;

    /* renamed from: K */
    private final C3659d f24325K;

    /* renamed from: L */
    private final Bundle f24326L;

    /* renamed from: M */
    private final Integer f24327M;

    public C8922a(Context context, Looper looper, boolean z, C3659d dVar, Bundle bundle, C3486f.C3488b bVar, C3486f.C3489c cVar) {
        super(context, looper, 44, dVar, bVar, cVar);
        this.f24325K = dVar;
        this.f24326L = bundle;
        this.f24327M = dVar.mo11576i();
    }

    /* renamed from: r0 */
    public static Bundle m29780r0(C3659d dVar) {
        dVar.mo11575h();
        Integer i = dVar.mo11576i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo11568a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo11517F() {
        if (!mo11529D().getPackageName().equals(this.f24325K.mo11573f())) {
            this.f24326L.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f24325K.mo11573f());
        }
        return this.f24326L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: m */
    public final void mo22729m(C8927f fVar) {
        C3705r.m14347l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f24325K.mo11570c();
            ((C8928g) mo11533I()).mo22737Q0(new C8931j(1, new C3712t0(c, ((Integer) C3705r.m14346k(this.f24327M)).intValue(), "<<default account>>".equals(c.name) ? C3441c.m13432b(mo11529D()).mo11120c() : null)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo11291G(new C8933l(1, new C3623b(8, (PendingIntent) null), (C3718v0) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: n */
    public final int mo11136n() {
        return C3637i.f10216a;
    }

    /* renamed from: p */
    public final void mo22730p(C3678j jVar, boolean z) {
        try {
            ((C8928g) mo11533I()).mo22736P0(jVar, ((Integer) C3705r.m14346k(this.f24327M)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: q */
    public final void mo22731q() {
        try {
            ((C8928g) mo11533I()).mo22738Y(((Integer) C3705r.m14346k(this.f24327M)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: t */
    public final boolean mo11560t() {
        return this.f24324J;
    }

    /* renamed from: u */
    public final void mo22732u() {
        mo11552h(new C3651c.C3655d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C8928g ? (C8928g) queryLocalInterface : new C8928g(iBinder);
    }
}
