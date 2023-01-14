package p174e.p199d.p218c.p227m;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import p174e.p199d.p200a.p214s.C5695d;
import p174e.p199d.p200a.p214s.C5696e;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5711l;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p217b.C5715p;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p223e0.C5735c;
import p174e.p199d.p218c.p232q.C5860c;
import p174e.p199d.p218c.p246z.C5986f;
import p174e.p199d.p218c.p246z.C5987g;

/* renamed from: e.d.c.m.c */
public class C5758c {

    /* renamed from: a */
    private int f16271a;

    /* renamed from: a */
    private void m21505a(C5757b bVar, String str, String str2) {
        int i;
        Integer num = C5757b.f16270g.get(str);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 8) {
                m21509f(bVar, str2);
            } else if (intValue != 36) {
                if (!C5757b.f16269f.containsKey(num) || bVar.mo17138b(num.intValue())) {
                    i = 0;
                } else {
                    bVar.mo17133R(num.intValue(), str2);
                    i = num.intValue();
                }
                this.f16271a = i;
            } else {
                int i2 = this.f16271a;
                bVar.mo17133R(i2, bVar.mo17153r(this.f16271a) + " " + str2);
            }
            this.f16271a = num.intValue();
        }
    }

    /* renamed from: b */
    private static byte[] m21506b(C5714o oVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        char c = 0;
        byte b = 0;
        int i = 0;
        while (!z) {
            b = oVar.mo17080b();
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        int j = m21513j(b);
                        if (j != -1) {
                            i = j * 16;
                            c = 3;
                        } else if (b != 13 && b != 10) {
                            return null;
                        } else {
                            c = 0;
                        }
                    } else if (c == 3) {
                        int j2 = m21513j(b);
                        if (j2 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write(j2 + i);
                    } else {
                        continue;
                    }
                } else if (b != 32) {
                    z = true;
                }
                c = 2;
            } else if (!(b == 10 || b == 13 || b == 32)) {
                if (b != 37) {
                    return null;
                }
                c = 1;
            }
        }
        while (b != 10) {
            b = oVar.mo17080b();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    private void m21507c(C5757b bVar, C5732e eVar, C5714o oVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.setLength(0);
            while (true) {
                char b = (char) oVar.mo17080b();
                if (b != 13 && b != 10) {
                    sb.append(b);
                }
            }
            if (sb.length() == 0 || sb.charAt(0) == '%') {
                int indexOf = sb.indexOf(":");
                if (indexOf != -1) {
                    str = sb.substring(0, indexOf).trim();
                    m21505a(bVar, str, sb.substring(indexOf + 1).trim());
                } else {
                    str = sb.toString().trim();
                }
                if (str.equals("%BeginPhotoshop")) {
                    m21510g(eVar, oVar);
                } else if (str.equals("%%BeginICCProfile")) {
                    m21508e(eVar, oVar);
                } else if (str.equals("%begin_xml_packet")) {
                    m21511h(eVar, oVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    private static void m21508e(C5732e eVar, C5714o oVar) {
        byte[] b = m21506b(oVar);
        if (b != null) {
            new C5860c().mo17775c(new C5700b(b), eVar);
        }
    }

    /* renamed from: f */
    private static void m21509f(C5757b bVar, String str) {
        bVar.mo17133R(8, str.trim());
        String[] split = str.split(" ");
        int i = 0;
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        int parseInt3 = Integer.parseInt(split[3]);
        if (!bVar.mo17138b(28)) {
            bVar.mo17125J(28, parseInt);
        }
        if (!bVar.mo17138b(29)) {
            bVar.mo17125J(29, parseInt2);
        }
        if (!bVar.mo17138b(30)) {
            bVar.mo17125J(30, parseInt3);
        }
        if (!bVar.mo17138b(31)) {
            if (parseInt3 == 1) {
                i = 1;
            } else if (parseInt3 == 2 || parseInt3 == 3 || parseInt3 == 4) {
                i = 3;
            }
            if (i != 0) {
                bVar.mo17125J(31, i * parseInt * parseInt2);
            }
        }
    }

    /* renamed from: g */
    private static void m21510g(C5732e eVar, C5714o oVar) {
        byte[] b = m21506b(oVar);
        if (b != null) {
            new C5986f().mo17893c(new C5713n(b), b.length, eVar);
        }
    }

    /* renamed from: h */
    private static void m21511h(C5732e eVar, C5714o oVar) {
        new C5735c().mo17174c(new String(m21512i(oVar, "<?xpacket end=\"w\"?>".getBytes()), C5705f.f16151a), eVar);
    }

    /* renamed from: i */
    private static byte[] m21512i(C5714o oVar, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i = 0;
        while (i != length) {
            byte b = oVar.mo17080b();
            i = b == bArr[i] ? i + 1 : 0;
            byteArrayOutputStream.write(b);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: j */
    private static int m21513j(byte b) {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        byte b2 = 65;
        if (b < 65 || b > 70) {
            b2 = 97;
            if (b < 97 || b > 102) {
                return -1;
            }
        }
        return (b - b2) + 10;
    }

    /* renamed from: d */
    public void mo17230d(InputStream inputStream, C5732e eVar) {
        C5711l lVar = new C5711l(inputStream);
        C5757b bVar = new C5757b();
        eVar.mo17166a(bVar);
        int h = lVar.mo17044h(0);
        if (h == -976170042) {
            lVar.mo17058w(false);
            int h2 = lVar.mo17044h(4);
            int h3 = lVar.mo17044h(8);
            int h4 = lVar.mo17044h(12);
            int h5 = lVar.mo17044h(16);
            int h6 = lVar.mo17044h(20);
            int h7 = lVar.mo17044h(24);
            if (h7 != 0) {
                bVar.mo17125J(32, h7);
                bVar.mo17125J(33, h6);
                try {
                    new C5696e().mo17016d(new C5700b(lVar.mo17018c(h6, h7)), new C5987g(eVar, (C5722b) null), 0);
                } catch (C5695d e) {
                    bVar.mo17137a("Unable to process TIFF data: " + e.getMessage());
                }
            } else if (h5 != 0) {
                bVar.mo17125J(34, h5);
                bVar.mo17125J(35, h4);
            }
            m21507c(bVar, eVar, new C5713n(lVar.mo17018c(h2, h3)));
        } else if (h != 622940243) {
            bVar.mo17137a("File type not supported.");
        } else {
            inputStream.reset();
            m21507c(bVar, eVar, new C5715p(inputStream));
        }
    }
}
