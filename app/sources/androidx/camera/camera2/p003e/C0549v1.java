package androidx.camera.camera2.p003e;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.core.C0945n2;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0965s1;
import androidx.camera.core.impl.C0883t0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0911y0;
import androidx.camera.core.impl.C0921z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.v1 */
public final class C0549v1 implements C0883t0 {

    /* renamed from: a */
    private final C0921z0 f1780a;

    /* renamed from: b */
    private final C0911y0 f1781b;

    /* renamed from: c */
    private final C0418m0 f1782c;

    /* renamed from: d */
    private final List<String> f1783d;

    /* renamed from: e */
    private final Map<String, C0569x1> f1784e = new HashMap();

    public C0549v1(Context context, C0921z0 z0Var, C0965s1 s1Var) {
        this.f1780a = z0Var;
        this.f1781b = new C0911y0(1);
        this.f1782c = C0418m0.m1870b(context, z0Var.mo3097c());
        this.f1783d = m2218d(C0384j2.m1788b(this, s1Var));
    }

    /* renamed from: d */
    private List<String> m2218d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (next.equals("0") || next.equals("1") || m2219g(next)) {
                arrayList.add(next);
            } else {
                C0949o2.m3688a("Camera2CameraFactory", "Camera " + next + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private boolean m2219g(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f1782c.mo2139c(str).mo2119a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C0386a0 e) {
            throw new C0945n2(C0501l2.m2043a(e));
        }
    }

    /* renamed from: a */
    public Set<String> mo2361a() {
        return new LinkedHashSet(this.f1783d);
    }

    /* renamed from: b */
    public C0899w0 mo2362b(String str) {
        if (this.f1783d.contains(str)) {
            return new C0553w1(this.f1782c, str, mo2364e(str), this.f1781b, this.f1780a.mo3096b(), this.f1780a.mo3097c());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0569x1 mo2364e(String str) {
        try {
            C0569x1 x1Var = this.f1784e.get(str);
            if (x1Var != null) {
                return x1Var;
            }
            C0569x1 x1Var2 = new C0569x1(str, this.f1782c);
            this.f1784e.put(str, x1Var2);
            return x1Var2;
        } catch (C0386a0 e) {
            throw C0501l2.m2043a(e);
        }
    }

    /* renamed from: f */
    public C0418m0 mo2363c() {
        return this.f1782c;
    }
}
