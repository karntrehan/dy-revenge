package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C4825h;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4504o;
import com.google.firebase.components.C4510r;
import com.google.firebase.components.C4518u;
import com.google.firebase.p161o.C4919i;
import com.google.firebase.p161o.C4921j;
import com.google.firebase.p164r.C4936h;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements C4510r {
    static /* synthetic */ C4839f lambda$getComponents$0(C4504o oVar) {
        return new C4836e((C4825h) oVar.mo14013a(C4825h.class), oVar.mo14014b(C4921j.class));
    }

    public List<C4501n<?>> getComponents() {
        return Arrays.asList(new C4501n[]{C4501n.m17120a(C4839f.class).mo14031b(C4518u.m17193i(C4825h.class)).mo14031b(C4518u.m17192h(C4921j.class)).mo14034e(C4834c.f13602a).mo14032c(), C4919i.m18772a(), C4936h.m18806a("fire-installations", "17.0.1")});
    }
}
