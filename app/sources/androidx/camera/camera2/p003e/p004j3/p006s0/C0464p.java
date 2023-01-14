package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.p009e3.p010p.p011e.C0672e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.j3.s0.p */
public final class C0464p implements C0672e {

    /* renamed from: a */
    private static final Set<String> f1600a = new HashSet(Arrays.asList(new String[]{"heroqltevzw", "heroqltetmo"}));

    /* renamed from: a */
    static boolean m2001a(C0402g0 g0Var) {
        return f1600a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
