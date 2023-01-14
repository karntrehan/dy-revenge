package p174e.p199d.p218c.p234s;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.s.c */
public class C5866c implements C5669d {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r6 != 582) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22303e(p174e.p199d.p217b.C5714o r4, p174e.p199d.p218c.C5722b r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            int r6 = r6 << 8
            r6 = r6 | r7
            if (r8 != 0) goto L_0x000b
            java.lang.String r4 = ""
            r5.mo17133R(r6, r4)
            return
        L_0x000b:
            r7 = 256(0x100, float:3.59E-43)
            r0 = 346(0x15a, float:4.85E-43)
            r1 = 1
            if (r6 == r7) goto L_0x0049
            r7 = 278(0x116, float:3.9E-43)
            if (r6 == r7) goto L_0x0049
            if (r6 == r0) goto L_0x0036
            r7 = 378(0x17a, float:5.3E-43)
            if (r6 == r7) goto L_0x0049
            r7 = 512(0x200, float:7.175E-43)
            if (r6 == r7) goto L_0x0049
            r7 = 522(0x20a, float:7.31E-43)
            if (r6 == r7) goto L_0x0029
            r7 = 582(0x246, float:8.16E-43)
            if (r6 == r7) goto L_0x0049
            goto L_0x0059
        L_0x0029:
            short r7 = r4.mo17098r()
            r5.mo17125J(r6, r7)
            int r8 = r8 - r1
            long r5 = (long) r8
            r4.mo17084t(r5)
            return
        L_0x0036:
            byte[] r4 = r4.mo17082d(r8)
            java.lang.String r7 = p174e.p199d.p218c.p234s.C5867d.m22308a(r4)
            if (r7 != 0) goto L_0x0045
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4)
        L_0x0045:
            r5.mo17133R(r6, r7)
            return
        L_0x0049:
            r7 = 2
            if (r8 < r7) goto L_0x0059
            int r0 = r4.mo17096p()
            int r8 = r8 - r7
            long r7 = (long) r8
            r4.mo17084t(r7)
            r5.mo17125J(r6, r0)
            return
        L_0x0059:
            java.lang.String r7 = r5.mo17153r(r0)
            r0 = 0
            if (r7 == 0) goto L_0x0065
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r7)     // Catch:{ all -> 0x0065 }
            goto L_0x0066
        L_0x0065:
            r2 = r0
        L_0x0066:
            if (r7 == 0) goto L_0x006d
            e.d.c.g r4 = r4.mo17095o(r8, r2)
            goto L_0x0084
        L_0x006d:
            byte[] r4 = r4.mo17082d(r8)
            java.nio.charset.Charset r7 = p174e.p199d.p218c.p234s.C5867d.m22309b(r4)
            if (r7 == 0) goto L_0x007e
            e.d.c.g r8 = new e.d.c.g
            r8.<init>(r4, r7)
            r4 = r8
            goto L_0x0084
        L_0x007e:
            e.d.c.g r7 = new e.d.c.g
            r7.<init>(r4, r0)
            r4 = r7
        L_0x0084:
            boolean r7 = r5.mo17138b(r6)
            if (r7 == 0) goto L_0x00a5
            e.d.c.g[] r7 = r5.mo17157u(r6)
            if (r7 != 0) goto L_0x0093
            e.d.c.g[] r7 = new p174e.p199d.p218c.C5737g[r1]
            goto L_0x009d
        L_0x0093:
            int r8 = r7.length
            int r8 = r8 + r1
            e.d.c.g[] r8 = new p174e.p199d.p218c.C5737g[r8]
            int r0 = r7.length
            r2 = 0
            java.lang.System.arraycopy(r7, r2, r8, r2, r0)
            r7 = r8
        L_0x009d:
            int r8 = r7.length
            int r8 = r8 - r1
            r7[r8] = r4
            r5.mo17136U(r6, r7)
            goto L_0x00a8
        L_0x00a5:
            r5.mo17135T(r6, r4)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p234s.C5866c.m22303e(e.d.b.o, e.d.c.b, int, int, int):void");
    }

    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length != 0 && next[0] == 28) {
                mo17797c(new C5713n(next), eVar, (long) next.length);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APPD);
    }

    /* renamed from: c */
    public void mo17797c(C5714o oVar, C5732e eVar, long j) {
        mo17798d(oVar, eVar, j, (C5722b) null);
    }

    /* renamed from: d */
    public void mo17798d(C5714o oVar, C5732e eVar, long j, C5722b bVar) {
        String str;
        C5865b bVar2 = new C5865b();
        eVar.mo17166a(bVar2);
        if (bVar != null) {
            bVar2.mo17130O(bVar);
        }
        int i = 0;
        while (((long) i) < j) {
            try {
                short r = oVar.mo17098r();
                int i2 = i + 1;
                if (r == 28) {
                    if (((long) (i2 + 4)) > j) {
                        str = "Too few bytes remain for a valid IPTC tag";
                    } else {
                        try {
                            short r2 = oVar.mo17098r();
                            short r3 = oVar.mo17098r();
                            int p = oVar.mo17096p();
                            if (p > 32767) {
                                p = ((p & 32767) << 16) | oVar.mo17096p();
                                i2 += 2;
                            }
                            int i3 = p;
                            i = i2 + 4 + i3;
                            if (((long) i) > j) {
                                str = "Data for tag extends beyond end of IPTC segment";
                            } else {
                                try {
                                    m22303e(oVar, bVar2, r2, r3, i3);
                                } catch (IOException unused) {
                                    str = "Error processing IPTC tag";
                                }
                            }
                        } catch (IOException unused2) {
                            str = "IPTC data segment ended mid-way through tag descriptor";
                        }
                    }
                    bVar2.mo17137a(str);
                    return;
                } else if (((long) i2) != j) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid IPTC tag marker at offset ");
                    sb.append(i2 - 1);
                    sb.append(". Expected '0x");
                    sb.append(Integer.toHexString(28));
                    sb.append("' but got '0x");
                    sb.append(Integer.toHexString(r));
                    sb.append("'.");
                    bVar2.mo17137a(sb.toString());
                    return;
                } else {
                    return;
                }
            } catch (IOException unused3) {
                str = "Unable to read starting byte of IPTC tag";
            }
        }
    }
}
