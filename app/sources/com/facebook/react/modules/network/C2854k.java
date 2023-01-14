package com.facebook.react.modules.network;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.modules.network.k */
public class C2854k {

    /* renamed from: a */
    private final CharsetDecoder f8027a;

    /* renamed from: b */
    private byte[] f8028b = null;

    public C2854k(Charset charset) {
        this.f8027a = charset.newDecoder();
    }

    /* renamed from: a */
    public String mo9228a(byte[] bArr, int i) {
        byte[] bArr2 = this.f8028b;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[(bArr2.length + i)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.f8028b.length, i);
            i += this.f8028b.length;
            bArr = bArr3;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
        boolean z = true;
        CharBuffer charBuffer = null;
        boolean z2 = false;
        int i2 = 0;
        while (!z2 && i2 < 4) {
            try {
                charBuffer = this.f8027a.decode(wrap);
                z2 = true;
            } catch (CharacterCodingException unused) {
                i2++;
                wrap = ByteBuffer.wrap(bArr, 0, i - i2);
            }
        }
        if (!z2 || i2 <= 0) {
            z = false;
        }
        if (z) {
            byte[] bArr4 = new byte[i2];
            this.f8028b = bArr4;
            System.arraycopy(bArr, i - i2, bArr4, 0, i2);
        } else {
            this.f8028b = null;
        }
        if (z2) {
            return new String(charBuffer.array(), 0, charBuffer.length());
        }
        C6071a.m22859G("ReactNative", "failed to decode string from byte array");
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
