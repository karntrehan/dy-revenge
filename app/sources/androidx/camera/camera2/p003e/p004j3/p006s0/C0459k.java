package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0817h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.s0.k */
public class C0459k implements C0817h2 {
    /* renamed from: b */
    private List<Size> m1982b(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<Size> m1983c(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<Size> m1984d(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static boolean m1985e() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: f */
    private static boolean m1986f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: g */
    private static boolean m1987g() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* renamed from: h */
    static boolean m1988h() {
        return m1986f() || m1987g() || m1985e();
    }

    /* renamed from: a */
    public List<Size> mo2211a(String str, int i) {
        if (m1986f()) {
            return m1983c(str, i);
        }
        if (m1987g()) {
            return m1984d(str, i);
        }
        if (m1985e()) {
            return m1982b(str, i);
        }
        C0949o2.m3698k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}
