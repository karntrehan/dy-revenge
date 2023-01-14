package androidx.camera.extensions.p017f;

import android.content.Context;
import android.os.Build;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p002d.C0307c;
import androidx.camera.camera2.p002d.C0308d;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0693h2;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0784b1;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0849n1;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.camera.extensions.f.l */
public class C1045l {

    /* renamed from: a */
    static final C0809g1.C0810a<Integer> f2919a = C0809g1.C0810a.m3180a("camerax.extensions.imageCaptureConfigProvider.mode", Integer.class);

    /* renamed from: b */
    private final C1050n f2920b;

    /* renamed from: c */
    private final Context f2921c;

    /* renamed from: d */
    private final int f2922d;

    /* renamed from: androidx.camera.extensions.f.l$a */
    private static class C1046a extends C0307c implements C0608a3.C0610b, C0784b1 {

        /* renamed from: a */
        private final ImageCaptureExtenderImpl f2923a;

        /* renamed from: b */
        private final Context f2924b;

        /* renamed from: c */
        private final AtomicBoolean f2925c = new AtomicBoolean(true);

        /* renamed from: d */
        private final Object f2926d = new Object();

        /* renamed from: e */
        private volatile int f2927e = 0;

        /* renamed from: f */
        private volatile boolean f2928f = false;

        C1046a(ImageCaptureExtenderImpl imageCaptureExtenderImpl, Context context) {
            this.f2923a = imageCaptureExtenderImpl;
            this.f2924b = context;
        }

        /* renamed from: h */
        private void m4040h() {
            if (this.f2925c.get()) {
                this.f2923a.onDeInit();
                this.f2925c.set(false);
            }
        }

        /* renamed from: a */
        public List<C0800e1> mo2947a() {
            List<CaptureStageImpl> captureStages;
            if (!this.f2925c.get() || (captureStages = this.f2923a.getCaptureStages()) == null || captureStages.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CaptureStageImpl bVar : captureStages) {
                arrayList.add(new C1030b(bVar));
            }
            return arrayList;
        }

        /* renamed from: b */
        public void mo2592b() {
            synchronized (this.f2926d) {
                this.f2928f = true;
                if (this.f2927e == 0) {
                    m4040h();
                }
            }
        }

        /* renamed from: c */
        public void mo2593c(C0957q1 q1Var) {
            if (this.f2925c.get()) {
                this.f2923a.onInit(C0597i.m2471b(q1Var).mo2533e(), C0597i.m2470a(q1Var), this.f2924b);
            }
        }

        /* renamed from: d */
        public C0788c1 mo1891d() {
            CaptureStageImpl onDisableSession;
            try {
                if (!this.f2925c.get() || (onDisableSession = this.f2923a.onDisableSession()) == null) {
                    synchronized (this.f2926d) {
                        this.f2927e--;
                        if (this.f2927e == 0 && this.f2928f) {
                            m4040h();
                        }
                    }
                    return null;
                }
                C0788c1 b = new C1030b(onDisableSession).mo2981b();
                synchronized (this.f2926d) {
                    this.f2927e--;
                    if (this.f2927e == 0 && this.f2928f) {
                        m4040h();
                    }
                }
                return b;
            } catch (Throwable th) {
                synchronized (this.f2926d) {
                    this.f2927e--;
                    if (this.f2927e == 0 && this.f2928f) {
                        m4040h();
                    }
                    throw th;
                }
            }
        }

        /* renamed from: e */
        public C0788c1 mo1892e() {
            CaptureStageImpl onEnableSession;
            try {
                if (!this.f2925c.get() || (onEnableSession = this.f2923a.onEnableSession()) == null) {
                    synchronized (this.f2926d) {
                        this.f2927e++;
                    }
                    return null;
                }
                C0788c1 b = new C1030b(onEnableSession).mo2981b();
                synchronized (this.f2926d) {
                    this.f2927e++;
                }
                return b;
            } catch (Throwable th) {
                synchronized (this.f2926d) {
                    this.f2927e++;
                    throw th;
                }
            }
        }

        /* renamed from: f */
        public C0788c1 mo1893f() {
            CaptureStageImpl onPresetSession;
            if (!this.f2925c.get() || (onPresetSession = this.f2923a.onPresetSession()) == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return new C1030b(onPresetSession).mo2981b();
            }
            C0949o2.m3698k("ImageCaptureConfigProvider", "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
            return null;
        }
    }

    public C1045l(int i, C1050n nVar, Context context) {
        this.f2922d = i;
        this.f2920b = nVar;
        this.f2921c = context;
    }

    /* renamed from: a */
    public C0849n1 mo3337a() {
        C0693h2.C0698e eVar = new C0693h2.C0698e();
        mo3338b(eVar, this.f2922d, this.f2920b, this.f2921c);
        return eVar.mo2603c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3338b(C0693h2.C0698e eVar, int i, C1050n nVar, Context context) {
        if (nVar instanceof C1035g) {
            ImageCaptureExtenderImpl i2 = ((C1035g) nVar).mo3330i();
            CaptureProcessorImpl captureProcessor = i2.getCaptureProcessor();
            if (captureProcessor != null) {
                eVar.mo2766j(new C1029a(captureProcessor));
            }
            if (i2.getMaxCaptureStage() > 0) {
                eVar.mo2767k(i2.getMaxCaptureStage());
            }
            C1046a aVar = new C1046a(i2, context);
            new C0304b.C0306b(eVar).mo1890a(new C0308d(aVar));
            eVar.mo2775s(aVar);
            eVar.mo2764h(aVar);
        }
        eVar.mo1887b().mo2814q(f2919a, Integer.valueOf(i));
        eVar.mo2768l(nVar.mo3320a());
    }
}
