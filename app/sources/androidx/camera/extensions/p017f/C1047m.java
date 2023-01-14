package androidx.camera.extensions.p017f;

import android.content.Context;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p002d.C0307c;
import androidx.camera.camera2.p002d.C0308d;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0957q1;
import androidx.camera.core.C0967s2;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0813g2;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;

/* renamed from: androidx.camera.extensions.f.m */
public class C1047m {

    /* renamed from: a */
    static final C0809g1.C0810a<Integer> f2929a = C0809g1.C0810a.m3180a("camerax.extensions.previewConfigProvider.mode", Integer.class);

    /* renamed from: b */
    private final C1050n f2930b;

    /* renamed from: c */
    private final Context f2931c;

    /* renamed from: d */
    private final int f2932d;

    /* renamed from: androidx.camera.extensions.f.m$a */
    static /* synthetic */ class C1048a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType[] r0 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2933a = r0
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType r1 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2933a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.extensions.impl.PreviewExtenderImpl$ProcessorType r1 = androidx.camera.extensions.impl.PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1047m.C1048a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.extensions.f.m$b */
    private static class C1049b extends C0307c implements C0608a3.C0610b {

        /* renamed from: a */
        final PreviewExtenderImpl f2934a;

        /* renamed from: b */
        private final Context f2935b;

        /* renamed from: c */
        final C1039i f2936c;

        /* renamed from: d */
        volatile boolean f2937d = true;

        /* renamed from: e */
        final Object f2938e = new Object();

        /* renamed from: f */
        private volatile int f2939f = 0;

        /* renamed from: g */
        private volatile boolean f2940g = false;

        C1049b(PreviewExtenderImpl previewExtenderImpl, Context context, C1039i iVar) {
            this.f2934a = previewExtenderImpl;
            this.f2935b = context;
            this.f2936c = iVar;
        }

        /* renamed from: h */
        private void m4049h() {
            synchronized (this.f2938e) {
                if (this.f2937d) {
                    C1039i iVar = this.f2936c;
                    if (iVar != null) {
                        iVar.close();
                    }
                    this.f2934a.onDeInit();
                    this.f2937d = false;
                }
            }
        }

        /* renamed from: b */
        public void mo2592b() {
            synchronized (this.f2938e) {
                this.f2940g = true;
                if (this.f2939f == 0) {
                    m4049h();
                }
            }
        }

