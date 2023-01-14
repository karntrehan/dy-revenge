package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p352g.C6923o0;
import p174e.p319f.p320a.p335c.p345f.p352g.C6955q0;

/* renamed from: com.google.android.gms.measurement.internal.n3 */
public final class C3978n3 extends C6923o0 implements C4002p3 {
    C3978n3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: A */
    public final byte[] mo11902A(C4094x xVar, String str) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, xVar);
        j.writeString(str);
        Parcel k = mo20045k(9, j);
        byte[] createByteArray = k.createByteArray();
        k.recycle();
        return createByteArray;
    }

    /* renamed from: B0 */
    public final void mo11903B0(C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, cbVar);
        mo20046m(18, j);
    }

    /* renamed from: D */
    public final String mo11904D(C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, cbVar);
        Parcel k = mo20045k(11, j);
        String readString = k.readString();
        k.recycle();
        return readString;
    }

    /* renamed from: F0 */
    public final void mo11905F0(C3845d dVar, C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, dVar);
        C6955q0.m26385e(j, cbVar);
        mo20046m(12, j);
    }

    /* renamed from: J */
    public final List mo11906J(String str, String str2, String str3) {
        Parcel j = mo20044j();
        j.writeString((String) null);
        j.writeString(str2);
        j.writeString(str3);
        Parcel k = mo20045k(17, j);
        ArrayList<C3845d> createTypedArrayList = k.createTypedArrayList(C3845d.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: V */
    public final void mo11910V(C4094x xVar, C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, xVar);
        C6955q0.m26385e(j, cbVar);
        mo20046m(1, j);
    }

    /* renamed from: b0 */
    public final void mo11911b0(C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, cbVar);
        mo20046m(4, j);
    }

    /* renamed from: d0 */
    public final List mo11912d0(String str, String str2, C3844cb cbVar) {
        Parcel j = mo20044j();
        j.writeString(str);
        j.writeString(str2);
        C6955q0.m26385e(j, cbVar);
        Parcel k = mo20045k(16, j);
        ArrayList<C3845d> createTypedArrayList = k.createTypedArrayList(C3845d.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: j0 */
    public final void mo11913j0(long j, String str, String str2, String str3) {
        Parcel j2 = mo20044j();
        j2.writeLong(j);
        j2.writeString(str);
        j2.writeString(str2);
        j2.writeString(str3);
        mo20046m(10, j2);
    }

    /* renamed from: q */
    public final void mo11916q(C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, cbVar);
        mo20046m(6, j);
    }

    /* renamed from: u */
    public final void mo11917u(Bundle bundle, C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, bundle);
        C6955q0.m26385e(j, cbVar);
        mo20046m(19, j);
    }

    /* renamed from: u0 */
    public final void mo11918u0(C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, cbVar);
        mo20046m(20, j);
    }

    /* renamed from: v0 */
    public final List mo11919v0(String str, String str2, boolean z, C3844cb cbVar) {
        Parcel j = mo20044j();
        j.writeString(str);
        j.writeString(str2);
        C6955q0.m26384d(j, z);
        C6955q0.m26385e(j, cbVar);
        Parcel k = mo20045k(14, j);
        ArrayList<C4045sa> createTypedArrayList = k.createTypedArrayList(C4045sa.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: w */
    public final List mo11920w(String str, String str2, String str3, boolean z) {
        Parcel j = mo20044j();
        j.writeString((String) null);
        j.writeString(str2);
        j.writeString(str3);
        C6955q0.m26384d(j, z);
        Parcel k = mo20045k(15, j);
        ArrayList<C4045sa> createTypedArrayList = k.createTypedArrayList(C4045sa.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: z0 */
    public final void mo11923z0(C4045sa saVar, C3844cb cbVar) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, saVar);
        C6955q0.m26385e(j, cbVar);
        mo20046m(2, j);
    }
}
