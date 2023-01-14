package kotlinx.coroutines;

import kotlinx.coroutines.p507m2.C10803i;
import p455g.p462v.C10376d;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.v0 */
public abstract class C10840v0<T> extends C10803i {

    /* renamed from: p */
    public int f28386p;

    public C10840v0(int i) {
        this.f28386p = i;
    }

    /* renamed from: b */
    public void mo26707b(Object obj, Throwable th) {
    }

    /* renamed from: f */
    public abstract C10376d<T> mo26708f();

    /* renamed from: h */
    public Throwable mo26818h(Object obj) {
        C10848y yVar = obj instanceof C10848y ? (C10848y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.f28406b;
    }

    /* renamed from: j */
    public <T> T mo26819j(Object obj) {
        return obj;
    }

    /* renamed from: n */
    public final void mo26869n(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C10248b.m34834a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C10457l.m35317b(th);
            C10721h0.m36450a(mo26708f().mo25781a(), new C10816o0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: o */
    public abstract Object mo26709o();

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        if (r4.mo26679B0() != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        if (r4.mo26679B0() != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = kotlinx.coroutines.C10819p0.m36781a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f28386p
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            kotlinx.coroutines.m2.j r0 = r10.f28334o
            g.v.d r1 = r10.mo26708f()     // Catch:{ all -> 0x00d4 }
            kotlinx.coroutines.internal.e r1 = (kotlinx.coroutines.internal.C10736e) r1     // Catch:{ all -> 0x00d4 }
            g.v.d<T> r2 = r1.f28226s     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r1.f28228u     // Catch:{ all -> 0x00d4 }
            g.v.g r3 = r2.mo25781a()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C10767z.m36612c(r3, r1)     // Catch:{ all -> 0x00d4 }
            kotlinx.coroutines.internal.v r4 = kotlinx.coroutines.internal.C10767z.f28271a     // Catch:{ all -> 0x00d4 }
            r5 = 0
            if (r1 == r4) goto L_0x0035
            kotlinx.coroutines.h2 r4 = kotlinx.coroutines.C10703e0.m36422e(r2, r3, r1)     // Catch:{ all -> 0x00d4 }
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            g.v.g r6 = r2.mo25781a()     // Catch:{ all -> 0x00c7 }
            java.lang.Object r7 = r10.mo26709o()     // Catch:{ all -> 0x00c7 }
            java.lang.Throwable r8 = r10.mo26818h(r7)     // Catch:{ all -> 0x00c7 }
            if (r8 != 0) goto L_0x0055
            int r9 = r10.f28386p     // Catch:{ all -> 0x00c7 }
            boolean r9 = kotlinx.coroutines.C10843w0.m36926b(r9)     // Catch:{ all -> 0x00c7 }
            if (r9 == 0) goto L_0x0055
            kotlinx.coroutines.n1$b r9 = kotlinx.coroutines.C10812n1.f28353n     // Catch:{ all -> 0x00c7 }
            g.v.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00c7 }
            kotlinx.coroutines.n1 r6 = (kotlinx.coroutines.C10812n1) r6     // Catch:{ all -> 0x00c7 }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            boolean r9 = r6.mo26647b()     // Catch:{ all -> 0x00c7 }
            if (r9 != 0) goto L_0x0085
            java.util.concurrent.CancellationException r6 = r6.mo26810E()     // Catch:{ all -> 0x00c7 }
            r10.mo26707b(r7, r6)     // Catch:{ all -> 0x00c7 }
            g.m$a r7 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00c7 }
            boolean r7 = kotlinx.coroutines.C10819p0.m36784d()     // Catch:{ all -> 0x00c7 }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r2 instanceof p455g.p462v.p464k.p465a.C10400e     // Catch:{ all -> 0x00c7 }
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r7 = r2
            g.v.k.a.e r7 = (p455g.p462v.p464k.p465a.C10400e) r7     // Catch:{ all -> 0x00c7 }
            java.lang.Throwable r6 = kotlinx.coroutines.internal.C10762u.m36593j(r6, r7)     // Catch:{ all -> 0x00c7 }
        L_0x0079:
            java.lang.Object r6 = p455g.C10318n.m35016a(r6)     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p455g.C10315m.m35012a(r6)     // Catch:{ all -> 0x00c7 }
        L_0x0081:
            r2.mo25782d(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x009d
        L_0x0085:
            if (r8 == 0) goto L_0x0092
            g.m$a r6 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p455g.C10318n.m35016a(r8)     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p455g.C10315m.m35012a(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x0081
        L_0x0092:
            java.lang.Object r6 = r10.mo26819j(r7)     // Catch:{ all -> 0x00c7 }
            g.m$a r7 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00c7 }
            java.lang.Object r6 = p455g.C10315m.m35012a(r6)     // Catch:{ all -> 0x00c7 }
            goto L_0x0081
        L_0x009d:
            g.s r2 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x00a7
            boolean r4 = r4.mo26679B0()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00aa
        L_0x00a7:
            kotlinx.coroutines.internal.C10767z.m36610a(r3, r1)     // Catch:{ all -> 0x00d4 }
        L_0x00aa:
            g.m$a r1 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00b4 }
            r0.mo26789a()     // Catch:{ all -> 0x00b4 }
            java.lang.Object r0 = p455g.C10315m.m35012a(r2)     // Catch:{ all -> 0x00b4 }
            goto L_0x00bf
        L_0x00b4:
            r0 = move-exception
            g.m$a r1 = p455g.C10315m.f27541f
            java.lang.Object r0 = p455g.C10318n.m35016a(r0)
            java.lang.Object r0 = p455g.C10315m.m35012a(r0)
        L_0x00bf:
            java.lang.Throwable r0 = p455g.C10315m.m35013b(r0)
            r10.mo26869n(r5, r0)
            goto L_0x00f3
        L_0x00c7:
            r2 = move-exception
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r4.mo26679B0()     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00d3
        L_0x00d0:
            kotlinx.coroutines.internal.C10767z.m36610a(r3, r1)     // Catch:{ all -> 0x00d4 }
        L_0x00d3:
            throw r2     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            g.m$a r2 = p455g.C10315m.f27541f     // Catch:{ all -> 0x00e1 }
            r0.mo26789a()     // Catch:{ all -> 0x00e1 }
            g.s r0 = p455g.C10323s.f27547a     // Catch:{ all -> 0x00e1 }
            java.lang.Object r0 = p455g.C10315m.m35012a(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ec
        L_0x00e1:
            r0 = move-exception
            g.m$a r2 = p455g.C10315m.f27541f
            java.lang.Object r0 = p455g.C10318n.m35016a(r0)
            java.lang.Object r0 = p455g.C10315m.m35012a(r0)
        L_0x00ec:
            java.lang.Throwable r0 = p455g.C10315m.m35013b(r0)
            r10.mo26869n(r1, r0)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10840v0.run():void");
    }
}
