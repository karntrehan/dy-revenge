package p174e.p319f.p320a.p382e.p383a.p384a;

import android.content.Context;
import p174e.p319f.p320a.p382e.p383a.p387d.C9151a;

/* renamed from: e.f.a.e.a.a.x */
public final /* synthetic */ class C9098x {

    /* renamed from: a */
    private static C9100z f24979a;

    /* renamed from: a */
    static synchronized C9100z m30316a(Context context) {
        C9100z zVar;
        synchronized (C9098x.class) {
            if (f24979a == null) {
                C9099y yVar = new C9099y((byte[]) null);
                yVar.mo23078b(new C9083i(C9151a.m30446b(context)));
                f24979a = yVar.mo23077a();
            }
            zVar = f24979a;
        }
        return zVar;
    }
}
