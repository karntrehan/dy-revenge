package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.g.d1 */
public final class C6745d1 extends C6923o0 implements C6779f1 {
    C6745d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel j2 = mo20044j();
        j2.writeString(str);
        j2.writeLong(j);
        mo20046m(23, j2);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel j = mo20044j();
        j.writeString(str);
        j.writeString(str2);
        C6955q0.m26385e(j, bundle);
        mo20046m(9, j);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel j2 = mo20044j();
        j2.writeString(str);
        j2.writeLong(j);
        mo20046m(24, j2);
    }

    public final void generateEventId(C6828i1 i1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, i1Var);
        mo20046m(22, j);
    }

    public final void getCachedAppInstanceId(C6828i1 i1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, i1Var);
        mo20046m(19, j);
    }

    public final void getConditionalUserProperties(String str, String str2, C6828i1 i1Var) {
        Parcel j = mo20044j();
        j.writeString(str);
        j.writeString(str2);
        C6955q0.m26386f(j, i1Var);
        mo20046m(10, j);
    }

    public final void getCurrentScreenClass(C6828i1 i1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, i1Var);
        mo20046m(17, j);
    }

    public final void getCurrentScreenName(C6828i1 i1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, i1Var);
        mo20046m(16, j);
    }

    public final void getGmpAppId(C6828i1 i1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, i1Var);
        mo20046m(21, j);
    }

    public final void getMaxUserProperties(String str, C6828i1 i1Var) {
        Parcel j = mo20044j();
        j.writeString(str);
        C6955q0.m26386f(j, i1Var);
        mo20046m(6, j);
    }

    public final void getUserProperties(String str, String str2, boolean z, C6828i1 i1Var) {
        Parcel j = mo20044j();
        j.writeString(str);
        j.writeString(str2);
        C6955q0.m26384d(j, z);
        C6955q0.m26386f(j, i1Var);
        mo20046m(5, j);
    }

    public final void initialize(C6634a aVar, C6924o1 o1Var, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        C6955q0.m26385e(j2, o1Var);
        j2.writeLong(j);
        mo20046m(1, j2);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel j2 = mo20044j();
        j2.writeString(str);
        j2.writeString(str2);
        C6955q0.m26385e(j2, bundle);
        C6955q0.m26384d(j2, z);
        C6955q0.m26384d(j2, z2);
        j2.writeLong(j);
        mo20046m(2, j2);
    }

    public final void logHealthData(int i, String str, C6634a aVar, C6634a aVar2, C6634a aVar3) {
        Parcel j = mo20044j();
        j.writeInt(5);
        j.writeString(str);
        C6955q0.m26386f(j, aVar);
        C6955q0.m26386f(j, aVar2);
        C6955q0.m26386f(j, aVar3);
        mo20046m(33, j);
    }

    public final void onActivityCreated(C6634a aVar, Bundle bundle, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        C6955q0.m26385e(j2, bundle);
        j2.writeLong(j);
        mo20046m(27, j2);
    }

    public final void onActivityDestroyed(C6634a aVar, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeLong(j);
        mo20046m(28, j2);
    }

    public final void onActivityPaused(C6634a aVar, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeLong(j);
        mo20046m(29, j2);
    }

    public final void onActivityResumed(C6634a aVar, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeLong(j);
        mo20046m(30, j2);
    }

    public final void onActivitySaveInstanceState(C6634a aVar, C6828i1 i1Var, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        C6955q0.m26386f(j2, i1Var);
        j2.writeLong(j);
        mo20046m(31, j2);
    }

    public final void onActivityStarted(C6634a aVar, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeLong(j);
        mo20046m(25, j2);
    }

    public final void onActivityStopped(C6634a aVar, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeLong(j);
        mo20046m(26, j2);
    }

    public final void registerOnMeasurementEventListener(C6876l1 l1Var) {
        Parcel j = mo20044j();
        C6955q0.m26386f(j, l1Var);
        mo20046m(35, j);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26385e(j2, bundle);
        j2.writeLong(j);
        mo20046m(8, j2);
    }

    public final void setCurrentScreen(C6634a aVar, String str, String str2, long j) {
        Parcel j2 = mo20044j();
        C6955q0.m26386f(j2, aVar);
        j2.writeString(str);
        j2.writeString(str2);
        j2.writeLong(j);
        mo20046m(15, j2);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel j = mo20044j();
        C6955q0.m26384d(j, z);
        mo20046m(39, j);
    }
}
