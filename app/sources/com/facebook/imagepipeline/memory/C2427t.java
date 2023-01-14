package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.t */
public abstract class C2427t<T> implements C2400c0<T> {

    /* renamed from: a */
    private final Set<T> f7206a = new HashSet();

    /* renamed from: b */
    private final C2411h<T> f7207b = new C2411h<>();

    /* renamed from: d */
    private T m10088d(T t) {
        if (t != null) {
            synchronized (this) {
                this.f7206a.remove(t);
            }
        }
        return t;
    }

    /* renamed from: b */
    public T mo8096b() {
        return m10088d(this.f7207b.mo8134f());
    }

    /* renamed from: c */
    public void mo8097c(T t) {
        boolean add;
        synchronized (this) {
            add = this.f7206a.add(t);
        }
        if (add) {
            this.f7207b.mo8133e(mo8095a(t), t);
        }
    }

    public T get(int i) {
        return m10088d(this.f7207b.mo8132a(i));
    }
}
