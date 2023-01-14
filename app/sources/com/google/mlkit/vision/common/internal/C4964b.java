package com.google.mlkit.vision.common.internal;

/* renamed from: com.google.mlkit.vision.common.internal.b */
public class C4964b {
    /* renamed from: a */
    public static int m18857a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Invalid rotation: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
