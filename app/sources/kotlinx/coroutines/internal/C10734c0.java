package kotlinx.coroutines.internal;

import kotlinx.coroutines.C10705e2;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.c0 */
final class C10734c0 {

    /* renamed from: a */
    public final C10381g f28219a;

    /* renamed from: b */
    private final Object[] f28220b;

    /* renamed from: c */
    private final C10705e2<Object>[] f28221c;

    /* renamed from: d */
    private int f28222d;

    public C10734c0(C10381g gVar, int i) {
        this.f28219a = gVar;
        this.f28220b = new Object[i];
        this.f28221c = new C10705e2[i];
    }

    /* renamed from: a */
    public final void mo26704a(C10705e2<?> e2Var, Object obj) {
        Object[] objArr = this.f28220b;
        int i = this.f28222d;
        objArr[i] = obj;
        C10705e2<Object>[] e2VarArr = this.f28221c;
        this.f28222d = i + 1;
        e2VarArr[i] = e2Var;
    }

    /* renamed from: b */
    public final void mo26705b(C10381g gVar) {
        int length = this.f28221c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C10705e2<Object> e2Var = this.f28221c[length];
                C10457l.m35317b(e2Var);
                e2Var.mo26660X(gVar, this.f28220b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
