package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C4825h;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4510r;
import com.google.firebase.components.C4518u;
import com.google.firebase.p160n.C4910d;
import com.google.firebase.p164r.C4936h;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements C4510r {
    @SuppressLint({"MissingPermission"})
    @Keep
    public List<C4501n<?>> getComponents() {
        return Arrays.asList(new C4501n[]{C4501n.m17120a(C4466a.class).mo14031b(C4518u.m17193i(C4825h.class)).mo14031b(C4518u.m17193i(Context.class)).mo14031b(C4518u.m17193i(C4910d.class)).mo14034e(C4474a.f12758a).mo14033d().mo14032c(), C4936h.m18806a("fire-analytics", "21.1.0")});
    }
}
