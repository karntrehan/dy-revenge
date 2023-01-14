package p174e.p247e.p294k.p300d;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p260g.C6077b;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: e.e.k.d.i */
public interface C6287i<K, V> extends C6304s<K, V>, C6077b {

    /* renamed from: e.e.k.d.i$a */
    public static class C6288a<K, V> {

        /* renamed from: a */
        public final K f17402a;

        /* renamed from: b */
        public final C6088a<V> f17403b;

        /* renamed from: c */
        public int f17404c = 0;

        /* renamed from: d */
        public boolean f17405d = false;

        /* renamed from: e */
        public final C6289b<K> f17406e;

        /* renamed from: f */
        public int f17407f;

        private C6288a(K k, C6088a<V> aVar, C6289b<K> bVar) {
            this.f17402a = C6062k.m22839g(k);
            this.f17403b = (C6088a) C6062k.m22839g(C6088a.m22948u0(aVar));
            this.f17406e = bVar;
            this.f17407f = 0;
        }

        /* renamed from: a */
        public static <K, V> C6288a<K, V> m23798a(K k, C6088a<V> aVar, C6289b<K> bVar) {
            return new C6288a<>(k, aVar, bVar);
        }
    }

    /* renamed from: e.e.k.d.i$b */
    public interface C6289b<K> {
        /* renamed from: a */
        void mo18621a(K k, boolean z);
    }
}
