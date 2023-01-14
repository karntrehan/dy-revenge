package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.o0 */
final class C4412o0 {

    /* renamed from: a */
    private final Map<String, Double> f12600a = new HashMap();

    C4412o0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo13901a(String str) {
        this.f12600a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized double mo13902b(String str) {
        Double d = this.f12600a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double mo13903c(String str, C4365c1 c1Var) {
        double d;
        d = (((double) ((C4388i0) c1Var).f12502g) + 1.0d) / ((double) ((C4388i0) c1Var).f12503h);
        this.f12600a.put(str, Double.valueOf(d));
        return d;
    }
}
