package p174e.p199d.p218c.p246z;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.z.d */
public class C5984d extends C5739i<C5985e> {
    public C5984d(C5985e eVar) {
        super(eVar);
    }

    /* renamed from: E */
    private String m22566E(int i) {
        byte[] e = ((C5985e) this.f16215a).mo17141e(i);
        if (e == null) {
            return null;
        }
        return new String(e);
    }

    /* renamed from: v */
    private String m22567v(int i) {
        byte[] e = ((C5985e) this.f16215a).mo17141e(i);
        if (e == null) {
            return null;
        }
        try {
            return String.format("%d", new Object[]{Integer.valueOf(new C5700b(e).mo17044h(0))});
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: w */
    private String m22568w(int i) {
        byte[] e = ((C5985e) this.f16215a).mo17141e(i);
        if (e == null) {
            return null;
        }
        return String.format("%d bytes binary data", new Object[]{Integer.valueOf(e.length)});
    }

    /* renamed from: x */
    private String m22569x(int i) {
        byte[] e = ((C5985e) this.f16215a).mo17141e(i);
        if (e == null || e.length == 0) {
            return null;
        }
        return e[0] == 0 ? "No" : "Yes";
    }

    /* renamed from: A */
    public String mo17884A(int i) {
        String str;
        String str2;
        int i2;
        int i3;
        C5991k kVar;
        C5700b bVar;
        String str3 = ")";
        String str4 = ",";
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(i);
            if (e == null) {
                return null;
            }
            C5700b bVar2 = new C5700b(e);
            short s = 1;
            int k = ((int) ((bVar2.mo17019k() - ((long) bVar2.mo17017b(((int) bVar2.mo17019k()) - 1))) - 1)) / 26;
            C5991k kVar2 = new C5991k();
            C5991k kVar3 = new C5991k();
            ArrayList arrayList = new ArrayList();
            String str5 = null;
            int i4 = 0;
            while (i4 < k) {
                int i5 = i4 * 26;
                try {
                    short f = bVar2.mo17042f(i5);
                    if (f != 0) {
                        i2 = i4;
                        if (f == s || f == 2) {
                            str2 = str3;
                            str = str4;
                            i3 = k;
                            C5700b bVar3 = bVar2;
                            C5991k kVar4 = kVar2;
                            C5983c cVar = f == 1 ? new C5983c("Linked") : new C5983c("Unlinked");
                            int i6 = 0;
                            while (i6 < 6) {
                                int i7 = i6 * 4;
                                C5700b bVar4 = bVar3;
                                cVar.mo17883c(i6, ((double) bVar4.mo17046j(i7 + 2 + i5)) + (((double) bVar4.mo17043g((i7 + 3) + i5)) / Math.pow(2.0d, 24.0d)));
                                i6++;
                                i5 = i5;
                                bVar3 = bVar4;
                            }
                            bVar2 = bVar3;
                            kVar2 = kVar4;
                            kVar2.mo17900a(cVar);
                        } else {
                            if (f != 3) {
                                short s2 = 4;
                                if (f != 4) {
                                    if (f != 5) {
                                        if (f == 8) {
                                            str5 = bVar2.mo17042f(i5 + 2) == 1 ? "with all pixels" : "without all pixels";
                                        }
                                        str2 = str3;
                                        str = str4;
                                        i3 = k;
                                    } else {
                                        s2 = 4;
                                    }
                                }
                                C5983c cVar2 = f == s2 ? new C5983c("Linked") : new C5983c("Unlinked");
                                int i8 = 0;
                                while (i8 < 6) {
                                    int i9 = i8 * 4;
                                    cVar2.mo17883c(i8, ((double) bVar2.mo17046j(i9 + 2 + i5)) + (((double) bVar2.mo17043g((i9 + 3) + i5)) / Math.pow(2.0d, 24.0d)));
                                    i8++;
                                    k = k;
                                    str3 = str3;
                                    str4 = str4;
                                    bVar2 = bVar2;
                                    kVar2 = kVar2;
                                }
                                str2 = str3;
                                str = str4;
                                i3 = k;
                                bVar = bVar2;
                                kVar = kVar2;
                                kVar3.mo17900a(cVar2);
                            } else {
                                str2 = str3;
                                str = str4;
                                i3 = k;
                                bVar = bVar2;
                                kVar = kVar2;
                                if (kVar3.mo17903d() != 0) {
                                    arrayList.add(kVar3);
                                }
                                kVar3 = new C5991k("Open Subpath");
                            }
                            bVar2 = bVar;
                            kVar2 = kVar;
                        }
                    } else {
                        str2 = str3;
                        str = str4;
                        i3 = k;
                        i2 = i4;
                        if (kVar2.mo17903d() != 0) {
                            arrayList.add(kVar2);
                        }
                        kVar2 = new C5991k("Closed Subpath");
                    }
                    i4 = i2 + 1;
                    k = i3;
                    str3 = str2;
                    str4 = str;
                    s = 1;
                } catch (Exception unused) {
                    return null;
                }
            }
            String str6 = str3;
            String str7 = str4;
            if (kVar2.mo17903d() != 0) {
                arrayList.add(kVar2);
            }
            if (kVar3.mo17903d() != 0) {
                arrayList.add(kVar3);
            }
            byte b = bVar2.mo17017b(((int) bVar2.mo17019k()) - 1);
            String q = bVar2.mo17052q((((int) bVar2.mo17019k()) - b) - 1, b, C5705f.f16154d);
            StringBuilder sb = new StringBuilder();
            sb.append('\"');
            sb.append(q);
            sb.append('\"');
            sb.append(" having ");
            if (str5 != null) {
                sb.append("initial fill rule \"");
                sb.append(str5);
                sb.append("\" and ");
            }
            sb.append(arrayList.size());
            sb.append(arrayList.size() == 1 ? " subpath:" : " subpaths:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5991k kVar5 = (C5991k) it.next();
                sb.append("\n- ");
                sb.append(kVar5.mo17902c());
                sb.append(" with ");
                sb.append(arrayList.size());
                sb.append(arrayList.size() == 1 ? " knot:" : " knots:");
                for (C5983c next : kVar5.mo17901b()) {
                    sb.append("\n  - ");
                    sb.append(next.mo17882b());
                    sb.append(" (");
                    sb.append(next.mo17881a(0));
                    String str8 = str7;
                    sb.append(str8);
                    sb.append(next.mo17881a(1));
                    String str9 = str6;
                    sb.append(str9);
                    sb.append(" (");
                    sb.append(next.mo17881a(2));
                    sb.append(str8);
                    sb.append(next.mo17881a(3));
                    sb.append(str9);
                    sb.append(" (");
                    sb.append(next.mo17881a(4));
                    sb.append(str8);
                    sb.append(next.mo17881a(5));
                    sb.append(str9);
                    str7 = str8;
                    str6 = str9;
                }
            }
            return sb.toString();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: B */
    public String mo17885B() {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(1064);
            if (e == null) {
                return null;
            }
            return Double.toString(new C5700b(e).mo17040d(4));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: C */
    public String mo17886C() {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(1062);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            int h = bVar.mo17044h(0);
            float e2 = bVar.mo17041e(2);
            float e3 = bVar.mo17041e(6);
            float e4 = bVar.mo17041e(10);
            if (h == 0) {
                return "Centered, Scale " + e4;
            } else if (h == 1) {
                return "Size to fit";
            } else {
                if (h != 2) {
                    return String.format("Unknown %04X, X:%s Y:%s, Scale:%s", new Object[]{Integer.valueOf(h), Float.valueOf(e2), Float.valueOf(e3), Float.valueOf(e4)});
                }
                return String.format("User defined, X:%s Y:%s, Scale:%s", new Object[]{Float.valueOf(e2), Float.valueOf(e3), Float.valueOf(e4)});
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: D */
    public String mo17887D() {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            float o = bVar.mo17050o(0);
            float o2 = bVar.mo17050o(8);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            return decimalFormat.format((double) o) + "x" + decimalFormat.format((double) o2) + " DPI";
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: F */
    public String mo17888F() {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(1050);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            int h = bVar.mo17044h(20) * 2;
            return String.format("%s (%d,%d,%d,%d) %d Slices", new Object[]{bVar.mo17051p(24, h, "UTF-16"), Integer.valueOf(bVar.mo17044h(4)), Integer.valueOf(bVar.mo17044h(8)), Integer.valueOf(bVar.mo17044h(12)), Integer.valueOf(bVar.mo17044h(16)), Integer.valueOf(bVar.mo17044h(h + 24))});
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: G */
    public String mo17889G(int i) {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(i);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            int h = bVar.mo17044h(0);
            int h2 = bVar.mo17044h(4);
            int h3 = bVar.mo17044h(8);
            int h4 = bVar.mo17044h(16);
            int h5 = bVar.mo17044h(20);
            int h6 = bVar.mo17044h(24);
            Object[] objArr = new Object[6];
            objArr[0] = h == 1 ? "JpegRGB" : "RawRGB";
            objArr[1] = Integer.valueOf(h2);
            objArr[2] = Integer.valueOf(h3);
            objArr[3] = Integer.valueOf(h4);
            objArr[4] = Integer.valueOf(h6);
            objArr[5] = Integer.valueOf(h5);
            return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", objArr);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: H */
    public String mo17890H() {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(1057);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            int h = bVar.mo17044h(0);
            int h2 = bVar.mo17044h(5) * 2;
            String p = bVar.mo17051p(9, h2, "UTF-16");
            int i = 9 + h2;
            int h3 = bVar.mo17044h(i);
            int i2 = i + 4;
            int i3 = h3 * 2;
            return String.format("%d (%s, %s) %d", new Object[]{Integer.valueOf(h), p, bVar.mo17051p(i2, i3, "UTF-16"), Integer.valueOf(bVar.mo17044h(i2 + i3))});
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i != 1002) {
            if (i == 1005) {
                return mo17887D();
            }
            if (i == 1028) {
                return m22568w(i);
            }
            if (i == 1030) {
                return mo17892z();
            }
            if (!(i == 1044 || i == 1054)) {
                if (i == 1057) {
                    return mo17890H();
                }
                if (i == 1062) {
                    return mo17886C();
                }
                if (i == 1064) {
                    return mo17885B();
                }
                if (i == 2999) {
                    return mo17891y(i);
                }
                if (i != 1049) {
                    if (i == 1050) {
                        return mo17888F();
                    }
                    switch (i) {
                        case 1033:
                        case 1036:
                            return mo17889G(i);
                        case 1034:
                            return m22569x(i);
                        case 1035:
                            break;
                        case 1037:
                            break;
                        default:
                            return (i < 2000 || i > 2998) ? super.mo17110f(i) : mo17884A(i);
                    }
                }
            }
            return m22567v(i);
        }
        return m22566E(i);
    }

    /* renamed from: y */
    public String mo17891y(int i) {
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(i);
            if (e == null) {
                return null;
            }
            C5700b bVar = new C5700b(e);
            return new String(bVar.mo17018c(1, bVar.mo17017b(0)), "UTF-8");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: z */
    public String mo17892z() {
        String str;
        try {
            byte[] e = ((C5985e) this.f16215a).mo17141e(1030);
            if (e == null) {
                return ((C5985e) this.f16215a).mo17153r(1030);
            }
            C5700b bVar = new C5700b(e);
            int s = bVar.mo17054s(0);
            int s2 = bVar.mo17054s(2);
            int s3 = bVar.mo17054s(4);
            int i = (s > 65535 || s < 65533) ? s <= 8 ? s + 4 : s : s - 65532;
            switch (s) {
                case 0:
                    str = "Low";
                    break;
                case 1:
                case 2:
                case 3:
                    str = "Medium";
                    break;
                case 4:
                case 5:
                    str = "High";
                    break;
                case 6:
                case 7:
                case 8:
                    str = "Maximum";
                    break;
                default:
                    switch (s) {
                        case 65533:
                        case 65534:
                        case Settings.DEFAULT_INITIAL_WINDOW_SIZE /*65535*/:
                            break;
                        default:
                            str = "Unknown";
                            break;
                    }
                    str = "Low";
                    break;
            }
            return String.format("%d (%s), %s format, %s scans", new Object[]{Integer.valueOf(i), str, s2 != 0 ? s2 != 1 ? s2 != 257 ? String.format("Unknown 0x%04X", new Object[]{Integer.valueOf(s2)}) : "Progressive" : "Optimised" : "Standard", (s3 < 1 || s3 > 3) ? String.format("Unknown 0x%04X", new Object[]{Integer.valueOf(s3)}) : String.format("%d", new Object[]{Integer.valueOf(s3 + 2)})});
        } catch (IOException unused) {
            return null;
        }
    }
}
