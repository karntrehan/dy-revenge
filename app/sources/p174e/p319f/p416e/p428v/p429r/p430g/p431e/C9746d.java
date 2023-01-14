package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.d */
final class C9746d extends C9750h {
    C9746d(C9679a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo24396d() {
        if (mo24401c().mo24254j() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo24397f(sb, 8);
            int f = mo24400b().mo24424f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo24400b().mo24424f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo24400b().mo24423c(60, (String) null).mo24414b());
            return sb.toString();
        }
        throw C9664j.m32854a();
    }
}
