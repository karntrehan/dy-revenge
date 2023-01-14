package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.core.impl.i2 */
public class C0823i2 {

    /* renamed from: a */
    private final List<C0817h2> f2447a;

    public C0823i2(List<C0817h2> list) {
        this.f2447a = new ArrayList(list);
    }

    /* renamed from: a */
    public boolean mo3014a(Class<? extends C0817h2> cls) {
        for (C0817h2 h2Var : this.f2447a) {
            if (cls.isAssignableFrom(h2Var.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public <T extends C0817h2> T mo3015b(Class<T> cls) {
        Iterator<C0817h2> it = this.f2447a.iterator();
        while (it.hasNext()) {
            T t = (C0817h2) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
