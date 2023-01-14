package androidx.camera.camera2.p008f;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.core.C1010z1;
import androidx.camera.core.impl.C0809g1;

/* renamed from: androidx.camera.camera2.f.j */
public final class C0598j<T> {

    /* renamed from: a */
    C1010z1<T> f1957a;

    public C0598j(C1010z1<T> z1Var) {
        this.f1957a = z1Var;
    }

    /* renamed from: a */
    public <ValueT> C0598j<T> mo2534a(CaptureRequest.Key<ValueT> key, ValueT valuet) {
        this.f1957a.mo1887b().mo2813l(C0304b.m1505G(key), C0809g1.C0812c.ALWAYS_OVERRIDE, valuet);
        return this;
    }
}
