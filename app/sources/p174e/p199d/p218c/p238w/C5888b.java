package p174e.p199d.p218c.p238w;

import java.util.ArrayList;
import java.util.Arrays;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.w.b */
public class C5888b extends C5739i<C5890d> {
    public C5888b(C5890d dVar) {
        super(dVar);
    }

    /* renamed from: v */
    private String m22363v() {
        String[] s = ((C5890d) this.f16215a).mo17154s(4098);
        if (s == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : s) {
            String a = C5889c.m22367a(4096, str);
            if (a != null) {
                str = a;
            }
            arrayList.add(str);
        }
        return Arrays.toString(arrayList.toArray());
    }

    /* renamed from: w */
    private String m22364w() {
        Long m = ((C5890d) this.f16215a).mo17149m(259);
        if (m == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf((int) (((double) m.longValue()) / Math.pow(60.0d, 2.0d)));
        Integer valueOf2 = Integer.valueOf((int) ((((double) m.longValue()) / Math.pow(60.0d, 1.0d)) - ((double) (valueOf.intValue() * 60))));
        return String.format("%1$02d:%2$02d:%3$02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) Math.ceil((((double) m.longValue()) / Math.pow(60.0d, 0.0d)) - ((double) (valueOf2.intValue() * 60))))});
    }

    /* renamed from: x */
    private String m22365x() {
        byte[] e = ((C5890d) this.f16215a).mo17141e(4096);
        if (e == null) {
            return null;
        }
        return C5889c.m22367a(4096, new String(e));
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 259 ? i != 4096 ? i != 4098 ? super.mo17110f(i) : m22363v() : m22365x() : m22364w();
    }
}
