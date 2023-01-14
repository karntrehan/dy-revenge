package p174e.p199d.p218c.p231p;

import java.io.ByteArrayOutputStream;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5724c;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5737g;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p231p.C5850f;
import p174e.p199d.p218c.p232q.C5860c;

/* renamed from: e.d.c.p.k */
public class C5857k {
    /* renamed from: b */
    private static byte[] m22247b(C5714o oVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte b = oVar.mo17080b();
            if (b == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byte b2 = b & 255;
            bArr[0] = b;
            oVar.mo17081c(bArr, 1, b2);
            byteArrayOutputStream.write(bArr, 0, b2 + 1);
        }
    }

    /* renamed from: c */
    private static byte[] m22248c(C5714o oVar, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            byteArrayOutputStream.write(oVar.mo17082d(i), 0, i);
            i = oVar.mo17080b() & 255;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    private static void m22249d(C5714o oVar, int i, C5732e eVar) {
        if (i != 11) {
            eVar.mo17166a(new C5724c(String.format("Invalid GIF application extension block size. Expected 11, got %d.", new Object[]{Integer.valueOf(i)})));
            return;
        }
        String n = oVar.mo17094n(i, C5705f.f16151a);
        if (n.equals("XMP DataXMP")) {
            byte[] b = m22247b(oVar);
            new C5735c().mo17176e(b, 0, b.length - 257, eVar, (C5722b) null);
        } else if (n.equals("ICCRGBG1012")) {
            byte[] c = m22248c(oVar, oVar.mo17080b() & 255);
            if (c.length != 0) {
                new C5860c().mo17775c(new C5700b(c), eVar);
            }
        } else if (n.equals("NETSCAPE2.0")) {
            oVar.mo17084t(2);
            int p = oVar.mo17096p();
            oVar.mo17084t(1);
            C5846b bVar = new C5846b();
            bVar.mo17125J(1, p);
            eVar.mo17166a(bVar);
        } else {
            m22256k(oVar);
        }
    }

    /* renamed from: e */
    private static C5848d m22250e(C5714o oVar, int i) {
        return new C5848d(new C5737g(m22248c(oVar, i), C5705f.f16154d));
    }

    /* renamed from: f */
    private static C5850f m22251f(C5714o oVar, int i) {
        C5850f fVar = new C5850f();
        short r = oVar.mo17098r();
        fVar.mo17128M(2, C5850f.C5852b.m22242e((r >> 2) & 7));
        boolean z = false;
        fVar.mo17117B(3, ((r & 2) >> 1) == 1);
        if ((r & 1) == 1) {
            z = true;
        }
        fVar.mo17117B(4, z);
        fVar.mo17125J(1, oVar.mo17096p());
        fVar.mo17125J(5, oVar.mo17098r());
        oVar.mo17084t(1);
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0 != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m22252g(p174e.p199d.p217b.C5714o r7, p174e.p199d.p218c.C5732e r8) {
        /*
            byte r0 = r7.mo17089h()
            short r1 = r7.mo17098r()
            long r2 = r7.mo17083l()
            r4 = -7
            if (r0 == r4) goto L_0x0040
            r4 = 1
            if (r0 == r4) goto L_0x0039
            r5 = -2
            if (r0 == r5) goto L_0x0034
            r5 = -1
            if (r0 == r5) goto L_0x0030
            e.d.c.c r5 = new e.d.c.c
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r6 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r4[r6] = r0
            java.lang.String r0 = "Unsupported GIF extension block with type 0x%02X."
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r5.<init>(r0)
            r8.mo17166a(r5)
            goto L_0x0047
        L_0x0030:
            m22249d(r7, r1, r8)
            goto L_0x0047
        L_0x0034:
            e.d.c.p.d r0 = m22250e(r7, r1)
            goto L_0x0044
        L_0x0039:
            e.d.c.b r0 = m22255j(r7, r1)
            if (r0 == 0) goto L_0x0047
            goto L_0x0044
        L_0x0040:
            e.d.c.p.f r0 = m22251f(r7, r1)
        L_0x0044:
            r8.mo17166a(r0)
        L_0x0047:
            long r0 = (long) r1
            long r2 = r2 + r0
            long r0 = r7.mo17083l()
            long r2 = r2 - r0
            r0 = 0
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0057
            r7.mo17084t(r2)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p231p.C5857k.m22252g(e.d.b.o, e.d.c.e):void");
    }

    /* renamed from: h */
    private static C5854h m22253h(C5714o oVar) {
        String str;
        C5854h hVar = new C5854h();
        if (!oVar.mo17093m(3).equals("GIF")) {
            str = "Invalid GIF file signature";
        } else {
            String m = oVar.mo17093m(3);
            if (m.equals("87a") || m.equals("89a")) {
                boolean z = true;
                hVar.mo17133R(1, m);
                hVar.mo17125J(2, oVar.mo17096p());
                hVar.mo17125J(3, oVar.mo17096p());
                short r = oVar.mo17098r();
                int i = 1 << ((r & 7) + 1);
                int i2 = ((r & 112) >> 4) + 1;
                boolean z2 = (r >> 7) != 0;
                hVar.mo17125J(4, i);
                if (m.equals("89a")) {
                    if ((r & 8) == 0) {
                        z = false;
                    }
                    hVar.mo17117B(5, z);
                }
                hVar.mo17125J(6, i2);
                hVar.mo17117B(7, z2);
                hVar.mo17125J(8, oVar.mo17098r());
                short r2 = oVar.mo17098r();
                if (r2 != 0) {
                    hVar.mo17123H(9, (float) ((((double) r2) + 15.0d) / 64.0d));
                }
                return hVar;
            }
            str = "Unexpected GIF version";
        }
        hVar.mo17137a(str);
        return hVar;
    }

    /* renamed from: i */
    private static C5856j m22254i(C5714o oVar) {
        C5856j jVar = new C5856j();
        boolean z = true;
        jVar.mo17125J(1, oVar.mo17096p());
        jVar.mo17125J(2, oVar.mo17096p());
        jVar.mo17125J(3, oVar.mo17096p());
        jVar.mo17125J(4, oVar.mo17096p());
        byte b = oVar.mo17080b();
        boolean z2 = (b >> 7) != 0;
        boolean z3 = (b & 64) != 0;
        jVar.mo17117B(5, z2);
        jVar.mo17117B(6, z3);
        if (z2) {
            if ((b & 32) == 0) {
                z = false;
            }
            jVar.mo17117B(7, z);
            byte b2 = b & 7;
            jVar.mo17125J(8, b2 + 1);
            oVar.mo17084t((long) ((2 << b2) * 3));
        }
        oVar.mo17080b();
        return jVar;
    }

    /* renamed from: j */
    private static C5722b m22255j(C5714o oVar, int i) {
        if (i != 12) {
            return new C5724c(String.format("Invalid GIF plain text block size. Expected 12, got %d.", new Object[]{Integer.valueOf(i)}));
        }
        oVar.mo17084t(12);
        m22256k(oVar);
        return null;
    }

    /* renamed from: k */
    private static void m22256k(C5714o oVar) {
        while (true) {
            short r = oVar.mo17098r();
            if (r != 0) {
                oVar.mo17084t((long) r);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.mo17166a(new p174e.p199d.p218c.C5724c("GIF did not had hasGlobalColorTable bit."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r5 = new p174e.p199d.p218c.C5724c("IOException processing GIF data");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17774a(p174e.p199d.p217b.C5714o r5, p174e.p199d.p218c.C5732e r6) {
        /*
            r4 = this;
            java.lang.String r0 = "IOException processing GIF data"
            r1 = 0
            r5.mo17099s(r1)
            e.d.c.p.h r1 = m22253h(r5)     // Catch:{ IOException -> 0x006c }
            r6.mo17166a(r1)     // Catch:{ IOException -> 0x006c }
            boolean r2 = r1.mo17160y()
            if (r2 == 0) goto L_0x0014
            return
        L_0x0014:
            r2 = 0
            r3 = 7
            boolean r3 = r1.mo17139c(r3)     // Catch:{ f -> 0x0022 }
            if (r3 == 0) goto L_0x002c
            r3 = 4
            java.lang.Integer r2 = r1.mo17148l(r3)     // Catch:{ f -> 0x0022 }
            goto L_0x002c
        L_0x0022:
            e.d.c.c r1 = new e.d.c.c     // Catch:{ IOException -> 0x0063 }
            java.lang.String r3 = "GIF did not had hasGlobalColorTable bit."
            r1.<init>(r3)     // Catch:{ IOException -> 0x0063 }
            r6.mo17166a(r1)     // Catch:{ IOException -> 0x0063 }
        L_0x002c:
            if (r2 == 0) goto L_0x0038
            int r1 = r2.intValue()     // Catch:{ IOException -> 0x0063 }
            int r1 = r1 * 3
            long r1 = (long) r1     // Catch:{ IOException -> 0x0063 }
            r5.mo17084t(r1)     // Catch:{ IOException -> 0x0063 }
        L_0x0038:
            byte r1 = r5.mo17089h()     // Catch:{ IOException -> 0x0062 }
            r2 = 33
            if (r1 == r2) goto L_0x005e
            r2 = 44
            if (r1 == r2) goto L_0x0053
            r5 = 59
            if (r1 == r5) goto L_0x0052
            e.d.c.c r5 = new e.d.c.c     // Catch:{ IOException -> 0x0063 }
            java.lang.String r1 = "Unknown gif block marker found."
            r5.<init>(r1)     // Catch:{ IOException -> 0x0063 }
            r6.mo17166a(r5)     // Catch:{ IOException -> 0x0063 }
        L_0x0052:
            return
        L_0x0053:
            e.d.c.p.j r1 = m22254i(r5)     // Catch:{ IOException -> 0x0063 }
            r6.mo17166a(r1)     // Catch:{ IOException -> 0x0063 }
            m22256k(r5)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0038
        L_0x005e:
            m22252g(r5, r6)     // Catch:{ IOException -> 0x0063 }
            goto L_0x0038
        L_0x0062:
            return
        L_0x0063:
            e.d.c.c r5 = new e.d.c.c
            r5.<init>(r0)
        L_0x0068:
            r6.mo17166a(r5)
            return
        L_0x006c:
            e.d.c.c r5 = new e.d.c.c
            r5.<init>(r0)
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p231p.C5857k.mo17774a(e.d.b.o, e.d.c.e):void");
    }
}
