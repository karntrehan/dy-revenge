package p174e.p199d.p217b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e.d.b.d */
public class C5702d<T> {

    /* renamed from: a */
    private final C5703a<T> f16147a = new C5703a<>();

    /* renamed from: b */
    private int f16148b;

    /* renamed from: e.d.b.d$a */
    static class C5703a<T> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<Byte, C5703a<T>> f16149a = new HashMap();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public T f16150b = null;

        C5703a() {
        }

        /* renamed from: c */
        public void mo17027c(T t) {
            if (this.f16150b == null) {
                this.f16150b = t;
                return;
            }
            throw new RuntimeException("Value already set for this trie node");
        }
    }

    /* renamed from: a */
    public void mo17023a(T t, byte[]... bArr) {
        C5703a<T> aVar = this.f16147a;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b : bArr[r3]) {
                C5703a<T> aVar2 = (C5703a) aVar.f16149a.get(Byte.valueOf(b));
                if (aVar2 == null) {
                    aVar2 = new C5703a<>();
                    aVar.f16149a.put(Byte.valueOf(b), aVar2);
                }
                aVar = aVar2;
                i++;
            }
        }
        if (i != 0) {
            aVar.mo17027c(t);
            this.f16148b = Math.max(this.f16148b, i);
            return;
        }
        throw new IllegalArgumentException("Parts must contain at least one byte.");
    }

    /* renamed from: b */
    public T mo17024b(byte[] bArr) {
        C5703a<T> aVar = this.f16147a;
        T a = aVar.f16150b;
        for (byte valueOf : bArr) {
            aVar = (C5703a) aVar.f16149a.get(Byte.valueOf(valueOf));
            if (aVar == null) {
                break;
            }
            if (aVar.f16150b != null) {
                a = aVar.f16150b;
            }
        }
        return a;
    }

    /* renamed from: c */
    public int mo17025c() {
        return this.f16148b;
    }

    /* renamed from: d */
    public void mo17026d(T t) {
        this.f16147a.mo17027c(t);
    }
}
