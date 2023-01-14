package p174e.p199d.p218c.p237v;

import java.io.Serializable;

/* renamed from: e.d.c.v.f */
public class C5881f implements Serializable {

    /* renamed from: f */
    private final int f16362f;

    /* renamed from: o */
    private final int f16363o;

    /* renamed from: p */
    private final int f16364p;

    public C5881f(int i, int i2, int i3) {
        this.f16362f = i;
        this.f16363o = i2;
        this.f16364p = i3;
    }

    /* renamed from: a */
    public String mo17808a() {
        int i = this.f16362f;
        if (i == 1) {
            return "Y";
        }
        if (i == 2) {
            return "Cb";
        }
        if (i == 3) {
            return "Cr";
        }
        if (i == 4) {
            return "I";
        }
        if (i == 5) {
            return "Q";
        }
        return String.format("Unknown (%s)", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: b */
    public int mo17809b() {
        return (this.f16363o >> 4) & 15;
    }

    /* renamed from: c */
    public int mo17810c() {
        return this.f16363o & 15;
    }

    public String toString() {
        return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", new Object[]{Integer.valueOf(this.f16364p), Integer.valueOf(mo17809b()), Integer.valueOf(mo17810c())});
    }
}
