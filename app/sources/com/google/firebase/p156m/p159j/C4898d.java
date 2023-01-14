package com.google.firebase.p156m.p159j;

import java.io.OutputStream;

/* renamed from: com.google.firebase.m.j.d */
final class C4898d extends OutputStream {

    /* renamed from: f */
    private long f13738f = 0;

    C4898d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo14888a() {
        return this.f13738f;
    }

    public void write(int i) {
        this.f13738f++;
    }

    public void write(byte[] bArr) {
        this.f13738f += (long) bArr.length;
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f13738f += (long) i2;
    }
}
