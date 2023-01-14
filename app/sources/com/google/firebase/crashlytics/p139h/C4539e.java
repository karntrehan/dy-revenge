package com.google.firebase.crashlytics.p139h;

import android.content.Context;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.firebase.crashlytics.h.e */
public class C4539e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f12871a;

    /* renamed from: b */
    private C4541b f12872b = null;

    /* renamed from: com.google.firebase.crashlytics.h.e$b */
    private class C4541b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f12873a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f12874b;

        private C4541b() {
            int q = C4577n.m17388q(C4539e.this.f12871a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q != 0) {
                this.f12873a = "Unity";
                String string = C4539e.this.f12871a.getResources().getString(q);
                this.f12874b = string;
                C4542f f = C4542f.m17259f();
                f.mo14110i("Unity Editor version is: " + string);
            } else if (C4539e.this.m17251c("flutter_assets/NOTICES.Z")) {
                this.f12873a = "Flutter";
                this.f12874b = null;
                C4542f.m17259f().mo14110i("Development platform is: Flutter");
            } else {
                this.f12873a = null;
                this.f12874b = null;
            }
        }
    }

    public C4539e(Context context) {
        this.f12871a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m17251c(String str) {
        if (this.f12871a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f12871a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private C4541b m17252f() {
        if (this.f12872b == null) {
            this.f12872b = new C4541b();
        }
        return this.f12872b;
    }

    /* renamed from: g */
    public static boolean m17253g(Context context) {
        return C4577n.m17388q(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    /* renamed from: d */
    public String mo14102d() {
        return m17252f().f12873a;
    }

    /* renamed from: e */
    public String mo14103e() {
        return m17252f().f12874b;
    }
}
