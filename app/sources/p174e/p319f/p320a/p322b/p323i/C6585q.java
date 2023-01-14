package p174e.p319f.p320a.p322b.p323i;

import java.util.Set;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6466e;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;

/* renamed from: e.f.a.b.i.q */
final class C6585q implements C6468g {

    /* renamed from: a */
    private final Set<C6463b> f18200a;

    /* renamed from: b */
    private final C6583p f18201b;

    /* renamed from: c */
    private final C6587s f18202c;

    C6585q(Set<C6463b> set, C6583p pVar, C6587s sVar) {
        this.f18200a = set;
        this.f18201b = pVar;
        this.f18202c = sVar;
    }

    /* renamed from: a */
    public <T> C6467f<T> mo19245a(String str, Class<T> cls, C6463b bVar, C6466e<T, byte[]> eVar) {
        if (this.f18200a.contains(bVar)) {
            return new C6586r(this.f18201b, str, bVar, eVar, this.f18202c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f18200a}));
    }
}
