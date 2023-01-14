package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0298z;
import androidx.core.content.C1135a;
import com.yalantis.ucrop.C10138a;
import com.yalantis.ucrop.C10139b;
import com.yalantis.ucrop.C10145h;
import com.yalantis.ucrop.p444l.C10153a;
import java.util.Locale;

public class AspectRatioTextView extends C0298z {

    /* renamed from: r */
    private final float f27260r;

    /* renamed from: s */
    private final Rect f27261s;

    /* renamed from: t */
    private Paint f27262t;

    /* renamed from: u */
    private int f27263u;

    /* renamed from: v */
    private float f27264v;

    /* renamed from: w */
    private String f27265w;

    /* renamed from: x */
    private float f27266x;

    /* renamed from: y */
    private float f27267y;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27260r = 1.5f;
        this.f27261s = new Rect();
        m34491j(context.obtainStyledAttributes(attributeSet, C10145h.f27063Q));
    }

    /* renamed from: h */
    private void m34490h(int i) {
        Paint paint = this.f27262t;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, C1135a.m4417c(getContext(), C10138a.ucrop_color_widget)}));
    }

    /* renamed from: j */
    private void m34491j(TypedArray typedArray) {
        setGravity(1);
        this.f27265w = typedArray.getString(C10145h.f27064R);
        this.f27266x = typedArray.getFloat(C10145h.f27065S, 0.0f);
        float f = typedArray.getFloat(C10145h.f27066T, 0.0f);
        this.f27267y = f;
        float f2 = this.f27266x;
        if (f2 == 0.0f || f == 0.0f) {
            this.f27264v = 0.0f;
        } else {
            this.f27264v = f2 / f;
        }
        this.f27263u = getContext().getResources().getDimensionPixelSize(C10139b.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f27262t = paint;
        paint.setStyle(Paint.Style.FILL);
        m34492k();
        m34490h(getResources().getColor(C10138a.ucrop_color_widget_active));
        typedArray.recycle();
    }

    /* renamed from: k */
    private void m34492k() {
        String str;
        if (!TextUtils.isEmpty(this.f27265w)) {
            str = this.f27265w;
        } else {
            str = String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f27266x), Integer.valueOf((int) this.f27267y)});
        }
        setText(str);
    }

    /* renamed from: l */
    private void m34493l() {
        if (this.f27264v != 0.0f) {
            float f = this.f27266x;
            float f2 = this.f27267y;
            this.f27266x = f2;
            this.f27267y = f;
            this.f27264v = f2 / f;
        }
    }

    /* renamed from: i */
    public float mo25383i(boolean z) {
        if (z) {
            m34493l();
            m34492k();
        }
        return this.f27264v;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f27261s);
            Rect rect = this.f27261s;
            float f = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i = this.f27263u;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f - (((float) i) * 1.5f), ((float) i) / 2.0f, this.f27262t);
        }
    }

    public void setActiveColor(int i) {
        m34490h(i);
        invalidate();
    }

    public void setAspectRatio(C10153a aVar) {
        this.f27265w = aVar.mo25240a();
        this.f27266x = aVar.mo25241b();
        float c = aVar.mo25242c();
        this.f27267y = c;
        float f = this.f27266x;
        if (f == 0.0f || c == 0.0f) {
            this.f27264v = 0.0f;
        } else {
            this.f27264v = f / c;
        }
        m34492k();
    }
}
