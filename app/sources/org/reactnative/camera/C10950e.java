package org.reactnative.camera;

import android.media.CamcorderProfile;
import android.os.Build;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import org.reactnative.camera.p513f.C10964a;
import org.reactnative.camera.p513f.C10965b;
import org.reactnative.camera.p513f.C10966c;
import org.reactnative.camera.p513f.C10967d;
import org.reactnative.camera.p513f.C10968e;
import org.reactnative.camera.p513f.C10969f;
import org.reactnative.camera.p513f.C10970g;
import org.reactnative.camera.p513f.C10971h;
import org.reactnative.camera.p513f.C10972i;
import org.reactnative.camera.p513f.C10973j;
import org.reactnative.camera.p513f.C10974k;
import org.reactnative.camera.p513f.C10975l;
import org.reactnative.camera.p513f.C10976m;
import org.reactnative.facedetector.C10997b;
import p027c.p084n.p085a.C2049a;
import p174e.p319f.p416e.C9668n;
import p497j.p502b.p503a.C10677b;

/* renamed from: org.reactnative.camera.e */
public class C10950e {

    /* renamed from: a */
    public static final String[][] f28679a = {new String[]{"string", "Artist"}, new String[]{"int", "BitsPerSample"}, new String[]{"int", "Compression"}, new String[]{"string", "Copyright"}, new String[]{"string", "DateTime"}, new String[]{"string", "ImageDescription"}, new String[]{"int", "ImageLength"}, new String[]{"int", "ImageWidth"}, new String[]{"int", "JPEGInterchangeFormat"}, new String[]{"int", "JPEGInterchangeFormatLength"}, new String[]{"string", "Make"}, new String[]{"string", "Model"}, new String[]{"int", "Orientation"}, new String[]{"int", "PhotometricInterpretation"}, new String[]{"int", "PlanarConfiguration"}, new String[]{"double", "PrimaryChromaticities"}, new String[]{"double", "ReferenceBlackWhite"}, new String[]{"int", "ResolutionUnit"}, new String[]{"int", "RowsPerStrip"}, new String[]{"int", "SamplesPerPixel"}, new String[]{"string", "Software"}, new String[]{"int", "StripByteCounts"}, new String[]{"int", "StripOffsets"}, new String[]{"int", "TransferFunction"}, new String[]{"double", "WhitePoint"}, new String[]{"double", "XResolution"}, new String[]{"double", "YCbCrCoefficients"}, new String[]{"int", "YCbCrPositioning"}, new String[]{"int", "YCbCrSubSampling"}, new String[]{"double", "YResolution"}, new String[]{"double", "ApertureValue"}, new String[]{"double", "BrightnessValue"}, new String[]{"string", "CFAPattern"}, new String[]{"int", "ColorSpace"}, new String[]{"string", "ComponentsConfiguration"}, new String[]{"double", "CompressedBitsPerPixel"}, new String[]{"int", "Contrast"}, new String[]{"int", "CustomRendered"}, new String[]{"string", "DateTimeDigitized"}, new String[]{"string", "DateTimeOriginal"}, new String[]{"string", "DeviceSettingDescription"}, new String[]{"double", "DigitalZoomRatio"}, new String[]{"string", "ExifVersion"}, new String[]{"double", "ExposureBiasValue"}, new String[]{"double", "ExposureIndex"}, new String[]{"int", "ExposureMode"}, new String[]{"int", "ExposureProgram"}, new String[]{"double", "ExposureTime"}, new String[]{"double", "FNumber"}, new String[]{"string", "FileSource"}, new String[]{"int", "Flash"}, new String[]{"double", "FlashEnergy"}, new String[]{"string", "FlashpixVersion"}, new String[]{"double", "FocalLength"}, new String[]{"int", "FocalLengthIn35mmFilm"}, new String[]{"int", "FocalPlaneResolutionUnit"}, new String[]{"double", "FocalPlaneXResolution"}, new String[]{"double", "FocalPlaneYResolution"}, new String[]{"int", "GainControl"}, new String[]{"int", "ISOSpeedRatings"}, new String[]{"string", "ImageUniqueID"}, new String[]{"int", "LightSource"}, new String[]{"string", "MakerNote"}, new String[]{"double", "MaxApertureValue"}, new String[]{"int", "MeteringMode"}, new String[]{"int", "NewSubfileType"}, new String[]{"string", "OECF"}, new String[]{"int", "PixelXDimension"}, new String[]{"int", "PixelYDimension"}, new String[]{"string", "RelatedSoundFile"}, new String[]{"int", "Saturation"}, new String[]{"int", "SceneCaptureType"}, new String[]{"string", "SceneType"}, new String[]{"int", "SensingMethod"}, new String[]{"int", "Sharpness"}, new String[]{"double", "ShutterSpeedValue"}, new String[]{"string", "SpatialFrequencyResponse"}, new String[]{"string", "SpectralSensitivity"}, new String[]{"int", "SubfileType"}, new String[]{"string", "SubSecTime"}, new String[]{"string", "SubSecTimeDigitized"}, new String[]{"string", "SubSecTimeOriginal"}, new String[]{"int", "SubjectArea"}, new String[]{"double", "SubjectDistance"}, new String[]{"int", "SubjectDistanceRange"}, new String[]{"int", "SubjectLocation"}, new String[]{"string", "UserComment"}, new String[]{"int", "WhiteBalance"}, new String[]{"int", "GPSAltitudeRef"}, new String[]{"string", "GPSAreaInformation"}, new String[]{"double", "GPSDOP"}, new String[]{"string", "GPSDateStamp"}, new String[]{"double", "GPSDestBearing"}, new String[]{"string", "GPSDestBearingRef"}, new String[]{"double", "GPSDestDistance"}, new String[]{"string", "GPSDestDistanceRef"}, new String[]{"double", "GPSDestLatitude"}, new String[]{"string", "GPSDestLatitudeRef"}, new String[]{"double", "GPSDestLongitude"}, new String[]{"string", "GPSDestLongitudeRef"}, new String[]{"int", "GPSDifferential"}, new String[]{"double", "GPSImgDirection"}, new String[]{"string", "GPSImgDirectionRef"}, new String[]{"string", "GPSLatitudeRef"}, new String[]{"string", "GPSLongitudeRef"}, new String[]{"string", "GPSMapDatum"}, new String[]{"string", "GPSMeasureMode"}, new String[]{"string", "GPSProcessingMethod"}, new String[]{"string", "GPSSatellites"}, new String[]{"double", "GPSSpeed"}, new String[]{"string", "GPSSpeedRef"}, new String[]{"string", "GPSStatus"}, new String[]{"string", "GPSTimeStamp"}, new String[]{"double", "GPSTrack"}, new String[]{"string", "GPSTrackRef"}, new String[]{"string", "GPSVersionID"}, new String[]{"string", "InteroperabilityIndex"}, new String[]{"int", "ThumbnailImageLength"}, new String[]{"int", "ThumbnailImageWidth"}, new String[]{"int", "DNGVersion"}, new String[]{"int", "DefaultCropSize"}, new String[]{"int", "PreviewImageStart"}, new String[]{"int", "PreviewImageLength"}, new String[]{"int", "AspectFrame"}, new String[]{"int", "SensorBottomBorder"}, new String[]{"int", "SensorLeftBorder"}, new String[]{"int", "SensorRightBorder"}, new String[]{"int", "SensorTopBorder"}, new String[]{"int", "ISO"}};

