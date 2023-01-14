package p174e.p199d.p218c.p236u;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.u.c */
public class C5873c implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length >= 4 && "JFXX".equals(new String(next, 0, 4))) {
                mo17805c(new C5700b(next), eVar);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APP0);
    }

    /* renamed from: c */
    public void mo17805c(C5710k kVar, C5732e eVar) {
        C5872b bVar = new C5872b();
        eVar.mo17166a(bVar);
        try {
            bVar.mo17125J(5, kVar.mo17056u(5));
        } catch (IOException e) {
            bVar.mo17137a(e.getMessage());
        }
    }
}
