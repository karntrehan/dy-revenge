package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j */
public class C3542j {

    /* renamed from: a */
    private final Set<C3536i<?>> f9997a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo11374a() {
        for (C3536i<?> a : this.f9997a) {
            a.mo11365a();
        }
        this.f9997a.clear();
    }
}
