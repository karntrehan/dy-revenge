package p027c.p043d.p044a.p046l1.p047m.p048f;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.d.a.l1.m.f.f */
public class C1599f implements C0817h2 {

    /* renamed from: a */
    private static final List<String> f4899a = Arrays.asList(new String[]{"SM-N9208", "SM-G920V"});

    /* renamed from: a */
    static boolean m7055a() {
        return Build.VERSION.SDK_INT <= 22 || f4899a.contains(Build.MODEL.toUpperCase());
    }
}
