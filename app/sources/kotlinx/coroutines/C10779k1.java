package kotlinx.coroutines;

import p455g.C10323s;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.k1 */
final class C10779k1 extends C10783l {

    /* renamed from: f */
    private final C10430l<Throwable, C10323s> f28283f;

    public C10779k1(C10430l<? super Throwable, C10323s> lVar) {
        this.f28283f = lVar;
    }

    /* renamed from: a */
    public void mo26672a(Throwable th) {
        this.f28283f.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo26672a((Throwable) obj);
        return C10323s.f27547a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C10822q0.m36786a(this.f28283f) + '@' + C10822q0.m36787b(this) + ']';
    }
}
