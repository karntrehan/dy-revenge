package p174e.p247e.p294k.p300d;

import p174e.p247e.p253d.p257d.C6063l;
import p174e.p247e.p253d.p261h.C6088a;

/* renamed from: e.e.k.d.p */
public class C6298p<K, V> implements C6304s<K, V> {

    /* renamed from: a */
    private final C6304s<K, V> f17413a;

    /* renamed from: b */
    private final C6307u f17414b;

    public C6298p(C6304s<K, V> sVar, C6307u uVar) {
        this.f17413a = sVar;
        this.f17414b = uVar;
    }

    /* renamed from: b */
    public void mo18646b(K k) {
        this.f17413a.mo18646b(k);
    }

    /* renamed from: c */
    public C6088a<V> mo18647c(K k, C6088a<V> aVar) {
        this.f17414b.mo18628c(k);
        return this.f17413a.mo18647c(k, aVar);
    }

    /* renamed from: d */
    public int mo18648d(C6063l<K> lVar) {
        return this.f17413a.mo18648d(lVar);
    }

    /* renamed from: e */
    public boolean mo18649e(C6063l<K> lVar) {
        return this.f17413a.mo18649e(lVar);
    }

    public C6088a<V> get(K k) {
        C6088a<V> aVar = this.f17413a.get(k);
        C6307u uVar = this.f17414b;
        if (aVar == null) {
            uVar.mo18627b(k);
        } else {
            uVar.mo18626a(k);
        }
        return aVar;
    }
}
