package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.e.a.b.h */
final class C9115h extends C9103b {

    /* renamed from: o */
    final /* synthetic */ IBinder f24999o;

    /* renamed from: p */
    final /* synthetic */ C9119j f25000p;

    C9115h(C9119j jVar, IBinder iBinder) {
        this.f25000p = jVar;
        this.f24999o = iBinder;
    }

    /* renamed from: a */
    public final void mo13849a() {
        C9121k kVar = this.f25000p.f25002a;
        kVar.f25014l = (IInterface) kVar.f25010h.mo13918a(this.f24999o);
        C9121k.m30360j(this.f25000p.f25002a);
        this.f25000p.f25002a.f25008f = false;
        for (Runnable run : this.f25000p.f25002a.f25007e) {
            run.run();
        }
        this.f25000p.f25002a.f25007e.clear();
    }
}
