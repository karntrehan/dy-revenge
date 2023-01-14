package com.google.firebase.components;

import com.google.firebase.p160n.C4907a;
import com.google.firebase.p160n.C4908b;
import com.google.firebase.p160n.C4909c;
import com.google.firebase.p160n.C4910d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.x */
class C4521x implements C4910d, C4909c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C4908b<Object>, Executor>> f12843a = new HashMap();

    /* renamed from: b */
    private Queue<C4907a<?>> f12844b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f12845c;

    C4521x(Executor executor) {
        this.f12845c = executor;
    }

    /* renamed from: d */
    private synchronized Set<Map.Entry<C4908b<Object>, Executor>> m17201d(C4907a<?> aVar) {
        Map map;
        map = this.f12843a.get(aVar.mo14910b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* renamed from: a */
    public synchronized <T> void mo14061a(Class<T> cls, Executor executor, C4908b<? super T> bVar) {
        C4489d0.m17107b(cls);
        C4489d0.m17107b(bVar);
        C4489d0.m17107b(executor);
        if (!this.f12843a.containsKey(cls)) {
            this.f12843a.put(cls, new ConcurrentHashMap());
        }
        this.f12843a.get(cls).put(bVar, executor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r0.hasNext() == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new com.google.firebase.components.C4495h(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        r0 = m17201d(r5).iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14018b(com.google.firebase.p160n.C4907a<?> r5) {
        /*
            r4 = this;
            com.google.firebase.components.C4489d0.m17107b(r5)
            monitor-enter(r4)
            java.util.Queue<com.google.firebase.n.a<?>> r0 = r4.f12844b     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000d
            r0.add(r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            return
        L_0x000d:
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            java.util.Set r0 = r4.m17201d(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.firebase.components.h r3 = new com.google.firebase.components.h
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0016
        L_0x0031:
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C4521x.mo14018b(com.google.firebase.n.a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14062c() {
        Queue<C4907a<?>> queue;
        synchronized (this) {
            queue = this.f12844b;
            if (queue != null) {
                this.f12844b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C4907a b : queue) {
                mo14018b(b);
            }
        }
    }
}
