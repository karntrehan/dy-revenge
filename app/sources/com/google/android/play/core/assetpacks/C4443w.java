package com.google.android.play.core.assetpacks;

import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.w */
final class C4443w extends InputStream {

    /* renamed from: f */
    private final InputStream f12685f;

    /* renamed from: o */
    private long f12686o;

    C4443w(InputStream inputStream, long j) {
        this.f12685f = inputStream;
        this.f12686o = j;
    }

    public final void close() {
        super.close();
        this.f12685f.close();
        this.f12686o = 0;
    }

    public final int read() {
        long j = this.f12686o;
        if (j <= 0) {
            return -1;
        }
        this.f12686o = j - 1;
        return this.f12685f.read();
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f12686o;
        if (j <= 0) {
            return -1;
        }
        int read = this.f12685f.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f12686o -= (long) read;
        }
        return read;
    }
}
