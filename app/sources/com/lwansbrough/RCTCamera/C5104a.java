package com.lwansbrough.RCTCamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.HttpUrl;
import p027c.p084n.p085a.C2049a;
import p174e.p199d.p200a.C5657c;
import p174e.p199d.p200a.C5659d;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5736f;
import p174e.p199d.p218c.C5738h;
import p174e.p199d.p218c.p228n.C5820d;
import p174e.p199d.p218c.p228n.C5827k;

/* renamed from: com.lwansbrough.RCTCamera.a */
public class C5104a {

    /* renamed from: a */
    private final byte[] f14457a;

    /* renamed from: b */
    private Bitmap f14458b;

    /* renamed from: c */
    private C5732e f14459c;

    /* renamed from: d */
    private boolean f14460d = false;

    /* renamed from: com.lwansbrough.RCTCamera.a$a */
    private static class C5105a {
        /* renamed from: a */
        private static String m19264a(double d) {
            return d < 0.0d ? "S" : "N";
        }

        /* renamed from: b */
        private static String m19265b(double d) {
            return d < 0.0d ? "W" : "E";
        }

        /* renamed from: c */
        private static String m19266c(double d) {
            double abs = Math.abs(d);
            int i = (int) abs;
            double d2 = (abs * 60.0d) - (((double) i) * 60.0d);
            int i2 = (int) d2;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            stringBuffer.append("/1,");
            stringBuffer.append(i2);
            stringBuffer.append("/1,");
            stringBuffer.append((int) (((d2 * 60.0d) - (((double) i2) * 60.0d)) * 1000.0d));
            stringBuffer.append("/1000,");
            return stringBuffer.toString();
        }

        /* renamed from: d */
        public static void m19267d(double d, double d2, C2049a aVar) {
            aVar.mo6892c0("GPSLatitude", m19266c(d));
            aVar.mo6892c0("GPSLatitudeRef", m19264a(d));
            aVar.mo6892c0("GPSLongitude", m19266c(d2));
            aVar.mo6892c0("GPSLongitudeRef", m19265b(d2));
        }
    }

    /* renamed from: com.lwansbrough.RCTCamera.a$b */
    public static class C5106b extends Exception {
        public C5106b(String str) {
            super(str);
        }

        public C5106b(String str, Throwable th) {
            super(str, th);
        }
    }

    public C5104a(byte[] bArr) {
        this.f14457a = bArr;
        this.f14458b = m19254k(bArr);
    }

    /* renamed from: a */
    private String m19250a(String str) {
        return !str.contains("/") ? HttpUrl.FRAGMENT_ENCODE_SET : Double.toString(1.0d / Double.parseDouble(str.split("/")[1]));
    }

    /* renamed from: g */
    private C5732e m19251g() {
        if (this.f14459c == null) {
            this.f14459c = C5657c.m21089a(new BufferedInputStream(new ByteArrayInputStream(this.f14457a)), (long) this.f14457a.length);
        }
        return this.f14459c;
    }

    /* renamed from: h */
    private void m19252h(C2049a aVar) {
        aVar.mo6892c0("Orientation", String.valueOf(1));
    }

    /* renamed from: i */
    private void m19253i(int i) {
        Matrix matrix = new Matrix();
        switch (i) {
            case 1:
                return;
            case 2:
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
        }
        matrix.postScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(this.f14458b, 0, 0, mo15576e(), mo15575d(), matrix, false);
        if (createBitmap != null) {
            this.f14458b = createBitmap;
            this.f14460d = true;
            return;
        }
        throw new C5106b("failed to rotate");
    }

    /* renamed from: k */
    private static Bitmap m19254k(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            byteArrayInputStream.close();
            return decodeStream;
        } catch (IOException e) {
            throw new IllegalStateException("Will not happen", e);
        }
    }

    /* renamed from: l */
    private static byte[] m19255l(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                Log.e("RNCamera", "problem compressing jpeg", e);
            }
        }
    }

    /* renamed from: n */
    private void m19256n(ReadableMap readableMap, C2049a aVar) {
        if (readableMap.hasKey("metadata")) {
            ReadableMap map = readableMap.getMap("metadata");
            if (map.hasKey("location")) {
                ReadableMap map2 = map.getMap("location");
                if (map2.hasKey("coords")) {
                    try {
                        ReadableMap map3 = map2.getMap("coords");
                        C5105a.m19267d(map3.getDouble("latitude"), map3.getDouble("longitude"), aVar);
                    } catch (IOException e) {
                        Log.e("RNCamera", "Couldn't write location data", e);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo15573b(double d) {
        int i;
        int i2;
        int e = mo15576e();
        int d2 = mo15575d();
        double d3 = ((double) d2) * d;
        double d4 = (double) e;
        if (d3 > d4) {
            i = (int) (d4 / d);
            i2 = e;
        } else {
            i2 = (int) d3;
            i = d2;
        }
        this.f14458b = Bitmap.createBitmap(this.f14458b, (e - i2) / 2, (d2 - i) / 2, i2, i);
    }

    /* renamed from: c */
    public void mo15574c() {
        int j;
        try {
            C5820d dVar = (C5820d) m19251g().mo17170e(C5820d.class);
            if (dVar != null && dVar.mo17138b(274) && (j = dVar.mo17146j(274)) != 1) {
                m19253i(j);
                dVar.mo17125J(274, 1);
            }
        } catch (C5659d | C5736f | IOException e) {
            throw new C5106b("failed to fix orientation", e);
        }
    }

    /* renamed from: d */
    public int mo15575d() {
        return this.f14458b.getHeight();
    }

    /* renamed from: e */
    public int mo15576e() {
        return this.f14458b.getWidth();
    }

    /* renamed from: f */
    public void mo15577f() {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(this.f14458b, 0, 0, mo15576e(), mo15575d(), matrix, false);
        if (createBitmap != null) {
            this.f14458b = createBitmap;
            return;
        }
        throw new C5106b("failed to mirror");
    }

    /* renamed from: j */
    public String mo15578j(int i) {
        return Base64.encodeToString(m19255l(this.f14458b, i), 2);
    }

    /* renamed from: m */
    public void mo15579m(File file, ReadableMap readableMap, int i) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(m19255l(this.f14458b, i));
        fileOutputStream.close();
        try {
            C2049a aVar = new C2049a(file.getAbsolutePath());
            for (C5722b next : m19251g().mo17167b()) {
                for (C5738h next2 : next.mo17159x()) {
                    aVar.mo6892c0(next2.mo17183b(), next.mo17150o(next2.mo17184c()).toString());
                }
            }
            C5827k kVar = (C5827k) m19251g().mo17170e(C5827k.class);
            for (C5738h next3 : kVar.mo17159x()) {
                int c = next3.mo17184c();
                String replaceAll = next3.mo17183b().replaceAll(" ", HttpUrl.FRAGMENT_ENCODE_SET);
                Object o = kVar.mo17150o(c);
                aVar.mo6892c0(replaceAll, replaceAll.equals("ExposureTime") ? m19250a(o.toString()) : o.toString());
            }
            m19256n(readableMap, aVar);
            if (this.f14460d) {
                m19252h(aVar);
            }
            aVar.mo6890X();
        } catch (C5659d | IOException e) {
            Log.e("RNCamera", "failed to save exif data", e);
        }
    }
}
