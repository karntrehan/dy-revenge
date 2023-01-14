package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4504o;
import com.google.firebase.components.C4510r;
import com.google.firebase.components.C4518u;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4539e;
import com.google.firebase.p164r.C4936h;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsNdkRegistrar implements C4510r {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C4535c m18369a(C4504o oVar) {
        Context context = (Context) oVar.mo14013a(Context.class);
        return C4813e.m18390e(context, !C4539e.m17253g(context));
    }

    public List<C4501n<?>> getComponents() {
        return Arrays.asList(new C4501n[]{C4501n.m17120a(C4535c.class).mo14031b(C4518u.m17193i(Context.class)).mo14034e(new C4809a(this)).mo14033d().mo14032c(), C4936h.m18806a("fire-cls-ndk", "18.2.12")});
    }
}
