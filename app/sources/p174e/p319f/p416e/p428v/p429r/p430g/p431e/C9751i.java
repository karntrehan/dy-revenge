package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.i */
abstract class C9751i extends C9750h {
    C9751i(C9679a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo24394h(StringBuilder sb, int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo24395i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo24399j(StringBuilder sb, int i, int i2) {
        int f = mo24400b().mo24424f(i, i2);
        mo24394h(sb, f);
        int i3 = mo24395i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
