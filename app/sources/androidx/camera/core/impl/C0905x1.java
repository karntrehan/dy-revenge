package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.core.util.C1177h;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.C1301n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.x1 */
public final class C0905x1<T> implements C0796d2<T> {

    /* renamed from: a */
    final C1300m<C0907b<T>> f2594a = new C1300m<>();

    /* renamed from: b */
    private final Map<C0796d2.C0797a<? super T>, C0906a<T>> f2595b = new HashMap();

    /* renamed from: androidx.camera.core.impl.x1$a */
    private static final class C0906a<T> implements C1301n<C0907b<T>> {

        /* renamed from: a */
        final AtomicBoolean f2596a = new AtomicBoolean(true);

        /* renamed from: b */
        final C0796d2.C0797a<? super T> f2597b;

        /* renamed from: c */
        final Executor f2598c;

        C0906a(Executor executor, C0796d2.C0797a<? super T> aVar) {
            this.f2598c = executor;
            this.f2597b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void mo3153d(C0907b bVar) {
            if (this.f2596a.get()) {
                if (bVar.mo3155a()) {
                    this.f2597b.mo2978b(bVar.mo3157d());
                    return;
                }
                C1177h.m4583e(bVar.mo3156c());
                this.f2597b.mo2977a(bVar.mo3156c());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3152b() {
            this.f2596a.set(false);
        }

        /* renamed from: e */
        public void mo2369a(C0907b<T> bVar) {
            this.f2598c.execute(new C0824j(this, bVar));
        }
    }

    /* renamed from: androidx.camera.core.impl.x1$b */
    public static final class C0907b<T> {

        /* renamed from: a */
        private final T f2599a;

        /* renamed from: b */
        private final Throwable f2600b;

        private C0907b(T t, Throwable th) {
            this.f2599a = t;
            this.f2600b = th;
        }

        /* renamed from: b */
        static <T> C0907b<T> m3585b(T t) {
            return new C0907b<>(t, (Throwable) null);
        }

        /* renamed from: a */
        public boolean mo3155a() {
            return this.f2600b == null;
        }

        /* renamed from: c */
        public Throwable mo3156c() {
            return this.f2600b;
        }

        /* renamed from: d */
        public T mo3157d() {
            if (mo3155a()) {
                return this.f2599a;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            T t;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[Result: <");
            if (mo3155a()) {
                sb = new StringBuilder();
                sb.append("Value: ");
                t = this.f2599a;
            } else {
                sb = new StringBuilder();
                sb.append("Error: ");
                t = this.f2600b;
            }
            sb.append(t);
            sb2.append(sb.toString());
            sb2.append(">]");
            return sb2.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void mo3147f(C0906a aVar, C0906a aVar2) {
        if (aVar != null) {
            this.f2594a.mo4315m(aVar);
        }
        this.f2594a.mo4311i(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo3148h(C1814b.C1815a aVar) {
        Throwable c;
        C0907b e = this.f2594a.mo2469e();
        if (e == null) {
            c = new IllegalStateException("Observable has not yet been initialized with a value.");
        } else if (e.mo3155a()) {
            aVar.mo6308c(e.mo3157d());
            return;
        } else {
            C1177h.m4583e(e.mo3156c());
            c = e.mo3156c();
        }
        aVar.mo6310f(c);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object mo3149j(C1814b.C1815a aVar) {
        C0744a.m3047d().execute(new C0833l(this, aVar));
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo3150l(C0906a aVar) {
        this.f2594a.mo4315m(aVar);
    }

    /* renamed from: a */
    public void mo2974a(C0796d2.C0797a<? super T> aVar) {
        synchronized (this.f2595b) {
            C0906a remove = this.f2595b.remove(aVar);
            if (remove != null) {
                remove.mo3152b();
                C0744a.m3047d().execute(new C0818i(this, remove));
            }
        }
    }

    /* renamed from: d */
    public C9172b<T> mo2975d() {
        return C1814b.m7736a(new C0837m(this));
    }

    /* renamed from: e */
    public void mo2976e(Executor executor, C0796d2.C0797a<? super T> aVar) {
        synchronized (this.f2595b) {
            C0906a aVar2 = this.f2595b.get(aVar);
            if (aVar2 != null) {
                aVar2.mo3152b();
            }
            C0906a aVar3 = new C0906a(executor, aVar);
            this.f2595b.put(aVar, aVar3);
            C0744a.m3047d().execute(new C0829k(this, aVar2, aVar3));
        }
    }

    /* renamed from: m */
    public void mo3151m(T t) {
        this.f2594a.mo4314l(C0907b.m3585b(t));
    }
}
