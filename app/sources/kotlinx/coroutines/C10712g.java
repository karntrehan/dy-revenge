package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p455g.C10315m;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.g */
final class C10712g<T> {

    /* renamed from: a */
    static final /* synthetic */ AtomicIntegerFieldUpdater f28194a = AtomicIntegerFieldUpdater.newUpdater(C10712g.class, "notCompletedCount");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10828s0<T>[] f28195b;
    volatile /* synthetic */ int notCompletedCount;

    /* renamed from: kotlinx.coroutines.g$a */
    private final class C10713a extends C10832t1 {
        private volatile /* synthetic */ Object _disposer = null;

        /* renamed from: r */
        private final C10808n<List<? extends T>> f28196r;

        /* renamed from: s */
        public C10849y0 f28197s;

        public C10713a(C10808n<? super List<? extends T>> nVar) {
            this.f28196r = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26607t((Throwable) obj);
            return C10323s.f27547a;
        }

        /* renamed from: t */
        public void mo26607t(Throwable th) {
            if (th != null) {
                Object i = this.f28196r.mo26803i(th);
                if (i != null) {
                    this.f28196r.mo26806m(i);
                    C10712g<T>.b w = mo26668w();
                    if (w != null) {
                        w.mo26673b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C10712g.f28194a.decrementAndGet(C10712g.this) == 0) {
                C10808n<List<? extends T>> nVar = this.f28196r;
                C10828s0[] a = C10712g.this.f28195b;
                ArrayList arrayList = new ArrayList(a.length);
                for (C10828s0 o : a) {
                    arrayList.add(o.mo26836o());
                }
                C10315m.C10316a aVar = C10315m.f27541f;
                nVar.mo25782d(C10315m.m35012a(arrayList));
            }
        }

        /* renamed from: w */
        public final C10712g<T>.b mo26668w() {
            return (C10714b) this._disposer;
        }

        /* renamed from: x */
        public final C10849y0 mo26669x() {
            C10849y0 y0Var = this.f28197s;
            if (y0Var != null) {
                return y0Var;
            }
            C10457l.m35332q("handle");
            return null;
        }

        /* renamed from: y */
        public final void mo26670y(C10712g<T>.b bVar) {
            this._disposer = bVar;
        }

        /* renamed from: z */
        public final void mo26671z(C10849y0 y0Var) {
            this.f28197s = y0Var;
        }
    }

    /* renamed from: kotlinx.coroutines.g$b */
    private final class C10714b extends C10783l {

        /* renamed from: f */
        private final C10712g<T>.C0000a[] f28199f;

        public C10714b(C10712g<T>.C0000a[] aVarArr) {
            this.f28199f = aVarArr;
        }

        /* renamed from: a */
        public void mo26672a(Throwable th) {
            mo26673b();
        }

        /* renamed from: b */
        public final void mo26673b() {
            for (C10712g<T>.C0000a x : this.f28199f) {
                x.mo26669x().mo26616e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26672a((Throwable) obj);
            return C10323s.f27547a;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f28199f + ']';
        }
    }

    public C10712g(C10828s0<? extends T>[] s0VarArr) {
        this.f28195b = s0VarArr;
        this.notCompletedCount = s0VarArr.length;
    }

    /* renamed from: b */
    public final Object mo26667b(C10376d<? super List<? extends T>> dVar) {
        C10815o oVar = new C10815o(C10392c.m35241b(dVar), 1);
        oVar.mo26815B();
        int length = this.f28195b.length;
        C10713a[] aVarArr = new C10713a[length];
        for (int i = 0; i < length; i++) {
            C10828s0 s0Var = this.f28195b[i];
            s0Var.start();
            C10713a aVar = new C10713a(oVar);
            aVar.mo26671z(s0Var.mo26811W(aVar));
            C10323s sVar = C10323s.f27547a;
            aVarArr[i] = aVar;
        }
        C10714b bVar = new C10714b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2].mo26670y(bVar);
        }
        if (oVar.mo26805l()) {
            bVar.mo26673b();
        } else {
            oVar.mo26802e(bVar);
        }
        Object y = oVar.mo26825y();
        if (y == C10395d.m35244c()) {
            C10403h.m35274c(dVar);
        }
        return y;
    }
}
