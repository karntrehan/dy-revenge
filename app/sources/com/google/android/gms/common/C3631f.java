package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3722w1;
import com.google.android.gms.common.p133n.C3746c;
import com.google.android.gms.common.util.C3762i;
import p174e.p319f.p320a.p335c.p345f.p351f.C6690d;

/* renamed from: com.google.android.gms.common.f */
public class C3631f {

    /* renamed from: a */
    public static final int f10208a = C3637i.f10216a;

    /* renamed from: b */
    private static final C3631f f10209b = new C3631f();

    C3631f() {
    }

    /* renamed from: h */
    public static C3631f m14110h() {
        return f10209b;
    }

    /* renamed from: a */
    public void mo11503a(Context context) {
        C3637i.m14124a(context);
    }

    /* renamed from: b */
    public int mo11504b(Context context) {
        return C3637i.m14125b(context);
    }

    @Deprecated
    /* renamed from: c */
    public Intent mo11505c(int i) {
        return mo11481d((Context) null, i, (String) null);
    }

    /* renamed from: d */
    public Intent mo11481d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C3762i.m14517d(context)) {
                return C3722w1.m14388a();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f10208a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C3746c.m14493a(context).mo11719d(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C3722w1.m14389b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C3722w1.m14390c("com.google.android.gms");
        }
    }

    /* renamed from: e */
    public PendingIntent mo11482e(Context context, int i, int i2) {
        return mo11506f(context, i, i2, (String) null);
    }

    /* renamed from: f */
    public PendingIntent mo11506f(Context context, int i, int i2, String str) {
        Intent d = mo11481d(context, i, str);
        if (d == null) {
            return null;
        }
        return C6690d.m25354a(context, i2, d, C6690d.f18344a | 134217728);
    }

    /* renamed from: g */
    public String mo11483g(int i) {
        return C3637i.m14126c(i);
    }

    /* renamed from: i */
    public int mo11484i(Context context) {
        return mo11485j(context, f10208a);
    }

    /* renamed from: j */
    public int mo11485j(Context context, int i) {
        int f = C3637i.m14129f(context, i);
        if (C3637i.m14130g(context, f)) {
            return 18;
        }
        return f;
    }

    /* renamed from: k */
    public boolean mo11507k(Context context, int i) {
        return C3637i.m14130g(context, i);
    }

    /* renamed from: l */
    public boolean mo11508l(Context context, String str) {
        return C3637i.m14134k(context, str);
    }

    /* renamed from: m */
    public boolean mo11486m(int i) {
        return C3637i.m14132i(i);
    }
}
