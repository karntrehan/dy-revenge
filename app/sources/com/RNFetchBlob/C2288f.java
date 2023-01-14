package com.RNFetchBlob;

/* renamed from: com.RNFetchBlob.f */
public class C2288f {

    /* renamed from: a */
    private long f6752a = 0;

    /* renamed from: b */
    private int f6753b = 0;

    /* renamed from: c */
    private int f6754c = -1;

    /* renamed from: d */
    private int f6755d = -1;

    /* renamed from: e */
    private boolean f6756e = false;

    /* renamed from: f */
    private C2289a f6757f = C2289a.Download;

    /* renamed from: com.RNFetchBlob.f$a */
    enum C2289a {
        Upload,
        Download
    }

    C2288f(boolean z, int i, int i2, C2289a aVar) {
        this.f6756e = z;
        this.f6755d = i;
        this.f6757f = aVar;
        this.f6754c = i2;
    }

    /* renamed from: a */
    public boolean mo7651a(float f) {
        int i = this.f6754c;
        boolean z = false;
        boolean z2 = i <= 0 || f <= 0.0f || Math.floor((double) (f * ((float) i))) > ((double) this.f6753b);
        if (System.currentTimeMillis() - this.f6752a > ((long) this.f6755d) && this.f6756e && z2) {
            z = true;
        }
        if (z) {
            this.f6753b++;
            this.f6752a = System.currentTimeMillis();
        }
        return z;
    }
}
