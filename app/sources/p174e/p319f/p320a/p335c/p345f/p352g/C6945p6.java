package p174e.p319f.p320a.p335c.p345f.p352g;

import android.util.Log;

/* renamed from: e.f.a.c.f.g.p6 */
final class C6945p6 extends C7041v6 {
    C6945p6(C6977r6 r6Var, String str, Double d, boolean z) {
        super(r6Var, "measurement.test.double_flag", d, true, (C7009t6) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19989a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo20383c();
            Log.e("PhenotypeFlag", "Invalid double value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
