package com.google.android.gms.common.p133n;

import android.content.Context;

/* renamed from: com.google.android.gms.common.n.c */
public class C3746c {

    /* renamed from: a */
    private static C3746c f10436a = new C3746c();

    /* renamed from: b */
    private C3745b f10437b = null;

    /* renamed from: a */
    public static C3745b m14493a(Context context) {
        return f10436a.mo11722b(context);
    }

    /* renamed from: b */
    public final synchronized C3745b mo11722b(Context context) {
        if (this.f10437b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f10437b = new C3745b(context);
        }
        return this.f10437b;
    }
}
