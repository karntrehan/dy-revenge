package okhttp3.internal.http2;

import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p455g.p470y.p472d.C10457l;
import p493i.C10616i;

public final class Http2 {
    private static final String[] BINARY;
    public static final C10616i CONNECTION_PREFACE = C10616i.f28050o.mo26428d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FLAGS = new String[64];
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            C10457l.m35319d(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = C10299p.m34937w(Util.format("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = HttpUrl.FRAGMENT_ENCODE_SET;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = FLAGS;
            strArr3[i3 | 8] = C10457l.m35326k(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = FLAGS;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i9] == null) {
                strArr6[i9] = BINARY[i9];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i2) {
        String str;
        boolean z;
        int i3;
        Object obj;
        String str2;
        String str3;
        if (i2 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4 || i == 6) {
                return i2 == 1 ? "ACK" : BINARY[i2];
            }
            if (!(i == 7 || i == 8)) {
                String[] strArr = FLAGS;
                if (i2 < strArr.length) {
                    str = strArr[i2];
                    C10457l.m35317b(str);
                } else {
                    str = BINARY[i2];
                }
                String str4 = str;
                if (i == 5 && (i2 & 4) != 0) {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else if (i != 0 || (i2 & 32) == 0) {
                    return str4;
                } else {
                    z = false;
                    i3 = 4;
                    obj = null;
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return C10299p.m34938x(str4, str2, str3, z, i3, obj);
            }
        }
        return BINARY[i2];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        if (i < strArr.length) {
            return strArr[i];
        }
        return Util.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        return Util.format("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp(i3), formatFlags(i3, i4));
    }
}
