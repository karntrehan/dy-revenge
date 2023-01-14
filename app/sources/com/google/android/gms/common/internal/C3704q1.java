package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.q1 */
public final class C3704q1 {

    /* renamed from: a */
    private static final Uri f10363a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: b */
    private final String f10364b;

    /* renamed from: c */
    private final String f10365c;

    /* renamed from: d */
    private final ComponentName f10366d = null;

    /* renamed from: e */
    private final int f10367e;

    /* renamed from: f */
    private final boolean f10368f;

    public C3704q1(String str, String str2, int i, boolean z) {
        C3705r.m14342g(str);
        this.f10364b = str;
        C3705r.m14342g(str2);
        this.f10365c = str2;
        this.f10367e = i;
        this.f10368f = z;
    }

    /* renamed from: a */
    public final int mo11650a() {
        return this.f10367e;
    }

    /* renamed from: b */
    public final ComponentName mo11651b() {
        return this.f10366d;
    }

    /* renamed from: c */
    public final Intent mo11652c(Context context) {
        Bundle bundle;
        if (this.f10364b == null) {
            return new Intent().setComponent(this.f10366d);
        }
        Intent intent = null;
        if (this.f10368f) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f10364b);
            try {
                bundle = context.getContentResolver().call(f10363a, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.f10364b);
                Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return intent != null ? intent : new Intent(this.f10364b).setPackage(this.f10365c);
    }

    /* renamed from: d */
    public final String mo11653d() {
        return this.f10365c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3704q1)) {
            return false;
        }
        C3704q1 q1Var = (C3704q1) obj;
        return C3697p.m14323b(this.f10364b, q1Var.f10364b) && C3697p.m14323b(this.f10365c, q1Var.f10365c) && C3697p.m14323b(this.f10366d, q1Var.f10366d) && this.f10367e == q1Var.f10367e && this.f10368f == q1Var.f10368f;
    }

    public final int hashCode() {
        return C3697p.m14324c(this.f10364b, this.f10365c, this.f10366d, Integer.valueOf(this.f10367e), Boolean.valueOf(this.f10368f));
    }

    public final String toString() {
        String str = this.f10364b;
        if (str != null) {
            return str;
        }
        C3705r.m14346k(this.f10366d);
        return this.f10366d.flattenToString();
    }
}
