package com.google.firebase.installations;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: com.google.firebase.installations.i */
public class C4843i {

    /* renamed from: a */
    private static final byte f13628a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f13629b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m18499b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m18500c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String mo14758a() {
        byte[] c = m18500c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f13629b & c[0]) | f13628a);
        return m18499b(c);
    }
}
