package p174e.p199d.p218c.p235t;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.t.c */
public class C5870c implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length >= 4 && "JFIF".equals(new String(next, 0, 4))) {
                mo17803c(new C5700b(next), eVar);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APP0);
    }

    /* renamed from: c */
    public void mo17803c(C5710k kVar, C5732e eVar) {
        C5869b bVar = new C5869b();
        eVar.mo17166a(bVar);
        try {
            bVar.mo17125J(5, kVar.mo17054s(5));
            bVar.mo17125J(7, kVar.mo17056u(7));
            bVar.mo17125J(8, kVar.mo17054s(8));
            bVar.mo17125J(10, kVar.mo17054s(10));
            bVar.mo17125J(12, kVar.mo17056u(12));
            bVar.mo17125J(13, kVar.mo17056u(13));
        } catch (IOException e) {
            bVar.mo17137a(e.getMessage());
        }
    }
}
