package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C1143c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.l */
class C0103l {

    /* renamed from: a */
    private static C0103l f353a;

    /* renamed from: b */
    private final Context f354b;

    /* renamed from: c */
    private final LocationManager f355c;

    /* renamed from: d */
    private final C0104a f356d = new C0104a();

    /* renamed from: androidx.appcompat.app.l$a */
    private static class C0104a {

        /* renamed from: a */
        boolean f357a;

        /* renamed from: b */
        long f358b;

        /* renamed from: c */
        long f359c;

        /* renamed from: d */
        long f360d;

        /* renamed from: e */
        long f361e;

        /* renamed from: f */
        long f362f;

        C0104a() {
        }
    }

    C0103l(Context context, LocationManager locationManager) {
        this.f354b = context;
        this.f355c = locationManager;
    }

    /* renamed from: a */
    static C0103l m450a(Context context) {
        if (f353a == null) {
            Context applicationContext = context.getApplicationContext();
            f353a = new C0103l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f353a;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m451b() {
        Location location = null;
        Location c = C1143c.m4441b(this.f354b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m452c("network") : null;
        if (C1143c.m4441b(this.f354b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m452c("gps");
        }
        return (location == null || c == null) ? location != null ? location : c : location.getTime() > c.getTime() ? location : c;
    }

    /* renamed from: c */
    private Location m452c(String str) {
        try {
            if (this.f355c.isProviderEnabled(str)) {
                return this.f355c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m453e() {
        return this.f356d.f362f > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m454f(Location location) {
        long j;
        C0104a aVar = this.f356d;
        long currentTimeMillis = System.currentTimeMillis();
        C0102k b = C0102k.m448b();
        C0102k kVar = b;
        kVar.mo393a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b.f350b;
        kVar.mo393a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b.f352d == 1;
        long j3 = b.f351c;
        long j4 = j2;
        long j5 = b.f350b;
        long j6 = j3;
        boolean z2 = z;
        b.mo393a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = b.f351c;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
        }
        aVar.f357a = z2;
        aVar.f358b = j4;
        aVar.f359c = j6;
        aVar.f360d = j5;
        aVar.f361e = j7;
        aVar.f362f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo394d() {
        C0104a aVar = this.f356d;
        if (m453e()) {
            return aVar.f357a;
        }
        Location b = m451b();
        if (b != null) {
            m454f(b);
            return aVar.f357a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
