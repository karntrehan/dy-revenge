package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p027c.p036b.p037a.p039b.C1486b;

/* renamed from: androidx.lifecycle.k */
public class C1297k<T> extends C1300m<T> {

    /* renamed from: k */
    private C1486b<LiveData<?>, C1298a<?>> f3734k = new C1486b<>();

    /* renamed from: androidx.lifecycle.k$a */
    private static class C1298a<V> implements C1301n<V> {

        /* renamed from: a */
        final LiveData<V> f3735a;

        /* renamed from: b */
        final C1301n<? super V> f3736b;

        /* renamed from: c */
        int f3737c = -1;

        C1298a(LiveData<V> liveData, C1301n<? super V> nVar) {
            this.f3735a = liveData;
            this.f3736b = nVar;
        }

        /* renamed from: a */
        public void mo2369a(V v) {
            if (this.f3737c != this.f3735a.mo4308f()) {
                this.f3737c = this.f3735a.mo4308f();
                this.f3736b.mo2369a(v);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4348b() {
            this.f3735a.mo4311i(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4349c() {
            this.f3735a.mo4315m(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4312j() {
        Iterator<Map.Entry<LiveData<?>, C1298a<?>>> it = this.f3734k.iterator();
        while (it.hasNext()) {
            ((C1298a) it.next().getValue()).mo4348b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4313k() {
        Iterator<Map.Entry<LiveData<?>, C1298a<?>>> it = this.f3734k.iterator();
        while (it.hasNext()) {
            ((C1298a) it.next().getValue()).mo4349c();
        }
    }

    /* renamed from: o */
    public <S> void mo4346o(LiveData<S> liveData, C1301n<? super S> nVar) {
        C1298a aVar = new C1298a(liveData, nVar);
        C1298a p = this.f3734k.mo5522p(liveData, aVar);
        if (p != null && p.f3736b != nVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (p == null && mo4309g()) {
            aVar.mo4348b();
        }
    }

    /* renamed from: p */
    public <S> void mo4347p(LiveData<S> liveData) {
        C1298a r = this.f3734k.mo5523r(liveData);
        if (r != null) {
            r.mo4349c();
        }
    }
}
