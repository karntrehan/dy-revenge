package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.C3453o;
import com.google.android.gms.common.C3629e;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.api.C3483e;
import com.google.android.gms.common.api.internal.C3495a;
import com.google.android.gms.common.api.internal.C3566p;
import com.google.android.gms.common.internal.C3701q;
import com.google.android.gms.dynamite.DynamiteModule;
import p174e.p319f.p320a.p335c.p338b.p339a.C6619a;
import p174e.p319f.p320a.p335c.p362h.C8963l;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public class C3432c extends C3483e<GoogleSignInOptions> {

    /* renamed from: k */
    private static final C3465k f9766k = new C3465k((C3464j) null);

    /* renamed from: l */
    static int f9767l = 1;

    C3432c(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C6619a.f18280c, googleSignInOptions, (C3566p) new C3495a());
    }

    /* renamed from: r */
    private final synchronized int m13417r() {
        int i;
        i = f9767l;
        if (i == 1) {
            Context h = mo11208h();
            C3629e q = C3629e.m14086q();
            int j = q.mo11485j(h, C3637i.f10216a);
            if (j == 0) {
                f9767l = 4;
                i = 4;
            } else if (q.mo11481d(h, j, (String) null) != null || DynamiteModule.m14548a(h, "com.google.android.gms.auth.api.fallback") == 0) {
                f9767l = 2;
                i = 2;
            } else {
                f9767l = 3;
                i = 3;
            }
        }
        return i;
    }

    /* renamed from: p */
    public C8963l<Void> mo11099p() {
        return C3701q.m14329b(C3453o.m13462b(mo11202b(), mo11208h(), m13417r() == 3));
    }

    /* renamed from: q */
    public C8963l<Void> mo11100q() {
        return C3701q.m14329b(C3453o.m13463c(mo11202b(), mo11208h(), m13417r() == 3));
    }
}
