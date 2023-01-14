package androidx.camera.camera2.p008f;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p003e.C0569x1;
import androidx.camera.core.C0957q1;
import androidx.core.util.C1177h;
import java.util.Map;

/* renamed from: androidx.camera.camera2.f.i */
public final class C0597i {

    /* renamed from: a */
    private final C0569x1 f1956a;

    public C0597i(C0569x1 x1Var) {
        this.f1956a = x1Var;
    }

    /* renamed from: a */
    public static CameraCharacteristics m2470a(C0957q1 q1Var) {
        C1177h.m4586h(q1Var instanceof C0569x1, "CameraInfo does not contain any Camera2 information.");
        return ((C0569x1) q1Var).mo2463k().mo2121d();
    }

    /* renamed from: b */
    public static C0597i m2471b(C0957q1 q1Var) {
        C1177h.m4580b(q1Var instanceof C0569x1, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C0569x1) q1Var).mo2462j();
    }

    /* renamed from: c */
    public <T> T mo2531c(CameraCharacteristics.Key<T> key) {
        return this.f1956a.mo2463k().mo2119a(key);
    }

    /* renamed from: d */
    public Map<String, CameraCharacteristics> mo2532d() {
        return this.f1956a.mo2464l();
    }

    /* renamed from: e */
    public String mo2533e() {
        return this.f1956a.mo2453a();
    }
}
