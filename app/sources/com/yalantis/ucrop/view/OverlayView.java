package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.C10138a;
import com.yalantis.ucrop.C10139b;
import com.yalantis.ucrop.C10145h;
import com.yalantis.ucrop.p443k.C10152d;
import com.yalantis.ucrop.p445m.C10167g;

public class OverlayView extends View {

    /* renamed from: A */
    private int f27183A;

    /* renamed from: B */
    private Path f27184B;

    /* renamed from: C */
    private Paint f27185C;

    /* renamed from: D */
    private Paint f27186D;

    /* renamed from: E */
    private Paint f27187E;

    /* renamed from: F */
    private Paint f27188F;

    /* renamed from: G */
    private int f27189G;

    /* renamed from: H */
    private float f27190H;

    /* renamed from: I */
    private float f27191I;

    /* renamed from: J */
    private int f27192J;

    /* renamed from: K */
    private int f27193K;

    /* renamed from: L */
    private int f27194L;

    /* renamed from: M */
    private int f27195M;

    /* renamed from: N */
    private C10152d f27196N;

    /* renamed from: O */
    private boolean f27197O;

    /* renamed from: f */
    private final RectF f27198f;

    /* renamed from: o */
    private final RectF f27199o;

    /* renamed from: p */
    protected int f27200p;

    /* renamed from: q */
    protected int f27201q;

    /* renamed from: r */
    protected float[] f27202r;

    /* renamed from: s */
    protected float[] f27203s;

    /* renamed from: t */
    private int f27204t;

    /* renamed from: u */
    private int f27205u;

    /* renamed from: v */
    private float f27206v;

    /* renamed from: w */
    private float[] f27207w;

    /* renamed from: x */
    private boolean f27208x;

    /* renamed from: y */
    private boolean f27209y;

