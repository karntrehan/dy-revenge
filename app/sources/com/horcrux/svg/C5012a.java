package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.C5020c0;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.horcrux.svg.a */
class C5012a {

    /* renamed from: a */
    private final C5013a f13972a;

    /* renamed from: b */
    private final C5020c0[] f13973b;

    /* renamed from: c */
    private ReadableArray f13974c;

    /* renamed from: d */
    private final boolean f13975d;

    /* renamed from: e */
    private boolean f13976e;

    /* renamed from: f */
    private Matrix f13977f;

    /* renamed from: g */
    private Rect f13978g;

    /* renamed from: h */
    private C5061u f13979h;

    /* renamed from: com.horcrux.svg.a$a */
    enum C5013a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* renamed from: com.horcrux.svg.a$b */
    enum C5014b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C5012a(C5013a aVar, C5020c0[] c0VarArr, C5014b bVar) {
        this.f13972a = aVar;
        this.f13973b = c0VarArr;
        this.f13975d = bVar == C5014b.OBJECT_BOUNDING_BOX;
    }

    /* renamed from: a */
    private RectF m18938a(RectF rectF) {
        float f;
        if (!this.f13975d) {
            rectF = new RectF(this.f13978g);
        }
        float width = rectF.width();
        float height = rectF.height();
        float f2 = 0.0f;
        if (this.f13975d) {
            f2 = rectF.left;
            f = rectF.top;
        } else {
            f = 0.0f;
        }
        return new RectF(f2, f, width + f2, height + f);
    }

    /* renamed from: b */
    private double m18939b(C5020c0 c0Var, double d, float f, float f2) {
        double d2;
        if (!this.f13975d) {
            C5020c0 c0Var2 = c0Var;
        } else if (c0Var.f14016b == C5020c0.C5022b.NUMBER) {
            d2 = d;
            return C5065w.m19147a(c0Var, d, 0.0d, d2, (double) f2);
        }
        d2 = (double) f;
        return C5065w.m19147a(c0Var, d, 0.0d, d2, (double) f2);
    }

    /* renamed from: c */
    private static void m18940c(ReadableArray readableArray, int i, float[] fArr, int[] iArr, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            fArr[i2] = (float) readableArray.getDouble(i3);
            int i4 = readableArray.getInt(i3 + 1);
            iArr[i2] = (i4 & 16777215) | (Math.round(((float) (i4 >>> 24)) * f) << 24);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo15177d(C5014b bVar) {
        this.f13976e = bVar == C5014b.OBJECT_BOUNDING_BOX;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo15178e(ReadableArray readableArray) {
        this.f13974c = readableArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo15179f(Matrix matrix) {
        this.f13977f = matrix;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo15180g(C5061u uVar) {
        this.f13979h = uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo15181h(Rect rect) {
        this.f13978g = rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo15182i(Paint paint, RectF rectF, float f, float f2) {
        float[] fArr;
        int[] iArr;
        Paint paint2 = paint;
        float f3 = f2;
        RectF a = m18938a(rectF);
        float width = a.width();
        float height = a.height();
        float f4 = a.left;
        float f5 = a.top;
        float textSize = paint.getTextSize();
        if (this.f13972a == C5013a.PATTERN) {
            double d = (double) width;
            double b = m18939b(this.f13973b[0], d, f, textSize);
            double d2 = (double) height;
            double d3 = d2;
            double d4 = b;
            double b2 = m18939b(this.f13973b[1], d2, f, textSize);
            double d5 = d;
            double d6 = b2;
            double b3 = m18939b(this.f13973b[2], d5, f, textSize);
            double d7 = b3;
            double b4 = m18939b(this.f13973b[3], d3, f, textSize);
            if (d7 > 1.0d && b4 > 1.0d) {
                Bitmap createBitmap = Bitmap.createBitmap((int) d7, (int) b4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF viewBox = this.f13979h.getViewBox();
                if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                    RectF rectF2 = new RectF((float) d4, (float) d6, (float) d7, (float) b4);
                    C5061u uVar = this.f13979h;
                    canvas.concat(C5067w0.m19150a(viewBox, rectF2, uVar.f14297j1, uVar.f14298k1));
                }
                if (this.f13976e) {
                    canvas.scale(width / f, height / f);
                }
                this.f13979h.mo15193F(canvas, new Paint(), f2);
                Matrix matrix = new Matrix();
                Matrix matrix2 = this.f13977f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            return;
        }
        float f6 = f3;
        int size = this.f13974c.size();
        if (size == 0) {
            C6071a.m22859G("ReactNative", "Gradient contains no stops");
            return;
        }
        int i = size / 2;
        int[] iArr2 = new int[i];
        float[] fArr2 = new float[i];
        m18940c(this.f13974c, i, fArr2, iArr2, f6);
        if (i == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            C6071a.m22859G("ReactNative", "Gradient contains only one stop");
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        C5013a aVar = this.f13972a;
        if (aVar == C5013a.LINEAR_GRADIENT) {
            double d8 = (double) width;
            double d9 = d8;
            double b5 = m18939b(this.f13973b[0], d8, f, textSize);
            double d10 = (double) f4;
            double d11 = (double) height;
            double d12 = b5 + d10;
            double d13 = d10;
            double d14 = (double) f5;
            double b6 = m18939b(this.f13973b[1], d11, f, textSize) + d14;
            double d15 = b6;
            double b7 = m18939b(this.f13973b[2], d9, f, textSize) + d13;
            double d16 = d11;
            LinearGradient linearGradient = new LinearGradient((float) d12, (float) d15, (float) b7, (float) (m18939b(this.f13973b[3], d16, f, textSize) + d14), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f13977f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f13977f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint2.setShader(linearGradient);
        } else if (aVar == C5013a.RADIAL_GRADIENT) {
            double d17 = (double) width;
            double b8 = m18939b(this.f13973b[2], d17, f, textSize);
            double d18 = (double) height;
            double d19 = b8;
            double b9 = m18939b(this.f13973b[3], d18, f, textSize) / d19;
            double d20 = d17;
            double d21 = b9;
            double b10 = m18939b(this.f13973b[4], d20, f, textSize) + ((double) f4);
            double d22 = d18 / d21;
            double d23 = b10;
            RadialGradient radialGradient = new RadialGradient((float) d23, (float) (m18939b(this.f13973b[5], d22, f, textSize) + (((double) f5) / d21)), (float) d19, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d21);
            Matrix matrix5 = this.f13977f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
