package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.common.C4458d;
import java.io.File;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9104b0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;

/* renamed from: com.google.android.play.core.assetpacks.t1 */
public final class C4433t1 implements C9106c0<C4429s1> {

    /* renamed from: a */
    private final C9106c0 f12647a;

    /* renamed from: b */
    private final C9106c0 f12648b;

    /* renamed from: c */
    private final C9106c0 f12649c;

    /* renamed from: d */
    private final C9106c0 f12650d;

    /* renamed from: e */
    private final C9106c0 f12651e;

    /* renamed from: f */
    private final C9106c0 f12652f;

    /* renamed from: g */
    private final /* synthetic */ int f12653g = 0;

    public C4433t1(C9106c0<C4439v> c0Var, C9106c0<C4430s2> c0Var2, C9106c0<C4357a1> c0Var3, C9106c0<Executor> c0Var4, C9106c0<C4412o0> c0Var5, C9106c0<C4458d> c0Var6) {
        this.f12647a = c0Var;
        this.f12648b = c0Var2;
        this.f12649c = c0Var3;
        this.f12650d = c0Var4;
        this.f12651e = c0Var5;
        this.f12652f = c0Var6;
    }

    public C4433t1(C9106c0<String> c0Var, C9106c0<C4427s> c0Var2, C9106c0<C4412o0> c0Var3, C9106c0<Context> c0Var4, C9106c0<C4437u1> c0Var5, C9106c0<Executor> c0Var6, byte[] bArr) {
        this.f12652f = c0Var;
        this.f12648b = c0Var2;
        this.f12651e = c0Var3;
        this.f12650d = c0Var4;
        this.f12649c = c0Var5;
        this.f12647a = c0Var6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        if (this.f12653g != 0) {
            String str = (String) this.f12652f.mo13826a();
            Object a = this.f12648b.mo13826a();
            Object a2 = this.f12651e.mo13826a();
            Context b = ((C4414o2) this.f12650d).mo13826a();
            Object a3 = this.f12649c.mo13826a();
            return new C4389i1(str != null ? new File(b.getExternalFilesDir((String) null), str) : b.getExternalFilesDir((String) null), (C4427s) a, (C4412o0) a2, b, (C4437u1) a3, C9104b0.m30332c(this.f12647a));
        }
        Object a4 = this.f12647a.mo13826a();
        return new C4429s1((C4439v) a4, C9104b0.m30332c(this.f12648b), (C4357a1) this.f12649c.mo13826a(), C9104b0.m30332c(this.f12650d), (C4412o0) this.f12651e.mo13826a(), (C4458d) this.f12652f.mo13826a());
    }
}
