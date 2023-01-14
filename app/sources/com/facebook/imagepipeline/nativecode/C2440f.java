package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.f */
public class C2440f {

    /* renamed from: a */
    private static C2439e f7226a = null;

    /* renamed from: b */
    public static boolean f7227b = false;

    static {
        try {
            f7226a = (C2439e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            f7227b = true;
        } catch (Throwable unused) {
            f7227b = false;
        }
    }

    /* renamed from: a */
    public static C2439e m10153a() {
        return f7226a;
    }
}
