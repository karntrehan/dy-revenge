package p174e.p181b.p182a.p184u.p186c;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.p183a0.C5417a;
import p174e.p181b.p182a.p183a0.C5419c;

/* renamed from: e.b.a.u.c.a */
public abstract class C5499a<K, A> {

    /* renamed from: a */
    final List<C5501b> f15526a = new ArrayList(1);

    /* renamed from: b */
    private boolean f15527b = false;

    /* renamed from: c */
    private final C5503d<K> f15528c;

    /* renamed from: d */
    protected float f15529d = 0.0f;

    /* renamed from: e */
    protected C5419c<A> f15530e;

    /* renamed from: f */
    private A f15531f = null;

    /* renamed from: g */
    private float f15532g = -1.0f;

    /* renamed from: h */
    private float f15533h = -1.0f;

    /* renamed from: e.b.a.u.c.a$b */
    public interface C5501b {
        /* renamed from: b */
        void mo16587b();
    }

    /* renamed from: e.b.a.u.c.a$c */
    private static final class C5502c<T> implements C5503d<T> {
        private C5502c() {
        }

        /* renamed from: a */
        public boolean mo16619a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public C5417a<T> mo16620b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public boolean mo16621c(float f) {
            return false;
        }

        /* renamed from: d */
        public float mo16622d() {
            return 1.0f;
        }

