package com.reactnativesafx.p172f;

import android.net.Uri;

/* renamed from: com.reactnativesafx.f.c */
public class C5358c {
    /* renamed from: a */
    public static String m19827a(String str) {
        return Uri.decode(m19829c(str));
    }

    /* renamed from: b */
    public static String m19828b(String str) {
        return Uri.parse(Uri.decode(str)).getLastPathSegment();
    }

    /* renamed from: c */
    public static String m19829c(String str) {
        String[] split = Uri.decode(str).split(":");
        return split[0] + ":" + split[1] + Uri.encode(":" + split[2]);
    }
}
