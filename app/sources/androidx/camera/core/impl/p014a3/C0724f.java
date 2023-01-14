package androidx.camera.core.impl.p014a3;

import android.location.Location;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p027c.p084n.p085a.C2049a;

/* renamed from: androidx.camera.core.impl.a3.f */
public final class C0724f {

    /* renamed from: a */
    private static final String f2229a = "f";

    /* renamed from: b */
    private static final ThreadLocal<SimpleDateFormat> f2230b = new C0725a();

    /* renamed from: c */
    private static final ThreadLocal<SimpleDateFormat> f2231c = new C0726b();

    /* renamed from: d */
    private static final ThreadLocal<SimpleDateFormat> f2232d = new C0727c();

    /* renamed from: e */
    private static final List<String> f2233e = m2987e();

    /* renamed from: f */
    private static final List<String> f2234f = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});

    /* renamed from: g */
    private final C2049a f2235g;

    /* renamed from: h */
    private boolean f2236h = false;

    /* renamed from: androidx.camera.core.impl.a3.f$a */
    class C0725a extends ThreadLocal<SimpleDateFormat> {
        C0725a() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.f$b */
    class C0726b extends ThreadLocal<SimpleDateFormat> {
        C0726b() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.f$c */
    class C0727c extends ThreadLocal<SimpleDateFormat> {
        C0727c() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.f$d */
    private static final class C0728d {

        /* renamed from: androidx.camera.core.impl.a3.f$d$a */
        static final class C0729a {

            /* renamed from: a */
            final double f2237a;

            C0729a(double d) {
                this.f2237a = d;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public double mo2847a() {
                return this.f2237a / 2.23694d;
            }
        }

        /* renamed from: a */
        static C0729a m3002a(double d) {
            return new C0729a(d * 0.621371d);
        }

        /* renamed from: b */
        static C0729a m3003b(double d) {
            return new C0729a(d * 1.15078d);
        }

        /* renamed from: c */
        static C0729a m3004c(double d) {
            return new C0729a(d);
        }
    }

    private C0724f(C2049a aVar) {
        this.f2235g = aVar;
    }

    /* renamed from: a */
    private static Date m2983a(String str) {
        return f2230b.get().parse(str);
    }

    /* renamed from: b */
    private static Date m2984b(String str) {
        return f2232d.get().parse(str);
    }

    /* renamed from: c */
    private static Date m2985c(String str) {
        return f2231c.get().parse(str);
    }

    /* renamed from: d */
    public static C0724f m2986d(InputStream inputStream) {
        return new C0724f(new C2049a(inputStream));
    }

    /* renamed from: e */
    public static List<String> m2987e() {
        return Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});
    }

    /* renamed from: o */
    private long m2988o(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return m2984b(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: p */
    private long m2989p(String str, String str2) {
        if (str == null && str2 == null) {
            return -1;
        }
        if (str2 == null) {
            try {
                return m2983a(str).getTime();
            } catch (ParseException unused) {
                return -1;
            }
        } else if (str == null) {
            try {
                return m2985c(str2).getTime();
            } catch (ParseException unused2) {
                return -1;
            }
        } else {
            return m2988o(str + " " + str2);
        }
    }

    /* renamed from: f */
    public String mo2831f() {
        return this.f2235g.mo6895g("ImageDescription");
    }

    /* renamed from: g */
    public int mo2832g() {
        return this.f2235g.mo6897i("ImageLength", 0);
    }

    /* renamed from: h */
    public Location mo2833h() {
        String g = this.f2235g.mo6895g("GPSProcessingMethod");
        double[] n = this.f2235g.mo6899n();
        double f = this.f2235g.mo6894f(0.0d);
        double h = this.f2235g.mo6896h("GPSSpeed", 0.0d);
        String g2 = this.f2235g.mo6895g("GPSSpeedRef");
        if (g2 == null) {
            g2 = "K";
        }
        long p = m2989p(this.f2235g.mo6895g("GPSDateStamp"), this.f2235g.mo6895g("GPSTimeStamp"));
        if (n == null) {
            return null;
        }
        if (g == null) {
            g = f2229a;
        }
        Location location = new Location(g);
        location.setLatitude(n[0]);
        location.setLongitude(n[1]);
        if (f != 0.0d) {
            location.setAltitude(f);
        }
        if (h != 0.0d) {
            char c = 65535;
            int hashCode = g2.hashCode();
            if (hashCode != 75) {
                if (hashCode != 77) {
                    if (hashCode == 78 && g2.equals("N")) {
                        c = 1;
                    }
                } else if (g2.equals("M")) {
                    c = 0;
                }
            } else if (g2.equals("K")) {
                c = 2;
            }
            location.setSpeed((float) (c != 0 ? c != 1 ? C0728d.m3002a(h) : C0728d.m3003b(h) : C0728d.m3004c(h)).mo2847a());
        }
        if (p != -1) {
            location.setTime(p);
        }
        return location;
    }

    /* renamed from: i */
    public int mo2834i() {
        return this.f2235g.mo6897i("Orientation", 0);
    }

    /* renamed from: j */
    public int mo2835j() {
        switch (mo2834i()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public long mo2836k() {
        long o = m2988o(this.f2235g.mo6895g("DateTimeOriginal"));
        if (o == -1) {
            return -1;
        }
        String g = this.f2235g.mo6895g("SubSecTimeOriginal");
        if (g == null) {
            return o;
        }
        try {
            long parseLong = Long.parseLong(g);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return o + parseLong;
        } catch (NumberFormatException unused) {
            return o;
        }
    }

    /* renamed from: l */
    public int mo2837l() {
        return this.f2235g.mo6897i("ImageWidth", 0);
    }

    /* renamed from: m */
    public boolean mo2838m() {
        return mo2834i() == 2;
    }

    /* renamed from: n */
    public boolean mo2839n() {
        int i = mo2834i();
        return i == 4 || i == 5 || i == 7;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(mo2837l()), Integer.valueOf(mo2832g()), Integer.valueOf(mo2835j()), Boolean.valueOf(mo2839n()), Boolean.valueOf(mo2838m()), mo2833h(), Long.valueOf(mo2836k()), mo2831f()});
    }
}
