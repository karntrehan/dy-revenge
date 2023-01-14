package com.reactnativecommunity.netinfo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.p169h.C5266a;
import com.reactnativecommunity.netinfo.p169h.C5267b;

@TargetApi(24)
/* renamed from: com.reactnativecommunity.netinfo.g */
public class C5263g extends C5260d {

    /* renamed from: j */
    private final C5265b f14801j = new C5265b();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Network f14802k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public NetworkCapabilities f14803l = null;

    /* renamed from: com.reactnativecommunity.netinfo.g$b */
    private class C5265b extends ConnectivityManager.NetworkCallback {
        private C5265b() {
        }

        public void onAvailable(Network network) {
            Network unused = C5263g.this.f14802k = network;
            C5263g.this.m19635p(250);
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            Network unused = C5263g.this.f14802k = network;
            NetworkCapabilities unused2 = C5263g.this.f14803l = networkCapabilities;
            C5263g.this.mo15895s();
        }

        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (C5263g.this.f14802k != null) {
                Network unused = C5263g.this.f14802k = network;
            }
            C5263g.this.m19635p(250);
        }

        public void onLosing(Network network, int i) {
            Network unused = C5263g.this.f14802k = network;
            C5263g.this.mo15895s();
        }

        public void onLost(Network network) {
            Network unused = C5263g.this.f14802k = null;
            NetworkCapabilities unused2 = C5263g.this.f14803l = null;
            C5263g.this.mo15895s();
        }

        public void onUnavailable() {
            Network unused = C5263g.this.f14802k = null;
            NetworkCapabilities unused2 = C5263g.this.f14803l = null;
            C5263g.this.mo15895s();
        }
    }

    public C5263g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m19635p(int i) {
        new Handler(Looper.getMainLooper()).postDelayed(new C5251a(this), (long) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void mo15894r() {
        this.f14803l = mo15888c().getNetworkCapabilities(this.f14802k);
        mo15895s();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: g */
    public void mo15882g() {
        try {
            this.f14802k = mo15888c().getActiveNetwork();
            m19635p(0);
            mo15888c().registerDefaultNetworkCallback(this.f14801j);
        } catch (SecurityException unused) {
        }
    }

    /* renamed from: j */
    public void mo15883j() {
        try {
            mo15888c().unregisterNetworkCallback(this.f14801j);
        } catch (IllegalArgumentException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: s */
    public void mo15895s() {
        C5267b bVar = C5267b.UNKNOWN;
        Network network = this.f14802k;
        NetworkCapabilities networkCapabilities = this.f14803l;
        C5266a aVar = null;
        boolean z = false;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                bVar = C5267b.BLUETOOTH;
            } else if (networkCapabilities.hasTransport(0)) {
                bVar = C5267b.CELLULAR;
            } else if (networkCapabilities.hasTransport(3)) {
                bVar = C5267b.ETHERNET;
            } else if (networkCapabilities.hasTransport(1)) {
                bVar = C5267b.WIFI;
            } else if (networkCapabilities.hasTransport(4)) {
                bVar = C5267b.VPN;
            }
            NetworkInfo networkInfo = network != null ? mo15888c().getNetworkInfo(network) : null;
            boolean z2 = Build.VERSION.SDK_INT >= 28 ? !networkCapabilities.hasCapability(21) : (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z2) {
                z = true;
            }
            if (network != null && bVar == C5267b.CELLULAR && z) {
                aVar = C5266a.m19642g(networkInfo);
            }
        } else {
            bVar = C5267b.NONE;
        }
        mo15893k(bVar, aVar, z);
    }
}
