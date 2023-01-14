package p174e.p199d.p218c.p228n;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p200a.p214s.C5695d;
import p174e.p199d.p200a.p214s.C5696e;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.n.i */
public class C5825i implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length >= 6 && new String(next, 0, 6).equals("Exif\u0000\u0000")) {
                mo17746d(new C5700b(next), eVar, 6);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APP1);
    }

    /* renamed from: c */
    public void mo17745c(C5710k kVar, C5732e eVar) {
        mo17746d(kVar, eVar, 0);
    }

    /* renamed from: d */
    public void mo17746d(C5710k kVar, C5732e eVar, int i) {
        mo17747e(kVar, eVar, i, (C5722b) null);
    }

    /* renamed from: e */
    public void mo17747e(C5710k kVar, C5732e eVar, int i, C5722b bVar) {
        C5830n nVar = new C5830n(eVar, bVar);
        try {
            new C5696e().mo17016d(kVar, nVar, i);
        } catch (C5695d e) {
            nVar.error("Exception processing TIFF data: " + e.getMessage());
            e.printStackTrace(System.err);
        } catch (IOException e2) {
            nVar.error("Exception processing TIFF data: " + e2.getMessage());
            e2.printStackTrace(System.err);
        }
    }
}
