package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.soloader.p127o.C3291a;

/* renamed from: com.facebook.imagepipeline.nativecode.d */
public class C2438d {

    /* renamed from: a */
    private static boolean f7225a;

    /* renamed from: a */
    public static synchronized void m10149a() {
        synchronized (C2438d.class) {
            if (!f7225a) {
                if (Build.VERSION.SDK_INT <= 16) {
                    try {
                        C3291a.m12876e("fb_jpegturbo", 1);
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                C3291a.m12875d("native-imagetranscoder");
                f7225a = true;
            }
        }
    }
}
