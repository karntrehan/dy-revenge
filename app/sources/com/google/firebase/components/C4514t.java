package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.t */
class C4514t {

    /* renamed from: com.google.firebase.components.t$b */
    private static class C4516b {

        /* renamed from: a */
        private final C4501n<?> f12834a;

        /* renamed from: b */
        private final Set<C4516b> f12835b = new HashSet();

        /* renamed from: c */
        private final Set<C4516b> f12836c = new HashSet();

        C4516b(C4501n<?> nVar) {
            this.f12834a = nVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo14044a(C4516b bVar) {
            this.f12835b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo14045b(C4516b bVar) {
            this.f12836c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C4501n<?> mo14046c() {
            return this.f12834a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C4516b> mo14047d() {
            return this.f12835b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo14048e() {
            return this.f12835b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo14049f() {
            return this.f12836c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo14050g(C4516b bVar) {
            this.f12836c.remove(bVar);
        }
    }

    /* renamed from: com.google.firebase.components.t$c */
    private static class C4517c {

        /* renamed from: a */
        private final Class<?> f12837a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f12838b;

        private C4517c(Class<?> cls, boolean z) {
            this.f12837a = cls;
            this.f12838b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4517c)) {
                return false;
            }
            C4517c cVar = (C4517c) obj;
            return cVar.f12837a.equals(this.f12837a) && cVar.f12838b == this.f12838b;
        }

        public int hashCode() {
            return ((this.f12837a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f12838b).hashCode();
        }
    }

    /* renamed from: a */
    static void m17179a(List<C4501n<?>> list) {
        Set<C4516b> c = m17181c(list);
        Set<C4516b> b = m17180b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C4516b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C4516b next2 : next.mo14047d()) {
                next2.mo14050g(next);
                if (next2.mo14049f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C4516b next3 : c) {
                if (!next3.mo14049f() && !next3.mo14048e()) {
                    arrayList.add(next3.mo14046c());
                }
            }
            throw new C4519v(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C4516b> m17180b(Set<C4516b> set) {
        HashSet hashSet = new HashSet();
        for (C4516b next : set) {
            if (next.mo14049f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C4516b> m17181c(List<C4501n<?>> list) {
        Set<C4516b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C4501n next : list) {
            C4516b bVar = new C4516b(next);
            Iterator it = next.mo14025e().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C4517c cVar = new C4517c(cls, !next.mo14029k());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f12838b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C4516b> it2 : hashMap.values()) {
            for (C4516b bVar2 : it2) {
                for (C4518u next2 : bVar2.mo14046c().mo14023c()) {
                    if (next2.mo14055e() && (set = (Set) hashMap.get(new C4517c(next2.mo14053c(), next2.mo14058g()))) != null) {
                        for (C4516b bVar3 : set) {
                            bVar2.mo14044a(bVar3);
                            bVar3.mo14045b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
