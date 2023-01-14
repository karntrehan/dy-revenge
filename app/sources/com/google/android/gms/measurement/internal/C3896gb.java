package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p027c.p060f.C1788a;
import p174e.p319f.p320a.p335c.p345f.p352g.C6698a5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6715b5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6732c5;
import p174e.p319f.p320a.p335c.p345f.p352g.C6740cd;
import p174e.p319f.p320a.p335c.p345f.p352g.C6782f4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6799g4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6815h4;
import p174e.p319f.p320a.p335c.p345f.p352g.C6831i4;
import p174e.p319f.p320a.p335c.p345f.p352g.C7103z4;

/* renamed from: com.google.android.gms.measurement.internal.gb */
final class C3896gb {

    /* renamed from: a */
    private String f10705a;

    /* renamed from: b */
    private boolean f10706b;

    /* renamed from: c */
    private C6698a5 f10707c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f10708d;

    /* renamed from: e */
    private BitSet f10709e;

    /* renamed from: f */
    private Map f10710f;

    /* renamed from: g */
    private Map f10711g;

    /* renamed from: h */
    final /* synthetic */ C3819b f10712h;

    /* synthetic */ C3896gb(C3819b bVar, String str, C3883fb fbVar) {
        this.f10712h = bVar;
        this.f10705a = str;
        this.f10706b = true;
        this.f10708d = new BitSet();
        this.f10709e = new BitSet();
        this.f10710f = new C1788a();
        this.f10711g = new C1788a();
    }

    /* synthetic */ C3896gb(C3819b bVar, String str, C6698a5 a5Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C3883fb fbVar) {
        this.f10712h = bVar;
        this.f10705a = str;
        this.f10708d = bitSet;
        this.f10709e = bitSet2;
        this.f10710f = map;
        this.f10711g = new C1788a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f10711g.put(num, arrayList);
        }
        this.f10706b = false;
        this.f10707c = a5Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6799g4 mo12007a(int i) {
        ArrayList arrayList;
        List list;
        C6782f4 y = C6799g4.m25737y();
        y.mo19755u(i);
        y.mo19757w(this.f10706b);
        C6698a5 a5Var = this.f10707c;
        if (a5Var != null) {
            y.mo19758x(a5Var);
        }
        C7103z4 C = C6698a5.m25380C();
        C.mo20467v(C4033ra.m15283H(this.f10708d));
        C.mo20469x(C4033ra.m15283H(this.f10709e));
        Map map = this.f10710f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f10710f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = (Long) this.f10710f.get(Integer.valueOf(intValue2));
                if (l != null) {
                    C6815h4 z = C6831i4.m25860z();
                    z.mo19822v(intValue2);
                    z.mo19821u(l.longValue());
                    arrayList2.add((C6831i4) z.mo20436r());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            C.mo20466u(arrayList);
        }
        Map map2 = this.f10711g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f10711g.keySet()) {
                C6715b5 A = C6732c5.m25514A();
                A.mo19560v(num.intValue());
                List list2 = (List) this.f10711g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    A.mo19559u(list2);
                }
                arrayList3.add((C6732c5) A.mo20436r());
            }
            list = arrayList3;
        }
        C.mo20468w(list);
        y.mo19756v(C);
        return (C6799g4) y.mo20436r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12008c(C3948kb kbVar) {
        int a = kbVar.mo12135a();
        Boolean bool = kbVar.f10869c;
        if (bool != null) {
            this.f10709e.set(a, bool.booleanValue());
        }
        Boolean bool2 = kbVar.f10870d;
        if (bool2 != null) {
            this.f10708d.set(a, bool2.booleanValue());
        }
        if (kbVar.f10871e != null) {
            Map map = this.f10710f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = kbVar.f10871e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f10710f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (kbVar.f10872f != null) {
            Map map2 = this.f10711g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f10711g.put(valueOf2, list);
            }
            if (kbVar.mo12137c()) {
                list.clear();
            }
            C6740cd.m25562b();
            C3897h z = this.f10712h.f10651a.mo12181z();
            String str = this.f10705a;
            C3953l3 l3Var = C3966m3.f10984Y;
            if (z.mo12010B(str, l3Var) && kbVar.mo12136b()) {
                list.clear();
            }
            C6740cd.m25562b();
            boolean B = this.f10712h.f10651a.mo12181z().mo12010B(this.f10705a, l3Var);
            Long valueOf3 = Long.valueOf(kbVar.f10872f.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }
}
