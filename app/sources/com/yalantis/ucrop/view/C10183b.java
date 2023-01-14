package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.C0256o;
import com.yalantis.ucrop.p443k.C10150b;
import com.yalantis.ucrop.p444l.C10156c;
import com.yalantis.ucrop.p445m.C10158a;
import com.yalantis.ucrop.p445m.C10161d;
import com.yalantis.ucrop.p445m.C10167g;

/* renamed from: com.yalantis.ucrop.view.b */
public class C10183b extends C0256o {

    /* renamed from: A */
    private int f27244A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f27245B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public String f27246C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C10156c f27247D;

    /* renamed from: p */
    protected final float[] f27248p;

    /* renamed from: q */
    protected final float[] f27249q;

    /* renamed from: r */
    private final float[] f27250r;

    /* renamed from: s */
    protected Matrix f27251s;

    /* renamed from: t */
    protected int f27252t;

    /* renamed from: u */
    protected int f27253u;

    /* renamed from: v */
    protected C10185b f27254v;

    /* renamed from: w */
    private float[] f27255w;

    /* renamed from: x */
    private float[] f27256x;

    /* renamed from: y */
    protected boolean f27257y;

    /* renamed from: z */
    protected boolean f27258z;

    /* renamed from: com.yalantis.ucrop.view.b$a */
    class C10184a implements C10150b {
        C10184a() {
        }

        /* renamed from: a */
        public void mo25236a(Bitmap bitmap, C10156c cVar, String str, String str2) {
            String unused = C10183b.this.f27245B = str;
            String unused2 = C10183b.this.f27246C = str2;
            C10156c unused3 = C10183b.this.f27247D = cVar;
            C10183b bVar = C10183b.this;
            bVar.f27257y = true;
            bVar.setImageBitmap(bitmap);
        }

        /* renamed from: b */
        public void mo25237b(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            C10185b bVar = C10183b.this.f27254v;
            if (bVar != null) {
                bVar.mo25198c(exc);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b */
    public interface C10185b {
        /* renamed from: a */
        void mo25196a(float f);

        /* renamed from: b */
        void mo25197b();

        /* renamed from: c */
        void mo25198c(Exception exc);

        /* renamed from: d */
        void mo25199d(float f);
    }

    public C10183b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C10183b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27248p = new float[8];
        this.f27249q = new float[2];
        this.f27250r = new float[9];
        this.f27251s = new Matrix();
        this.f27257y = false;
        this.f27258z = false;
        this.f27244A = 0;
        mo25300i();
    }

    /* renamed from: o */
    private void m34474o() {
        this.f27251s.mapPoints(this.f27248p, this.f27255w);
        this.f27251s.mapPoints(this.f27249q, this.f27256x);
    }

    /* renamed from: f */
    public float mo25365f(Matrix matrix) {
        return (float) (-(Math.atan2((double) mo25374h(matrix, 1), (double) mo25374h(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: g */
    public float mo25366g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) mo25374h(matrix, 0), 2.0d) + Math.pow((double) mo25374h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return mo25365f(this.f27251s);
    }

    public float getCurrentScale() {
        return mo25366g(this.f27251s);
    }

    public C10156c getExifInfo() {
        return this.f27247D;
    }

    public String getImageInputPath() {
        return this.f27245B;
    }

    public String getImageOutputPath() {
        return this.f27246C;
    }

    public int getMaxBitmapSize() {
        if (this.f27244A <= 0) {
            this.f27244A = C10158a.m34377b(getContext());
        }
        return this.f27244A;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C10161d)) {
            return null;
        }
        return ((C10161d) getDrawable()).mo25264a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public float mo25374h(Matrix matrix, int i) {
        matrix.getValues(this.f27250r);
        return this.f27250r[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo25300i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25346j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f27255w = C10167g.m34413b(rectF);
            this.f27256x = C10167g.m34412a(rectF);
            this.f27258z = true;
            C10185b bVar = this.f27254v;
            if (bVar != null) {
                bVar.mo25197b();
            }
        }
    }

    /* renamed from: k */
    public void mo25375k(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f27251s.postRotate(f, f2, f3);
            setImageMatrix(this.f27251s);
            C10185b bVar = this.f27254v;
            if (bVar != null) {
                bVar.mo25196a(mo25365f(this.f27251s));
            }
        }
    }

    /* renamed from: l */
    public void mo25347l(float f, float f2, float f3) {
        if (f != 0.0f) {
            this.f27251s.postScale(f, f, f2, f3);
            setImageMatrix(this.f27251s);
            C10185b bVar = this.f27254v;
            if (bVar != null) {
                bVar.mo25199d(mo25366g(this.f27251s));
            }
        }
    }

    /* renamed from: m */
    public void mo25376m(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            this.f27251s.postTranslate(f, f2);
            setImageMatrix(this.f27251s);
        }
    }

    /* renamed from: n */
    public void mo25377n(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C10158a.m34379d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new C10184a());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.f27257y && !this.f27258z)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f27252t = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f27253u = (getHeight() - getPaddingBottom()) - paddingTop;
            mo25346j();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C10161d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f27251s.set(matrix);
        m34474o();
    }

    public void setMaxBitmapSize(int i) {
        this.f27244A = i;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(C10185b bVar) {
        this.f27254v = bVar;
    }
}
