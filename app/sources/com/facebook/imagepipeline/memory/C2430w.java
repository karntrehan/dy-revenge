package com.facebook.imagepipeline.memory;

import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.memory.w */
public class C2430w {
    /* renamed from: a */
    static int m10110a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* renamed from: b */
    static void m10111b(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i4 >= 0));
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        C6062k.m22834b(Boolean.valueOf(i3 >= 0));
        C6062k.m22834b(Boolean.valueOf(i + i4 <= i5));
        if (i3 + i4 > i2) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
    }
}
