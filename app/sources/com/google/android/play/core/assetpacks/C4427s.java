package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9147z;
import p174e.p319f.p320a.p382e.p383a.p386c.C9150c;

/* renamed from: com.google.android.play.core.assetpacks.s */
final class C4427s extends C9150c<AssetPackState> {

    /* renamed from: g */
    private final C4357a1 f12627g;

    /* renamed from: h */
    private final C4400l0 f12628h;

    /* renamed from: i */
    private final C9147z<C4430s2> f12629i;

    /* renamed from: j */
    private final C4372e0 f12630j;

    /* renamed from: k */
    private final C4412o0 f12631k;

    /* renamed from: l */
    private final C9147z<Executor> f12632l;

    /* renamed from: m */
    private final C9147z<Executor> f12633m;

    /* renamed from: n */
    private final Handler f12634n = new Handler(Looper.getMainLooper());

    C4427s(Context context, C4357a1 a1Var, C4400l0 l0Var, C9147z<C4430s2> zVar, C4412o0 o0Var, C4372e0 e0Var, C9147z<Executor> zVar2, C9147z<Executor> zVar3) {
        super(new C9101a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f12627g = a1Var;
        this.f12628h = l0Var;
        this.f12629i = zVar;
        this.f12631k = o0Var;
        this.f12630j = e0Var;
        this.f12632l = zVar2;
        this.f12633m = zVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13911a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f25025a.mo23081b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState d = AssetPackState.m16743d(bundleExtra, stringArrayList.get(0), this.f12631k, C4435u.f12658b);
            this.f25025a.mo23080a("ListenerRegistryBroadcastReceiver.onReceive: %s", d);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f12630j.mo13850a(pendingIntent);
            }
            this.f12633m.mo13826a().execute(new C4419q(this, bundleExtra, d));
            this.f12632l.mo13826a().execute(new C4423r(this, bundleExtra));
            return;
        }
        this.f25025a.mo23081b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo13912h(AssetPackState assetPackState) {
        this.f12634n.post(new C4415p(this, assetPackState));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo13913i(Bundle bundle) {
        if (this.f12627g.mo13809d(bundle)) {
            this.f12628h.mo13892a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo13914j(Bundle bundle, AssetPackState assetPackState) {
        if (this.f12627g.mo13810e(bundle)) {
            mo13912h(assetPackState);
            this.f12629i.mo13826a().mo13863a();
        }
    }
}
