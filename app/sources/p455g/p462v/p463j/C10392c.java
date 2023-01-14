package p455g.p462v.p463j;

import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.C10381g;
import p455g.p462v.C10387h;
import p455g.p462v.p464k.p465a.C10396a;
import p455g.p462v.p464k.p465a.C10399d;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p462v.p464k.p465a.C10406j;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10443a0;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.j.c */
class C10392c {

    /* renamed from: g.v.j.c$a */
    public static final class C10393a extends C10406j {

        /* renamed from: o */
        private int f27582o;

        /* renamed from: p */
        final /* synthetic */ C10434p f27583p;

        /* renamed from: q */
        final /* synthetic */ Object f27584q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10393a(C10376d dVar, C10434p pVar, Object obj) {
            super(dVar);
            this.f27583p = pVar;
            this.f27584q = obj;
            C10457l.m35318c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Object mo15707n(Object obj) {
            int i = this.f27582o;
            if (i == 0) {
                this.f27582o = 1;
                C10318n.m35017b(obj);
                C10457l.m35318c(this.f27583p, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C10434p) C10443a0.m35295c(this.f27583p, 2)).mo15709j(this.f27584q, this);
            } else if (i == 1) {
                this.f27582o = 2;
                C10318n.m35017b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: g.v.j.c$b */
    public static final class C10394b extends C10399d {

        /* renamed from: q */
        private int f27585q;

        /* renamed from: r */
        final /* synthetic */ C10434p f27586r;

        /* renamed from: s */
        final /* synthetic */ Object f27587s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10394b(C10376d dVar, C10381g gVar, C10434p pVar, Object obj) {
            super(dVar, gVar);
            this.f27586r = pVar;
            this.f27587s = obj;
            C10457l.m35318c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public Object mo15707n(Object obj) {
            int i = this.f27585q;
            if (i == 0) {
                this.f27585q = 1;
                C10318n.m35017b(obj);
                C10457l.m35318c(this.f27586r, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((C10434p) C10443a0.m35295c(this.f27586r, 2)).mo15709j(this.f27587s, this);
            } else if (i == 1) {
                this.f27585q = 2;
                C10318n.m35017b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C10376d<C10323s> m35240a(C10434p<? super R, ? super C10376d<? super T>, ? extends Object> pVar, R r, C10376d<? super T> dVar) {
        C10457l.m35320e(pVar, "<this>");
        C10457l.m35320e(dVar, "completion");
        C10376d<? super T> a = C10403h.m35272a(dVar);
        if (pVar instanceof C10396a) {
            return ((C10396a) pVar).mo15708b(r, a);
        }
        C10381g a2 = a.mo25781a();
        return a2 == C10387h.f27574f ? new C10393a(a, pVar, r) : new C10394b(a, a2, pVar, r);
    }

    /* renamed from: b */
    public static <T> C10376d<T> m35241b(C10376d<? super T> dVar) {
        C10376d<Object> p;
        C10457l.m35320e(dVar, "<this>");
        C10399d dVar2 = dVar instanceof C10399d ? (C10399d) dVar : null;
        return (dVar2 == null || (p = dVar2.mo25796p()) == null) ? dVar : p;
    }
}
