package p174e.p247e.p274h.p284e;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.e.k */
public class C6197k extends C6202n {

    /* renamed from: Q */
    private final Paint f17123Q;

    /* renamed from: R */
    private final Paint f17124R;

    /* renamed from: S */
    private final Bitmap f17125S;

    /* renamed from: T */
    private WeakReference<Bitmap> f17126T;

    public C6197k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f17123Q = paint2;
        Paint paint3 = new Paint(1);
        this.f17124R = paint3;
        this.f17125S = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: j */
    private void m23471j() {
        WeakReference<Bitmap> weakReference = this.f17126T;
        if (weakReference == null || weakReference.get() != this.f17125S) {
            this.f17126T = new WeakReference<>(this.f17125S);
            Paint paint = this.f17123Q;
            Bitmap bitmap = this.f17125S;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f17184s = true;
        }
        if (this.f17184s) {
            this.f17123Q.getShader().setLocalMatrix(this.f17173K);
            this.f17184s = false;
        }
        this.f17123Q.setFilterBitmap(mo18423a());
    }

    public void draw(Canvas canvas) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("RoundedBitmapDrawable#draw");
        }
        if (!mo18410e()) {
            super.draw(canvas);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
                return;
            }
            return;
        }
        mo18431h();
        mo18425f();
        m23471j();
        int save = canvas.save();
        canvas.concat(this.f17170H);
        canvas.drawPath(this.f17183r, this.f17123Q);
        float f = this.f17182q;
        if (f > 0.0f) {
            this.f17124R.setStrokeWidth(f);
            this.f17124R.setColor(C6190e.m23430c(this.f17185t, this.f17123Q.getAlpha()));
            canvas.drawPath(this.f17186u, this.f17124R);
        }
        canvas.restoreToCount(save);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo18410e() {
        return super.mo18410e() && this.f17125S != null;
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        if (i != this.f17123Q.getAlpha()) {
            this.f17123Q.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f17123Q.setColorFilter(colorFilter);
    }
}
