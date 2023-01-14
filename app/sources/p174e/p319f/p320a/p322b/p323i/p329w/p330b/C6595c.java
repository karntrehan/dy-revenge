package p174e.p319f.p320a.p322b.p323i.p329w.p330b;

import p174e.p319f.p320a.p322b.p323i.p329w.C6592a;

/* renamed from: e.f.a.b.i.w.b.c */
public final class C6595c<T> implements C6594b<T>, C6592a<T> {

    /* renamed from: a */
    private static final C6595c<Object> f18221a = new C6595c<>((Object) null);

    /* renamed from: b */
    private final T f18222b;

    private C6595c(T t) {
        this.f18222b = t;
    }

    /* renamed from: a */
    public static <T> C6594b<T> m25197a(T t) {
        return new C6595c(C6596d.m25200c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f18222b;
    }
}
