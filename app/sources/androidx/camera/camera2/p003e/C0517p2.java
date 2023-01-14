package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p002d.C0308d;
import androidx.camera.camera2.p003e.C0329b3;
import androidx.camera.camera2.p003e.C0357f3;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0435b;
import androidx.camera.camera2.p003e.p004j3.p005r0.C0444g;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0484l;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.p2 */
final class C0517p2 implements C0526q2 {

    /* renamed from: a */
    final Object f1665a;

    /* renamed from: b */
    private final List<C0788c1> f1666b;

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f1667c;

    /* renamed from: d */
    private final C0522e f1668d;

    /* renamed from: e */
    C0349e3 f1669e;

    /* renamed from: f */
    C0329b3 f1670f;

    /* renamed from: g */
    C0840m2 f1671g;

    /* renamed from: h */
    C0809g1 f1672h;

    /* renamed from: i */
    C0308d f1673i;

    /* renamed from: j */
    private final Map<C0820i1, Surface> f1674j;

    /* renamed from: k */
    List<C0820i1> f1675k;

    /* renamed from: l */
    C0521d f1676l;

    /* renamed from: m */
    C9172b<Void> f1677m;

    /* renamed from: n */
    C1814b.C1815a<Void> f1678n;

    /* renamed from: o */
    final C0484l f1679o;

    /* renamed from: androidx.camera.camera2.e.p2$a */
    class C0518a extends CameraCaptureSession.CaptureCallback {
        C0518a() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: androidx.camera.camera2.e.p2$b */
    class C0519b implements C0765d<Void> {
        C0519b() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            synchronized (C0517p2.this.f1665a) {
                C0517p2.this.f1669e.mo2005e();
                int i = C0520c.f1682a[C0517p2.this.f1676l.ordinal()];
                if (i == 4 || i == 6 || i == 7) {
                    if (!(th instanceof CancellationException)) {
                        C0949o2.m3699l("CaptureSession", "Opening session with fail " + C0517p2.this.f1676l, th);
                        C0517p2.this.mo2254i();
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
        }
    }

    /* renamed from: androidx.camera.camera2.e.p2$c */
    static /* synthetic */ class C0520c {

        /* renamed from: a */
        static final /* synthetic */ int[] f1682a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.e.p2$d[] r0 = androidx.camera.camera2.p003e.C0517p2.C0521d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1682a = r0
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1682a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.e.p2$d r1 = androidx.camera.camera2.p003e.C0517p2.C0521d.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0517p2.C0520c.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.camera2.e.p2$d */
    enum C0521d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: androidx.camera.camera2.e.p2$e */
    final class C0522e extends C0329b3.C0330a {
        C0522e() {
        }

        /* renamed from: q */
        public void mo1955q(C0329b3 b3Var) {
            synchronized (C0517p2.this.f1665a) {
                switch (C0520c.f1682a[C0517p2.this.f1676l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C0517p2.this.f1676l);
                    case 4:
                    case 6:
                    case 7:
                        C0517p2.this.mo2254i();
                        break;
                    case 8:
                        C0949o2.m3688a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C0949o2.m3690c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C0517p2.this.f1676l);
            }
        }

        /* renamed from: r */
        public void mo1956r(C0329b3 b3Var) {
            synchronized (C0517p2.this.f1665a) {
                switch (C0520c.f1682a[C0517p2.this.f1676l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C0517p2.this.f1676l);
                    case 4:
                        C0517p2 p2Var = C0517p2.this;
                        p2Var.f1676l = C0521d.OPENED;
                        p2Var.f1670f = b3Var;
                        if (p2Var.f1671g != null) {
                            List<C0788c1> b = p2Var.f1673i.mo1897d().mo1899b();
                            if (!b.isEmpty()) {
                                C0517p2 p2Var2 = C0517p2.this;
                                p2Var2.mo2255j(p2Var2.mo2261u(b));
                            }
                        }
                        C0949o2.m3688a("CaptureSession", "Attempting to send capture request onConfigured");
                        C0517p2 p2Var3 = C0517p2.this;
                        p2Var3.mo2257l(p2Var3.f1671g);
                        C0517p2.this.mo2256k();
                        break;
                    case 6:
                        C0517p2.this.f1670f = b3Var;
                        break;
                    case 7:
                        b3Var.close();
                        break;
                }
                C0949o2.m3688a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C0517p2.this.f1676l);
            }
        }

        /* renamed from: s */
        public void mo1957s(C0329b3 b3Var) {
            synchronized (C0517p2.this.f1665a) {
                if (C0520c.f1682a[C0517p2.this.f1676l.ordinal()] != 1) {
                    C0949o2.m3688a("CaptureSession", "CameraCaptureSession.onReady() " + C0517p2.this.f1676l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C0517p2.this.f1676l);
                }
            }
        }

        /* renamed from: t */
        public void mo1958t(C0329b3 b3Var) {
            synchronized (C0517p2.this.f1665a) {
                if (C0517p2.this.f1676l != C0521d.UNINITIALIZED) {
                    C0949o2.m3688a("CaptureSession", "onSessionFinished()");
                    C0517p2.this.mo2254i();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C0517p2.this.f1676l);
                }
            }
        }
    }

