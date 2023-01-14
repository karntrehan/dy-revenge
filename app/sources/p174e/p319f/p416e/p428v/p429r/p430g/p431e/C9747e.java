package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.e */
final class C9747e extends C9751i {

    /* renamed from: c */
    private final String f26119c;

    /* renamed from: d */
    private final String f26120d;

    C9747e(C9679a aVar, String str, String str2) {
        super(aVar);
        this.f26119c = str2;
        this.f26120d = str;
    }

    /* renamed from: k */
    private void m33226k(StringBuilder sb, int i) {
        int f = mo24400b().mo24424f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f26119c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    /* renamed from: d */
    public String mo24396d() {
        if (mo24401c().mo24254j() == 84) {
            StringBuilder sb = new StringBuilder();
            mo24397f(sb, 8);
            mo24399j(sb, 48, 20);
            m33226k(sb, 68);
            return sb.toString();
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo24394h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f26120d);
        sb.append(i / 100000);
        sb.append(')');
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo24395i(int i) {
        return i % 100000;
    }
}
