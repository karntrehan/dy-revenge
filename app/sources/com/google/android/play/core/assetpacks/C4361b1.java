package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;

/* renamed from: com.google.android.play.core.assetpacks.b1 */
public final class C4361b1 implements C9106c0<C4357a1> {

    /* renamed from: a */
    private final C9106c0 f12392a;

    /* renamed from: b */
    private final C9106c0 f12393b;

    /* renamed from: c */
    private final C9106c0 f12394c;

    /* renamed from: d */
    private final C9106c0 f12395d;

    /* renamed from: e */
    private final /* synthetic */ int f12396e = 0;

    public C4361b1(C9106c0<C4439v> c0Var, C9106c0<C4430s2> c0Var2, C9106c0<C4412o0> c0Var3, C9106c0<Executor> c0Var4) {
        this.f12392a = c0Var;
        this.f12393b = c0Var2;
        this.f12394c = c0Var3;
        this.f12395d = c0Var4;
    }

    public C4361b1(C9106c0<C4439v> c0Var, C9106c0<C4430s2> c0Var2, C9106c0<C4427s> c0Var3, C9106c0<C4412o0> c0Var4, byte[] bArr) {
        this.f12392a = c0Var;
        this.f12393b = c0Var2;
        this.f12394c = c0Var3;
        this.f12395d = c0Var4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        if (this.f12396e != 0) {
            return new C4392j0((C4439v) this.f12392a.mo13826a(), C9104b0.m30332c(this.f12393b), C9104b0.m30332c(this.f12394c), (C4412o0) this.f12395d.mo13826a());
        }
        Object a = this.f12392a.mo13826a();
        return new C4357a1((C4439v) a, C9104b0.m30332c(this.f12393b), (C4412o0) this.f12394c.mo13826a(), C9104b0.m30332c(this.f12395d));
    }
}
