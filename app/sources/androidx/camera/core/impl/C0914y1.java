package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.camera.core.impl.y1 */
public abstract class C0914y1<C> {

    /* renamed from: a */
    private Set<C> f2618a = new HashSet();

    /* renamed from: a */
    public void mo3169a(List<C> list) {
        this.f2618a.addAll(list);
    }

    /* renamed from: b */
    public abstract C0914y1<C> clone();

    /* renamed from: c */
    public List<C> mo3170c() {
        return Collections.unmodifiableList(new ArrayList(this.f2618a));
    }
}
