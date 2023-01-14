package androidx.camera.camera2.p003e;

import android.content.Context;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0482j;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;

/* renamed from: androidx.camera.camera2.e.f2 */
public final class C0355f2 implements C0915y2 {

    /* renamed from: b */
    final C0539t2 f1433b;

    /* renamed from: androidx.camera.camera2.e.f2$a */
    static /* synthetic */ class C0356a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1434a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.camera.core.impl.y2$b[] r0 = androidx.camera.core.impl.C0915y2.C0917b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1434a = r0
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1434a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1434a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1434a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.y2$b r1 = androidx.camera.core.impl.C0915y2.C0917b.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0355f2.C0356a.<clinit>():void");
        }
    }

    public C0355f2(Context context) {
        this.f1433b = C0539t2.m2136b(context);
    }

    /* renamed from: a */
    public C0809g1 mo2009a(C0915y2.C0917b bVar) {
        C0714a2 J = C0714a2.m2954J();
        C0840m2.C0842b bVar2 = new C0840m2.C0842b();
        int[] iArr = C0356a.f1434a;
        int i = iArr[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            bVar2.mo3052r(1);
        } else if (i == 4) {
            bVar2.mo3052r(3);
        }
        C0915y2.C0917b bVar3 = C0915y2.C0917b.PREVIEW;
        if (bVar == bVar3) {
            C0482j.m2025a(bVar2);
        }
        J.mo2814q(C0908x2.f2601l, bVar2.mo3048m());
        J.mo2814q(C0908x2.f2603n, C0348e2.f1419a);
        C0788c1.C0789a aVar = new C0788c1.C0789a();
        int i2 = iArr[bVar.ordinal()];
        if (i2 == 1) {
            aVar.mo2969o(2);
        } else if (i2 == 2 || i2 == 3) {
            aVar.mo2969o(1);
        } else if (i2 == 4) {
            aVar.mo2969o(3);
        }
        J.mo2814q(C0908x2.f2602m, aVar.mo2964h());
        J.mo2814q(C0908x2.f2604o, bVar == C0915y2.C0917b.IMAGE_CAPTURE ? C0571x2.f1888b : C0582z1.f1905a);
        if (bVar == bVar3) {
            J.mo2814q(C0877s1.f2549j, this.f1433b.mo2304d());
        }
        J.mo2814q(C0877s1.f2546g, Integer.valueOf(this.f1433b.mo2303c().getRotation()));
        return C0802e2.m3155H(J);
    }
}
