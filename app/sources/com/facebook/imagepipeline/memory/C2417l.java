package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import okhttp3.internal.http2.Http2;

/* renamed from: com.facebook.imagepipeline.memory.l */
public class C2417l {
    /* renamed from: a */
    public static C2408f0 m10058a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(Http2.INITIAL_MAX_FRAME_SIZE, 5);
        return new C2408f0(81920, 1048576, sparseIntArray);
    }
}
