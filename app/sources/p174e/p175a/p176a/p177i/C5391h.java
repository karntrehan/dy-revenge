package p174e.p175a.p176a.p177i;

/* renamed from: e.a.a.i.h */
public class C5391h {

    /* renamed from: a */
    private static boolean[] f15040a;

    /* renamed from: b */
    private static boolean[] f15041b;

    static {
        m19953b();
    }

    /* renamed from: a */
    static boolean m19952a(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        boolean z = true;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '-') {
                i2++;
                z = z && (i == 8 || i == 13 || i == 18 || i == 23);
            }
            i++;
        }
        return z && 4 == i2 && 36 == i;
    }

    /* renamed from: b */
    private static void m19953b() {
        f15041b = new boolean[256];
        f15040a = new boolean[256];
        char c = 0;
        while (true) {
            boolean[] zArr = f15041b;
            if (c < zArr.length) {
                boolean[] zArr2 = f15040a;
                boolean z = true;
                zArr2[c] = c == ':' || ('A' <= c && c <= 'Z') || c == '_' || (('a' <= c && c <= 'z') || ((192 <= c && c <= 214) || ((216 <= c && c <= 246) || (248 <= c && c <= 255))));
                if (!zArr2[c] && c != '-' && c != '.' && (('0' > c || c > '9') && c != 183)) {
                    z = false;
                }
                zArr[c] = z;
                c = (char) (c + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    static boolean m19954c(char c) {
        return ((c > 31 && c != 127) || c == 9 || c == 10 || c == 13) ? false : true;
    }

    /* renamed from: d */
    private static boolean m19955d(char c) {
        return (c <= 255 && f15041b[c]) || m19956e(c) || (c >= 768 && c <= 879) || (c >= 8255 && c <= 8256);
    }

    /* renamed from: e */
    private static boolean m19956e(char c) {
        return (c <= 255 && f15040a[c]) || (c >= 256 && c <= 767) || ((c >= 880 && c <= 893) || ((c >= 895 && c <= 8191) || ((c >= 8204 && c <= 8205) || ((c >= 8304 && c <= 8591) || ((c >= 11264 && c <= 12271) || ((c >= 12289 && c <= 55295) || ((c >= 63744 && c <= 64975) || ((c >= 65008 && c <= 65533) || (c >= 0 && c <= 65535)))))))));
    }

    /* renamed from: f */
    public static boolean m19957f(String str) {
        if (str.length() > 0 && !m19956e(str.charAt(0))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!m19955d(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m19958g(String str) {
        if (str.length() > 0 && (!m19956e(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!m19955d(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static String m19959h(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt == '-' || charAt == '_') {
                    stringBuffer.append('-');
                    i++;
                } else {
                    stringBuffer.append(i != 2 ? Character.toLowerCase(str.charAt(i2)) : Character.toUpperCase(str.charAt(i2)));
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: i */
    static String[] m19960i(String str) {
        int indexOf = str.indexOf(61);
        String substring = str.substring(str.charAt(1) == '?' ? 2 : 1, indexOf);
        int i = indexOf + 1;
        char charAt = str.charAt(i);
        int i2 = i + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == charAt) {
                i2++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }
}
