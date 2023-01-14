package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0627c2;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0784b1;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0805f1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0849n1;
import androidx.camera.core.impl.C0863q1;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.impl.p014a3.C0716b;
import androidx.camera.core.impl.p014a3.C0724f;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.core.p009e3.C0654g;
import androidx.camera.core.p009e3.C0656i;
import androidx.camera.core.p009e3.C0660m;
import androidx.camera.core.p009e3.C0662o;
import androidx.camera.core.p009e3.p010p.p012f.C0675b;
import androidx.camera.core.p009e3.p013q.C0677a;
import androidx.core.util.C1177h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.h2 */
public final class C0693h2 extends C0608a3 {

    /* renamed from: l */
    public static final C0699f f2163l = new C0699f();

    /* renamed from: A */
    C0991v2 f2164A;

    /* renamed from: B */
    C0977t2 f2165B;

    /* renamed from: C */
    private C0783b0 f2166C;

    /* renamed from: D */
    private C0820i1 f2167D;

    /* renamed from: E */
    private C0701h f2168E;

    /* renamed from: F */
    final Executor f2169F;

    /* renamed from: G */
    private Matrix f2170G = new Matrix();

    /* renamed from: m */
    private final C0889u1.C0890a f2171m = C0614b0.f1996a;

    /* renamed from: n */
    final Executor f2172n;

    /* renamed from: o */
    private final int f2173o;

    /* renamed from: p */
    private final AtomicReference<Integer> f2174p = new AtomicReference<>((Object) null);

    /* renamed from: q */
    private final int f2175q;

    /* renamed from: r */
    private int f2176r = -1;

    /* renamed from: s */
    private Rational f2177s = null;

    /* renamed from: t */
    private ExecutorService f2178t;

    /* renamed from: u */
    private C0788c1 f2179u;

    /* renamed from: v */
    private C0784b1 f2180v;

    /* renamed from: w */
    private int f2181w;

    /* renamed from: x */
    private C0795d1 f2182x;

    /* renamed from: y */
    private boolean f2183y = false;

    /* renamed from: z */
    C0840m2.C0842b f2184z;

    /* renamed from: androidx.camera.core.h2$a */
    class C0694a extends C0783b0 {
        C0694a() {
        }
    }

    /* renamed from: androidx.camera.core.h2$b */
    class C0695b implements C0701h.C0704c {

        /* renamed from: a */
        final /* synthetic */ C0662o f2186a;

        C0695b(C0662o oVar) {
            this.f2186a = oVar;
        }

