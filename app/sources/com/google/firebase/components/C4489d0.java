package com.google.firebase.components;

import java.util.Objects;

/* renamed from: com.google.firebase.components.d0 */
public final class C4489d0 {
    /* renamed from: a */
    public static void m17106a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m17107b(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: c */
    public static <T> T m17108c(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: d */
    public static void m17109d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
