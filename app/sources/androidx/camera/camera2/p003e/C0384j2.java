package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.core.C0945n2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0965s1;
import androidx.camera.core.C0984u1;
import androidx.camera.core.impl.C0888u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j2 */
class C0384j2 {
    /* renamed from: a */
    private static String m1787a(C0418m0 m0Var, Integer num, List<String> list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) m0Var.mo2139c("0").mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) m0Var.mo2139c("1").mo2119a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    /* renamed from: b */
    static List<String> m1788b(C0549v1 v1Var, C0965s1 s1Var) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(v1Var.mo2363c().mo2140d());
            if (s1Var == null) {
                for (String add : asList) {
                    arrayList.add(add);
                }
                return arrayList;
            }
            try {
                str = m1787a(v1Var.mo2363c(), s1Var.mo3215d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(v1Var.mo2364e(str2));
                }
            }
            Iterator<C0957q1> it = s1Var.mo3213b(arrayList2).iterator();
            while (it.hasNext()) {
                arrayList.add(((C0888u0) it.next()).mo2453a());
            }
            return arrayList;
        } catch (C0386a0 e) {
            throw new C0945n2(C0501l2.m2043a(e));
        } catch (C0984u1 e2) {
            throw new C0945n2(e2);
        }
    }
}
