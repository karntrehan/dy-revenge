package p493i;

import p455g.p459d0.C10283d;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.b */
public final class C10589b {
    /* renamed from: a */
    public static final byte[] m35963a(String str) {
        C10457l.m35320e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C10283d.f27505b);
        C10457l.m35319d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m35964b(byte[] bArr) {
        C10457l.m35320e(bArr, "$this$toUtf8String");
        return new String(bArr, C10283d.f27505b);
    }
}
