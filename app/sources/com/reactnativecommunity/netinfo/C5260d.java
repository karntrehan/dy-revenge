package com.reactnativecommunity.netinfo;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecommunity.netinfo.p169h.C5266a;
import com.reactnativecommunity.netinfo.p169h.C5267b;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Locale;

/* renamed from: com.reactnativecommunity.netinfo.d */
public abstract class C5260d {

    /* renamed from: a */
    private final ConnectivityManager f14792a;

    /* renamed from: b */
    private final WifiManager f14793b;

    /* renamed from: c */
    private final TelephonyManager f14794c;

    /* renamed from: d */
    private final ReactApplicationContext f14795d;

    /* renamed from: e */
    public boolean f14796e = false;

    /* renamed from: f */
    private C5267b f14797f = C5267b.UNKNOWN;

    /* renamed from: g */
    private C5266a f14798g = null;

    /* renamed from: h */
    private boolean f14799h = false;

    /* renamed from: i */
    private Boolean f14800i;

    C5260d(ReactApplicationContext reactApplicationContext) {
        this.f14795d = reactApplicationContext;
        this.f14792a = (ConnectivityManager) reactApplicationContext.getSystemService("connectivity");
        this.f14793b = (WifiManager) reactApplicationContext.getApplicationContext().getSystemService("wifi");
        this.f14794c = (TelephonyManager) reactApplicationContext.getSystemService("phone");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:17|18|(1:22)|23|24|(1:26)|27|28|29|30|(1:32)|33|34|35|36) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0080 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[Catch:{ Exception -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[Catch:{ Exception -> 0x008f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.WritableMap m19616b(java.lang.String r7) {
        /*
            r6 = this;
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            r7.hashCode()
            int r1 = r7.hashCode()
            r2 = -1
            switch(r1) {
                case -1419358249: goto L_0x0026;
                case -916596374: goto L_0x001b;
                case 3649301: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0030
        L_0x0010:
            java.lang.String r1 = "wifi"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            r2 = 2
            goto L_0x0030
        L_0x001b:
            java.lang.String r1 = "cellular"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            r2 = 1
            goto L_0x0030
        L_0x0026:
            java.lang.String r1 = "ethernet"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            java.lang.String r7 = "subnet"
            java.lang.String r1 = "ipAddress"
            switch(r2) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00c6;
                case 2: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x011c
        L_0x0039:
            com.facebook.react.bridge.ReactApplicationContext r2 = r6.mo15890e()
            boolean r2 = com.reactnativecommunity.netinfo.C5262f.m19629a(r2)
            if (r2 == 0) goto L_0x011c
            android.net.wifi.WifiManager r2 = r6.f14793b
            android.net.wifi.WifiInfo r2 = r2.getConnectionInfo()
            if (r2 == 0) goto L_0x011c
            java.lang.String r3 = r2.getSSID()     // Catch:{ Exception -> 0x0066 }
            if (r3 == 0) goto L_0x0066
            java.lang.String r4 = "<unknown ssid>"
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x0066 }
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = "\""
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ Exception -> 0x0066 }
            java.lang.String r4 = "ssid"
            r0.putString(r4, r3)     // Catch:{ Exception -> 0x0066 }
        L_0x0066:
            java.lang.String r3 = r2.getBSSID()     // Catch:{ Exception -> 0x0071 }
            if (r3 == 0) goto L_0x0071
            java.lang.String r4 = "bssid"
            r0.putString(r4, r3)     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            int r3 = r2.getRssi()     // Catch:{ Exception -> 0x0080 }
            r4 = 100
            int r3 = android.net.wifi.WifiManager.calculateSignalLevel(r3, r4)     // Catch:{ Exception -> 0x0080 }
            java.lang.String r4 = "strength"
            r0.putInt(r4, r3)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008f }
            r4 = 21
            if (r3 < r4) goto L_0x008f
            int r3 = r2.getFrequency()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "frequency"
            r0.putInt(r4, r3)     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            int r3 = r2.getIpAddress()     // Catch:{ Exception -> 0x00aa }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00aa }
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r3)     // Catch:{ Exception -> 0x00aa }
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x00aa }
            com.reactnativecommunity.netinfo.C5262f.m19630b(r3)     // Catch:{ Exception -> 0x00aa }
            java.net.InetAddress r3 = java.net.InetAddress.getByAddress(r3)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r3 = r3.getHostAddress()     // Catch:{ Exception -> 0x00aa }
            r0.putString(r1, r3)     // Catch:{ Exception -> 0x00aa }
        L_0x00aa:
            int r1 = r2.getIpAddress()     // Catch:{ Exception -> 0x011c }
            long r1 = (long) r1     // Catch:{ Exception -> 0x011c }
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)     // Catch:{ Exception -> 0x011c }
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x011c }
            com.reactnativecommunity.netinfo.C5262f.m19630b(r1)     // Catch:{ Exception -> 0x011c }
            java.net.InetAddress r1 = java.net.InetAddress.getByAddress(r1)     // Catch:{ Exception -> 0x011c }
            java.lang.String r1 = m19617f(r1)     // Catch:{ Exception -> 0x011c }
            r0.putString(r7, r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x011c
        L_0x00c6:
            com.reactnativecommunity.netinfo.h.a r7 = r6.f14798g
            if (r7 == 0) goto L_0x00d1
            java.lang.String r7 = r7.f14810s
            java.lang.String r1 = "cellularGeneration"
            r0.putString(r1, r7)
        L_0x00d1:
            android.telephony.TelephonyManager r7 = r6.f14794c
            java.lang.String r7 = r7.getNetworkOperatorName()
            if (r7 == 0) goto L_0x011c
            java.lang.String r1 = "carrier"
            r0.putString(r1, r7)
            goto L_0x011c
        L_0x00df:
            java.util.Enumeration r2 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0118 }
        L_0x00e3:
            boolean r3 = r2.hasMoreElements()     // Catch:{ Exception -> 0x0118 }
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.nextElement()     // Catch:{ Exception -> 0x0118 }
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch:{ Exception -> 0x0118 }
            java.util.Enumeration r3 = r3.getInetAddresses()     // Catch:{ Exception -> 0x0118 }
        L_0x00f3:
            boolean r4 = r3.hasMoreElements()     // Catch:{ Exception -> 0x0118 }
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r4 = r3.nextElement()     // Catch:{ Exception -> 0x0118 }
            java.net.InetAddress r4 = (java.net.InetAddress) r4     // Catch:{ Exception -> 0x0118 }
            boolean r5 = r4.isLoopbackAddress()     // Catch:{ Exception -> 0x0118 }
            if (r5 != 0) goto L_0x00f3
            boolean r5 = r4 instanceof java.net.Inet4Address     // Catch:{ Exception -> 0x0118 }
            if (r5 == 0) goto L_0x00f3
            java.lang.String r2 = r4.getHostAddress()     // Catch:{ Exception -> 0x0118 }
            r0.putString(r1, r2)     // Catch:{ Exception -> 0x0118 }
            java.lang.String r1 = m19617f(r4)     // Catch:{ Exception -> 0x0118 }
            r0.putString(r7, r1)     // Catch:{ Exception -> 0x0118 }
            return r0
        L_0x0118:
            r7 = move-exception
            r7.printStackTrace()
        L_0x011c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.netinfo.C5260d.m19616b(java.lang.String):com.facebook.react.bridge.WritableMap");
    }

    /* renamed from: f */
    private static String m19617f(InetAddress inetAddress) {
        int networkPrefixLength = -1 << (32 - NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses().get(1).getNetworkPrefixLength());
        return String.format(Locale.US, "%d.%d.%d.%d", new Object[]{Integer.valueOf((networkPrefixLength >> 24) & 255), Integer.valueOf((networkPrefixLength >> 16) & 255), Integer.valueOf((networkPrefixLength >> 8) & 255), Integer.valueOf(networkPrefixLength & 255)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WritableMap mo15887a(String str) {
        WritableMap createMap = Arguments.createMap();
        if (C5262f.m19629a(mo15890e())) {
            createMap.putBoolean("isWifiEnabled", this.f14793b.isWifiEnabled());
        }
        createMap.putString("type", str != null ? str : this.f14797f.f14820w);
        boolean z = false;
        boolean z2 = true;
        boolean z3 = !this.f14797f.equals(C5267b.NONE) && !this.f14797f.equals(C5267b.UNKNOWN);
        createMap.putBoolean("isConnected", z3);
        if (this.f14799h && (str == null || str.equals(this.f14797f.f14820w))) {
            z = true;
        }
        createMap.putBoolean("isInternetReachable", z);
        if (str == null) {
            str = this.f14797f.f14820w;
        }
        WritableMap b = m19616b(str);
        if (z3) {
            if (mo15888c() != null) {
                z2 = mo15888c().isActiveNetworkMetered();
            }
            b.putBoolean("isConnectionExpensive", z2);
        }
        createMap.putMap("details", b);
        return createMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ConnectivityManager mo15888c() {
        return this.f14792a;
    }

    /* renamed from: d */
    public void mo15889d(String str, Promise promise) {
        promise.resolve(mo15887a(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ReactApplicationContext mo15890e() {
        return this.f14795d;
    }

    /* renamed from: g */
    public abstract void mo15882g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo15891h() {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) mo15890e().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("netInfo.networkStatusDidChange", mo15887a((String) null));
    }

    /* renamed from: i */
    public void mo15892i(boolean z) {
        this.f14800i = Boolean.valueOf(z);
        mo15893k(this.f14797f, this.f14798g, this.f14799h);
    }

    /* renamed from: j */
    public abstract void mo15883j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo15893k(C5267b bVar, C5266a aVar, boolean z) {
        Boolean bool = this.f14800i;
        if (bool != null) {
            z = bool.booleanValue();
        }
        boolean z2 = true;
        boolean z3 = bVar != this.f14797f;
        boolean z4 = aVar != this.f14798g;
        if (z == this.f14799h) {
            z2 = false;
        }
        if (z3 || z4 || z2) {
            this.f14797f = bVar;
            this.f14798g = aVar;
            this.f14799h = z;
            if (this.f14796e) {
                mo15891h();
            }
        }
    }
}
