package p174e.p199d.p218c.p242x;

import java.util.ArrayList;
import java.util.Arrays;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.x.b */
public class C5943b<T extends C5722b> extends C5739i<C5945d> {
    public C5943b(C5945d dVar) {
        super(dVar);
    }

    /* renamed from: v */
    private String m22480v() {
        String[] s = ((C5945d) this.f16215a).mo17154s(3);
        if (s == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : s) {
            String a = C5944c.m22484a(1, str);
            if (a != null) {
                str = a;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    /* renamed from: w */
    private String m22481w() {
        Long m = ((C5945d) this.f16215a).mo17149m(259);
        if (m == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf((int) (((double) m.longValue()) / Math.pow(60.0d, 2.0d)));
        Integer valueOf2 = Integer.valueOf((int) ((((double) m.longValue()) / Math.pow(60.0d, 1.0d)) - ((double) (valueOf.intValue() * 60))));
        return String.format("%1$02d:%2$02d:%3$02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) Math.ceil((((double) m.longValue()) / Math.pow(60.0d, 0.0d)) - ((double) (valueOf2.intValue() * 60))))});
    }

    /* renamed from: x */
    private String m22482x() {
        byte[] e = ((C5945d) this.f16215a).mo17141e(1);
        if (e == null) {
            return null;
        }
        return C5944c.m22484a(1, new String(e));
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 1 ? i != 3 ? i != 259 ? ((C5945d) this.f16215a).mo17153r(i) : m22481w() : m22480v() : m22482x();
    }
}
