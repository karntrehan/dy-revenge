package p455g.p459d0;

import p455g.p470y.p472d.C10457l;

/* renamed from: g.d0.s */
class C10305s extends C10304r {
    /* renamed from: F0 */
    public static final String m35001F0(String str, int i) {
        C10457l.m35320e(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C10247f.m34828d(i, str.length()));
            C10457l.m35319d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: G0 */
    public static String m35002G0(String str, int i) {
        C10457l.m35320e(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, C10247f.m34828d(i, str.length()));
            C10457l.m35319d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
