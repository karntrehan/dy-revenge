package p174e.p199d.p218c.p237v;

import java.nio.charset.Charset;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5737g;

/* renamed from: e.d.c.v.e */
public class C5880e implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] gVar : iterable) {
            C5879d dVar = new C5879d();
            eVar.mo17166a(dVar);
            dVar.mo17135T(0, new C5737g(gVar, (Charset) null));
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.COM);
    }
}
