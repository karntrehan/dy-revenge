package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.y */
public class C10848y {

    /* renamed from: a */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f28405a = AtomicIntegerFieldUpdater.newUpdater(C10848y.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: b */
    public final Throwable f28406b;

    public C10848y(Throwable th, boolean z) {
        this.f28406b = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10848y(Throwable th, boolean z, int i, C10452g gVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo26877a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo26878b() {
        return f28405a.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C10822q0.m36786a(this) + '[' + this.f28406b + ']';
    }
}
