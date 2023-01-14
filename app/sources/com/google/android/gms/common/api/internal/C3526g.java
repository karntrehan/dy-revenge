package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.C1214c;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.internal.g */
public class C3526g {

    /* renamed from: a */
    private final Object f9954a;

    public C3526g(Activity activity) {
        C3705r.m14347l(activity, "Activity must not be null");
        this.f9954a = activity;
    }

    /* renamed from: a */
    public final Activity mo11325a() {
        return (Activity) this.f9954a;
    }

    /* renamed from: b */
    public final C1214c mo11326b() {
        return (C1214c) this.f9954a;
    }

    /* renamed from: c */
    public final boolean mo11327c() {
        return this.f9954a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo11328d() {
        return this.f9954a instanceof C1214c;
    }
}
