package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.e.j3.r0.b */
public final class C0435b {

    /* renamed from: a */
    private final C0436a f1566a;

    /* renamed from: androidx.camera.camera2.e.j3.r0.b$a */
    interface C0436a {
        /* renamed from: b */
        Surface mo2175b();

        /* renamed from: c */
        String mo2176c();

        /* renamed from: d */
        void mo2177d(String str);

        /* renamed from: e */
        Object mo2178e();
    }

    public C0435b(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        this.f1566a = i >= 28 ? new C0441e(surface) : i >= 26 ? new C0439d(surface) : i >= 24 ? new C0437c(surface) : new C0442f(surface);
    }

    private C0435b(C0436a aVar) {
        this.f1566a = aVar;
    }

    /* renamed from: e */
    public static C0435b m1909e(Object obj) {
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C0436a g = i >= 28 ? C0441e.m1927g((OutputConfiguration) obj) : i >= 26 ? C0439d.m1923f((OutputConfiguration) obj) : i >= 24 ? C0437c.m1918a((OutputConfiguration) obj) : null;
        if (g == null) {
            return null;
        }
        return new C0435b(g);
    }

    /* renamed from: a */
    public String mo2169a() {
        return this.f1566a.mo2176c();
    }

    /* renamed from: b */
    public Surface mo2170b() {
        return this.f1566a.mo2175b();
    }

    /* renamed from: c */
    public void mo2171c(String str) {
        this.f1566a.mo2177d(str);
    }

    /* renamed from: d */
    public Object mo2172d() {
        return this.f1566a.mo2178e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0435b)) {
            return false;
        }
        return this.f1566a.equals(((C0435b) obj).f1566a);
    }

    public int hashCode() {
        return this.f1566a.hashCode();
    }
}
