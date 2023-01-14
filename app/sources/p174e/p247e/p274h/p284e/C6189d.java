package p174e.p247e.p274h.p284e;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: e.e.h.e.d */
public class C6189d {

    /* renamed from: a */
    private int f17089a = -1;

    /* renamed from: b */
    private boolean f17090b = false;

    /* renamed from: c */
    private ColorFilter f17091c = null;

    /* renamed from: d */
    private int f17092d = -1;

    /* renamed from: e */
    private int f17093e = -1;

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void mo18366a(Drawable drawable) {
        if (drawable != null) {
            int i = this.f17089a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f17090b) {
                drawable.setColorFilter(this.f17091c);
            }
            int i2 = this.f17092d;
            boolean z = true;
            if (i2 != -1) {
                drawable.setDither(i2 != 0);
            }
            int i3 = this.f17093e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    /* renamed from: b */
    public void mo18367b(int i) {
        this.f17089a = i;
    }

    /* renamed from: c */
    public void mo18368c(ColorFilter colorFilter) {
        this.f17091c = colorFilter;
        this.f17090b = colorFilter != null;
    }

    /* renamed from: d */
    public void mo18369d(boolean z) {
        this.f17092d = z ? 1 : 0;
    }

    /* renamed from: e */
    public void mo18370e(boolean z) {
        this.f17093e = z ? 1 : 0;
    }
}
