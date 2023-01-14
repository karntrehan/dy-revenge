package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.view.View;
import com.facebook.react.views.view.C3245g;

/* renamed from: org.reactnative.maskedview.a */
public class C10999a extends C3245g {

    /* renamed from: F */
    private Bitmap f28839F = null;

    /* renamed from: G */
    private Paint f28840G;

    /* renamed from: H */
    private PorterDuffXfermode f28841H;

    public C10999a(Context context) {
        super(context);
        setLayerType(1, (Paint) null);
        this.f28840G = new Paint(1);
        this.f28841H = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    /* renamed from: B */
    public static Bitmap m37320B(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: C */
    private void m37321C() {
        Bitmap bitmap = this.f28839F;
        if (bitmap != null) {
            bitmap.recycle();
        }
        View childAt = getChildAt(0);
        childAt.setVisibility(0);
        this.f28839F = m37320B(childAt);
        childAt.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m37321C();
        if (this.f28839F != null) {
            this.f28840G.setXfermode(this.f28841H);
            canvas.drawBitmap(this.f28839F, 0.0f, 0.0f, this.f28840G);
            this.f28840G.setXfermode((Xfermode) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m37321C();
        }
    }
}
