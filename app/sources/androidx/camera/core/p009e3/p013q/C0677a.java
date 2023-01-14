package androidx.camera.core.p009e3.p013q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* renamed from: androidx.camera.core.e3.q.a */
public final class C0677a {
    /* renamed from: a */
    public static Rect m2809a(Size size, Rational rational) {
        int i;
        if (!m2813e(rational)) {
            C0949o2.m3698k("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / ((float) numerator)) * ((float) denominator));
            int i3 = round;
            i = (height - round) / 2;
            height = i3;
        } else {
            int round2 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
            i2 = (width - round2) / 2;
            width = round2;
            i = 0;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    /* renamed from: b */
    public static Rect m2810b(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (i2 - i));
        float[] i3 = m2817i(size);
        matrix.mapPoints(i3);
        matrix.postTranslate(-m2816h(i3[0], i3[2], i3[4], i3[6]), -m2816h(i3[1], i3[3], i3[5], i3[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* renamed from: c */
    public static Rational m2811c(int i, Rational rational) {
        return (i == 90 || i == 270) ? m2812d(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* renamed from: d */
    private static Rational m2812d(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: e */
    public static boolean m2813e(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    /* renamed from: f */
    public static boolean m2814f(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && m2815g(size, rational) && !rational.isNaN();
    }

    /* renamed from: g */
    private static boolean m2815g(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = (float) rational.getNumerator();
        float denominator = (float) rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    /* renamed from: h */
    public static float m2816h(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    /* renamed from: i */
    public static float[] m2817i(Size size) {
        return new float[]{0.0f, 0.0f, (float) size.getWidth(), 0.0f, (float) size.getWidth(), (float) size.getHeight(), 0.0f, (float) size.getHeight()};
    }

    /* renamed from: j */
    public static byte[] m2818j(ImageProxy imageProxy) {
        ImageProxy.C0602a aVar = imageProxy.mo2542m()[0];
        ImageProxy.C0602a aVar2 = imageProxy.mo2542m()[1];
        ImageProxy.C0602a aVar3 = imageProxy.mo2542m()[2];
        ByteBuffer d = aVar.mo2544d();
        ByteBuffer d2 = aVar2.mo2544d();
        ByteBuffer d3 = aVar3.mo2544d();
        d.rewind();
        d2.rewind();
        d3.rewind();
        int remaining = d.remaining();
        byte[] bArr = new byte[(((imageProxy.mo2541e() * imageProxy.mo2539c()) / 2) + remaining)];
        int i = 0;
        for (int i2 = 0; i2 < imageProxy.mo2539c(); i2++) {
            d.get(bArr, i, imageProxy.mo2541e());
            i += imageProxy.mo2541e();
            d.position(Math.min(remaining, (d.position() - imageProxy.mo2541e()) + aVar.mo2545e()));
        }
        int c = imageProxy.mo2539c() / 2;
        int e = imageProxy.mo2541e() / 2;
        int e2 = aVar3.mo2545e();
        int e3 = aVar2.mo2545e();
        int f = aVar3.mo2546f();
        int f2 = aVar2.mo2546f();
        byte[] bArr2 = new byte[e2];
        byte[] bArr3 = new byte[e3];
        for (int i3 = 0; i3 < c; i3++) {
            d3.get(bArr2, 0, Math.min(e2, d3.remaining()));
            d2.get(bArr3, 0, Math.min(e3, d2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < e; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += f;
                i5 += f2;
            }
        }
        return bArr;
    }
}
