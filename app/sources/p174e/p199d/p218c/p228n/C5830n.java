package p174e.p199d.p218c.p228n;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import okhttp3.HttpUrl;
import p174e.p199d.p200a.p206k.C5666a;
import p174e.p199d.p200a.p206k.C5667b;
import p174e.p199d.p200a.p214s.C5695d;
import p174e.p199d.p200a.p214s.C5696e;
import p174e.p199d.p217b.C5699a;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5737g;
import p174e.p199d.p218c.p220b0.C5723a;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p228n.p229a0.C5763b;
import p174e.p199d.p218c.p228n.p229a0.C5764b0;
import p174e.p199d.p218c.p228n.p229a0.C5765b1;
import p174e.p199d.p218c.p228n.p229a0.C5769d;
import p174e.p199d.p218c.p228n.p229a0.C5770d0;
import p174e.p199d.p218c.p228n.p229a0.C5771d1;
import p174e.p199d.p218c.p228n.p229a0.C5775f;
import p174e.p199d.p218c.p228n.p229a0.C5776f0;
import p174e.p199d.p218c.p228n.p229a0.C5777f1;
import p174e.p199d.p218c.p228n.p229a0.C5780h;
import p174e.p199d.p218c.p228n.p229a0.C5781h0;
import p174e.p199d.p218c.p228n.p229a0.C5784j;
import p174e.p199d.p218c.p228n.p229a0.C5785j0;
import p174e.p199d.p218c.p228n.p229a0.C5788l;
import p174e.p199d.p218c.p228n.p229a0.C5789l0;
import p174e.p199d.p218c.p228n.p229a0.C5792n;
import p174e.p199d.p218c.p228n.p229a0.C5793n0;
import p174e.p199d.p218c.p228n.p229a0.C5796p;
import p174e.p199d.p218c.p228n.p229a0.C5797p0;
import p174e.p199d.p218c.p228n.p229a0.C5800r;
import p174e.p199d.p218c.p228n.p229a0.C5801r0;
import p174e.p199d.p218c.p228n.p229a0.C5804t;
import p174e.p199d.p218c.p228n.p229a0.C5805t0;
import p174e.p199d.p218c.p228n.p229a0.C5808v;
import p174e.p199d.p218c.p228n.p229a0.C5809v0;
import p174e.p199d.p218c.p228n.p229a0.C5812x;
import p174e.p199d.p218c.p228n.p229a0.C5813x0;
import p174e.p199d.p218c.p228n.p229a0.C5816z;
import p174e.p199d.p218c.p228n.p229a0.C5817z0;
import p174e.p199d.p218c.p234s.C5866c;

/* renamed from: e.d.c.n.n */
public class C5830n extends C5723a {
    public C5830n(C5732e eVar, C5722b bVar) {
        super(eVar, bVar);
    }

    /* renamed from: C */
    private static String m22178C(C5710k kVar, int i, int i2) {
        try {
            return kVar.mo17052q(i, i2, C5705f.f16151a);
        } catch (C5699a unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: D */
    private static boolean m22179D(C5722b bVar, int i) {
        if (i == 50341) {
            return true;
        }
        if (i == 3584) {
            return (bVar instanceof C5780h) || (bVar instanceof C5792n) || (bVar instanceof C5808v) || (bVar instanceof C5776f0) || (bVar instanceof C5793n0) || (bVar instanceof C5797p0) || (bVar instanceof C5809v0) || (bVar instanceof C5817z0) || (bVar instanceof C5771d1);
        }
        return false;
    }

    /* renamed from: E */
    private static void m22180E(C5722b bVar, int i, C5710k kVar, int i2, Boolean bool, int i3) {
        int i4 = 0;
        while (i4 < i2) {
            if (bVar.mo17161z(i4)) {
                if (i4 >= i2 - 1 || !bVar.mo17161z(i4 + 1)) {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i3];
                        for (int i5 = 0; i5 < i3; i5++) {
                            sArr[i5] = kVar.mo17042f(((i4 + i5) * 2) + i);
                        }
                        bVar.mo17129N(i4, sArr);
                    } else {
                        int[] iArr = new int[i3];
                        for (int i6 = 0; i6 < i3; i6++) {
                            iArr[i6] = kVar.mo17054s(((i4 + i6) * 2) + i);
                        }
                        bVar.mo17129N(i4, iArr);
                    }
                    i4 += i3 - 1;
                } else {
                    bVar.mo17128M(i4, bool.booleanValue() ? Short.valueOf(kVar.mo17042f((i4 * 2) + i)) : Integer.valueOf(kVar.mo17054s((i4 * 2) + i)));
                }
            }
            i4++;
        }
    }

