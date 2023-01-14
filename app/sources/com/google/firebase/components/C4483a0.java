package com.google.firebase.components;

import com.google.firebase.p162p.C4927b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.components.a0 */
class C4483a0<T> implements C4927b<Set<T>> {

    /* renamed from: a */
    private volatile Set<C4927b<T>> f12778a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f12779b = null;

    C4483a0(Collection<C4927b<T>> collection) {
        this.f12778a.addAll(collection);
    }

    /* renamed from: b */
    static C4483a0<?> m17094b(Collection<C4927b<?>> collection) {
        return new C4483a0<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m17095d() {
        for (C4927b<T> bVar : this.f12778a) {
            this.f12779b.add(bVar.get());
        }
        this.f12778a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo14009a(C4927b<T> bVar) {
        Set set;
        T t;
        if (this.f12779b == null) {
            set = this.f12778a;
            t = bVar;
        } else {
            set = this.f12779b;
            t = bVar.get();
        }
        set.add(t);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f12779b == null) {
            synchronized (this) {
                if (this.f12779b == null) {
                    this.f12779b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m17095d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f12779b);
    }
}
