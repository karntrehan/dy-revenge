package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C3772r;
import java.util.Objects;
import p497j.p498a.p499a.p500a.p501a.C10675a;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C3705r {
    /* renamed from: a */
    public static void m14336a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m14337b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m14338c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m14339d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name2).length() + 36 + String.valueOf(name).length());
            sb.append("Must be called on ");
            sb.append(name2);
            sb.append(" thread, but got ");
            sb.append(name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: e */
    public static void m14340e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static void m14341f(String str) {
        if (!C3772r.m14539a()) {
            throw new IllegalStateException(str);
        }
    }

    @C10675a
    /* renamed from: g */
    public static String m14342g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @C10675a
    /* renamed from: h */
    public static String m14343h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m14344i() {
        m14345j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m14345j(String str) {
        if (C3772r.m14539a()) {
            throw new IllegalStateException(str);
        }
    }

    @C10675a
    /* renamed from: k */
    public static <T> T m14346k(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    @C10675a
    /* renamed from: l */
    public static <T> T m14347l(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: m */
    public static int m14348m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static void m14349n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m14350o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: p */
    public static void m14351p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
