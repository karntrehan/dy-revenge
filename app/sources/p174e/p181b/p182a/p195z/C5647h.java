package p174e.p181b.p182a.p195z;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.p184u.p185b.C5498s;
import p174e.p181b.p182a.p184u.p186c.C5507c;

/* renamed from: e.b.a.z.h */
public final class C5647h {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f15977a = new C5648a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f15978b = new C5649b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f15979c = new C5650c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f15980d = new C5651d();

    /* renamed from: e */
    private static final float f15981e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static float f15982f = -1.0f;

    /* renamed from: e.b.a.z.h$a */
    class C5648a extends ThreadLocal<PathMeasure> {
        C5648a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: e.b.a.z.h$b */
    class C5649b extends ThreadLocal<Path> {
        C5649b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: e.b.a.z.h$c */
    class C5650c extends ThreadLocal<Path> {
        C5650c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: e.b.a.z.h$d */
    class C5651d extends ThreadLocal<float[]> {
        C5651d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m21066a(Path path, float f, float f2, float f3) {
        C5422c.m20179a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f15977a.get();
        Path path2 = f15978b.get();
        Path path3 = f15979c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C5422c.m20180b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C5422c.m20180b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C5646g.m21059g(min, length);
                max = (float) C5646g.m21059g(max, length);
            }
            if (min < 0.0f) {
                min = (float) C5646g.m21059g(min, length);
            }
            if (max < 0.0f) {
                max = (float) C5646g.m21059g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
            } else {
                if (i >= 0) {
                    min -= length;
                }
                path2.reset();
                pathMeasure.getSegment(min, max, path2, true);
                if (max > length) {
                    path3.reset();
                    pathMeasure.getSegment(0.0f, max % length, path3, true);
                } else {
                    if (min < 0.0f) {
                        path3.reset();
                        pathMeasure.getSegment(min + length, length, path3, true);
                    }
                    path.set(path2);
                }
                path2.addPath(path3);
                path.set(path2);
            }
            C5422c.m20180b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m21067b(Path path, C5498s sVar) {
        if (sVar != null && !sVar.mo16605k()) {
            m21066a(path, ((C5507c) sVar.mo16603i()).mo16628p() / 100.0f, ((C5507c) sVar.mo16601f()).mo16628p() / 100.0f, ((C5507c) sVar.mo16602h()).mo16628p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m21068c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m21069d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m21070e() {
        if (f15982f == -1.0f) {
            f15982f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f15982f;
    }

    /* renamed from: f */
    public static float m21071f(Context context) {
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = context.getContentResolver();
        return i >= 17 ? Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) : Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m21072g(Matrix matrix) {
        float[] fArr = f15980d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f15981e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m21073h(Matrix matrix) {
        float[] fArr = f15980d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* renamed from: i */
    public static int m21074i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m21075j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m21076k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m21077l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m21078m(Canvas canvas, RectF rectF, Paint paint) {
        m21079n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m21079n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C5422c.m20179a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C5422c.m20180b("Utils#saveLayer");
    }
}
