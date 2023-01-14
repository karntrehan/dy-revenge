package com.facebook.react.views.image;

import android.graphics.Shader;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import p174e.p247e.p274h.p284e.C6205q;

/* renamed from: com.facebook.react.views.image.d */
public class C3100d {
    /* renamed from: a */
    public static Shader.TileMode m12206a() {
        return Shader.TileMode.CLAMP;
    }

    /* renamed from: b */
    public static C6205q.C6207b m12207b() {
        return C6205q.C6207b.f17207i;
    }

    /* renamed from: c */
    public static C6205q.C6207b m12208c(String str) {
        if ("contain".equals(str)) {
            return C6205q.C6207b.f17203e;
        }
        if ("cover".equals(str)) {
            return C6205q.C6207b.f17207i;
        }
        if ("stretch".equals(str)) {
            return C6205q.C6207b.f17199a;
        }
        if ("center".equals(str)) {
            return C6205q.C6207b.f17206h;
        }
        if ("repeat".equals(str)) {
            return C3110i.f8647l;
        }
        if (str == null) {
            return m12207b();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }

    /* renamed from: d */
    public static Shader.TileMode m12209d(String str) {
        if ("contain".equals(str) || "cover".equals(str) || "stretch".equals(str) || "center".equals(str)) {
            return Shader.TileMode.CLAMP;
        }
        if ("repeat".equals(str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str == null) {
            return m12206a();
        }
        throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
    }
}
