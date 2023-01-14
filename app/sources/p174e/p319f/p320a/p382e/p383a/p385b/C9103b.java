package p174e.p319f.p320a.p382e.p383a.p385b;

import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.b.b */
public abstract class C9103b implements Runnable {

    /* renamed from: f */
    private final C9165m<?> f24989f;

    C9103b() {
        this.f24989f = null;
    }

    public C9103b(C9165m<?> mVar) {
        this.f24989f = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13849a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C9165m<?> mo23085b() {
        return this.f24989f;
    }

    public final void run() {
        try {
            mo13849a();
        } catch (Exception e) {
            C9165m<?> mVar = this.f24989f;
            if (mVar != null) {
                mVar.mo23142d(e);
            }
        }
    }
}
