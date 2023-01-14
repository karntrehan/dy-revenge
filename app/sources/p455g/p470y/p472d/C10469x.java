package p455g.p470y.p472d;

import p455g.p457b0.C10251c;
import p455g.p457b0.C10252d;
import p455g.p457b0.C10253e;
import p455g.p457b0.C10255g;

/* renamed from: g.y.d.x */
public class C10469x {
    /* renamed from: a */
    public C10253e mo25837a(C10454i iVar) {
        return iVar;
    }

    /* renamed from: b */
    public C10251c mo25838b(Class cls) {
        return new C10449e(cls);
    }

    /* renamed from: c */
    public C10252d mo25839c(Class cls, String str) {
        return new C10462q(cls, str);
    }

    /* renamed from: d */
    public C10255g mo25840d(C10459n nVar) {
        return nVar;
    }

    /* renamed from: e */
    public String mo25841e(C10453h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String mo25842f(C10458m mVar) {
        return mo25841e(mVar);
    }
}
