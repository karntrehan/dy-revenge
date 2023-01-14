package p174e.p319f.p416e.p436x.p437b;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.p420s.C9681c;
import p174e.p319f.p416e.p420s.C9682d;
import p174e.p319f.p416e.p420s.C9683e;
import p174e.p319f.p416e.p420s.C9690l;

/* renamed from: e.f.e.x.b.d */
final class C9795d {

    /* renamed from: a */
    private static final char[] f26232a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* renamed from: e.f.e.x.b.d$a */
    static /* synthetic */ class C9796a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.f.e.x.b.h[] r0 = p174e.p319f.p416e.p436x.p437b.C9800h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26233a = r0
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f26233a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.f.e.x.b.h r1 = p174e.p319f.p416e.p436x.p437b.C9800h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p436x.p437b.C9795d.C9796a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static C9683e m33453a(byte[] bArr, C9802j jVar, C9798f fVar, Map<C9659e, ?> map) {
        C9800h hVar;
        C9802j jVar2 = jVar;
        C9681c cVar = new C9681c(bArr);
        StringBuilder sb = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        C9682d dVar = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                C9800h e = cVar.mo24278a() < 4 ? C9800h.TERMINATOR : C9800h.m33470e(cVar.mo24281d(4));
                int[] iArr = C9796a.f26233a;
                switch (iArr[e.ordinal()]) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                        hVar = e;
                        z = true;
                        break;
                    case 8:
                        if (cVar.mo24278a() >= 16) {
                            int d = cVar.mo24281d(8);
                            i3 = cVar.mo24281d(8);
                            i2 = d;
                            break;
                        } else {
                            throw C9660f.m32836a();
                        }
                    case 9:
                        dVar = C9682d.m32941e(m33459g(cVar));
                        if (dVar == null) {
                            throw C9660f.m32836a();
                        }
                        break;
                    case 10:
                        int d2 = cVar.mo24281d(4);
                        int d3 = cVar.mo24281d(e.mo24523g(jVar2));
                        if (d2 == i) {
                            m33456d(cVar, sb, d3);
                            break;
                        }
                        break;
                    default:
                        int d4 = cVar.mo24281d(e.mo24523g(jVar2));
                        int i4 = iArr[e.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    hVar = e;
                                    m33455c(cVar, sb, d4, dVar, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    m33457e(cVar, sb, d4);
                                    break;
                                } else {
                                    throw C9660f.m32836a();
                                }
                            } else {
                                hVar = e;
                                m33454b(cVar, sb, d4, z);
                                break;
                            }
                        } else {
                            hVar = e;
                            m33458f(cVar, sb, d4);
                            break;
                        }
                }
                hVar = e;
                if (hVar == C9800h.TERMINATOR) {
                    return new C9683e(bArr, sb.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw C9660f.m32836a();
            }
        }
    }

    /* renamed from: b */
    private static void m33454b(C9681c cVar, StringBuilder sb, int i, boolean z) {
        while (i > 1) {
            if (cVar.mo24278a() >= 11) {
                int d = cVar.mo24281d(11);
                sb.append(m33460h(d / 45));
                sb.append(m33460h(d % 45));
                i -= 2;
            } else {
                throw C9660f.m32836a();
            }
        }
        if (i == 1) {
            if (cVar.mo24278a() >= 6) {
                sb.append(m33460h(cVar.mo24281d(6)));
            } else {
                throw C9660f.m32836a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m33455c(C9681c cVar, StringBuilder sb, int i, C9682d dVar, Collection<byte[]> collection, Map<C9659e, ?> map) {
        if ((i << 3) <= cVar.mo24278a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo24281d(8);
            }
            try {
                sb.append(new String(bArr, dVar == null ? C9690l.m32979a(bArr, map) : dVar.name()));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C9660f.m32836a();
            }
        } else {
            throw C9660f.m32836a();
        }
    }

    /* renamed from: d */
    private static void m33456d(C9681c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo24278a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo24281d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C9660f.m32836a();
            }
        } else {
            throw C9660f.m32836a();
        }
    }

    /* renamed from: e */
    private static void m33457e(C9681c cVar, StringBuilder sb, int i) {
        if (i * 13 <= cVar.mo24278a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo24281d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C9660f.m32836a();
            }
        } else {
            throw C9660f.m32836a();
        }
    }

    /* renamed from: f */
    private static void m33458f(C9681c cVar, StringBuilder sb, int i) {
        while (i >= 3) {
            if (cVar.mo24278a() >= 10) {
                int d = cVar.mo24281d(10);
                if (d < 1000) {
                    sb.append(m33460h(d / 100));
                    sb.append(m33460h((d / 10) % 10));
                    sb.append(m33460h(d % 10));
                    i -= 3;
                } else {
                    throw C9660f.m32836a();
                }
            } else {
                throw C9660f.m32836a();
            }
        }
        if (i == 2) {
            if (cVar.mo24278a() >= 7) {
                int d2 = cVar.mo24281d(7);
                if (d2 < 100) {
                    sb.append(m33460h(d2 / 10));
                    sb.append(m33460h(d2 % 10));
                    return;
                }
                throw C9660f.m32836a();
            }
            throw C9660f.m32836a();
        } else if (i != 1) {
        } else {
            if (cVar.mo24278a() >= 4) {
                int d3 = cVar.mo24281d(4);
                if (d3 < 10) {
                    sb.append(m33460h(d3));
                    return;
                }
                throw C9660f.m32836a();
            }
            throw C9660f.m32836a();
        }
    }

    /* renamed from: g */
    private static int m33459g(C9681c cVar) {
        int d = cVar.mo24281d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return cVar.mo24281d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo24281d(16) | ((d & 31) << 16);
        }
        throw C9660f.m32836a();
    }

    /* renamed from: h */
    private static char m33460h(int i) {
        char[] cArr = f26232a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C9660f.m32836a();
    }
}
