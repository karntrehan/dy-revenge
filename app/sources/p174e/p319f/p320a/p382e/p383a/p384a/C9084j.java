package p174e.p319f.p320a.p382e.p383a.p384a;

import android.content.Context;
import p174e.p319f.p320a.p382e.p383a.p385b.C9106c0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9127n;
import p174e.p319f.p320a.p382e.p383a.p388e.C9152a;

/* renamed from: e.f.a.e.a.a.j */
public final class C9084j implements C9106c0<C9075b> {

    /* renamed from: a */
    private final C9106c0 f24937a;

    /* renamed from: b */
    private final /* synthetic */ int f24938b = 0;

    public C9084j(C9106c0<C9081g> c0Var) {
        this.f24937a = c0Var;
    }

    public C9084j(C9106c0<Context> c0Var, byte[] bArr) {
        this.f24937a = c0Var;
    }

    public C9084j(C9106c0<Context> c0Var, char[] cArr) {
        this.f24937a = c0Var;
    }

    public C9084j(C9106c0<Context> c0Var, short[] sArr) {
        this.f24937a = c0Var;
    }

    /* renamed from: b */
    public static C9084j m30273b(C9106c0<Context> c0Var) {
        return new C9084j(c0Var, (short[]) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13826a() {
        int i = this.f24938b;
        if (i != 0) {
            return i != 1 ? i != 2 ? new C9152a((Context) this.f24937a.mo13826a()) : new C9094t(((C9085k) this.f24937a).mo13826a()) : new C9079e(((C9085k) this.f24937a).mo13826a());
        }
        C9081g gVar = (C9081g) this.f24937a.mo13826a();
        C9127n.m30388d(gVar);
        return gVar;
    }
}
