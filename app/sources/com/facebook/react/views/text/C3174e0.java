package com.facebook.react.views.text;

import java.text.BreakIterator;

/* renamed from: com.facebook.react.views.text.e0 */
public enum C3174e0 {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;

    /* renamed from: com.facebook.react.views.text.e0$a */
    static /* synthetic */ class C3175a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8884a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.views.text.e0[] r0 = com.facebook.react.views.text.C3174e0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8884a = r0
                com.facebook.react.views.text.e0 r1 = com.facebook.react.views.text.C3174e0.UPPERCASE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8884a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.views.text.e0 r1 = com.facebook.react.views.text.C3174e0.LOWERCASE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8884a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.views.text.e0 r1 = com.facebook.react.views.text.C3174e0.CAPITALIZE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3174e0.C3175a.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static String m12453e(String str, C3174e0 e0Var) {
        if (str == null) {
            return null;
        }
        int i = C3175a.f8884a[e0Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? str : m12454g(str) : str.toLowerCase() : str.toUpperCase();
    }

    /* renamed from: g */
    private static String m12454g(String str) {
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        while (true) {
            int i = first;
            first = wordInstance.next();
            if (first == -1) {
                return sb.toString();
            }
            String substring = str.substring(i, first);
            if (Character.isLetterOrDigit(substring.charAt(0))) {
                sb.append(Character.toUpperCase(substring.charAt(0)));
                substring = substring.substring(1).toLowerCase();
            }
            sb.append(substring);
        }
    }
}
