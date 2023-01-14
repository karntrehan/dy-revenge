package p174e.p319f.p416e.p428v.p429r.p430g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p027c.p028a.C1444j;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9679a;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p428v.C9726k;
import p174e.p319f.p416e.p428v.p429r.C9733a;
import p174e.p319f.p416e.p428v.p429r.C9734b;
import p174e.p319f.p416e.p428v.p429r.C9735c;
import p174e.p319f.p416e.p428v.p429r.C9738f;
import p174e.p319f.p416e.p428v.p429r.p430g.p431e.C9752j;

/* renamed from: e.f.e.v.r.g.d */
public final class C9742d extends C9733a {

    /* renamed from: g */
    private static final int[] f26109g = {7, 5, 4, 3, 1};

    /* renamed from: h */
    private static final int[] f26110h = {4, 20, 52, 104, 204};

    /* renamed from: i */
    private static final int[] f26111i = {0, 348, 1388, 2948, 3988};

    /* renamed from: j */
    private static final int[][] f26112j = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: k */
    private static final int[][] f26113k = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, C1444j.f4236H0, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, C1444j.f4231G0, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, C1444j.f4261M0, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, C1444j.f4256L0, 155}, new int[]{43, 129, 176, 106, 107, 110, C1444j.f4241I0, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, C1444j.f4226F0, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, C1444j.f4221E0}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{C1444j.f4246J0, 149, 25, 75, 14, 42, WebSocketProtocol.PAYLOAD_SHORT, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, C1444j.f4216D0, 131, 182, C1444j.f4266N0}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: l */
    private static final int[][] f26114l = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: m */
    private final List<C9740b> f26115m = new ArrayList(11);

    /* renamed from: n */
    private final List<C9741c> f26116n = new ArrayList();

    /* renamed from: o */
    private final int[] f26117o = new int[2];

    /* renamed from: p */
    private boolean f26118p;

    /* renamed from: A */
    private static boolean m33201A(C9735c cVar, boolean z, boolean z2) {
        return cVar.mo24372c() != 0 || !z || !z2;
    }

    /* renamed from: B */
    private static boolean m33202B(Iterable<C9740b> iterable, Iterable<C9741c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C9741c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C9741c next = it.next();
                Iterator<C9740b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C9740b next2 = it2.next();
                    Iterator<C9740b> it3 = next.mo24385a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: C */
    private static boolean m33203C(List<C9740b> list) {
        boolean z;
        for (int[] iArr : f26114l) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo24378b().mo24372c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: D */
    private C9735c m33204D(C9679a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f26117o[0] - 1;
            while (i5 >= 0 && !aVar.mo24248e(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f26117o;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f26117o;
            int i7 = iArr2[0];
            int i8 = aVar.mo24253i(iArr2[1] + 1);
            i2 = i8;
            i3 = i7;
            i4 = i8 - this.f26117o[1];
        }
        int[] j = mo24360j();
        System.arraycopy(j, 0, j, 1, j.length - 1);
        j[0] = i4;
        try {
            return new C9735c(C9733a.m33164q(j, f26112j), new int[]{i3, i2}, i3, i2, i);
        } catch (C9664j unused) {
            return null;
        }
    }

    /* renamed from: E */
    private static void m33205E(List<C9740b> list, List<C9741c> list2) {
        boolean z;
        Iterator<C9741c> it = list2.iterator();
        while (it.hasNext()) {
            C9741c next = it.next();
            if (next.mo24385a().size() != list.size()) {
                Iterator<C9740b> it2 = next.mo24385a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C9740b next2 = it2.next();
                    Iterator<C9740b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    private static void m33206G(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: H */
    private void m33207H(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f26116n.size()) {
                break;
            }
            C9741c cVar = this.f26116n.get(i2);
            if (cVar.mo24386b() > i) {
                z2 = cVar.mo24387c(this.f26115m);
                break;
            } else {
                z3 = cVar.mo24387c(this.f26115m);
                i2++;
            }
        }
        if (!z2 && !z3 && !m33202B(this.f26115m, this.f26116n)) {
            this.f26116n.add(i2, new C9741c(this.f26115m, i, z));
            m33205E(this.f26115m, this.f26116n);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m33208r(int r11) {
        /*
            r10 = this;
            int[] r0 = r10.mo24363m()
            int r0 = p174e.p319f.p416e.p420s.p421m.C9691a.m32983d(r0)
            int[] r1 = r10.mo24361k()
            int r1 = p174e.p319f.p416e.p420s.p421m.C9691a.m32983d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = 0
            r7 = 1
            goto L_0x0020
        L_0x001a:
            if (r0 >= r2) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r1 <= r3) goto L_0x0025
            r2 = 0
            r3 = 1
            goto L_0x002b
        L_0x0025:
            if (r1 >= r2) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            if (r8 != r5) goto L_0x0052
            if (r11 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            r5 = r6
        L_0x0041:
            r7 = 1
            goto L_0x007d
        L_0x0043:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c7
            if (r11 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0075
            if (r0 >= r1) goto L_0x0072
            goto L_0x004b
        L_0x0072:
            r5 = r6
            r2 = 1
            goto L_0x0041
        L_0x0075:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.mo24363m()
            float[] r0 = r10.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33162o(r11, r0)
            goto L_0x0092
        L_0x008d:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.mo24363m()
            float[] r0 = r10.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33161h(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.mo24361k()
            float[] r0 = r10.mo24364n()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33162o(r11, r0)
            goto L_0x00b4
        L_0x00af:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.mo24361k()
            float[] r0 = r10.mo24362l()
            p174e.p319f.p416e.p428v.p429r.C9733a.m33161h(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        L_0x00c7:
            e.f.e.j r11 = p174e.p319f.p416e.C9664j.m32854a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.p429r.p430g.C9742d.m33208r(int):void");
    }

    /* renamed from: s */
    private boolean m33209s() {
        C9740b bVar = this.f26115m.get(0);
        C9734b c = bVar.mo24379c();
        C9734b d = bVar.mo24380d();
        if (d == null) {
            return false;
        }
        int a = d.mo24365a();
        int i = 2;
        for (int i2 = 1; i2 < this.f26115m.size(); i2++) {
            C9740b bVar2 = this.f26115m.get(i2);
            a += bVar2.mo24379c().mo24365a();
            i++;
            C9734b d2 = bVar2.mo24380d();
            if (d2 != null) {
                a += d2.mo24365a();
                i++;
            }
        }
        return ((i + -4) * 211) + (a % 211) == c.mo24366b();
    }

    /* renamed from: t */
    private List<C9740b> m33210t(List<C9741c> list, int i) {
        while (i < this.f26116n.size()) {
            C9741c cVar = this.f26116n.get(i);
            this.f26115m.clear();
            for (C9741c a : list) {
                this.f26115m.addAll(a.mo24385a());
            }
            this.f26115m.addAll(cVar.mo24385a());
            if (!m33203C(this.f26115m)) {
                i++;
            } else if (m33209s()) {
                return this.f26115m;
            } else {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(cVar);
                try {
                    return m33210t(arrayList, i + 1);
                } catch (C9664j unused) {
                }
            }
        }
        throw C9664j.m32854a();
    }

    /* renamed from: u */
    private List<C9740b> m33211u(boolean z) {
        List<C9740b> list = null;
        if (this.f26116n.size() > 25) {
            this.f26116n.clear();
            return null;
        }
        this.f26115m.clear();
        if (z) {
            Collections.reverse(this.f26116n);
        }
        try {
            list = m33210t(new ArrayList(), 0);
        } catch (C9664j unused) {
        }
        if (z) {
            Collections.reverse(this.f26116n);
        }
        return list;
    }

    /* renamed from: v */
    static C9668n m33212v(List<C9740b> list) {
        String d = C9752j.m33238a(C9739a.m33191a(list)).mo24396d();
        C9670p[] a = list.get(0).mo24378b().mo24370a();
        C9670p[] a2 = list.get(list.size() - 1).mo24378b().mo24370a();
        return new C9668n(d, (byte[]) null, new C9670p[]{a[0], a[1], a2[0], a2[1]}, C9655a.RSS_EXPANDED);
    }

    /* renamed from: y */
    private void m33213y(C9679a aVar, List<C9740b> list, int i) {
        int[] j = mo24360j();
        j[0] = 0;
        j[1] = 0;
        j[2] = 0;
        j[3] = 0;
        int j2 = aVar.mo24254j();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).mo24378b().mo24371b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f26118p) {
            z = !z;
        }
        boolean z2 = false;
        while (i < j2) {
            z2 = !aVar.mo24248e(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < j2) {
            if (aVar.mo24248e(i) != z3) {
                j[i2] = j[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m33206G(j);
                    }
                    if (C9733a.m33163p(j)) {
                        int[] iArr = this.f26117o;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m33206G(j);
                    }
                    i3 += j[0] + j[1];
                    j[0] = j[2];
                    j[1] = j[3];
                    j[2] = 0;
                    j[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                j[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: z */
    private static int m33214z(C9679a aVar, int i) {
        return aVar.mo24248e(i) ? aVar.mo24251g(aVar.mo24253i(i)) : aVar.mo24253i(aVar.mo24251g(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public C9740b mo24391F(C9679a aVar, List<C9740b> list, int i) {
        C9735c D;
        C9734b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f26118p) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m33213y(aVar, list, i2);
            D = m33204D(aVar, i, z);
            if (D == null) {
                i2 = m33214z(aVar, this.f26117o[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C9734b w = mo24392w(aVar, D, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo24382f()) {
            try {
                bVar = mo24392w(aVar, D, z, false);
            } catch (C9664j unused) {
                bVar = null;
            }
            return new C9740b(w, bVar, D, true);
        }
        throw C9664j.m32854a();
    }

    /* renamed from: a */
    public void mo24216a() {
        this.f26115m.clear();
        this.f26116n.clear();
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        this.f26115m.clear();
        this.f26118p = false;
        try {
            return m33212v(mo24393x(i, aVar));
        } catch (C9664j unused) {
            this.f26115m.clear();
            this.f26118p = true;
            return m33212v(mo24393x(i, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C9734b mo24392w(C9679a aVar, C9735c cVar, boolean z, boolean z2) {
        C9679a aVar2 = aVar;
        int[] i = mo24359i();
        for (int i2 = 0; i2 < i.length; i2++) {
            i[i2] = 0;
        }
        int[] b = cVar.mo24371b();
        if (z2) {
            C9726k.m33123g(aVar, b[0], i);
        } else {
            C9726k.m33122f(aVar, b[1], i);
            int i3 = 0;
            for (int length = i.length - 1; i3 < length; length--) {
                int i4 = i[i3];
                i[i3] = i[length];
                i[length] = i4;
                i3++;
            }
        }
        float d = ((float) C9691a.m32983d(i)) / 17.0f;
        float f = ((float) (cVar.mo24371b()[1] - cVar.mo24371b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] m = mo24363m();
            int[] k = mo24361k();
            float[] n = mo24364n();
            float[] l = mo24362l();
            for (int i5 = 0; i5 < i.length; i5++) {
                float f2 = (((float) i[i5]) * 1.0f) / d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw C9664j.m32854a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw C9664j.m32854a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    m[i7] = i6;
                    n[i7] = f2 - ((float) i6);
                } else {
                    k[i7] = i6;
                    l[i7] = f2 - ((float) i6);
                }
            }
            m33208r(17);
            int c = (((cVar.mo24372c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i8 = 0;
            int i9 = 0;
            for (int length2 = m.length - 1; length2 >= 0; length2--) {
                if (m33201A(cVar, z, z2)) {
                    i8 += m[length2] * f26113k[c][length2 * 2];
                }
                i9 += m[length2];
            }
            int i10 = 0;
            for (int length3 = k.length - 1; length3 >= 0; length3--) {
                if (m33201A(cVar, z, z2)) {
                    i10 += k[length3] * f26113k[c][(length3 * 2) + 1];
                }
            }
            int i11 = i8 + i10;
            if ((i9 & 1) != 0 || i9 > 13 || i9 < 4) {
                throw C9664j.m32854a();
            }
            int i12 = (13 - i9) / 2;
            int i13 = f26109g[i12];
            return new C9734b((C9738f.m33190b(m, i13, true) * f26110h[i12]) + C9738f.m33190b(k, 9 - i13, false) + f26111i[i12], i11);
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public List<C9740b> mo24393x(int i, C9679a aVar) {
        boolean z = false;
        while (!z) {
            try {
                List<C9740b> list = this.f26115m;
                list.add(mo24391F(aVar, list, i));
            } catch (C9664j e) {
                if (!this.f26115m.isEmpty()) {
                    z = true;
                } else {
                    throw e;
                }
            }
        }
        if (m33209s()) {
            return this.f26115m;
        }
        boolean z2 = !this.f26116n.isEmpty();
        m33207H(i, false);
        if (z2) {
            List<C9740b> u = m33211u(false);
            if (u != null) {
                return u;
            }
            List<C9740b> u2 = m33211u(true);
            if (u2 != null) {
                return u2;
            }
        }
        throw C9664j.m32854a();
    }
}
