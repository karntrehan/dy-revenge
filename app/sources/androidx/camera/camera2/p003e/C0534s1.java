package androidx.camera.camera2.p003e;

import android.media.CamcorderProfile;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0453e;
import androidx.camera.camera2.p003e.p004j3.p006s0.C0455g;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0475c;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0711a0;
import androidx.camera.core.impl.C0919z;

/* renamed from: androidx.camera.camera2.e.s1 */
public class C0534s1 implements C0919z {

    /* renamed from: b */
    private final boolean f1718b;

    /* renamed from: c */
    private final int f1719c;

    /* renamed from: d */
    private final C0475c f1720d;

    public C0534s1(String str, C0402g0 g0Var) {
        boolean z;
        int i;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            C0949o2.m3698k("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z = false;
            i = -1;
        }
        this.f1718b = z;
        this.f1719c = i;
        this.f1720d = new C0475c((C0453e) C0455g.m1978a(str, g0Var).mo3015b(C0453e.class));
    }

    /* renamed from: b */
    private C0711a0 m2114b(int i) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f1719c, i);
        } catch (RuntimeException e) {
            C0949o2.m3699l("Camera2CamcorderProfileProvider", "Unable to get CamcorderProfile by quality: " + i, e);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return C0711a0.m2937a(camcorderProfile);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo2291a(int i) {
        if (!this.f1718b || !CamcorderProfile.hasProfile(this.f1719c, i)) {
            return false;
        }
        if (!this.f1720d.mo2218a()) {
            return true;
        }
        return this.f1720d.mo2219b(m2114b(i));
    }

    public C0711a0 get(int i) {
        if (!this.f1718b || !CamcorderProfile.hasProfile(this.f1719c, i)) {
            return null;
        }
        C0711a0 b = m2114b(i);
        if (!this.f1720d.mo2219b(b)) {
            return null;
        }
        return b;
    }
}
