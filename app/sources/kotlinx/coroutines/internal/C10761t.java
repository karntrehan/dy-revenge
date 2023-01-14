package kotlinx.coroutines.internal;

import kotlinx.coroutines.C10694c;
import kotlinx.coroutines.C10695c0;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.internal.t */
public class C10761t<T> extends C10694c<T> implements C10400e {

    /* renamed from: p */
    public final C10376d<T> f28266p;

    public C10761t(C10381g gVar, C10376d<? super T> dVar) {
        super(gVar, true, true);
        this.f28266p = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final boolean mo26753S() {
        return true;
    }

    /* renamed from: c */
    public final C10400e mo25789c() {
        C10376d<T> dVar = this.f28266p;
        if (dVar instanceof C10400e) {
            return (C10400e) dVar;
        }
        return null;
    }

    /* renamed from: g */
    public final StackTraceElement mo25790g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26754s(Object obj) {
        C10737f.m36510c(C10392c.m35241b(this.f28266p), C10695c0.m36406a(obj, this.f28266p), (C10430l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo26651x0(Object obj) {
        C10376d<T> dVar = this.f28266p;
        dVar.mo25782d(C10695c0.m36406a(obj, dVar));
    }
}
