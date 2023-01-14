package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.uimanager.d */
public class C2929d {

    /* renamed from: a */
    private C3025n0 f8208a = null;

    /* renamed from: com.facebook.react.uimanager.d$a */
    public interface C2930a {
        /* renamed from: a */
        WritableMap mo9497a();
    }

    /* renamed from: d */
    private void m11513d(C3025n0 n0Var, C2930a aVar, int i) {
        WritableMap a;
        if (n0Var == null) {
            C6071a.m22875i("FabricViewStateManager", "setState called without a StateWrapper");
        } else if (n0Var == this.f8208a && i <= 60 && (a = aVar.mo9497a()) != null) {
            n0Var.mo9792a(a);
        }
    }

    /* renamed from: a */
    public ReadableMap mo9493a() {
        C3025n0 n0Var = this.f8208a;
        if (n0Var != null) {
            return n0Var.mo9793b();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo9494b() {
        return this.f8208a != null;
    }

    /* renamed from: c */
    public void mo9495c(C2930a aVar) {
        m11513d(this.f8208a, aVar, 0);
    }

    /* renamed from: e */
    public void mo9496e(C3025n0 n0Var) {
        this.f8208a = n0Var;
    }
}
