package com.facebook.imageutils;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.soloader.C3264d;
import java.io.IOException;
import java.io.InputStream;
import p174e.p247e.p253d.p258e.C6071a;

public class HeifExifUtil {

    @C3264d
    private static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        /* renamed from: a */
        static int m10700a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                C6071a.m22870d("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static int m10699a(InputStream inputStream) {
        if (Build.VERSION.SDK_INT >= 24) {
            return HeifExifUtilAndroidN.m10700a(inputStream);
        }
        C6071a.m22868b("HeifExifUtil", "Trying to read Heif Exif information before Android N -> ignoring");
        return 0;
    }
}