    /* renamed from: F */
    private static void m22181F(C5788l lVar, int i, C5710k kVar) {
        int i2 = i + 8;
        try {
            lVar.mo17135T(0, kVar.mo17053r(i2, 8, C5705f.f16151a));
            lVar.mo17125J(9, kVar.mo17056u(i2 + 9));
            lVar.mo17125J(10, kVar.mo17056u(i2 + 10));
            lVar.mo17125J(12, kVar.mo17054s(i2 + 12));
            lVar.mo17125J(14, kVar.mo17054s(i2 + 14));
            lVar.mo17125J(16, kVar.mo17054s(i2 + 16));
            lVar.mo17118C(18, kVar.mo17018c(i2 + 18, 2));
            lVar.mo17118C(20, kVar.mo17018c(i2 + 20, 4));
            lVar.mo17125J(24, kVar.mo17054s(i2 + 24));
            lVar.mo17125J(27, kVar.mo17056u(i2 + 27));
            lVar.mo17125J(28, kVar.mo17056u(i2 + 28));
            lVar.mo17125J(29, kVar.mo17056u(i2 + 29));
            lVar.mo17125J(30, kVar.mo17054s(i2 + 30));
            lVar.mo17127L(32, kVar.mo17055t(i2 + 32));
            lVar.mo17125J(36, kVar.mo17042f(i2 + 36));
            lVar.mo17125J(56, kVar.mo17056u(i2 + 56));
            lVar.mo17125J(64, kVar.mo17056u(i2 + 64));
            lVar.mo17125J(92, kVar.mo17056u(i2 + 92));
            lVar.mo17125J(93, kVar.mo17056u(i2 + 93));
            lVar.mo17125J(94, kVar.mo17054s(i2 + 94));
            lVar.mo17125J(96, kVar.mo17054s(i2 + 96));
            lVar.mo17125J(98, kVar.mo17054s(i2 + 98));
            lVar.mo17125J(100, kVar.mo17054s(i2 + 100));
            lVar.mo17125J(102, kVar.mo17054s(i2 + 102));
            lVar.mo17125J(104, kVar.mo17054s(i2 + 104));
            lVar.mo17125J(107, kVar.mo17046j(i2 + 107));
        } catch (IOException e) {
            lVar.mo17137a("Error processing Kodak makernote data: " + e.getMessage());
        }
    }

