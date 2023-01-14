package com.reactnativesafx.p172f;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* renamed from: com.reactnativesafx.f.b */
public class C5357b {
    /* renamed from: a */
    public static byte[] m19826a(String str, String str2) {
        if (str2 != null) {
            if (str2.equalsIgnoreCase("ascii")) {
                return str.getBytes(StandardCharsets.US_ASCII);
            }
            if (str2.toLowerCase().contains("base64")) {
                return Base64.decode(str, 2);
            }
            if (str2.equalsIgnoreCase("utf8")) {
                return str.getBytes(StandardCharsets.UTF_8);
            }
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
