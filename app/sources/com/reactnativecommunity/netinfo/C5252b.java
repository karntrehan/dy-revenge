package com.reactnativecommunity.netinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: com.reactnativecommunity.netinfo.b */
public class C5252b {

    /* renamed from: a */
    private final C5256d f14779a = new C5256d();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f14780b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5254b f14781c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Runnable f14782d = new C5255c();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f14783e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f14784f = false;

    /* renamed from: com.reactnativecommunity.netinfo.b$b */
    public interface C5254b {
        void onAmazonFireDeviceConnectivityChanged(boolean z);
    }

    /* renamed from: com.reactnativecommunity.netinfo.b$c */
    private class C5255c implements Runnable {
        private C5255c() {
        }

        public void run() {
            if (C5252b.this.f14784f) {
                C5252b.this.f14780b.sendBroadcast(new Intent("com.amazon.tv.networkmonitor.CONNECTIVITY_CHECK"));
                C5252b.this.f14783e.postDelayed(C5252b.this.f14782d, 10000);
            }
        }
    }

    /* renamed from: com.reactnativecommunity.netinfo.b$d */
    private class C5256d extends BroadcastReceiver {

        /* renamed from: a */
        boolean f14786a;

        /* renamed from: b */
        private Boolean f14787b;

        private C5256d() {
            this.f14786a = false;
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            String action = intent == null ? null : intent.getAction();
            if ("com.amazon.tv.networkmonitor.INTERNET_DOWN".equals(action)) {
                z = false;
            } else if ("com.amazon.tv.networkmonitor.INTERNET_UP".equals(action)) {
                z = true;
            } else {
                return;
            }
            Boolean bool = this.f14787b;
            if (bool == null || bool.booleanValue() != z) {
                this.f14787b = Boolean.valueOf(z);
                C5252b.this.f14781c.onAmazonFireDeviceConnectivityChanged(z);
            }
        }
    }

    C5252b(Context context, C5254b bVar) {
        this.f14780b = context;
        this.f14781c = bVar;
    }

    /* renamed from: f */
    private boolean m19603f() {
        if (Build.MANUFACTURER.equals("Amazon")) {
            String str = Build.MODEL;
            if (str.startsWith("AF") || str.startsWith("KF")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m19604h() {
        if (!this.f14779a.f14786a) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
            intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
            this.f14780b.registerReceiver(this.f14779a, intentFilter);
            this.f14779a.f14786a = true;
        }
    }

    /* renamed from: i */
    private void m19605i() {
        if (!this.f14784f) {
            Handler handler = new Handler();
            this.f14783e = handler;
            this.f14784f = true;
            handler.post(this.f14782d);
        }
    }

    /* renamed from: j */
    private void m19606j() {
        if (this.f14784f) {
            this.f14784f = false;
            this.f14783e.removeCallbacksAndMessages((Object) null);
            this.f14783e = null;
        }
    }

    /* renamed from: l */
    private void m19607l() {
        C5256d dVar = this.f14779a;
        if (dVar.f14786a) {
            this.f14780b.unregisterReceiver(dVar);
            this.f14779a.f14786a = false;
        }
    }

    /* renamed from: g */
    public void mo15878g() {
        if (m19603f()) {
            m19604h();
            m19605i();
        }
    }

    /* renamed from: k */
    public void mo15879k() {
        if (m19603f()) {
            m19606j();
            m19607l();
        }
    }
}
