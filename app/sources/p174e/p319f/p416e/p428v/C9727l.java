package p174e.p319f.p416e.p428v;

import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9660f;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.l */
public final class C9727l extends C9731p {

    /* renamed from: i */
    private final C9731p f26060i = new C9720e();

    /* renamed from: s */
    private static C9668n m33127s(C9668n nVar) {
        String f = nVar.mo24226f();
        if (f.charAt(0) == '0') {
            C9668n nVar2 = new C9668n(f.substring(1), (byte[]) null, nVar.mo24225e(), C9655a.UPC_A);
            if (nVar.mo24224d() != null) {
                nVar2.mo24227g(nVar.mo24224d());
            }
            return nVar2;
        }
        throw C9660f.m32836a();
    }

    /* renamed from: b */
    public C9668n mo24217b(C9657c cVar, Map<C9659e, ?> map) {
        return m33127s(this.f26060i.mo24217b(cVar, map));
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        return m33127s(this.f26060i.mo24349c(i, aVar, map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo24350l(C9679a aVar, int[] iArr, StringBuilder sb) {
        return this.f26060i.mo24350l(aVar, iArr, sb);
    }

    /* renamed from: m */
    public C9668n mo24353m(int i, C9679a aVar, int[] iArr, Map<C9659e, ?> map) {
        return m33127s(this.f26060i.mo24353m(i, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C9655a mo24351q() {
        return C9655a.UPC_A;
    }
}
