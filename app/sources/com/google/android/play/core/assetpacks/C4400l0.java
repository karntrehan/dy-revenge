package com.google.android.play.core.assetpacks;

import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;

/* renamed from: com.google.android.play.core.assetpacks.l0 */
final class C4400l0 {

    /* renamed from: a */
    private static final C9101a f12542a = new C9101a("ExtractorLooper");

    /* renamed from: b */
    private final C4357a1 f12543b;

    /* renamed from: c */
    private final C4392j0 f12544c;

    /* renamed from: d */
    private final C4366c2 f12545d;

    /* renamed from: e */
    private final C4409n1 f12546e;

    /* renamed from: f */
    private final C4429s1 f12547f;

    /* renamed from: g */
    private final C4445w1 f12548g;

    /* renamed from: h */
    private final C9147z<C4430s2> f12549h;

    /* renamed from: i */
    private final C4369d1 f12550i;

    /* renamed from: j */
    private final AtomicBoolean f12551j = new AtomicBoolean(false);

    C4400l0(C4357a1 a1Var, C9147z<C4430s2> zVar, C4392j0 j0Var, C4366c2 c2Var, C4409n1 n1Var, C4429s1 s1Var, C4445w1 w1Var, C4369d1 d1Var) {
        this.f12543b = a1Var;
        this.f12549h = zVar;
        this.f12544c = j0Var;
        this.f12545d = c2Var;
        this.f12546e = n1Var;
        this.f12547f = s1Var;
        this.f12548g = w1Var;
        this.f12550i = d1Var;
    }

    /* renamed from: b */
    private final void m16878b(int i, Exception exc) {
        try {
            this.f12543b.mo13820o(i);
            this.f12543b.mo13812g(i);
        } catch (C4396k0 unused) {
            f12542a.mo23081b("Error during error handling: %s", exc.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13892a() {
        C9101a aVar = f12542a;
        aVar.mo23080a("Run extractor loop", new Object[0]);
        if (this.f12551j.compareAndSet(false, true)) {
            while (true) {
                C4365c1 c1Var = null;
                try {
                    c1Var = this.f12550i.mo13837a();
                } catch (C4396k0 e) {
                    f12542a.mo23081b("Error while getting next extraction task: %s", e.getMessage());
                    if (e.f12537f >= 0) {
                        this.f12549h.mo13826a().mo13864b(e.f12537f);
                        m16878b(e.f12537f, e);
                    }
                }
                if (c1Var != null) {
                    try {
                        if (c1Var instanceof C4388i0) {
                            this.f12544c.mo13885a((C4388i0) c1Var);
                        } else if (c1Var instanceof C4362b2) {
                            this.f12545d.mo13828a((C4362b2) c1Var);
                        } else if (c1Var instanceof C4405m1) {
                            this.f12546e.mo13900a((C4405m1) c1Var);
                        } else if (c1Var instanceof C4417p1) {
                            this.f12547f.mo13915a((C4417p1) c1Var);
                        } else if (c1Var instanceof C4441v1) {
                            this.f12548g.mo13949a((C4441v1) c1Var);
                        } else {
                            f12542a.mo23081b("Unknown task type: %s", c1Var.getClass().getName());
                        }
                    } catch (Exception e2) {
                        f12542a.mo23081b("Error during extraction task: %s", e2.getMessage());
                        this.f12549h.mo13826a().mo13864b(c1Var.f12402a);
                        m16878b(c1Var.f12402a, e2);
                    }
                } else {
                    this.f12551j.set(false);
                    return;
                }
            }
        } else {
            aVar.mo23084e("runLoop already looping; return", new Object[0]);
        }
    }
}
