package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;

/* renamed from: com.google.android.gms.common.api.internal.f3 */
final class C3525f3 implements C3564o1 {

    /* renamed from: a */
    final /* synthetic */ C3583t f9953a;

    /* synthetic */ C3525f3(C3583t tVar, C3520e3 e3Var) {
        this.f9953a = tVar;
    }

    /* renamed from: a */
    public final void mo11305a(Bundle bundle) {
        this.f9953a.f10097m.lock();
        try {
            this.f9953a.f10095k = C3623b.f10185f;
            C3583t.m13944x(this.f9953a);
        } finally {
            this.f9953a.f10097m.unlock();
        }
    }

    /* renamed from: b */
    public final void mo11306b(int i, boolean z) {
        this.f9953a.f10097m.lock();
        try {
            C3583t tVar = this.f9953a;
            if (tVar.f10096l) {
                tVar.f10096l = false;
                C3583t.m13942v(this.f9953a, i, z);
            } else {
                tVar.f10096l = true;
                this.f9953a.f10088d.mo11294j(i);
            }
        } finally {
            this.f9953a.f10097m.unlock();
        }
    }

    /* renamed from: c */
    public final void mo11307c(C3623b bVar) {
        this.f9953a.f10097m.lock();
        try {
            this.f9953a.f10095k = bVar;
            C3583t.m13944x(this.f9953a);
        } finally {
            this.f9953a.f10097m.unlock();
        }
    }
}
