package p174e.p247e.p294k.p313q;

import com.facebook.imagepipeline.nativecode.C2437c;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p294k.p302f.C6342m;

/* renamed from: e.e.k.q.f */
public class C6404f implements C6402d {

    /* renamed from: a */
    private final int f17838a;

    /* renamed from: b */
    private final boolean f17839b;

    /* renamed from: c */
    private final C6402d f17840c;

    /* renamed from: d */
    private final Integer f17841d;

    /* renamed from: e */
    private final boolean f17842e;

    public C6404f(int i, boolean z, C6402d dVar, Integer num, boolean z2) {
        this.f17838a = i;
        this.f17839b = z;
        this.f17840c = dVar;
        this.f17841d = num;
        this.f17842e = z2;
    }

    /* renamed from: a */
    private C6401c m24506a(C6253c cVar, boolean z) {
        C6402d dVar = this.f17840c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z);
    }

    /* renamed from: b */
    private C6401c m24507b(C6253c cVar, boolean z) {
        Integer num = this.f17841d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return m24508c(cVar, z);
        }
        if (intValue == 1) {
            return m24509d(cVar, z);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    /* renamed from: c */
    private C6401c m24508c(C6253c cVar, boolean z) {
        return C2437c.m10148a(this.f17838a, this.f17839b, this.f17842e).createImageTranscoder(cVar, z);
    }

    /* renamed from: d */
    private C6401c m24509d(C6253c cVar, boolean z) {
        return new C6406h(this.f17838a).createImageTranscoder(cVar, z);
    }

    public C6401c createImageTranscoder(C6253c cVar, boolean z) {
        C6401c a = m24506a(cVar, z);
        if (a == null) {
            a = m24507b(cVar, z);
        }
        if (a == null && C6342m.m24169a()) {
            a = m24508c(cVar, z);
        }
        return a == null ? m24509d(cVar, z) : a;
    }
}
