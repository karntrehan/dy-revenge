package androidx.camera.camera2.p003e;

import androidx.camera.core.C0949o2;
import androidx.camera.core.C0974t1;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0911y0;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.LiveData;
import java.util.Objects;

/* renamed from: androidx.camera.camera2.e.k2 */
class C0496k2 {

    /* renamed from: a */
    private final C0911y0 f1630a;

    /* renamed from: b */
    private final C1300m<C0974t1> f1631b;

    /* renamed from: androidx.camera.camera2.e.k2$a */
    static /* synthetic */ class C0497a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1632a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.core.impl.w0$a[] r0 = androidx.camera.core.impl.C0899w0.C0900a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1632a = r0
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.OPENING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.CLOSING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.RELEASING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1632a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.core.impl.w0$a r1 = androidx.camera.core.impl.C0899w0.C0900a.RELEASED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0496k2.C0497a.<clinit>():void");
        }
    }

    C0496k2(C0911y0 y0Var) {
        this.f1630a = y0Var;
        C1300m<C0974t1> mVar = new C1300m<>();
        this.f1631b = mVar;
        mVar.mo4314l(C0974t1.m3786a(C0974t1.C0976b.CLOSED));
    }

    /* renamed from: b */
    private C0974t1 m2037b() {
        return C0974t1.m3786a(this.f1630a.mo3162a() ? C0974t1.C0976b.OPENING : C0974t1.C0976b.PENDING_OPEN);
    }

    /* renamed from: a */
    public LiveData<C0974t1> mo2234a() {
        return this.f1631b;
    }

    /* renamed from: c */
    public void mo2235c(C0899w0.C0900a aVar, C0974t1.C0975a aVar2) {
        C0974t1 t1Var;
        C0974t1.C0976b bVar;
        switch (C0497a.f1632a[aVar.ordinal()]) {
            case 1:
                t1Var = m2037b();
                break;
            case 2:
                bVar = C0974t1.C0976b.OPENING;
                break;
            case 3:
                bVar = C0974t1.C0976b.OPEN;
                break;
            case 4:
            case 5:
                bVar = C0974t1.C0976b.CLOSING;
                break;
            case 6:
            case 7:
                bVar = C0974t1.C0976b.CLOSED;
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        t1Var = C0974t1.m3787b(bVar, aVar2);
        C0949o2.m3688a("CameraStateMachine", "New public camera state " + t1Var + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f1631b.mo2469e(), t1Var)) {
            C0949o2.m3688a("CameraStateMachine", "Publishing new public camera state " + t1Var);
            this.f1631b.mo4314l(t1Var);
        }
    }
}
