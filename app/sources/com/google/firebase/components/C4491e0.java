package com.google.firebase.components;

import com.google.firebase.p160n.C4907a;
import com.google.firebase.p160n.C4909c;
import com.google.firebase.p162p.C4925a;
import com.google.firebase.p162p.C4927b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.components.e0 */
final class C4491e0 extends C4500m {

    /* renamed from: a */
    private final Set<Class<?>> f12789a;

    /* renamed from: b */
    private final Set<Class<?>> f12790b;

    /* renamed from: c */
    private final Set<Class<?>> f12791c;

    /* renamed from: d */
    private final Set<Class<?>> f12792d;

    /* renamed from: e */
    private final Set<Class<?>> f12793e;

    /* renamed from: f */
    private final Set<Class<?>> f12794f;

    /* renamed from: g */
    private final C4504o f12795g;

    /* renamed from: com.google.firebase.components.e0$a */
    private static class C4492a implements C4909c {

        /* renamed from: a */
        private final Set<Class<?>> f12796a;

        /* renamed from: b */
        private final C4909c f12797b;

        public C4492a(Set<Class<?>> set, C4909c cVar) {
            this.f12796a = set;
            this.f12797b = cVar;
        }

        /* renamed from: b */
        public void mo14018b(C4907a<?> aVar) {
            if (this.f12796a.contains(aVar.mo14910b())) {
                this.f12797b.mo14018b(aVar);
            } else {
                throw new C4520w(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    C4491e0(C4501n<?> nVar, C4504o oVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C4518u next : nVar.mo14023c()) {
            if (next.mo14055e()) {
                boolean g = next.mo14058g();
                Class<?> c = next.mo14053c();
                if (g) {
                    hashSet4.add(c);
                } else {
                    hashSet.add(c);
                }
            } else if (next.mo14054d()) {
                hashSet3.add(next.mo14053c());
            } else {
                boolean g2 = next.mo14058g();
                Class<?> c2 = next.mo14053c();
                if (g2) {
                    hashSet5.add(c2);
                } else {
                    hashSet2.add(c2);
                }
            }
        }
        if (!nVar.mo14026f().isEmpty()) {
            hashSet.add(C4909c.class);
        }
        this.f12789a = Collections.unmodifiableSet(hashSet);
        this.f12790b = Collections.unmodifiableSet(hashSet2);
        this.f12791c = Collections.unmodifiableSet(hashSet3);
        this.f12792d = Collections.unmodifiableSet(hashSet4);
        this.f12793e = Collections.unmodifiableSet(hashSet5);
        this.f12794f = nVar.mo14026f();
        this.f12795g = oVar;
    }

    /* renamed from: a */
    public <T> T mo14013a(Class<T> cls) {
        if (this.f12789a.contains(cls)) {
            T a = this.f12795g.mo14013a(cls);
            return !cls.equals(C4909c.class) ? a : new C4492a(this.f12794f, (C4909c) a);
        }
        throw new C4520w(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C4927b<T> mo14014b(Class<T> cls) {
        if (this.f12790b.contains(cls)) {
            return this.f12795g.mo14014b(cls);
        }
        throw new C4520w(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C4927b<Set<T>> mo14015c(Class<T> cls) {
        if (this.f12793e.contains(cls)) {
            return this.f12795g.mo14015c(cls);
        }
        throw new C4520w(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo14016d(Class<T> cls) {
        if (this.f12792d.contains(cls)) {
            return this.f12795g.mo14016d(cls);
        }
        throw new C4520w(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: e */
    public <T> C4925a<T> mo14017e(Class<T> cls) {
        if (this.f12791c.contains(cls)) {
            return this.f12795g.mo14017e(cls);
        }
        throw new C4520w(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