        /* renamed from: a */
        public void mo2759a(C0700g gVar) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f2186a.mo2712f(gVar.f2195b);
            }
        }
    }

    /* renamed from: androidx.camera.core.h2$c */
    class C0696c implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f2188a;

        C0696c(C1814b.C1815a aVar) {
            this.f2188a = aVar;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0693h2.this.mo2757t0();
            this.f2188a.mo6310f(th);
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            C0693h2.this.mo2757t0();
        }
    }

    /* renamed from: androidx.camera.core.h2$d */
    class C0697d implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2190a = new AtomicInteger(0);

        C0697d() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f2190a.getAndIncrement());
        }
    }

    /* renamed from: androidx.camera.core.h2$e */
    public static final class C0698e implements C0908x2.C0909a<C0693h2, C0849n1, C0698e>, C0877s1.C0878a<C0698e> {

        /* renamed from: a */
        private final C0714a2 f2192a;

        public C0698e() {
            this(C0714a2.m2954J());
        }

        private C0698e(C0714a2 a2Var) {
            Class<C0693h2> cls = C0693h2.class;
            this.f2192a = a2Var;
            Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
            if (cls2 == null || cls2.equals(cls)) {
                mo2771o(cls);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }

        /* renamed from: f */
        public static C0698e m2895f(C0809g1 g1Var) {
            return new C0698e(C0714a2.m2955K(g1Var));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f2192a;
        }

        /* renamed from: e */
        public C0693h2 mo2762e() {
            int intValue;
            int i;
            C0809g1.C0810a<Integer> aVar;
            C0922z1 z1Var;
            if (mo1887b().mo2497d(C0877s1.f2545f, null) == null || mo1887b().mo2497d(C0877s1.f2547h, null) == null) {
                Integer num = (Integer) mo1887b().mo2497d(C0849n1.f2492A, null);
                boolean z = false;
                if (num != null) {
                    C1177h.m4580b(mo1887b().mo2497d(C0849n1.f2501z, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                    mo1887b().mo2814q(C0863q1.f2513e, num);
                } else {
                    if (mo1887b().mo2497d(C0849n1.f2501z, null) != null) {
                        z1Var = mo1887b();
                        aVar = C0863q1.f2513e;
                        i = 35;
                    } else {
                        z1Var = mo1887b();
                        aVar = C0863q1.f2513e;
                        i = 256;
                    }
                    z1Var.mo2814q(aVar, Integer.valueOf(i));
                }
                C0693h2 h2Var = new C0693h2(mo2603c());
                Size size = (Size) mo1887b().mo2497d(C0877s1.f2547h, null);
                if (size != null) {
                    h2Var.mo2753n0(new Rational(size.getWidth(), size.getHeight()));
                }
                if (((Integer) mo1887b().mo2497d(C0849n1.f2493B, 2)).intValue() >= 1) {
                    z = true;
                }
                C1177h.m4580b(z, "Maximum outstanding image count must be at least 1");
                C1177h.m4584f((Executor) mo1887b().mo2497d(C0654g.f2114r, C0744a.m3046c()), "The IO executor can't be null");
                C0922z1 b = mo1887b();
                C0809g1.C0810a<Integer> aVar2 = C0849n1.f2499x;
                if (!b.mo2495b(aVar2) || (intValue = ((Integer) mo1887b().mo2494a(aVar2)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                    return h2Var;
                }
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        /* renamed from: g */
        public C0849n1 mo2603c() {
            return new C0849n1(C0802e2.m3155H(this.f2192a));
        }

        /* renamed from: h */
        public C0698e mo2764h(C0784b1 b1Var) {
            mo1887b().mo2814q(C0849n1.f2500y, b1Var);
            return this;
        }

        /* renamed from: i */
        public C0698e mo2765i(int i) {
            mo1887b().mo2814q(C0849n1.f2498w, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C0698e mo2766j(C0795d1 d1Var) {
            mo1887b().mo2814q(C0849n1.f2501z, d1Var);
            return this;
        }

        /* renamed from: k */
        public C0698e mo2767k(int i) {
            mo1887b().mo2814q(C0849n1.f2493B, Integer.valueOf(i));
            return this;
        }

        /* renamed from: l */
        public C0698e mo2768l(List<Pair<Integer, Size[]>> list) {
            mo1887b().mo2814q(C0877s1.f2550k, list);
            return this;
        }

        /* renamed from: m */
        public C0698e mo2769m(int i) {
            mo1887b().mo2814q(C0908x2.f2605p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: n */
        public C0698e mo2770n(int i) {
            mo1887b().mo2814q(C0877s1.f2545f, Integer.valueOf(i));
            return this;
        }

        /* renamed from: o */
        public C0698e mo2771o(Class<C0693h2> cls) {
            mo1887b().mo2814q(C0656i.f2116t, cls);
            if (mo1887b().mo2497d(C0656i.f2115s, null) == null) {
                mo2772p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: p */
        public C0698e mo2772p(String str) {
            mo1887b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: q */
        public C0698e mo2602a(Size size) {
            mo1887b().mo2814q(C0877s1.f2547h, size);
            return this;
        }

        /* renamed from: r */
        public C0698e mo2604d(int i) {
            mo1887b().mo2814q(C0877s1.f2546g, Integer.valueOf(i));
            return this;
        }

        /* renamed from: s */
        public C0698e mo2775s(C0608a3.C0610b bVar) {
            mo1887b().mo2814q(C0660m.f2118v, bVar);
            return this;
        }
    }

    /* renamed from: androidx.camera.core.h2$f */
    public static final class C0699f {

        /* renamed from: a */
        private static final C0849n1 f2193a = new C0698e().mo2769m(4).mo2770n(0).mo2603c();

        /* renamed from: a */
        public C0849n1 mo2776a() {
            return f2193a;
        }
    }

    /* renamed from: androidx.camera.core.h2$g */
    static class C0700g {

        /* renamed from: a */
        final int f2194a;

        /* renamed from: b */
        final int f2195b;

        /* renamed from: c */
        private final Rational f2196c;

        /* renamed from: d */
        private final Executor f2197d;

        /* renamed from: e */
        private final C0705i f2198e;

        /* renamed from: f */
        AtomicBoolean f2199f = new AtomicBoolean(false);

        /* renamed from: g */
        private final Rect f2200g;

        /* renamed from: h */
        private final Matrix f2201h;

        C0700g(int i, int i2, Rational rational, Rect rect, Matrix matrix, Executor executor, C0705i iVar) {
            boolean z = false;
            this.f2194a = i;
            this.f2195b = i2;
            if (rational != null) {
                C1177h.m4580b(!rational.isZero(), "Target ratio cannot be zero");
                C1177h.m4580b(rational.floatValue() > 0.0f ? true : z, "Target ratio must be positive");
            }
            this.f2196c = rational;
            this.f2200g = rect;
            this.f2201h = matrix;
            this.f2197d = executor;
            this.f2198e = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void mo2778c(ImageProxy imageProxy) {
            this.f2198e.mo2786a(imageProxy);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void mo2779e(int i, String str, Throwable th) {
            this.f2198e.mo2787b(new C0709i2(i, str, th));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2777a(ImageProxy imageProxy) {
            int i;
            Size size;
            if (!this.f2199f.compareAndSet(false, true)) {
                imageProxy.close();
                return;
            }
            if (new C0675b().mo2718b(imageProxy)) {
                try {
                    ByteBuffer d = imageProxy.mo2542m()[0].mo2544d();
                    d.rewind();
                    byte[] bArr = new byte[d.capacity()];
                    d.get(bArr);
                    C0724f d2 = C0724f.m2986d(new ByteArrayInputStream(bArr));
                    d.rewind();
                    size = new Size(d2.mo2837l(), d2.mo2832g());
                    i = d2.mo2835j();
                } catch (IOException e) {
                    mo2780f(1, "Unable to parse JPEG exif", e);
                    imageProxy.close();
                    return;
                }
            } else {
                size = new Size(imageProxy.mo2541e(), imageProxy.mo2539c());
                i = this.f2194a;
            }
            C0997w2 w2Var = new C0997w2(imageProxy, size, C0940m2.m3675a(imageProxy.mo2537U().mo2693c(), imageProxy.mo2537U().mo2692b(), i, this.f2201h));
            w2Var.mo2536S(C0693h2.m2847M(this.f2200g, this.f2196c, this.f2194a, size, i));
            try {
                this.f2197d.execute(new C0972t(this, w2Var));
            } catch (RejectedExecutionException unused) {
                C0949o2.m3690c("ImageCapture", "Unable to post to the supplied executor.");
                imageProxy.close();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo2780f(int i, String str, Throwable th) {
            if (this.f2199f.compareAndSet(false, true)) {
                try {
                    this.f2197d.execute(new C0963s(this, i, str, th));
                } catch (RejectedExecutionException unused) {
                    C0949o2.m3690c("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* renamed from: androidx.camera.core.h2$h */
    static class C0701h implements C0627c2.C0628a {

        /* renamed from: a */
        private final Deque<C0700g> f2202a = new ArrayDeque();

        /* renamed from: b */
        C0700g f2203b = null;

        /* renamed from: c */
        C9172b<ImageProxy> f2204c = null;

        /* renamed from: d */
        int f2205d = 0;

        /* renamed from: e */
        private final C0703b f2206e;

        /* renamed from: f */
        private final int f2207f;

        /* renamed from: g */
        private final C0704c f2208g;

        /* renamed from: h */
        final Object f2209h = new Object();

        /* renamed from: androidx.camera.core.h2$h$a */
        class C0702a implements C0765d<ImageProxy> {

            /* renamed from: a */
            final /* synthetic */ C0700g f2210a;

            C0702a(C0700g gVar) {
                this.f2210a = gVar;
            }

            /* renamed from: b */
            public void mo1981b(Throwable th) {
                synchronized (C0701h.this.f2209h) {
                    if (!(th instanceof CancellationException)) {
                        this.f2210a.mo2780f(C0693h2.m2850Q(th), th != null ? th.getMessage() : "Unknown error", th);
                    }
                    C0701h hVar = C0701h.this;
                    hVar.f2203b = null;
                    hVar.f2204c = null;
                    hVar.mo2782c();
                }
            }

            /* renamed from: c */
            public void mo1980a(ImageProxy imageProxy) {
                synchronized (C0701h.this.f2209h) {
                    C1177h.m4583e(imageProxy);
                    C1007y2 y2Var = new C1007y2(imageProxy);
                    y2Var.mo2623a(C0701h.this);
                    C0701h.this.f2205d++;
                    this.f2210a.mo2777a(y2Var);
                    C0701h hVar = C0701h.this;
                    hVar.f2203b = null;
                    hVar.f2204c = null;
                    hVar.mo2782c();
                }
            }
        }

        /* renamed from: androidx.camera.core.h2$h$b */
        interface C0703b {
            /* renamed from: a */
            C9172b<ImageProxy> mo2785a(C0700g gVar);
        }

        /* renamed from: androidx.camera.core.h2$h$c */
        interface C0704c {
            /* renamed from: a */
            void mo2759a(C0700g gVar);
        }

        C0701h(int i, C0703b bVar, C0704c cVar) {
            this.f2207f = i;
            this.f2206e = bVar;
            this.f2208g = cVar;
        }

        /* renamed from: a */
        public void mo2625a(ImageProxy imageProxy) {
            synchronized (this.f2209h) {
                this.f2205d--;
                mo2782c();
            }
        }

        /* renamed from: b */
        public void mo2781b(Throwable th) {
            C0700g gVar;
            C9172b<ImageProxy> bVar;
            ArrayList<C0700g> arrayList;
            synchronized (this.f2209h) {
                gVar = this.f2203b;
                this.f2203b = null;
                bVar = this.f2204c;
                this.f2204c = null;
                arrayList = new ArrayList<>(this.f2202a);
                this.f2202a.clear();
            }
            if (!(gVar == null || bVar == null)) {
                gVar.mo2780f(C0693h2.m2850Q(th), th.getMessage(), th);
                bVar.cancel(true);
            }
            for (C0700g f : arrayList) {
                f.mo2780f(C0693h2.m2850Q(th), th.getMessage(), th);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2782c() {
            synchronized (this.f2209h) {
                if (this.f2203b == null) {
                    if (this.f2205d >= this.f2207f) {
                        C0949o2.m3698k("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                        return;
                    }
                    C0700g poll = this.f2202a.poll();
                    if (poll != null) {
                        this.f2203b = poll;
                        C0704c cVar = this.f2208g;
                        if (cVar != null) {
                            cVar.mo2759a(poll);
                        }
                        C9172b<ImageProxy> a = this.f2206e.mo2785a(poll);
                        this.f2204c = a;
                        C0768f.m3075a(a, new C0702a(poll), C0744a.m3044a());
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo2783d(C0700g gVar) {
            synchronized (this.f2209h) {
                this.f2202a.offer(gVar);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f2203b != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.f2202a.size());
                C0949o2.m3688a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                mo2782c();
            }
        }
    }

    /* renamed from: androidx.camera.core.h2$i */
    public static abstract class C0705i {
        /* renamed from: a */
        public void mo2786a(ImageProxy imageProxy) {
        }

        /* renamed from: b */
        public void mo2787b(C0709i2 i2Var) {
        }
    }

    C0693h2(C0849n1 n1Var) {
        super(n1Var);
        C0849n1 n1Var2 = (C0849n1) mo2571f();
        this.f2173o = n1Var2.mo2495b(C0849n1.f2498w) ? n1Var2.mo3063H() : 1;
        this.f2175q = n1Var2.mo3066K(0);
        Executor executor = (Executor) C1177h.m4583e(n1Var2.mo3068M(C0744a.m3046c()));
        this.f2172n = executor;
        this.f2169F = C0744a.m3050g(executor);
    }

    /* renamed from: K */
    private void m2846K() {
        if (this.f2168E != null) {
            this.f2168E.mo2781b(new C0934l1("Camera is closed."));
        }
    }

    /* renamed from: M */
    static Rect m2847M(Rect rect, Rational rational, int i, Size size, int i2) {
        if (rect != null) {
            return C0677a.m2810b(rect, i, size, i2);
        }
        if (rational != null) {
            if (i2 % 180 != 0) {
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
            }
            if (C0677a.m2814f(size, rational)) {
                return C0677a.m2809a(size, rational);
            }
        }
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* renamed from: O */
    static boolean m2848O(C0922z1 z1Var) {
        C0809g1.C0810a<Boolean> aVar = C0849n1.f2495D;
        Boolean bool = Boolean.FALSE;
        boolean z = false;
        if (((Boolean) z1Var.mo2497d(aVar, bool)).booleanValue()) {
            boolean z2 = true;
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                C0949o2.m3698k("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i);
                z2 = false;
            }
            Integer num = (Integer) z1Var.mo2497d(C0849n1.f2492A, null);
            if (num == null || num.intValue() == 256) {
                z = z2;
            } else {
                C0949o2.m3698k("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                C0949o2.m3698k("ImageCapture", "Unable to support software JPEG. Disabling.");
                z1Var.mo2814q(aVar, bool);
            }
        }
        return z;
    }

    /* renamed from: P */
    private C0784b1 m2849P(C0784b1 b1Var) {
        List<C0800e1> a = this.f2180v.mo2947a();
        return (a == null || a.isEmpty()) ? b1Var : C1000x1.m3894a(a);
    }

    /* renamed from: Q */
    static int m2850Q(Throwable th) {
        if (th instanceof C0934l1) {
            return 3;
        }
        if (th instanceof C0709i2) {
            return ((C0709i2) th).mo2794a();
        }
        return 0;
    }

    /* renamed from: S */
    private int m2851S() {
        C0849n1 n1Var = (C0849n1) mo2571f();
        if (n1Var.mo2495b(C0849n1.f2497F)) {
            return n1Var.mo3069N();
        }
        int i = this.f2173o;
        if (i == 0) {
            return 100;
        }
        if (i == 1) {
            return 95;
        }
        throw new IllegalStateException("CaptureMode " + this.f2173o + " is invalid");
    }

    /* renamed from: V */
    static /* synthetic */ void m2852V(C0662o oVar, C1006y1 y1Var) {
        if (Build.VERSION.SDK_INT >= 26) {
            oVar.mo2711d();
            y1Var.mo3287d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void mo2749Z(String str, C0849n1 n1Var, Size size, C0840m2 m2Var, C0840m2.C0845e eVar) {
        mo2743L();
        if (mo2580o(str)) {
            C0840m2.C0842b N = mo2744N(str, n1Var, size);
            this.f2184z = N;
            mo2565I(N.mo3048m());
            mo2584s();
        }
    }

    /* renamed from: a0 */
    static /* synthetic */ Void m2855a0(List list) {
        return null;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m2856b0(C0889u1 u1Var) {
        ImageProxy g;
        try {
            g = u1Var.mo2640g();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + g);
            if (g != null) {
                g.close();
                return;
            }
            return;
        } catch (IllegalStateException e) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void mo2750d0(C0705i iVar) {
        iVar.mo2787b(new C0709i2(4, "Not bound to a valid Camera [" + this + "]", (Throwable) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ Object mo2752i0(C0700g gVar, C1814b.C1815a aVar) {
        this.f2164A.mo2643j(new C0998x(aVar), C0744a.m3047d());
        m2863l0();
        C9172b<Void> U = mo2747U(gVar);
        C0768f.m3075a(U, new C0696c(aVar), this.f2178t);
        aVar.mo6306a(new C0987v(U), C0744a.m3044a());
        return "takePictureInternal";
    }

    /* renamed from: j0 */
    static /* synthetic */ void m2861j0(C1814b.C1815a aVar, C0889u1 u1Var) {
        try {
            ImageProxy g = u1Var.mo2640g();
            if (g == null) {
                aVar.mo6310f(new IllegalStateException("Unable to acquire image"));
            } else if (!aVar.mo6308c(g)) {
                g.close();
            }
        } catch (IllegalStateException e) {
            aVar.mo6310f(e);
        }
    }

    /* renamed from: l0 */
    private void m2863l0() {
        synchronized (this.f2174p) {
            if (this.f2174p.get() == null) {
                this.f2174p.set(Integer.valueOf(mo2745R()));
            }
        }
    }

    /* renamed from: m0 */
    private void m2864m0(Executor executor, C0705i iVar, int i) {
        C0899w0 c = mo2568c();
        if (c == null) {
            executor.execute(new C0982u(this, iVar));
            return;
        }
        C0701h hVar = this.f2168E;
        if (hVar == null) {
            executor.execute(new C0959r(iVar));
            return;
        }
        hVar.mo2783d(new C0700g(mo2575j(c), i, this.f2177s, mo2579n(), this.f2170G, executor, iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public C9172b<ImageProxy> m2853W(C0700g gVar) {
        return C1814b.m7736a(new C1008z(this, gVar));
    }

    /* renamed from: s0 */
    private void m2866s0() {
        synchronized (this.f2174p) {
            if (this.f2174p.get() == null) {
                mo2569d().mo2328e(mo2745R());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [androidx.camera.core.impl.x2$a<?, ?, ?>, androidx.camera.core.impl.x2$a, androidx.camera.core.z1] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0908x2<?> mo2558A(androidx.camera.core.impl.C0888u0 r8, androidx.camera.core.impl.C0908x2.C0909a<?, ?, ?> r9) {
        /*
            r7 = this;
            androidx.camera.core.impl.x2 r0 = r9.mo2603c()
            androidx.camera.core.impl.g1$a<androidx.camera.core.impl.d1> r1 = androidx.camera.core.impl.C0849n1.f2501z
            r2 = 0
            java.lang.Object r0 = r0.mo2497d(r1, r2)
            java.lang.String r3 = "ImageCapture"
            if (r0 == 0) goto L_0x0026
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r0 < r4) goto L_0x0026
            java.lang.String r8 = "Requesting software JPEG due to a CaptureProcessor is set."
            androidx.camera.core.C0949o2.m3692e(r3, r8)
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Boolean> r0 = androidx.camera.core.impl.C0849n1.f2495D
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r8.mo2814q(r0, r3)
            goto L_0x0058
        L_0x0026:
            androidx.camera.core.impl.i2 r8 = r8.mo2459g()
            java.lang.Class<androidx.camera.core.e3.p.e.e> r0 = androidx.camera.core.p009e3.p010p.p011e.C0672e.class
            boolean r8 = r8.mo3014a(r0)
            if (r8 == 0) goto L_0x0058
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Boolean> r0 = androidx.camera.core.impl.C0849n1.f2495D
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.mo2497d(r0, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x004c
            java.lang.String r8 = "Device quirk suggests software JPEG encoder, but it has been explicitly disabled."
            androidx.camera.core.C0949o2.m3698k(r3, r8)
            goto L_0x0058
        L_0x004c:
            java.lang.String r8 = "Requesting software JPEG due to device quirk."
            androidx.camera.core.C0949o2.m3692e(r3, r8)
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            r8.mo2814q(r0, r4)
        L_0x0058:
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            boolean r8 = m2848O(r8)
            androidx.camera.core.impl.z1 r0 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r3 = androidx.camera.core.impl.C0849n1.f2492A
            java.lang.Object r0 = r0.mo2497d(r3, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r3 = 0
            r4 = 35
            r5 = 1
            if (r0 == 0) goto L_0x0099
            androidx.camera.core.impl.z1 r6 = r9.mo1887b()
            java.lang.Object r1 = r6.mo2497d(r1, r2)
            if (r1 != 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            java.lang.String r2 = "Cannot set buffer format with CaptureProcessor defined."
            androidx.core.util.C1177h.m4580b(r1, r2)
            androidx.camera.core.impl.z1 r1 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r2 = androidx.camera.core.impl.C0863q1.f2513e
            if (r8 == 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            int r4 = r0.intValue()
        L_0x0091:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r1.mo2814q(r2, r8)
            goto L_0x00c0
        L_0x0099:
            androidx.camera.core.impl.z1 r0 = r9.mo1887b()
            java.lang.Object r0 = r0.mo2497d(r1, r2)
            if (r0 != 0) goto L_0x00b3
            if (r8 == 0) goto L_0x00a6
            goto L_0x00b3
        L_0x00a6:
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r0 = androidx.camera.core.impl.C0863q1.f2513e
            r1 = 256(0x100, float:3.59E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00bd
        L_0x00b3:
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r0 = androidx.camera.core.impl.C0863q1.f2513e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L_0x00bd:
            r8.mo2814q(r0, r1)
        L_0x00c0:
            androidx.camera.core.impl.z1 r8 = r9.mo1887b()
            androidx.camera.core.impl.g1$a<java.lang.Integer> r0 = androidx.camera.core.impl.C0849n1.f2493B
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r8.mo2497d(r0, r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 < r5) goto L_0x00d8
            r3 = 1
        L_0x00d8:
            java.lang.String r8 = "Maximum outstanding image count must be at least 1"
            androidx.core.util.C1177h.m4580b(r3, r8)
            androidx.camera.core.impl.x2 r8 = r9.mo2603c()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0693h2.mo2558A(androidx.camera.core.impl.u0, androidx.camera.core.impl.x2$a):androidx.camera.core.impl.x2");
    }

    /* renamed from: C */
    public void mo2560C() {
        m2846K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Size mo2561D(Size size) {
        C0840m2.C0842b N = mo2744N(mo2570e(), (C0849n1) mo2571f(), size);
        this.f2184z = N;
        mo2565I(N.mo3048m());
        mo2582q();
        return size;
    }

    /* renamed from: F */
    public void mo2562F(Matrix matrix) {
        this.f2170G = matrix;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo2743L() {
        C0743m.m3042a();
        C0701h hVar = this.f2168E;
        if (hVar != null) {
            hVar.mo2781b(new CancellationException("Request is canceled."));
            this.f2168E = null;
        }
        C0820i1 i1Var = this.f2167D;
        this.f2167D = null;
        this.f2164A = null;
        this.f2165B = null;
        if (i1Var != null) {
            i1Var.mo3001a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: androidx.camera.core.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: androidx.camera.core.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: androidx.camera.core.impl.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.camera.core.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: androidx.camera.core.impl.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: androidx.camera.core.impl.d1} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0132  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0840m2.C0842b mo2744N(java.lang.String r16, androidx.camera.core.impl.C0849n1 r17, android.util.Size r18) {
        /*
            r15 = this;
            r0 = r15
            androidx.camera.core.impl.p014a3.C0743m.m3042a()
            androidx.camera.core.impl.m2$b r1 = androidx.camera.core.impl.C0840m2.C0842b.m3318o(r17)
            androidx.camera.core.k2 r2 = r17.mo3067L()
            r3 = 2
            r4 = 0
            if (r2 == 0) goto L_0x0036
            androidx.camera.core.v2 r2 = new androidx.camera.core.v2
            androidx.camera.core.k2 r5 = r17.mo3067L()
            int r6 = r18.getWidth()
            int r7 = r18.getHeight()
            int r8 = r15.mo2573h()
            r9 = 2
            r10 = 0
            androidx.camera.core.impl.u1 r5 = r5.mo3186a(r6, r7, r8, r9, r10)
            r2.<init>(r5)
            r0.f2164A = r2
            androidx.camera.core.h2$a r2 = new androidx.camera.core.h2$a
            r2.<init>()
            r0.f2166C = r2
            goto L_0x005d
        L_0x0036:
            androidx.camera.core.impl.d1 r2 = r0.f2182x
            if (r2 != 0) goto L_0x0060
            boolean r5 = r0.f2183y
            if (r5 == 0) goto L_0x003f
            goto L_0x0060
        L_0x003f:
            androidx.camera.core.p2 r2 = new androidx.camera.core.p2
            int r5 = r18.getWidth()
            int r6 = r18.getHeight()
            int r7 = r15.mo2573h()
            r2.<init>(r5, r6, r7, r3)
            androidx.camera.core.impl.b0 r5 = r2.mo3194n()
            r0.f2166C = r5
            androidx.camera.core.v2 r5 = new androidx.camera.core.v2
            r5.<init>(r2)
            r0.f2164A = r5
        L_0x005d:
            r2 = r4
            goto L_0x00ff
        L_0x0060:
            int r9 = r15.mo2573h()
            int r5 = r15.mo2573h()
            boolean r6 = r0.f2183y
            if (r6 == 0) goto L_0x00b1
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r2 < r5) goto L_0x00a9
            java.lang.String r2 = "ImageCapture"
            java.lang.String r5 = "Using software JPEG encoder."
            androidx.camera.core.C0949o2.m3692e(r2, r5)
            androidx.camera.core.impl.d1 r2 = r0.f2182x
            if (r2 == 0) goto L_0x0095
            androidx.camera.core.e3.o r2 = new androidx.camera.core.e3.o
            int r5 = r15.m2851S()
            int r6 = r0.f2181w
            r2.<init>(r5, r6)
            androidx.camera.core.y1 r5 = new androidx.camera.core.y1
            androidx.camera.core.impl.d1 r6 = r0.f2182x
            int r7 = r0.f2181w
            java.util.concurrent.ExecutorService r8 = r0.f2178t
            r5.<init>(r6, r7, r2, r8)
            r6 = r5
            goto L_0x00a2
        L_0x0095:
            androidx.camera.core.e3.o r2 = new androidx.camera.core.e3.o
            int r5 = r15.m2851S()
            int r6 = r0.f2181w
            r2.<init>(r5, r6)
            r5 = r2
            r6 = r4
        L_0x00a2:
            r7 = 256(0x100, float:3.59E-43)
            r12 = r5
            r13 = r6
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x00b4
        L_0x00a9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Software JPEG only supported on API 26+"
            r1.<init>(r2)
            throw r1
        L_0x00b1:
            r12 = r2
            r2 = r4
            r13 = r2
        L_0x00b4:
            androidx.camera.core.t2$d r14 = new androidx.camera.core.t2$d
            int r7 = r18.getWidth()
            int r8 = r18.getHeight()
            int r10 = r0.f2181w
            androidx.camera.core.impl.b1 r6 = androidx.camera.core.C1000x1.m3896c()
            androidx.camera.core.impl.b1 r11 = r15.m2849P(r6)
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.concurrent.ExecutorService r6 = r0.f2178t
            androidx.camera.core.t2$d r6 = r14.mo3253c(r6)
            androidx.camera.core.t2$d r5 = r6.mo3252b(r5)
            androidx.camera.core.t2 r5 = r5.mo3251a()
            r0.f2165B = r5
            androidx.camera.core.impl.b0 r5 = r5.mo3242a()
            r0.f2166C = r5
            androidx.camera.core.v2 r5 = new androidx.camera.core.v2
            androidx.camera.core.t2 r6 = r0.f2165B
            r5.<init>(r6)
            r0.f2164A = r5
            if (r2 == 0) goto L_0x00ff
            androidx.camera.core.t2 r5 = r0.f2165B
            e.f.b.a.a.b r5 = r5.mo3243k()
            androidx.camera.core.c0 r6 = new androidx.camera.core.c0
            r6.<init>(r2, r13)
            java.util.concurrent.Executor r7 = androidx.camera.core.impl.p014a3.p015n.C0744a.m3044a()
            r5.mo2919e(r6, r7)
        L_0x00ff:
            androidx.camera.core.h2$h r5 = r0.f2168E
            if (r5 == 0) goto L_0x010d
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            java.lang.String r7 = "Request is canceled."
            r6.<init>(r7)
            r5.mo2781b(r6)
        L_0x010d:
            androidx.camera.core.h2$h r5 = new androidx.camera.core.h2$h
            androidx.camera.core.q r6 = new androidx.camera.core.q
            r6.<init>(r15)
            if (r2 != 0) goto L_0x0117
            goto L_0x011c
        L_0x0117:
            androidx.camera.core.h2$b r4 = new androidx.camera.core.h2$b
            r4.<init>(r2)
        L_0x011c:
            r5.<init>(r3, r6, r4)
            r0.f2168E = r5
            androidx.camera.core.v2 r2 = r0.f2164A
            androidx.camera.core.impl.u1$a r3 = r0.f2171m
            java.util.concurrent.ScheduledExecutorService r4 = androidx.camera.core.impl.p014a3.p015n.C0744a.m3047d()
            r2.mo2643j(r3, r4)
            androidx.camera.core.v2 r2 = r0.f2164A
            androidx.camera.core.impl.i1 r3 = r0.f2167D
            if (r3 == 0) goto L_0x0135
            r3.mo3001a()
        L_0x0135:
            androidx.camera.core.impl.v1 r3 = new androidx.camera.core.impl.v1
            androidx.camera.core.v2 r4 = r0.f2164A
            android.view.Surface r4 = r4.mo2634b()
            android.util.Size r5 = new android.util.Size
            androidx.camera.core.v2 r6 = r0.f2164A
            int r6 = r6.mo2638e()
            androidx.camera.core.v2 r7 = r0.f2164A
            int r7 = r7.mo2635c()
            r5.<init>(r6, r7)
            androidx.camera.core.v2 r6 = r0.f2164A
            int r6 = r6.mo2637d()
            r3.<init>(r4, r5, r6)
            r0.f2167D = r3
            e.f.b.a.a.b r3 = r3.mo3007g()
            java.util.Objects.requireNonNull(r2)
            androidx.camera.core.b1 r4 = new androidx.camera.core.b1
            r4.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r2 = androidx.camera.core.impl.p014a3.p015n.C0744a.m3047d()
            r3.mo2919e(r4, r2)
            androidx.camera.core.impl.i1 r2 = r0.f2167D
            r1.mo3043h(r2)
            androidx.camera.core.w r2 = new androidx.camera.core.w
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r15, r3, r4, r5)
            r1.mo3041f(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0693h2.mo2744N(java.lang.String, androidx.camera.core.impl.n1, android.util.Size):androidx.camera.core.impl.m2$b");
    }

    /* renamed from: R */
    public int mo2745R() {
        int i;
        synchronized (this.f2174p) {
            i = this.f2176r;
            if (i == -1) {
                i = ((C0849n1) mo2571f()).mo3065J(2);
            }
        }
        return i;
    }

    /* renamed from: T */
    public int mo2746T() {
        return mo2577l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public C9172b<Void> mo2747U(C0700g gVar) {
        String str;
        C0784b1 b1Var;
        C0949o2.m3688a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        if (this.f2165B != null) {
            b1Var = m2849P(C1000x1.m3896c());
            if (b1Var == null) {
                return C0768f.m3079e(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (this.f2182x == null && b1Var.mo2947a().size() > 1) {
                return C0768f.m3079e(new IllegalArgumentException("No CaptureProcessor can be found to process the images captured for multiple CaptureStages."));
            }
            if (b1Var.mo2947a().size() > this.f2181w) {
                return C0768f.m3079e(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.f2165B.mo3247p(b1Var);
            str = this.f2165B.mo3244l();
        } else {
            b1Var = m2849P(C1000x1.m3896c());
            if (b1Var.mo2947a().size() > 1) {
                return C0768f.m3079e(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
            str = null;
        }
        for (C0800e1 next : b1Var.mo2947a()) {
            C0788c1.C0789a aVar = new C0788c1.C0789a();
            aVar.mo2969o(this.f2179u.mo2955f());
            aVar.mo2961e(this.f2179u.mo2952c());
            aVar.mo2957a(this.f2184z.mo3050p());
            aVar.mo2962f(this.f2167D);
            if (new C0675b().mo2717a()) {
                aVar.mo2960d(C0788c1.f2357a, Integer.valueOf(gVar.f2194a));
            }
            aVar.mo2960d(C0788c1.f2358b, Integer.valueOf(gVar.f2195b));
            aVar.mo2961e(next.mo2981b().mo2952c());
            if (str != null) {
                aVar.mo2963g(str, Integer.valueOf(next.mo2980a()));
            }
            aVar.mo2959c(this.f2166C);
            arrayList.add(aVar.mo2964h());
        }
        return C0768f.m3088n(mo2569d().mo2320a(arrayList, this.f2173o, this.f2175q), C1004y.f2837a, C0744a.m3044a());
    }

    /* renamed from: g */
    public C0908x2<?> mo2572g(boolean z, C0915y2 y2Var) {
        C0809g1 a = y2Var.mo2009a(C0915y2.C0917b.IMAGE_CAPTURE);
        if (z) {
            a = C0805f1.m3166b(a, f2163l.mo2776a());
        }
        if (a == null) {
            return null;
        }
        return mo2578m(a).mo2603c();
    }

    /* renamed from: m */
    public C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var) {
        return C0698e.m2895f(g1Var);
    }

    /* renamed from: n0 */
    public void mo2753n0(Rational rational) {
        this.f2177s = rational;
    }

    /* renamed from: o0 */
    public void mo2754o0(int i) {
        if (i == 0 || i == 1 || i == 2) {
            synchronized (this.f2174p) {
                this.f2176r = i;
                m2866s0();
            }
            return;
        }
        throw new IllegalArgumentException("Invalid flash mode: " + i);
    }

    /* renamed from: p0 */
    public void mo2755p0(int i) {
        int T = mo2746T();
        if (mo2563G(i) && this.f2177s != null) {
            this.f2177s = C0677a.m2811c(Math.abs(C0716b.m2966b(i) - C0716b.m2966b(T)), this.f2177s);
        }
    }

    /* renamed from: q0 */
    public void m2859f0(Executor executor, C0705i iVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            C0744a.m3047d().execute(new C0604a0(this, executor, iVar));
        } else {
            m2864m0(executor, iVar, m2851S());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return;
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2757t0() {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r0 = r3.f2174p
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Integer> r1 = r3.f2174p     // Catch:{ all -> 0x001f }
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch:{ all -> 0x001f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x0010:
            int r1 = r1.intValue()     // Catch:{ all -> 0x001f }
            int r2 = r3.mo2745R()     // Catch:{ all -> 0x001f }
            if (r1 == r2) goto L_0x001d
            r3.m2866s0()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return
        L_0x001f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0693h2.mo2757t0():void");
    }

    public String toString() {
        return "ImageCapture:" + mo2574i();
    }

    /* renamed from: w */
    public void mo2588w() {
        C0849n1 n1Var = (C0849n1) mo2571f();
        this.f2179u = C0788c1.C0789a.m3119j(n1Var).mo2964h();
        this.f2182x = n1Var.mo3064I((C0795d1) null);
        this.f2181w = n1Var.mo3070O(2);
        this.f2180v = n1Var.mo3062G(C1000x1.m3896c());
        this.f2183y = n1Var.mo3072Q();
        C1177h.m4584f(mo2568c(), "Attached camera cannot be null");
        this.f2178t = Executors.newFixedThreadPool(1, new C0697d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo2589x() {
        m2866s0();
    }

    /* renamed from: z */
    public void mo2591z() {
        m2846K();
        mo2743L();
        this.f2183y = false;
        this.f2178t.shutdown();
    }
}