    /* renamed from: G */
    private boolean m22182G(int i, Set<Integer> set, int i2, C5710k kVar) {
        int i3;
        int h;
        Class cls;
        Class cls2;
        int i4;
        int i5 = i;
        Set<Integer> set2 = set;
        int i6 = i2;
        C5710k kVar2 = kVar;
        Class<C5793n0> cls3 = C5793n0.class;
        Class<C5780h> cls4 = C5780h.class;
        Class<C5808v> cls5 = C5808v.class;
        Class<C5771d1> cls6 = C5771d1.class;
        Class<C5776f0> cls7 = C5776f0.class;
        C5722b e = this.f16194d.mo17170e(C5820d.class);
        String r = e == null ? null : e.mo17153r(271);
        String C = m22178C(kVar2, i5, 2);
        String C2 = m22178C(kVar2, i5, 3);
        String C3 = m22178C(kVar2, i5, 4);
        String C4 = m22178C(kVar2, i5, 5);
        String str = C;
        String C5 = m22178C(kVar2, i5, 6);
        String C6 = m22178C(kVar2, i5, 7);
        Class<C5793n0> cls8 = cls3;
        Class<C5780h> cls9 = cls4;
        String C7 = m22178C(kVar2, i5, 8);
        String C8 = m22178C(kVar2, i5, 9);
        String str2 = C6;
        String C9 = m22178C(kVar2, i5, 10);
        String str3 = C2;
        String C10 = m22178C(kVar2, i5, 12);
        boolean v = kVar.mo17057v();
        String str4 = C5;
        if ("OLYMP\u0000".equals(C5) || "EPSON".equals(C4) || "AGFA".equals(C3)) {
            mo17162B(cls7);
        } else {
            if ("OLYMPUS\u0000II".equals(C9)) {
                mo17162B(cls7);
                h = i5 + 12;
            } else if (r != null && r.toUpperCase().startsWith("MINOLTA")) {
                mo17162B(cls7);
                C5696e.m21194b(this, kVar2, set2, i5, i6);
                kVar2.mo17058w(v);
                return true;
            } else if (r == null || !r.trim().toUpperCase().startsWith("NIKON")) {
                if ("SONY CAM".equals(C7) || "SONY DSC".equals(C7)) {
                    mo17162B(cls6);
                } else if (r == null || !r.startsWith("SONY") || Arrays.equals(kVar2.mo17018c(i5, 2), new byte[]{1, 0})) {
                    if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(C10)) {
                        kVar2.mo17058w(true);
                        mo17162B(C5777f1.class);
                        i5 += 20;
                    } else if ("SIGMA\u0000\u0000\u0000".equals(C7) || "FOVEON\u0000\u0000".equals(C7)) {
                        mo17162B(C5765b1.class);
                        i3 = 10;
                        i5 += i3;
                    } else {
                        String str5 = str3;
                        if ("KDK".equals(str5)) {
                            kVar2.mo17058w(str2.equals("KDK INFO"));
                            C5788l lVar = new C5788l();
                            this.f16194d.mo17166a(lVar);
                            m22181F(lVar, i5, kVar2);
                        } else {
                            String str6 = str2;
                            if ("Canon".equalsIgnoreCase(r)) {
                                cls = C5769d.class;
                            } else if (r == null || !r.toUpperCase().startsWith("CASIO")) {
                                Class<C5780h> cls10 = cls9;
                                if ("FUJIFILM".equals(C7) || "Fujifilm".equalsIgnoreCase(r)) {
                                    kVar2.mo17058w(false);
                                    h = kVar2.mo17044h(i5 + 8) + i5;
                                    mo17162B(C5784j.class);
                                } else if ("KYOCERA".equals(str6)) {
                                    mo17162B(C5792n.class);
                                    i5 += 22;
                                } else {
                                    if ("LEICA".equals(C4)) {
                                        kVar2.mo17058w(false);
                                        if ("LEICA\u0000\u0001\u0000".equals(C7) || "LEICA\u0000\u0004\u0000".equals(C7) || "LEICA\u0000\u0005\u0000".equals(C7) || "LEICA\u0000\u0006\u0000".equals(C7) || "LEICA\u0000\u0007\u0000".equals(C7)) {
                                            cls2 = C5800r.class;
                                        } else {
                                            if ("Leica Camera AG".equals(r)) {
                                                mo17162B(C5796p.class);
                                                i4 = 8;
                                            } else {
                                                i4 = 8;
                                                if (!"LEICA".equals(r)) {
                                                    return false;
                                                }
                                                mo17162B(cls8);
                                            }
                                            i5 += i4;
                                        }
                                    } else {
                                        Class<C5793n0> cls11 = cls8;
                                        if ("Panasonic\u0000\u0000\u0000".equals(C10)) {
                                            mo17162B(cls11);
                                        } else if ("AOC\u0000".equals(C3)) {
                                            mo17162B(cls10);
                                            h = i5 + 6;
                                        } else if (r != null && (r.toUpperCase().startsWith("PENTAX") || r.toUpperCase().startsWith("ASAHI"))) {
                                            mo17162B(C5797p0.class);
                                            C5696e.m21194b(this, kVar2, set2, i5, i5);
                                        } else if ("SANYO\u0000\u0001\u0000".equals(C7)) {
                                            cls2 = C5817z0.class;
                                        } else if (r == null || !r.toLowerCase().startsWith("ricoh")) {
                                            if (C9.equals("Apple iOS\u0000")) {
                                                boolean v2 = kVar.mo17057v();
                                                kVar2.mo17058w(true);
                                                mo17162B(C5763b.class);
                                                C5696e.m21194b(this, kVar2, set2, i5 + 14, i5);
                                                kVar2.mo17058w(v2);
                                            } else if (kVar2.mo17054s(i5) == 61697) {
                                                C5801r0 r0Var = new C5801r0();
                                                this.f16194d.mo17166a(r0Var);
                                                m22184I(r0Var, i5, kVar2);
                                            } else if (C8.equalsIgnoreCase("RECONYXUF")) {
                                                C5805t0 t0Var = new C5805t0();
                                                this.f16194d.mo17166a(t0Var);
                                                m22185J(t0Var, i5, kVar2);
                                            } else if (!"SAMSUNG".equals(r)) {
                                                return false;
                                            } else {
                                                cls = C5813x0.class;
                                            }
                                        } else if (str.equals("Rv") || str5.equals("Rev")) {
                                            return false;
                                        } else {
                                            if (C4.equalsIgnoreCase("Ricoh")) {
                                                kVar2.mo17058w(true);
                                                cls2 = C5809v0.class;
                                            }
                                        }
                                    }
                                    mo17162B(cls2);
                                    h = i5 + 8;
                                }
                            } else if ("QVC\u0000\u0000\u0000".equals(str4)) {
                                mo17162B(cls9);
                                i3 = 6;
                                i5 += i3;
                            } else {
                                cls = C5775f.class;
                            }
                            mo17162B(cls);
                        }
                        kVar2.mo17058w(v);
                        return true;
                    }
                    C5696e.m21194b(this, kVar2, set2, i5, i6);
                    kVar2.mo17058w(v);
                    return true;
                } else {
                    mo17162B(cls6);
                    C5696e.m21194b(this, kVar2, set2, i5, i6);
                    kVar2.mo17058w(v);
                    return true;
                }
                i3 = 12;
                i5 += i3;
                C5696e.m21194b(this, kVar2, set2, i5, i6);
                kVar2.mo17058w(v);
                return true;
            } else if ("Nikon".equals(C4)) {
                short u = kVar2.mo17056u(i5 + 6);
                if (u == 1) {
                    mo17162B(C5804t.class);
                } else if (u != 2) {
                    this.f16193c.mo17137a("Unsupported Nikon makernote data ignored.");
                    kVar2.mo17058w(v);
                    return true;
                } else {
                    mo17162B(cls5);
                    h = i5 + 18;
                    i5 += 10;
                }
            } else {
                mo17162B(cls5);
                C5696e.m21194b(this, kVar2, set2, i5, i6);
                kVar2.mo17058w(v);
                return true;
            }
            C5696e.m21194b(this, kVar2, set2, h, i5);
            kVar2.mo17058w(v);
            return true;
        }
        i3 = 8;
        i5 += i3;
        C5696e.m21194b(this, kVar2, set2, i5, i6);
        kVar2.mo17058w(v);
        return true;
    }

    /* renamed from: H */
    private static void m22183H(C5842z zVar, int i, C5710k kVar, int i2) {
        Boolean bool;
        int i3;
        String str;
        if (i2 == 0) {
            str = "Empty PrintIM data";
        } else if (i2 <= 15) {
            str = "Bad PrintIM data";
        } else {
            String q = kVar.mo17052q(i, 12, C5705f.f16151a);
            if (!q.startsWith("PrintIM")) {
                str = "Invalid PrintIM header";
            } else {
                int i4 = i + 14;
                int s = kVar.mo17054s(i4);
                if (i2 < (s * 6) + 16) {
                    bool = Boolean.valueOf(kVar.mo17057v());
                    kVar.mo17058w(!kVar.mo17057v());
                    i3 = kVar.mo17054s(i4);
                    if (i2 < (i3 * 6) + 16) {
                        str = "Bad PrintIM size";
                    }
                } else {
                    i3 = s;
                    bool = null;
                }
                String substring = q.substring(8, 12);
                zVar.mo17128M(0, substring);
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = i + 16 + (i5 * 6);
                    zVar.mo17128M(kVar.mo17054s(i6), Long.valueOf(kVar.mo17055t(i6 + 2)));
                }
                if (bool != null) {
                    kVar.mo17058w(bool.booleanValue());
                    return;
                }
                return;
            }
        }
        zVar.mo17137a(str);
    }

    /* renamed from: I */
    private static void m22184I(C5801r0 r0Var, int i, C5710k kVar) {
        Integer num;
        r0Var.mo17128M(0, Integer.valueOf(kVar.mo17054s(i)));
        int i2 = i + 2;
        int s = kVar.mo17054s(i2);
        int s2 = kVar.mo17054s(i2 + 2);
        int s3 = kVar.mo17054s(i2 + 4);
        String str = String.format("%04X", new Object[]{Integer.valueOf(kVar.mo17054s(i2 + 6))}) + String.format("%04X", new Object[]{Integer.valueOf(kVar.mo17054s(i2 + 8))});
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            num = null;
        }
        if (num != null) {
            r0Var.mo17133R(2, String.format("%d.%d.%d.%s", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), num}));
        } else {
            r0Var.mo17133R(2, String.format("%d.%d.%d", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3)}));
            r0Var.mo17137a("Error processing Reconyx HyperFire makernote data: build '" + str + "' is not in the expected format and will be omitted from Firmware Version.");
        }
        r0Var.mo17133R(12, String.valueOf((char) kVar.mo17054s(i + 12)));
        int i3 = i + 14;
        r0Var.mo17126K(14, new int[]{kVar.mo17054s(i3), kVar.mo17054s(i3 + 2)});
        int i4 = i + 18;
        r0Var.mo17125J(18, (kVar.mo17054s(i4) << 16) + kVar.mo17054s(i4 + 2));
        int i5 = i + 22;
        int s4 = kVar.mo17054s(i5);
        int s5 = kVar.mo17054s(i5 + 2);
        int s6 = kVar.mo17054s(i5 + 4);
        int s7 = kVar.mo17054s(i5 + 6);
        int s8 = kVar.mo17054s(i5 + 8);
        int s9 = kVar.mo17054s(i5 + 10);
        if (s4 < 0 || s4 >= 60 || s5 < 0 || s5 >= 60 || s6 < 0 || s6 >= 24 || s7 < 1 || s7 >= 13 || s8 < 1 || s8 >= 32 || s9 < 1 || s9 > 9999) {
            r0Var.mo17137a("Error processing Reconyx HyperFire makernote data: Date/Time Original " + s9 + "-" + s7 + "-" + s8 + " " + s6 + ":" + s5 + ":" + s4 + " is not a valid date/time.");
        } else {
            r0Var.mo17133R(22, String.format("%4d:%2d:%2d %2d:%2d:%2d", new Object[]{Integer.valueOf(s9), Integer.valueOf(s7), Integer.valueOf(s8), Integer.valueOf(s6), Integer.valueOf(s5), Integer.valueOf(s4)}));
        }
        r0Var.mo17125J(36, kVar.mo17054s(i + 36));
        r0Var.mo17125J(38, kVar.mo17042f(i + 38));
        r0Var.mo17125J(40, kVar.mo17042f(i + 40));
        r0Var.mo17135T(42, new C5737g(kVar.mo17018c(i + 42, 28), C5705f.f16156f));
        r0Var.mo17125J(72, kVar.mo17054s(i + 72));
        r0Var.mo17125J(74, kVar.mo17054s(i + 74));
        r0Var.mo17125J(76, kVar.mo17054s(i + 76));
        r0Var.mo17125J(78, kVar.mo17054s(i + 78));
        r0Var.mo17125J(80, kVar.mo17054s(i + 80));
        r0Var.mo17125J(82, kVar.mo17054s(i + 82));
        r0Var.mo17121F(84, ((double) kVar.mo17054s(i + 84)) / 1000.0d);
        r0Var.mo17133R(86, kVar.mo17048m(i + 86, 44, C5705f.f16151a));
    }

    /* renamed from: J */
    private static void m22185J(C5805t0 t0Var, int i, C5710k kVar) {
        Charset charset = C5705f.f16151a;
        t0Var.mo17133R(0, kVar.mo17052q(i, 9, charset));
        t0Var.mo17133R(52, kVar.mo17052q(i + 52, 1, charset));
        int i2 = i + 53;
        t0Var.mo17126K(53, new int[]{kVar.mo17017b(i2), kVar.mo17017b(i2 + 1)});
        int i3 = i + 59;
        kVar.mo17017b(i3);
        kVar.mo17017b(i3 + 1);
        kVar.mo17017b(i3 + 2);
        kVar.mo17017b(i3 + 3);
        kVar.mo17017b(i3 + 4);
        t0Var.mo17125J(67, kVar.mo17017b(i + 67));
        t0Var.mo17125J(72, kVar.mo17017b(i + 72));
        t0Var.mo17135T(75, new C5737g(kVar.mo17018c(i + 75, 14), charset));
        t0Var.mo17133R(80, kVar.mo17048m(i + 80, 20, charset));
    }

    /* renamed from: b */
    public boolean mo16989b() {
        C5722b bVar = this.f16193c;
        if (!(bVar instanceof C5820d) && !(bVar instanceof C5822f)) {
            return bVar instanceof C5829m;
        }
        mo17162B(bVar.mo17138b(297) ? C5822f.class : C5829m.class);
        return true;
    }

    /* renamed from: d */
    public void mo16991d(int i) {
        Class cls;
        if (i != 42) {
            if (i == 85) {
                cls = C5836t.class;
                mo17162B(cls);
            } else if (!(i == 20306 || i == 21330)) {
                throw new C5695d(String.format("Unexpected TIFF marker: 0x%X", new Object[]{Integer.valueOf(i)}));
            }
        }
        cls = C5820d.class;
        mo17162B(cls);
    }

    /* renamed from: e */
    public Long mo16992e(int i, int i2, long j) {
        return i2 == 13 ? Long.valueOf(j * 4) : i2 == 0 ? 0L : null;
    }

    /* renamed from: f */
    public boolean mo16994f(int i, Set<Integer> set, int i2, C5710k kVar, int i3, int i4) {
        StringBuilder sb;
        C5722b bVar;
        String str;
        int i5 = i;
        Set<Integer> set2 = set;
        int i6 = i2;
        C5710k kVar2 = kVar;
        int i7 = i3;
        int i8 = i4;
        if (i7 == 0) {
            if (this.f16193c.mo17138b(i7)) {
                return false;
            }
            if (i8 == 0) {
                return true;
            }
        }
        if (i7 == 37500 && (this.f16193c instanceof C5827k)) {
            return m22182G(i, set, i2, kVar);
        }
        if (i7 != 33723 || !(this.f16193c instanceof C5820d)) {
            if (i7 == 700 && (this.f16193c instanceof C5820d)) {
                new C5735c().mo17178g(kVar.mo17047l(i, i8), this.f16194d, this.f16193c);
                return true;
            } else if (m22179D(this.f16193c, i7)) {
                C5842z zVar = new C5842z();
                zVar.mo17130O(this.f16193c);
                this.f16194d.mo17166a(zVar);
                m22183H(zVar, i, kVar, i8);
                return true;
            } else {
                C5722b bVar2 = this.f16193c;
                if (bVar2 instanceof C5776f0) {
                    if (i7 == 8208) {
                        mo17162B(C5816z.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 8224) {
                        mo17162B(C5812x.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 8256) {
                        mo17162B(C5770d0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 8272) {
                        mo17162B(C5764b0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 12288) {
                        mo17162B(C5789l0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 16384) {
                        mo17162B(C5776f0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 8240) {
                        mo17162B(C5785j0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    } else if (i7 == 8241) {
                        mo17162B(C5781h0.class);
                        C5696e.m21194b(this, kVar, set, i, i2);
                        return true;
                    }
                }
                if (bVar2 instanceof C5836t) {
                    if (i7 == 19) {
                        C5840x xVar = new C5840x();
                        xVar.mo17130O(this.f16193c);
                        this.f16194d.mo17166a(xVar);
                        m22180E(xVar, i, kVar, i4, Boolean.FALSE, 2);
                        return true;
                    } else if (i7 == 39) {
                        C5838v vVar = new C5838v();
                        vVar.mo17130O(this.f16193c);
                        this.f16194d.mo17166a(vVar);
                        m22180E(vVar, i, kVar, i4, Boolean.FALSE, 3);
                        return true;
                    } else if (i7 == 281) {
                        C5834r rVar = new C5834r();
                        rVar.mo17130O(this.f16193c);
                        this.f16194d.mo17166a(rVar);
                        m22180E(rVar, i, kVar, i4, Boolean.TRUE, 1);
                        return true;
                    }
                }
                if (i7 == 46 && (bVar2 instanceof C5836t)) {
                    try {
                        for (C5722b next : C5666a.m21099c(new ByteArrayInputStream(kVar.mo17018c(i, i8))).mo17167b()) {
                            next.mo17130O(this.f16193c);
                            this.f16194d.mo17166a(next);
                        }
                        return true;
                    } catch (C5667b e) {
                        bVar = this.f16193c;
                        sb = new StringBuilder();
                        sb.append("Error processing JpgFromRaw: ");
                        str = e.getMessage();
                        sb.append(str);
                        bVar.mo17137a(sb.toString());
                        return false;
                    } catch (IOException e2) {
                        bVar = this.f16193c;
                        sb = new StringBuilder();
                        sb.append("Error reading JpgFromRaw: ");
                        str = e2.getMessage();
                        sb.append(str);
                        bVar.mo17137a(sb.toString());
                        return false;
                    }
                }
                return false;
            }
        } else if (kVar.mo17046j(i) != 28) {
            return false;
        } else {
            byte[] c = kVar.mo17018c(i, i8);
            new C5866c().mo17798d(new C5713n(c), this.f16194d, (long) c.length, this.f16193c);
            return true;
        }
    }

    /* renamed from: u */
    public boolean mo17009u(int i) {
        Class cls;
        Class<C5827k> cls2 = C5827k.class;
        if (i == 330) {
            mo17162B(cls2);
            return true;
        }
        C5722b bVar = this.f16193c;
        if ((bVar instanceof C5820d) || (bVar instanceof C5836t)) {
            if (i == 34665) {
                mo17162B(cls2);
                return true;
            } else if (i == 34853) {
                cls = C5832p.class;
                mo17162B(cls);
                return true;
            }
        }
        if ((bVar instanceof C5827k) && i == 40965) {
            cls = C5824h.class;
            mo17162B(cls);
            return true;
        } else if (!(bVar instanceof C5776f0)) {
            return false;
        } else {
            if (i == 8208) {
                cls = C5816z.class;
            } else if (i == 8224) {
                cls = C5812x.class;
            } else if (i == 8256) {
                cls = C5770d0.class;
            } else if (i == 8272) {
                cls = C5764b0.class;
            } else if (i == 12288) {
                cls = C5789l0.class;
            } else if (i == 16384) {
                cls = C5776f0.class;
            } else if (i == 8240) {
                cls = C5785j0.class;
            } else if (i != 8241) {
                return false;
            } else {
                cls = C5781h0.class;
            }
            mo17162B(cls);
            return true;
        }
    }
}
