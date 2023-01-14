package p174e.p199d.p200a.p209n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p174e.p199d.p217b.C5714o;

/* renamed from: e.d.a.n.c */
public class C5678c {

    /* renamed from: a */
    private static final byte[] f16088a = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: a */
    public Iterable<C5677b> mo16959a(C5714o oVar, Set<C5679d> set) {
        oVar.mo17099s(true);
        byte[] bArr = f16088a;
        if (Arrays.equals(bArr, oVar.mo17082d(bArr.length))) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                int f = oVar.mo17087f();
                if (f >= 0) {
                    C5679d dVar = new C5679d(oVar.mo17082d(4));
                    boolean z3 = set == null || set.contains(dVar);
                    byte[] d = oVar.mo17082d(f);
                    oVar.mo17084t(4);
                    if (!z3 || !hashSet.contains(dVar) || dVar.mo16960a()) {
                        C5679d dVar2 = C5679d.f16090b;
                        if (dVar.equals(dVar2)) {
                            z2 = true;
                        } else if (!z2) {
                            throw new C5683h(String.format("First chunk should be '%s', but '%s' was observed", new Object[]{dVar2, dVar}));
                        }
                        if (dVar.equals(C5679d.f16093e)) {
                            z = true;
                        }
                        if (z3) {
                            arrayList.add(new C5677b(dVar, d));
                        }
                        hashSet.add(dVar);
                    } else {
                        throw new C5683h(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", new Object[]{dVar}));
                    }
                } else {
                    throw new C5683h("PNG chunk length exceeds maximum");
                }
            }
            return arrayList;
        }
        throw new C5683h("PNG signature mismatch");
    }
}
