package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3678j;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
final class C3544j1 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C3623b f10000f;

    /* renamed from: o */
    final /* synthetic */ C3548k1 f10001o;

    C3544j1(C3548k1 k1Var, C3623b bVar) {
        this.f10001o = k1Var;
        this.f10000f = bVar;
    }

    public final void run() {
        C3548k1 k1Var = this.f10001o;
        C3528g1 g1Var = (C3528g1) k1Var.f10021f.f9942p.get(k1Var.f10017b);
        if (g1Var != null) {
            if (this.f10000f.mo11458E()) {
                this.f10001o.f10020e = true;
                if (this.f10001o.f10016a.mo11199t()) {
                    this.f10001o.m13796h();
                    return;
                }
                try {
                    C3548k1 k1Var2 = this.f10001o;
                    k1Var2.f10016a.mo11188d((C3678j) null, k1Var2.f10016a.mo11187c());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    this.f10001o.f10016a.mo11189e("Failed to get service from broker.");
                    g1Var.mo11333H(new C3623b(10), (Exception) null);
                }
            } else {
                g1Var.mo11333H(this.f10000f, (Exception) null);
            }
        }
    }
}
