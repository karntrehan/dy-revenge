package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p140h.C4545b;
import java.util.Locale;

/* renamed from: com.google.firebase.crashlytics.f */
class C4531f implements C4466a.C4468b {

    /* renamed from: a */
    private C4545b f12861a;

    /* renamed from: b */
    private C4545b f12862b;

    C4531f() {
    }

    /* renamed from: b */
    private static void m17225b(C4545b bVar, String str, Bundle bundle) {
        if (bVar != null) {
            bVar.mo14114l(str, bundle);
        }
    }

    /* renamed from: c */
    private void m17226c(String str, Bundle bundle) {
        m17225b("clx".equals(bundle.getString("_o")) ? this.f12861a : this.f12862b, str, bundle);
    }

    /* renamed from: a */
    public void mo14002a(int i, Bundle bundle) {
        String string;
        C4542f.m17259f().mo14110i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m17226c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void mo14089d(C4545b bVar) {
        this.f12862b = bVar;
    }

    /* renamed from: e */
    public void mo14090e(C4545b bVar) {
        this.f12861a = bVar;
    }
}
