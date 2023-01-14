package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;

/* renamed from: com.google.android.gms.common.api.internal.d3 */
final class C3515d3 implements C3564o1 {

    /* renamed from: a */
    final /* synthetic */ C3583t f9922a;

    /* synthetic */ C3515d3(C3583t tVar, C3510c3 c3Var) {
        this.f9922a = tVar;
    }

    /* renamed from: a */
    public final void mo11305a(Bundle bundle) {
        this.f9922a.f10097m.lock();
        try {
            C3583t.m13943w(this.f9922a, bundle);
            this.f9922a.f10094j = C3623b.f10185f;
            C3583t.m13944x(this.f9922a);
        } finally {
            this.f9922a.f10097m.unlock();
        }
    }

    /* renamed from: b */
    public final void mo11306b(int i, boolean z) {
        this.f9922a.f10097m.lock();
        try {
            C3583t tVar = this.f9922a;
            if (!tVar.f10096l && tVar.f10095k != null) {
                if (tVar.f10095k.mo11458E()) {
                    this.f9922a.f10096l = true;
                    this.f9922a.f10089e.mo11294j(i);
                }
            }
            this.f9922a.f10096l = false;
            C3583t.m13942v(this.f9922a, i, z);
        } finally {
            this.f9922a.f10097m.unlock();
        }
    }

    /* renamed from: c */
    public final void mo11307c(C3623b bVar) {
        this.f9922a.f10097m.lock();
        try {
            this.f9922a.f10094j = bVar;
            C3583t.m13944x(this.f9922a);
        } finally {
            this.f9922a.f10097m.unlock();
        }
    }
}
