package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.p135a.C3800a;
import com.google.firebase.analytics.p138a.C4466a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.d */
public final class C4477d {

    /* renamed from: a */
    final Set f12766a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4466a.C4468b f12767b;

    /* renamed from: c */
    private final C3800a f12768c;

    /* renamed from: d */
    private final C4476c f12769d;

    public C4477d(C3800a aVar, C4466a.C4468b bVar) {
        this.f12767b = bVar;
        this.f12768c = aVar;
        C4476c cVar = new C4476c(this);
        this.f12769d = cVar;
        aVar.mo11785b(cVar);
    }
}