        /* renamed from: c */
        public void mo2593c(C0957q1 q1Var) {
            synchronized (this.f2938e) {
                if (this.f2937d) {
                    this.f2934a.onInit(C0597i.m2471b(q1Var).mo2533e(), C0597i.m2470a(q1Var), this.f2935b);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r2 = r3.f2938e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r3.f2939f--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            if (r3.f2939f != 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            if (r3.f2940g == false) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            m4049h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
            r1 = r3.f2938e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r3.f2939f--;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r3.f2939f != 0) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
            if (r3.f2940g == false) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
            m4049h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0049, code lost:
            return null;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.C0788c1 mo1891d() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2938e     // Catch:{ all -> 0x0050 }
                monitor-enter(r0)     // Catch:{ all -> 0x0050 }
                boolean r1 = r3.f2937d     // Catch:{ all -> 0x004d }
                if (r1 == 0) goto L_0x0032
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r3.f2934a     // Catch:{ all -> 0x004d }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.onDisableSession()     // Catch:{ all -> 0x004d }
                if (r1 == 0) goto L_0x0032
                androidx.camera.extensions.f.b r2 = new androidx.camera.extensions.f.b     // Catch:{ all -> 0x004d }
                r2.<init>(r1)     // Catch:{ all -> 0x004d }
                androidx.camera.core.impl.c1 r1 = r2.mo2981b()     // Catch:{ all -> 0x004d }
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                java.lang.Object r2 = r3.f2938e
                monitor-enter(r2)
                int r0 = r3.f2939f     // Catch:{ all -> 0x002f }
                int r0 = r0 + -1
                r3.f2939f = r0     // Catch:{ all -> 0x002f }
                int r0 = r3.f2939f     // Catch:{ all -> 0x002f }
                if (r0 != 0) goto L_0x002d
                boolean r0 = r3.f2940g     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
                r3.m4049h()     // Catch:{ all -> 0x002f }
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return r1
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                r0 = 0
                java.lang.Object r1 = r3.f2938e
                monitor-enter(r1)
                int r2 = r3.f2939f     // Catch:{ all -> 0x004a }
                int r2 = r2 + -1
                r3.f2939f = r2     // Catch:{ all -> 0x004a }
                int r2 = r3.f2939f     // Catch:{ all -> 0x004a }
                if (r2 != 0) goto L_0x0048
                boolean r2 = r3.f2940g     // Catch:{ all -> 0x004a }
                if (r2 == 0) goto L_0x0048
                r3.m4049h()     // Catch:{ all -> 0x004a }
            L_0x0048:
                monitor-exit(r1)     // Catch:{ all -> 0x004a }
                return r0
            L_0x004a:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004a }
                throw r0
            L_0x004d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                throw r1     // Catch:{ all -> 0x0050 }
            L_0x0050:
                r0 = move-exception
                java.lang.Object r1 = r3.f2938e
                monitor-enter(r1)
                int r2 = r3.f2939f     // Catch:{ all -> 0x0067 }
                int r2 = r2 + -1
                r3.f2939f = r2     // Catch:{ all -> 0x0067 }
                int r2 = r3.f2939f     // Catch:{ all -> 0x0067 }
                if (r2 != 0) goto L_0x0065
                boolean r2 = r3.f2940g     // Catch:{ all -> 0x0067 }
                if (r2 == 0) goto L_0x0065
                r3.m4049h()     // Catch:{ all -> 0x0067 }
            L_0x0065:
                monitor-exit(r1)     // Catch:{ all -> 0x0067 }
                throw r0
            L_0x0067:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0067 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1047m.C1049b.mo1891d():androidx.camera.core.impl.c1");
        }

        /* renamed from: e */
        public C0788c1 mo1892e() {
            CaptureStageImpl onEnableSession;
            try {
                synchronized (this.f2938e) {
                    if (!this.f2937d || (onEnableSession = this.f2934a.onEnableSession()) == null) {
                        synchronized (this.f2938e) {
                            this.f2939f++;
                        }
                        return null;
                    }
                    C0788c1 b = new C1030b(onEnableSession).mo2981b();
                    synchronized (this.f2938e) {
                        this.f2939f++;
                    }
                    return b;
                }
            } catch (Throwable th) {
                synchronized (this.f2938e) {
                    this.f2939f++;
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.C0788c1 mo1893f() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2938e
                monitor-enter(r0)
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r4.f2934a     // Catch:{ all -> 0x0026 }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.onPresetSession()     // Catch:{ all -> 0x0026 }
                if (r1 == 0) goto L_0x0023
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0026 }
                r3 = 28
                if (r2 < r3) goto L_0x001c
                androidx.camera.extensions.f.b r2 = new androidx.camera.extensions.f.b     // Catch:{ all -> 0x0026 }
                r2.<init>(r1)     // Catch:{ all -> 0x0026 }
                androidx.camera.core.impl.c1 r1 = r2.mo2981b()     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                return r1
            L_0x001c:
                java.lang.String r1 = "PreviewConfigProvider"
                java.lang.String r2 = "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!"
                androidx.camera.core.C0949o2.m3698k(r1, r2)     // Catch:{ all -> 0x0026 }
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                r0 = 0
                return r0
            L_0x0026:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1047m.C1049b.mo1893f():androidx.camera.core.impl.c1");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            return null;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.core.impl.C0788c1 mo1894g() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2938e
                monitor-enter(r0)
                boolean r1 = r3.f2937d     // Catch:{ all -> 0x001d }
                if (r1 == 0) goto L_0x001a
                androidx.camera.extensions.impl.PreviewExtenderImpl r1 = r3.f2934a     // Catch:{ all -> 0x001d }
                androidx.camera.extensions.impl.CaptureStageImpl r1 = r1.getCaptureStage()     // Catch:{ all -> 0x001d }
                if (r1 == 0) goto L_0x001a
                androidx.camera.extensions.f.b r2 = new androidx.camera.extensions.f.b     // Catch:{ all -> 0x001d }
                r2.<init>(r1)     // Catch:{ all -> 0x001d }
                androidx.camera.core.impl.c1 r1 = r2.mo2981b()     // Catch:{ all -> 0x001d }
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                return r1
            L_0x001a:
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                r0 = 0
                return r0
            L_0x001d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x001d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.p017f.C1047m.C1049b.mo1894g():androidx.camera.core.impl.c1");
        }
    }

    public C1047m(int i, C1050n nVar, Context context) {
        this.f2932d = i;
        this.f2930b = nVar;
        this.f2931c = context;
    }

    /* renamed from: a */
    public C0813g2 mo3339a() {
        C0967s2.C0969b bVar = new C0967s2.C0969b();
        mo3340b(bVar, this.f2932d, this.f2930b, this.f2931c);
        return bVar.mo2603c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3340b(C0967s2.C0969b bVar, int i, C1050n nVar, Context context) {
        C1049b bVar2;
        C1049b bVar3;
        if (nVar instanceof C1035g) {
            PreviewExtenderImpl k = ((C1035g) nVar).mo3331k();
            int i2 = C1048a.f2933a[k.getProcessorType().ordinal()];
            if (i2 == 1) {
                C1032d dVar = new C1032d(k);
                bVar.mo3230i(dVar);
                bVar3 = new C1049b(k, context, dVar);
            } else if (i2 != 2) {
                bVar2 = new C1049b(k, context, (C1039i) null);
                new C0304b.C0306b(bVar).mo1890a(new C0308d(bVar2));
                bVar.mo3238q(bVar2);
            } else {
                C1031c cVar = new C1031c(k.getProcessor());
                bVar.mo3229h(cVar);
                bVar3 = new C1049b(k, context, cVar);
            }
            bVar2 = bVar3;
            new C0304b.C0306b(bVar).mo1890a(new C0308d(bVar2));
            bVar.mo3238q(bVar2);
        }
        bVar.mo1887b().mo2814q(f2929a, Integer.valueOf(i));
        bVar.mo3231j(nVar.mo3322c());
    }
}
