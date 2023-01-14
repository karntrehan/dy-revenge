package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.reactnative.ivpusic.imagepicker.b */
class C5227b {
    /* renamed from: a */
    static WritableMap m19532a(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> b = m19533b();
        if (Build.VERSION.SDK_INT >= 23) {
            b.addAll(m19534c());
        }
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            C5228c cVar = new C5228c(exifInterface);
            if (!(cVar.mo15831b() == null || cVar.mo15832c() == null)) {
                writableNativeMap.putDouble("Latitude", (double) cVar.mo15831b().floatValue());
                writableNativeMap.putDouble("Longitude", (double) cVar.mo15832c().floatValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (String next : b) {
            writableNativeMap.putString(next, exifInterface.getAttribute(next));
        }
        return writableNativeMap;
    }

    /* renamed from: b */
    private static List<String> m19533b() {
        return new ArrayList(Arrays.asList(new String[]{"FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"}));
    }

    /* renamed from: c */
    private static List<String> m19534c() {
        return new ArrayList(Arrays.asList(new String[]{"DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal"}));
    }
}
