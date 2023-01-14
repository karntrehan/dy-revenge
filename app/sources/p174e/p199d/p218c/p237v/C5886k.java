package p174e.p199d.p218c.p237v;

import java.io.IOException;
import java.util.Arrays;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.v.k */
public class C5886k implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] c : iterable) {
            mo17820c(c, eVar, fVar);
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Arrays.asList(new C5671f[]{C5671f.SOF0, C5671f.SOF1, C5671f.SOF2, C5671f.SOF3, C5671f.SOF5, C5671f.SOF6, C5671f.SOF7, C5671f.SOF9, C5671f.SOF10, C5671f.SOF11, C5671f.SOF13, C5671f.SOF14, C5671f.SOF15});
    }

    /* renamed from: c */
    public void mo17820c(byte[] bArr, C5732e eVar, C5671f fVar) {
        C5884i iVar = new C5884i();
        eVar.mo17166a(iVar);
        iVar.mo17125J(-3, fVar.f16074c0 - C5671f.SOF0.f16074c0);
        C5713n nVar = new C5713n(bArr);
        try {
            iVar.mo17125J(0, nVar.mo17098r());
            iVar.mo17125J(1, nVar.mo17096p());
            iVar.mo17125J(3, nVar.mo17096p());
            short r = nVar.mo17098r();
            iVar.mo17125J(5, r);
            for (int i = 0; i < r; i++) {
                iVar.mo17128M(i + 6, new C5881f(nVar.mo17098r(), nVar.mo17098r(), nVar.mo17098r()));
            }
        } catch (IOException e) {
            iVar.mo17137a(e.getMessage());
        }
    }
}
