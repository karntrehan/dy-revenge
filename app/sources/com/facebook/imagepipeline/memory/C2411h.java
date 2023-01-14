package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: com.facebook.imagepipeline.memory.h */
public class C2411h<T> {

    /* renamed from: a */
    protected final SparseArray<C2413b<T>> f7184a = new SparseArray<>();

    /* renamed from: b */
    C2413b<T> f7185b;

    /* renamed from: c */
    C2413b<T> f7186c;

    /* renamed from: com.facebook.imagepipeline.memory.h$b */
    static class C2413b<I> {

        /* renamed from: a */
        C2413b<I> f7187a;

        /* renamed from: b */
        int f7188b;

        /* renamed from: c */
        LinkedList<I> f7189c;

        /* renamed from: d */
        C2413b<I> f7190d;

        private C2413b(C2413b<I> bVar, int i, LinkedList<I> linkedList, C2413b<I> bVar2) {
            this.f7187a = bVar;
            this.f7188b = i;
            this.f7189c = linkedList;
            this.f7190d = bVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f7188b + ")";
        }
    }

    /* renamed from: b */
    private void m10029b(C2413b<T> bVar) {
        if (bVar != null && bVar.f7189c.isEmpty()) {
            m10031d(bVar);
            this.f7184a.remove(bVar.f7188b);
        }
    }

    /* renamed from: c */
    private void m10030c(C2413b<T> bVar) {
        if (this.f7185b != bVar) {
            m10031d(bVar);
            C2413b<T> bVar2 = this.f7185b;
            if (bVar2 == null) {
                this.f7185b = bVar;
                this.f7186c = bVar;
                return;
            }
            bVar.f7190d = bVar2;
            bVar2.f7187a = bVar;
            this.f7185b = bVar;
        }
    }

    /* renamed from: d */
    private synchronized void m10031d(C2413b<T> bVar) {
        C2413b<I> bVar2 = bVar.f7187a;
        C2413b<I> bVar3 = bVar.f7190d;
        if (bVar2 != null) {
            bVar2.f7190d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f7187a = bVar2;
        }
        bVar.f7187a = null;
        bVar.f7190d = null;
        if (bVar == this.f7185b) {
            this.f7185b = bVar3;
        }
        if (bVar == this.f7186c) {
            this.f7186c = bVar2;
        }
    }

    /* renamed from: a */
    public synchronized T mo8132a(int i) {
        C2413b bVar = this.f7184a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f7189c.pollFirst();
        m10030c(bVar);
        return pollFirst;
    }

    /* renamed from: e */
    public synchronized void mo8133e(int i, T t) {
        C2413b bVar = this.f7184a.get(i);
        if (bVar == null) {
            bVar = new C2413b((C2413b) null, i, new LinkedList(), (C2413b) null);
            this.f7184a.put(i, bVar);
        }
        bVar.f7189c.addLast(t);
        m10030c(bVar);
    }

    /* renamed from: f */
    public synchronized T mo8134f() {
        C2413b<T> bVar = this.f7186c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f7189c.pollLast();
        m10029b(bVar);
        return pollLast;
    }
}
