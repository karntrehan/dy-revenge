package kotlinx.coroutines;

import kotlinx.coroutines.p507m2.C10796b;
import p455g.p462v.C10376d;
import p455g.p462v.C10377e;
import p455g.p462v.C10381g;
import p455g.p462v.p464k.p465a.C10400e;

/* renamed from: kotlinx.coroutines.e0 */
public final class C10703e0 {

    /* renamed from: a */
    private static final boolean f28186a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r0.equals("on") != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r0.equals(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) != false) goto L_0x0053;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C10764w.m36599d(r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0021
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0033
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0054
        L_0x0021:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0053
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            r0 = 1
        L_0x0054:
            f28186a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C10703e0.<clinit>():void");
    }

    /* renamed from: a */
    public static final C10707f0 m36418a() {
        return f28186a ? C10796b.f28317u : C10839v.f28383p;
    }

    /* renamed from: b */
    public static final String m36419b(C10381g gVar) {
        C10725i0 i0Var;
        String u0;
        if (!C10819p0.m36783c() || (i0Var = (C10725i0) gVar.get(C10725i0.f28209f)) == null) {
            return null;
        }
        C10777k0 k0Var = (C10777k0) gVar.get(C10777k0.f28281f);
        String str = "coroutine";
        if (!(k0Var == null || (u0 = k0Var.mo26762u0()) == null)) {
            str = u0;
        }
        return str + '#' + i0Var.mo26684u0();
    }

    /* renamed from: c */
    public static final C10381g m36420c(C10784l0 l0Var, C10381g gVar) {
        C10381g plus = l0Var.mo26649f().plus(gVar);
        C10381g plus2 = C10819p0.m36783c() ? plus.plus(new C10725i0(C10819p0.m36782b().incrementAndGet())) : plus;
        return (plus == C10846x0.m36935a() || plus.get(C10377e.f27571l) != null) ? plus2 : plus2.plus(C10846x0.m36935a());
    }

    /* renamed from: d */
    public static final C10723h2<?> m36421d(C10400e eVar) {
        while (!(eVar instanceof C10834u0) && (eVar = eVar.mo25789c()) != null) {
            if (eVar instanceof C10723h2) {
                return (C10723h2) eVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final C10723h2<?> m36422e(C10376d<?> dVar, C10381g gVar, Object obj) {
        if (!(dVar instanceof C10400e)) {
            return null;
        }
        if (!(gVar.get(C10728i2.f28211f) != null)) {
            return null;
        }
        C10723h2<?> d = m36421d((C10400e) dVar);
        if (d != null) {
            d.mo26680C0(gVar, obj);
        }
        return d;
    }
}
