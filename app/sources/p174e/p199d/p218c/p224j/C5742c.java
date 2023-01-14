package p174e.p199d.p218c.p224j;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.j.c */
public class C5742c implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length == 12 && "Adobe".equalsIgnoreCase(new String(next, 0, 5))) {
                mo17203c(new C5713n(next), eVar);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APPE);
    }

    /* renamed from: c */
    public void mo17203c(C5714o oVar, C5732e eVar) {
        C5741b bVar = new C5741b();
        eVar.mo17166a(bVar);
        try {
            oVar.mo17099s(false);
            if (!oVar.mo17093m(5).equals("Adobe")) {
                bVar.mo17137a("Invalid Adobe JPEG data header.");
                return;
            }
            bVar.mo17125J(0, oVar.mo17096p());
            bVar.mo17125J(1, oVar.mo17096p());
            bVar.mo17125J(2, oVar.mo17096p());
            bVar.mo17125J(3, oVar.mo17089h());
        } catch (IOException e) {
            bVar.mo17137a("IO exception processing data: " + e.getMessage());
        }
    }
}
