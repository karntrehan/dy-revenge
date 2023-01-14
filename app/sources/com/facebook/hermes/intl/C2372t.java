package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;
import com.facebook.hermes.intl.C2321c;

/* renamed from: com.facebook.hermes.intl.t */
public class C2372t implements C2321c {

    /* renamed from: a */
    private RuleBasedCollator f7072a = null;

    /* renamed from: com.facebook.hermes.intl.t$a */
    static /* synthetic */ class C2373a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7073a;

        /* renamed from: b */
        static final /* synthetic */ int[] f7074b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                com.facebook.hermes.intl.c$b[] r0 = com.facebook.hermes.intl.C2321c.C2323b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7074b = r0
                r1 = 1
                com.facebook.hermes.intl.c$b r2 = com.facebook.hermes.intl.C2321c.C2323b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7074b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.c$b r3 = com.facebook.hermes.intl.C2321c.C2323b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7074b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.c$b r4 = com.facebook.hermes.intl.C2321c.C2323b.FALSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.hermes.intl.c$c[] r3 = com.facebook.hermes.intl.C2321c.C2324c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7073a = r3
                com.facebook.hermes.intl.c$c r4 = com.facebook.hermes.intl.C2321c.C2324c.BASE     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7073a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.hermes.intl.c$c r3 = com.facebook.hermes.intl.C2321c.C2324c.ACCENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f7073a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.CASE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f7073a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.VARIANT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2372t.C2373a.<clinit>():void");
        }
    }

    C2372t() {
    }

    /* renamed from: a */
    public int mo7940a(String str, String str2) {
        return this.f7072a.compare(str, str2);
    }

    /* renamed from: b */
    public C2321c mo7941b(C2320b<?> bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) RuleBasedCollator.getInstance(((C2364o) bVar).mo7939h());
        this.f7072a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    /* renamed from: c */
    public C2321c.C2324c mo7942c() {
        RuleBasedCollator ruleBasedCollator = this.f7072a;
        if (ruleBasedCollator == null) {
            return C2321c.C2324c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? this.f7072a.isCaseLevel() ? C2321c.C2324c.CASE : C2321c.C2324c.BASE : strength == 1 ? C2321c.C2324c.ACCENT : C2321c.C2324c.VARIANT;
    }

    /* renamed from: d */
    public C2321c mo7943d(C2321c.C2323b bVar) {
        int i = C2373a.f7074b[bVar.ordinal()];
        if (i == 1) {
            this.f7072a.setUpperCaseFirst(true);
        } else if (i != 2) {
            this.f7072a.setCaseFirstDefault();
        } else {
            this.f7072a.setLowerCaseFirst(true);
        }
        return this;
    }

    /* renamed from: e */
    public C2321c mo7944e(boolean z) {
        if (z) {
            this.f7072a.setNumericCollation(C2350g.m9718e(Boolean.TRUE));
        }
        return this;
    }

    /* renamed from: f */
    public C2321c mo7945f(C2321c.C2324c cVar) {
        int i = C2373a.f7073a[cVar.ordinal()];
        if (i == 1) {
            this.f7072a.setStrength(0);
        } else if (i == 2) {
            this.f7072a.setStrength(1);
        } else if (i == 3) {
            this.f7072a.setStrength(0);
            this.f7072a.setCaseLevel(true);
        } else if (i == 4) {
            this.f7072a.setStrength(2);
        }
        return this;
    }

    /* renamed from: g */
    public C2321c mo7946g(boolean z) {
        if (z) {
            this.f7072a.setAlternateHandlingShifted(true);
        }
        return this;
    }
}
