package com.facebook.hermes.intl;

import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.c */
public interface C2321c {

    /* renamed from: com.facebook.hermes.intl.c$a */
    static /* synthetic */ class C2322a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6901a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6902b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6903c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
                com.facebook.hermes.intl.c$b[] r0 = com.facebook.hermes.intl.C2321c.C2323b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6903c = r0
                r1 = 1
                com.facebook.hermes.intl.c$b r2 = com.facebook.hermes.intl.C2321c.C2323b.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6903c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.hermes.intl.c$b r3 = com.facebook.hermes.intl.C2321c.C2323b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6903c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.hermes.intl.c$b r4 = com.facebook.hermes.intl.C2321c.C2323b.FALSE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.facebook.hermes.intl.c$d[] r3 = com.facebook.hermes.intl.C2321c.C2325d.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6902b = r3
                com.facebook.hermes.intl.c$d r4 = com.facebook.hermes.intl.C2321c.C2325d.SORT     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f6902b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.facebook.hermes.intl.c$d r4 = com.facebook.hermes.intl.C2321c.C2325d.SEARCH     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.facebook.hermes.intl.c$c[] r3 = com.facebook.hermes.intl.C2321c.C2324c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6901a = r3
                com.facebook.hermes.intl.c$c r4 = com.facebook.hermes.intl.C2321c.C2324c.BASE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f6901a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.facebook.hermes.intl.c$c r3 = com.facebook.hermes.intl.C2321c.C2324c.ACCENT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f6901a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.CASE     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f6901a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.VARIANT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f6901a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.facebook.hermes.intl.c$c r1 = com.facebook.hermes.intl.C2321c.C2324c.LOCALE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2321c.C2322a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$b */
    public enum C2323b {
        UPPER,
        LOWER,
        FALSE;

        public String toString() {
            int i = C2322a.f6903c[ordinal()];
            if (i == 1) {
                return "upper";
            }
            if (i == 2) {
                return "lower";
            }
            if (i == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$c */
    public enum C2324c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        public String toString() {
            int i = C2322a.f6901a[ordinal()];
            if (i == 1) {
                return "base";
            }
            if (i == 2) {
                return "accent";
            }
            if (i == 3) {
                return "case";
            }
            if (i == 4) {
                return "variant";
            }
            if (i == 5) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$d */
    public enum C2325d {
        SORT,
        SEARCH;

        public String toString() {
            int i = C2322a.f6902b[ordinal()];
            if (i == 1) {
                return "sort";
            }
            if (i == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    int mo7940a(String str, String str2);

    /* renamed from: b */
    C2321c mo7941b(C2320b<?> bVar);

    /* renamed from: c */
    C2324c mo7942c();

    /* renamed from: d */
    C2321c mo7943d(C2323b bVar);

    /* renamed from: e */
    C2321c mo7944e(boolean z);

    /* renamed from: f */
    C2321c mo7945f(C2324c cVar);

    /* renamed from: g */
    C2321c mo7946g(boolean z);
}
