package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.C10145h;
import com.yalantis.ucrop.p443k.C10149a;
import com.yalantis.ucrop.p443k.C10151c;
import com.yalantis.ucrop.p444l.C10155b;
import com.yalantis.ucrop.p444l.C10157d;
import com.yalantis.ucrop.p445m.C10159b;
import com.yalantis.ucrop.p445m.C10167g;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.view.C10183b;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.yalantis.ucrop.view.a */
public class C10180a extends C10183b {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final RectF f27215E;

    /* renamed from: F */
    private final Matrix f27216F;

    /* renamed from: G */
    private float f27217G;

    /* renamed from: H */
    private float f27218H;

    /* renamed from: I */
    private C10151c f27219I;

    /* renamed from: J */
    private Runnable f27220J;

    /* renamed from: K */
    private Runnable f27221K;

    /* renamed from: L */
    private float f27222L;

    /* renamed from: M */
    private float f27223M;

    /* renamed from: N */
    private int f27224N;

    /* renamed from: O */
    private int f27225O;

    /* renamed from: P */
    private long f27226P;

    /* renamed from: com.yalantis.ucrop.view.a$a */
    private static class C10181a implements Runnable {

        /* renamed from: f */
        private final WeakReference<C10180a> f27227f;

        /* renamed from: o */
        private final long f27228o;

        /* renamed from: p */
        private final long f27229p = System.currentTimeMillis();

        /* renamed from: q */
        private final float f27230q;

        /* renamed from: r */
        private final float f27231r;

        /* renamed from: s */
        private final float f27232s;

        /* renamed from: t */
        private final float f27233t;

        /* renamed from: u */
        private final float f27234u;

        /* renamed from: v */
        private final float f27235v;

        /* renamed from: w */
        private final boolean f27236w;

        public C10181a(C10180a aVar, long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f27227f = new WeakReference<>(aVar);
            this.f27228o = j;
            this.f27230q = f;
            this.f27231r = f2;
            this.f27232s = f3;
            this.f27233t = f4;
            this.f27234u = f5;
            this.f27235v = f6;
            this.f27236w = z;
        }

        public void run() {
            C10180a aVar = (C10180a) this.f27227f.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f27228o, System.currentTimeMillis() - this.f27229p);
                float b = C10159b.m34385b(min, 0.0f, this.f27232s, (float) this.f27228o);
                float b2 = C10159b.m34385b(min, 0.0f, this.f27233t, (float) this.f27228o);
                float a = C10159b.m34384a(min, 0.0f, this.f27235v, (float) this.f27228o);
                if (min < ((float) this.f27228o)) {
                    float[] fArr = aVar.f27249q;
                    aVar.mo25376m(b - (fArr[0] - this.f27230q), b2 - (fArr[1] - this.f27231r));
                    if (!this.f27236w) {
                        aVar.mo25339D(this.f27234u + a, aVar.f27215E.centerX(), aVar.f27215E.centerY());
                    }
                    if (!aVar.mo25358v()) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.a$b */
    private static class C10182b implements Runnable {

        /* renamed from: f */
        private final WeakReference<C10180a> f27237f;

        /* renamed from: o */
        private final long f27238o;

        /* renamed from: p */
        private final long f27239p = System.currentTimeMillis();

        /* renamed from: q */
        private final float f27240q;

        /* renamed from: r */
        private final float f27241r;

        /* renamed from: s */
        private final float f27242s;

        /* renamed from: t */
        private final float f27243t;

        public C10182b(C10180a aVar, long j, float f, float f2, float f3, float f4) {
            this.f27237f = new WeakReference<>(aVar);
            this.f27238o = j;
            this.f27240q = f;
            this.f27241r = f2;
            this.f27242s = f3;
            this.f27243t = f4;
        }

        public void run() {
            C10180a aVar = (C10180a) this.f27237f.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f27238o, System.currentTimeMillis() - this.f27239p);
                float a = C10159b.m34384a(min, 0.0f, this.f27241r, (float) this.f27238o);
                if (min < ((float) this.f27238o)) {
                    aVar.mo25339D(this.f27240q + a, this.f27242s, this.f27243t);
                    aVar.post(this);
                    return;
                }
                aVar.mo25362z();
            }
        }
    }

