package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0868r0;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.C0915y2;
import androidx.camera.core.p009e3.C0656i;
import androidx.camera.core.p009e3.p013q.C0678b;
import androidx.core.util.C1177h;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.camera.core.a3 */
public abstract class C0608a3 {

    /* renamed from: a */
    private final Set<C0612d> f1978a = new HashSet();

    /* renamed from: b */
    private final Object f1979b = new Object();

    /* renamed from: c */
    private C0611c f1980c = C0611c.INACTIVE;

    /* renamed from: d */
    private C0908x2<?> f1981d;

    /* renamed from: e */
    private C0908x2<?> f1982e;

    /* renamed from: f */
    private C0908x2<?> f1983f;

    /* renamed from: g */
    private Size f1984g;

    /* renamed from: h */
    private C0908x2<?> f1985h;

    /* renamed from: i */
    private Rect f1986i;

    /* renamed from: j */
    private C0899w0 f1987j;

    /* renamed from: k */
    private C0840m2 f1988k = C0840m2.m3308a();

    /* renamed from: androidx.camera.core.a3$a */
    static /* synthetic */ class C0609a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1989a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.a3$c[] r0 = androidx.camera.core.C0608a3.C0611c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1989a = r0
                androidx.camera.core.a3$c r1 = androidx.camera.core.C0608a3.C0611c.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1989a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.a3$c r1 = androidx.camera.core.C0608a3.C0611c.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0608a3.C0609a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.a3$b */
    public interface C0610b {
        /* renamed from: b */
        void mo2592b();

        /* renamed from: c */
        void mo2593c(C0957q1 q1Var);
    }

    /* renamed from: androidx.camera.core.a3$c */
    enum C0611c {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.a3$d */
    public interface C0612d {
        /* renamed from: b */
        void mo2382b(C0608a3 a3Var);

        /* renamed from: d */
        void mo2386d(C0608a3 a3Var);

        /* renamed from: f */
        void mo2389f(C0608a3 a3Var);

        /* renamed from: h */
        void mo2393h(C0608a3 a3Var);
    }

    protected C0608a3(C0908x2<?> x2Var) {
        this.f1982e = x2Var;
        this.f1983f = x2Var;
    }

    /* renamed from: E */
    private void m2517E(C0612d dVar) {
        this.f1978a.remove(dVar);
    }

