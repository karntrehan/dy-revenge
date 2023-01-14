package p174e.p199d.p218c.p237v;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p237v.C5875b;

/* renamed from: e.d.c.v.h */
public class C5883h implements C5669d {
    /* renamed from: d */
    private byte[] m22346d(C5714o oVar, int i) {
        byte b;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            byte b2 = oVar.mo17080b();
            if ((b2 & 255) != 255 || (b = oVar.mo17080b()) == 0) {
                bArr[i2] = b2;
                i2++;
            } else {
                throw new IOException("Marker " + C5671f.m21109e(b) + " found inside DHT segment");
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] nVar : iterable) {
            mo17817c(new C5713n(nVar), eVar);
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.DHT);
    }

    /* renamed from: c */
    public void mo17817c(C5714o oVar, C5732e eVar) {
        C5875b bVar = (C5875b) eVar.mo17170e(C5875b.class);
        if (bVar == null) {
            bVar = new C5875b();
            eVar.mo17166a(bVar);
        }
        while (oVar.mo17079a() > 0) {
            try {
                byte b = oVar.mo17080b();
                C5875b.C5876a.C5877a e = C5875b.C5876a.C5877a.m22332e((b & 240) >> 4);
                byte b2 = b & 15;
                byte[] d = m22346d(oVar, 16);
                int i = 0;
                for (byte b3 : d) {
                    i += b3 & 255;
                }
                bVar.mo17807V().add(new C5875b.C5876a(e, b2, d, m22346d(oVar, i)));
            } catch (IOException e2) {
                bVar.mo17137a(e2.getMessage());
            }
        }
        bVar.mo17125J(1, bVar.mo17807V().size());
    }
}
