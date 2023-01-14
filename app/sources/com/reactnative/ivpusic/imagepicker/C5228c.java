package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;

/* renamed from: com.reactnative.ivpusic.imagepicker.c */
public class C5228c {

    /* renamed from: a */
    Float f14742a;

    /* renamed from: b */
    Float f14743b;

    public C5228c(ExifInterface exifInterface) {
        String attribute = exifInterface.getAttribute("GPSLatitude");
        String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
        String attribute3 = exifInterface.getAttribute("GPSLongitude");
        String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
        if (attribute != null && attribute2 != null && attribute3 != null && attribute4 != null) {
            boolean equals = attribute2.equals("N");
            Float a = m19535a(attribute);
            this.f14742a = !equals ? Float.valueOf(0.0f - a.floatValue()) : a;
            this.f14743b = attribute4.equals("E") ? m19535a(attribute3) : Float.valueOf(0.0f - m19535a(attribute3).floatValue());
        }
    }

    /* renamed from: a */
    private Float m19535a(String str) {
        String[] split = str.split(",", 3);
        String[] split2 = split[0].split("/", 2);
        Double valueOf = Double.valueOf(split2[0]);
        Double valueOf2 = Double.valueOf(split2[1]);
        String[] split3 = split[1].split("/", 2);
        Double valueOf3 = Double.valueOf(split3[0]);
        Double valueOf4 = Double.valueOf(split3[1]);
        String[] split4 = split[2].split("/", 2);
        return Float.valueOf((float) ((valueOf.doubleValue() / valueOf2.doubleValue()) + ((valueOf3.doubleValue() / valueOf4.doubleValue()) / 60.0d) + ((Double.valueOf(split4[0]).doubleValue() / Double.valueOf(split4[1]).doubleValue()) / 3600.0d)));
    }

    /* renamed from: b */
    public Float mo15831b() {
        return this.f14742a;
    }

    /* renamed from: c */
    public Float mo15832c() {
        return this.f14743b;
    }
}
