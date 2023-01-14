package p174e.p247e.p294k.p300d;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6063l;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p261h.C6098h;
import p174e.p247e.p294k.p300d.C6287i;
import p174e.p247e.p294k.p300d.C6304s;

/* renamed from: e.e.k.d.r */
public class C6301r<K, V> implements C6287i<K, V>, C6304s<K, V> {

    /* renamed from: a */
    private final C6287i.C6289b<K> f17416a;

    /* renamed from: b */
    final C6286h<K, C6287i.C6288a<K, V>> f17417b;

    /* renamed from: c */
    final C6286h<K, C6287i.C6288a<K, V>> f17418c;

    /* renamed from: d */
    final Map<Bitmap, Object> f17419d = new WeakHashMap();

    /* renamed from: e */
    private final C6311y<V> f17420e;

    /* renamed from: f */
    private final C6304s.C6305a f17421f;

    /* renamed from: g */
    private final C6065n<C6306t> f17422g;

    /* renamed from: h */
    protected C6306t f17423h;

    /* renamed from: i */
    private long f17424i;

    /* renamed from: e.e.k.d.r$a */
    class C6302a implements C6311y<C6287i.C6288a<K, V>> {

        /* renamed from: a */
        final /* synthetic */ C6311y f17425a;

        C6302a(C6311y yVar) {
            this.f17425a = yVar;
        }

        /* renamed from: b */
        public int mo18611a(C6287i.C6288a<K, V> aVar) {
            return this.f17425a.mo18611a(aVar.f17403b.mo18082w0());
        }
    }

    /* renamed from: e.e.k.d.r$b */
    class C6303b implements C6098h<V> {

        /* renamed from: a */
        final /* synthetic */ C6287i.C6288a f17427a;

        C6303b(C6287i.C6288a aVar) {
            this.f17427a = aVar;
        }

        /* renamed from: a */
        public void mo8068a(V v) {
            C6301r.this.m23859x(this.f17427a);
        }
    }

    public C6301r(C6311y<V> yVar, C6304s.C6305a aVar, C6065n<C6306t> nVar, C6287i.C6289b<K> bVar) {
        this.f17420e = yVar;
        this.f17417b = new C6286h<>(m23861z(yVar));
        this.f17418c = new C6286h<>(m23861z(yVar));
        this.f17421f = aVar;
        this.f17422g = nVar;
        this.f17423h = (C6306t) C6062k.m22840h(nVar.get(), "mMemoryCacheParamsSupplier returned null");
        this.f17424i = SystemClock.uptimeMillis();
        this.f17416a = bVar;
    }

    /* renamed from: h */
    private synchronized boolean m23846h(V v) {
        boolean z;
        int a = this.f17420e.mo18611a(v);
        z = true;
        if (a > this.f17423h.f17433e || mo18655j() > this.f17423h.f17430b - 1 || mo18656k() > this.f17423h.f17429a - a) {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    private synchronized void m23847i(C6287i.C6288a<K, V> aVar) {
        C6062k.m22839g(aVar);
        C6062k.m22841i(aVar.f17404c > 0);
        aVar.f17404c--;
    }

    /* renamed from: l */
    private synchronized void m23848l(C6287i.C6288a<K, V> aVar) {
        C6062k.m22839g(aVar);
        C6062k.m22841i(!aVar.f17405d);
        aVar.f17404c++;
    }

    /* renamed from: m */
    private synchronized void m23849m(C6287i.C6288a<K, V> aVar) {
        C6062k.m22839g(aVar);
        C6062k.m22841i(!aVar.f17405d);
        aVar.f17405d = true;
    }

    /* renamed from: n */
    private synchronized void m23850n(ArrayList<C6287i.C6288a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<C6287i.C6288a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m23849m(it.next());
            }
        }
    }

    /* renamed from: o */
    private synchronized boolean m23851o(C6287i.C6288a<K, V> aVar) {
        boolean z;
        if (aVar.f17405d || aVar.f17404c != 0) {
            z = false;
        } else {
            this.f17417b.mo18618g(aVar.f17402a, aVar);
            z = true;
        }
        return z;
    }

