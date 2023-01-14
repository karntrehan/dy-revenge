package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3469a;

/* renamed from: com.google.android.gms.common.internal.y */
public class C3726y implements C3469a.C3473d {

    /* renamed from: f */
    public static final C3726y f10414f = m14400a().mo11701a();

    /* renamed from: o */
    private final String f10415o;

    /* renamed from: com.google.android.gms.common.internal.y$a */
    public static class C3727a {

        /* renamed from: a */
        private String f10416a;

        /* synthetic */ C3727a(C3657c0 c0Var) {
        }

        /* renamed from: a */
        public C3726y mo11701a() {
            return new C3726y(this.f10416a, (C3661d0) null);
        }

        /* renamed from: b */
        public C3727a mo11702b(String str) {
            this.f10416a = str;
            return this;
        }
    }

    /* synthetic */ C3726y(String str, C3661d0 d0Var) {
        this.f10415o = str;
    }

    /* renamed from: a */
    public static C3727a m14400a() {
        return new C3727a((C3657c0) null);
    }

    /* renamed from: c */
    public final Bundle mo11698c() {
        Bundle bundle = new Bundle();
        String str = this.f10415o;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3726y)) {
            return false;
        }
        return C3697p.m14323b(this.f10415o, ((C3726y) obj).f10415o);
    }

    public final int hashCode() {
        return C3697p.m14324c(this.f10415o);
    }
}
