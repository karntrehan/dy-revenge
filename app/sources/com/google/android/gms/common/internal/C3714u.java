package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C3740k;

/* renamed from: com.google.android.gms.common.internal.u */
public class C3714u {

    /* renamed from: a */
    private final Resources f10389a;

    /* renamed from: b */
    private final String f10390b;

    public C3714u(Context context) {
        C3705r.m14346k(context);
        Resources resources = context.getResources();
        this.f10389a = resources;
        this.f10390b = resources.getResourcePackageName(C3740k.common_google_play_services_unknown_issue);
    }

    /* renamed from: a */
    public String mo11679a(String str) {
        int identifier = this.f10389a.getIdentifier(str, "string", this.f10390b);
        if (identifier == 0) {
            return null;
        }
        return this.f10389a.getString(identifier);
    }
}
