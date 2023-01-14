package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Collections;
import java.util.List;

/* renamed from: e.f.a.c.f.l.ud */
final class C8492ud extends C8528wd {

    /* renamed from: c */
    private static final Class<?> f23127c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ C8492ud(C8474td tdVar) {
        super((C8474td) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22170a(Object obj, long j) {
        Object obj2;
        List list = (List) C8494uf.m29105k(obj, j);
        if (list instanceof C8456sd) {
            obj2 = ((C8456sd) list).mo22071c();
        } else if (!f23127c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C8439re) || !(list instanceof C8292jd)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C8292jd jdVar = (C8292jd) list;
                if (jdVar.mo21893a()) {
                    jdVar.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C8494uf.m29118x(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: e.f.a.c.f.l.rd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: e.f.a.c.f.l.rd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: e.f.a.c.f.l.rd} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void mo22171b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.m29105k(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.m29105k(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8456sd
            if (r2 == 0) goto L_0x0020
            e.f.a.c.f.l.rd r1 = new e.f.a.c.f.l.rd
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8439re
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8292jd
            if (r2 == 0) goto L_0x0030
            e.f.a.c.f.l.jd r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8292jd) r1
            e.f.a.c.f.l.jd r0 = r1.mo21793f(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.m29118x(r5, r7, r1)
            goto L_0x008a
        L_0x0039:
            java.lang.Class<?> r2 = f23127c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x0052:
            p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.m29118x(r5, r7, r2)
            r1 = r2
            goto L_0x008a
        L_0x0057:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8404pf
            if (r2 == 0) goto L_0x006f
            e.f.a.c.f.l.rd r2 = new e.f.a.c.f.l.rd
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            e.f.a.c.f.l.pf r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8404pf) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            goto L_0x0052
        L_0x006f:
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8439re
            if (r2 == 0) goto L_0x008a
            boolean r2 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8292jd
            if (r2 == 0) goto L_0x008a
            r2 = r1
            e.f.a.c.f.l.jd r2 = (p174e.p319f.p320a.p335c.p345f.p357l.C8292jd) r2
            boolean r3 = r2.mo21893a()
            if (r3 != 0) goto L_0x008a
            int r1 = r1.size()
            int r1 = r1 + r0
            e.f.a.c.f.l.jd r1 = r2.mo21793f(r1)
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
            p174e.p319f.p320a.p335c.p345f.p357l.C8494uf.m29118x(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8492ud.mo22171b(java.lang.Object, java.lang.Object, long):void");
    }
}
