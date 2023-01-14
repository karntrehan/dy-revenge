package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C4458d;
import java.util.List;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;
import p174e.p319f.p320a.p382e.p383a.p388e.C9152a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;

/* renamed from: com.google.android.play.core.assetpacks.h2 */
final class C4386h2 {

    /* renamed from: a */
    private static final C9101a f12485a = new C9101a("AssetPackManager");

    /* renamed from: b */
    private final C4439v f12486b;

    /* renamed from: c */
    private final C9147z<C4430s2> f12487c;

    /* renamed from: d */
    private final C4427s f12488d;

    /* renamed from: e */
    private final C9152a f12489e;

    /* renamed from: f */
    private final C4357a1 f12490f;

    /* renamed from: g */
    private final C4412o0 f12491g;

    /* renamed from: h */
    private final C4372e0 f12492h;

    /* renamed from: i */
    private final C9147z<Executor> f12493i;

    /* renamed from: j */
    private final C4458d f12494j;

    /* renamed from: k */
    private final Handler f12495k = new Handler(Looper.getMainLooper());

    C4386h2(C4439v vVar, C9147z<C4430s2> zVar, C4427s sVar, C9152a aVar, C4357a1 a1Var, C4412o0 o0Var, C4372e0 e0Var, C9147z<Executor> zVar2, C4458d dVar) {
        this.f12486b = vVar;
        this.f12487c = zVar;
        this.f12488d = sVar;
        this.f12489e = aVar;
        this.f12490f = a1Var;
        this.f12491g = o0Var;
        this.f12492h = e0Var;
        this.f12493i = zVar2;
        this.f12494j = dVar;
    }

    /* renamed from: e */
    private final void m16830e() {
        this.f12493i.mo13826a().execute(new C4374e2(this, (byte[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13859a(boolean z) {
        boolean g = this.f12488d.mo23125g();
        this.f12488d.mo23121c(z);
        if (z && !g) {
            m16830e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo13860b() {
        this.f12486b.mo13929I();
        this.f12486b.mo13926F();
        this.f12486b.mo13930J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo13861c() {
        C9156d<List<String>> f = this.f12487c.mo13826a().mo13868f(this.f12486b.mo13936q());
        C4439v vVar = this.f12486b;
        vVar.getClass();
        f.mo23129d(this.f12493i.mo13826a(), C4378f2.m16820b(vVar));
        f.mo23127b(this.f12493i.mo13826a(), C4382g2.f12449a);
    }
}
