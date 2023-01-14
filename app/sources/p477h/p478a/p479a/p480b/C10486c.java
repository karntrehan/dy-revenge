package p477h.p478a.p479a.p480b;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p477h.p478a.p479a.p480b.p481f.C10489a;
import p477h.p478a.p479a.p480b.p481f.C10490b;
import p477h.p478a.p479a.p480b.p481f.C10491c;
import p477h.p478a.p479a.p480b.p482i.C10495a;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.p489r.C10552a;

/* renamed from: h.a.a.b.c */
public class C10486c {
    /* renamed from: a */
    public static byte[] m35380a(byte[] bArr, char[] cArr, C10552a aVar) {
        C10490b bVar = new C10490b(new C10491c("HmacSHA1", "ISO-8859-1", bArr, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
        int g = aVar.mo26192g();
        int h = aVar.mo26193h();
        int i = g + h + 2;
        byte[] f = bVar.mo25885f(cArr, i);
        if (f != null && f.length == i) {
            return f;
        }
        throw new C10497a(String.format("Derived Key invalid for Key Length [%d] MAC Length [%d]", new Object[]{Integer.valueOf(g), Integer.valueOf(h)}));
    }

    /* renamed from: b */
    public static byte[] m35381b(byte[] bArr, C10552a aVar) {
        byte[] bArr2 = new byte[2];
        System.arraycopy(bArr, aVar.mo26192g() + aVar.mo26193h(), bArr2, 0, 2);
        return bArr2;
    }

    /* renamed from: c */
    public static C10495a m35382c(byte[] bArr, C10552a aVar) {
        int g = aVar.mo26192g();
        byte[] bArr2 = new byte[g];
        System.arraycopy(bArr, 0, bArr2, 0, g);
        return new C10495a(bArr2);
    }

    /* renamed from: d */
    public static C10489a m35383d(byte[] bArr, C10552a aVar) {
        int h = aVar.mo26193h();
        byte[] bArr2 = new byte[h];
        System.arraycopy(bArr, aVar.mo26192g(), bArr2, 0, h);
        C10489a aVar2 = new C10489a("HmacSHA1");
        aVar2.mo25881c(bArr2);
        return aVar2;
    }

    /* renamed from: e */
    public static void m35384e(byte[] bArr, int i) {
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        for (int i2 = 4; i2 <= 15; i2++) {
            bArr[i2] = 0;
        }
    }
}
