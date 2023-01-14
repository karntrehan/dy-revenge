package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class C0043b {

    /* renamed from: a */
    private boolean f98a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0042a> f99b = new CopyOnWriteArrayList<>();

    public C0043b(boolean z) {
        this.f98a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo143a(C0042a aVar) {
        this.f99b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo144b();

    /* renamed from: c */
    public final boolean mo145c() {
        return this.f98a;
    }

    /* renamed from: d */
    public final void mo146d() {
        Iterator<C0042a> it = this.f99b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo147e(C0042a aVar) {
        this.f99b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo148f(boolean z) {
        this.f98a = z;
    }
}