    /* renamed from: z */
    private boolean f27210z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27198f = new RectF();
        this.f27199o = new RectF();
        this.f27207w = null;
        this.f27184B = new Path();
        this.f27185C = new Paint(1);
        this.f27186D = new Paint(1);
        this.f27187E = new Paint(1);
        this.f27188F = new Paint(1);
        this.f27189G = 0;
        this.f27190H = -1.0f;
        this.f27191I = -1.0f;
        this.f27192J = -1;
        this.f27193K = getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_rect_corner_touch_threshold);
        this.f27194L = getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_rect_min_size);
        this.f27195M = getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_rect_corner_touch_area_line_length);
        mo25310d();
    }

    /* renamed from: c */
    private int m34437c(float f, float f2) {
        double d = (double) this.f27193K;
        int i = -1;
        for (int i2 = 0; i2 < 8; i2 += 2) {
            double sqrt = Math.sqrt(Math.pow((double) (f - this.f27202r[i2]), 2.0d) + Math.pow((double) (f2 - this.f27202r[i2 + 1]), 2.0d));
            if (sqrt < d) {
                i = i2 / 2;
                d = sqrt;
            }
        }
        if (this.f27189G != 1 || i >= 0 || !this.f27198f.contains(f, f2)) {
            return i;
        }
        return 4;
    }

    /* renamed from: e */
    private void m34438e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C10145h.f27074a0, getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(C10145h.f27072Z, getResources().getColor(C10138a.ucrop_color_default_crop_frame));
        this.f27187E.setStrokeWidth((float) dimensionPixelSize);
        this.f27187E.setColor(color);
        this.f27187E.setStyle(Paint.Style.STROKE);
        this.f27188F.setStrokeWidth((float) (dimensionPixelSize * 3));
        this.f27188F.setColor(color);
        this.f27188F.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    private void m34439f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C10145h.f27082e0, getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(C10145h.f27076b0, getResources().getColor(C10138a.ucrop_color_default_crop_grid));
        this.f27186D.setStrokeWidth((float) dimensionPixelSize);
        this.f27186D.setColor(color);
        this.f27204t = typedArray.getInt(C10145h.f27080d0, 2);
        this.f27205u = typedArray.getInt(C10145h.f27078c0, 2);
    }

    /* renamed from: i */
    private void m34440i(float f, float f2) {
        this.f27199o.set(this.f27198f);
        int i = this.f27192J;
        boolean z = true;
        if (i == 0) {
            RectF rectF = this.f27199o;
            RectF rectF2 = this.f27198f;
            rectF.set(f, f2, rectF2.right, rectF2.bottom);
        } else if (i == 1) {
            RectF rectF3 = this.f27199o;
            RectF rectF4 = this.f27198f;
            rectF3.set(rectF4.left, f2, f, rectF4.bottom);
        } else if (i == 2) {
            RectF rectF5 = this.f27199o;
            RectF rectF6 = this.f27198f;
            rectF5.set(rectF6.left, rectF6.top, f, f2);
        } else if (i == 3) {
            RectF rectF7 = this.f27199o;
            RectF rectF8 = this.f27198f;
            rectF7.set(f, rectF8.top, rectF8.right, f2);
        } else if (i == 4) {
            this.f27199o.offset(f - this.f27190H, f2 - this.f27191I);
            if (this.f27199o.left > ((float) getLeft()) && this.f27199o.top > ((float) getTop()) && this.f27199o.right < ((float) getRight()) && this.f27199o.bottom < ((float) getBottom())) {
                this.f27198f.set(this.f27199o);
                m34441j();
                postInvalidate();
                return;
            }
            return;
        }
        boolean z2 = this.f27199o.height() >= ((float) this.f27194L);
        if (this.f27199o.width() < ((float) this.f27194L)) {
            z = false;
        }
        RectF rectF9 = this.f27198f;
        rectF9.set(z ? this.f27199o.left : rectF9.left, z2 ? this.f27199o.top : rectF9.top, z ? this.f27199o.right : rectF9.right, z2 ? this.f27199o.bottom : rectF9.bottom);
        if (z2 || z) {
            m34441j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    private void m34441j() {
        this.f27202r = C10167g.m34413b(this.f27198f);
        this.f27203s = C10167g.m34412a(this.f27198f);
        this.f27207w = null;
        this.f27184B.reset();
        this.f27184B.addCircle(this.f27198f.centerX(), this.f27198f.centerY(), Math.min(this.f27198f.width(), this.f27198f.height()) / 2.0f, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25308a(Canvas canvas) {
        if (this.f27209y) {
            if (this.f27207w == null && !this.f27198f.isEmpty()) {
                this.f27207w = new float[((this.f27204t * 4) + (this.f27205u * 4))];
                int i = 0;
                for (int i2 = 0; i2 < this.f27204t; i2++) {
                    float[] fArr = this.f27207w;
                    int i3 = i + 1;
                    RectF rectF = this.f27198f;
                    fArr[i] = rectF.left;
                    int i4 = i3 + 1;
                    float f = ((float) i2) + 1.0f;
                    float height = rectF.height() * (f / ((float) (this.f27204t + 1)));
                    RectF rectF2 = this.f27198f;
                    fArr[i3] = height + rectF2.top;
                    float[] fArr2 = this.f27207w;
                    int i5 = i4 + 1;
                    fArr2[i4] = rectF2.right;
                    i = i5 + 1;
                    fArr2[i5] = (rectF2.height() * (f / ((float) (this.f27204t + 1)))) + this.f27198f.top;
                }
                for (int i6 = 0; i6 < this.f27205u; i6++) {
                    float[] fArr3 = this.f27207w;
                    int i7 = i + 1;
                    float f2 = ((float) i6) + 1.0f;
                    float width = this.f27198f.width() * (f2 / ((float) (this.f27205u + 1)));
                    RectF rectF3 = this.f27198f;
                    fArr3[i] = width + rectF3.left;
                    float[] fArr4 = this.f27207w;
                    int i8 = i7 + 1;
                    fArr4[i7] = rectF3.top;
                    int i9 = i8 + 1;
                    float width2 = rectF3.width() * (f2 / ((float) (this.f27205u + 1)));
                    RectF rectF4 = this.f27198f;
                    fArr4[i8] = width2 + rectF4.left;
                    i = i9 + 1;
                    this.f27207w[i9] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f27207w;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f27186D);
            }
        }
        if (this.f27208x) {
            canvas.drawRect(this.f27198f, this.f27187E);
        }
        if (this.f27189G != 0) {
            canvas.save();
            this.f27199o.set(this.f27198f);
            RectF rectF5 = this.f27199o;
            int i10 = this.f27195M;
            rectF5.inset((float) i10, (float) (-i10));
            canvas.clipRect(this.f27199o, Region.Op.DIFFERENCE);
            this.f27199o.set(this.f27198f);
            RectF rectF6 = this.f27199o;
            int i11 = this.f27195M;
            rectF6.inset((float) (-i11), (float) i11);
            canvas.clipRect(this.f27199o, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f27198f, this.f27188F);
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25309b(Canvas canvas) {
        canvas.save();
        if (this.f27210z) {
            canvas.clipPath(this.f27184B, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f27198f, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f27183A);
        canvas.restore();
        if (this.f27210z) {
            canvas.drawCircle(this.f27198f.centerX(), this.f27198f.centerY(), Math.min(this.f27198f.width(), this.f27198f.height()) / 2.0f, this.f27185C);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo25310d() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25311g(TypedArray typedArray) {
        this.f27210z = typedArray.getBoolean(C10145h.f27070X, false);
        int color = typedArray.getColor(C10145h.f27071Y, getResources().getColor(C10138a.ucrop_color_default_dimmed));
        this.f27183A = color;
        this.f27185C.setColor(color);
        this.f27185C.setStyle(Paint.Style.STROKE);
        this.f27185C.setStrokeWidth(1.0f);
        m34438e(typedArray);
        this.f27208x = typedArray.getBoolean(C10145h.f27084f0, true);
        m34439f(typedArray);
        this.f27209y = typedArray.getBoolean(C10145h.f27086g0, true);
    }

    public RectF getCropViewRect() {
        return this.f27198f;
    }

    public int getFreestyleCropMode() {
        return this.f27189G;
    }

    public C10152d getOverlayViewChangeListener() {
        return this.f27196N;
    }

    /* renamed from: h */
    public void mo25315h() {
        int i = this.f27200p;
        float f = this.f27206v;
        int i2 = (int) (((float) i) / f);
        int i3 = this.f27201q;
        if (i2 > i3) {
            int i4 = (int) (((float) i3) * f);
            int i5 = (i - i4) / 2;
            this.f27198f.set((float) (getPaddingLeft() + i5), (float) getPaddingTop(), (float) (getPaddingLeft() + i4 + i5), (float) (getPaddingTop() + this.f27201q));
        } else {
            int i6 = (i3 - i2) / 2;
            this.f27198f.set((float) getPaddingLeft(), (float) (getPaddingTop() + i6), (float) (getPaddingLeft() + this.f27200p), (float) (getPaddingTop() + i2 + i6));
        }
        C10152d dVar = this.f27196N;
        if (dVar != null) {
            dVar.mo25239a(this.f27198f);
        }
        m34441j();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo25309b(canvas);
        mo25308a(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f27200p = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f27201q = (getHeight() - getPaddingBottom()) - paddingTop;
            if (this.f27197O) {
                this.f27197O = false;
                setTargetAspectRatio(this.f27206v);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (!this.f27198f.isEmpty() && this.f27189G != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int c = m34437c(x, y);
                this.f27192J = c;
                if (c != -1) {
                    z = true;
                }
                if (!z) {
                    this.f27190H = -1.0f;
                    this.f27191I = -1.0f;
                } else if (this.f27190H < 0.0f) {
                    this.f27190H = x;
                    this.f27191I = y;
                }
                return z;
            } else if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f27192J != -1) {
                float min = Math.min(Math.max(x, (float) getPaddingLeft()), (float) (getWidth() - getPaddingRight()));
                float min2 = Math.min(Math.max(y, (float) getPaddingTop()), (float) (getHeight() - getPaddingBottom()));
                m34440i(min, min2);
                this.f27190H = min;
                this.f27191I = min2;
                return true;
            } else if ((motionEvent.getAction() & 255) == 1) {
                this.f27190H = -1.0f;
                this.f27191I = -1.0f;
                this.f27192J = -1;
                C10152d dVar = this.f27196N;
                if (dVar != null) {
                    dVar.mo25239a(this.f27198f);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f27210z = z;
    }

    public void setCropFrameColor(int i) {
        this.f27187E.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.f27187E.setStrokeWidth((float) i);
    }

    public void setCropGridColor(int i) {
        this.f27186D.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.f27205u = i;
        this.f27207w = null;
    }

    public void setCropGridCornerColor(int i) {
        this.f27188F.setColor(i);
    }

    public void setCropGridRowCount(int i) {
        this.f27204t = i;
        this.f27207w = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.f27186D.setStrokeWidth((float) i);
    }

    public void setDimmedColor(int i) {
        this.f27183A = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f27189G = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f27189G = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(C10152d dVar) {
        this.f27196N = dVar;
    }

    public void setShowCropFrame(boolean z) {
        this.f27208x = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f27209y = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f27206v = f;
        if (this.f27200p > 0) {
            mo25315h();
            postInvalidate();
            return;
        }
        this.f27197O = true;
    }
}
