package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.q */
public class C0465q implements C0817h2 {

    /* renamed from: a */
    private static final List<String> f1601a = Arrays.asList(new String[]{"NEXUS 4"});

    /* renamed from: b */
    static boolean m2002b() {
        return "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && f1601a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: a */
    public int mo2213a() {
        return 2;
    }
}
