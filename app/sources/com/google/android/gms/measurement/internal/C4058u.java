package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.u */
final class C4058u implements Iterator {

    /* renamed from: f */
    final Iterator f11308f;

    /* renamed from: o */
    final /* synthetic */ C4070v f11309o;

    C4058u(C4070v vVar) {
        this.f11309o = vVar;
        this.f11308f = vVar.f11333f.keySet().iterator();
    }

    /* renamed from: b */
    public final String next() {
        return (String) this.f11308f.next();
    }

    public final boolean hasNext() {
        return this.f11308f.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
