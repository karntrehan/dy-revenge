package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.p009e3.p010p.C0664a;
import java.nio.ByteBuffer;
import java.util.Locale;

final class ImageProcessingUtil {

    /* renamed from: a */
    private static int f1960a;

    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    enum C0601a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: a */
    public static boolean m2489a(ImageProxy imageProxy) {
        String str;
        if (!m2494f(imageProxy)) {
            str = "Unsupported format for YUV to RGB";
        } else if (m2490b(imageProxy) != C0601a.ERROR_CONVERSION) {
            return true;
        } else {
            str = "One pixel shift for YUV failure";
        }
        C0949o2.m3690c("ImageProcessingUtil", str);
        return false;
    }

    /* renamed from: b */
    private static C0601a m2490b(ImageProxy imageProxy) {
        int e = imageProxy.mo2541e();
        int c = imageProxy.mo2539c();
        int e2 = imageProxy.mo2542m()[0].mo2545e();
        int e3 = imageProxy.mo2542m()[1].mo2545e();
        int e4 = imageProxy.mo2542m()[2].mo2545e();
        int f = imageProxy.mo2542m()[0].mo2546f();
        int f2 = imageProxy.mo2542m()[1].mo2546f();
        return nativeShiftPixel(imageProxy.mo2542m()[0].mo2544d(), e2, imageProxy.mo2542m()[1].mo2544d(), e3, imageProxy.mo2542m()[2].mo2544d(), e4, f, f2, e, c, f, f2, f2) != 0 ? C0601a.ERROR_CONVERSION : C0601a.SUCCESS;
    }

    /* renamed from: c */
    public static ImageProxy m2491c(ImageProxy imageProxy, C0889u1 u1Var, ByteBuffer byteBuffer, int i, boolean z) {
        String str;
        if (!m2494f(imageProxy)) {
            str = "Unsupported format for YUV to RGB";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (!m2493e(i)) {
                str = "Unsupported rotation degrees for rotate RGB";
            } else if (m2492d(imageProxy, u1Var.mo2634b(), byteBuffer, i, z) == C0601a.ERROR_CONVERSION) {
                str = "YUV to RGB conversion failure";
            } else {
                if (Log.isLoggable("MH", 3)) {
                    C0949o2.m3688a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1960a)}));
                    f1960a++;
                }
                ImageProxy g = u1Var.mo2640g();
                if (g == null) {
                    str = "YUV to RGB acquireLatestImage failure";
                } else {
                    C1007y2 y2Var = new C1007y2(g);
                    y2Var.mo2623a(new C0642e0(g, imageProxy));
                    return y2Var;
                }
            }
        }
        C0949o2.m3690c("ImageProcessingUtil", str);
        return null;
    }

    /* renamed from: d */
    private static C0601a m2492d(ImageProxy imageProxy, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int e = imageProxy.mo2541e();
        int c = imageProxy.mo2539c();
        int e2 = imageProxy.mo2542m()[0].mo2545e();
        int e3 = imageProxy.mo2542m()[1].mo2545e();
        int e4 = imageProxy.mo2542m()[2].mo2545e();
        int f = imageProxy.mo2542m()[0].mo2546f();
        int f2 = imageProxy.mo2542m()[1].mo2546f();
        return nativeConvertAndroid420ToABGR(imageProxy.mo2542m()[0].mo2544d(), e2, imageProxy.mo2542m()[1].mo2544d(), e3, imageProxy.mo2542m()[2].mo2544d(), e4, f, f2, surface, byteBuffer, e, c, z ? f : 0, z ? f2 : 0, z ? f2 : 0, i) != 0 ? C0601a.ERROR_CONVERSION : C0601a.SUCCESS;
    }

    /* renamed from: e */
    private static boolean m2493e(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    /* renamed from: f */
    private static boolean m2494f(ImageProxy imageProxy) {
        return imageProxy.mo2543q0() == 35 && imageProxy.mo2542m().length == 3;
    }

    /* renamed from: g */
    static /* synthetic */ void m2495g(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m2496h(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    /* renamed from: i */
    public static ImageProxy m2497i(ImageProxy imageProxy, C0889u1 u1Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        String str;
        if (!m2494f(imageProxy)) {
            str = "Unsupported format for rotate YUV";
        } else if (!m2493e(i)) {
            str = "Unsupported rotation degrees for rotate YUV";
        } else {
            C0601a aVar = C0601a.ERROR_CONVERSION;
            if (((Build.VERSION.SDK_INT < 23 || i <= 0) ? aVar : m2498j(imageProxy, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i)) == aVar) {
                str = "rotate YUV failure";
            } else {
                ImageProxy g = u1Var.mo2640g();
                if (g == null) {
                    str = "YUV rotation acquireLatestImage failure";
                } else {
                    C1007y2 y2Var = new C1007y2(g);
                    y2Var.mo2623a(new C0632d0(g, imageProxy));
                    return y2Var;
                }
            }
        }
        C0949o2.m3690c("ImageProcessingUtil", str);
        return null;
    }

    /* renamed from: j */
    private static C0601a m2498j(ImageProxy imageProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int e = imageProxy.mo2541e();
        int c = imageProxy.mo2539c();
        int e2 = imageProxy.mo2542m()[0].mo2545e();
        int e3 = imageProxy.mo2542m()[1].mo2545e();
        int e4 = imageProxy.mo2542m()[2].mo2545e();
        int f = imageProxy.mo2542m()[1].mo2546f();
        Image b = C0664a.m2786b(imageWriter);
        if (b == null) {
            return C0601a.ERROR_CONVERSION;
        }
        Image image = b;
        Image image2 = image;
        if (nativeRotateYUV(imageProxy.mo2542m()[0].mo2544d(), e2, imageProxy.mo2542m()[1].mo2544d(), e3, imageProxy.mo2542m()[2].mo2544d(), e4, f, b.getPlanes()[0].getBuffer(), b.getPlanes()[0].getRowStride(), b.getPlanes()[0].getPixelStride(), b.getPlanes()[1].getBuffer(), b.getPlanes()[1].getRowStride(), b.getPlanes()[1].getPixelStride(), b.getPlanes()[2].getBuffer(), b.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, e, c, i) != 0) {
            return C0601a.ERROR_CONVERSION;
        }
        C0664a.m2789e(imageWriter, image2);
        return C0601a.SUCCESS;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i10, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i11, int i12, int i13);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);
}
