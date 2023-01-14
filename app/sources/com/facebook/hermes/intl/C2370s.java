package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C2321c;
import java.text.RuleBasedCollator;

/* renamed from: com.facebook.hermes.intl.s */
public class C2370s implements C2321c {

    /* renamed from: a */
    private RuleBasedCollator f7069a;

    /* renamed from: b */
    private C2363n f7070b;

    /* renamed from: com.facebook.hermes.intl.s$a */
    static /* synthetic */ class C2371a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7071a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.hermes.intl.c$c[] r0 = com.facebook.hermes.intl.C2321c.C2324c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7071a = r0
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.BASE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7071a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.ACCENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7071a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.VARIANT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7071a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.CASE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2370s.C2371a.<clinit>():void");
        }
    }

    C2370s() {
    }

    /* renamed from: a */
    public int mo7940a(String str, String str2) {
        return this.f7069a.compare(str, str2);
    }

    /* renamed from: b */
    public C2321c mo7941b(C2320b<?> bVar) {
        C2363n nVar = (C2363n) bVar;
        this.f7070b = nVar;
        this.f7069a = (RuleBasedCollator) RuleBasedCollator.getInstance(nVar.mo7939h());
        return this;
    }

    /* renamed from: c */
    public C2321c.C2324c mo7942c() {
        RuleBasedCollator ruleBasedCollator = this.f7069a;
        if (ruleBasedCollator == null) {
            return C2321c.C2324c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        return strength == 0 ? C2321c.C2324c.BASE : strength == 1 ? C2321c.C2324c.ACCENT : C2321c.C2324c.VARIANT;
    }

    /* renamed from: d */
    public C2321c mo7943d(C2321c.C2323b bVar) {
        return this;
    }

    /* renamed from: e */
    public C2321c mo7944e(boolean z) {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r4 != 4) goto L_0x0027;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.hermes.intl.C2321c mo7945f(com.facebook.hermes.intl.C2321c.C2324c r4) {
        /*
            r3 = this;
            int[] r0 = com.facebook.hermes.intl.C2370s.C2371a.f7071a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0022
            r2 = 2
            if (r4 == r2) goto L_0x001c
            r1 = 3
            if (r4 == r1) goto L_0x0016
            r1 = 4
            if (r4 == r1) goto L_0x0022
            goto L_0x0027
        L_0x0016:
            java.text.RuleBasedCollator r4 = r3.f7069a
            r4.setStrength(r2)
            goto L_0x0027
        L_0x001c:
            java.text.RuleBasedCollator r4 = r3.f7069a
            r4.setStrength(r1)
            goto L_0x0027
        L_0x0022:
            java.text.RuleBasedCollator r4 = r3.f7069a
            r4.setStrength(r0)
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2370s.mo7945f(com.facebook.hermes.intl.c$c):com.facebook.hermes.intl.c");
    }

    /* renamed from: g */
    public C2321c mo7946g(boolean z) {
        return this;
    }
}
