package p174e.p181b.p182a.p188w.p190k;

import p174e.p181b.p182a.p195z.C5641b;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.w.k.c */
public class C5549c {

    /* renamed from: a */
    private final float[] f15649a;

    /* renamed from: b */
    private final int[] f15650b;

    public C5549c(float[] fArr, int[] iArr) {
        this.f15649a = fArr;
        this.f15650b = iArr;
    }

    /* renamed from: a */
    public int[] mo16714a() {
        return this.f15650b;
    }

    /* renamed from: b */
    public float[] mo16715b() {
        return this.f15649a;
    }

    /* renamed from: c */
    public int mo16716c() {
        return this.f15650b.length;
    }

    /* renamed from: d */
    public void mo16717d(C5549c cVar, C5549c cVar2, float f) {
        if (cVar.f15650b.length == cVar2.f15650b.length) {
            for (int i = 0; i < cVar.f15650b.length; i++) {
                this.f15649a[i] = C5646g.m21063k(cVar.f15649a[i], cVar2.f15649a[i], f);
                this.f15650b[i] = C5641b.m21020c(f, cVar.f15650b[i], cVar2.f15650b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f15650b.length + " vs " + cVar2.f15650b.length + ")");
    }
}
