package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.d */
public class C2401d {

    /* renamed from: a */
    public static final int f7134a = m9969b();

    /* renamed from: b */
    private static int f7135b = 384;

    /* renamed from: c */
    private static volatile C2398c f7136c;

    /* renamed from: a */
    public static C2398c m9968a() {
        if (f7136c == null) {
            synchronized (C2401d.class) {
                if (f7136c == null) {
                    f7136c = new C2398c(f7135b, f7134a);
                }
            }
        }
        return f7136c;
    }

    /* renamed from: b */
    private static int m9969b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