        /* renamed from: e */
        public float mo16623e() {
            return 0.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: e.b.a.u.c.a$d */
    private interface C5503d<T> {
        /* renamed from: a */
        boolean mo16619a(float f);

        /* renamed from: b */
        C5417a<T> mo16620b();

        /* renamed from: c */
        boolean mo16621c(float f);

        /* renamed from: d */
        float mo16622d();

        /* renamed from: e */
        float mo16623e();

        boolean isEmpty();
    }

    /* renamed from: e.b.a.u.c.a$e */
    private static final class C5504e<T> implements C5503d<T> {

        /* renamed from: a */
        private final List<? extends C5417a<T>> f15534a;

        /* renamed from: b */
        private C5417a<T> f15535b;

        /* renamed from: c */
        private C5417a<T> f15536c = null;

        /* renamed from: d */
        private float f15537d = -1.0f;

        C5504e(List<? extends C5417a<T>> list) {
            this.f15534a = list;
            this.f15535b = m20505f(0.0f);
        }

        /* renamed from: f */
        private C5417a<T> m20505f(float f) {
            List<? extends C5417a<T>> list = this.f15534a;
            C5417a<T> aVar = (C5417a) list.get(list.size() - 1);
            if (f >= aVar.mo16363e()) {
                return aVar;
            }
            for (int size = this.f15534a.size() - 2; size >= 1; size--) {
                C5417a<T> aVar2 = (C5417a) this.f15534a.get(size);
                if (this.f15535b != aVar2 && aVar2.mo16359a(f)) {
                    return aVar2;
                }
            }
            return (C5417a) this.f15534a.get(0);
        }

        /* renamed from: a */
        public boolean mo16619a(float f) {
            C5417a<T> aVar = this.f15536c;
            C5417a<T> aVar2 = this.f15535b;
            if (aVar == aVar2 && this.f15537d == f) {
                return true;
            }
            this.f15536c = aVar2;
            this.f15537d = f;
            return false;
        }

        /* renamed from: b */
        public C5417a<T> mo16620b() {
            return this.f15535b;
        }

        /* renamed from: c */
        public boolean mo16621c(float f) {
            if (this.f15535b.mo16359a(f)) {
                return !this.f15535b.mo16366h();
            }
            this.f15535b = m20505f(f);
            return true;
        }

        /* renamed from: d */
        public float mo16622d() {
            List<? extends C5417a<T>> list = this.f15534a;
            return ((C5417a) list.get(list.size() - 1)).mo16360b();
        }

        /* renamed from: e */
        public float mo16623e() {
            return ((C5417a) this.f15534a.get(0)).mo16363e();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: e.b.a.u.c.a$f */
    private static final class C5505f<T> implements C5503d<T> {

        /* renamed from: a */
        private final C5417a<T> f15538a;

        /* renamed from: b */
        private float f15539b = -1.0f;

        C5505f(List<? extends C5417a<T>> list) {
            this.f15538a = (C5417a) list.get(0);
        }

        /* renamed from: a */
        public boolean mo16619a(float f) {
            if (this.f15539b == f) {
                return true;
            }
            this.f15539b = f;
            return false;
        }

        /* renamed from: b */
        public C5417a<T> mo16620b() {
            return this.f15538a;
        }

        /* renamed from: c */
        public boolean mo16621c(float f) {
            return !this.f15538a.mo16366h();
        }

        /* renamed from: d */
        public float mo16622d() {
            return this.f15538a.mo16360b();
        }

        /* renamed from: e */
        public float mo16623e() {
            return this.f15538a.mo16363e();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    C5499a(List<? extends C5417a<K>> list) {
        this.f15528c = m20480o(list);
    }

    /* renamed from: g */
    private float m20479g() {
        if (this.f15532g == -1.0f) {
            this.f15532g = this.f15528c.mo16623e();
        }
        return this.f15532g;
    }

    /* renamed from: o */
    private static <T> C5503d<T> m20480o(List<? extends C5417a<T>> list) {
        return list.isEmpty() ? new C5502c() : list.size() == 1 ? new C5505f(list) : new C5504e(list);
    }

    /* renamed from: a */
    public void mo16606a(C5501b bVar) {
        this.f15526a.add(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5417a<K> mo16607b() {
        C5422c.m20179a("BaseKeyframeAnimation#getCurrentKeyframe");
        C5417a<K> b = this.f15528c.mo16620b();
        C5422c.m20180b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo16608c() {
        if (this.f15533h == -1.0f) {
            this.f15533h = this.f15528c.mo16622d();
        }
        return this.f15533h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public float mo16609d() {
        C5417a b = mo16607b();
        if (b.mo16366h()) {
            return 0.0f;
        }
        return b.f15116d.getInterpolation(mo16610e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo16610e() {
        if (this.f15527b) {
            return 0.0f;
        }
        C5417a b = mo16607b();
        if (b.mo16366h()) {
            return 0.0f;
        }
        return (this.f15529d - b.mo16363e()) / (b.mo16360b() - b.mo16363e());
    }

    /* renamed from: f */
    public float mo16611f() {
        return this.f15529d;
    }

    /* renamed from: h */
    public A mo16612h() {
        float e = mo16610e();
        if (this.f15530e == null && this.f15528c.mo16619a(e)) {
            return this.f15531f;
        }
        C5417a b = mo16607b();
        Interpolator interpolator = b.f15117e;
        A i = (interpolator == null || b.f15118f == null) ? mo16613i(b, mo16609d()) : mo16614j(b, e, interpolator.getInterpolation(e), b.f15118f.getInterpolation(e));
        this.f15531f = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract A mo16613i(C5417a<K> aVar, float f);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public A mo16614j(C5417a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo16615k() {
        for (int i = 0; i < this.f15526a.size(); i++) {
            this.f15526a.get(i).mo16587b();
        }
    }

    /* renamed from: l */
    public void mo16616l() {
        this.f15527b = true;
    }

    /* renamed from: m */
    public void mo16617m(float f) {
        if (!this.f15528c.isEmpty()) {
            if (f < m20479g()) {
                f = m20479g();
            } else if (f > mo16608c()) {
                f = mo16608c();
            }
            if (f != this.f15529d) {
                this.f15529d = f;
                if (this.f15528c.mo16621c(f)) {
                    mo16615k();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo16618n(C5419c<A> cVar) {
        C5419c<A> cVar2 = this.f15530e;
        if (cVar2 != null) {
            cVar2.mo16371c((C5499a<?, ?>) null);
        }
        this.f15530e = cVar;
        if (cVar != null) {
            cVar.mo16371c(this);
        }
    }
}
