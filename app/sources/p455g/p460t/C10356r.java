package p455g.p460t;

import java.util.List;
import p455g.p456a0.C10243c;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.r */
class C10356r extends C10355q {
    /* renamed from: u */
    public static <T> List<T> m35152u(List<? extends T> list) {
        C10457l.m35320e(list, "<this>");
        return new C10340f0(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final int m35153v(List<?> list, int i) {
        if (new C10243c(0, C10350l.m35139h(list)).mo25559o(i)) {
            return C10350l.m35139h(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C10243c(0, C10350l.m35139h(list)) + "].");
    }
}
