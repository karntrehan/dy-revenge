package com.mrousavy.camera.p168n0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import p027c.p084n.p085a.C2049a;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.i */
public final class C5180i {
    /* renamed from: a */
    public static final WritableMap m19459a(C2049a aVar) {
        C10457l.m35320e(aVar, "<this>");
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("Orientation", aVar.mo6897i("Orientation", 1));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("ResolutionUnit", aVar.mo6897i("ResolutionUnit", 0));
        createMap2.putString("Software", aVar.mo6895g("Software"));
        createMap2.putString("Make", aVar.mo6895g("Make"));
        createMap2.putString("DateTime", aVar.mo6895g("DateTime"));
        createMap2.putDouble("XResolution", aVar.mo6896h("XResolution", 0.0d));
        createMap2.putString("Model", aVar.mo6895g("Model"));
        createMap2.putDouble("YResolution", aVar.mo6896h("YResolution", 0.0d));
        createMap.putMap("{TIFF}", createMap2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putString("DateTimeOriginal", aVar.mo6895g("DateTimeOriginal"));
        createMap3.putDouble("ExposureTime", aVar.mo6896h("ExposureTime", 0.0d));
        createMap3.putDouble("FNumber", aVar.mo6896h("FNumber", 0.0d));
        WritableArray createArray = Arguments.createArray();
        long[] j = aVar.mo6898j("LensSpecification");
        if (j != null) {
            int length = j.length;
            int i = 0;
            while (i < length) {
                long j2 = j[i];
                i++;
                createArray.pushInt((int) j2);
            }
        }
        createMap3.putArray("LensSpecification", createArray);
        createMap3.putDouble("ExposureBiasValue", aVar.mo6896h("ExposureBiasValue", 0.0d));
        createMap3.putInt("ColorSpace", aVar.mo6897i("ColorSpace", 1));
        createMap3.putInt("FocalLenIn35mmFilm", aVar.mo6897i("FocalLengthIn35mmFilm", 0));
        createMap3.putDouble("BrightnessValue", aVar.mo6896h("BrightnessValue", 0.0d));
        createMap3.putInt("ExposureMode", aVar.mo6897i("ExposureMode", 0));
        createMap3.putString("LensModel", aVar.mo6895g("LensModel"));
        createMap3.putInt("SceneType", aVar.mo6897i("SceneType", 1));
        createMap3.putInt("PixelXDimension", aVar.mo6897i("PixelXDimension", 0));
        createMap3.putDouble("ShutterSpeedValue", aVar.mo6896h("ShutterSpeedValue", 0.0d));
        createMap3.putInt("SensingMethod", aVar.mo6897i("SensingMethod", 1));
        WritableArray createArray2 = Arguments.createArray();
        long[] j3 = aVar.mo6898j("SubjectArea");
        if (j3 != null) {
            int length2 = j3.length;
            int i2 = 0;
            while (i2 < length2) {
                long j4 = j3[i2];
                i2++;
                createArray2.pushInt((int) j4);
            }
        }
        createMap3.putArray("SubjectArea", createArray2);
        createMap3.putDouble("ApertureValue", aVar.mo6896h("ApertureValue", 0.0d));
        createMap3.putString("SubsecTimeDigitized", aVar.mo6895g("SubSecTimeDigitized"));
        createMap3.putDouble("FocalLength", aVar.mo6896h("FocalLength", 0.0d));
        createMap3.putString("LensMake", aVar.mo6895g("LensMake"));
        createMap3.putString("SubsecTimeOriginal", aVar.mo6895g("SubSecTimeOriginal"));
        createMap3.putString("OffsetTimeDigitized", aVar.mo6895g("OffsetTimeDigitized"));
        createMap3.putInt("PixelYDimension", aVar.mo6897i("PixelYDimension", 0));
        WritableArray createArray3 = Arguments.createArray();
        long[] j5 = aVar.mo6898j("PhotographicSensitivity");
        if (j5 != null) {
            int length3 = j5.length;
            int i3 = 0;
            while (i3 < length3) {
                long j6 = j5[i3];
                i3++;
                createArray3.pushInt((int) j6);
            }
        }
        createMap3.putArray("ISOSpeedRatings", createArray3);
        createMap3.putInt("WhiteBalance", aVar.mo6897i("WhiteBalance", 0));
        createMap3.putString("DateTimeDigitized", aVar.mo6895g("DateTimeDigitized"));
        createMap3.putString("OffsetTimeOriginal", aVar.mo6895g("OffsetTimeOriginal"));
        createMap3.putString("ExifVersion", aVar.mo6895g("ExifVersion"));
        createMap3.putString("OffsetTime", aVar.mo6895g("OffsetTime"));
        createMap3.putInt("Flash", aVar.mo6897i("Flash", 1));
        createMap3.putInt("ExposureProgram", aVar.mo6897i("ExposureProgram", 0));
        createMap3.putInt("MeteringMode", aVar.mo6897i("MeteringMode", 0));
        createMap.putMap("{Exif}", createMap3);
        C10457l.m35319d(createMap, "metadataMap");
        return createMap;
    }
}
