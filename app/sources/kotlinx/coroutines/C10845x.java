package kotlinx.coroutines;

import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.x */
final class C10845x {

    /* renamed from: a */
    public final Object f28395a;

    /* renamed from: b */
    public final C10783l f28396b;

    /* renamed from: c */
    public final C10430l<Throwable, C10323s> f28397c;

    /* renamed from: d */
    public final Object f28398d;

    /* renamed from: e */
    public final Throwable f28399e;

    public C10845x(Object obj, C10783l lVar, C10430l<? super Throwable, C10323s> lVar2, Object obj2, Throwable th) {
        this.f28395a = obj;
        this.f28396b = lVar;
        this.f28397c = lVar2;
        this.f28398d = obj2;
        this.f28399e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10845x(Object obj, C10783l lVar, C10430l lVar2, Object obj2, Throwable th, int i, C10452g gVar) {
        this(obj, (i & 2) != 0 ? null : lVar, (i & 4) != 0 ? null : lVar2, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C10845x m36931b(C10845x xVar, Object obj, C10783l lVar, C10430l<Throwable, C10323s> lVar2, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = xVar.f28395a;
        }
        if ((i & 2) != 0) {
            lVar = xVar.f28396b;
        }
        C10783l lVar3 = lVar;
        if ((i & 4) != 0) {
            lVar2 = xVar.f28397c;
        }
        C10430l<Throwable, C10323s> lVar4 = lVar2;
        if ((i & 8) != 0) {
            obj2 = xVar.f28398d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = xVar.f28399e;
        }
        return xVar.mo26871a(obj, lVar3, lVar4, obj4, th);
    }

    /* renamed from: a */
    public final C10845x mo26871a(Object obj, C10783l lVar, C10430l<? super Throwable, C10323s> lVar2, Object obj2, Throwable th) {
        return new C10845x(obj, lVar, lVar2, obj2, th);
    }

    /* renamed from: c */
    public final boolean mo26872c() {
        return this.f28399e != null;
    }

    /* renamed from: d */
    public final void mo26873d(C10815o<?> oVar, Throwable th) {
        C10783l lVar = this.f28396b;
        if (lVar != null) {
            oVar.mo26820r(lVar, th);
        }
        C10430l<Throwable, C10323s> lVar2 = this.f28397c;
        if (lVar2 != null) {
            oVar.mo26821s(lVar2, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10845x)) {
            return false;
        }
        C10845x xVar = (C10845x) obj;
        return C10457l.m35316a(this.f28395a, xVar.f28395a) && C10457l.m35316a(this.f28396b, xVar.f28396b) && C10457l.m35316a(this.f28397c, xVar.f28397c) && C10457l.m35316a(this.f28398d, xVar.f28398d) && C10457l.m35316a(this.f28399e, xVar.f28399e);
    }

    public int hashCode() {
        Object obj = this.f28395a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C10783l lVar = this.f28396b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        C10430l<Throwable, C10323s> lVar2 = this.f28397c;
        int hashCode3 = (hashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Object obj2 = this.f28398d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f28399e;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f28395a + ", cancelHandler=" + this.f28396b + ", onCancellation=" + this.f28397c + ", idempotentResume=" + this.f28398d + ", cancelCause=" + this.f28399e + ')';
    }
}
