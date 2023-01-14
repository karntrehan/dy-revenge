package kotlinx.coroutines;

import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.c */
public abstract class C10694c<T> extends C10835u1 implements C10812n1, C10376d<T>, C10784l0 {

    /* renamed from: o */
    private final C10381g f28184o;

    public C10694c(C10381g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo26844R((C10812n1) gVar.get(C10812n1.f28353n));
        }
        this.f28184o = gVar.plus(this);
    }

    /* renamed from: A0 */
    public final <R> void mo26644A0(C10810n0 n0Var, R r, C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar) {
        n0Var.mo26807g(pVar, r, this);
    }

    /* renamed from: Q */
    public final void mo26645Q(Throwable th) {
        C10721h0.m36450a(this.f28184o, th);
    }

    /* renamed from: Y */
    public String mo26646Y() {
        String b = C10703e0.m36419b(this.f28184o);
        if (b == null) {
            return super.mo26646Y();
        }
        return '\"' + b + "\":" + super.mo26646Y();
    }

    /* renamed from: a */
    public final C10381g mo25781a() {
        return this.f28184o;
    }

    /* renamed from: b */
    public boolean mo26647b() {
        return super.mo26647b();
    }

    /* renamed from: d */
    public final void mo25782d(Object obj) {
        Object U = mo26845U(C10695c0.m36409d(obj, (C10430l) null, 1, (Object) null));
        if (U != C10841v1.f28388b) {
            mo26651x0(U);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public final void mo26648d0(Object obj) {
        if (obj instanceof C10848y) {
            C10848y yVar = (C10848y) obj;
            mo26652y0(yVar.f28406b, yVar.mo26877a());
            return;
        }
        mo26653z0(obj);
    }

    /* renamed from: f */
    public C10381g mo26649f() {
        return this.f28184o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public String mo26650x() {
        return C10457l.m35326k(C10822q0.m36786a(this), " was cancelled");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo26651x0(Object obj) {
        mo26754s(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo26652y0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo26653z0(T t) {
    }
}
