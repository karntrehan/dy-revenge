package kotlinx.coroutines;

import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.z */
public final class C10851z {

    /* renamed from: a */
    public final Object f28407a;

    /* renamed from: b */
    public final C10430l<Throwable, C10323s> f28408b;

    public C10851z(Object obj, C10430l<? super Throwable, C10323s> lVar) {
        this.f28407a = obj;
        this.f28408b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10851z)) {
            return false;
        }
        C10851z zVar = (C10851z) obj;
        return C10457l.m35316a(this.f28407a, zVar.f28407a) && C10457l.m35316a(this.f28408b, zVar.f28408b);
    }

    public int hashCode() {
        Object obj = this.f28407a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f28408b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f28407a + ", onCancellation=" + this.f28408b + ')';
    }
}
