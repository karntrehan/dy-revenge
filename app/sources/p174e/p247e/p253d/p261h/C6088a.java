package p174e.p247e.p253d.p261h;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import p174e.p247e.p253d.p257d.C6050b;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.d.h.a */
public abstract class C6088a<T> implements Cloneable, Closeable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static Class<C6088a> f16726f = C6088a.class;

    /* renamed from: o */
    private static int f16727o = 0;

    /* renamed from: p */
    private static final C6098h<Closeable> f16728p = new C6089a();

    /* renamed from: q */
    private static final C6091c f16729q = new C6090b();

    /* renamed from: r */
    protected boolean f16730r = false;

    /* renamed from: s */
    protected final C6099i<T> f16731s;

    /* renamed from: t */
    protected final C6091c f16732t;

    /* renamed from: u */
    protected final Throwable f16733u;

    /* renamed from: e.e.d.h.a$a */
    static class C6089a implements C6098h<Closeable> {
        C6089a() {
        }

        /* renamed from: b */
        public void mo8068a(Closeable closeable) {
            try {
                C6050b.m22816a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e.e.d.h.a$b */
    static class C6090b implements C6091c {
        C6090b() {
        }

        /* renamed from: a */
        public void mo18086a(C6099i<Object> iVar, Throwable th) {
            Object f = iVar.mo18093f();
            Class r = C6088a.f16726f;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(iVar));
            objArr[2] = f == null ? null : f.getClass().getName();
            C6071a.m22857E(r, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        /* renamed from: b */
        public boolean mo18087b() {
            return false;
        }
    }

    /* renamed from: e.e.d.h.a$c */
    public interface C6091c {
        /* renamed from: a */
        void mo18086a(C6099i<Object> iVar, Throwable th);

        /* renamed from: b */
        boolean mo18087b();
    }

    protected C6088a(C6099i<T> iVar, C6091c cVar, Throwable th) {
        this.f16731s = (C6099i) C6062k.m22839g(iVar);
        iVar.mo18091b();
        this.f16732t = cVar;
        this.f16733u = th;
    }

    protected C6088a(T t, C6098h<T> hVar, C6091c cVar, Throwable th) {
        this.f16731s = new C6099i<>(t, hVar);
        this.f16732t = cVar;
        this.f16733u = th;
    }

    /* renamed from: A0 */
    public static <T extends Closeable> C6088a<T> m22940A0(T t) {
        return m22942C0(t, f16728p);
    }

    /* renamed from: B0 */
    public static <T extends Closeable> C6088a<T> m22941B0(T t, C6091c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        C6098h<Closeable> hVar = f16728p;
        if (cVar.mo18087b()) {
            th = new Throwable();
        }
        return m22944E0(t, hVar, cVar, th);
    }

    /* renamed from: C0 */
    public static <T> C6088a<T> m22942C0(T t, C6098h<T> hVar) {
        return m22943D0(t, hVar, f16729q);
    }

    /* renamed from: D0 */
    public static <T> C6088a<T> m22943D0(T t, C6098h<T> hVar, C6091c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        if (cVar.mo18087b()) {
            th = new Throwable();
        }
        return m22944E0(t, hVar, cVar, th);
    }

    /* renamed from: E0 */
    public static <T> C6088a<T> m22944E0(T t, C6098h<T> hVar, C6091c cVar, Throwable th) {
        if (t == null) {
            return null;
        }
        if ((t instanceof Bitmap) || (t instanceof C6094d)) {
            int i = f16727o;
            if (i == 1) {
                return new C6093c(t, hVar, cVar, th);
            }
            if (i == 2) {
                return new C6097g(t, hVar, cVar, th);
            }
            if (i == 3) {
                return new C6095e(t, hVar, cVar, th);
            }
        }
        return new C6092b(t, hVar, cVar, th);
    }

    /* renamed from: F0 */
    public static void m22945F0(int i) {
        f16727o = i;
    }

    /* renamed from: G0 */
    public static boolean m22946G0() {
        return f16727o == 3;
    }

    /* renamed from: u0 */
    public static <T> C6088a<T> m22948u0(C6088a<T> aVar) {
        if (aVar != null) {
            return aVar.mo18081s0();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m22949v0(C6088a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    /* renamed from: z0 */
    public static boolean m22950z0(C6088a<?> aVar) {
        return aVar != null && aVar.mo18084y0();
    }

    public void close() {
        synchronized (this) {
            if (!this.f16730r) {
                this.f16730r = true;
                this.f16731s.mo18092d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (this.f16730r) {
                    super.finalize();
                    return;
                }
                this.f16732t.mo18086a(this.f16731s, this.f16733u);
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: n0 */
    public abstract C6088a<T> clone();

    /* renamed from: s0 */
    public synchronized C6088a<T> mo18081s0() {
        if (!mo18084y0()) {
            return null;
        }
        return clone();
    }

    /* renamed from: w0 */
    public synchronized T mo18082w0() {
        C6062k.m22841i(!this.f16730r);
        return C6062k.m22839g(this.f16731s.mo18093f());
    }

    /* renamed from: x0 */
    public int mo18083x0() {
        if (mo18084y0()) {
            return System.identityHashCode(this.f16731s.mo18093f());
        }
        return 0;
    }

    /* renamed from: y0 */
    public synchronized boolean mo18084y0() {
        return !this.f16730r;
    }
}
