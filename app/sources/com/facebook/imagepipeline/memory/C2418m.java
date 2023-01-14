package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.m */
public class C2418m {

    /* renamed from: a */
    public static final int f7195a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m10059a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: b */
    public static C2408f0 m10060b() {
        int i = f7195a;
        return new C2408f0(4194304, i * 4194304, m10059a(131072, 4194304, i), 131072, 4194304, i);
    }
}
