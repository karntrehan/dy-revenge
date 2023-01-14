package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
final class C4127z8 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ AtomicReference f11466f;

    /* renamed from: o */
    final /* synthetic */ String f11467o;

    /* renamed from: p */
    final /* synthetic */ String f11468p;

    /* renamed from: q */
    final /* synthetic */ C3844cb f11469q;

    /* renamed from: r */
    final /* synthetic */ boolean f11470r;

    /* renamed from: s */
    final /* synthetic */ C3894g9 f11471s;

    C4127z8(C3894g9 g9Var, AtomicReference atomicReference, String str, String str2, String str3, C3844cb cbVar, boolean z) {
        this.f11471s = g9Var;
        this.f11466f = atomicReference;
        this.f11467o = str2;
        this.f11468p = str3;
        this.f11469q = cbVar;
        this.f11470r = z;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List w;
        synchronized (this.f11466f) {
            try {
                C3894g9 g9Var = this.f11471s;
                C4002p3 H = g9Var.f10698d;
                if (H == null) {
                    g9Var.f10651a.mo11935b().mo12544r().mo12479d("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f11467o, this.f11468p);
                    this.f11466f.set(Collections.emptyList());
                    this.f11466f.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    C3705r.m14346k(this.f11469q);
                    atomicReference2 = this.f11466f;
                    w = H.mo11919v0(this.f11467o, this.f11468p, this.f11470r, this.f11469q);
                } else {
                    atomicReference2 = this.f11466f;
                    w = H.mo11920w((String) null, this.f11467o, this.f11468p, this.f11470r);
                }
                atomicReference2.set(w);
                this.f11471s.m14779E();
                atomicReference = this.f11466f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f11471s.f10651a.mo11935b().mo12544r().mo12479d("(legacy) Failed to get user properties; remote exception", (Object) null, this.f11467o, e);
                    this.f11466f.set(Collections.emptyList());
                    atomicReference = this.f11466f;
                } catch (Throwable th) {
                    this.f11466f.notify();
                    throw th;
                }
            }
        }
    }
}
