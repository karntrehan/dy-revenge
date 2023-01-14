package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.p169h.C5266a;
import com.reactnativecommunity.netinfo.p169h.C5267b;

/* renamed from: com.reactnativecommunity.netinfo.c */
public class C5257c extends C5260d {

    /* renamed from: j */
    private final C5259b f14789j = new C5259b();

    /* renamed from: com.reactnativecommunity.netinfo.c$b */
    private class C5259b extends BroadcastReceiver {

        /* renamed from: a */
        private boolean f14790a;

        private C5259b() {
            this.f14790a = false;
        }

        /* renamed from: a */
        public boolean mo15884a() {
            return this.f14790a;
        }

        /* renamed from: b */
        public void mo15885b(boolean z) {
            this.f14790a = z;
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C5257c.this.m19611m();
            }
        }
    }

    public C5257c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: m */
    public void m19611m() {
        C5267b bVar = C5267b.UNKNOWN;
        C5266a aVar = null;
        boolean z = false;
        try {
            NetworkInfo activeNetworkInfo = mo15888c().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    z = activeNetworkInfo.isConnected();
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            bVar = C5267b.WIFI;
                        } else if (type != 4) {
                            if (type == 9) {
                                bVar = C5267b.ETHERNET;
                            } else if (type == 17) {
                                bVar = C5267b.VPN;
                            } else if (type == 6) {
                                bVar = C5267b.WIMAX;
                            } else if (type == 7) {
                                bVar = C5267b.BLUETOOTH;
                            }
                        }
                        mo15893k(bVar, aVar, z);
                    }
                    bVar = C5267b.CELLULAR;
                    aVar = C5266a.m19642g(activeNetworkInfo);
                    mo15893k(bVar, aVar, z);
                }
            }
            bVar = C5267b.NONE;
        } catch (SecurityException unused) {
            bVar = C5267b.UNKNOWN;
        }
        mo15893k(bVar, aVar, z);
    }

    /* renamed from: g */
    public void mo15882g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mo15890e().registerReceiver(this.f14789j, intentFilter);
        this.f14789j.mo15885b(true);
        m19611m();
    }

    /* renamed from: j */
    public void mo15883j() {
        if (this.f14789j.mo15884a()) {
            mo15890e().unregisterReceiver(this.f14789j);
            this.f14789j.mo15885b(false);
        }
    }
}
