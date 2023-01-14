package androidx.camera.extensions.p017f;

import android.content.Context;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0915y2;

/* renamed from: androidx.camera.extensions.f.k */
public final class C1043k implements C0915y2 {

    /* renamed from: b */
    private final C1045l f2916b;

    /* renamed from: c */
    private final C1047m f2917c;

    /* renamed from: androidx.camera.extensions.f.k$a */
    static /* synthetic */ class C1044a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.y2$b[] r0 = androidx.camera.core.impl.C0915y2.C0917b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2918a = r0
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2918a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2918a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1043k.C1044a.<clinit>():void");
        }
    }

    public C1043k(int i, C1050n nVar, Context context) {
        this.f2916b = new C1045l(i, nVar, context);
        this.f2917c = new C1047m(i, nVar, context);
    }

    /* renamed from: a */
    public C0809g1 mo2009a(C0915y2.C0917b bVar) {
        C0809g1 g1Var;
        int i = C1044a.f2918a[bVar.ordinal()];
        if (i == 1) {
            g1Var = this.f2916b.mo3337a();
        } else if (i == 2) {
            g1Var = this.f2917c.mo3339a();
        } else if (i != 3) {
            return null;
        } else {
            throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
        }
        return C0802e2.m3155H(C0714a2.m2955K(g1Var));
    }
}
