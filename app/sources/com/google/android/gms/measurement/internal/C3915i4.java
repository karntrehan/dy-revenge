package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
final class C3915i4 extends BroadcastReceiver {

    /* renamed from: a */
    static final String f10778a = C3915i4.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4009pa f10779b;

    /* renamed from: c */
    private boolean f10780c;

    /* renamed from: d */
    private boolean f10781d;

    C3915i4(C4009pa paVar) {
        C3705r.m14346k(paVar);
        this.f10779b = paVar;
    }

    /* renamed from: b */
    public final void mo12101b() {
        this.f10779b.mo12286g();
        this.f10779b.mo11934a().mo11931h();
        if (!this.f10780c) {
            this.f10779b.mo11938f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10781d = this.f10779b.mo12279Y().mo11970m();
            this.f10779b.mo11935b().mo12548v().mo12477b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10781d));
            this.f10780c = true;
        }
    }

    /* renamed from: c */
    public final void mo12102c() {
        this.f10779b.mo12286g();
        this.f10779b.mo11934a().mo11931h();
        this.f10779b.mo11934a().mo11931h();
        if (this.f10780c) {
            this.f10779b.mo11935b().mo12548v().mo12476a("Unregistering connectivity change receiver");
            this.f10780c = false;
            this.f10781d = false;
            try {
                this.f10779b.mo11938f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10779b.mo11935b().mo12544r().mo12477b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f10779b.mo12286g();
        String action = intent.getAction();
        this.f10779b.mo11935b().mo12548v().mo12477b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m = this.f10779b.mo12279Y().mo11970m();
            if (this.f10781d != m) {
                this.f10781d = m;
                this.f10779b.mo11934a().mo12110z(new C3902h4(this, m));
                return;
            }
            return;
        }
        this.f10779b.mo11935b().mo12549w().mo12477b("NetworkBroadcastReceiver received unknown action", action);
    }
}
