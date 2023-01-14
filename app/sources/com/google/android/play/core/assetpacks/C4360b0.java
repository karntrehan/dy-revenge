package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9129o;
import p174e.p319f.p320a.p382e.p383a.p385b.C9136r0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9142u0;

/* renamed from: com.google.android.play.core.assetpacks.b0 */
final class C4360b0 extends C9136r0 {

    /* renamed from: a */
    private final C9101a f12389a = new C9101a("AssetPackExtractionService");

    /* renamed from: b */
    private final Context f12390b;

    /* renamed from: c */
    private final C4439v f12391c;

    C4360b0(Context context, C4439v vVar) {
        this.f12390b = context;
        this.f12391c = vVar;
    }

    /* renamed from: y0 */
    private final synchronized void m16782y0(Bundle bundle) {
        ComponentName componentName;
        Intent intent = new Intent(this.f12390b, ExtractionForegroundService.class);
        int i = bundle.getInt("action_type");
        intent.putExtra("action_type", i);
        if (i == 1) {
            intent.putExtra("notification_channel_name", bundle.getString("notification_channel_name"));
            intent.putExtra("notification_title", bundle.getString("notification_title"));
            intent.putExtra("notification_subtext", bundle.getString("notification_subtext"));
            intent.putExtra("notification_timeout", bundle.getLong("notification_timeout"));
            Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
            if (parcelable instanceof PendingIntent) {
                intent.putExtra("notification_on_click_intent", parcelable);
            }
            intent.putExtra("notification_color", bundle.getInt("notification_color"));
        }
        try {
            componentName = Build.VERSION.SDK_INT >= 26 ? this.f12390b.startForegroundService(intent) : this.f12390b.startService(intent);
        } catch (IllegalStateException | SecurityException e) {
            this.f12389a.mo23082c(e, "Failed starting installation service.", new Object[0]);
            componentName = null;
        }
        if (componentName == null) {
            this.f12389a.mo23081b("Failed starting installation service.", new Object[0]);
        }
    }

    /* renamed from: U */
    public final void mo13824U(Bundle bundle, C9142u0 u0Var) {
        this.f12389a.mo23080a("updateServiceState AIDL call", new Object[0]);
        if (!C9129o.m30393a(this.f12390b) || !C9129o.m30394b(this.f12390b)) {
            u0Var.mo23117y0(new Bundle());
            return;
        }
        m16782y0(bundle);
        u0Var.mo23115o0(new Bundle(), new Bundle());
    }

    /* renamed from: p */
    public final void mo13825p(C9142u0 u0Var) {
        this.f12389a.mo23080a("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C9129o.m30393a(this.f12390b) || !C9129o.m30394b(this.f12390b)) {
            u0Var.mo23117y0(new Bundle());
            return;
        }
        this.f12391c.mo13931K();
        u0Var.mo23116r0(new Bundle());
    }
}
