package p174e.p319f.p320a.p382e.p383a.p386c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9125m;
import p174e.p319f.p320a.p382e.p383a.p387d.C9151a;

/* renamed from: e.f.a.e.a.c.c */
public abstract class C9150c<StateT> {

    /* renamed from: a */
    protected final C9101a f25025a;

    /* renamed from: b */
    private final IntentFilter f25026b;

    /* renamed from: c */
    private final Context f25027c;

    /* renamed from: d */
    protected final Set<C9148a<StateT>> f25028d = new HashSet();

    /* renamed from: e */
    private C9149b f25029e = null;

    /* renamed from: f */
    private volatile boolean f25030f = false;

    protected C9150c(C9101a aVar, IntentFilter intentFilter, Context context) {
        this.f25025a = aVar;
        this.f25026b = intentFilter;
        this.f25027c = C9151a.m30446b(context);
    }

    /* renamed from: b */
    private final void m30438b() {
        C9149b bVar;
        if ((this.f25030f || !this.f25028d.isEmpty()) && this.f25029e == null) {
            C9149b bVar2 = new C9149b(this);
            this.f25029e = bVar2;
            this.f25027c.registerReceiver(bVar2, this.f25026b);
        }
        if (!this.f25030f && this.f25028d.isEmpty() && (bVar = this.f25029e) != null) {
            this.f25027c.unregisterReceiver(bVar);
            this.f25029e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13911a(Context context, Intent intent);

    /* renamed from: c */
    public final synchronized void mo23121c(boolean z) {
        this.f25030f = z;
        m30438b();
    }

    /* renamed from: d */
    public final synchronized void mo23122d(C9148a<StateT> aVar) {
        this.f25025a.mo23083d("registerListener", new Object[0]);
        C9125m.m30377c(aVar, "Registered Play Core listener should not be null.");
        this.f25028d.add(aVar);
        m30438b();
    }

    /* renamed from: e */
    public final synchronized void mo23123e(C9148a<StateT> aVar) {
        this.f25025a.mo23083d("unregisterListener", new Object[0]);
        C9125m.m30377c(aVar, "Unregistered Play Core listener should not be null.");
        this.f25028d.remove(aVar);
        m30438b();
    }

    /* renamed from: f */
    public final synchronized void mo23124f(StateT statet) {
        Iterator it = new HashSet(this.f25028d).iterator();
        while (it.hasNext()) {
            ((C9148a) it.next()).onStateUpdate(statet);
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo23125g() {
        return this.f25029e != null;
    }
}
