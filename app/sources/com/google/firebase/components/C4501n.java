package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.n */
public final class C4501n<T> {

    /* renamed from: a */
    private final Set<Class<? super T>> f12809a;

    /* renamed from: b */
    private final Set<C4518u> f12810b;

    /* renamed from: c */
    private final int f12811c;

    /* renamed from: d */
    private final int f12812d;

    /* renamed from: e */
    private final C4509q<T> f12813e;

    /* renamed from: f */
    private final Set<Class<?>> f12814f;

    /* renamed from: com.google.firebase.components.n$b */
    public static class C4503b<T> {

        /* renamed from: a */
        private final Set<Class<? super T>> f12815a;

        /* renamed from: b */
        private final Set<C4518u> f12816b;

        /* renamed from: c */
        private int f12817c;

        /* renamed from: d */
        private int f12818d;

        /* renamed from: e */
        private C4509q<T> f12819e;

        /* renamed from: f */
        private Set<Class<?>> f12820f;

        @SafeVarargs
        private C4503b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f12815a = hashSet;
            this.f12816b = new HashSet();
            this.f12817c = 0;
            this.f12818d = 0;
            this.f12820f = new HashSet();
            C4489d0.m17108c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> c : clsArr) {
                C4489d0.m17108c(c, "Null interface");
            }
            Collections.addAll(this.f12815a, clsArr);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C4503b<T> m17135f() {
            this.f12818d = 1;
            return this;
        }

        /* renamed from: g */
        private C4503b<T> m17136g(int i) {
            C4489d0.m17109d(this.f12817c == 0, "Instantiation type has already been set.");
            this.f12817c = i;
            return this;
        }

        /* renamed from: h */
        private void m17137h(Class<?> cls) {
            C4489d0.m17106a(!this.f12815a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C4503b<T> mo14031b(C4518u uVar) {
            C4489d0.m17108c(uVar, "Null dependency");
            m17137h(uVar.mo14053c());
            this.f12816b.add(uVar);
            return this;
        }

        /* renamed from: c */
        public C4501n<T> mo14032c() {
            C4489d0.m17109d(this.f12819e != null, "Missing required property: factory.");
            return new C4501n(new HashSet(this.f12815a), new HashSet(this.f12816b), this.f12817c, this.f12818d, this.f12819e, this.f12820f);
        }

        /* renamed from: d */
        public C4503b<T> mo14033d() {
            return m17136g(2);
        }

        /* renamed from: e */
        public C4503b<T> mo14034e(C4509q<T> qVar) {
            this.f12819e = (C4509q) C4489d0.m17108c(qVar, "Null factory");
            return this;
        }
    }

    private C4501n(Set<Class<? super T>> set, Set<C4518u> set2, int i, int i2, C4509q<T> qVar, Set<Class<?>> set3) {
        this.f12809a = Collections.unmodifiableSet(set);
        this.f12810b = Collections.unmodifiableSet(set2);
        this.f12811c = i;
        this.f12812d = i2;
        this.f12813e = qVar;
        this.f12814f = Collections.unmodifiableSet(set3);
    }

    /* renamed from: a */
    public static <T> C4503b<T> m17120a(Class<T> cls) {
        return new C4503b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: b */
    public static <T> C4503b<T> m17121b(Class<T> cls, Class<? super T>... clsArr) {
        return new C4503b<>(cls, clsArr);
    }

    /* renamed from: g */
    public static <T> C4501n<T> m17122g(T t, Class<T> cls) {
        return m17123h(cls).mo14034e(new C4482a(t)).mo14032c();
    }

    /* renamed from: h */
    public static <T> C4503b<T> m17123h(Class<T> cls) {
        return m17120a(cls).m17135f();
    }

    /* renamed from: l */
    static /* synthetic */ Object m17124l(Object obj, C4504o oVar) {
        return obj;
    }

    /* renamed from: m */
    static /* synthetic */ Object m17125m(Object obj, C4504o oVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: n */
    public static <T> C4501n<T> m17126n(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m17121b(cls, clsArr).mo14034e(new C4484b(t)).mo14032c();
    }

    /* renamed from: c */
    public Set<C4518u> mo14023c() {
        return this.f12810b;
    }

    /* renamed from: d */
    public C4509q<T> mo14024d() {
        return this.f12813e;
    }

    /* renamed from: e */
    public Set<Class<? super T>> mo14025e() {
        return this.f12809a;
    }

    /* renamed from: f */
    public Set<Class<?>> mo14026f() {
        return this.f12814f;
    }

    /* renamed from: i */
    public boolean mo14027i() {
        return this.f12811c == 1;
    }

    /* renamed from: j */
    public boolean mo14028j() {
        return this.f12811c == 2;
    }

    /* renamed from: k */
    public boolean mo14029k() {
        return this.f12812d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f12809a.toArray()) + ">{" + this.f12811c + ", type=" + this.f12812d + ", deps=" + Arrays.toString(this.f12810b.toArray()) + "}";
    }
}
