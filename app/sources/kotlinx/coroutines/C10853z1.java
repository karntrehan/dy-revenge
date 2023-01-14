package kotlinx.coroutines;

import kotlinx.coroutines.internal.C10748j;
import kotlinx.coroutines.internal.C10750l;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.z1 */
public final class C10853z1 extends C10748j implements C10727i1 {
    /* renamed from: b */
    public boolean mo26676b() {
        return true;
    }

    /* renamed from: c */
    public C10853z1 mo26677c() {
        return this;
    }

    /* renamed from: t */
    public final String mo26885t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (C10750l lVar = (C10750l) mo26727l(); !C10457l.m35316a(lVar, this); lVar = lVar.mo26728m()) {
            if (lVar instanceof C10832t1) {
                C10832t1 t1Var = (C10832t1) lVar;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(t1Var);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        C10457l.m35319d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String toString() {
        return C10819p0.m36783c() ? mo26885t("Active") : super.toString();
    }
}
