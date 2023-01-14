package p174e.p247e.p249b.p250a;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import p174e.p247e.p253d.p264k.C6107c;

/* renamed from: e.e.b.a.e */
public final class C6000e {
    /* renamed from: a */
    public static String m22616a(C5999d dVar) {
        try {
            return dVar instanceof C6001f ? m22618c(((C6001f) dVar).mo17921d().get(0)) : m22618c(dVar);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static List<String> m22617b(C5999d dVar) {
        ArrayList arrayList;
        try {
            if (dVar instanceof C6001f) {
                List<C5999d> d = ((C6001f) dVar).mo17921d();
                arrayList = new ArrayList(d.size());
                for (int i = 0; i < d.size(); i++) {
                    arrayList.add(m22618c(d.get(i)));
                }
            } else {
                arrayList = new ArrayList(1);
                arrayList.add(dVar.mo17919b() ? dVar.mo17920c() : m22618c(dVar));
            }
            return arrayList;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static String m22618c(C5999d dVar) {
        return C6107c.m22992a(dVar.mo17920c().getBytes("UTF-8"));
    }
}