    public C10180a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10180a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27215E = new RectF();
        this.f27216F = new Matrix();
        this.f27218H = 10.0f;
        this.f27221K = null;
        this.f27224N = 0;
        this.f27225O = 0;
        this.f27226P = 500;
    }

    /* renamed from: A */
    private void m34452A(float f, float f2) {
        float width = this.f27215E.width();
        float height = this.f27215E.height();
        float max = Math.max(this.f27215E.width() / f, this.f27215E.height() / f2);
        RectF rectF = this.f27215E;
        float f3 = ((height - (f2 * max)) / 2.0f) + rectF.top;
        this.f27251s.reset();
        this.f27251s.postScale(max, max);
        this.f27251s.postTranslate(((width - (f * max)) / 2.0f) + rectF.left, f3);
        setImageMatrix(this.f27251s);
    }

    /* renamed from: q */
    private float[] m34454q() {
        this.f27216F.reset();
        this.f27216F.setRotate(-getCurrentAngle());
        float[] fArr = this.f27248p;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b = C10167g.m34413b(this.f27215E);
        this.f27216F.mapPoints(copyOf);
        this.f27216F.mapPoints(b);
        RectF d = C10167g.m34415d(copyOf);
        RectF d2 = C10167g.m34415d(b);
        float f = d.left - d2.left;
        float f2 = d.top - d2.top;
        float f3 = d.right - d2.right;
        float f4 = d.bottom - d2.bottom;
        float[] fArr2 = new float[4];
        if (f <= 0.0f) {
            f = 0.0f;
        }
        fArr2[0] = f;
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        fArr2[1] = f2;
        if (f3 >= 0.0f) {
            f3 = 0.0f;
        }
        fArr2[2] = f3;
        if (f4 >= 0.0f) {
            f4 = 0.0f;
        }
        fArr2[3] = f4;
        this.f27216F.reset();
        this.f27216F.setRotate(getCurrentAngle());
        this.f27216F.mapPoints(fArr2);
        return fArr2;
    }

    /* renamed from: r */
    private void m34455r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            m34456s((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    /* renamed from: s */
    private void m34456s(float f, float f2) {
        float min = Math.min(Math.min(this.f27215E.width() / f, this.f27215E.width() / f2), Math.min(this.f27215E.height() / f2, this.f27215E.height() / f));
        this.f27223M = min;
        this.f27222L = min * this.f27218H;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo25337B(float f, float f2, float f3, long j) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float currentScale = getCurrentScale();
        C10182b bVar = new C10182b(this, j, currentScale, f - currentScale, f2, f3);
        this.f27221K = bVar;
        post(bVar);
    }

    /* renamed from: C */
    public void mo25338C(float f) {
        mo25339D(f, this.f27215E.centerX(), this.f27215E.centerY());
    }

    /* renamed from: D */
    public void mo25339D(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            mo25347l(f / getCurrentScale(), f2, f3);
        }
    }

    /* renamed from: E */
    public void mo25340E(float f) {
        mo25341F(f, this.f27215E.centerX(), this.f27215E.centerY());
    }

    /* renamed from: F */
    public void mo25341F(float f, float f2, float f3) {
        if (f >= getMinScale()) {
            mo25347l(f / getCurrentScale(), f2, f3);
        }
    }

    public C10151c getCropBoundsChangeListener() {
        return this.f27219I;
    }

    public float getMaxScale() {
        return this.f27222L;
    }

    public float getMinScale() {
        return this.f27223M;
    }

    public float getTargetAspectRatio() {
        return this.f27217G;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25346j() {
        super.mo25346j();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.f27217G == 0.0f) {
                this.f27217G = intrinsicWidth / intrinsicHeight;
            }
            int i = this.f27252t;
            float f = this.f27217G;
            int i2 = (int) (((float) i) / f);
            int i3 = this.f27253u;
            if (i2 > i3) {
                int i4 = (int) (((float) i3) * f);
                int i5 = (i - i4) / 2;
                this.f27215E.set((float) i5, 0.0f, (float) (i4 + i5), (float) i3);
            } else {
                int i6 = (i3 - i2) / 2;
                this.f27215E.set(0.0f, (float) i6, (float) i, (float) (i2 + i6));
            }
            m34456s(intrinsicWidth, intrinsicHeight);
            m34452A(intrinsicWidth, intrinsicHeight);
            C10151c cVar = this.f27219I;
            if (cVar != null) {
                cVar.mo25238a(this.f27217G);
            }
            C10183b.C10185b bVar = this.f27254v;
            if (bVar != null) {
                bVar.mo25199d(getCurrentScale());
                this.f27254v.mo25196a(getCurrentAngle());
            }
        }
    }

    /* renamed from: l */
    public void mo25347l(float f, float f2, float f3) {
        if ((f > 1.0f && getCurrentScale() * f <= getMaxScale()) || (f < 1.0f && getCurrentScale() * f >= getMinScale())) {
            super.mo25347l(f, f2, f3);
        }
    }

    public void setCropBoundsChangeListener(C10151c cVar) {
        this.f27219I = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f27217G = rectF.width() / rectF.height();
        this.f27215E.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        m34455r();
        mo25362z();
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.f27258z && !mo25358v()) {
            float[] fArr = this.f27249q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f27215E.centerX() - f4;
            float centerY = this.f27215E.centerY() - f5;
            this.f27216F.reset();
            this.f27216F.setTranslate(centerX, centerY);
            float[] fArr2 = this.f27248p;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f27216F.mapPoints(copyOf);
            boolean w = mo25359w(copyOf);
            if (w) {
                float[] q = m34454q();
                f2 = -(q[1] + q[3]);
                f3 = -(q[0] + q[2]);
                f = 0.0f;
            } else {
                RectF rectF = new RectF(this.f27215E);
                this.f27216F.reset();
                this.f27216F.setRotate(getCurrentAngle());
                this.f27216F.mapRect(rectF);
                float[] c = C10167g.m34414c(this.f27248p);
                f3 = centerX;
                f = (Math.max(rectF.width() / c[0], rectF.height() / c[1]) * currentScale) - currentScale;
                f2 = centerY;
            }
            if (z) {
                C10181a aVar = new C10181a(this, this.f27226P, f4, f5, f3, f2, currentScale, f, w);
                this.f27220J = aVar;
                post(aVar);
                return;
            }
            mo25376m(f3, f2);
            if (!w) {
                mo25339D(currentScale + f, this.f27215E.centerX(), this.f27215E.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j > 0) {
            this.f27226P = j;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(int i) {
        this.f27224N = i;
    }

    public void setMaxResultImageSizeY(int i) {
        this.f27225O = i;
    }

    public void setMaxScaleMultiplier(float f) {
        this.f27218H = f;
    }

    public void setTargetAspectRatio(float f) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f27217G = f;
            return;
        }
        if (f == 0.0f) {
            f = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        this.f27217G = f;
        C10151c cVar = this.f27219I;
        if (cVar != null) {
            cVar.mo25238a(this.f27217G);
        }
    }

    /* renamed from: t */
    public void mo25356t() {
        removeCallbacks(this.f27220J);
        removeCallbacks(this.f27221K);
    }

    /* renamed from: u */
    public void mo25357u(Bitmap.CompressFormat compressFormat, int i, C10149a aVar) {
        mo25356t();
        setImageToWrapCropBounds(false);
        new BitmapCropTask(getViewBitmap(), new C10157d(this.f27215E, C10167g.m34415d(this.f27248p), getCurrentScale(), getCurrentAngle()), new C10155b(this.f27224N, this.f27225O, compressFormat, i, getImageInputPath(), getImageOutputPath(), getExifInfo()), aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo25358v() {
        return mo25359w(this.f27248p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo25359w(float[] fArr) {
        this.f27216F.reset();
        this.f27216F.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f27216F.mapPoints(copyOf);
        float[] b = C10167g.m34413b(this.f27215E);
        this.f27216F.mapPoints(b);
        return C10167g.m34415d(copyOf).contains(C10167g.m34415d(b));
    }

    /* renamed from: x */
    public void mo25360x(float f) {
        mo25375k(f, this.f27215E.centerX(), this.f27215E.centerY());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo25361y(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(C10145h.f27068V, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(C10145h.f27069W, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f27217G = 0.0f;
        } else {
            this.f27217G = abs / abs2;
        }
    }

    /* renamed from: z */
    public void mo25362z() {
        setImageToWrapCropBounds(true);
    }
}
