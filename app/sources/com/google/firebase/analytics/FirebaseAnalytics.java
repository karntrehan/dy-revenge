package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.measurement.internal.C4042s7;
import com.google.firebase.installations.C4836e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p174e.p319f.p320a.p335c.p345f.p352g.C7037v2;
import p174e.p319f.p320a.p335c.p362h.C8969o;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f12748a;

    /* renamed from: b */
    private final C7037v2 f12749b;

    public FirebaseAnalytics(C7037v2 v2Var) {
        C3705r.m14346k(v2Var);
        this.f12749b = v2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f12748a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f12748a == null) {
                    f12748a = new FirebaseAnalytics(C7037v2.m26770r(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f12748a;
    }

    @Keep
    public static C4042s7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C7037v2 r = C7037v2.m26770r(context, (String) null, (String) null, (String) null, bundle);
        if (r == null) {
            return null;
        }
        return new C4473b(r);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C8969o.m29863b(C4836e.m18476j().mo14749a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f12749b.mo20301d(activity, str, str2);
    }
}
