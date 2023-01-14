package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f90a;

    /* renamed from: b */
    final ArrayDeque<C0043b> f91b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C1289e, C0042a {

        /* renamed from: f */
        private final C1286d f92f;

        /* renamed from: o */
        private final C0043b f93o;

        /* renamed from: p */
        private C0042a f94p;

        LifecycleOnBackPressedCancellable(C1286d dVar, C0043b bVar) {
            this.f92f = dVar;
            this.f93o = bVar;
            dVar.mo4338a(this);
        }

        public void cancel() {
            this.f92f.mo4340c(this);
            this.f93o.mo147e(this);
            C0042a aVar = this.f94p;
            if (aVar != null) {
                aVar.cancel();
                this.f94p = null;
            }
        }

        /* renamed from: h */
        public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
            if (aVar == C1286d.C1287a.ON_START) {
                this.f94p = OnBackPressedDispatcher.this.mo140b(this.f93o);
            } else if (aVar == C1286d.C1287a.ON_STOP) {
                C0042a aVar2 = this.f94p;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C1286d.C1287a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0041a implements C0042a {

        /* renamed from: f */
        private final C0043b f96f;

        C0041a(C0043b bVar) {
            this.f96f = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f91b.remove(this.f96f);
            this.f96f.mo147e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f90a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo139a(C1291g gVar, C0043b bVar) {
        C1286d lifecycle = gVar.getLifecycle();
        if (lifecycle.mo4339b() != C1286d.C1288b.DESTROYED) {
            bVar.mo143a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0042a mo140b(C0043b bVar) {
        this.f91b.add(bVar);
        C0041a aVar = new C0041a(bVar);
        bVar.mo143a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo141c() {
        Iterator<C0043b> descendingIterator = this.f91b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0043b next = descendingIterator.next();
            if (next.mo145c()) {
                next.mo144b();
                return;
            }
        }
        Runnable runnable = this.f90a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
