package p174e.p319f.p320a.p335c.p345f.p352g;

import android.util.Log;

/* renamed from: e.f.a.c.f.g.n6 */
final class C6913n6 extends C7041v6 {
    C6913n6(C6977r6 r6Var, String str, Long l, boolean z) {
        super(r6Var, str, l, true, (C7009t6) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19989a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.mo20383c();
            Log.e("PhenotypeFlag", "Invalid long value for " + c + ": " + ((String) obj));
            return null;
        }
    }
}
