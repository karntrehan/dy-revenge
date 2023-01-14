package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.k */
public class C2416k {

    /* renamed from: a */
    private static final SparseIntArray f7194a = new SparseIntArray(0);

    /* renamed from: a */
    public static C2408f0 m10056a() {
        return new C2408f0(0, m10057b(), f7194a);
    }

    /* renamed from: b */
    private static int m10057b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min > 16777216 ? (min / 4) * 3 : min / 2;
    }
}
