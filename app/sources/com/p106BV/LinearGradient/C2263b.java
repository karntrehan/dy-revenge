package com.p106BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3038r;

/* renamed from: com.BV.LinearGradient.b */
public class C2263b extends View {

    /* renamed from: f */
    private final Paint f6651f = new Paint(1);

    /* renamed from: o */
    private Path f6652o;

    /* renamed from: p */
    private RectF f6653p;

    /* renamed from: q */
    private LinearGradient f6654q;

    /* renamed from: r */
    private float[] f6655r;

    /* renamed from: s */
    private float[] f6656s = {0.0f, 0.0f};

    /* renamed from: t */
    private float[] f6657t = {0.0f, 1.0f};

    /* renamed from: u */
    private int[] f6658u;

    /* renamed from: v */
    private boolean f6659v = false;

    /* renamed from: w */
    private float[] f6660w = {0.5f, 0.5f};

    /* renamed from: x */
    private float f6661x = 45.0f;

    /* renamed from: y */
    private int[] f6662y = {0, 0};

    /* renamed from: z */
    private float[] f6663z = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public C2263b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private float[] m9522a(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (double) ((f - 90.0f) * 0.017453292f);
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    /* renamed from: b */
    private void m9523b() {
        int[] iArr = this.f6658u;
        if (iArr != null) {
            float[] fArr = this.f6655r;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f6656s;
                float[] fArr3 = this.f6657t;
                if (this.f6659v && this.f6660w != null) {
                    float[] a = m9522a(this.f6661x);
                    float[] fArr4 = this.f6660w;
                    float[] fArr5 = {fArr4[0] - (a[0] / 2.0f), fArr4[1] - (a[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (a[0] / 2.0f), fArr4[1] + (a[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f = fArr2[0];
                int[] iArr2 = this.f6662y;
                float f2 = ((float) iArr2[0]) * f;
                float f3 = fArr2[1] * ((float) iArr2[1]);
                LinearGradient linearGradient = new LinearGradient(f2, f3, fArr3[0] * ((float) iArr2[0]), fArr3[1] * ((float) iArr2[1]), this.f6658u, this.f6655r, Shader.TileMode.CLAMP);
                this.f6654q = linearGradient;
                this.f6651f.setShader(linearGradient);
                invalidate();
            }
        }
    }

    /* renamed from: c */
    private void m9524c() {
        if (this.f6652o == null) {
            this.f6652o = new Path();
            this.f6653p = new RectF();
        }
        this.f6652o.reset();
        RectF rectF = this.f6653p;
        int[] iArr = this.f6662y;
        rectF.set(0.0f, 0.0f, (float) iArr[0], (float) iArr[1]);
        this.f6652o.addRoundRect(this.f6653p, this.f6663z, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f6652o;
        if (path == null) {
            canvas.drawPaint(this.f6651f);
        } else {
            canvas.drawPath(path, this.f6651f);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f6662y = new int[]{i, i2};
        m9524c();
        m9523b();
    }

    public void setAngle(float f) {
        this.f6661x = f;
        m9523b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f6660w = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m9523b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = C3038r.m12006c((float) readableArray.getDouble(i));
        }
        this.f6663z = fArr;
        m9524c();
        m9523b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.f6658u = iArr;
        m9523b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.f6657t = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m9523b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.f6655r = fArr;
        m9523b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f6656s = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m9523b();
    }

    public void setUseAngle(boolean z) {
        this.f6659v = z;
        m9523b();
    }
}
