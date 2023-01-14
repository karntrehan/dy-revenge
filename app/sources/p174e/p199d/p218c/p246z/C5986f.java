package p174e.p199d.p218c.p246z;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p174e.p199d.p200a.C5659d;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p228n.C5825i;
import p174e.p199d.p218c.p232q.C5860c;
import p174e.p199d.p218c.p234s.C5866c;

/* renamed from: e.d.c.z.f */
public class C5986f implements C5669d {
    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        for (byte[] next : iterable) {
            if (next.length >= 14 && "Photoshop 3.0".equals(new String(next, 0, 13))) {
                mo17893c(new C5713n(next, 14), (next.length - 13) - 1, eVar);
            }
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APPD);
    }

    /* renamed from: c */
    public void mo17893c(C5714o oVar, int i, C5732e eVar) {
        int i2;
        C5714o oVar2 = oVar;
        int i3 = i;
        C5732e eVar2 = eVar;
        C5985e eVar3 = new C5985e();
        eVar2.mo17166a(eVar3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            try {
                String m = oVar2.mo17093m(4);
                int p = oVar.mo17096p();
                short r = oVar.mo17098r();
                int i6 = i4 + 4 + 2 + 1;
                if (r < 0 || (i2 = r + i6) > i3) {
                    throw new C5659d("Invalid string length");
                }
                StringBuilder sb = new StringBuilder();
                short s = (short) i2;
                while (i6 < s) {
                    sb.append((char) oVar.mo17098r());
                    i6++;
                }
                if (i6 % 2 != 0) {
                    oVar2.mo17084t(1);
                    i6++;
                }
                int f = oVar.mo17087f();
                byte[] d = oVar2.mo17082d(f);
                int i7 = i6 + 4 + f;
                if (i7 % 2 != 0) {
                    oVar2.mo17084t(1);
                    i7++;
                }
                int i8 = i7;
                if (m.equals("8BIM")) {
                    if (p == 1028) {
                        new C5866c().mo17798d(new C5713n(d), eVar, (long) d.length, eVar3);
                    } else if (p == 1039) {
                        new C5860c().mo17776d(new C5700b(d), eVar2, eVar3);
                    } else {
                        if (p != 1058) {
                            if (p != 1059) {
                                if (p == 1060) {
                                    new C5735c().mo17178g(d, eVar2, eVar3);
                                } else if (p < 2000 || p > 2998) {
                                    eVar3.mo17118C(p, d);
                                } else {
                                    i5++;
                                    byte[] copyOf = Arrays.copyOf(d, d.length + sb.length() + 1);
                                    for (int length = (copyOf.length - sb.length()) - 1; length < copyOf.length; length++) {
                                        if (length % (((copyOf.length - sb.length()) - 1) + sb.length()) == 0) {
                                            copyOf[length] = (byte) sb.length();
                                        } else {
                                            copyOf[length] = (byte) sb.charAt(length - ((copyOf.length - sb.length()) - 1));
                                        }
                                    }
                                    HashMap<Integer, String> hashMap = C5985e.f16562f;
                                    int i9 = i5 + 1999;
                                    Integer valueOf = Integer.valueOf(i9);
                                    hashMap.put(valueOf, "Path Info " + i5);
                                    eVar3.mo17118C(i9, copyOf);
                                }
                            }
                        }
                        new C5825i().mo17747e(new C5700b(d), eVar2, 0, eVar3);
                    }
                    if (p >= 4000 && p <= 4999) {
                        C5985e.f16562f.put(Integer.valueOf(p), String.format("Plug-in %d Data", new Object[]{Integer.valueOf((p - 4000) + 1)}));
                    }
                }
                i4 = i8;
            } catch (Exception e) {
                eVar3.mo17137a(e.getMessage());
                return;
            }
        }
    }
}
