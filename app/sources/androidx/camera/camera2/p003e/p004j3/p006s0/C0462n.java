package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.j3.s0.n */
public class C0462n implements C0817h2 {

    /* renamed from: a */
    public static final List<String> f1598a = Arrays.asList(new String[]{"Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL"});

    /* renamed from: a */
    static boolean m1999a() {
        return f1598a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 26;
    }
}
