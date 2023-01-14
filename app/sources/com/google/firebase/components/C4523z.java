package com.google.firebase.components;

import com.google.firebase.p162p.C4927b;

/* renamed from: com.google.firebase.components.z */
public class C4523z<T> implements C4927b<T> {

    /* renamed from: a */
    private static final Object f12846a = new Object();

    /* renamed from: b */
    private volatile Object f12847b = f12846a;

    /* renamed from: c */
    private volatile C4927b<T> f12848c;

    public C4523z(C4927b<T> bVar) {
        this.f12848c = bVar;
    }

    public T get() {
        T t = this.f12847b;
        T t2 = f12846a;
        if (t == t2) {
            synchronized (this) {
                t = this.f12847b;
                if (t == t2) {
                    t = this.f12848c.get();
                    this.f12847b = t;
                    this.f12848c = null;
                }
            }
        }
        return t;
    }
}
