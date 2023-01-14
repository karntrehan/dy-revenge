package androidx.camera.core.impl.p014a3;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* renamed from: androidx.camera.core.impl.a3.a */
class C0715a extends FilterOutputStream {

    /* renamed from: f */
    final OutputStream f2224f;

    /* renamed from: o */
    private ByteOrder f2225o;

    C0715a(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f2224f = outputStream;
        this.f2225o = byteOrder;
    }

    /* renamed from: A */
    public void mo2815A(int i) {
        mo2819o((short) i);
    }

    /* renamed from: a */
    public void mo2816a(ByteOrder byteOrder) {
        this.f2225o = byteOrder;
    }

    /* renamed from: b */
    public void mo2817b(int i) {
        this.f2224f.write(i);
    }

    /* renamed from: h */
    public void mo2818h(int i) {
        OutputStream outputStream;
        int i2;
        ByteOrder byteOrder = this.f2225o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2224f.write((i >>> 0) & 255);
            this.f2224f.write((i >>> 8) & 255);
            this.f2224f.write((i >>> 16) & 255);
            outputStream = this.f2224f;
            i2 = i >>> 24;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f2224f.write((i >>> 24) & 255);
            this.f2224f.write((i >>> 16) & 255);
            this.f2224f.write((i >>> 8) & 255);
            outputStream = this.f2224f;
            i2 = i >>> 0;
        } else {
            return;
        }
        outputStream.write(i2 & 255);
    }

    /* renamed from: o */
    public void mo2819o(short s) {
        OutputStream outputStream;
        int i;
        ByteOrder byteOrder = this.f2225o;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f2224f.write((s >>> 0) & 255);
            outputStream = this.f2224f;
            i = s >>> 8;
        } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
            this.f2224f.write((s >>> 8) & 255);
            outputStream = this.f2224f;
            i = s >>> 0;
        } else {
            return;
        }
        outputStream.write(i & 255);
    }

    /* renamed from: r */
    public void mo2820r(long j) {
        mo2818h((int) j);
    }

    public void write(byte[] bArr) {
        this.f2224f.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f2224f.write(bArr, i, i2);
    }
}
