package org.greenrobot.eventbus;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.C10885g;
import org.greenrobot.eventbus.android.C10873a;
import org.greenrobot.eventbus.p512r.C10900b;

/* renamed from: org.greenrobot.eventbus.d */
public class C10882d {

    /* renamed from: a */
    private static final ExecutorService f28470a = Executors.newCachedThreadPool();

    /* renamed from: b */
    boolean f28471b = true;

    /* renamed from: c */
    boolean f28472c = true;

    /* renamed from: d */
    boolean f28473d = true;

    /* renamed from: e */
    boolean f28474e = true;

    /* renamed from: f */
    boolean f28475f;

    /* renamed from: g */
    boolean f28476g = true;

    /* renamed from: h */
    boolean f28477h;

    /* renamed from: i */
    boolean f28478i;

    /* renamed from: j */
    ExecutorService f28479j = f28470a;

    /* renamed from: k */
    List<C10900b> f28480k;

    /* renamed from: l */
    C10885g f28481l;

    /* renamed from: m */
    C10888h f28482m;

    C10882d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10885g mo28485a() {
        C10885g gVar = this.f28481l;
        return gVar != null ? gVar : C10885g.C10886a.m37026a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10888h mo28486b() {
        C10888h hVar = this.f28482m;
        if (hVar != null) {
            return hVar;
        }
        if (C10873a.m36990a()) {
            return C10873a.m36991b().f28436c;
        }
        return null;
    }
}
