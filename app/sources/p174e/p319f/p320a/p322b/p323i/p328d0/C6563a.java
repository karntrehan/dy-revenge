package p174e.p319f.p320a.p322b.p323i.p328d0;

import android.util.SparseArray;
import java.util.HashMap;
import p174e.p319f.p320a.p322b.C6465d;

/* renamed from: e.f.a.b.i.d0.a */
public final class C6563a {

    /* renamed from: a */
    private static SparseArray<C6465d> f18172a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<C6465d, Integer> f18173b;

    static {
        HashMap<C6465d, Integer> hashMap = new HashMap<>();
        f18173b = hashMap;
        hashMap.put(C6465d.DEFAULT, 0);
        f18173b.put(C6465d.VERY_LOW, 1);
        f18173b.put(C6465d.HIGHEST, 2);
        for (C6465d next : f18173b.keySet()) {
            f18172a.append(f18173b.get(next).intValue(), next);
        }
    }

    /* renamed from: a */
    public static int m25102a(C6465d dVar) {
        Integer num = f18173b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    /* renamed from: b */
    public static C6465d m25103b(int i) {
        C6465d dVar = f18172a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
