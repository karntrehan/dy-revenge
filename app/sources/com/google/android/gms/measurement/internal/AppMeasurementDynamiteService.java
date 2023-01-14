package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;
import p174e.p319f.p320a.p335c.p345f.p352g.C6762e1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6876l1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6908n1;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;
import p497j.p498a.p499a.p500a.p501a.C10675a;

@DynamiteApi
public class AppMeasurementDynamiteService extends C6762e1 {

    /* renamed from: a */
    C3955l5 f10496a = null;

    /* renamed from: b */
    private final Map f10497b = new C1788a();

    @C10675a
    /* renamed from: k */
    private final void m14620k() {
        if (this.f10496a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: m */
    private final void m14621m(C6828i1 i1Var, String str) {
        m14620k();
        this.f10496a.mo12161N().mo12493J(i1Var, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        m14620k();
        this.f10496a.mo12180y().mo11898l(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m14620k();
        this.f10496a.mo12156I().mo12375o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        m14620k();
        this.f10496a.mo12156I().mo12357I((Boolean) null);
    }

    public void endAdUnitExposure(String str, long j) {
        m14620k();
        this.f10496a.mo12180y().mo11899m(str, j);
    }

    public void generateEventId(C6828i1 i1Var) {
        m14620k();
        long r0 = this.f10496a.mo12161N().mo12519r0();
        m14620k();
        this.f10496a.mo12161N().mo12492I(i1Var, r0);
    }

    public void getAppInstanceId(C6828i1 i1Var) {
        m14620k();
        this.f10496a.mo11934a().mo12110z(new C3905h7(this, i1Var));
    }

    public void getCachedAppInstanceId(C6828i1 i1Var) {
        m14620k();
        m14621m(i1Var, this.f10496a.mo12156I().mo12368V());
    }

    public void getConditionalUserProperties(String str, String str2, C6828i1 i1Var) {
        m14620k();
        this.f10496a.mo11934a().mo12110z(new C4117ya(this, i1Var, str, str2));
    }

    public void getCurrentScreenClass(C6828i1 i1Var) {
        m14620k();
        m14621m(i1Var, this.f10496a.mo12156I().mo12369W());
    }

    public void getCurrentScreenName(C6828i1 i1Var) {
        m14620k();
        m14621m(i1Var, this.f10496a.mo12156I().mo12370X());
    }

    public void getGmpAppId(C6828i1 i1Var) {
        String str;
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        if (I.f10651a.mo12162O() != null) {
            str = I.f10651a.mo12162O();
        } else {
            try {
                str = C4102x7.m15387b(I.f10651a.mo11938f(), "google_app_id", I.f10651a.mo12165R());
            } catch (IllegalStateException e) {
                I.f10651a.mo11935b().mo12544r().mo12477b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m14621m(i1Var, str);
    }

    public void getMaxUserProperties(String str, C6828i1 i1Var) {
        m14620k();
        this.f10496a.mo12156I().mo12363Q(str);
        m14620k();
        this.f10496a.mo12161N().mo12491H(i1Var, 25);
    }

    public void getTestFlag(C6828i1 i1Var, int i) {
        m14620k();
        if (i == 0) {
            this.f10496a.mo12161N().mo12493J(i1Var, this.f10496a.mo12156I().mo12371Y());
        } else if (i == 1) {
            this.f10496a.mo12161N().mo12492I(i1Var, this.f10496a.mo12156I().mo12367U().longValue());
        } else if (i == 2) {
            C4105xa N = this.f10496a.mo12161N();
            double doubleValue = this.f10496a.mo12156I().mo12365S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.mo19555f(bundle);
            } catch (RemoteException e) {
                N.f10651a.mo11935b().mo12549w().mo12477b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f10496a.mo12161N().mo12491H(i1Var, this.f10496a.mo12156I().mo12366T().intValue());
        } else if (i == 4) {
            this.f10496a.mo12161N().mo12487D(i1Var, this.f10496a.mo12156I().mo12364R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C6828i1 i1Var) {
        m14620k();
        this.f10496a.mo11934a().mo12110z(new C3920i9(this, i1Var, str, str2, z));
    }

    public void initForTests(Map map) {
        m14620k();
    }

    public void initialize(C6634a aVar, C6924o1 o1Var, long j) {
        C3955l5 l5Var = this.f10496a;
        if (l5Var == null) {
            this.f10496a = C3955l5.m14977H((Context) C3705r.m14346k((Context) C6636b.m25277m(aVar)), o1Var, Long.valueOf(j));
        } else {
            l5Var.mo11935b().mo12549w().mo12476a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C6828i1 i1Var) {
        m14620k();
        this.f10496a.mo11934a().mo12110z(new C4129za(this, i1Var));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m14620k();
        this.f10496a.mo12156I().mo12379s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C6828i1 i1Var, long j) {
        Bundle bundle2;
        m14620k();
        C3705r.m14342g(str2);
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f10496a.mo11934a().mo12110z(new C3919i8(this, i1Var, new C4094x(str2, new C4070v(bundle), "app", j), str));
    }

    public void logHealthData(int i, String str, C6634a aVar, C6634a aVar2, C6634a aVar3) {
        m14620k();
        Object obj = null;
        Object m = aVar == null ? null : C6636b.m25277m(aVar);
        Object m2 = aVar2 == null ? null : C6636b.m25277m(aVar2);
        if (aVar3 != null) {
            obj = C6636b.m25277m(aVar3);
        }
        this.f10496a.mo11935b().mo12542F(i, true, false, str, m, m2, obj);
    }

    public void onActivityCreated(C6634a aVar, Bundle bundle, long j) {
        m14620k();
        C4018q7 q7Var = this.f10496a.mo12156I().f11234c;
        if (q7Var != null) {
            this.f10496a.mo12156I().mo12376p();
            q7Var.onActivityCreated((Activity) C6636b.m25277m(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C6634a aVar, long j) {
        m14620k();
        C4018q7 q7Var = this.f10496a.mo12156I().f11234c;
        if (q7Var != null) {
            this.f10496a.mo12156I().mo12376p();
            q7Var.onActivityDestroyed((Activity) C6636b.m25277m(aVar));
        }
    }

    public void onActivityPaused(C6634a aVar, long j) {
        m14620k();
        C4018q7 q7Var = this.f10496a.mo12156I().f11234c;
        if (q7Var != null) {
            this.f10496a.mo12156I().mo12376p();
            q7Var.onActivityPaused((Activity) C6636b.m25277m(aVar));
        }
    }

    public void onActivityResumed(C6634a aVar, long j) {
        m14620k();
        C4018q7 q7Var = this.f10496a.mo12156I().f11234c;
        if (q7Var != null) {
            this.f10496a.mo12156I().mo12376p();
            q7Var.onActivityResumed((Activity) C6636b.m25277m(aVar));
        }
    }

    public void onActivitySaveInstanceState(C6634a aVar, C6828i1 i1Var, long j) {
        m14620k();
        C4018q7 q7Var = this.f10496a.mo12156I().f11234c;
        Bundle bundle = new Bundle();
        if (q7Var != null) {
            this.f10496a.mo12156I().mo12376p();
            q7Var.onActivitySaveInstanceState((Activity) C6636b.m25277m(aVar), bundle);
        }
        try {
            i1Var.mo19555f(bundle);
        } catch (RemoteException e) {
            this.f10496a.mo11935b().mo12549w().mo12477b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C6634a aVar, long j) {
        m14620k();
        if (this.f10496a.mo12156I().f11234c != null) {
            this.f10496a.mo12156I().mo12376p();
            Activity activity = (Activity) C6636b.m25277m(aVar);
        }
    }

    public void onActivityStopped(C6634a aVar, long j) {
        m14620k();
        if (this.f10496a.mo12156I().f11234c != null) {
            this.f10496a.mo12156I().mo12376p();
            Activity activity = (Activity) C6636b.m25277m(aVar);
        }
    }

    public void performAction(Bundle bundle, C6828i1 i1Var, long j) {
        m14620k();
        i1Var.mo19555f((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C6876l1 l1Var) {
        C3981n6 n6Var;
        m14620k();
        synchronized (this.f10497b) {
            n6Var = (C3981n6) this.f10497b.get(Integer.valueOf(l1Var.mo19848b()));
            if (n6Var == null) {
                n6Var = new C3831bb(this, l1Var);
                this.f10497b.put(Integer.valueOf(l1Var.mo19848b()), n6Var);
            }
        }
        this.f10496a.mo12156I().mo12384x(n6Var);
    }

    public void resetAnalyticsData(long j) {
        m14620k();
        this.f10496a.mo12156I().mo12385y(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        m14620k();
        if (bundle == null) {
            this.f10496a.mo11935b().mo12544r().mo12476a("Conditional user property must not be null");
        } else {
            this.f10496a.mo12156I().mo12353E(bundle, j);
        }
    }

    public void setConsent(Bundle bundle, long j) {
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        I.f10651a.mo11934a().mo12104A(new C4017q6(I, bundle, j));
    }

    public void setConsentThirdParty(Bundle bundle, long j) {
        m14620k();
        this.f10496a.mo12156I().mo12354F(bundle, -20, j);
    }

    public void setCurrentScreen(C6634a aVar, String str, String str2, long j) {
        m14620k();
        this.f10496a.mo12158K().mo11976E((Activity) C6636b.m25277m(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        I.mo11949i();
        I.f10651a.mo11934a().mo12110z(new C3982n7(I, z));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        I.f10651a.mo11934a().mo12110z(new C4029r6(I, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C6876l1 l1Var) {
        m14620k();
        C3818ab abVar = new C3818ab(this, l1Var);
        if (this.f10496a.mo11934a().mo12105C()) {
            this.f10496a.mo12156I().mo12356H(abVar);
        } else {
            this.f10496a.mo11934a().mo12110z(new C3934ja(this, abVar));
        }
    }

    public void setInstanceIdProvider(C6908n1 n1Var) {
        m14620k();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m14620k();
        this.f10496a.mo12156I().mo12357I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        m14620k();
    }

    public void setSessionTimeoutDuration(long j) {
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        I.f10651a.mo11934a().mo12110z(new C4077v6(I, j));
    }

    public void setUserId(String str, long j) {
        m14620k();
        C4030r7 I = this.f10496a.mo12156I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f10651a.mo11934a().mo12110z(new C4041s6(I, str));
            I.mo12360L((String) null, "_id", str, true, j);
            return;
        }
        I.f10651a.mo11935b().mo12549w().mo12476a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, C6634a aVar, boolean z, long j) {
        m14620k();
        this.f10496a.mo12156I().mo12360L(str, str2, C6636b.m25277m(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C6876l1 l1Var) {
        C3981n6 n6Var;
        m14620k();
        synchronized (this.f10497b) {
            n6Var = (C3981n6) this.f10497b.remove(Integer.valueOf(l1Var.mo19848b()));
        }
        if (n6Var == null) {
            n6Var = new C3831bb(this, l1Var);
        }
        this.f10496a.mo12156I().mo12362N(n6Var);
    }
}
