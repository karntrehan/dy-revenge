package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.f5 */
final class C3877f5 extends FutureTask implements Comparable {

    /* renamed from: f */
    private final long f10666f;

    /* renamed from: o */
    final boolean f10667o;

    /* renamed from: p */
    private final String f10668p;

    /* renamed from: q */
    final /* synthetic */ C3916i5 f10669q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3877f5(C3916i5 i5Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f10669q = i5Var;
        C3705r.m14346k(str);
        long andIncrement = C3916i5.f10782c.getAndIncrement();
        this.f10666f = andIncrement;
        this.f10668p = str;
        this.f10667o = z;
        if (andIncrement == Long.MAX_VALUE) {
            i5Var.f10651a.mo11935b().mo12544r().mo12476a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3877f5(C3916i5 i5Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f10669q = i5Var;
        C3705r.m14346k("Task exception on worker thread");
        long andIncrement = C3916i5.f10782c.getAndIncrement();
        this.f10666f = andIncrement;
        this.f10668p = "Task exception on worker thread";
        this.f10667o = z;
        if (andIncrement == Long.MAX_VALUE) {
            i5Var.f10651a.mo11935b().mo12544r().mo12476a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C3877f5 f5Var = (C3877f5) obj;
        boolean z = this.f10667o;
        if (z != f5Var.f10667o) {
            return !z ? 1 : -1;
        }
        int i = (this.f10666f > f5Var.f10666f ? 1 : (this.f10666f == f5Var.f10666f ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f10669q.f10651a.mo11935b().mo12546t().mo12477b("Two tasks share the same index. index", Long.valueOf(this.f10666f));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f10669q.f10651a.mo11935b().mo12544r().mo12477b(this.f10668p, th);
        super.setException(th);
    }
}
