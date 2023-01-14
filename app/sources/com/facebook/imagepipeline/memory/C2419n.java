package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import okhttp3.internal.http2.Http2;

/* renamed from: com.facebook.imagepipeline.memory.n */
public class C2419n {
    /* renamed from: a */
    public static C2408f0 m10061a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C2408f0(m10063c(), m10062b(), sparseIntArray);
    }

    /* renamed from: b */
    private static int m10062b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return min < 16777216 ? min / 2 : (min / 4) * 3;
    }

    /* renamed from: c */
    private static int m10063c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
