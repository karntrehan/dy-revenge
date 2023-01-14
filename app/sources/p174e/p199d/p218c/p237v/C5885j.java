package p174e.p199d.p218c.p237v;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5724c;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.v.j */
public class C5885j implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] c : iterable) {
            mo17819c(c, eVar, fVar);
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.DNL);
    }

    /* renamed from: c */
    public void mo17819c(byte[] bArr, C5732e eVar, C5671f fVar) {
        C5884i iVar = (C5884i) eVar.mo17170e(C5884i.class);
        if (iVar == null) {
            C5724c cVar = new C5724c();
            eVar.mo17166a(cVar);
            cVar.mo17137a("DNL segment found without SOFx - illegal JPEG format");
            return;
        }
        C5713n nVar = new C5713n(bArr);
        try {
            Integer l = iVar.mo17148l(1);
            if (l == null || l.intValue() == 0) {
                iVar.mo17125J(1, nVar.mo17096p());
            }
        } catch (IOException e) {
            iVar.mo17137a(e.getMessage());
        }
    }
}
