package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C1135a;
import com.yalantis.ucrop.C10138a;
import com.yalantis.ucrop.C10139b;

public class HorizontalProgressWheelView extends View {

    /* renamed from: f */
    private final Rect f27268f;

    /* renamed from: o */
    private C10186a f27269o;

    /* renamed from: p */
    private float f27270p;

    /* renamed from: q */
    private Paint f27271q;

    /* renamed from: r */
    private Paint f27272r;

    /* renamed from: s */
    private int f27273s;

    /* renamed from: t */
    private int f27274t;

    /* renamed from: u */
    private int f27275u;

    /* renamed from: v */
    private boolean f27276v;

    /* renamed from: w */
    private float f27277w;

    /* renamed from: x */
    private int f27278x;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    public interface C10186a {
        /* renamed from: a */
        void mo25201a();

        /* renamed from: b */
        void mo25202b(float f, float f2);

        /* renamed from: c */
        void mo25203c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27268f = new Rect();
        m34495a();
    }

    /* renamed from: a */
    private void m34495a() {
        this.f27278x = C1135a.m4417c(getContext(), C10138a.ucrop_color_widget_rotate_mid_line);
        this.f27273s = getContext().getResources().getDimensionPixelSize(C10139b.ucrop_width_horizontal_wheel_progress_line);
        this.f27274t = getContext().getResources().getDimensionPixelSize(C10139b.ucrop_height_horizontal_wheel_progress_line);
        this.f27275u = getContext().getResources().getDimensionPixelSize(C10139b.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f27271q = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f27271q.setStrokeWidth((float) this.f27273s);
        this.f27271q.setColor(getResources().getColor(C10138a.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f27271q);
        this.f27272r = paint2;
        paint2.setColor(this.f27278x);
        this.f27272r.setStrokeCap(Paint.Cap.ROUND);
        this.f27272r.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(C10139b.ucrop_width_middle_wheel_progress_line));
    }

    /* renamed from: b */
    private void m34496b(MotionEvent motionEvent, float f) {
        this.f27277w -= f;
        postInvalidate();
        this.f27270p = motionEvent.getX();
        C10186a aVar = this.f27269o;
        if (aVar != null) {
            aVar.mo25202b(-f, this.f27277w);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f27268f);
        int width = this.f27268f.width();
        int i = this.f27273s;
        int i2 = this.f27275u;
        int i3 = width / (i + i2);
        float f2 = this.f27277w % ((float) (i2 + i));
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i3 / 4;
            if (i4 < i5) {
                paint = this.f27271q;
                f = (float) i4;
            } else if (i4 > (i3 * 3) / 4) {
                paint = this.f27271q;
                f = (float) (i3 - i4);
            } else {
                this.f27271q.setAlpha(255);
                float f3 = -f2;
                Rect rect = this.f27268f;
                float f4 = ((float) rect.left) + f3 + ((float) ((this.f27273s + this.f27275u) * i4));
                float centerY = ((float) rect.centerY()) - (((float) this.f27274t) / 4.0f);
                Rect rect2 = this.f27268f;
                canvas.drawLine(f4, centerY, f3 + ((float) rect2.left) + ((float) ((this.f27273s + this.f27275u) * i4)), ((float) rect2.centerY()) + (((float) this.f27274t) / 4.0f), this.f27271q);
            }
            paint.setAlpha((int) ((f / ((float) i5)) * 255.0f));
            float f32 = -f2;
            Rect rect3 = this.f27268f;
            float f42 = ((float) rect3.left) + f32 + ((float) ((this.f27273s + this.f27275u) * i4));
            float centerY2 = ((float) rect3.centerY()) - (((float) this.f27274t) / 4.0f);
            Rect rect22 = this.f27268f;
            canvas.drawLine(f42, centerY2, f32 + ((float) rect22.left) + ((float) ((this.f27273s + this.f27275u) * i4)), ((float) rect22.centerY()) + (((float) this.f27274t) / 4.0f), this.f27271q);
        }
        float centerX = (float) this.f27268f.centerX();
        float centerY3 = ((float) this.f27268f.centerY()) - (((float) this.f27274t) / 2.0f);
        Canvas canvas2 = canvas;
        float f5 = centerY3;
        canvas2.drawLine(centerX, f5, (float) this.f27268f.centerX(), (((float) this.f27274t) / 2.0f) + ((float) this.f27268f.centerY()), this.f27272r);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27270p = motionEvent.getX();
        } else if (action == 1) {
            C10186a aVar = this.f27269o;
            if (aVar != null) {
                this.f27276v = false;
                aVar.mo25201a();
            }
        } else if (action == 2) {
            float x = motionEvent.getX() - this.f27270p;
            if (x != 0.0f) {
                if (!this.f27276v) {
                    this.f27276v = true;
                    C10186a aVar2 = this.f27269o;
                    if (aVar2 != null) {
                        aVar2.mo25203c();
                    }
                }
                m34496b(motionEvent, x);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i) {
        this.f27278x = i;
        this.f27272r.setColor(i);
        invalidate();
    }

    public void setScrollingListener(C10186a aVar) {
        this.f27269o = aVar;
    }
}
