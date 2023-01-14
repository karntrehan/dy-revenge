package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.q7 */
final class C4018q7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    final /* synthetic */ C4030r7 f11212f;

    /* synthetic */ C4018q7(C4030r7 r7Var, C4006p7 p7Var) {
        this.f11212f = r7Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f11212f.f10651a.mo11935b().mo12548v().mo12476a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f11212f.f10651a.mo12161N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f11212f.f10651a.mo11934a().mo12110z(new C3994o7(this, z, data, str, queryParameter));
                    }
                }
            }
        } catch (RuntimeException e) {
            this.f11212f.f10651a.mo11935b().mo12544r().mo12477b("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f11212f.f10651a.mo12158K().mo11982z(activity, bundle);
            throw th;
        }
        this.f11212f.f10651a.mo12158K().mo11982z(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f11212f.f10651a.mo12158K().mo11972A(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f11212f.f10651a.mo12158K().mo11973B(activity);
        C4104x9 M = this.f11212f.f10651a.mo12160M();
        M.f10651a.mo11934a().mo12110z(new C4020q9(M, M.f10651a.mo11936c().mo11731b()));
    }

    public final void onActivityResumed(Activity activity) {
        C4104x9 M = this.f11212f.f10651a.mo12160M();
        M.f10651a.mo11934a().mo12110z(new C4008p9(M, M.f10651a.mo11936c().mo11731b()));
        this.f11212f.f10651a.mo12158K().mo11974C(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f11212f.f10651a.mo12158K().mo11975D(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
