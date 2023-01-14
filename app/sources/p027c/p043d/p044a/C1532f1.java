package p027c.p043d.p044a;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.C0802e2;
import androidx.camera.core.impl.C0805f1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.impl.C0922z1;
import androidx.camera.core.impl.p014a3.C0743m;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.core.p009e3.C0656i;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p044a.C1523d1;
import p027c.p043d.p044a.C1543h1;
import p027c.p043d.p044a.p045k1.C1563a;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.a.f1 */
public final class C1532f1<T extends C1543h1> extends C0608a3 {

    /* renamed from: l */
    private static final C1537d f4795l = new C1537d();

    /* renamed from: m */
    final Object f4796m = new Object();

    /* renamed from: n */
    C0820i1 f4797n;

    /* renamed from: o */
    C1523d1 f4798o = C1523d1.f4771b;

    /* renamed from: p */
    C0840m2.C0842b f4799p = new C0840m2.C0842b();

    /* renamed from: q */
    C1814b.C1815a<Void> f4800q = null;

    /* renamed from: r */
    private C1011z2 f4801r;

    /* renamed from: s */
    private final C0796d2.C0797a<C1523d1> f4802s = new C1534b();

    /* renamed from: c.d.a.f1$a */
    class C1533a extends C0783b0 {
        C1533a() {
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            Object c;
            super.mo1920b(k0Var);
            synchronized (C1532f1.this.f4796m) {
                if (!(C1532f1.this.f4800q == null || (c = k0Var.mo2296c().mo3114c("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) c).intValue() != C1532f1.this.f4800q.hashCode())) {
                    C1532f1.this.f4800q.mo6308c(null);
                    C1532f1.this.f4800q = null;
                }
            }
        }
    }

    /* renamed from: c.d.a.f1$b */
    class C1534b implements C0796d2.C0797a<C1523d1> {

        /* renamed from: c.d.a.f1$b$a */
        class C1535a implements C0765d<Void> {

            /* renamed from: a */
            final /* synthetic */ boolean f4805a;

            /* renamed from: b */
            final /* synthetic */ ScheduledFuture f4806b;

            C1535a(boolean z, ScheduledFuture scheduledFuture) {
                this.f4805a = z;
                this.f4806b = scheduledFuture;
            }

            /* renamed from: b */
            public void mo1981b(Throwable th) {
                C0949o2.m3689b("VideoCapture", "The surface update future didn't complete.", th);
                C1532f1.this.mo5656S().mo5578d(this.f4805a ? C1543h1.C1544a.ACTIVE_STREAMING : C1543h1.C1544a.ACTIVE_NON_STREAMING);
                this.f4806b.cancel(true);
            }

            /* renamed from: c */
            public void mo1980a(Void voidR) {
                C1532f1.this.mo5656S().mo5578d(this.f4805a ? C1543h1.C1544a.ACTIVE_STREAMING : C1543h1.C1544a.ACTIVE_NON_STREAMING);
                this.f4806b.cancel(true);
            }
        }

        C1534b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Object mo5661d(AtomicReference atomicReference, C1814b.C1815a aVar) {
            C1532f1.this.f4799p.mo3047l("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
            synchronized (C1532f1.this.f4796m) {
                C1814b.C1815a<Void> aVar2 = C1532f1.this.f4800q;
                if (aVar2 != null) {
                    aVar2.mo6310f(new RuntimeException("A newer surface update is completed."));
                }
                C1532f1.this.f4800q = aVar;
                atomicReference.set(aVar);
            }
            return "androidx.camera.video.VideoCapture.streamUpdate";
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void mo5662f(C9172b bVar, AtomicReference atomicReference) {
            if (!bVar.isDone()) {
                ((C1814b.C1815a) atomicReference.get()).mo6310f(new TimeoutException("The surface isn't updated within: 1000"));
                synchronized (C1532f1.this.f4796m) {
                    if (C1532f1.this.f4800q == atomicReference.get()) {
                        C1532f1.this.f4800q = null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo2977a(Throwable th) {
            C0949o2.m3699l("VideoCapture", "Receive onError from StreamState observer", th);
        }

        /* renamed from: g */
        public void mo2978b(C1523d1 d1Var) {
            if (d1Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            } else if (C1532f1.this.mo2568c() != null) {
                if (C1532f1.this.f4798o.mo5645b() != d1Var.mo5645b()) {
                    C1532f1.this.f4799p.mo3049n();
                    boolean z = d1Var.mo5645b() == C1523d1.C1524a.ACTIVE;
                    C1532f1 f1Var = C1532f1.this;
                    C0840m2.C0842b bVar = f1Var.f4799p;
                    C0820i1 i1Var = f1Var.f4797n;
                    if (z) {
                        bVar.mo3046k(i1Var);
                    } else {
                        bVar.mo3043h(i1Var);
                    }
                    AtomicReference atomicReference = new AtomicReference();
                    C9172b a = C1814b.m7736a(new C1501a0(this, atomicReference));
                    C0768f.m3075a(a, new C1535a(z, C0744a.m3048e().schedule(new C1730z(this, a, atomicReference), 1000, TimeUnit.MILLISECONDS)), C0744a.m3044a());
                    C1532f1 f1Var2 = C1532f1.this;
                    f1Var2.mo2565I(f1Var2.f4799p.mo3048m());
                    C1532f1.this.mo2586u();
                }
                Integer a2 = C1532f1.this.f4798o.mo5644a();
                if (a2.equals(C1523d1.f4770a) || a2.equals(d1Var.mo5644a())) {
                    C1532f1.this.f4798o = d1Var;
                    return;
                }
                C1532f1 f1Var3 = C1532f1.this;
                f1Var3.mo5658V(f1Var3.mo2570e(), (C1563a) C1532f1.this.mo2571f(), C1532f1.this.mo2567b());
            }
        }
    }

    /* renamed from: c.d.a.f1$c */
    public static final class C1536c<T extends C1543h1> implements C0908x2.C0909a<C1532f1<T>, C1563a<T>, C1536c<T>>, C0877s1.C0878a<C1536c<T>> {

        /* renamed from: a */
        private final C0714a2 f4808a;

        private C1536c(C0714a2 a2Var) {
            Class<C1532f1> cls = C1532f1.class;
            this.f4808a = a2Var;
            if (a2Var.mo2495b(C1563a.f4846w)) {
                Class cls2 = (Class) a2Var.mo2497d(C0656i.f2116t, null);
                if (cls2 == null || cls2.equals(cls)) {
                    mo5668j(cls);
                    return;
                }
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
            }
            throw new IllegalArgumentException("VideoOutput is required");
        }

        C1536c(T t) {
            this(m6877f(t));
        }

        /* renamed from: f */
        private static <T extends C1543h1> C0714a2 m6877f(T t) {
            C0714a2 J = C0714a2.m2954J();
            J.mo2814q(C1563a.f4846w, t);
            return J;
        }

        /* renamed from: g */
        static C1536c<? extends C1543h1> m6878g(C0809g1 g1Var) {
            return new C1536c<>(C0714a2.m2955K(g1Var));
        }

        /* renamed from: b */
        public C0922z1 mo1887b() {
            return this.f4808a;
        }

        /* renamed from: e */
        public C1532f1<T> mo5665e() {
            return new C1532f1<>(mo2603c());
        }

        /* renamed from: h */
        public C1563a<T> mo2603c() {
            return new C1563a<>(C0802e2.m3155H(this.f4808a));
        }

        /* renamed from: i */
        public C1536c<T> mo5667i(int i) {
            mo1887b().mo2814q(C0908x2.f2605p, Integer.valueOf(i));
            return this;
        }

        /* renamed from: j */
        public C1536c<T> mo5668j(Class<C1532f1<T>> cls) {
            mo1887b().mo2814q(C0656i.f2116t, cls);
            if (mo1887b().mo2497d(C0656i.f2115s, null) == null) {
                mo5669k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* renamed from: k */
        public C1536c<T> mo5669k(String str) {
            mo1887b().mo2814q(C0656i.f2115s, str);
            return this;
        }

        /* renamed from: l */
        public C1536c<T> mo2602a(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        /* renamed from: m */
        public C1536c<T> mo2604d(int i) {
            mo1887b().mo2814q(C0877s1.f2546g, Integer.valueOf(i));
            return this;
        }
    }

    /* renamed from: c.d.a.f1$d */
    public static final class C1537d {

        /* renamed from: a */
        private static final C1543h1 f4809a;

        /* renamed from: b */
        private static final C1563a<?> f4810b;

        static {
            C1518c0 c0Var = C1518c0.f4765a;
            f4809a = c0Var;
            f4810b = new C1536c(c0Var).mo5667i(3).mo2603c();
        }

        /* renamed from: a */
        public C1563a<?> mo5672a() {
            return f4810b;
        }
    }

    C1532f1(C1563a<T> aVar) {
        super(aVar);
    }

    /* renamed from: N */
    private void m6844N() {
        C0743m.m3042a();
        C0820i1 i1Var = this.f4797n;
        if (i1Var != null) {
            i1Var.mo3001a();
            this.f4797n = null;
        }
        this.f4801r = null;
        this.f4798o = C1523d1.f4771b;
    }

    /* renamed from: O */
    private C0840m2.C0842b m6845O(String str, C1563a<T> aVar, Size size) {
        C1543h1.C1544a aVar2;
        C1543h1 h1Var;
        C0743m.m3042a();
        this.f4801r = new C1011z2(size, mo2568c(), false);
        aVar.mo5723G().mo5573a(this.f4801r);
        m6850W(size);
        C0820i1 c = this.f4801r.mo3294c();
        this.f4797n = c;
        c.mo3012o(MediaCodec.class);
        C0840m2.C0842b o = C0840m2.C0842b.m3318o(aVar);
        if (((C1523d1) m6846P(mo5656S().mo5576c(), C1523d1.f4771b)).mo5645b() == C1523d1.C1524a.ACTIVE) {
            o.mo3046k(this.f4797n);
            h1Var = mo5656S();
            aVar2 = C1543h1.C1544a.ACTIVE_STREAMING;
        } else {
            o.mo3043h(this.f4797n);
            h1Var = mo5656S();
            aVar2 = C1543h1.C1544a.ACTIVE_NON_STREAMING;
        }
        h1Var.mo5578d(aVar2);
        o.mo3041f(new C1515b0(this, str, aVar, size));
        o.mo3044i(new C1533a());
        return o;
    }

    /* renamed from: P */
    private static <T> T m6846P(C0796d2<T> d2Var, T t) {
        C9172b<T> d = d2Var.mo2975d();
        if (!d.isDone()) {
            return t;
        }
        try {
            return d.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: Q */
    private Rect m6847Q(Size size) {
        if (mo2579n() != null) {
            return mo2579n();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* renamed from: R */
    private C1715t0 m6848R() {
        return (C1715t0) m6846P(mo5656S().mo5575b(), (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void mo5657U(String str, C1563a aVar, Size size, C0840m2 m2Var, C0840m2.C0845e eVar) {
        mo5658V(str, aVar, size);
    }

    /* renamed from: W */
    private void m6850W(Size size) {
        C0899w0 c = mo2568c();
        C1011z2 z2Var = this.f4801r;
        Rect Q = m6847Q(size);
        if (c != null && z2Var != null && Q != null) {
            z2Var.mo3300q(C1011z2.C1018g.m3947d(Q, mo2575j(c), mo2577l()));
        }
    }

    /* renamed from: Y */
    private void m6851Y(C0888u0 u0Var, C0908x2.C0909a<?, ?, ?> aVar) {
        C1715t0 R = m6848R();
        C1177h.m4580b(R != null, "Unable to update target resolution by null MediaSpec.");
        if (C1731z0.m7392i(u0Var).isEmpty()) {
            C0949o2.m3698k("VideoCapture", "Can't find any supported quality on the device.");
            return;
        }
        C1731z0 e = R.mo5699d().mo5712e();
        List<C1727y0> g = e.mo5964g(u0Var);
        C0949o2.m3688a("VideoCapture", "Found selectedQualities " + g + " by " + e);
        if (!g.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C1727y0 h : g) {
                arrayList.add(C1731z0.m7391h(u0Var, h));
            }
            C0949o2.m3688a("VideoCapture", "Set supported resolutions = " + arrayList);
            aVar.mo1887b().mo2814q(C0877s1.f2550k, Arrays.asList(new Pair[]{Pair.create(Integer.valueOf(mo2573h()), (Size[]) arrayList.toArray(new Size[0]))}));
            return;
        }
        throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
    }

    /* renamed from: Z */
    public static <T extends C1543h1> C1532f1<T> m6852Z(T t) {
        return new C1536c((C1543h1) C1177h.m4583e(t)).mo5665e();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.x2$a<?, ?, ?>, androidx.camera.core.impl.x2$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0908x2<?> mo2558A(androidx.camera.core.impl.C0888u0 r1, androidx.camera.core.impl.C0908x2.C0909a<?, ?, ?> r2) {
        /*
            r0 = this;
            r0.m6851Y(r1, r2)
            androidx.camera.core.impl.x2 r1 = r2.mo2603c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1532f1.mo2558A(androidx.camera.core.impl.u0, androidx.camera.core.impl.x2$a):androidx.camera.core.impl.x2");
    }

    /* renamed from: B */
    public void mo2559B() {
        super.mo2559B();
        mo5656S().mo5578d(C1543h1.C1544a.ACTIVE_NON_STREAMING);
    }

    /* renamed from: C */
    public void mo2560C() {
        synchronized (this.f4796m) {
            C1814b.C1815a<Void> aVar = this.f4800q;
            if (aVar != null) {
                aVar.mo6310f(new RuntimeException("VideoCapture is detached from the camera."));
                this.f4800q = null;
            }
        }
        mo5656S().mo5578d(C1543h1.C1544a.INACTIVE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Size mo2561D(Size size) {
        Object obj;
        C0949o2.m3688a("VideoCapture", "suggestedResolution = " + size);
        String e = mo2570e();
        C1563a aVar = (C1563a) mo2571f();
        Size[] sizeArr = null;
        List<Pair<Integer, Size[]>> h = aVar.mo2993h((List<Pair<Integer, Size[]>>) null);
        if (h != null) {
            Iterator<Pair<Integer, Size[]>> it = h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Pair next = it.next();
                if (((Integer) next.first).intValue() == mo2573h() && (obj = next.second) != null) {
                    sizeArr = (Size[]) obj;
                    break;
                }
            }
        }
        if (sizeArr != null) {
            int width = size.getWidth() * size.getHeight();
            int length = sizeArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size2 = sizeArr[i];
                if (Objects.equals(size2, size)) {
                    break;
                } else if (size2.getWidth() * size2.getHeight() < width) {
                    C0949o2.m3688a("VideoCapture", "Find a higher priority resolution: " + size2);
                    size = size2;
                    break;
                } else {
                    i++;
                }
            }
        }
        C0840m2.C0842b O = m6845O(e, aVar, size);
        this.f4799p = O;
        mo2565I(O.mo3048m());
        mo2582q();
        return size;
    }

    /* renamed from: H */
    public void mo2564H(Rect rect) {
        super.mo2564H(rect);
        m6850W(mo2567b());
    }

    /* renamed from: S */
    public T mo5656S() {
        return ((C1563a) mo2571f()).mo5723G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo5658V(String str, C1563a<T> aVar, Size size) {
        m6844N();
        if (mo2580o(str)) {
            C0840m2.C0842b O = m6845O(str, aVar, size);
            this.f4799p = O;
            mo2565I(O.mo3048m());
            mo2584s();
        }
    }

    /* renamed from: X */
    public void mo5659X(int i) {
        if (mo2563G(i)) {
            m6850W(mo2567b());
        }
    }

    /* renamed from: g */
    public C0908x2<?> mo2572g(boolean z, C0915y2 y2Var) {
        C0809g1 a = y2Var.mo2009a(C0915y2.C0917b.VIDEO_CAPTURE);
        if (z) {
            a = C0805f1.m3166b(a, f4795l.mo5672a());
        }
        if (a == null) {
            return null;
        }
        return mo2578m(a).mo2603c();
    }

    /* renamed from: m */
    public C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var) {
        return C1536c.m6878g(g1Var);
    }

    public String toString() {
        return "VideoCapture:" + mo2574i();
    }

    /* renamed from: w */
    public void mo2588w() {
        mo5656S().mo5576c().mo2976e(C0744a.m3047d(), this.f4802s);
    }

    /* renamed from: z */
    public void mo2591z() {
        m6844N();
        mo5656S().mo5576c().mo2974a(this.f4802s);
    }
}
