package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.l1 */
final class C4401l1 {

    /* renamed from: a */
    private byte[] f12552a = new byte[4096];

    /* renamed from: b */
    private int f12553b;

    /* renamed from: c */
    private long f12554c;

    /* renamed from: d */
    private long f12555d;

    /* renamed from: e */
    private int f12556e;

    /* renamed from: f */
    private int f12557f;

    /* renamed from: g */
    private int f12558g;

    /* renamed from: h */
    private boolean f12559h;

    /* renamed from: i */
    private String f12560i;

    public C4401l1() {
        mo13896d();
    }

    /* renamed from: e */
    private final int m16880e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f12553b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f12552a, this.f12553b, min);
        int i5 = this.f12553b + min;
        this.f12553b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: a */
    public final int mo13893a(byte[] bArr, int i, int i2) {
        int e = m16880e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f12554c == -1) {
            long b = C4393j1.m16866b(this.f12552a, 0);
            this.f12554c = b;
            if (b == 67324752) {
                this.f12559h = false;
                this.f12555d = C4393j1.m16866b(this.f12552a, 18);
                this.f12558g = C4393j1.m16867c(this.f12552a, 8);
                this.f12556e = C4393j1.m16867c(this.f12552a, 26);
                int c = this.f12556e + 30 + C4393j1.m16867c(this.f12552a, 28);
                this.f12557f = c;
                int length = this.f12552a.length;
                if (length < c) {
                    do {
                        length += length;
                    } while (length < c);
                    this.f12552a = Arrays.copyOf(this.f12552a, length);
                }
            } else {
                this.f12559h = true;
            }
        }
        int e2 = m16880e(this.f12557f, bArr, i + e, i2 - e);
        if (e2 == -1) {
            return -1;
        }
        int i3 = e + e2;
        if (!this.f12559h && this.f12560i == null) {
            this.f12560i = new String(this.f12552a, 30, this.f12556e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C4370d2 mo13894b() {
        int i = this.f12553b;
        int i2 = this.f12557f;
        if (i < i2) {
            return C4370d2.m16806a(this.f12560i, this.f12555d, this.f12558g, true, Arrays.copyOf(this.f12552a, i), this.f12559h);
        }
        C4370d2 a = C4370d2.m16806a(this.f12560i, this.f12555d, this.f12558g, false, Arrays.copyOf(this.f12552a, i2), this.f12559h);
        mo13896d();
        return a;
    }

    /* renamed from: c */
    public final int mo13895c() {
        return this.f12557f;
    }

    /* renamed from: d */
    public final void mo13896d() {
        this.f12553b = 0;
        this.f12556e = -1;
        this.f12554c = -1;
        this.f12559h = false;
        this.f12557f = 30;
        this.f12555d = -1;
        this.f12558g = -1;
        this.f12560i = null;
    }
}
