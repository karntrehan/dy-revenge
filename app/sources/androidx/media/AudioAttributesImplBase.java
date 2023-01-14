package androidx.media;

import java.util.Arrays;

class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f3750a = 0;

    /* renamed from: b */
    int f3751b = 0;

    /* renamed from: c */
    int f3752c = 0;

    /* renamed from: d */
    int f3753d = -1;

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int mo4389a() {
        return this.f3751b;
    }

    /* renamed from: b */
    public int mo4390b() {
        int i = this.f3752c;
        int c = mo4391c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo4391c() {
        int i = this.f3753d;
        return i != -1 ? i : AudioAttributesCompat.m5362a(false, this.f3752c, this.f3750a);
    }

    /* renamed from: d */
    public int mo4392d() {
        return this.f3750a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3751b == audioAttributesImplBase.mo4389a() && this.f3752c == audioAttributesImplBase.mo4390b() && this.f3750a == audioAttributesImplBase.mo4392d() && this.f3753d == audioAttributesImplBase.f3753d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3751b), Integer.valueOf(this.f3752c), Integer.valueOf(this.f3750a), Integer.valueOf(this.f3753d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3753d != -1) {
            sb.append(" stream=");
            sb.append(this.f3753d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m5363b(this.f3750a));
        sb.append(" content=");
        sb.append(this.f3751b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3752c).toUpperCase());
        return sb.toString();
    }
}