    /* renamed from: p */
    private void m23852p(ArrayList<C6287i.C6288a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<C6287i.C6288a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                C6088a.m22949v0(m23858w(it.next()));
            }
        }
    }

    /* renamed from: r */
    private static <K, V> void m23853r(C6287i.C6288a<K, V> aVar) {
        C6287i.C6289b<K> bVar;
        if (aVar != null && (bVar = aVar.f17406e) != null) {
            bVar.mo18621a(aVar.f17402a, true);
        }
    }

    /* renamed from: s */
    private static <K, V> void m23854s(C6287i.C6288a<K, V> aVar) {
        C6287i.C6289b<K> bVar;
        if (aVar != null && (bVar = aVar.f17406e) != null) {
            bVar.mo18621a(aVar.f17402a, false);
        }
    }

    /* renamed from: t */
    private void m23855t(ArrayList<C6287i.C6288a<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<C6287i.C6288a<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m23854s(it.next());
            }
        }
    }

    /* renamed from: u */
    private synchronized void m23856u() {
        if (this.f17424i + this.f17423h.f17434f <= SystemClock.uptimeMillis()) {
            this.f17424i = SystemClock.uptimeMillis();
            this.f17423h = (C6306t) C6062k.m22840h(this.f17422g.get(), "mMemoryCacheParamsSupplier returned null");
        }
    }

    /* renamed from: v */
    private synchronized C6088a<V> m23857v(C6287i.C6288a<K, V> aVar) {
        m23848l(aVar);
        return C6088a.m22942C0(aVar.f17403b.mo18082w0(), new C6303b(aVar));
    }

    /* renamed from: w */
    private synchronized C6088a<V> m23858w(C6287i.C6288a<K, V> aVar) {
        C6062k.m22839g(aVar);
        return (!aVar.f17405d || aVar.f17404c != 0) ? null : aVar.f17403b;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m23859x(C6287i.C6288a<K, V> aVar) {
        boolean o;
        C6088a<V> w;
        C6062k.m22839g(aVar);
        synchronized (this) {
            m23847i(aVar);
            o = m23851o(aVar);
            w = m23858w(aVar);
        }
        C6088a.m22949v0(w);
        if (!o) {
            aVar = null;
        }
        m23853r(aVar);
        m23856u();
        mo18657q();
    }

    /* renamed from: y */
    private synchronized ArrayList<C6287i.C6288a<K, V>> m23860y(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f17417b.mo18614b() <= max && this.f17417b.mo18617e() <= max2) {
            return null;
        }
        ArrayList<C6287i.C6288a<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.f17417b.mo18614b() <= max && this.f17417b.mo18617e() <= max2) {
                return arrayList;
            }
            K c = this.f17417b.mo18615c();
            if (c != null) {
                this.f17417b.mo18619h(c);
                arrayList.add(this.f17418c.mo18619h(c));
            } else {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", new Object[]{Integer.valueOf(this.f17417b.mo18614b()), Integer.valueOf(this.f17417b.mo18617e())}));
            }
        }
    }

    /* renamed from: z */
    private C6311y<C6287i.C6288a<K, V>> m23861z(C6311y<V> yVar) {
        return new C6302a(yVar);
    }

    /* renamed from: b */
    public void mo18646b(K k) {
        C6062k.m22839g(k);
        synchronized (this) {
            C6287i.C6288a h = this.f17417b.mo18619h(k);
            if (h != null) {
                this.f17417b.mo18618g(k, h);
            }
        }
    }

    /* renamed from: c */
    public C6088a<V> mo18647c(K k, C6088a<V> aVar) {
        return mo18654g(k, aVar, this.f17416a);
    }

    /* renamed from: d */
    public int mo18648d(C6063l<K> lVar) {
        ArrayList<C6287i.C6288a<K, V>> i;
        ArrayList<C6287i.C6288a<K, V>> i2;
        synchronized (this) {
            i = this.f17417b.mo18620i(lVar);
            i2 = this.f17418c.mo18620i(lVar);
            m23850n(i2);
        }
        m23852p(i2);
        m23855t(i);
        m23856u();
        mo18657q();
        return i2.size();
    }

    /* renamed from: e */
    public synchronized boolean mo18649e(C6063l<K> lVar) {
        return !this.f17418c.mo18616d(lVar).isEmpty();
    }

    /* renamed from: g */
    public C6088a<V> mo18654g(K k, C6088a<V> aVar, C6287i.C6289b<K> bVar) {
        C6287i.C6288a h;
        C6088a<V> aVar2;
        C6088a aVar3;
        C6062k.m22839g(k);
        C6062k.m22839g(aVar);
        m23856u();
        synchronized (this) {
            h = this.f17417b.mo18619h(k);
            C6287i.C6288a h2 = this.f17418c.mo18619h(k);
            aVar2 = null;
            if (h2 != null) {
                m23849m(h2);
                aVar3 = m23858w(h2);
            } else {
                aVar3 = null;
            }
            if (m23846h(aVar.mo18082w0())) {
                C6287i.C6288a<K, V> a = C6287i.C6288a.m23798a(k, aVar, bVar);
                this.f17418c.mo18618g(k, a);
                aVar2 = m23857v(a);
            }
        }
        C6088a.m22949v0(aVar3);
        m23854s(h);
        mo18657q();
        return aVar2;
    }

    public C6088a<V> get(K k) {
        C6287i.C6288a h;
        C6088a<V> v;
        C6062k.m22839g(k);
        synchronized (this) {
            h = this.f17417b.mo18619h(k);
            C6287i.C6288a a = this.f17418c.mo18613a(k);
            v = a != null ? m23857v(a) : null;
        }
        m23854s(h);
        m23856u();
        mo18657q();
        return v;
    }

    /* renamed from: j */
    public synchronized int mo18655j() {
        return this.f17418c.mo18614b() - this.f17417b.mo18614b();
    }

    /* renamed from: k */
    public synchronized int mo18656k() {
        return this.f17418c.mo18617e() - this.f17417b.mo18617e();
    }

    /* renamed from: q */
    public void mo18657q() {
        ArrayList y;
        synchronized (this) {
            C6306t tVar = this.f17423h;
            int min = Math.min(tVar.f17432d, tVar.f17430b - mo18655j());
            C6306t tVar2 = this.f17423h;
            y = m23860y(min, Math.min(tVar2.f17431c, tVar2.f17429a - mo18656k()));
            m23850n(y);
        }
        m23852p(y);
        m23855t(y);
    }
}
