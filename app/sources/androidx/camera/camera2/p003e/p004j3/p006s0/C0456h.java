package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import androidx.camera.core.impl.C0817h2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.h */
public class C0456h implements C0817h2 {

    /* renamed from: a */
    static final List<String> f1592a = Arrays.asList(new String[]{"SM-A3000", "SM-A3009", "SM-A300F", "SM-A300FU", "SM-A300G", "SM-A300H", "SM-A300M", "SM-A300X", "SM-A300XU", "SM-A300XZ", "SM-A300Y", "SM-A300YZ", "SM-J510FN", "5059X"});

    /* renamed from: a */
    static boolean m1979a() {
        return f1592a.contains(Build.MODEL.toUpperCase(Locale.US));
    }
}
