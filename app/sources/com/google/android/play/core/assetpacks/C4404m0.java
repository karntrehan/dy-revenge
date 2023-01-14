package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.m0 */
public final class C4404m0 implements C9106c0<C4400l0> {

    /* renamed from: a */
    private final C9106c0 f12563a;

    /* renamed from: b */
    private final C9106c0 f12564b;

    /* renamed from: c */
    private final C9106c0 f12565c;

    /* renamed from: d */
    private final C9106c0 f12566d;

    /* renamed from: e */
    private final C9106c0 f12567e;

    /* renamed from: f */
    private final C9106c0 f12568f;

    /* renamed from: g */
    private final C9106c0 f12569g;

    /* renamed from: h */
    private final C9106c0 f12570h;

    /* renamed from: i */
    private final /* synthetic */ int f12571i = 0;

    public C4404m0(C9106c0<C4357a1> c0Var, C9106c0<C4430s2> c0Var2, C9106c0<C4392j0> c0Var3, C9106c0<C4366c2> c0Var4, C9106c0<C4409n1> c0Var5, C9106c0<C4429s1> c0Var6, C9106c0<C4445w1> c0Var7, C9106c0<C4369d1> c0Var8) {
        this.f12563a = c0Var;
        this.f12564b = c0Var2;
        this.f12565c = c0Var3;
        this.f12566d = c0Var4;
        this.f12567e = c0Var5;
        this.f12568f = c0Var6;
        this.f12569g = c0Var7;
        this.f12570h = c0Var8;
    }

    public C4404m0(C9106c0<Context> c0Var, C9106c0<C4357a1> c0Var2, C9106c0<C4400l0> c0Var3, C9106c0<C4430s2> c0Var4, C9106c0<C4412o0> c0Var5, C9106c0<C4372e0> c0Var6, C9106c0<Executor> c0Var7, C9106c0<Executor> c0Var8, byte[] bArr) {
        this.f12563a = c0Var;
        this.f12569g = c0Var2;
        this.f12570h = c0Var3;
        this.f12564b = c0Var4;
        this.f12567e = c0Var5;
        this.f12568f = c0Var6;
        this.f12565c = c0Var7;
        this.f12566d = c0Var8;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        if (this.f12571i != 0) {
            Context b = ((C4414o2) this.f12563a).mo13826a();
            Object a = this.f12569g.mo13826a();
            Object a2 = this.f12570h.mo13826a();
            C9147z c = C9104b0.m30332c(this.f12564b);
            Object a3 = this.f12567e.mo13826a();
            Object a4 = this.f12568f.mo13826a();
            return new C4427s(b, (C4357a1) a, (C4400l0) a2, c, (C4412o0) a3, (C4372e0) a4, C9104b0.m30332c(this.f12565c), C9104b0.m30332c(this.f12566d));
        }
        Object a5 = this.f12563a.mo13826a();
        return new C4400l0((C4357a1) a5, C9104b0.m30332c(this.f12564b), (C4392j0) this.f12565c.mo13826a(), (C4366c2) this.f12566d.mo13826a(), (C4409n1) this.f12567e.mo13826a(), (C4429s1) this.f12568f.mo13826a(), (C4445w1) this.f12569g.mo13826a(), (C4369d1) this.f12570h.mo13826a());
    }
}
