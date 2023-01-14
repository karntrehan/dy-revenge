package androidx.lifecycle;

import androidx.lifecycle.C1286d;
import java.util.Map;
import p027c.p036b.p037a.p038a.C1479a;
import p027c.p036b.p037a.p039b.C1486b;

public abstract class LiveData<T> {

    /* renamed from: a */
    static final Object f3683a = new Object();

    /* renamed from: b */
    final Object f3684b;

    /* renamed from: c */
    private C1486b<C1301n<? super T>, LiveData<T>.c> f3685c;

    /* renamed from: d */
    int f3686d;

    /* renamed from: e */
    private volatile Object f3687e;

    /* renamed from: f */
    volatile Object f3688f;

    /* renamed from: g */
    private int f3689g;

    /* renamed from: h */
    private boolean f3690h;

    /* renamed from: i */
    private boolean f3691i;

    /* renamed from: j */
    private final Runnable f3692j;

    class LifecycleBoundObserver extends LiveData<T>.c implements C1289e {

        /* renamed from: r */
        final C1291g f3693r;

        LifecycleBoundObserver(C1291g gVar, C1301n<? super T> nVar) {
            super(nVar);
            this.f3693r = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4317c() {
            this.f3693r.getLifecycle().mo4340c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4318d(C1291g gVar) {
            return this.f3693r == gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo4319e() {
            return this.f3693r.getLifecycle().mo4339b().mo4341e(C1286d.C1288b.STARTED);
        }

        /* renamed from: h */
        public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
            if (this.f3693r.getLifecycle().mo4339b() == C1286d.C1288b.DESTROYED) {
                LiveData.this.mo4315m(this.f3697f);
            } else {
                mo4321a(mo4319e());
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1276a implements Runnable {
        C1276a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f3684b) {
                obj = LiveData.this.f3688f;
                LiveData.this.f3688f = LiveData.f3683a;
            }
            LiveData.this.mo4316n(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1277b extends LiveData<T>.c {
        C1277b(C1301n<? super T> nVar) {
            super(nVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo4319e() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1278c {

        /* renamed from: f */
        final C1301n<? super T> f3697f;

        /* renamed from: o */
        boolean f3698o;

        /* renamed from: p */
        int f3699p = -1;

        C1278c(C1301n<? super T> nVar) {
            this.f3697f = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4321a(boolean z) {
            if (z != this.f3698o) {
                this.f3698o = z;
                LiveData liveData = LiveData.this;
                int i = liveData.f3686d;
                int i2 = 1;
                boolean z2 = i == 0;
                if (!z) {
                    i2 = -1;
                }
                liveData.f3686d = i + i2;
                if (z2 && z) {
                    liveData.mo4312j();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f3686d == 0 && !this.f3698o) {
                    liveData2.mo4313k();
                }
                if (this.f3698o) {
                    LiveData.this.mo4307d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4317c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4318d(C1291g gVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract boolean mo4319e();
    }

    public LiveData() {
        this.f3684b = new Object();
        this.f3685c = new C1486b<>();
        this.f3686d = 0;
        Object obj = f3683a;
        this.f3688f = obj;
        this.f3692j = new C1276a();
        this.f3687e = obj;
        this.f3689g = -1;
    }

    public LiveData(T t) {
        this.f3684b = new Object();
        this.f3685c = new C1486b<>();
        this.f3686d = 0;
        this.f3688f = f3683a;
        this.f3692j = new C1276a();
        this.f3687e = t;
        this.f3689g = 0;
    }

    /* renamed from: b */
    static void m5256b(String str) {
        if (!C1479a.m6613d().mo5515b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: c */
    private void m5257c(LiveData<T>.c cVar) {
        if (cVar.f3698o) {
            if (!cVar.mo4319e()) {
                cVar.mo4321a(false);
                return;
            }
            int i = cVar.f3699p;
            int i2 = this.f3689g;
            if (i < i2) {
                cVar.f3699p = i2;
                cVar.f3697f.mo2369a(this.f3687e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4307d(LiveData<T>.c cVar) {
        if (this.f3690h) {
            this.f3691i = true;
            return;
        }
        this.f3690h = true;
        do {
            this.f3691i = false;
            if (cVar == null) {
                C1486b<K, V>.d j = this.f3685c.mo5530j();
                while (j.hasNext()) {
                    m5257c((C1278c) ((Map.Entry) j.next()).getValue());
                    if (this.f3691i) {
                        break;
                    }
                }
            } else {
                m5257c(cVar);
                cVar = null;
            }
        } while (this.f3691i);
        this.f3690h = false;
    }

    /* renamed from: e */
    public T mo2469e() {
        T t = this.f3687e;
        if (t != f3683a) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo4308f() {
        return this.f3689g;
    }

    /* renamed from: g */
    public boolean mo4309g() {
        return this.f3686d > 0;
    }

    /* renamed from: h */
    public void mo4310h(C1291g gVar, C1301n<? super T> nVar) {
        m5256b("observe");
        if (gVar.getLifecycle().mo4339b() != C1286d.C1288b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, nVar);
            C1278c p = this.f3685c.mo5522p(nVar, lifecycleBoundObserver);
            if (p != null && !p.mo4318d(gVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (p == null) {
                gVar.getLifecycle().mo4338a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: i */
    public void mo4311i(C1301n<? super T> nVar) {
        m5256b("observeForever");
        C1277b bVar = new C1277b(nVar);
        C1278c p = this.f3685c.mo5522p(nVar, bVar);
        if (p instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (p == null) {
            bVar.mo4321a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4312j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4313k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4314l(T t) {
        boolean z;
        synchronized (this.f3684b) {
            z = this.f3688f == f3683a;
            this.f3688f = t;
        }
        if (z) {
            C1479a.m6613d().mo5516c(this.f3692j);
        }
    }

    /* renamed from: m */
    public void mo4315m(C1301n<? super T> nVar) {
        m5256b("removeObserver");
        C1278c r = this.f3685c.mo5523r(nVar);
        if (r != null) {
            r.mo4317c();
            r.mo4321a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4316n(T t) {
        m5256b("setValue");
        this.f3689g++;
        this.f3687e = t;
        mo4307d((LiveData<T>.c) null);
    }
}
