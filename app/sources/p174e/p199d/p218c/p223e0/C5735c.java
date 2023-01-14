package p174e.p199d.p218c.p223e0;

import java.io.IOException;
import java.util.Collections;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5378c;
import p174e.p175a.p176a.C5380e;
import p174e.p175a.p176a.p179j.C5410b;
import p174e.p175a.p176a.p180k.C5415b;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.e0.c */
public class C5735c implements C5669d {
    /* renamed from: h */
    private static String m21417h(C5732e eVar) {
        for (C5734b V : eVar.mo17168c(C5734b.class)) {
            try {
                C5378c L = V.mo17172V().mo16208L("http://ns.adobe.com/xmp/note/", (String) null, (C5410b) null);
                if (L != null) {
                    while (L.hasNext()) {
                        C5415b bVar = (C5415b) L.next();
                        if ("xmpNote:HasExtendedXMP".equals(bVar.mo16245a())) {
                            return bVar.getValue();
                        }
                    }
                    continue;
                }
            } catch (C5377b unused) {
            }
        }
        return null;
    }

    /* renamed from: i */
    private static byte[] m21418i(C5732e eVar, byte[] bArr, String str, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 75) {
            try {
                C5713n nVar = new C5713n(bArr);
                nVar.mo17084t((long) 35);
                if (str.equals(nVar.mo17093m(32))) {
                    int q = (int) nVar.mo17097q();
                    int q2 = (int) nVar.mo17097q();
                    if (bArr2 == null) {
                        bArr2 = new byte[q];
                    }
                    if (bArr2.length == q) {
                        System.arraycopy(bArr, 75, bArr2, q2, length - 75);
                    } else {
                        C5734b bVar = new C5734b();
                        bVar.mo17137a(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", new Object[]{Integer.valueOf(q), Integer.valueOf(bArr2.length)}));
                        eVar.mo17166a(bVar);
                    }
                }
            } catch (IOException e) {
                C5734b bVar2 = new C5734b();
                bVar2.mo17137a(e.getMessage());
                eVar.mo17166a(bVar2);
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        byte[] bArr = null;
        String str = null;
        for (byte[] next : iterable) {
            if (next.length >= 29 && ("http://ns.adobe.com/xap/1.0/\u0000".equalsIgnoreCase(new String(next, 0, 29)) || "XMP".equalsIgnoreCase(new String(next, 0, 3)))) {
                int length = next.length - 29;
                byte[] bArr2 = new byte[length];
                System.arraycopy(next, 29, bArr2, 0, length);
                mo17177f(bArr2, eVar);
                str = m21417h(eVar);
            } else if (str != null && next.length >= 35 && "http://ns.adobe.com/xmp/extension/\u0000".equalsIgnoreCase(new String(next, 0, 35))) {
                bArr = m21418i(eVar, next, str, bArr);
            }
        }
        if (bArr != null) {
            mo17177f(bArr, eVar);
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APP1);
    }

    /* renamed from: c */
    public void mo17174c(String str, C5732e eVar) {
        mo17175d(str, eVar, (C5722b) null);
    }

    /* renamed from: d */
    public void mo17175d(String str, C5732e eVar, C5722b bVar) {
        C5734b bVar2 = new C5734b();
        if (bVar != null) {
            bVar2.mo17130O(bVar);
        }
        try {
            bVar2.mo17173W(C5380e.m19896f(str));
        } catch (C5377b e) {
            bVar2.mo17137a("Error processing XMP data: " + e.getMessage());
        }
        if (!bVar2.mo17116A()) {
            eVar.mo17166a(bVar2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17176e(byte[] r2, int r3, int r4, p174e.p199d.p218c.C5732e r5, p174e.p199d.p218c.C5722b r6) {
        /*
            r1 = this;
            e.d.c.e0.b r0 = new e.d.c.e0.b
            r0.<init>()
            if (r6 == 0) goto L_0x000a
            r0.mo17130O(r6)
        L_0x000a:
            if (r3 != 0) goto L_0x0014
            int r6 = r2.length     // Catch:{ b -> 0x0025 }
            if (r4 != r6) goto L_0x0014
            e.a.a.d r2 = p174e.p175a.p176a.C5380e.m19894d(r2)     // Catch:{ b -> 0x0025 }
            goto L_0x0021
        L_0x0014:
            e.a.a.i.a r6 = new e.a.a.i.a     // Catch:{ b -> 0x0025 }
            r6.<init>(r2, r3, r4)     // Catch:{ b -> 0x0025 }
            java.io.InputStream r2 = r6.mo16218f()     // Catch:{ b -> 0x0025 }
            e.a.a.d r2 = p174e.p175a.p176a.C5380e.m19892b(r2)     // Catch:{ b -> 0x0025 }
        L_0x0021:
            r0.mo17173W(r2)     // Catch:{ b -> 0x0025 }
            goto L_0x003e
        L_0x0025:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error processing XMP data: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.mo17137a(r2)
        L_0x003e:
            boolean r2 = r0.mo17116A()
            if (r2 != 0) goto L_0x0047
            r5.mo17166a(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p223e0.C5735c.mo17176e(byte[], int, int, e.d.c.e, e.d.c.b):void");
    }

    /* renamed from: f */
    public void mo17177f(byte[] bArr, C5732e eVar) {
        mo17178g(bArr, eVar, (C5722b) null);
    }

    /* renamed from: g */
    public void mo17178g(byte[] bArr, C5732e eVar, C5722b bVar) {
        mo17176e(bArr, 0, bArr.length, eVar, bVar);
    }
}
