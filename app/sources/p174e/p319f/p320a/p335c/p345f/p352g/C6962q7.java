package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.Comparator;

/* renamed from: e.f.a.c.f.g.q7 */
final class C6962q7 implements Comparator {
    C6962q7() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C7106z7 z7Var = (C7106z7) obj;
        C7106z7 z7Var2 = (C7106z7) obj2;
        C6946p7 p7Var = new C6946p7(z7Var);
        C6946p7 p7Var2 = new C6946p7(z7Var2);
        while (p7Var.hasNext() && p7Var2.hasNext()) {
            int compareTo = Integer.valueOf(p7Var.zza() & 255).compareTo(Integer.valueOf(p7Var2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(z7Var.mo20156h()).compareTo(Integer.valueOf(z7Var2.mo20156h()));
    }
}
