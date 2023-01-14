package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p174e.p319f.p320a.p335c.p345f.p357l.C8491uc;

/* renamed from: e.f.a.c.f.l.vc */
final class C8509vc<T extends C8491uc<T>> {

    /* renamed from: a */
    private static final C8509vc f23186a = new C8509vc(true);

    /* renamed from: b */
    final C8218ff<T, Object> f23187b = new C8565ye(16);

    /* renamed from: c */
    private boolean f23188c;

    private C8509vc() {
    }

    private C8509vc(boolean z) {
        mo22211h();
        mo22211h();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28674d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28665B((p174e.p319f.p320a.p335c.p345f.p357l.C8177dc) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28668E(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d0, code lost:
        r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28675e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r8 = r8 + (r2 + r4);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m29166a(p174e.p319f.p320a.p335c.p345f.p357l.C8491uc<?> r7, java.lang.Object r8) {
        /*
            e.f.a.c.f.l.ag r0 = r7.zzb()
            r7.zza()
            r7.mo21714c()
            r7.mo21713b()
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r7 = r8.iterator()
            r8 = 0
        L_0x0014:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r7.next()
            r2 = 202056002(0xc0b2142, float:1.0718179E-31)
            int r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28673c(r2)
            e.f.a.c.f.l.ag r3 = p174e.p319f.p320a.p335c.p345f.p357l.C8124ag.GROUP
            if (r0 != r3) goto L_0x0030
            r3 = r1
            e.f.a.c.f.l.ie r3 = (p174e.p319f.p320a.p335c.p345f.p357l.C8274ie) r3
            p174e.p319f.p320a.p335c.p345f.p357l.C8311kd.m28705i(r3)
            int r2 = r2 + r2
        L_0x0030:
            e.f.a.c.f.l.bg r3 = p174e.p319f.p320a.p335c.p345f.p357l.C8143bg.INT
            int r3 = r0.ordinal()
            r4 = 4
            r5 = 8
            switch(r3) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00d5;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00ac;
                case 8: goto L_0x009a;
                case 9: goto L_0x0093;
                case 10: goto L_0x0081;
                case 11: goto L_0x0075;
                case 12: goto L_0x0069;
                case 13: goto L_0x005e;
                case 14: goto L_0x00b3;
                case 15: goto L_0x00b9;
                case 16: goto L_0x0052;
                case 17: goto L_0x0044;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r8 = "There is no way to get here, but the compiler thinks otherwise."
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            long r5 = r3 + r3
            r1 = 63
            long r3 = r3 >> r1
            long r3 = r3 ^ r5
            goto L_0x00d0
        L_0x0052:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r3 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r3
            goto L_0x006f
        L_0x005e:
            boolean r3 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8235gd
            if (r3 == 0) goto L_0x00bf
            e.f.a.c.f.l.gd r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8235gd) r1
            int r1 = r1.zza()
            goto L_0x00c5
        L_0x0069:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x006f:
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28674d(r1)
            goto L_0x00e2
        L_0x0075:
            boolean r3 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8177dc
            if (r3 == 0) goto L_0x007a
            goto L_0x009e
        L_0x007a:
            byte[] r1 = (byte[]) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28664A(r1)
            goto L_0x00e2
        L_0x0081:
            boolean r3 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8402pd
            if (r3 == 0) goto L_0x008c
            e.f.a.c.f.l.pd r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8402pd) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28669F(r1)
            goto L_0x00e2
        L_0x008c:
            e.f.a.c.f.l.ie r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8274ie) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28670G(r1)
            goto L_0x00e2
        L_0x0093:
            e.f.a.c.f.l.ie r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8274ie) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28667D(r1)
            goto L_0x00e2
        L_0x009a:
            boolean r3 = r1 instanceof p174e.p319f.p320a.p335c.p345f.p357l.C8177dc
            if (r3 == 0) goto L_0x00a5
        L_0x009e:
            e.f.a.c.f.l.dc r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8177dc) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28665B(r1)
            goto L_0x00e2
        L_0x00a5:
            java.lang.String r1 = (java.lang.String) r1
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28672b(r1)
            goto L_0x00e2
        L_0x00ac:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            r4 = 1
            goto L_0x00e2
        L_0x00b3:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.intValue()
            goto L_0x00e2
        L_0x00b9:
            java.lang.Long r1 = (java.lang.Long) r1
            r1.longValue()
            goto L_0x00e0
        L_0x00bf:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x00c5:
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28668E(r1)
            goto L_0x00e2
        L_0x00ca:
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
        L_0x00d0:
            int r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8310kc.m28675e(r3)
            goto L_0x00e2
        L_0x00d5:
            java.lang.Float r1 = (java.lang.Float) r1
            r1.floatValue()
            goto L_0x00e2
        L_0x00db:
            java.lang.Double r1 = (java.lang.Double) r1
            r1.doubleValue()
        L_0x00e0:
            r4 = 8
        L_0x00e2:
            int r2 = r2 + r4
            int r8 = r8 + r2
            goto L_0x0014
        L_0x00e6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8509vc.m29166a(e.f.a.c.f.l.uc, java.lang.Object):int");
    }

    /* renamed from: d */
    public static <T extends C8491uc<T>> C8509vc<T> m29167d() {
        return f23186a;
    }

    /* renamed from: m */
    private final void m29168m(Map.Entry<T, Object> entry) {
        C8491uc ucVar = (C8491uc) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof C8402pd)) {
            ucVar.mo21714c();
            Object e = mo22207e(ucVar);
            if (e == null) {
                e = new ArrayList();
            }
            for (Object next : (List) value) {
                List list = (List) e;
                if (next instanceof C8385oe) {
                    next = ((C8385oe) next).mo22023a();
                } else if (next instanceof byte[]) {
                    byte[] bArr = (byte[]) next;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    next = bArr2;
                }
                list.add(next);
            }
            this.f23187b.put(ucVar, e);
            return;
        }
        C8402pd pdVar = (C8402pd) value;
        throw null;
    }

    /* renamed from: n */
    private static <T extends C8491uc<T>> boolean m29169n(Map.Entry<T, Object> entry) {
        C8491uc ucVar = (C8491uc) entry.getKey();
        if (ucVar.mo21712a() != C8143bg.MESSAGE) {
            return true;
        }
        ucVar.mo21714c();
        for (C8274ie r : (List) entry.getValue()) {
            if (!r.mo21767r()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: o */
    private static final int m29170o(Map.Entry<T, Object> entry) {
        C8491uc ucVar = (C8491uc) entry.getKey();
        Object value = entry.getValue();
        if (ucVar.mo21712a() == C8143bg.MESSAGE) {
            ucVar.mo21714c();
        }
        return m29166a(ucVar, value);
    }

    /* renamed from: p */
    private static final void m29171p(T t, Object obj) {
        boolean z;
        C8124ag zzb = t.zzb();
        C8311kd.m28701e(obj);
        C8124ag agVar = C8124ag.DOUBLE;
        C8143bg bgVar = C8143bg.INT;
        switch (zzb.mo21663e().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C8177dc) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C8235gd)) {
                    return;
                }
            case 8:
                if ((obj instanceof C8274ie) || (obj instanceof C8402pd)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        t.zza();
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{202056002, t.zzb().mo21663e(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final int mo22204b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f23187b.mo21807b(); i2++) {
            i += m29170o(this.f23187b.mo21814g(i2));
        }
        for (Map.Entry<T, Object> o : this.f23187b.mo21808c()) {
            i += m29170o(o);
        }
        return i;
    }

    /* renamed from: c */
    public final C8509vc<T> clone() {
        C8509vc<T> vcVar = new C8509vc<>();
        for (int i = 0; i < this.f23187b.mo21807b(); i++) {
            Map.Entry<T, Object> g = this.f23187b.mo21814g(i);
            vcVar.mo22214j((C8491uc) g.getKey(), g.getValue());
        }
        for (Map.Entry next : this.f23187b.mo21808c()) {
            vcVar.mo22214j((C8491uc) next.getKey(), next.getValue());
        }
        return vcVar;
    }

    /* renamed from: e */
    public final Object mo22207e(T t) {
        Object obj = this.f23187b.get(t);
        if (!(obj instanceof C8402pd)) {
            return obj;
        }
        C8402pd pdVar = (C8402pd) obj;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8509vc)) {
            return false;
        }
        return this.f23187b.equals(((C8509vc) obj).f23187b);
    }

    /* renamed from: f */
    public final Iterator<Map.Entry<T, Object>> mo22209f() {
        return this.f23187b.entrySet().iterator();
    }

    /* renamed from: g */
    public final void mo22210g(T t, Object obj) {
        List list;
        m29171p(t, obj);
        Object e = mo22207e(t);
        if (e == null) {
            list = new ArrayList();
            this.f23187b.put(t, list);
        } else {
            list = (List) e;
        }
        list.add(obj);
    }

    /* renamed from: h */
    public final void mo22211h() {
        if (!this.f23188c) {
            this.f23187b.mo21806a();
            this.f23188c = true;
        }
    }

    public final int hashCode() {
        return this.f23187b.hashCode();
    }

    /* renamed from: i */
    public final void mo22213i(C8509vc<T> vcVar) {
        for (int i = 0; i < vcVar.f23187b.mo21807b(); i++) {
            m29168m(vcVar.f23187b.mo21814g(i));
        }
        for (Map.Entry<T, Object> m : vcVar.f23187b.mo21808c()) {
            m29168m(m);
        }
    }

    /* renamed from: j */
    public final void mo22214j(T t, Object obj) {
        t.mo21714c();
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m29171p(t, arrayList.get(i));
            }
            this.f23187b.put(t, arrayList);
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: k */
    public final boolean mo22215k() {
        return this.f23188c;
    }

    /* renamed from: l */
    public final boolean mo22216l() {
        for (int i = 0; i < this.f23187b.mo21807b(); i++) {
            if (!m29169n(this.f23187b.mo21814g(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> n : this.f23187b.mo21808c()) {
            if (!m29169n(n)) {
                return false;
            }
        }
        return true;
    }
}
