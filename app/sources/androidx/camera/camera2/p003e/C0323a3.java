package androidx.camera.camera2.p003e;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.C0386a0;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0476d;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0477e;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0483k;
import androidx.camera.core.impl.C0873r2;
import androidx.camera.core.impl.C0877s1;
import androidx.camera.core.impl.C0879s2;
import androidx.camera.core.impl.C0886t2;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.p014a3.C0716b;
import androidx.camera.core.impl.p014a3.C0721d;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.camera2.e.a3 */
final class C0323a3 {

    /* renamed from: a */
    private static final Size f1342a = new Size(640, 480);

    /* renamed from: b */
    private static final Size f1343b = new Size(0, 0);

    /* renamed from: c */
    private static final Size f1344c = new Size(1920, 1080);

    /* renamed from: d */
    private static final Size f1345d = new Size(720, 480);

    /* renamed from: e */
    private static final Rational f1346e = new Rational(4, 3);

    /* renamed from: f */
    private static final Rational f1347f = new Rational(3, 4);

    /* renamed from: g */
    private static final Rational f1348g = new Rational(16, 9);

    /* renamed from: h */
    private static final Rational f1349h = new Rational(9, 16);

    /* renamed from: i */
    private final List<C0873r2> f1350i = new ArrayList();

    /* renamed from: j */
    private final Map<Integer, Size> f1351j = new HashMap();

    /* renamed from: k */
    private final String f1352k;

    /* renamed from: l */
    private final C0529r1 f1353l;

    /* renamed from: m */
    private final C0402g0 f1354m;

    /* renamed from: n */
    private final C0476d f1355n;

    /* renamed from: o */
    private final C0477e f1356o;

    /* renamed from: p */
    private final int f1357p;

    /* renamed from: q */
    private final boolean f1358q;

    /* renamed from: r */
    private final Map<Integer, List<Size>> f1359r = new HashMap();

    /* renamed from: s */
    private boolean f1360s = false;

    /* renamed from: t */
    private boolean f1361t = false;

    /* renamed from: u */
    private C0886t2 f1362u;

    /* renamed from: v */
    private Map<Integer, Size[]> f1363v = new HashMap();

    /* renamed from: w */
    private final C0539t2 f1364w;

    /* renamed from: x */
    private final C0483k f1365x = new C0483k();

    /* renamed from: androidx.camera.camera2.e.a3$a */
    static final class C0324a implements Comparator<Rational> {

        /* renamed from: f */
        private Rational f1366f;

        C0324a(Rational rational) {
            this.f1366f = rational;
        }

