package p174e.p199d.p217b;

import java.util.Iterator;

/* renamed from: e.d.b.r */
public final class C5717r {
    /* renamed from: a */
    public static String m21300a(Iterable<? extends CharSequence> iterable, String str) {
        int length = str.length();
        Iterator<? extends CharSequence> it = iterable.iterator();
        int i = 0;
        if (it.hasNext()) {
            i = 0 + ((CharSequence) it.next()).length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static <T extends CharSequence> String m21301b(T[] tArr, String str) {
        int length = str.length();
        int i = 0;
        for (T length2 : tArr) {
            i += length2.length() + length;
        }
        StringBuilder sb = new StringBuilder(i);
        boolean z = true;
        for (T t : tArr) {
            if (!z) {
                sb.append(str);
            } else {
                z = false;
            }
            sb.append(t);
        }
        return sb.toString();
    }
}
