package p174e.p199d.p200a.p209n;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import p174e.p199d.p217b.C5701c;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5707h;
import p174e.p199d.p217b.C5709j;
import p174e.p199d.p217b.C5711l;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5715p;
import p174e.p199d.p217b.C5716q;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5737g;
import p174e.p199d.p218c.p219a0.C5719a;
import p174e.p199d.p218c.p219a0.C5721c;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p232q.C5860c;

/* renamed from: e.d.a.n.g */
public class C5682g {

    /* renamed from: a */
    private static Set<C5679d> f16126a;

    /* renamed from: b */
    private static Charset f16127b = C5705f.f16153c;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(C5679d.f16090b);
        hashSet.add(C5679d.f16091c);
        hashSet.add(C5679d.f16101m);
        hashSet.add(C5679d.f16094f);
        hashSet.add(C5679d.f16098j);
        hashSet.add(C5679d.f16095g);
        hashSet.add(C5679d.f16096h);
        hashSet.add(C5679d.f16099k);
        hashSet.add(C5679d.f16106r);
        hashSet.add(C5679d.f16107s);
        hashSet.add(C5679d.f16105q);
        hashSet.add(C5679d.f16104p);
        hashSet.add(C5679d.f16102n);
        hashSet.add(C5679d.f16097i);
        f16126a = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    private static void m21145a(C5732e eVar, C5677b bVar) {
        C5721c cVar;
        int i;
        C5721c cVar2;
        C5721c cVar3;
        ArrayList arrayList;
        C5722b cVar4;
        C5732e eVar2 = eVar;
        C5679d b = bVar.mo16958b();
        byte[] a = bVar.mo16957a();
        C5679d dVar = C5679d.f16090b;
        if (b.equals(dVar)) {
            C5681f fVar = new C5681f(a);
            cVar4 = new C5721c(dVar);
            cVar4.mo17125J(1, fVar.mo16972f());
            cVar4.mo17125J(2, fVar.mo16971e());
            cVar4.mo17125J(3, fVar.mo16967a());
            cVar4.mo17125J(4, fVar.mo16968b().mo16966h());
            cVar4.mo17125J(5, fVar.mo16969c() & 255);
            cVar4.mo17125J(6, fVar.mo16970d());
            cVar4.mo17125J(7, fVar.mo16973g());
        } else {
            C5679d dVar2 = C5679d.f16091c;
            if (b.equals(dVar2)) {
                cVar3 = new C5721c(dVar2);
                cVar3.mo17125J(8, a.length / 3);
            } else {
                C5679d dVar3 = C5679d.f16101m;
                if (b.equals(dVar3)) {
                    cVar3 = new C5721c(dVar3);
                    cVar3.mo17125J(9, 1);
                } else {
                    C5679d dVar4 = C5679d.f16098j;
                    if (b.equals(dVar4)) {
                        byte b2 = a[0];
                        cVar4 = new C5721c(dVar4);
                        cVar4.mo17125J(10, b2);
                    } else if (b.equals(C5679d.f16094f)) {
                        C5676a aVar = new C5676a(a);
                        cVar4 = new C5719a();
                        cVar4.mo17125J(1, aVar.mo16955g());
                        cVar4.mo17125J(2, aVar.mo16956h());
                        cVar4.mo17125J(3, aVar.mo16953e());
                        cVar4.mo17125J(4, aVar.mo16954f());
                        cVar4.mo17125J(5, aVar.mo16951c());
                        cVar4.mo17125J(6, aVar.mo16952d());
                        cVar4.mo17125J(7, aVar.mo16949a());
                        cVar4.mo17125J(8, aVar.mo16950b());
                    } else {
                        C5679d dVar5 = C5679d.f16095g;
                        if (b.equals(dVar5)) {
                            int a2 = C5701c.m21206a(a);
                            new C5713n(a).mo17087f();
                            cVar4 = new C5721c(dVar5);
                            cVar4.mo17121F(11, ((double) a2) / 100000.0d);
                        } else {
                            C5679d dVar6 = C5679d.f16096h;
                            if (b.equals(dVar6)) {
                                C5713n nVar = new C5713n(a);
                                byte[] i2 = nVar.mo17090i(80);
                                C5721c cVar5 = new C5721c(dVar6);
                                cVar5.mo17135T(12, new C5737g(i2, f16127b));
                                if (nVar.mo17089h() == 0) {
                                    try {
                                        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(nVar.mo17082d(a.length - ((i2.length + 1) + 1))));
                                        new C5860c().mo17776d(new C5711l(inflaterInputStream), eVar2, cVar5);
                                        inflaterInputStream.close();
                                    } catch (ZipException e) {
                                        cVar5.mo17137a(String.format("Exception decompressing PNG iCCP chunk : %s", new Object[]{e.getMessage()}));
                                        eVar2.mo17166a(cVar5);
                                    }
                                } else {
                                    cVar5.mo17137a("Invalid compression method value");
                                }
                                eVar2.mo17166a(cVar5);
                                return;
                            }
                            C5679d dVar7 = C5679d.f16099k;
                            if (b.equals(dVar7)) {
                                cVar = new C5721c(dVar7);
                                i = 15;
                            } else {
                                C5679d dVar8 = C5679d.f16106r;
                                if (b.equals(dVar8)) {
                                    C5713n nVar2 = new C5713n(a);
                                    C5737g k = nVar2.mo17092k(80, f16127b);
                                    String gVar = k.toString();
                                    C5737g k2 = nVar2.mo17092k(a.length - (k.mo17179a().length + 1), f16127b);
                                    arrayList = new ArrayList();
                                    arrayList.add(new C5709j(gVar, k2));
                                    cVar3 = new C5721c(dVar8);
                                } else {
                                    C5679d dVar9 = C5679d.f16107s;
                                    byte[] bArr = null;
                                    if (b.equals(dVar9)) {
                                        C5713n nVar3 = new C5713n(a);
                                        C5737g k3 = nVar3.mo17092k(80, f16127b);
                                        String gVar2 = k3.toString();
                                        byte h = nVar3.mo17089h();
                                        int length = a.length - ((k3.mo17179a().length + 1) + 1);
                                        if (h == 0) {
                                            try {
                                                bArr = C5716q.m21299a(new InflaterInputStream(new ByteArrayInputStream(a, a.length - length, length)));
                                            } catch (ZipException e2) {
                                                C5721c cVar6 = new C5721c(C5679d.f16107s);
                                                cVar6.mo17137a(String.format("Exception decompressing PNG zTXt chunk with keyword \"%s\": %s", new Object[]{gVar2, e2.getMessage()}));
                                                eVar2.mo17166a(cVar6);
                                            }
                                        } else {
                                            C5721c cVar7 = new C5721c(dVar9);
                                            cVar7.mo17137a("Invalid compression method value");
                                            eVar2.mo17166a(cVar7);
                                        }
                                        byte[] bArr2 = bArr;
                                        if (bArr2 == null) {
                                            return;
                                        }
                                        if (gVar2.equals("XML:com.adobe.xmp")) {
                                            new C5735c().mo17177f(bArr2, eVar2);
                                            return;
                                        }
                                        arrayList = new ArrayList();
                                        arrayList.add(new C5709j(gVar2, new C5737g(bArr2, f16127b)));
                                        cVar3 = new C5721c(C5679d.f16107s);
                                    } else {
                                        C5679d dVar10 = C5679d.f16105q;
                                        if (b.equals(dVar10)) {
                                            C5713n nVar4 = new C5713n(a);
                                            C5737g k4 = nVar4.mo17092k(80, f16127b);
                                            String gVar3 = k4.toString();
                                            byte h2 = nVar4.mo17089h();
                                            byte h3 = nVar4.mo17089h();
                                            int length2 = a.length - (((((((k4.mo17179a().length + 1) + 1) + 1) + nVar4.mo17090i(a.length).length) + 1) + nVar4.mo17090i(a.length).length) + 1);
                                            if (h2 == 0) {
                                                bArr = nVar4.mo17090i(length2);
                                            } else {
                                                if (h2 != 1) {
                                                    cVar2 = new C5721c(dVar10);
                                                    cVar2.mo17137a("Invalid compression flag value");
                                                } else if (h3 == 0) {
                                                    try {
                                                        bArr = C5716q.m21299a(new InflaterInputStream(new ByteArrayInputStream(a, a.length - length2, length2)));
                                                    } catch (ZipException e3) {
                                                        C5721c cVar8 = new C5721c(C5679d.f16105q);
                                                        cVar8.mo17137a(String.format("Exception decompressing PNG iTXt chunk with keyword \"%s\": %s", new Object[]{gVar3, e3.getMessage()}));
                                                        eVar2.mo17166a(cVar8);
                                                    }
                                                } else {
                                                    cVar2 = new C5721c(dVar10);
                                                    cVar2.mo17137a("Invalid compression method value");
                                                }
                                                eVar2.mo17166a(cVar2);
                                            }
                                            byte[] bArr3 = bArr;
                                            if (bArr3 == null) {
                                                return;
                                            }
                                            if (gVar3.equals("XML:com.adobe.xmp")) {
                                                new C5735c().mo17177f(bArr3, eVar2);
                                                return;
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(new C5709j(gVar3, new C5737g(bArr3, f16127b)));
                                            cVar3 = new C5721c(C5679d.f16105q);
                                            cVar3.mo17128M(13, arrayList2);
                                        } else {
                                            C5679d dVar11 = C5679d.f16104p;
                                            if (b.equals(dVar11)) {
                                                C5713n nVar5 = new C5713n(a);
                                                int p = nVar5.mo17096p();
                                                short r = nVar5.mo17098r();
                                                short r2 = nVar5.mo17098r();
                                                short r3 = nVar5.mo17098r();
                                                short r4 = nVar5.mo17098r();
                                                short r5 = nVar5.mo17098r();
                                                C5721c cVar9 = new C5721c(dVar11);
                                                if (!C5707h.m21215a(p, r - 1, r2) || !C5707h.m21216b(r3, r4, r5)) {
                                                    cVar9.mo17137a(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", new Object[]{Integer.valueOf(p), Integer.valueOf(r), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)}));
                                                } else {
                                                    cVar9.mo17133R(14, String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[]{Integer.valueOf(p), Integer.valueOf(r), Integer.valueOf(r2), Integer.valueOf(r3), Integer.valueOf(r4), Integer.valueOf(r5)}));
                                                }
                                                eVar2.mo17166a(cVar9);
                                                return;
                                            }
                                            C5679d dVar12 = C5679d.f16102n;
                                            if (b.equals(dVar12)) {
                                                C5713n nVar6 = new C5713n(a);
                                                int f = nVar6.mo17087f();
                                                int f2 = nVar6.mo17087f();
                                                byte h4 = nVar6.mo17089h();
                                                C5721c cVar10 = new C5721c(dVar12);
                                                cVar10.mo17125J(16, f);
                                                cVar10.mo17125J(17, f2);
                                                cVar10.mo17125J(18, h4);
                                                eVar2.mo17166a(cVar10);
                                                return;
                                            }
                                            C5679d dVar13 = C5679d.f16097i;
                                            if (b.equals(dVar13)) {
                                                cVar = new C5721c(dVar13);
                                                i = 19;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                                cVar3.mo17128M(13, arrayList);
                            }
                            cVar3.mo17118C(i, a);
                        }
                    }
                }
            }
            eVar2.mo17166a(cVar3);
            return;
        }
        eVar2.mo17166a(cVar4);
    }

    /* renamed from: b */
    public static C5732e m21146b(InputStream inputStream) {
        Iterable<C5677b> a = new C5678c().mo16959a(new C5715p(inputStream), f16126a);
        C5732e eVar = new C5732e();
        for (C5677b a2 : a) {
            try {
                m21145a(eVar, a2);
            } catch (Exception e) {
                e.printStackTrace(System.err);
            }
        }
        return eVar;
    }
}
