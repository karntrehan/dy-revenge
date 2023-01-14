package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.r2 */
public final class C0873r2 {

    /* renamed from: a */
    private final List<C0879s2> f2542a = new ArrayList();

    /* renamed from: b */
    private static void m3461b(List<int[]> list, int i, int[] iArr, int i2) {
        boolean z;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = false;
                    break;
                } else if (i3 == iArr[i4]) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (!z) {
                iArr[i2] = i3;
                m3461b(list, i, iArr, i2 + 1);
            }
        }
    }

    /* renamed from: c */
    private List<int[]> m3462c(int i) {
        ArrayList arrayList = new ArrayList();
        m3461b(arrayList, i, new int[i], 0);
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo3094a(C0879s2 s2Var) {
        return this.f2542a.add(s2Var);
    }

    /* renamed from: d */
    public boolean mo3095d(List<C0879s2> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f2542a.size()) {
            return false;
        }
        Iterator<int[]> it = m3462c(this.f2542a.size()).iterator();
        while (it.hasNext()) {
            int[] next = it.next();
            int i = 0;
            boolean z = true;
            while (i < this.f2542a.size() && (next[i] >= list.size() || ((z = z & this.f2542a.get(i).mo3103d(list.get(next[i])))))) {
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