        /* renamed from: a */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            return (int) Math.signum(Float.valueOf(Math.abs(rational.floatValue() - this.f1366f.floatValue())).floatValue() - Float.valueOf(Math.abs(rational2.floatValue() - this.f1366f.floatValue())).floatValue());
        }
    }

    C0323a3(Context context, String str, C0418m0 m0Var, C0529r1 r1Var) {
        String str2 = (String) C1177h.m4583e(str);
        this.f1352k = str2;
        this.f1353l = (C0529r1) C1177h.m4583e(r1Var);
        this.f1355n = new C0476d(str);
        this.f1356o = new C0477e();
        this.f1364w = C0539t2.m2136b(context);
        try {
            C0402g0 c = m0Var.mo2139c(str2);
            this.f1354m = c;
            Integer num = (Integer) c.mo2119a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f1357p = num != null ? num.intValue() : 2;
            this.f1358q = m1590H();
            m1600h();
            m1601i();
            m1594a();
        } catch (C0386a0 e) {
            throw C0501l2.m2043a(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r4.f1358q != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r4.f1358q != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r4.f1358q != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r5 = f1349h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r4.f1358q != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r5 = f1346e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        r5 = f1347f;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Rational m1583A(androidx.camera.core.impl.C0877s1 r5) {
        /*
            r4 = this;
            androidx.camera.camera2.e.j3.t0.m r0 = new androidx.camera.camera2.e.j3.t0.m
            r0.<init>()
            java.lang.String r1 = r4.f1352k
            androidx.camera.camera2.e.j3.g0 r2 = r4.f1354m
            int r0 = r0.mo2230a(r1, r2)
            r1 = 0
            if (r0 == 0) goto L_0x007e
            r2 = 1
            if (r0 == r2) goto L_0x0074
            r3 = 2
            if (r0 == r3) goto L_0x0060
            r3 = 3
            if (r0 == r3) goto L_0x001b
            goto L_0x0088
        L_0x001b:
            android.util.Size r0 = r4.m1584B(r5)
            boolean r3 = r5.mo2996w()
            if (r3 == 0) goto L_0x0050
            int r5 = r5.mo2997y()
            if (r5 == 0) goto L_0x0049
            if (r5 == r2) goto L_0x0044
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Undefined target aspect ratio: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "SupportedSurfaceCombination"
            androidx.camera.core.C0949o2.m3690c(r0, r5)
            goto L_0x0088
        L_0x0044:
            boolean r5 = r4.f1358q
            if (r5 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0049:
            boolean r5 = r4.f1358q
            if (r5 == 0) goto L_0x0085
            goto L_0x0082
        L_0x004e:
            r1 = r5
            goto L_0x0088
        L_0x0050:
            if (r0 == 0) goto L_0x0088
            android.util.Rational r1 = new android.util.Rational
            int r5 = r0.getWidth()
            int r0 = r0.getHeight()
            r1.<init>(r5, r0)
            goto L_0x0088
        L_0x0060:
            r5 = 256(0x100, float:3.59E-43)
            android.util.Size r5 = r4.m1598f(r5)
            android.util.Rational r1 = new android.util.Rational
            int r0 = r5.getWidth()
            int r5 = r5.getHeight()
            r1.<init>(r0, r5)
            goto L_0x0088
        L_0x0074:
            boolean r5 = r4.f1358q
            if (r5 == 0) goto L_0x007b
        L_0x0078:
            android.util.Rational r5 = f1348g
            goto L_0x004e
        L_0x007b:
            android.util.Rational r5 = f1349h
            goto L_0x004e
        L_0x007e:
            boolean r5 = r4.f1358q
            if (r5 == 0) goto L_0x0085
        L_0x0082:
            android.util.Rational r5 = f1346e
            goto L_0x004e
        L_0x0085:
            android.util.Rational r5 = f1347f
            goto L_0x004e
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0323a3.m1583A(androidx.camera.core.impl.s1):android.util.Rational");
    }

    /* renamed from: B */
    private Size m1584B(C0877s1 s1Var) {
        return m1599g(s1Var.mo2995s((Size) null), s1Var.mo2989E(0));
    }

    /* renamed from: C */
    private List<Integer> m1585C(List<C0908x2<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (C0908x2<?> x : list) {
            int x2 = x.mo2508x(0);
            if (!arrayList2.contains(Integer.valueOf(x2))) {
                arrayList2.add(Integer.valueOf(x2));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        for (Integer intValue : arrayList2) {
            int intValue2 = intValue.intValue();
            for (C0908x2 next : list) {
                if (intValue2 == next.mo2508x(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(next)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    private Map<Rational, List<Size>> m1586D(List<Size> list) {
        HashMap hashMap = new HashMap();
        hashMap.put(f1346e, new ArrayList());
        hashMap.put(f1348g, new ArrayList());
        for (Size next : list) {
            Rational rational = null;
            for (Rational rational2 : hashMap.keySet()) {
                if (m1587E(next, rational2)) {
                    List list2 = (List) hashMap.get(rational2);
                    if (!list2.contains(next)) {
                        list2.add(next);
                    }
                    rational = rational2;
                }
            }
            if (rational == null) {
                hashMap.put(new Rational(next.getWidth(), next.getHeight()), new ArrayList(Collections.singleton(next)));
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    static boolean m1587E(Size size, Rational rational) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (m1604l(size) >= m1604l(f1342a)) {
            return m1588F(size, rational);
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m1588F(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0 && height % 16 == 0) {
            return m1591I(Math.max(0, height + -16), width, rational) || m1591I(Math.max(0, width + -16), height, rational2);
        }
        if (i == 0) {
            return m1591I(height, width, rational);
        }
        if (height % 16 == 0) {
            return m1591I(width, height, rational2);
        }
        return false;
    }

    /* renamed from: G */
    private boolean m1589G(int i) {
        Integer num = (Integer) this.f1354m.mo2119a(CameraCharacteristics.SENSOR_ORIENTATION);
        C1177h.m4584f(num, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION");
        int b = C0716b.m2966b(i);
        Integer num2 = (Integer) this.f1354m.mo2119a(CameraCharacteristics.LENS_FACING);
        C1177h.m4584f(num2, "Camera HAL in bad state, unable to retrieve the LENS_FACING");
        int a = C0716b.m2965a(b, num.intValue(), 1 == num2.intValue());
        return a == 90 || a == 270;
    }

    /* renamed from: H */
    private boolean m1590H() {
        Size size = (Size) this.f1354m.mo2119a(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        return size == null || size.getWidth() >= size.getHeight();
    }

    /* renamed from: I */
    private static boolean m1591I(int i, int i2, Rational rational) {
        C1177h.m4579a(i2 % 16 == 0);
        double numerator = ((double) (i * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + -16)) && numerator < ((double) (i2 + 16));
    }

    /* renamed from: J */
    private void m1592J() {
        this.f1364w.mo2305e();
        if (this.f1362u == null) {
            m1601i();
            return;
        }
        this.f1362u = C0886t2.m3493a(this.f1362u.mo3108b(), this.f1364w.mo2304d(), this.f1362u.mo3110d());
    }

    /* renamed from: K */
    private void m1593K(List<Size> list, Size size) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Size size2 = list.get(i2);
                if (size2.getWidth() < size.getWidth() || size2.getHeight() < size.getHeight()) {
                    break;
                }
                if (i >= 0) {
                    arrayList.add(list.get(i));
                }
                i = i2;
            }
            list.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    private void m1594a() {
    }

    /* renamed from: c */
    private Size[] m1595c(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1354m.mo2119a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = (Build.VERSION.SDK_INT >= 23 || i != 34) ? streamConfigurationMap.getOutputSizes(i) : streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            if (outputSizes != null) {
                Size[] d = m1596d(outputSizes, i);
                Arrays.sort(d, new C0721d(true));
                return d;
            }
            throw new IllegalArgumentException("Can not get supported output size for the format: " + i);
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* renamed from: d */
    private Size[] m1596d(Size[] sizeArr, int i) {
        List<Size> e = m1597e(i);
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        arrayList.removeAll(e);
        return (Size[]) arrayList.toArray(new Size[0]);
    }

    /* renamed from: e */
    private List<Size> m1597e(int i) {
        List<Size> list = this.f1359r.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        List<Size> a = this.f1355n.mo2220a(i);
        this.f1359r.put(Integer.valueOf(i), a);
        return a;
    }

    /* renamed from: f */
    private Size m1598f(int i) {
        Size size = this.f1351j.get(Integer.valueOf(i));
        if (size != null) {
            return size;
        }
        Size t = mo1934t(i);
        this.f1351j.put(Integer.valueOf(i), t);
        return t;
    }

    /* renamed from: g */
    private Size m1599g(Size size, int i) {
        return (size == null || !m1589G(i)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: h */
    private void m1600h() {
        this.f1350i.addAll(mo1931q());
        int i = this.f1357p;
        if (i == 0 || i == 1 || i == 3) {
            this.f1350i.addAll(mo1933s());
        }
        int i2 = this.f1357p;
        if (i2 == 1 || i2 == 3) {
            this.f1350i.addAll(mo1930p());
        }
        int[] iArr = (int[]) this.f1354m.mo2119a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == 3) {
                    this.f1360s = true;
                } else if (i3 == 6) {
                    this.f1361t = true;
                }
            }
        }
        if (this.f1360s) {
            this.f1350i.addAll(mo1935u());
        }
        if (this.f1361t && this.f1357p == 0) {
            this.f1350i.addAll(mo1929m());
        }
        if (this.f1357p == 3) {
            this.f1350i.addAll(mo1932r());
        }
        this.f1350i.addAll(this.f1356o.mo2221a(this.f1352k, this.f1357p));
    }

    /* renamed from: i */
    private void m1601i() {
        this.f1362u = C0886t2.m3493a(new Size(640, 480), this.f1364w.mo2304d(), m1607v());
    }

    /* renamed from: j */
    private Size[] m1602j(int i) {
        Size[] sizeArr = this.f1363v.get(Integer.valueOf(i));
        if (sizeArr != null) {
            return sizeArr;
        }
        Size[] c = m1595c(i);
        this.f1363v.put(Integer.valueOf(i), c);
        return c;
    }

    /* renamed from: k */
    private List<List<Size>> m1603k(List<List<Size>> list) {
        int i = 1;
        for (List<Size> size : list) {
            i *= size.size();
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new ArrayList());
            }
            int size2 = i / list.get(0).size();
            int i3 = i;
            for (int i4 = 0; i4 < list.size(); i4++) {
                List list2 = list.get(i4);
                for (int i5 = 0; i5 < i; i5++) {
                    ((List) arrayList.get(i5)).add((Size) list2.get((i5 % i3) / size2));
                }
                if (i4 < list.size() - 1) {
                    i3 = size2;
                    size2 /= list.get(i4 + 1).size();
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Failed to find supported resolutions.");
    }

    /* renamed from: l */
    private static int m1604l(Size size) {
        return size.getWidth() * size.getHeight();
    }

    /* renamed from: n */
    private C0879s2.C0881b m1605n(int i) {
        return i == 35 ? C0879s2.C0881b.YUV : i == 256 ? C0879s2.C0881b.JPEG : i == 32 ? C0879s2.C0881b.RAW : C0879s2.C0881b.PRIV;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Size[] m1606o(int r4, androidx.camera.core.impl.C0877s1 r5) {
        /*
            r3 = this;
            r0 = 0
            java.util.List r5 = r5.mo2993h(r0)
            if (r5 == 0) goto L_0x0026
            java.util.Iterator r5 = r5.iterator()
        L_0x000b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r4) goto L_0x000b
            java.lang.Object r5 = r1.second
            r0 = r5
            android.util.Size[] r0 = (android.util.Size[]) r0
        L_0x0026:
            if (r0 == 0) goto L_0x0035
            android.util.Size[] r0 = r3.m1596d(r0, r4)
            androidx.camera.core.impl.a3.d r4 = new androidx.camera.core.impl.a3.d
            r5 = 1
            r4.<init>(r5)
            java.util.Arrays.sort(r0, r4)
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0323a3.m1606o(int, androidx.camera.core.impl.s1):android.util.Size[]");
    }

    /* renamed from: v */
    private Size m1607v() {
        try {
            int parseInt = Integer.parseInt(this.f1352k);
            CamcorderProfile camcorderProfile = null;
            if (this.f1353l.mo1965b(parseInt, 1)) {
                camcorderProfile = this.f1353l.mo1964a(parseInt, 1);
            }
            return camcorderProfile != null ? new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight) : m1608w(parseInt);
        } catch (NumberFormatException unused) {
            return m1609x();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Size m1608w(int r4) {
        /*
            r3 = this;
            android.util.Size r0 = f1345d
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 10
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x0013
        L_0x000c:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            android.media.CamcorderProfile r4 = r1.mo1964a(r4, r2)
            goto L_0x0048
        L_0x0013:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 8
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 12
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x0029
            goto L_0x000c
        L_0x0029:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 6
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x0033
            goto L_0x000c
        L_0x0033:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 5
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x003d
            goto L_0x000c
        L_0x003d:
            androidx.camera.camera2.e.r1 r1 = r3.f1353l
            r2 = 4
            boolean r1 = r1.mo1965b(r4, r2)
            if (r1 == 0) goto L_0x0047
            goto L_0x000c
        L_0x0047:
            r4 = 0
        L_0x0048:
            if (r4 == 0) goto L_0x0053
            android.util.Size r0 = new android.util.Size
            int r1 = r4.videoFrameWidth
            int r4 = r4.videoFrameHeight
            r0.<init>(r1, r4)
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0323a3.m1608w(int):android.util.Size");
    }

    /* renamed from: x */
    private Size m1609x() {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f1354m.mo2119a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            Size[] outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                return f1345d;
            }
            Arrays.sort(outputSizes, new C0721d(true));
            for (Size size : outputSizes) {
                int width = size.getWidth();
                Size size2 = f1344c;
                if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                    return size;
                }
            }
            return f1345d;
        }
        throw new IllegalArgumentException("Can not retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public C0879s2 mo1927L(int i, Size size) {
        C0879s2.C0881b n = m1605n(i);
        C0879s2.C0880a aVar = C0879s2.C0880a.NOT_SUPPORT;
        Size f = m1598f(i);
        if (size.getWidth() * size.getHeight() <= this.f1362u.mo3108b().getWidth() * this.f1362u.mo3108b().getHeight()) {
            aVar = C0879s2.C0880a.ANALYSIS;
        } else if (size.getWidth() * size.getHeight() <= this.f1362u.mo3109c().getWidth() * this.f1362u.mo3109c().getHeight()) {
            aVar = C0879s2.C0880a.PREVIEW;
        } else if (size.getWidth() * size.getHeight() <= this.f1362u.mo3110d().getWidth() * this.f1362u.mo3110d().getHeight()) {
            aVar = C0879s2.C0880a.RECORD;
        } else if (size.getWidth() * size.getHeight() <= f.getWidth() * f.getHeight()) {
            aVar = C0879s2.C0880a.MAXIMUM;
        }
        return C0879s2.m3479a(n, aVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 boolean) = (r1v0 boolean), (r1v5 boolean) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1928b(java.util.List<androidx.camera.core.impl.C0879s2> r4) {
        /*
            r3 = this;
            java.util.List<androidx.camera.core.impl.r2> r0 = r3.f1350i
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.r2 r1 = (androidx.camera.core.impl.C0873r2) r1
            boolean r1 = r1.mo3095d(r4)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.C0323a3.mo1928b(java.util.List):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<C0873r2> mo1929m() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar = C0879s2.C0880a.PREVIEW;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0880a aVar2 = C0879s2.C0880a.MAXIMUM;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar2));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0881b bVar2 = C0879s2.C0881b.YUV;
        r2Var2.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var2);
        C0873r2 r2Var3 = new C0873r2();
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var3);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public List<C0873r2> mo1930p() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar = C0879s2.C0880a.PREVIEW;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0880a aVar2 = C0879s2.C0880a.MAXIMUM;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar2));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0881b bVar2 = C0879s2.C0881b.YUV;
        r2Var2.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var2);
        C0873r2 r2Var3 = new C0873r2();
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var3);
        C0873r2 r2Var4 = new C0873r2();
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var4.mo3094a(C0879s2.m3479a(C0879s2.C0881b.JPEG, aVar2));
        arrayList.add(r2Var4);
        C0873r2 r2Var5 = new C0873r2();
        C0879s2.C0880a aVar3 = C0879s2.C0880a.ANALYSIS;
        r2Var5.mo3094a(C0879s2.m3479a(bVar2, aVar3));
        r2Var5.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var5.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var5);
        C0873r2 r2Var6 = new C0873r2();
        r2Var6.mo3094a(C0879s2.m3479a(bVar2, aVar3));
        r2Var6.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var6.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var6);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public List<C0873r2> mo1931q() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar = C0879s2.C0880a.MAXIMUM;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        C0879s2.C0881b bVar2 = C0879s2.C0881b.JPEG;
        r2Var2.mo3094a(C0879s2.m3479a(bVar2, aVar));
        arrayList.add(r2Var2);
        C0873r2 r2Var3 = new C0873r2();
        C0879s2.C0881b bVar3 = C0879s2.C0881b.YUV;
        r2Var3.mo3094a(C0879s2.m3479a(bVar3, aVar));
        arrayList.add(r2Var3);
        C0873r2 r2Var4 = new C0873r2();
        C0879s2.C0880a aVar2 = C0879s2.C0880a.PREVIEW;
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar2));
        r2Var4.mo3094a(C0879s2.m3479a(bVar2, aVar));
        arrayList.add(r2Var4);
        C0873r2 r2Var5 = new C0873r2();
        r2Var5.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var5.mo3094a(C0879s2.m3479a(bVar2, aVar));
        arrayList.add(r2Var5);
        C0873r2 r2Var6 = new C0873r2();
        r2Var6.mo3094a(C0879s2.m3479a(bVar, aVar2));
        r2Var6.mo3094a(C0879s2.m3479a(bVar, aVar2));
        arrayList.add(r2Var6);
        C0873r2 r2Var7 = new C0873r2();
        r2Var7.mo3094a(C0879s2.m3479a(bVar, aVar2));
        r2Var7.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        arrayList.add(r2Var7);
        C0873r2 r2Var8 = new C0873r2();
        r2Var8.mo3094a(C0879s2.m3479a(bVar, aVar2));
        r2Var8.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var8.mo3094a(C0879s2.m3479a(bVar2, aVar));
        arrayList.add(r2Var8);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public List<C0873r2> mo1932r() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar = C0879s2.C0880a.PREVIEW;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0880a aVar2 = C0879s2.C0880a.ANALYSIS;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar2));
        C0879s2.C0881b bVar2 = C0879s2.C0881b.YUV;
        C0879s2.C0880a aVar3 = C0879s2.C0880a.MAXIMUM;
        r2Var.mo3094a(C0879s2.m3479a(bVar2, aVar3));
        C0879s2.C0881b bVar3 = C0879s2.C0881b.RAW;
        r2Var.mo3094a(C0879s2.m3479a(bVar3, aVar3));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar2));
        r2Var2.mo3094a(C0879s2.m3479a(C0879s2.C0881b.JPEG, aVar3));
        r2Var2.mo3094a(C0879s2.m3479a(bVar3, aVar3));
        arrayList.add(r2Var2);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public List<C0873r2> mo1933s() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar = C0879s2.C0880a.PREVIEW;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0880a aVar2 = C0879s2.C0880a.RECORD;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar2));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar));
        C0879s2.C0881b bVar2 = C0879s2.C0881b.YUV;
        r2Var2.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var2);
        C0873r2 r2Var3 = new C0873r2();
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var3.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        arrayList.add(r2Var3);
        C0873r2 r2Var4 = new C0873r2();
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar2));
        C0879s2.C0881b bVar3 = C0879s2.C0881b.JPEG;
        r2Var4.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        arrayList.add(r2Var4);
        C0873r2 r2Var5 = new C0873r2();
        r2Var5.mo3094a(C0879s2.m3479a(bVar, aVar));
        r2Var5.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        r2Var5.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        arrayList.add(r2Var5);
        C0873r2 r2Var6 = new C0873r2();
        r2Var6.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var6.mo3094a(C0879s2.m3479a(bVar2, aVar));
        r2Var6.mo3094a(C0879s2.m3479a(bVar3, C0879s2.C0880a.MAXIMUM));
        arrayList.add(r2Var6);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Size mo1934t(int i) {
        return (Size) Collections.max(Arrays.asList(m1602j(i)), new C0721d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public List<C0873r2> mo1935u() {
        ArrayList arrayList = new ArrayList();
        C0873r2 r2Var = new C0873r2();
        C0879s2.C0881b bVar = C0879s2.C0881b.RAW;
        C0879s2.C0880a aVar = C0879s2.C0880a.MAXIMUM;
        r2Var.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var);
        C0873r2 r2Var2 = new C0873r2();
        C0879s2.C0881b bVar2 = C0879s2.C0881b.PRIV;
        C0879s2.C0880a aVar2 = C0879s2.C0880a.PREVIEW;
        r2Var2.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        r2Var2.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var2);
        C0873r2 r2Var3 = new C0873r2();
        C0879s2.C0881b bVar3 = C0879s2.C0881b.YUV;
        r2Var3.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var3.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var3);
        C0873r2 r2Var4 = new C0873r2();
        r2Var4.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        r2Var4.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        r2Var4.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var4);
        C0873r2 r2Var5 = new C0873r2();
        r2Var5.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        r2Var5.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var5.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var5);
        C0873r2 r2Var6 = new C0873r2();
        r2Var6.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var6.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var6.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var6);
        C0873r2 r2Var7 = new C0873r2();
        r2Var7.mo3094a(C0879s2.m3479a(bVar2, aVar2));
        C0879s2.C0881b bVar4 = C0879s2.C0881b.JPEG;
        r2Var7.mo3094a(C0879s2.m3479a(bVar4, aVar));
        r2Var7.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var7);
        C0873r2 r2Var8 = new C0873r2();
        r2Var8.mo3094a(C0879s2.m3479a(bVar3, aVar2));
        r2Var8.mo3094a(C0879s2.m3479a(bVar4, aVar));
        r2Var8.mo3094a(C0879s2.m3479a(bVar, aVar));
        arrayList.add(r2Var8);
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public Map<C0908x2<?>, Size> mo1936y(List<C0879s2> list, List<C0908x2<?>> list2) {
        m1592J();
        ArrayList arrayList = new ArrayList(list);
        for (C0908x2<?> j : list2) {
            arrayList.add(mo1927L(j.mo2500j(), new Size(640, 480)));
        }
        if (mo1928b(arrayList)) {
            List<Integer> C = m1585C(list2);
            ArrayList arrayList2 = new ArrayList();
            for (Integer intValue : C) {
                arrayList2.add(mo1937z(list2.get(intValue.intValue())));
            }
            HashMap hashMap = null;
            Iterator<List<Size>> it = m1603k(arrayList2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List next = it.next();
                ArrayList arrayList3 = new ArrayList(list);
                for (int i = 0; i < next.size(); i++) {
                    arrayList3.add(mo1927L(list2.get(C.get(i).intValue()).mo2500j(), (Size) next.get(i)));
                }
                if (mo1928b(arrayList3)) {
                    hashMap = new HashMap();
                    for (C0908x2 next2 : list2) {
                        hashMap.put(next2, (Size) next.get(C.indexOf(Integer.valueOf(list2.indexOf(next2)))));
                    }
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1352k + " and Hardware level: " + this.f1357p + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + " New configs: " + list2);
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f1352k + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + list2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public List<Size> mo1937z(C0908x2<?> x2Var) {
        int j = x2Var.mo2500j();
        C0877s1 s1Var = (C0877s1) x2Var;
        Size[] o = m1606o(j, s1Var);
        if (o == null) {
            o = m1602j(j);
        }
        ArrayList arrayList = new ArrayList();
        Size f = s1Var.mo2992f((Size) null);
        Size t = mo1934t(j);
        if (f == null || m1604l(t) < m1604l(f)) {
            f = t;
        }
        Arrays.sort(o, new C0721d(true));
        Size B = m1584B(s1Var);
        Size size = f1342a;
        int l = m1604l(size);
        if (m1604l(f) < l) {
            size = f1343b;
        } else if (B != null && m1604l(B) < l) {
            size = B;
        }
        for (Size size2 : o) {
            if (m1604l(size2) <= m1604l(f) && m1604l(size2) >= m1604l(size) && !arrayList.contains(size2)) {
                arrayList.add(size2);
            }
        }
        if (!arrayList.isEmpty()) {
            Rational A = m1583A(s1Var);
            if (B == null) {
                B = s1Var.mo2994p((Size) null);
            }
            ArrayList arrayList2 = new ArrayList();
            new HashMap();
            if (A == null) {
                arrayList2.addAll(arrayList);
                if (B != null) {
                    m1593K(arrayList2, B);
                }
            } else {
                Map<Rational, List<Size>> D = m1586D(arrayList);
                if (B != null) {
                    for (Rational rational : D.keySet()) {
                        m1593K(D.get(rational), B);
                    }
                }
                ArrayList<Rational> arrayList3 = new ArrayList<>(D.keySet());
                Collections.sort(arrayList3, new C0324a(A));
                for (Rational rational2 : arrayList3) {
                    for (Size size3 : D.get(rational2)) {
                        if (!arrayList2.contains(size3)) {
                            arrayList2.add(size3);
                        }
                    }
                }
            }
            return this.f1365x.mo2228a(m1605n(x2Var.mo2500j()), arrayList2);
        }
        throw new IllegalArgumentException("Can not get supported output size under supported maximum for the format: " + j);
    }
}
