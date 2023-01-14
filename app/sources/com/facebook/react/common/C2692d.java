package com.facebook.react.common;

import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.common.d */
public class C2692d {

    /* renamed from: a */
    private long[] f7780a;

    /* renamed from: b */
    private int f7781b = 0;

    private C2692d(int i) {
        this.f7780a = new long[i];
    }

    /* renamed from: b */
    public static C2692d m10904b(int i) {
        return new C2692d(i);
    }

    /* renamed from: e */
    private void m10905e() {
        int i = this.f7781b;
        if (i == this.f7780a.length) {
            long[] jArr = new long[Math.max(i + 1, (int) (((double) i) * 1.8d))];
            System.arraycopy(this.f7780a, 0, jArr, 0, this.f7781b);
            this.f7780a = jArr;
        }
    }

    /* renamed from: a */
    public void mo8809a(long j) {
        m10905e();
        long[] jArr = this.f7780a;
        int i = this.f7781b;
        this.f7781b = i + 1;
        jArr[i] = j;
    }

    /* renamed from: c */
    public void mo8810c(int i) {
        int i2 = this.f7781b;
        if (i <= i2) {
            this.f7781b = i2 - i;
            return;
        }
        throw new IndexOutOfBoundsException("Trying to drop " + i + " items from array of length " + this.f7781b);
    }

    /* renamed from: d */
    public long mo8811d(int i) {
        if (i < this.f7781b) {
            return this.f7780a[i];
        }
        throw new IndexOutOfBoundsException(HttpUrl.FRAGMENT_ENCODE_SET + i + " >= " + this.f7781b);
    }

    /* renamed from: f */
    public void mo8812f(int i, long j) {
        if (i < this.f7781b) {
            this.f7780a[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(HttpUrl.FRAGMENT_ENCODE_SET + i + " >= " + this.f7781b);
    }

    /* renamed from: g */
    public int mo8813g() {
        return this.f7781b;
    }
}
