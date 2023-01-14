package com.facebook.react.p116f0.p118b;

import java.util.List;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p302f.C6341l;

/* renamed from: com.facebook.react.f0.b.b */
public class C2759b {

    /* renamed from: com.facebook.react.f0.b.b$b */
    public static class C2761b {

        /* renamed from: a */
        private final C2758a f7824a;

        /* renamed from: b */
        private final C2758a f7825b;

        private C2761b(C2758a aVar, C2758a aVar2) {
            this.f7824a = aVar;
            this.f7825b = aVar2;
        }

        /* renamed from: a */
        public C2758a mo9025a() {
            return this.f7824a;
        }

        /* renamed from: b */
        public C2758a mo9026b() {
            return this.f7825b;
        }
    }

    /* renamed from: a */
    public static C2761b m11069a(int i, int i2, List<C2758a> list) {
        return m11070b(i, i2, list, 1.0d);
    }

    /* renamed from: b */
    public static C2761b m11070b(int i, int i2, List<C2758a> list, double d) {
        if (list.isEmpty()) {
            return new C2761b((C2758a) null, (C2758a) null);
        }
        if (list.size() == 1) {
            return new C2761b(list.get(0), (C2758a) null);
        }
        if (i <= 0 || i2 <= 0) {
            return new C2761b((C2758a) null, (C2758a) null);
        }
        C6327h j = C6341l.m24151l().mo18805j();
        double d2 = ((double) (i * i2)) * d;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        C2758a aVar = null;
        C2758a aVar2 = null;
        for (C2758a next : list) {
            double abs = Math.abs(1.0d - (next.mo9019c() / d2));
            if (abs < d3) {
                aVar2 = next;
                d3 = abs;
            }
            if (abs < d4 && (j.mo18720m(next.mo9021e()) || j.mo18722o(next.mo9021e()))) {
                aVar = next;
                d4 = abs;
            }
        }
        if (!(aVar == null || aVar2 == null || !aVar.mo9020d().equals(aVar2.mo9020d()))) {
            aVar = null;
        }
        return new C2761b(aVar2, aVar);
    }
}
