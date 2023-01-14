package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
public final class C4397k1 extends InputStream {

    /* renamed from: f */
    private final Enumeration<File> f12538f;

    /* renamed from: o */
    private InputStream f12539o;

    public C4397k1(Enumeration<File> enumeration) {
        this.f12538f = enumeration;
        mo13887a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13887a() {
        InputStream inputStream = this.f12539o;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f12539o = this.f12538f.hasMoreElements() ? new FileInputStream(this.f12538f.nextElement()) : null;
    }

    public final void close() {
        super.close();
        InputStream inputStream = this.f12539o;
        if (inputStream != null) {
            inputStream.close();
            this.f12539o = null;
        }
    }

    public final int read() {
        while (true) {
            InputStream inputStream = this.f12539o;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo13887a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f12539o == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f12539o.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo13887a();
            } while (this.f12539o != null);
            return -1;
        }
    }
}
