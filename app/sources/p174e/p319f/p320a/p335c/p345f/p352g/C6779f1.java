package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.g.f1 */
public interface C6779f1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C6828i1 i1Var);

    void getAppInstanceId(C6828i1 i1Var);

    void getCachedAppInstanceId(C6828i1 i1Var);

    void getConditionalUserProperties(String str, String str2, C6828i1 i1Var);

    void getCurrentScreenClass(C6828i1 i1Var);

    void getCurrentScreenName(C6828i1 i1Var);

    void getGmpAppId(C6828i1 i1Var);

    void getMaxUserProperties(String str, C6828i1 i1Var);

    void getTestFlag(C6828i1 i1Var, int i);

    void getUserProperties(String str, String str2, boolean z, C6828i1 i1Var);

    void initForTests(Map map);

    void initialize(C6634a aVar, C6924o1 o1Var, long j);

    void isDataCollectionEnabled(C6828i1 i1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C6828i1 i1Var, long j);

    void logHealthData(int i, String str, C6634a aVar, C6634a aVar2, C6634a aVar3);

    void onActivityCreated(C6634a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C6634a aVar, long j);

    void onActivityPaused(C6634a aVar, long j);

    void onActivityResumed(C6634a aVar, long j);

    void onActivitySaveInstanceState(C6634a aVar, C6828i1 i1Var, long j);

    void onActivityStarted(C6634a aVar, long j);

    void onActivityStopped(C6634a aVar, long j);

    void performAction(Bundle bundle, C6828i1 i1Var, long j);

    void registerOnMeasurementEventListener(C6876l1 l1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C6634a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C6876l1 l1Var);

    void setInstanceIdProvider(C6908n1 n1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C6634a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C6876l1 l1Var);
}
