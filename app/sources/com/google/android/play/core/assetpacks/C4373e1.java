package com.google.android.play.core.assetpacks;

import android.content.Context;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;

/* renamed from: com.google.android.play.core.assetpacks.e1 */
public final class C4373e1 implements C9106c0<C4369d1> {

    /* renamed from: a */
    private final C9106c0 f12428a;

    /* renamed from: b */
    private final C9106c0 f12429b;

    /* renamed from: c */
    private final C9106c0 f12430c;

    /* renamed from: d */
    private final /* synthetic */ int f12431d = 0;

    public C4373e1(C9106c0<C4357a1> c0Var, C9106c0<C4439v> c0Var2, C9106c0<C4364c0> c0Var3) {
        this.f12428a = c0Var;
        this.f12429b = c0Var2;
        this.f12430c = c0Var3;
    }

    public C4373e1(C9106c0<Context> c0Var, C9106c0<C4411o> c0Var2, C9106c0<C4389i1> c0Var3, byte[] bArr) {
        this.f12430c = c0Var;
        this.f12429b = c0Var2;
        this.f12428a = c0Var3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        if (this.f12431d != 0) {
            C4430s2 s2Var = (C4430s2) (C4398k2.m16875b(((C4414o2) this.f12430c).mo13904b()) == null ? C9104b0.m30332c(this.f12429b).mo13826a() : C9104b0.m30332c(this.f12428a).mo13826a());
            C9127n.m30388d(s2Var);
            return s2Var;
        }
        return new C4369d1((C4357a1) this.f12428a.mo13826a(), (C4439v) this.f12429b.mo13826a(), (C4364c0) this.f12430c.mo13826a());
    }
}
