package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: com.imagepicker.d */
public class C5077d {

    /* renamed from: a */
    int f14397a;

    /* renamed from: b */
    Boolean f14398b;

    /* renamed from: c */
    Boolean f14399c;

    /* renamed from: d */
    int f14400d = 1;

    /* renamed from: e */
    int f14401e;

    /* renamed from: f */
    int f14402f;

    /* renamed from: g */
    int f14403g;

    /* renamed from: h */
    Boolean f14404h;

    /* renamed from: i */
    int f14405i;

    /* renamed from: j */
    Boolean f14406j = Boolean.FALSE;

    /* renamed from: k */
    String f14407k;

    C5077d(ReadableMap readableMap) {
        this.f14407k = readableMap.getString("mediaType");
        this.f14397a = readableMap.getInt("selectionLimit");
        this.f14398b = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.f14399c = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH)) {
            this.f14400d = 0;
        }
        if (readableMap.getString("cameraType").equals("front")) {
            this.f14406j = Boolean.TRUE;
        }
        this.f14401e = (int) (readableMap.getDouble("quality") * 100.0d);
        this.f14403g = readableMap.getInt("maxHeight");
        this.f14402f = readableMap.getInt("maxWidth");
        this.f14404h = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.f14405i = readableMap.getInt("durationLimit");
    }
}
