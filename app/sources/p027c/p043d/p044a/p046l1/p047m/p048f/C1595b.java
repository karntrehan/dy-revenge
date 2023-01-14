package p027c.p043d.p044a.p046l1.p047m.p048f;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: c.d.a.l1.m.f.b */
public class C1595b implements C0817h2 {

    /* renamed from: a */
    private static final Set<String> f4897a = new HashSet(Arrays.asList(new String[]{"samsungexynos7570", "samsungexynos7870", "qcom"}));

    /* renamed from: a */
    static boolean m7051a() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && f4897a.contains(Build.HARDWARE.toLowerCase());
    }
}
