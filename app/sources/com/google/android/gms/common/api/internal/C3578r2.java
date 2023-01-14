package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3481c;
import java.util.Map;
import java.util.Set;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.api.internal.r2 */
public final class C3578r2 {

    /* renamed from: a */
    private final C1788a<C3500b<?>, C3623b> f10072a;

    /* renamed from: b */
    private final C1788a<C3500b<?>, String> f10073b;

    /* renamed from: c */
    private final C8965m<Map<C3500b<?>, String>> f10074c;

    /* renamed from: d */
    private int f10075d;

    /* renamed from: e */
    private boolean f10076e;

    /* renamed from: a */
    public final Set<C3500b<?>> mo11414a() {
        return this.f10072a.keySet();
    }

    /* renamed from: b */
    public final void mo11415b(C3500b<?> bVar, C3623b bVar2, String str) {
        this.f10072a.put(bVar, bVar2);
        this.f10073b.put(bVar, str);
        this.f10075d--;
        if (!bVar2.mo11458E()) {
            this.f10076e = true;
        }
        if (this.f10075d != 0) {
            return;
        }
        if (this.f10076e) {
            this.f10074c.mo22783b(new C3481c(this.f10072a));
            return;
        }
        this.f10074c.mo22784c(this.f10073b);
    }
}
