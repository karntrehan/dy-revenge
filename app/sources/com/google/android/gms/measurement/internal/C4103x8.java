package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
final class C4103x8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f11402f;

    /* renamed from: o */
    final /* synthetic */ String f11403o;

    /* renamed from: p */
    final /* synthetic */ String f11404p;

    /* renamed from: q */
    final /* synthetic */ C3844cb f11405q;

    /* renamed from: r */
    final /* synthetic */ C3894g9 f11406r;

    C4103x8(C3894g9 g9Var, AtomicReference atomicReference, String str, String str2, String str3, C3844cb cbVar) {
        this.f11406r = g9Var;
        this.f11402f = atomicReference;
        this.f11403o = str2;
        this.f11404p = str3;
        this.f11405q = cbVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List J;
        synchronized (this.f11402f) {
            try {
                C3894g9 g9Var = this.f11406r;
                C4002p3 H = g9Var.f10698d;
                if (H == null) {
                    g9Var.f10651a.mo11935b().mo12544r().mo12479d("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f11403o, this.f11404p);
                    this.f11402f.set(Collections.emptyList());
                    this.f11402f.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C3705r.m14346k(this.f11405q);
                    atomicReference2 = this.f11402f;
                    J = H.mo11912d0(this.f11403o, this.f11404p, this.f11405q);
                } else {
                    atomicReference2 = this.f11402f;
                    J = H.mo11906J((String) null, this.f11403o, this.f11404p);
                }
                atomicReference2.set(J);
                this.f11406r.m14779E();
                atomicReference = this.f11402f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11406r.f10651a.mo11935b().mo12544r().mo12479d("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f11403o, e);
                    this.f11402f.set(Collections.emptyList());
                    atomicReference = this.f11402f;
                } catch (Throwable th) {
                    this.f11402f.notify();
                    throw th;
                }
            }
        }
    }
}
