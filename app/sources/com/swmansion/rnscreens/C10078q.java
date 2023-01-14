package com.swmansion.rnscreens;

import android.content.Context;
import androidx.appcompat.widget.Toolbar;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.q */
public class C10078q extends Toolbar {

    /* renamed from: f0 */
    private final C10097z f26829f0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10078q(Context context, C10097z zVar) {
        super(context);
        C10457l.m35320e(context, "context");
        C10457l.m35320e(zVar, "config");
        this.f26829f0 = zVar;
    }

    public final C10097z getConfig() {
        return this.f26829f0;
    }
}
