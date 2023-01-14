package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.p155l.C4875a;
import com.google.firebase.p160n.C4909c;
import com.google.firebase.p160n.C4910d;
import com.google.firebase.p162p.C4925a;
import com.google.firebase.p162p.C4927b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.components.s */
public class C4511s extends C4500m implements C4875a {

    /* renamed from: a */
    private static final C4927b<Set<Object>> f12824a = C4496i.f12804a;

    /* renamed from: b */
    private final Map<C4501n<?>, C4927b<?>> f12825b;

    /* renamed from: c */
    private final Map<Class<?>, C4927b<?>> f12826c;

    /* renamed from: d */
    private final Map<Class<?>, C4483a0<?>> f12827d;

    /* renamed from: e */
    private final List<C4927b<C4510r>> f12828e;

    /* renamed from: f */
    private final C4521x f12829f;

    /* renamed from: g */
    private final AtomicReference<Boolean> f12830g;

    /* renamed from: com.google.firebase.components.s$b */
    public static final class C4513b {

        /* renamed from: a */
        private final Executor f12831a;

        /* renamed from: b */
        private final List<C4927b<C4510r>> f12832b = new ArrayList();

        /* renamed from: c */
        private final List<C4501n<?>> f12833c = new ArrayList();

        C4513b(Executor executor) {
            this.f12831a = executor;
        }

        /* renamed from: e */
        static /* synthetic */ C4510r m17174e(C4510r rVar) {
            return rVar;
        }

        /* renamed from: a */
        public C4513b mo14040a(C4501n<?> nVar) {
            this.f12833c.add(nVar);
            return this;
        }

        /* renamed from: b */
        public C4513b mo14041b(C4510r rVar) {
            this.f12832b.add(new C4490e(rVar));
            return this;
        }

        /* renamed from: c */
        public C4513b mo14042c(Collection<C4927b<C4510r>> collection) {
            this.f12832b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C4511s mo14043d() {
            return new C4511s(this.f12831a, this.f12832b, this.f12833c);
        }
    }

    private C4511s(Executor executor, Iterable<C4927b<C4510r>> iterable, Collection<C4501n<?>> collection) {
        this.f12825b = new HashMap();
        this.f12826c = new HashMap();
        this.f12827d = new HashMap();
        this.f12830g = new AtomicReference<>();
        C4521x xVar = new C4521x(executor);
        this.f12829f = xVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4501n.m17126n(xVar, C4521x.class, C4910d.class, C4909c.class));
        arrayList.add(C4501n.m17126n(this, C4875a.class, new Class[0]));
        for (C4501n next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f12828e = m17159j(iterable);
        m17157g(arrayList);
    }

    /* renamed from: f */
    public static C4513b m17156f(Executor executor) {
        return new C4513b(executor);
    }

    /* renamed from: g */
    private void m17157g(List<C4501n<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C4927b<C4510r>> it = this.f12828e.iterator();
            while (it.hasNext()) {
                try {
                    C4510r rVar = (C4510r) it.next().get();
                    if (rVar != null) {
                        list.addAll(rVar.getComponents());
                        it.remove();
                    }
                } catch (C4522y e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f12825b.isEmpty()) {
                C4514t.m17179a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f12825b.keySet());
                arrayList2.addAll(list);
                C4514t.m17179a(arrayList2);
            }
            for (C4501n next : list) {
                this.f12825b.put(next, new C4523z(new C4488d(this, next)));
            }
            arrayList.addAll(m17165q(list));
            arrayList.addAll(m17166r());
            m17164p();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m17163o();
    }

    /* renamed from: h */
    private void m17158h(Map<C4501n<?>, C4927b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C4501n nVar = (C4501n) next.getKey();
            C4927b bVar = (C4927b) next.getValue();
            if (nVar.mo14027i() || (nVar.mo14028j() && z)) {
                bVar.get();
            }
        }
        this.f12829f.mo14062c();
    }

    /* renamed from: j */
    private static <T> List<T> m17159j(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object mo14039l(C4501n nVar) {
        return nVar.mo14024d().mo14005a(new C4491e0(nVar, this));
    }

    /* renamed from: o */
    private void m17163o() {
        Boolean bool = this.f12830g.get();
        if (bool != null) {
            m17158h(this.f12825b, bool.booleanValue());
        }
    }

    /* renamed from: p */
    private void m17164p() {
        Map map;
        Class<?> c;
        Object b;
        for (C4501n next : this.f12825b.keySet()) {
            Iterator<C4518u> it = next.mo14023c().iterator();
            while (true) {
                if (it.hasNext()) {
                    C4518u next2 = it.next();
                    if (next2.mo14058g() && !this.f12827d.containsKey(next2.mo14053c())) {
                        map = this.f12827d;
                        c = next2.mo14053c();
                        b = C4483a0.m17094b(Collections.emptySet());
                    } else if (this.f12826c.containsKey(next2.mo14053c())) {
                        continue;
                    } else if (next2.mo14057f()) {
                        throw new C4485b0(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo14053c()}));
                    } else if (!next2.mo14058g()) {
                        map = this.f12826c;
                        c = next2.mo14053c();
                        b = C4487c0.m17099b();
                    }
                    map.put(c, b);
                }
            }
        }
    }

    /* renamed from: q */
    private List<Runnable> m17165q(List<C4501n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C4501n next : list) {
            if (next.mo14029k()) {
                C4927b bVar = this.f12825b.get(next);
                for (Class cls : next.mo14025e()) {
                    if (!this.f12826c.containsKey(cls)) {
                        this.f12826c.put(cls, bVar);
                    } else {
                        arrayList.add(new C4494g((C4487c0) this.f12826c.get(cls), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    private List<Runnable> m17166r() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f12825b.entrySet()) {
            C4501n nVar = (C4501n) next.getKey();
            if (!nVar.mo14029k()) {
                C4927b bVar = (C4927b) next.getValue();
                for (Class cls : nVar.mo14025e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f12827d.containsKey(entry.getKey())) {
                this.f12827d.put((Class) entry.getKey(), C4483a0.m17094b((Collection) entry.getValue()));
            } else {
                C4483a0 a0Var = this.f12827d.get(entry.getKey());
                for (C4927b fVar : (Set) entry.getValue()) {
                    arrayList.add(new C4493f(a0Var, fVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo14013a(Class cls) {
        return super.mo14013a(cls);
    }

    /* renamed from: b */
    public synchronized <T> C4927b<T> mo14014b(Class<T> cls) {
        C4489d0.m17108c(cls, "Null interface requested.");
        return this.f12826c.get(cls);
    }

    /* renamed from: c */
    public synchronized <T> C4927b<Set<T>> mo14015c(Class<T> cls) {
        C4483a0 a0Var = this.f12827d.get(cls);
        if (a0Var != null) {
            return a0Var;
        }
        return f12824a;
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ Set mo14016d(Class cls) {
        return super.mo14016d(cls);
    }

    /* renamed from: e */
    public <T> C4925a<T> mo14017e(Class<T> cls) {
        C4927b<T> b = mo14014b(cls);
        return b == null ? C4487c0.m17099b() : b instanceof C4487c0 ? (C4487c0) b : C4487c0.m17103f(b);
    }

    /* renamed from: i */
    public void mo14038i(boolean z) {
        HashMap hashMap;
        if (this.f12830g.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f12825b);
            }
            m17158h(hashMap, z);
        }
    }
}
