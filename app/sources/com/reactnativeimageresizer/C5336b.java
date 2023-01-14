package com.reactnativeimageresizer;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p027c.p084n.p085a.C2049a;

/* renamed from: com.reactnativeimageresizer.b */
public class C5336b {

    /* renamed from: a */
    private static final String[] f14952a = {"ApertureValue", "MaxApertureValue", "MeteringMode", "Artist", "BitsPerSample", "Compression", "BodySerialNumber", "BrightnessValue", "Contrast", "CameraOwnerName", "ColorSpace", "Copyright", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DeviceSettingDescription", "DigitalZoomRatio", "ExifVersion", "ExposureBiasValue", "ExposureIndex", "ExposureMode", "ExposureTime", "ExposureProgram", "Flash", "FlashEnergy", "FocalLength", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "FocalPlaneXResolution", "FocalPlaneYResolution", "PhotometricInterpretation", "PlanarConfiguration", "FNumber", "GainControl", "Gamma", "GPSAltitude", "GPSAltitudeRef", "GPSAreaInformation", "GPSDateStamp", "GPSDOP", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSStatus", "GPSDestBearing", "GPSDestBearingRef", "GPSDestDistance", "GPSDestDistanceRef", "GPSDestLatitude", "GPSDestLatitudeRef", "GPSDestLongitude", "GPSDestLongitudeRef", "GPSDifferential", "GPSImgDirection", "GPSImgDirectionRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeed", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrack", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageUniqueID", "ISOSpeed", "PhotographicSensitivity", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LensMake", "LensModel", "LensSerialNumber", "LensSpecification", "LightSource", "Make", "MakerNote", "Model", "Saturation", "Sharpness", "ShutterSpeedValue", "Software", "SubjectDistance", "SubjectDistanceRange", "SubjectLocation", "UserComment", "WhiteBalance"};

    /* renamed from: a */
    private static int m19770a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x0046 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19771b(android.content.Context r6, android.net.Uri r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "ImageResizer::copyExif"
            r1 = 0
            r2 = 0
            java.io.File r6 = m19773d(r6, r7)     // Catch:{ Exception -> 0x0021 }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x0021 }
            if (r7 != 0) goto L_0x000f
            return r2
        L_0x000f:
            c.n.a.a r7 = new c.n.a.a     // Catch:{ Exception -> 0x0021 }
            java.lang.String r6 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x0021 }
            r7.<init>((java.lang.String) r6)     // Catch:{ Exception -> 0x0021 }
            c.n.a.a r6 = new c.n.a.a     // Catch:{ Exception -> 0x001f }
            r6.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x001f }
            r1 = r6
            goto L_0x0028
        L_0x001f:
            r6 = move-exception
            goto L_0x0023
        L_0x0021:
            r6 = move-exception
            r7 = r1
        L_0x0023:
            java.lang.String r8 = "EXIF read failed"
            android.util.Log.e(r0, r8, r6)
        L_0x0028:
            if (r7 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x002d
            goto L_0x004c
        L_0x002d:
            java.lang.String[] r6 = f14952a     // Catch:{ Exception -> 0x0046 }
            int r8 = r6.length     // Catch:{ Exception -> 0x0046 }
            r3 = 0
        L_0x0031:
            if (r3 >= r8) goto L_0x0041
            r4 = r6[r3]     // Catch:{ Exception -> 0x0046 }
            java.lang.String r5 = r7.mo6895g(r4)     // Catch:{ Exception -> 0x0046 }
            if (r5 == 0) goto L_0x003e
            r1.mo6892c0(r4, r5)     // Catch:{ Exception -> 0x0046 }
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0041:
            r1.mo6890X()     // Catch:{ Exception -> 0x0046 }
            r6 = 1
            return r6
        L_0x0046:
            r6 = move-exception
            java.lang.String r7 = "EXIF copy failed"
            android.util.Log.e(r0, r7, r6)
        L_0x004c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativeimageresizer.C5336b.m19771b(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    /* renamed from: c */
    public static Bitmap m19772c(Context context, Uri uri, int i, int i2, int i3, int i4, String str, boolean z) {
        String scheme = uri.getScheme();
        Bitmap i5 = (scheme == null || scheme.equalsIgnoreCase("file") || scheme.equalsIgnoreCase("content")) ? m19778i(context, uri, i, i2) : (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https")) ? m19779j(uri, i, i2) : scheme.equalsIgnoreCase("data") ? m19777h(uri) : null;
        if (i5 != null) {
            Bitmap l = m19781l(i5, (float) (m19774e(context, uri) + i4));
            if (l != null) {
                if (l != l) {
                    i5.recycle();
                }
                Bitmap k = m19780k(l, i, i2, str, z);
                if (k != null) {
                    if (k != l) {
                        l.recycle();
                    }
                    return k;
                }
                throw new IOException("Unable to resize image. Most likely due to not enough memory.");
            }
            throw new IOException("Unable to rotate image. Most likely due to not enough memory.");
        }
        throw new IOException("Unable to load source image from path");
    }

    /* renamed from: d */
    private static File m19773d(Context context, Uri uri) {
        File file = new File(uri.getPath());
        if (file.exists()) {
            return file;
        }
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            File file2 = new File(cursor.getString(columnIndexOrThrow));
            cursor.close();
            return file2;
        } catch (Exception unused) {
            if (cursor == null) {
                return file;
            }
            cursor.close();
            return file;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public static int m19774e(Context context, Uri uri) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return m19775f(new C2049a(context.getContentResolver().openInputStream(uri)));
            }
            File d = m19773d(context, uri);
            if (d.exists()) {
                return m19775f(new C2049a(d.getAbsolutePath()));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: f */
    public static int m19775f(C2049a aVar) {
        int i = aVar.mo6897i("Orientation", 1);
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: g */
    private static Bitmap m19776g(Context context, Uri uri, BitmapFactory.Options options) {
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("content")) {
            try {
                return BitmapFactory.decodeFile(uri.getPath(), options);
            } catch (Exception e) {
                e.printStackTrace();
                throw new IOException("Error decoding image file");
            }
        } else {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
            openInputStream.close();
            return decodeStream;
        }
    }

    /* renamed from: h */
    private static Bitmap m19777h(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf != -1) {
            String lowerCase = schemeSpecificPart.substring(0, indexOf).replace('\\', '/').toLowerCase();
            boolean startsWith = lowerCase.startsWith("image/jpeg");
            boolean z = !startsWith && lowerCase.startsWith("image/png");
            if (startsWith || z) {
                byte[] decode = Base64.decode(schemeSpecificPart.substring(indexOf + 1), 0);
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            }
        }
        return null;
    }

    /* renamed from: i */
    private static Bitmap m19778i(Context context, Uri uri, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m19776g(context, uri, options);
        options.inSampleSize = m19770a(options, i, i2);
        options.inJustDecodeBounds = false;
        return m19776g(context, uri, options);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC, Splitter:B:33:0x0078] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m19779j(android.net.Uri r6, int r7, int r8) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x006a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x006a }
            r1.<init>(r6)     // Catch:{ Exception -> 0x006a }
            java.net.URLConnection r6 = r1.openConnection()     // Catch:{ Exception -> 0x006a }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x006a }
            r6.connect()     // Catch:{ Exception -> 0x006a }
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Exception -> 0x006a }
            if (r6 == 0) goto L_0x005d
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r0.<init>()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r1]     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
        L_0x0022:
            r3 = 0
            int r4 = r6.read(r2, r3, r1)     // Catch:{ all -> 0x0052 }
            r5 = -1
            if (r4 == r5) goto L_0x002e
            r0.write(r2, r3, r4)     // Catch:{ all -> 0x0052 }
            goto L_0x0022
        L_0x002e:
            r0.flush()     // Catch:{ all -> 0x0052 }
            byte[] r1 = r0.toByteArray()     // Catch:{ all -> 0x0052 }
            r0.close()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r0.<init>()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r2 = 1
            r0.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r2 = r1.length     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            android.graphics.BitmapFactory.decodeByteArray(r1, r3, r2, r0)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r7 = m19770a(r0, r7, r8)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r0.inSampleSize = r7     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            r0.inJustDecodeBounds = r3     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            int r7 = r1.length     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r7, r0)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            goto L_0x005d
        L_0x0052:
            r7 = move-exception
            r0.close()     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            throw r7     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
        L_0x0057:
            r7 = move-exception
            r0 = r6
            goto L_0x0076
        L_0x005a:
            r7 = move-exception
            r0 = r6
            goto L_0x006b
        L_0x005d:
            if (r6 == 0) goto L_0x0067
            r6.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0067:
            return r0
        L_0x0068:
            r7 = move-exception
            goto L_0x0076
        L_0x006a:
            r7 = move-exception
        L_0x006b:
            r7.printStackTrace()     // Catch:{ all -> 0x0068 }
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x0068 }
            java.lang.String r7 = "Error fetching remote image file."
            r6.<init>(r7)     // Catch:{ all -> 0x0068 }
            throw r6     // Catch:{ all -> 0x0068 }
        L_0x0076:
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0080:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativeimageresizer.C5336b.m19779j(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* renamed from: k */
    private static Bitmap m19780k(Bitmap bitmap, int i, int i2, String str, boolean z) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i2 <= 0 || i <= 0) {
            return null;
        }
        if (!str.equals("stretch")) {
            float f = (float) width;
            float f2 = ((float) i) / f;
            float f3 = (float) height;
            float f4 = ((float) i2) / f3;
            float max = str.equals("cover") ? Math.max(f2, f4) : Math.min(f2, f4);
            if (z) {
                max = Math.min(max, 1.0f);
            }
            int round = Math.round(f * max);
            i2 = Math.round(f3 * max);
            i = round;
        } else if (z) {
            i = Math.min(width, i);
            i2 = Math.min(height, i2);
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static Bitmap m19781l(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static File m19782m(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i) {
        if (bitmap != null) {
            File file2 = new File(file, str + "." + compressFormat.name());
            if (file2.createNewFile()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, i, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file2;
            }
            throw new IOException("The file already exists");
        }
        throw new IOException("The bitmap couldn't be resized");
    }
}
