package kotlinx.coroutines.p507m2;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C10716g1;
import kotlinx.coroutines.C10825r0;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.m2.c */
public class C10797c extends C10716g1 {

    /* renamed from: p */
    private final int f28319p;

    /* renamed from: q */
    private final int f28320q;

    /* renamed from: r */
    private final long f28321r;

    /* renamed from: s */
    private final String f28322s;

    /* renamed from: t */
    private C10791a f28323t;

    public C10797c(int i, int i2, long j, String str) {
        this.f28319p = i;
        this.f28320q = i2;
        this.f28321r = j;
        this.f28322s = str;
        this.f28323t = m36693w0();
    }

    public C10797c(int i, int i2, String str) {
        this(i, i2, C10806l.f28340e, str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10797c(int i, int i2, String str, int i3, C10452g gVar) {
        this((i3 & 1) != 0 ? C10806l.f28338c : i, (i3 & 2) != 0 ? C10806l.f28339d : i2, (i3 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    /* renamed from: w0 */
    private final C10791a m36693w0() {
        return new C10791a(this.f28319p, this.f28320q, this.f28321r, this.f28322s);
    }

    /* renamed from: u0 */
    public void mo26625u0(C10381g gVar, Runnable runnable) {
        try {
            C10791a.m36653A(this.f28323t, runnable, (C10804j) null, false, 6, (Object) null);
        } catch (RejectedExecutionException unused) {
            C10825r0.f28369t.mo26625u0(gVar, runnable);
        }
    }

    /* renamed from: x0 */
    public final void mo26787x0(Runnable runnable, C10804j jVar, boolean z) {
        try {
            this.f28323t.mo26775r(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C10825r0.f28369t.mo26630L0(this.f28323t.mo26772h(runnable, jVar));
        }
    }
}