    C0517p2() {
        this.f1665a = new Object();
        this.f1666b = new ArrayList();
        this.f1667c = new C0518a();
        this.f1672h = C0802e2.m3154G();
        this.f1673i = C0308d.m1523e();
        this.f1674j = new HashMap();
        this.f1675k = Collections.emptyList();
        this.f1676l = C0521d.UNINITIALIZED;
        this.f1679o = new C0484l();
        this.f1676l = C0521d.INITIALIZED;
        this.f1668d = new C0522e();
    }

    /* renamed from: h */
    private CameraCaptureSession.CaptureCallback m2058h(List<C0783b0> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (C0783b0 a : list) {
            arrayList.add(C0513o2.m2049a(a));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C0574y1.m2390a(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void mo2258n(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f1665a) {
            if (this.f1676l == C0521d.OPENED) {
                mo2257l(this.f1671g);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object mo2260r(C1814b.C1815a aVar) {
        String str;
        synchronized (this.f1665a) {
            C1177h.m4586h(this.f1678n == null, "Release completer expected to be null");
            this.f1678n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: s */
    private static C0809g1 m2062s(List<C0788c1> list) {
        C0714a2 J = C0714a2.m2954J();
        for (C0788c1 c : list) {
            C0809g1 c2 = c.mo2952c();
            for (C0809g1.C0810a next : c2.mo2496c()) {
                Object d = c2.mo2497d(next, null);
                if (J.mo2495b(next)) {
                    Object d2 = J.mo2497d(next, null);
                    if (!Objects.equals(d2, d)) {
                        C0949o2.m3688a("CaptureSession", "Detect conflicting option " + next.mo2986c() + " : " + d + " != " + d2);
                    }
                } else {
                    J.mo2814q(next, d);
                }
            }
        }
        return J;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public C9172b<Void> m2060o(List<Surface> list, C0840m2 m2Var, CameraDevice cameraDevice) {
        synchronized (this.f1665a) {
            int i = C0520c.f1682a[this.f1676l.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.f1674j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.f1674j.put(this.f1675k.get(i2), list.get(i2));
                    }
                    ArrayList<Surface> arrayList = new ArrayList<>(new LinkedHashSet(list));
                    this.f1676l = C0521d.OPENING;
                    C0949o2.m3688a("CaptureSession", "Opening capture session.");
                    C0329b3.C0330a v = C0357f3.m1721v(this.f1668d, new C0357f3.C0358a(m2Var.mo3032g()));
                    C0304b bVar = new C0304b(m2Var.mo3029d());
                    C0308d H = bVar.mo1878H(C0308d.m1523e());
                    this.f1673i = H;
                    List<C0788c1> c = H.mo1897d().mo1900c();
                    C0788c1.C0789a k = C0788c1.C0789a.m3120k(m2Var.mo3031f());
                    for (C0788c1 c2 : c) {
                        k.mo2961e(c2.mo2952c());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Surface bVar2 : arrayList) {
                        C0435b bVar3 = new C0435b(bVar2);
                        bVar3.mo2171c(bVar.mo1883M((String) null));
                        arrayList2.add(bVar3);
                    }
                    C0444g a = this.f1669e.mo2001a(0, arrayList2, v);
                    try {
                        CaptureRequest c3 = C0328b2.m1624c(k.mo2964h(), cameraDevice);
                        if (c3 != null) {
                            a.mo2193f(c3);
                        }
                        C9172b<Void> c4 = this.f1669e.mo2003c(cameraDevice, a, this.f1675k);
                        return c4;
                    } catch (CameraAccessException e) {
                        return C0768f.m3079e(e);
                    }
                } else if (i != 5) {
                    C9172b<Void> e2 = C0768f.m3079e(new CancellationException("openCaptureSession() not execute in state: " + this.f1676l));
                    return e2;
                }
            }
            C9172b<Void> e3 = C0768f.m3079e(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f1676l));
            return e3;
        }
    }

    /* renamed from: a */
    public void mo2246a() {
        ArrayList<C0788c1> arrayList;
        synchronized (this.f1665a) {
            if (!this.f1666b.isEmpty()) {
                arrayList = new ArrayList<>(this.f1666b);
                this.f1666b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (C0788c1 b : arrayList) {
                for (C0783b0 a : b.mo2951b()) {
                    a.mo1919a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r3.f1676l = androidx.camera.camera2.p003e.C0517p2.C0521d.f1689t;
        r4 = r3.f1669e;
        androidx.core.util.C1177h.m4584f(r4, "The Opener shouldn't null in state:" + r3.f1676l);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r3.f1669e.mo2005e() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        mo2254i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3.f1677m != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r3.f1677m = p027c.p061g.p062a.C1814b.m7736a(new androidx.camera.camera2.p003e.C0499l0(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = r3.f1677m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r3.f1676l = androidx.camera.camera2.p003e.C0517p2.C0521d.f1690u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        return androidx.camera.core.impl.p014a3.p016o.C0768f.m3081g(null);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p319f.p390b.p391a.p392a.C9172b<java.lang.Void> mo2247b(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1665a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.p003e.C0517p2.C0520c.f1682a     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x00a6 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00a6 }
            r1 = r1[r2]     // Catch:{ all -> 0x00a6 }
            switch(r1) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0081;
                case 3: goto L_0x0064;
                case 4: goto L_0x0029;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x0051;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x00a6 }
        L_0x0010:
            goto L_0x009f
        L_0x0012:
            androidx.camera.camera2.e.b3 r1 = r3.f1670f     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0024
            r1.mo1947g()     // Catch:{ CameraAccessException -> 0x001c }
            goto L_0x0024
        L_0x001c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.C0949o2.m3691d(r1, r2, r4)     // Catch:{ all -> 0x00a6 }
        L_0x0024:
            androidx.camera.camera2.e.b3 r4 = r3.f1670f     // Catch:{ all -> 0x00a6 }
            r4.close()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            androidx.camera.camera2.e.p2$d r4 = androidx.camera.camera2.p003e.C0517p2.C0521d.RELEASING     // Catch:{ all -> 0x00a6 }
            r3.f1676l = r4     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.e3 r4 = r3.f1669e     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            androidx.core.util.C1177h.m4584f(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.e3 r4 = r3.f1669e     // Catch:{ all -> 0x00a6 }
            boolean r4 = r4.mo2005e()     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x0051
            r3.mo2254i()     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0051:
            e.f.b.a.a.b<java.lang.Void> r4 = r3.f1677m     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x0060
            androidx.camera.camera2.e.l0 r4 = new androidx.camera.camera2.e.l0     // Catch:{ all -> 0x00a6 }
            r4.<init>(r3)     // Catch:{ all -> 0x00a6 }
            e.f.b.a.a.b r4 = p027c.p061g.p062a.C1814b.m7736a(r4)     // Catch:{ all -> 0x00a6 }
            r3.f1677m = r4     // Catch:{ all -> 0x00a6 }
        L_0x0060:
            e.f.b.a.a.b<java.lang.Void> r4 = r3.f1677m     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            return r4
        L_0x0064:
            androidx.camera.camera2.e.e3 r4 = r3.f1669e     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            androidx.core.util.C1177h.m4584f(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.e3 r4 = r3.f1669e     // Catch:{ all -> 0x00a6 }
            r4.mo2005e()     // Catch:{ all -> 0x00a6 }
        L_0x0081:
            androidx.camera.camera2.e.p2$d r4 = androidx.camera.camera2.p003e.C0517p2.C0521d.RELEASED     // Catch:{ all -> 0x00a6 }
            r3.f1676l = r4     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0086:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r4     // Catch:{ all -> 0x00a6 }
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            r4 = 0
            e.f.b.a.a.b r4 = androidx.camera.core.impl.p014a3.p016o.C0768f.m3081g(r4)
            return r4
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0517p2.mo2247b(boolean):e.f.b.a.a.b");
    }

    /* renamed from: c */
    public List<C0788c1> mo2248c() {
        List<C0788c1> unmodifiableList;
        synchronized (this.f1665a) {
            unmodifiableList = Collections.unmodifiableList(this.f1666b);
        }
        return unmodifiableList;
    }

    public void close() {
        synchronized (this.f1665a) {
            int i = C0520c.f1682a[this.f1676l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f1671g != null) {
                                    List<C0788c1> a = this.f1673i.mo1897d().mo1898a();
                                    if (!a.isEmpty()) {
                                        try {
                                            mo2250d(mo2261u(a));
                                        } catch (IllegalStateException e) {
                                            C0949o2.m3691d("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        C0349e3 e3Var = this.f1669e;
                        C1177h.m4584f(e3Var, "The Opener shouldn't null in state:" + this.f1676l);
                        this.f1669e.mo2005e();
                        this.f1676l = C0521d.CLOSED;
                        this.f1671g = null;
                    } else {
                        C0349e3 e3Var2 = this.f1669e;
                        C1177h.m4584f(e3Var2, "The Opener shouldn't null in state:" + this.f1676l);
                        this.f1669e.mo2005e();
                    }
                }
                this.f1676l = C0521d.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f1676l);
            }
        }
    }

    /* renamed from: d */
    public void mo2250d(List<C0788c1> list) {
        synchronized (this.f1665a) {
            switch (C0520c.f1682a[this.f1676l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f1676l);
                case 2:
                case 3:
                case 4:
                    this.f1666b.addAll(list);
                    break;
                case 5:
                    this.f1666b.addAll(list);
                    mo2256k();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    /* renamed from: e */
    public C0840m2 mo2251e() {
        C0840m2 m2Var;
        synchronized (this.f1665a) {
            m2Var = this.f1671g;
        }
        return m2Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2252f(androidx.camera.core.impl.C0840m2 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1665a
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.p003e.C0517p2.C0520c.f1682a     // Catch:{ all -> 0x0063 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x0063 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0063 }
            r1 = r1[r2]     // Catch:{ all -> 0x0063 }
            switch(r1) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                case 4: goto L_0x0045;
                case 5: goto L_0x0019;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x0063 }
        L_0x0010:
            goto L_0x0061
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x0063 }
            throw r4     // Catch:{ all -> 0x0063 }
        L_0x0019:
            r3.f1671g = r4     // Catch:{ all -> 0x0063 }
            if (r4 != 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x001f:
            java.util.Map<androidx.camera.core.impl.i1, android.view.Surface> r1 = r3.f1674j     // Catch:{ all -> 0x0063 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0063 }
            java.util.List r4 = r4.mo3034i()     // Catch:{ all -> 0x0063 }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x0063 }
            if (r4 != 0) goto L_0x0038
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            androidx.camera.core.C0949o2.m3690c(r4, r1)     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0038:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.C0949o2.m3688a(r4, r1)     // Catch:{ all -> 0x0063 }
            androidx.camera.core.impl.m2 r4 = r3.f1671g     // Catch:{ all -> 0x0063 }
            r3.mo2257l(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x0045:
            r3.f1671g = r4     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x0048:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r1.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0063 }
            androidx.camera.camera2.e.p2$d r2 = r3.f1676l     // Catch:{ all -> 0x0063 }
            r1.append(r2)     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0063 }
            r4.<init>(r1)     // Catch:{ all -> 0x0063 }
            throw r4     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            return
        L_0x0063:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0517p2.mo2252f(androidx.camera.core.impl.m2):void");
    }

    /* renamed from: g */
    public C9172b<Void> mo2253g(C0840m2 m2Var, CameraDevice cameraDevice, C0349e3 e3Var) {
        synchronized (this.f1665a) {
            if (C0520c.f1682a[this.f1676l.ordinal()] != 2) {
                C0949o2.m3690c("CaptureSession", "Open not allowed in state: " + this.f1676l);
                C9172b<Void> e = C0768f.m3079e(new IllegalStateException("open() should not allow the state: " + this.f1676l));
                return e;
            }
            this.f1676l = C0521d.GET_SURFACE;
            ArrayList arrayList = new ArrayList(m2Var.mo3034i());
            this.f1675k = arrayList;
            this.f1669e = e3Var;
            C0766e<T> f = C0766e.m3068a(e3Var.mo2004d(arrayList, 5000)).mo2920f(new C0503m0(this, m2Var, cameraDevice), this.f1669e.mo2002b());
            C0768f.m3075a(f, new C0519b(), this.f1669e.mo2002b());
            C9172b<Void> i = C0768f.m3083i(f);
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2254i() {
        C0521d dVar = this.f1676l;
        C0521d dVar2 = C0521d.RELEASED;
        if (dVar == dVar2) {
            C0949o2.m3688a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f1676l = dVar2;
        this.f1670f = null;
        C1814b.C1815a<Void> aVar = this.f1678n;
        if (aVar != null) {
            aVar.mo6308c(null);
            this.f1678n = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo2255j(List<C0788c1> list) {
        boolean z;
        synchronized (this.f1665a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                C0362g2 g2Var = new C0362g2();
                ArrayList arrayList = new ArrayList();
                C0949o2.m3688a("CaptureSession", "Issuing capture request.");
                boolean z2 = false;
                for (C0788c1 next : list) {
                    if (next.mo2953d().isEmpty()) {
                        C0949o2.m3688a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<C0820i1> it = next.mo2953d().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            C0820i1 next2 = it.next();
                            if (!this.f1674j.containsKey(next2)) {
                                C0949o2.m3688a("CaptureSession", "Skipping capture request with invalid surface: " + next2);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (next.mo2955f() == 2) {
                                z2 = true;
                            }
                            C0788c1.C0789a k = C0788c1.C0789a.m3120k(next);
                            C0840m2 m2Var = this.f1671g;
                            if (m2Var != null) {
                                k.mo2961e(m2Var.mo3031f().mo2952c());
                            }
                            k.mo2961e(this.f1672h);
                            k.mo2961e(next.mo2952c());
                            CaptureRequest b = C0328b2.m1623b(k.mo2964h(), this.f1670f.mo1948h(), this.f1674j);
                            if (b == null) {
                                C0949o2.m3688a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (C0783b0 b2 : next.mo2951b()) {
                                C0513o2.m2050b(b2, arrayList2);
                            }
                            g2Var.mo2012a(b, arrayList2);
                            arrayList.add(b);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (this.f1679o.mo2229a(arrayList, z2)) {
                        this.f1670f.mo1950k();
                        g2Var.mo2013c(new C0507n0(this));
                    }
                    int e = this.f1670f.mo1945e(arrayList, g2Var);
                    return e;
                }
                C0949o2.m3688a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            } catch (CameraAccessException e2) {
                C0949o2.m3690c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2256k() {
        if (!this.f1666b.isEmpty()) {
            try {
                mo2255j(this.f1666b);
            } finally {
                this.f1666b.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo2257l(C0840m2 m2Var) {
        synchronized (this.f1665a) {
            if (m2Var == null) {
                C0949o2.m3688a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C0788c1 f = m2Var.mo3031f();
            if (f.mo2953d().isEmpty()) {
                C0949o2.m3688a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f1670f.mo1950k();
                } catch (CameraAccessException e) {
                    C0949o2.m3690c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } else {
                try {
                    C0949o2.m3688a("CaptureSession", "Issuing request for session.");
                    C0788c1.C0789a k = C0788c1.C0789a.m3120k(f);
                    C0809g1 s = m2062s(this.f1673i.mo1897d().mo1901d());
                    this.f1672h = s;
                    k.mo2961e(s);
                    CaptureRequest b = C0328b2.m1623b(k.mo2964h(), this.f1670f.mo1948h(), this.f1674j);
                    if (b == null) {
                        C0949o2.m3688a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    int i = this.f1670f.mo1949i(b, m2058h(f.mo2951b(), this.f1667c));
                    return i;
                } catch (CameraAccessException e2) {
                    C0949o2.m3690c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public List<C0788c1> mo2261u(List<C0788c1> list) {
        ArrayList arrayList = new ArrayList();
        for (C0788c1 k : list) {
            C0788c1.C0789a k2 = C0788c1.C0789a.m3120k(k);
            k2.mo2969o(1);
            for (C0820i1 f : this.f1671g.mo3031f().mo2953d()) {
                k2.mo2962f(f);
            }
            arrayList.add(k2.mo2964h());
        }
        return arrayList;
    }
}
