package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C3705r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: f */
    protected final C3531h f9888f;

    protected LifecycleCallback(C3531h hVar) {
        this.f9888f = hVar;
    }

    /* renamed from: c */
    public static C3531h m13593c(Activity activity) {
        return m13594d(new C3526g(activity));
    }

    /* renamed from: d */
    protected static C3531h m13594d(C3526g gVar) {
        if (gVar.mo11328d()) {
            return zzd.m14055y1(gVar.mo11326b());
        }
        if (gVar.mo11327c()) {
            return C3535h3.m13749f(gVar.mo11325a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C3531h getChimeraLifecycleFragmentImpl(C3526g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo11248a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public Activity mo11249b() {
        Activity d = this.f9888f.mo11350d();
        C3705r.m14346k(d);
        return d;
    }

    /* renamed from: e */
    public void mo11250e(int i, int i2, Intent intent) {
    }

    /* renamed from: f */
    public void mo11251f(Bundle bundle) {
    }

    /* renamed from: g */
    public void mo11252g() {
    }

    /* renamed from: h */
    public void mo11253h() {
    }

    /* renamed from: i */
    public void mo11254i(Bundle bundle) {
    }

    /* renamed from: j */
    public void mo11255j() {
    }

    /* renamed from: k */
    public void mo11256k() {
    }
}