    /* renamed from: a */
    private void m2518a(C0612d dVar) {
        this.f1978a.add(dVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.x2$a<?, ?, ?>, androidx.camera.core.impl.x2$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0908x2<?> mo2558A(androidx.camera.core.impl.C0888u0 r1, androidx.camera.core.impl.C0908x2.C0909a<?, ?, ?> r2) {
        /*
            r0 = this;
            androidx.camera.core.impl.x2 r1 = r2.mo2603c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0608a3.mo2558A(androidx.camera.core.impl.u0, androidx.camera.core.impl.x2$a):androidx.camera.core.impl.x2");
    }

    /* renamed from: B */
    public void mo2559B() {
        mo2589x();
    }

    /* renamed from: C */
    public void mo2560C() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract Size mo2561D(Size size);

    /* renamed from: F */
    public void mo2562F(Matrix matrix) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo2563G(int i) {
        int E = ((C0877s1) mo2571f()).mo2989E(-1);
        if (E != -1 && E == i) {
            return false;
        }
        C0908x2.C0909a m = mo2578m(this.f1982e);
        C0678b.m2819a(m, i);
        this.f1982e = m.mo2603c();
        C0899w0 c = mo2568c();
        this.f1983f = c == null ? this.f1982e : mo2581p(c.mo2400m(), this.f1981d, this.f1985h);
        return true;
    }

    /* renamed from: H */
    public void mo2564H(Rect rect) {
        this.f1986i = rect;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo2565I(C0840m2 m2Var) {
        this.f1988k = m2Var;
        for (C0820i1 next : m2Var.mo3034i()) {
            if (next.mo3003c() == null) {
                next.mo3012o(getClass());
            }
        }
    }

    /* renamed from: J */
    public void mo2566J(Size size) {
        this.f1984g = mo2561D(size);
    }

    /* renamed from: b */
    public Size mo2567b() {
        return this.f1984g;
    }

    /* renamed from: c */
    public C0899w0 mo2568c() {
        C0899w0 w0Var;
        synchronized (this.f1979b) {
            w0Var = this.f1987j;
        }
        return w0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0868r0 mo2569d() {
        synchronized (this.f1979b) {
            C0899w0 w0Var = this.f1987j;
            if (w0Var == null) {
                C0868r0 r0Var = C0868r0.f2540a;
                return r0Var;
            }
            C0868r0 i = w0Var.mo2395i();
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo2570e() {
        C0899w0 c = mo2568c();
        return ((C0899w0) C1177h.m4584f(c, "No camera attached to use case: " + this)).mo2400m().mo2453a();
    }

    /* renamed from: f */
    public C0908x2<?> mo2571f() {
        return this.f1983f;
    }

    /* renamed from: g */
    public abstract C0908x2<?> mo2572g(boolean z, C0915y2 y2Var);

    /* renamed from: h */
    public int mo2573h() {
        return this.f1983f.mo2500j();
    }

    /* renamed from: i */
    public String mo2574i() {
        C0908x2<?> x2Var = this.f1983f;
        return x2Var.mo2506t("<UnknownUseCase-" + hashCode() + ">");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo2575j(C0899w0 w0Var) {
        return w0Var.mo2400m().mo2457e(mo2577l());
    }

    /* renamed from: k */
    public C0840m2 mo2576k() {
        return this.f1988k;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    /* renamed from: l */
    public int mo2577l() {
        return ((C0877s1) this.f1983f).mo2989E(0);
    }

    /* renamed from: m */
    public abstract C0908x2.C0909a<?, ?, ?> mo2578m(C0809g1 g1Var);

    /* renamed from: n */
    public Rect mo2579n() {
        return this.f1986i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo2580o(String str) {
        if (mo2568c() == null) {
            return false;
        }
        return Objects.equals(str, mo2570e());
    }

    /* renamed from: p */
    public C0908x2<?> mo2581p(C0888u0 u0Var, C0908x2<?> x2Var, C0908x2<?> x2Var2) {
        C0714a2 a2Var;
        if (x2Var2 != null) {
            a2Var = C0714a2.m2955K(x2Var2);
            a2Var.mo2812L(C0656i.f2115s);
        } else {
            a2Var = C0714a2.m2954J();
        }
        for (C0809g1.C0810a next : this.f1982e.mo2496c()) {
            a2Var.mo2813l(next, this.f1982e.mo2498e(next), this.f1982e.mo2494a(next));
        }
        if (x2Var != null) {
            for (C0809g1.C0810a next2 : x2Var.mo2496c()) {
                if (!next2.mo2986c().equals(C0656i.f2115s.mo2986c())) {
                    a2Var.mo2813l(next2, x2Var.mo2498e(next2), x2Var.mo2494a(next2));
                }
            }
        }
        if (a2Var.mo2495b(C0877s1.f2547h)) {
            C0809g1.C0810a<Integer> aVar = C0877s1.f2545f;
            if (a2Var.mo2495b(aVar)) {
                a2Var.mo2812L(aVar);
            }
        }
        return mo2558A(u0Var, mo2578m(a2Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo2582q() {
        this.f1980c = C0611c.ACTIVE;
        mo2585t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo2583r() {
        this.f1980c = C0611c.INACTIVE;
        mo2585t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo2584s() {
        for (C0612d d : this.f1978a) {
            d.mo2386d(this);
        }
    }

    /* renamed from: t */
    public final void mo2585t() {
        int i = C0609a.f1989a[this.f1980c.ordinal()];
        if (i == 1) {
            for (C0612d h : this.f1978a) {
                h.mo2393h(this);
            }
        } else if (i == 2) {
            for (C0612d b : this.f1978a) {
                b.mo2382b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo2586u() {
        for (C0612d f : this.f1978a) {
            f.mo2389f(this);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: v */
    public void mo2587v(C0899w0 w0Var, C0908x2<?> x2Var, C0908x2<?> x2Var2) {
        synchronized (this.f1979b) {
            this.f1987j = w0Var;
            m2518a(w0Var);
        }
        this.f1981d = x2Var;
        this.f1985h = x2Var2;
        C0908x2<?> p = mo2581p(w0Var.mo2400m(), this.f1981d, this.f1985h);
        this.f1983f = p;
        C0610b C = p.mo2492C((C0610b) null);
        if (C != null) {
            C.mo2593c(w0Var.mo2400m());
        }
        mo2588w();
    }

    /* renamed from: w */
    public void mo2588w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo2589x() {
    }

    /* renamed from: y */
    public void mo2590y(C0899w0 w0Var) {
        mo2591z();
        C0610b C = this.f1983f.mo2492C((C0610b) null);
        if (C != null) {
            C.mo2592b();
        }
        synchronized (this.f1979b) {
            C1177h.m4579a(w0Var == this.f1987j);
            m2517E(this.f1987j);
            this.f1987j = null;
        }
        this.f1984g = null;
        this.f1986i = null;
        this.f1983f = this.f1982e;
        this.f1981d = null;
        this.f1985h = null;
    }

    /* renamed from: z */
    public void mo2591z() {
    }
}
