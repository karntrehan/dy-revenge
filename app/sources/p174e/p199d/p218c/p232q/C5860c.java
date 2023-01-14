package p174e.p199d.p218c.p232q;

import java.io.IOException;
import java.util.Collections;
import p174e.p199d.p200a.p206k.C5669d;
import p174e.p199d.p200a.p206k.C5671f;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5707h;
import p174e.p199d.p217b.C5710k;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.q.c */
public class C5860c implements C5669d {
    /* renamed from: e */
    public static String m22268e(int i) {
        return new String(new byte[]{(byte) ((-16777216 & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)});
    }

    /* renamed from: f */
    private void m22269f(C5722b bVar, int i, C5710k kVar) {
        int h = kVar.mo17044h(i);
        if (h != 0) {
            bVar.mo17133R(i, m22268e(h));
        }
    }

    /* renamed from: g */
    private void m22270g(C5859b bVar, int i, C5710k kVar) {
        C5859b bVar2 = bVar;
        int i2 = i;
        C5710k kVar2 = kVar;
        int s = kVar2.mo17054s(i2);
        int s2 = kVar2.mo17054s(i2 + 2);
        int s3 = kVar2.mo17054s(i2 + 4);
        int s4 = kVar2.mo17054s(i2 + 6);
        int s5 = kVar2.mo17054s(i2 + 8);
        int s6 = kVar2.mo17054s(i2 + 10);
        if (!C5707h.m21215a(s, s2 - 1, s3) || !C5707h.m21216b(s4, s5, s6)) {
            bVar2.mo17137a(String.format("ICC data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5), Integer.valueOf(s6)}));
            return;
        }
        bVar2.mo17133R(i2, String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[]{Integer.valueOf(s), Integer.valueOf(s2), Integer.valueOf(s3), Integer.valueOf(s4), Integer.valueOf(s5), Integer.valueOf(s6)}));
    }

    /* renamed from: h */
    private void m22271h(C5722b bVar, int i, C5710k kVar) {
        int h = kVar.mo17044h(i);
        if (h != 0) {
            bVar.mo17125J(i, h);
        }
    }

    /* renamed from: i */
    private void m22272i(C5722b bVar, int i, C5710k kVar) {
        long i2 = kVar.mo17045i(i);
        if (i2 != 0) {
            bVar.mo17127L(i, i2);
        }
    }

    /* renamed from: a */
    public void mo16941a(Iterable<byte[]> iterable, C5732e eVar, C5671f fVar) {
        byte[] bArr = null;
        for (byte[] next : iterable) {
            if (next.length >= 11 && "ICC_PROFILE".equalsIgnoreCase(new String(next, 0, 11))) {
                if (bArr == null) {
                    bArr = new byte[(next.length - 14)];
                    System.arraycopy(next, 14, bArr, 0, next.length - 14);
                } else {
                    byte[] bArr2 = new byte[((bArr.length + next.length) - 14)];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    System.arraycopy(next, 14, bArr2, bArr.length, next.length - 14);
                    bArr = bArr2;
                }
            }
        }
        if (bArr != null) {
            mo17775c(new C5700b(bArr), eVar);
        }
    }

    /* renamed from: b */
    public Iterable<C5671f> mo16942b() {
        return Collections.singletonList(C5671f.APP2);
    }

    /* renamed from: c */
    public void mo17775c(C5710k kVar, C5732e eVar) {
        mo17776d(kVar, eVar, (C5722b) null);
    }

    /* renamed from: d */
    public void mo17776d(C5710k kVar, C5732e eVar, C5722b bVar) {
        C5859b bVar2 = new C5859b();
        if (bVar != null) {
            bVar2.mo17130O(bVar);
        }
        try {
            bVar2.mo17125J(0, kVar.mo17044h(0));
            m22269f(bVar2, 4, kVar);
            m22271h(bVar2, 8, kVar);
            m22269f(bVar2, 12, kVar);
            m22269f(bVar2, 16, kVar);
            m22269f(bVar2, 20, kVar);
            m22270g(bVar2, 24, kVar);
            m22269f(bVar2, 36, kVar);
            m22269f(bVar2, 40, kVar);
            m22271h(bVar2, 44, kVar);
            m22269f(bVar2, 48, kVar);
            int h = kVar.mo17044h(52);
            if (h != 0) {
                if (h <= 538976288) {
                    bVar2.mo17125J(52, h);
                } else {
                    bVar2.mo17133R(52, m22268e(h));
                }
            }
            m22271h(bVar2, 64, kVar);
            m22272i(bVar2, 56, kVar);
            bVar2.mo17128M(68, new float[]{kVar.mo17050o(68), kVar.mo17050o(72), kVar.mo17050o(76)});
            int h2 = kVar.mo17044h(128);
            bVar2.mo17125J(128, h2);
            for (int i = 0; i < h2; i++) {
                int i2 = (i * 12) + 132;
                bVar2.mo17118C(kVar.mo17044h(i2), kVar.mo17018c(kVar.mo17044h(i2 + 4), kVar.mo17044h(i2 + 8)));
            }
        } catch (IOException e) {
            bVar2.mo17137a("Exception reading ICC profile: " + e.getMessage());
        }
        eVar.mo17166a(bVar2);
    }
}
