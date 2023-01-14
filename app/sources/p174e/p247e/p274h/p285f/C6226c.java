package p174e.p247e.p274h.p285f;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import p174e.p247e.p274h.p284e.C6193g;
import p174e.p247e.p274h.p284e.C6222t;
import p174e.p247e.p274h.p284e.C6223u;

/* renamed from: e.e.h.f.c */
public class C6226c extends C6193g implements C6222t {

    /* renamed from: r */
    Drawable f17248r = null;

    /* renamed from: s */
    private C6223u f17249s;

    public C6226c(Drawable drawable) {
        super(drawable);
    }

    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            C6223u uVar = this.f17249s;
            if (uVar != null) {
                uVar.mo18453a();
            }
            super.draw(canvas);
            Drawable drawable = this.f17248r;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f17248r.draw(canvas);
            }
        }
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    /* renamed from: q */
    public void mo18452q(C6223u uVar) {
        this.f17249s = uVar;
    }

    public boolean setVisible(boolean z, boolean z2) {
        C6223u uVar = this.f17249s;
        if (uVar != null) {
            uVar.mo18454b(z);
        }
        return super.setVisible(z, z2);
    }

    /* renamed from: w */
    public void mo18494w(Drawable drawable) {
        this.f17248r = drawable;
        invalidateSelf();
    }
}
