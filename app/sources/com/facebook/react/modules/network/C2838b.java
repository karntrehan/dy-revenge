package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.react.modules.network.b */
public class C2838b extends FilterOutputStream {

    /* renamed from: f */
    private long f8003f = 0;

    public C2838b(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public long mo9209a() {
        return this.f8003f;
    }

    public void close() {
        this.out.close();
    }

    public void write(int i) {
        this.out.write(i);
        this.f8003f++;
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f8003f += (long) i2;
    }
}
