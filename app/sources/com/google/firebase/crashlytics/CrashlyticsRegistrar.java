package com.google.firebase.crashlytics;

import com.google.firebase.C4825h;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4504o;
import com.google.firebase.components.C4510r;
import com.google.firebase.components.C4518u;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.installations.C4839f;
import com.google.firebase.p164r.C4936h;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements C4510r {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public FirebaseCrashlytics m17206a(C4504o oVar) {
        return FirebaseCrashlytics.m17208a((C4825h) oVar.mo14013a(C4825h.class), (C4839f) oVar.mo14013a(C4839f.class), oVar.mo14017e(C4535c.class), oVar.mo14017e(C4466a.class));
    }

    public List<C4501n<?>> getComponents() {
        return Arrays.asList(new C4501n[]{C4501n.m17120a(FirebaseCrashlytics.class).mo14031b(C4518u.m17193i(C4825h.class)).mo14031b(C4518u.m17193i(C4839f.class)).mo14031b(C4518u.m17190a(C4535c.class)).mo14031b(C4518u.m17190a(C4466a.class)).mo14034e(new C4529d(this)).mo14033d().mo14032c(), C4936h.m18806a("fire-cls", "18.2.12")});
    }
}