    /* renamed from: org.reactnative.camera.e$a */
    class C10951a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28680f;

        /* renamed from: o */
        final /* synthetic */ WritableArray f28681o;

        /* renamed from: p */
        final /* synthetic */ byte[] f28682p;

        /* renamed from: q */
        final /* synthetic */ ReactContext f28683q;

        C10951a(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr, ReactContext reactContext) {
            this.f28680f = viewGroup;
            this.f28681o = writableArray;
            this.f28682p = bArr;
            this.f28683q = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28683q.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10966c.m37189v(this.f28680f.getId(), this.f28681o, this.f28682p));
        }
    }

    /* renamed from: org.reactnative.camera.e$b */
    class C10952b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28684f;

        /* renamed from: o */
        final /* synthetic */ C10677b f28685o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28686p;

        C10952b(ViewGroup viewGroup, C10677b bVar, ReactContext reactContext) {
            this.f28684f = viewGroup;
            this.f28685o = bVar;
            this.f28686p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28686p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10965b.m37183v(this.f28684f.getId(), this.f28685o));
        }
    }

    /* renamed from: org.reactnative.camera.e$c */
    class C10953c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28687f;

        /* renamed from: o */
        final /* synthetic */ C9668n f28688o;

        /* renamed from: p */
        final /* synthetic */ int f28689p;

        /* renamed from: q */
        final /* synthetic */ int f28690q;

        /* renamed from: r */
        final /* synthetic */ byte[] f28691r;

        /* renamed from: s */
        final /* synthetic */ ReactContext f28692s;

        C10953c(ViewGroup viewGroup, C9668n nVar, int i, int i2, byte[] bArr, ReactContext reactContext) {
            this.f28687f = viewGroup;
            this.f28688o = nVar;
            this.f28689p = i;
            this.f28690q = i2;
            this.f28691r = bArr;
            this.f28692s = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28692s.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10964a.m37177v(this.f28687f.getId(), this.f28688o, this.f28689p, this.f28690q, this.f28691r));
        }
    }

    /* renamed from: org.reactnative.camera.e$d */
    class C10954d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28693f;

        /* renamed from: o */
        final /* synthetic */ WritableArray f28694o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28695p;

        C10954d(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.f28693f = viewGroup;
            this.f28694o = writableArray;
            this.f28695p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28695p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10975l.m37238w(this.f28693f.getId(), this.f28694o));
        }
    }

    /* renamed from: org.reactnative.camera.e$e */
    class C10955e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28696f;

        /* renamed from: o */
        final /* synthetic */ String f28697o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28698p;

        C10955e(ViewGroup viewGroup, String str, ReactContext reactContext) {
            this.f28696f = viewGroup;
            this.f28697o = str;
            this.f28698p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28698p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10967d.m37195v(this.f28696f.getId(), this.f28697o));
        }
    }

    /* renamed from: org.reactnative.camera.e$f */
    class C10956f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28699f;

        /* renamed from: o */
        final /* synthetic */ ReactContext f28700o;

        C10956f(ViewGroup viewGroup, ReactContext reactContext) {
            this.f28699f = viewGroup;
            this.f28700o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28700o.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10968e.m37200u(this.f28699f.getId()));
        }
    }

    /* renamed from: org.reactnative.camera.e$g */
    class C10957g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28701f;

        /* renamed from: o */
        final /* synthetic */ WritableMap f28702o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28703p;

        C10957g(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.f28701f = viewGroup;
            this.f28702o = writableMap;
            this.f28703p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28703p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10971h.m37218v(this.f28701f.getId(), this.f28702o));
        }
    }

    /* renamed from: org.reactnative.camera.e$h */
    class C10958h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28704f;

        /* renamed from: o */
        final /* synthetic */ ReactContext f28705o;

        C10958h(ViewGroup viewGroup, ReactContext reactContext) {
            this.f28704f = viewGroup;
            this.f28705o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28705o.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10972i.m37222u(this.f28704f.getId()));
        }
    }

    /* renamed from: org.reactnative.camera.e$i */
    class C10959i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28706f;

        /* renamed from: o */
        final /* synthetic */ WritableMap f28707o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28708p;

        C10959i(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.f28706f = viewGroup;
            this.f28707o = writableMap;
            this.f28708p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28708p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10974k.m37233v(this.f28706f.getId(), this.f28707o));
        }
    }

    /* renamed from: org.reactnative.camera.e$j */
    class C10960j implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28709f;

        /* renamed from: o */
        final /* synthetic */ ReactContext f28710o;

        C10960j(ViewGroup viewGroup, ReactContext reactContext) {
            this.f28709f = viewGroup;
            this.f28710o = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28710o.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10973j.m37227u(this.f28709f.getId()));
        }
    }

    /* renamed from: org.reactnative.camera.e$k */
    class C10961k implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28711f;

        /* renamed from: o */
        final /* synthetic */ boolean f28712o;

        /* renamed from: p */
        final /* synthetic */ int f28713p;

        /* renamed from: q */
        final /* synthetic */ int f28714q;

        /* renamed from: r */
        final /* synthetic */ ReactContext f28715r;

        C10961k(ViewGroup viewGroup, boolean z, int i, int i2, ReactContext reactContext) {
            this.f28711f = viewGroup;
            this.f28712o = z;
            this.f28713p = i;
            this.f28714q = i2;
            this.f28715r = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28715r.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10976m.m37242v(this.f28711f.getId(), this.f28712o, this.f28713p, this.f28714q));
        }
    }

    /* renamed from: org.reactnative.camera.e$l */
    class C10962l implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28716f;

        /* renamed from: o */
        final /* synthetic */ WritableArray f28717o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28718p;

        C10962l(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.f28716f = viewGroup;
            this.f28717o = writableArray;
            this.f28718p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28718p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10970g.m37212v(this.f28716f.getId(), this.f28717o));
        }
    }

    /* renamed from: org.reactnative.camera.e$m */
    class C10963m implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ViewGroup f28719f;

        /* renamed from: o */
        final /* synthetic */ C10997b f28720o;

        /* renamed from: p */
        final /* synthetic */ ReactContext f28721p;

        C10963m(ViewGroup viewGroup, C10997b bVar, ReactContext reactContext) {
            this.f28719f = viewGroup;
            this.f28720o = bVar;
            this.f28721p = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f28721p.getNativeModule(UIManagerModule.class)).getEventDispatcher().mo9651c(C10969f.m37206v(this.f28719f.getId(), this.f28720o));
        }
    }

    /* renamed from: a */
    public static void m37156a(C2049a aVar) {
        for (String[] strArr : f28679a) {
            aVar.mo6892c0(strArr[1], (String) null);
        }
        aVar.mo6892c0("GPSLatitude", (String) null);
        aVar.mo6892c0("GPSLongitude", (String) null);
        aVar.mo6892c0("GPSAltitude", (String) null);
    }

    /* renamed from: b */
    public static void m37157b(ViewGroup viewGroup, C9668n nVar, int i, int i2, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10953c(viewGroup, nVar, i, i2, bArr, reactContext));
    }

    /* renamed from: c */
    public static void m37158c(ViewGroup viewGroup, C10677b bVar) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10952b(viewGroup, bVar, reactContext));
    }

    /* renamed from: d */
    public static void m37159d(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10951a(viewGroup, writableArray, bArr, reactContext));
    }

    /* renamed from: e */
    public static void m37160e(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10956f(viewGroup, reactContext));
    }

    /* renamed from: f */
    public static void m37161f(ViewGroup viewGroup, C10997b bVar) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10963m(viewGroup, bVar, reactContext));
    }

    /* renamed from: g */
    public static void m37162g(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10962l(viewGroup, writableArray, reactContext));
    }

    /* renamed from: h */
    public static void m37163h(ViewGroup viewGroup, String str) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10955e(viewGroup, str, reactContext));
    }

    /* renamed from: i */
    public static void m37164i(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10957g(viewGroup, writableMap, reactContext));
    }

    /* renamed from: j */
    public static void m37165j(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10958h(viewGroup, reactContext));
    }

    /* renamed from: k */
    public static void m37166k(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10960j(viewGroup, reactContext));
    }

    /* renamed from: l */
    public static void m37167l(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10959i(viewGroup, writableMap, reactContext));
    }

    /* renamed from: m */
    public static void m37168m(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10954d(viewGroup, writableArray, reactContext));
    }

    /* renamed from: n */
    public static void m37169n(ViewGroup viewGroup, boolean z, int i, int i2) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new C10961k(viewGroup, z, i, i2, reactContext));
    }

    /* renamed from: o */
    public static CamcorderProfile m37170o(int i) {
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        int p = m37171p(i);
        if (CamcorderProfile.hasProfile(p)) {
            camcorderProfile = CamcorderProfile.get(p);
            if (i == 4) {
                camcorderProfile.videoFrameWidth = 640;
            }
        }
        return camcorderProfile;
    }

    /* renamed from: p */
    private static int m37171p(int i) {
        if (i == 0) {
            return Build.VERSION.SDK_INT >= 21 ? 8 : 6;
        }
        if (i == 1) {
            return 6;
        }
        if (i != 2) {
            return (i == 3 || i == 4) ? 4 : 1;
        }
        return 5;
    }

    /* renamed from: q */
    public static int m37172q(int i, int i2, int i3) {
        int i4;
        if (i2 == 1) {
            i4 = i3 + i;
        } else {
            i4 = (i3 - i) + (m37174s(i) ? 180 : 0);
        }
        return i4 % 360;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r8.equals("string") == false) goto L_0x0025;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.react.bridge.WritableMap m37173r(p027c.p084n.p085a.C2049a r12) {
        /*
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String[][] r1 = f28679a
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0009:
            r5 = 0
            r7 = 1
            if (r4 >= r2) goto L_0x0063
            r8 = r1[r4]
            r9 = r8[r7]
            java.lang.String r10 = r12.mo6895g(r9)
            if (r10 == 0) goto L_0x0060
            r8 = r8[r3]
            r8.hashCode()
            r10 = -1
            int r11 = r8.hashCode()
            switch(r11) {
                case -1325958191: goto L_0x003b;
                case -891985903: goto L_0x0032;
                case 104431: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            r7 = -1
            goto L_0x0045
        L_0x0027:
            java.lang.String r7 = "int"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0030
            goto L_0x0025
        L_0x0030:
            r7 = 2
            goto L_0x0045
        L_0x0032:
            java.lang.String r11 = "string"
            boolean r8 = r8.equals(r11)
            if (r8 != 0) goto L_0x0045
            goto L_0x0025
        L_0x003b:
            java.lang.String r7 = "double"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0044
            goto L_0x0025
        L_0x0044:
            r7 = 0
        L_0x0045:
            switch(r7) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0051;
                case 2: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0060
        L_0x0049:
            int r5 = r12.mo6897i(r9, r3)
            r0.putInt(r9, r5)
            goto L_0x0060
        L_0x0051:
            java.lang.String r5 = r12.mo6895g(r9)
            r0.putString(r9, r5)
            goto L_0x0060
        L_0x0059:
            double r5 = r12.mo6896h(r9, r5)
            r0.putDouble(r9, r5)
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0063:
            double[] r1 = r12.mo6899n()
            if (r1 == 0) goto L_0x0080
            r2 = r1[r3]
            java.lang.String r4 = "GPSLatitude"
            r0.putDouble(r4, r2)
            r2 = r1[r7]
            java.lang.String r1 = "GPSLongitude"
            r0.putDouble(r1, r2)
            double r1 = r12.mo6894f(r5)
            java.lang.String r12 = "GPSAltitude"
            r0.putDouble(r12, r1)
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.C10950e.m37173r(c.n.a.a):com.facebook.react.bridge.WritableMap");
    }

    /* renamed from: s */
    private static boolean m37174s(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r4.equals("string") == false) goto L_0x001f;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m37175t(p027c.p084n.p085a.C2049a r9, com.facebook.react.bridge.ReadableMap r10) {
        /*
            java.lang.String[][] r0 = f28679a
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r1) goto L_0x006b
            r4 = r0[r3]
            r5 = 1
            r6 = r4[r5]
            boolean r7 = r10.hasKey(r6)
            if (r7 == 0) goto L_0x0068
            r4 = r4[r2]
            r4.hashCode()
            r7 = -1
            int r8 = r4.hashCode()
            switch(r8) {
                case -1325958191: goto L_0x0035;
                case -891985903: goto L_0x002c;
                case 104431: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            r5 = -1
            goto L_0x003f
        L_0x0021:
            java.lang.String r5 = "int"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002a
            goto L_0x001f
        L_0x002a:
            r5 = 2
            goto L_0x003f
        L_0x002c:
            java.lang.String r8 = "string"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x003f
            goto L_0x001f
        L_0x0035:
            java.lang.String r5 = "double"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            r5 = 0
        L_0x003f:
            switch(r5) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0052;
                case 2: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0068
        L_0x0043:
            int r4 = r10.getInt(r6)
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r9.mo6892c0(r6, r4)
            r10.getInt(r6)
            goto L_0x0068
        L_0x0052:
            java.lang.String r4 = r10.getString(r6)
            r9.mo6892c0(r6, r4)
            goto L_0x0068
        L_0x005a:
            double r4 = r10.getDouble(r6)
            java.lang.String r4 = java.lang.Double.toString(r4)
            r9.mo6892c0(r6, r4)
            r10.getDouble(r6)
        L_0x0068:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x006b:
            java.lang.String r0 = "GPSLatitude"
            boolean r1 = r10.hasKey(r0)
            if (r1 == 0) goto L_0x0086
            java.lang.String r1 = "GPSLongitude"
            boolean r2 = r10.hasKey(r1)
            if (r2 == 0) goto L_0x0086
            double r2 = r10.getDouble(r0)
            double r0 = r10.getDouble(r1)
            r9.mo6893d0(r2, r0)
        L_0x0086:
            java.lang.String r0 = "GPSAltitude"
            boolean r1 = r10.hasKey(r0)
            if (r1 == 0) goto L_0x0095
            double r0 = r10.getDouble(r0)
            r9.mo6891b0(r0)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.C10950e.m37175t(c.n.a.a, com.facebook.react.bridge.ReadableMap):void");
    }
}
