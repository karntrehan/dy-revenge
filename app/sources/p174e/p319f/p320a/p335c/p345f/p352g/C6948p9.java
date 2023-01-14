package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Collections;
import java.util.List;

/* renamed from: e.f.a.c.f.g.p9 */
final class C6948p9 extends C7012t9 {

    /* renamed from: c */
    private static final Class f18797c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C6948p9(C6932o9 o9Var) {
        super((C6996s9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20082a(Object obj, long j) {
        Object obj2;
        List list = (List) C7014tb.m26620k(obj, j);
        if (list instanceof C6916n9) {
            obj2 = ((C6916n9) list).mo19953c();
        } else if (!f18797c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C6917na) || !(list instanceof C6804g9)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C6804g9 g9Var = (C6804g9) list;
                if (g9Var.mo19801a()) {
                    g9Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C7014tb.m26633x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: e.f.a.c.f.g.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: e.f.a.c.f.g.m9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: e.f.a.c.f.g.m9} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20083b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26620k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6916n9
            if (r2 == 0) goto L_0x0020
            e.f.a.c.f.g.m9 r1 = new e.f.a.c.f.g.m9
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6917na
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6804g9
            if (r2 == 0) goto L_0x0030
            e.f.a.c.f.g.g9 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6804g9) r1
            e.f.a.c.f.g.g9 r0 = r1.mo19570f(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class r2 = f18797c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6934ob
            if (r2 == 0) goto L_0x006f
            e.f.a.c.f.g.m9 r2 = new e.f.a.c.f.g.m9
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            e.f.a.c.f.g.ob r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6934ob) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6917na
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p352g.C6804g9
            if (r2 == 0) goto L_0x008a
            r2 = r1
            e.f.a.c.f.g.g9 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6804g9) r2
            boolean r3 = r2.mo19801a()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            e.f.a.c.f.g.g9 r1 = r2.mo19570f(r1)
            goto L_0x0035
        L_0x008a:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0099
            if (r2 <= 0) goto L_0x0099
            r1.addAll(r6)
        L_0x0099:
            if (r0 > 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r6 = r1
        L_0x009d:
            p174e.p319f.p320a.p335c.p345f.p352g.C7014tb.m26633x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6948p9.mo20083b(java.lang.Object, java.lang.Object, long):void");
    }
}
