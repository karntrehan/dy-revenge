package p174e.p319f.p416e.p428v.p429r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.C9671q;
import p174e.p319f.p416e.p420s.C9679a;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p428v.C9726k;

/* renamed from: e.f.e.v.r.e */
public final class C9737e extends C9733a {

    /* renamed from: g */
    private static final int[] f26093g = {1, 10, 34, 70, WebSocketProtocol.PAYLOAD_SHORT};

    /* renamed from: h */
    private static final int[] f26094h = {4, 20, 48, 81};

    /* renamed from: i */
    private static final int[] f26095i = {0, 161, 961, 2015, 2715};

    /* renamed from: j */
    private static final int[] f26096j = {0, 336, 1036, 1516};

    /* renamed from: k */
    private static final int[] f26097k = {8, 6, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f26098l = {2, 4, 6, 8};

    /* renamed from: m */
    private static final int[][] f26099m = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: n */
    private final List<C9736d> f26100n = new ArrayList();

    /* renamed from: o */
    private final List<C9736d> f26101o = new ArrayList();

    /* renamed from: r */
    private static void m33179r(Collection<C9736d> collection, C9736d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C9736d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9736d next = it.next();
                if (next.mo24366b() == dVar.mo24366b()) {
                    next.mo24377e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33180s(boolean r10, int r11) {
        /*
            r9 = this;
            int[] r0 = r9.mo24363m()
            int r0 = p174e.p319f.p416e.p420s.p421m.C9691a.m32983d(r0)
            int[] r1 = r9.mo24361k()
            int r1 = p174e.p319f.p416e.p420s.p421m.C9691a.m32983d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r8 != r4) goto L_0x006a
            if (r10 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x005b
            r4 = r6
        L_0x0059:
            r7 = 1
            goto L_0x0095
        L_0x005b:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x0081:
            if (r8 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x008d
            if (r0 >= r1) goto L_0x008a
            goto L_0x0063
        L_0x008a:
            r4 = r6
            r2 = 1
            goto L_0x0059
        L_0x008d:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.mo24363m()
            float[] r11 = r9.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33162o(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.mo24363m()
            float[] r11 = r9.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33161h(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.mo24361k()
            float[] r11 = r9.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33162o(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.mo24361k()
            float[] r11 = r9.mo24362l()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33161h(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        L_0x00df:
            e.f.e.j r10 = p174e.p319f.p416e.C9664j.m32854a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.p429r.C9737e.m33180s(boolean, int):void");
    }

    /* renamed from: t */
    private static boolean m33181t(C9736d dVar, C9736d dVar2) {
        int a = (dVar.mo24365a() + (dVar2.mo24365a() * 16)) % 79;
        int c = (dVar.mo24376d().mo24372c() * 9) + dVar2.mo24376d().mo24372c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: u */
    private static C9668n m33182u(C9736d dVar, C9736d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo24366b()) * 4537077) + ((long) dVar2.mo24366b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C9670p[] a = dVar.mo24376d().mo24370a();
        C9670p[] a2 = dVar2.mo24376d().mo24370a();
        return new C9668n(sb.toString(), (byte[]) null, new C9670p[]{a[0], a[1], a2[0], a2[1]}, C9655a.RSS_14);
    }

    /* renamed from: v */
    private C9734b m33183v(C9679a aVar, C9735c cVar, boolean z) {
        int[] i = mo24359i();
        for (int i2 = 0; i2 < i.length; i2++) {
            i[i2] = 0;
        }
        int[] b = cVar.mo24371b();
        if (z) {
            C9726k.m33123g(aVar, b[0], i);
        } else {
            C9726k.m33122f(aVar, b[1] + 1, i);
            int i3 = 0;
            for (int length = i.length - 1; i3 < length; length--) {
                int i4 = i[i3];
                i[i3] = i[length];
                i[length] = i4;
                i3++;
            }
        }
        int i5 = z ? 16 : 15;
        float d = ((float) C9691a.m32983d(i)) / ((float) i5);
        int[] m = mo24363m();
        int[] k = mo24361k();
        float[] n = mo24364n();
        float[] l = mo24362l();
        for (int i6 = 0; i6 < i.length; i6++) {
            float f = ((float) i[i6]) / d;
            int i7 = (int) (0.5f + f);
            if (i7 <= 0) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 / 2;
            if ((i6 & 1) == 0) {
                m[i8] = i7;
                n[i8] = f - ((float) i7);
            } else {
                k[i8] = i7;
                l[i8] = f - ((float) i7);
            }
        }
        m33180s(z, i5);
        int i9 = 0;
        int i10 = 0;
        for (int length2 = m.length - 1; length2 >= 0; length2--) {
            i9 = (i9 * 9) + m[length2];
            i10 += m[length2];
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = k.length - 1; length3 >= 0; length3--) {
            i11 = (i11 * 9) + k[length3];
            i12 += k[length3];
        }
        int i13 = i9 + (i11 * 3);
        if (z) {
            if ((i10 & 1) != 0 || i10 > 12 || i10 < 4) {
                throw C9664j.m32854a();
            }
            int i14 = (12 - i10) / 2;
            int i15 = f26097k[i14];
            return new C9734b((C9738f.m33190b(m, i15, false) * f26093g[i14]) + C9738f.m33190b(k, 9 - i15, true) + f26095i[i14], i13);
        } else if ((i12 & 1) != 0 || i12 > 10 || i12 < 4) {
            throw C9664j.m32854a();
        } else {
            int i16 = (10 - i12) / 2;
            int i17 = f26098l[i16];
            return new C9734b((C9738f.m33190b(k, 9 - i17, false) * f26094h[i16]) + C9738f.m33190b(m, i17, true) + f26096j[i16], i13);
        }
    }

    /* renamed from: w */
    private C9736d m33184w(C9679a aVar, boolean z, int i, Map<C9659e, ?> map) {
        try {
            int[] x = m33185x(aVar, z);
            C9735c y = m33186y(aVar, i, z, x);
            C9671q qVar = map == null ? null : (C9671q) map.get(C9659e.NEED_RESULT_POINT_CALLBACK);
            if (qVar != null) {
                float f = ((float) (x[0] + x[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo24254j() - 1)) - f;
                }
                qVar.mo24235a(new C9670p(f, (float) i));
            }
            C9734b v = m33183v(aVar, y, true);
            C9734b v2 = m33183v(aVar, y, false);
            return new C9736d((v.mo24366b() * 1597) + v2.mo24366b(), v.mo24365a() + (v2.mo24365a() * 4), y);
        } catch (C9664j unused) {
            return null;
        }
    }

    /* renamed from: x */
    private int[] m33185x(C9679a aVar, boolean z) {
        int[] j = mo24360j();
        j[0] = 0;
        j[1] = 0;
        j[2] = 0;
        j[3] = 0;
        int j2 = aVar.mo24254j();
        int i = 0;
        boolean z2 = false;
        while (i < j2) {
            z2 = !aVar.mo24248e(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = i;
        int i3 = 0;
        while (i < j2) {
            if (aVar.mo24248e(i) != z2) {
                j[i3] = j[i3] + 1;
            } else {
                if (i3 != 3) {
                    i3++;
                } else if (C9733a.m33163p(j)) {
                    return new int[]{i2, i};
                } else {
                    i2 += j[0] + j[1];
                    j[0] = j[2];
                    j[1] = j[3];
                    j[2] = 0;
                    j[3] = 0;
                    i3--;
                }
                j[i3] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: y */
    private C9735c m33186y(C9679a aVar, int i, boolean z, int[] iArr) {
        int i2;
        int i3;
        boolean e = aVar.mo24248e(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && e != aVar.mo24248e(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] j = mo24360j();
        System.arraycopy(j, 0, j, 1, j.length - 1);
        j[0] = iArr[0] - i5;
        int q = C9733a.m33164q(j, f26099m);
        int i6 = iArr[1];
        if (z) {
            i2 = (aVar.mo24254j() - 1) - i6;
            i3 = (aVar.mo24254j() - 1) - i5;
        } else {
            i2 = i6;
            i3 = i5;
        }
        return new C9735c(q, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: a */
    public void mo24216a() {
        this.f26100n.clear();
        this.f26101o.clear();
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        m33179r(this.f26100n, m33184w(aVar, false, i, map));
        aVar.mo24256m();
        m33179r(this.f26101o, m33184w(aVar, true, i, map));
        aVar.mo24256m();
        for (C9736d next : this.f26100n) {
            if (next.mo24375c() > 1) {
                for (C9736d next2 : this.f26101o) {
                    if (next2.mo24375c() > 1 && m33181t(next, next2)) {
                        return m33182u(next, next2);
                    }
                }
                continue;
            }
        }
        throw C9664j.m32854a();
    }
}
