package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.r */
public class C0466r implements C0817h2 {

    /* renamed from: a */
    private static final List<String> f1602a = Arrays.asList(new String[]{"sunfish", "bramble", "redfin", "barbet"});

    /* renamed from: a */
    static boolean m2004a() {
        return "Google".equals(Build.MANUFACTURER) && f1602a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
