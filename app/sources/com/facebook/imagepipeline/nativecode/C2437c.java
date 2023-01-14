package com.facebook.imagepipeline.nativecode;

import java.lang.reflect.InvocationTargetException;
import p174e.p247e.p294k.p313q.C6402d;

/* renamed from: com.facebook.imagepipeline.nativecode.c */
public final class C2437c {
    /* renamed from: a */
    public static C6402d m10148a(int i, boolean z, boolean z2) {
        try {
            Class<?> cls = Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory");
            Class cls2 = Boolean.TYPE;
            return (C6402d) cls.getConstructor(new Class[]{Integer.TYPE, cls2, cls2}).newInstance(new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2)});
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        }
    }
}
