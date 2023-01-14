package p174e.p319f.p416e.p432w.p433d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p174e.p319f.p416e.p432w.C9763a;

/* renamed from: e.f.e.w.d.b */
final class C9767b {

    /* renamed from: a */
    private final Map<Integer, Integer> f26165a = new HashMap();

    C9767b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo24442a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f26165a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C9763a.m33284b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24443b(int i) {
        Integer num = this.f26165a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f26165a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
