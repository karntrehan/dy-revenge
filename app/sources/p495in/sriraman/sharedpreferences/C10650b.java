package p495in.sriraman.sharedpreferences;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: in.sriraman.sharedpreferences.b */
public class C10650b {
    /* renamed from: a */
    public static void m36258a() {
        C10651c.m36265d().mo26510a();
    }

    /* renamed from: b */
    public static void m36259b(String str) {
        C10651c.m36265d().mo26511b(str);
    }

    /* renamed from: c */
    public static String[] m36260c() {
        ArrayList arrayList = new ArrayList(C10651c.m36265d().mo26512c().keySet());
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    /* renamed from: d */
    public static String[][] m36261d() {
        Map<String, ?> c = C10651c.m36265d().mo26512c();
        ArrayList arrayList = new ArrayList(c.keySet());
        int size = arrayList.size();
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = size;
        String[][] strArr = (String[][]) Array.newInstance(String.class, iArr);
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i][0] = (String) arrayList.get(i);
            strArr[i][1] = String.valueOf(c.get(arrayList.get(i)));
        }
        return strArr;
    }

    /* renamed from: e */
    public static String[][] m36262e(String[] strArr) {
        C10651c d = C10651c.m36265d();
        int length = strArr.length;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length;
        String[][] strArr2 = (String[][]) Array.newInstance(String.class, iArr);
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i][0] = strArr[i];
            strArr2[i][1] = String.valueOf(d.mo26513e(strArr[i]));
        }
        return strArr2;
    }

    /* renamed from: f */
    public static String m36263f(String str) {
        return C10651c.m36265d().mo26513e(str);
    }

    /* renamed from: g */
    public static void m36264g(String str, String str2) {
        C10651c.m36265d().mo26514g(str, str2);
    }
}
