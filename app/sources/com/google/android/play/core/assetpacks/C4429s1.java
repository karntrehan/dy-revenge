package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C4458d;
import java.io.File;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.s1 */
final class C4429s1 {

    /* renamed from: a */
    private final C4439v f12638a;

    /* renamed from: b */
    private final C9147z<C4430s2> f12639b;

    /* renamed from: c */
    private final C4357a1 f12640c;

    /* renamed from: d */
    private final C9147z<Executor> f12641d;

    /* renamed from: e */
    private final C4412o0 f12642e;

    /* renamed from: f */
    private final C4458d f12643f;

    C4429s1(C4439v vVar, C9147z<C4430s2> zVar, C4357a1 a1Var, C9147z<Executor> zVar2, C4412o0 o0Var, C4458d dVar) {
        this.f12638a = vVar;
        this.f12639b = zVar;
        this.f12640c = a1Var;
        this.f12641d = zVar2;
        this.f12642e = o0Var;
        this.f12643f = dVar;
    }

    /* renamed from: a */
    public final void mo13915a(C4417p1 p1Var) {
        Runnable runnable;
        Executor executor;
        File x = this.f12638a.mo13943x(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
        File D = this.f12638a.mo13924D(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
        if (!x.exists() || !D.exists()) {
            throw new C4396k0(String.format("Cannot find pack files to move for pack %s.", new Object[]{p1Var.f12403b}), p1Var.f12402a);
        }
        File t = this.f12638a.mo13939t(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
        t.mkdirs();
        if (x.renameTo(t)) {
            new File(this.f12638a.mo13939t(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d), "merge.tmp").delete();
            File u = this.f12638a.mo13940u(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
            u.mkdirs();
            if (D.renameTo(u)) {
                if (this.f12643f.mo13985a()) {
                    executor = this.f12641d.mo13826a();
                    runnable = new C4421q1(this, p1Var);
                } else {
                    executor = this.f12641d.mo13826a();
                    C4439v vVar = this.f12638a;
                    vVar.getClass();
                    runnable = C4425r1.m16930a(vVar);
                }
                executor.execute(runnable);
                this.f12640c.mo13811f(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
                this.f12642e.mo13901a(p1Var.f12403b);
                this.f12639b.mo13826a().mo13866d(p1Var.f12402a, p1Var.f12403b);
                return;
            }
            throw new C4396k0("Cannot move metadata files to final location.", p1Var.f12402a);
        }
        throw new C4396k0("Cannot move merged pack files to final location.", p1Var.f12402a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13916b(C4417p1 p1Var) {
        this.f12638a.mo13925E(p1Var.f12403b, p1Var.f12607c, p1Var.f12608d);
    }
}
