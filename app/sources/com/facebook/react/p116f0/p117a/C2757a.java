package com.facebook.react.p116f0.p117a;

import android.content.ContextWrapper;

/* renamed from: com.facebook.react.f0.a.a */
public class C2757a {
    /* renamed from: a */
    public static <T> T m11062a(T t, Class<? extends T> cls) {
        T baseContext;
        while (!cls.isInstance(t)) {
            if (!(t instanceof ContextWrapper) || t == (baseContext = ((ContextWrapper) t).getBaseContext())) {
                return null;
            }
            t = baseContext;
        }
        return t;
    }
}
