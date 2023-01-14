package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
public class C3419w {

    /* renamed from: a */
    private final Executor f9681a;

    /* renamed from: b */
    private final C6501j0 f9682b;

    /* renamed from: c */
    private final C3421y f9683c;

    /* renamed from: d */
    private final C6547b f9684d;

    C3419w(Executor executor, C6501j0 j0Var, C3421y yVar, C6547b bVar) {
        this.f9681a = executor;
        this.f9682b = j0Var;
        this.f9683c = yVar;
        this.f9684d = bVar;
    }

    /* renamed from: b */
    private /* synthetic */ Object m13342b() {
        for (C6583p a : this.f9682b.mo19287y()) {
            this.f9683c.mo10984a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo11024e() {
        this.f9684d.mo19302b(new C3403m(this));
    }

    /* renamed from: a */
    public void mo11022a() {
        this.f9681a.execute(new C3404n(this));
    }

    /* renamed from: c */
    public /* synthetic */ Object mo11023c() {
        m13342b();
        return null;
    }
}
