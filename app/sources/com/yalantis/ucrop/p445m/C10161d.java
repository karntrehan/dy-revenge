package com.yalantis.ucrop.p445m;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.yalantis.ucrop.m.d */
public class C10161d extends Drawable {

    /* renamed from: a */
    private final Paint f27126a = new Paint(2);

    /* renamed from: b */
    private Bitmap f27127b;

    /* renamed from: c */
    private int f27128c = 255;

    /* renamed from: d */
    private int f27129d;

    /* renamed from: e */
    private int f27130e;

    public C10161d(Bitmap bitmap) {
        mo25265b(bitmap);
    }

    /* renamed from: a */
    public Bitmap mo25264a() {
        return this.f27127b;
    }

    /* renamed from: b */
    public void mo25265b(Bitmap bitmap) {
        this.f27127b = bitmap;
        if (bitmap != null) {
            this.f27129d = bitmap.getWidth();
            this.f27130e = this.f27127b.getHeight();
            return;
        }
        this.f27130e = 0;
        this.f27129d = 0;
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f27127b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f27127b, (Rect) null, getBounds(), this.f27126a);
        }
    }

    public int getAlpha() {
        return this.f27128c;
    }

    public int getIntrinsicHeight() {
        return this.f27130e;
    }

    public int getIntrinsicWidth() {
        return this.f27129d;
    }

    public int getMinimumHeight() {
        return this.f27130e;
    }

    public int getMinimumWidth() {
        return this.f27129d;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f27128c = i;
        this.f27126a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27126a.setColorFilter(colorFilter);
    }

    public void setFilterBitmap(boolean z) {
        this.f27126a.setFilterBitmap(z);
    }
}
