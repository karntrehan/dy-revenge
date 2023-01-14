package p174e.p319f.p320a.p335c.p362h;

import java.util.concurrent.ExecutionException;

/* renamed from: e.f.a.c.h.t */
final class C8976t implements C8975s {

    /* renamed from: a */
    private final Object f24388a = new Object();

    /* renamed from: b */
    private final int f24389b;

    /* renamed from: c */
    private final C8970o0<Void> f24390c;

    /* renamed from: d */
    private int f24391d;

    /* renamed from: e */
    private int f24392e;

    /* renamed from: f */
    private int f24393f;

    /* renamed from: g */
    private Exception f24394g;

    /* renamed from: h */
    private boolean f24395h;

    public C8976t(int i, C8970o0<Void> o0Var) {
        this.f24389b = i;
        this.f24390c = o0Var;
    }

    /* renamed from: d */
    private final void m29904d() {
        if (this.f24391d + this.f24392e + this.f24393f != this.f24389b) {
            return;
        }
        if (this.f24394g != null) {
            C8970o0<Void> o0Var = this.f24390c;
            int i = this.f24392e;
            int i2 = this.f24389b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            o0Var.mo22789r(new ExecutionException(sb.toString(), this.f24394g));
        } else if (this.f24395h) {
            this.f24390c.mo22791t();
        } else {
            this.f24390c.mo22790s(null);
        }
    }

    /* renamed from: a */
    public final void mo16116a(Object obj) {
        synchronized (this.f24388a) {
            this.f24391d++;
            m29904d();
        }
    }

    /* renamed from: b */
    public final void mo14987b(Exception exc) {
        synchronized (this.f24388a) {
            this.f24392e++;
            this.f24394g = exc;
            m29904d();
        }
    }

    /* renamed from: c */
    public final void mo22759c() {
        synchronized (this.f24388a) {
            this.f24393f++;
            this.f24395h = true;
            m29904d();
        }
    }
}
