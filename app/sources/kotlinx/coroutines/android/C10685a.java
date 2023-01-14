package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C10826r1;
import kotlinx.coroutines.C10846x0;
import p455g.C10323s;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.android.a */
public final class C10685a extends C10686b {
    private volatile C10685a _immediate;

    /* renamed from: o */
    private final Handler f28172o;

    /* renamed from: p */
    private final String f28173p;

    /* renamed from: q */
    private final boolean f28174q;

    /* renamed from: r */
    private final C10685a f28175r;

    public C10685a(Handler handler, String str) {
        this(handler, str, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10685a(Handler handler, String str, int i, C10452g gVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10685a(Handler handler, String str, boolean z) {
        super((C10452g) null);
        C10685a aVar = null;
        this.f28172o = handler;
        this.f28173p = str;
        this.f28174q = z;
        this._immediate = z ? this : aVar;
        C10685a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new C10685a(handler, str, true);
            this._immediate = aVar2;
            C10323s sVar = C10323s.f27547a;
        }
        this.f28175r = aVar2;
    }

    /* renamed from: y0 */
    private final void m36364y0(C10381g gVar, Runnable runnable) {
        C10826r1.m36800c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C10846x0.m36936b().mo26625u0(gVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10685a) && ((C10685a) obj).f28172o == this.f28172o;
    }

    public int hashCode() {
        return System.identityHashCode(this.f28172o);
    }

    public String toString() {
        String x0 = mo26880x0();
        if (x0 != null) {
            return x0;
        }
        String str = this.f28173p;
        if (str == null) {
            str = this.f28172o.toString();
        }
        return this.f28174q ? C10457l.m35326k(str, ".immediate") : str;
    }

    /* renamed from: u0 */
    public void mo26625u0(C10381g gVar, Runnable runnable) {
        if (!this.f28172o.post(runnable)) {
            m36364y0(gVar, runnable);
        }
    }

    /* renamed from: v0 */
    public boolean mo26626v0(C10381g gVar) {
        return !this.f28174q || !C10457l.m35316a(Looper.myLooper(), this.f28172o.getLooper());
    }

    /* renamed from: z0 */
    public C10685a mo26627w0() {
        return this.f28175r;
    }
}
