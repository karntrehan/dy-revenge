package p174e.p319f.p416e.p428v;

import java.util.Arrays;
import java.util.Map;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9666l;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9669o;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.k */
public abstract class C9726k implements C9666l {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ m -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p174e.p319f.p416e.C9668n m33120d(p174e.p319f.p416e.C9657c r22, java.util.Map<p174e.p319f.p416e.C9659e, ?> r23) {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo24204d()
            int r2 = r22.mo24203c()
            e.f.e.s.a r3 = new e.f.e.s.a
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            e.f.e.e r6 = p174e.p319f.p416e.C9659e.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = 1
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = 0
        L_0x0033:
            if (r9 >= r6) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            e.f.e.s.a r3 = r9.mo24202b(r11, r3)     // Catch:{ j -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r5) goto L_0x0075
            r3.mo24256m()
            if (r0 == 0) goto L_0x0075
            e.f.e.e r13 = p174e.p319f.p416e.C9659e.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<e.f.e.e> r15 = p174e.p319f.p416e.C9659e.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            e.f.e.n r14 = r13.mo24349c(r11, r3, r0)     // Catch:{ m -> 0x00c6 }
            if (r12 != r5) goto L_0x00c5
            e.f.e.o r15 = p174e.p319f.p416e.C9669o.ORIENTATION     // Catch:{ m -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ m -> 0x00c6 }
            r14.mo24228h(r15, r5)     // Catch:{ m -> 0x00c6 }
            e.f.e.p[] r5 = r14.mo24225e()     // Catch:{ m -> 0x00c6 }
            if (r5 == 0) goto L_0x00c5
            e.f.e.p r15 = new e.f.e.p     // Catch:{ m -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ m -> 0x00c8 }
            float r18 = r18.mo24230c()     // Catch:{ m -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ m -> 0x00ca }
            float r4 = r18.mo24231d()     // Catch:{ m -> 0x00ca }
            r15.<init>(r1, r4)     // Catch:{ m -> 0x00ca }
            r1 = 0
            r5[r1] = r15     // Catch:{ m -> 0x00ca }
            e.f.e.p r4 = new e.f.e.p     // Catch:{ m -> 0x00ca }
            r15 = 1
            r17 = r5[r15]     // Catch:{ m -> 0x00cb }
            float r17 = r17.mo24230c()     // Catch:{ m -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ m -> 0x00cb }
            float r1 = r17.mo24231d()     // Catch:{ m -> 0x00cb }
            r4.<init>(r0, r1)     // Catch:{ m -> 0x00cb }
            r5[r15] = r4     // Catch:{ m -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            e.f.e.j r0 = p174e.p319f.p416e.C9664j.m32854a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9726k.m33120d(e.f.e.c, java.util.Map):e.f.e.n");
    }

    /* renamed from: e */
    protected static float m33121e(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: f */
    protected static void m33122f(C9679a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int j = aVar.mo24254j();
        if (i < j) {
            boolean z = !aVar.mo24248e(i);
            while (i < j) {
                if (aVar.mo24248e(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != j) {
                throw C9664j.m32854a();
            }
            return;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: g */
    protected static void m33123g(C9679a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean e = aVar.mo24248e(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo24248e(i) != e) {
                length--;
                e = !e;
            }
        }
        if (length < 0) {
            m33122f(aVar, i + 1, iArr);
            return;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        try {
            return m33120d(cVar, map);
        } catch (C9664j e) {
            if (!(map != null && map.containsKey(C9659e.TRY_HARDER)) || !cVar.mo24205e()) {
                throw e;
            }
            C9657c f = cVar.mo24206f();
            C9668n d = m33120d(f, map);
            Map<C9669o, Object> d2 = d.mo24224d();
            int i = 270;
            if (d2 != null) {
                C9669o oVar = C9669o.ORIENTATION;
                if (d2.containsKey(oVar)) {
                    i = (((Integer) d2.get(oVar)).intValue() + 270) % 360;
                }
            }
            d.mo24228h(C9669o.ORIENTATION, Integer.valueOf(i));
            C9670p[] e2 = d.mo24225e();
            if (e2 != null) {
                int c = f.mo24203c();
                for (int i2 = 0; i2 < e2.length; i2++) {
                    e2[i2] = new C9670p((((float) c) - e2[i2].mo24231d()) - 1.0f, e2[i2].mo24230c());
                }
            }
            return d;
        }
    }

    /* renamed from: c */
    public abstract C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map);
}
