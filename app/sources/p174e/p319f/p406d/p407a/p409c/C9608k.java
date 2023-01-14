package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p319f.p320a.p335c.p362h.C8941a;
import p174e.p319f.p320a.p335c.p362h.C8943b;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;
import p174e.p319f.p320a.p335c.p362h.C8969o;
import p174e.p319f.p406d.p407a.C9585a;

/* renamed from: e.f.d.a.c.k */
public abstract class C9608k {
    @RecentlyNonNull

    /* renamed from: a */
    protected final C9612o f25701a = new C9612o();

    /* renamed from: b */
    private final AtomicInteger f25702b = new AtomicInteger(0);

    /* renamed from: c */
    private final AtomicBoolean f25703c = new AtomicBoolean(false);

    @RecentlyNonNull
    /* renamed from: a */
    public <T> C8963l<T> mo24100a(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<T> callable, @RecentlyNonNull C8941a aVar) {
        C3705r.m14349n(this.f25702b.get() > 0);
        if (aVar.mo22752a()) {
            return C8969o.m29865d();
        }
        C8943b bVar = new C8943b();
        C8965m mVar = new C8965m(bVar.mo22756b());
        this.f25701a.mo24106a(new C9594b0(executor, aVar, bVar, mVar), new C9592a0(this, aVar, bVar, callable, mVar));
        return mVar.mo22782a();
    }

    /* renamed from: b */
    public abstract void mo14956b();

    /* renamed from: c */
    public void mo24101c() {
        this.f25702b.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo14957d();

    /* renamed from: e */
    public void mo24102e(@RecentlyNonNull Executor executor) {
        C3705r.m14349n(this.f25702b.get() > 0);
        this.f25701a.mo24106a(executor, new C9624z(this));
    }

    /* renamed from: f */
    public final /* synthetic */ void mo24103f(@RecentlyNonNull C8941a aVar, @RecentlyNonNull C8943b bVar, @RecentlyNonNull Callable callable, @RecentlyNonNull C8965m mVar) {
        if (aVar.mo22752a()) {
            bVar.mo22755a();
            return;
        }
        try {
            if (!this.f25703c.get()) {
                mo14956b();
                this.f25703c.set(true);
            }
            if (aVar.mo22752a()) {
                bVar.mo22755a();
                return;
            }
            Object call = callable.call();
            if (aVar.mo22752a()) {
                bVar.mo22755a();
            } else {
                mVar.mo22784c(call);
            }
        } catch (RuntimeException e) {
            throw new C9585a("Internal error has occurred when executing ML Kit tasks", 13, e);
        } catch (Exception e2) {
            if (aVar.mo22752a()) {
                bVar.mo22755a();
            } else {
                mVar.mo22783b(e2);
            }
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo24104g() {
        int decrementAndGet = this.f25702b.decrementAndGet();
        C3705r.m14349n(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            mo14957d();
            this.f25703c.set(false);
        }
    }
}
