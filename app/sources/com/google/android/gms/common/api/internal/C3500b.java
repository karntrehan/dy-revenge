package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3473d;
import com.google.android.gms.common.internal.C3697p;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C3500b<O extends C3469a.C3473d> {

    /* renamed from: a */
    private final int f9893a;

    /* renamed from: b */
    private final C3469a<O> f9894b;

    /* renamed from: c */
    private final O f9895c;

    /* renamed from: d */
    private final String f9896d;

    private C3500b(C3469a<O> aVar, O o, String str) {
        this.f9894b = aVar;
        this.f9895c = o;
        this.f9896d = str;
        this.f9893a = C3697p.m14324c(aVar, o, str);
    }

    /* renamed from: a */
    public static <O extends C3469a.C3473d> C3500b<O> m13607a(C3469a<O> aVar, O o, String str) {
        return new C3500b<>(aVar, o, str);
    }

    /* renamed from: b */
    public final String mo11262b() {
        return this.f9894b.mo11179d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3500b)) {
            return false;
        }
        C3500b bVar = (C3500b) obj;
        return C3697p.m14323b(this.f9894b, bVar.f9894b) && C3697p.m14323b(this.f9895c, bVar.f9895c) && C3697p.m14323b(this.f9896d, bVar.f9896d);
    }

    public final int hashCode() {
        return this.f9893a;
    }
}
