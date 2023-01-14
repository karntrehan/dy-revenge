package p455g.p459d0;

import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p027c.p028a.C1444j;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: g.d0.i */
class C10290i extends C10289h {

    /* renamed from: g.d0.i$a */
    static final class C10291a extends C10458m implements C10430l<String, String> {

        /* renamed from: f */
        public static final C10291a f27525f = new C10291a();

        C10291a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C10457l.m35320e(str, "line");
            return str;
        }
    }

    /* renamed from: g.d0.i$b */
    static final class C10292b extends C10458m implements C10430l<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f27526f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10292b(String str) {
            super(1);
            this.f27526f = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C10457l.m35320e(str, "line");
            return this.f27526f + str;
        }
    }

    /* renamed from: b */
    private static final C10430l<String, String> m34912b(String str) {
        return str.length() == 0 ? C10291a.f27525f : new C10292b(str);
    }

    /* renamed from: c */
    private static final int m34913c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C10281b.m34865c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m34914d(String str, String str2) {
        String invoke;
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "newIndent");
        List<String> Z = C10300q.m34969Z(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : Z) {
            if (!C10299p.m34931q((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10351m.m35147p(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m34913c(c)));
        }
        Integer num = (Integer) C10358t.m35163J(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * Z.size());
        C10430l<String, String> b = m34912b(str2);
        int h = C10350l.m35139h(Z);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : Z) {
            int i2 = i + 1;
            if (i < 0) {
                C10350l.m35146o();
            }
            String str3 = (String) next2;
            if ((i == 0 || i == h) && C10299p.m34931q(str3)) {
                str3 = null;
            } else {
                String F0 = C10305s.m35001F0(str3, intValue);
                if (!(F0 == null || (invoke = b.invoke(F0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C10358t.m35159F(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C10430l) null, C1444j.f4266N0, (Object) null)).toString();
        C10457l.m35319d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static final String m34915e(String str, String str2, String str3) {
        int i;
        String invoke;
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "newIndent");
        C10457l.m35320e(str3, "marginPrefix");
        if (!C10299p.m34931q(str3)) {
            List<String> Z = C10300q.m34969Z(str);
            int length = str.length() + (str2.length() * Z.size());
            C10430l<String, String> b = m34912b(str2);
            int h = C10350l.m35139h(Z);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : Z) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C10350l.m35146o();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i2 == 0 || i2 == h) && C10299p.m34931q(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C10281b.m34865c(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C10299p.m34925A(str4, str3, i, false, 4, (Object) null)) {
                            C10457l.m35318c(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            C10457l.m35319d(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (invoke = b.invoke(str5)) == null)) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C10358t.m35159F(arrayList, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C10430l) null, C1444j.f4266N0, (Object) null)).toString();
            C10457l.m35319d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m34916f(String str) {
        C10457l.m35320e(str, "<this>");
        return m34914d(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: g */
    public static final String m34917g(String str, String str2) {
        C10457l.m35320e(str, "<this>");
        C10457l.m35320e(str2, "marginPrefix");
        return m34915e(str, HttpUrl.FRAGMENT_ENCODE_SET, str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m34918h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m34917g(str, str2);
    }
}
