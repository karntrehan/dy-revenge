package kotlinx.coroutines.internal;

import p455g.p462v.C10376d;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C10737f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C10763v f28229a = new C10763v("UNDEFINED");

    /* renamed from: b */
    public static final C10763v f28230b = new C10763v("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.mo26679B0() != false) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m36509b(p455g.p462v.C10376d<? super T> r6, java.lang.Object r7, p455g.p470y.p471c.C10430l<? super java.lang.Throwable, p455g.C10323s> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C10736e
            if (r0 == 0) goto L_0x00ba
            kotlinx.coroutines.internal.e r6 = (kotlinx.coroutines.internal.C10736e) r6
            java.lang.Object r8 = kotlinx.coroutines.C10695c0.m36407b(r7, r8)
            kotlinx.coroutines.f0 r0 = r6.f28225r
            g.v.g r1 = r6.mo25781a()
            boolean r0 = r0.mo26626v0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f28227t = r8
            r6.f28386p = r1
            kotlinx.coroutines.f0 r7 = r6.f28225r
            g.v.g r8 = r6.mo25781a()
            r7.mo26625u0(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = kotlinx.coroutines.C10819p0.m36781a()
            kotlinx.coroutines.f2 r0 = kotlinx.coroutines.C10711f2.f28192a
            kotlinx.coroutines.a1 r0 = r0.mo26664a()
            boolean r2 = r0.mo26609C0()
            if (r2 == 0) goto L_0x003f
            r6.f28227t = r8
            r6.f28386p = r1
            r0.mo26614y0(r6)
            goto L_0x00bd
        L_0x003f:
            r0.mo26608A0(r1)
            r2 = 0
            g.v.g r3 = r6.mo25781a()     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.n1$b r4 = kotlinx.coroutines.C10812n1.f28353n     // Catch:{ all -> 0x00ad }
            g.v.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.n1 r3 = (kotlinx.coroutines.C10812n1) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.mo26647b()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.mo26810E()     // Catch:{ all -> 0x00ad }
            r6.mo26707b(r8, r3)     // Catch:{ all -> 0x00ad }
            g.m$a r8 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p455g.C10318n.m35016a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p455g.C10315m.m35012a(r8)     // Catch:{ all -> 0x00ad }
            r6.mo25782d(r8)     // Catch:{ all -> 0x00ad }
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            g.v.d<T> r8 = r6.f28226s     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f28228u     // Catch:{ all -> 0x00ad }
            g.v.g r4 = r8.mo25781a()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = kotlinx.coroutines.internal.C10767z.m36612c(r4, r3)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.v r5 = kotlinx.coroutines.internal.C10767z.f28271a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            kotlinx.coroutines.h2 r8 = kotlinx.coroutines.C10703e0.m36422e(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            g.v.d<T> r5 = r6.f28226s     // Catch:{ all -> 0x0099 }
            r5.mo25782d(r7)     // Catch:{ all -> 0x0099 }
            g.s r7 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.mo26679B0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            kotlinx.coroutines.internal.C10767z.m36610a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.mo26679B0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            kotlinx.coroutines.internal.C10767z.m36610a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.mo26611E0()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.mo26869n(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.mo26613w0(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.mo26613w0(r1)
            throw r6
        L_0x00ba:
            r6.mo25782d(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10737f.m36509b(g.v.d, java.lang.Object, g.y.c.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m36510c(C10376d dVar, Object obj, C10430l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m36509b(dVar, obj, lVar);
    }
}
