package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: e.f.a.c.f.m.rb */
public final class C8819rb {

    /* renamed from: a */
    private final String f24062a = "\n";

    private C8819rb(String str) {
    }

    /* renamed from: a */
    public static C8819rb m29648a(String str) {
        return new C8819rb("\n");
    }

    /* renamed from: c */
    static final CharSequence m29649c(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* renamed from: b */
    public final String mo22629b(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                CharSequence c = m29649c(it.next());
                while (true) {
                    sb.append(c);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(this.f24062a);
                    c = m29649c(it.next());
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
