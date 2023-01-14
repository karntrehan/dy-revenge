package com.google.firebase.p160n;

import com.google.firebase.components.C4489d0;

/* renamed from: com.google.firebase.n.a */
public class C4907a<T> {

    /* renamed from: a */
    private final Class<T> f13764a;

    /* renamed from: b */
    private final T f13765b;

    public C4907a(Class<T> cls, T t) {
        this.f13764a = (Class) C4489d0.m17107b(cls);
        this.f13765b = C4489d0.m17107b(t);
    }

    /* renamed from: a */
    public T mo14909a() {
        return this.f13765b;
    }

    /* renamed from: b */
    public Class<T> mo14910b() {
        return this.f13764a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f13764a, this.f13765b});
    }
}
