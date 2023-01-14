package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.internal.C3697p;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
final class C3539i1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3500b<?> f9985a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3627d f9986b;

    /* synthetic */ C3539i1(C3500b bVar, C3627d dVar, C3533h1 h1Var) {
        this.f9985a = bVar;
        this.f9986b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C3539i1)) {
            C3539i1 i1Var = (C3539i1) obj;
            return C3697p.m14323b(this.f9985a, i1Var.f9985a) && C3697p.m14323b(this.f9986b, i1Var.f9986b);
        }
    }

    public final int hashCode() {
        return C3697p.m14324c(this.f9985a, this.f9986b);
    }

    public final String toString() {
        return C3697p.m14325d(this).mo11646a("key", this.f9985a).mo11646a("feature", this.f9986b).toString();
    }
}
