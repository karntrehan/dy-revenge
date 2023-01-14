package androidx.camera.camera2.p003e.p004j3.p006s0;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.C0817h2;
import androidx.camera.core.impl.C0879s2;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.e.j3.s0.s */
public class C0467s implements C0817h2 {

    /* renamed from: a */
    private static final List<String> f1603a = Arrays.asList(new String[]{"SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M"});

    /* renamed from: androidx.camera.camera2.e.j3.s0.s$a */
    static /* synthetic */ class C0468a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1604a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.s2$b[] r0 = androidx.camera.core.impl.C0879s2.C0881b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1604a = r0
                androidx.camera.core.impl.s2$b r1 = androidx.camera.core.impl.C0879s2.C0881b.PRIV     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1604a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.s2$b r1 = androidx.camera.core.impl.C0879s2.C0881b.YUV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1604a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.s2$b r1 = androidx.camera.core.impl.C0879s2.C0881b.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.p004j3.p006s0.C0467s.C0468a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static boolean m2005a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f1603a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: b */
    static boolean m2006b() {
        return m2005a();
    }

    /* renamed from: c */
    public Size mo2214c(C0879s2.C0881b bVar) {
        if (!m2005a()) {
            return null;
        }
        int i = C0468a.f1604a[bVar.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, 720);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
