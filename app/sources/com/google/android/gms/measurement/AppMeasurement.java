package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.measurement.internal.C3917i6;
import com.google.android.gms.measurement.internal.C3955l5;
import com.google.android.gms.measurement.internal.C4042s7;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: a */
    private static volatile AppMeasurement f10487a;

    /* renamed from: b */
    private final C3805e f10488b;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C3705r.m14346k(bundle);
            this.mAppId = (String) C3917i6.m14931a(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) C3917i6.m14931a(bundle, "origin", cls2, (Object) null);
            this.mName = (String) C3917i6.m14931a(bundle, "name", cls2, (Object) null);
            this.mValue = C3917i6.m14931a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C3917i6.m14931a(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) C3917i6.m14931a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C3917i6.m14931a(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) C3917i6.m14931a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C3917i6.m14931a(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) C3917i6.m14931a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C3917i6.m14931a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C3917i6.m14931a(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) C3917i6.m14931a(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C3917i6.m14931a(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C3917i6.m14931a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C3917i6.m14931a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    public AppMeasurement(C3955l5 l5Var) {
        this.f10488b = new C3802b(l5Var);
    }

    public AppMeasurement(C4042s7 s7Var) {
        this.f10488b = new C3803c(s7Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @java.lang.Deprecated
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f10487a
            if (r0 != 0) goto L_0x005d
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f10487a     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            com.google.android.gms.measurement.internal.s7 r2 = (com.google.android.gms.measurement.internal.C4042s7) r2     // Catch:{  }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r14.<init>((com.google.android.gms.measurement.internal.C4042s7) r2)     // Catch:{ all -> 0x005a }
            f10487a = r14     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x003d:
            e.f.a.c.f.g.o1 r13 = new e.f.a.c.f.g.o1     // Catch:{ all -> 0x005a }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.internal.l5 r14 = com.google.android.gms.measurement.internal.C3955l5.m14977H(r14, r13, r1)     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r1.<init>((com.google.android.gms.measurement.internal.C3955l5) r14)     // Catch:{ all -> 0x005a }
            f10487a = r1     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r14
        L_0x005d:
            com.google.android.gms.measurement.AppMeasurement r14 = f10487a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f10488b.mo11794h(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f10488b.mo11795i(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f10488b.mo11796j(str);
    }

    @Keep
    public long generateEventId() {
        return this.f10488b.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f10488b.mo11790d();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> b = this.f10488b.mo11788b(str, str2);
        ArrayList arrayList = new ArrayList(b == null ? 0 : b.size());
        for (Bundle conditionalUserProperty : b) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f10488b.mo11793g();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f10488b.mo11797l();
    }

    @Keep
    public String getGmpAppId() {
        return this.f10488b.mo11798m();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f10488b.mo11787a(str);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f10488b.mo11789c(str, str2, z);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f10488b.mo11792f(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C3705r.m14346k(conditionalUserProperty);
        C3805e eVar = this.f10488b;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C3917i6.m14932b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        eVar.mo11791e(bundle);
    }
}
