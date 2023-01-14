package p174e.p199d.p218c.p234s;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;

/* renamed from: e.d.c.s.d */
public final class C5867d {
    /* renamed from: a */
    public static String m22308a(byte[] bArr) {
        if (bArr.length > 2 && bArr[0] == 27 && bArr[1] == 37 && bArr[2] == 71) {
            return "UTF-8";
        }
        if (bArr.length > 3 && bArr[0] == 27 && ((bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16)) == 14844066 && bArr[4] == 65) {
            return "ISO-8859-1";
        }
        return null;
    }

    /* renamed from: b */
    static Charset m22309b(byte[] bArr) {
        int i = 0;
        String[] strArr = {"UTF-8", System.getProperty("file.encoding"), "ISO-8859-1"};
        while (i < 3) {
            Charset forName = Charset.forName(strArr[i]);
            try {
                forName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return forName;
            } catch (CharacterCodingException unused) {
                i++;
            }
        }
        return null;
    }
}
