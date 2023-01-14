package p174e.p247e.p274h.p284e;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.e.a */
public class C6185a extends Drawable implements Drawable.Callback, C6221s, C6220r {

    /* renamed from: f */
    private C6221s f17075f;

    /* renamed from: o */
    private final C6189d f17076o = new C6189d();

    /* renamed from: p */
    private final Drawable[] f17077p;

    /* renamed from: q */
    private final C6188c[] f17078q;

    /* renamed from: r */
    private final Rect f17079r = new Rect();

    /* renamed from: s */
    private boolean f17080s;

    /* renamed from: t */
    private boolean f17081t;

    /* renamed from: u */
    private boolean f17082u;

    /* renamed from: e.e.h.e.a$a */
    class C6186a implements C6188c {

        /* renamed from: f */
        final /* synthetic */ int f17083f;

        C6186a(int i) {
            this.f17083f = i;
        }

        /* renamed from: k */
        public Drawable mo18362k(Drawable drawable) {
            return C6185a.this.mo18342g(this.f17083f, drawable);
        }

        /* renamed from: r */
        public Drawable mo18363r() {
            return C6185a.this.mo18336b(this.f17083f);
        }
    }

    public C6185a(Drawable[] drawableArr) {
        int i = 0;
        this.f17080s = false;
        this.f17081t = false;
        this.f17082u = false;
        C6062k.m22839g(drawableArr);
        this.f17077p = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f17077p;
            if (i < drawableArr2.length) {
                C6190e.m23431d(drawableArr2[i], this, this);
                i++;
            } else {
                this.f17078q = new C6188c[drawableArr2.length];
                return;
            }
        }
    }

    /* renamed from: a */
    private C6188c m23409a(int i) {
        return new C6186a(i);
    }

    /* renamed from: b */
    public Drawable mo18336b(int i) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f17077p.length) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return this.f17077p[i];
    }

    /* renamed from: c */
    public void mo18337c(C6221s sVar) {
        this.f17075f = sVar;
    }

    /* renamed from: d */
    public C6188c mo18338d(int i) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f17078q.length) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        C6188c[] cVarArr = this.f17078q;
        if (cVarArr[i] == null) {
            cVarArr[i] = m23409a(i);
        }
        return this.f17078q[i];
    }

    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public int mo18340e() {
        return this.f17077p.length;
    }

    /* renamed from: f */
    public void mo18341f(Matrix matrix) {
        C6221s sVar = this.f17075f;
        if (sVar != null) {
            sVar.mo18341f(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: g */
    public Drawable mo18342g(int i, Drawable drawable) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i >= 0));
        if (i >= this.f17077p.length) {
            z = false;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        Drawable drawable2 = this.f17077p[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f17082u) {
                drawable.mutate();
            }
            C6190e.m23431d(this.f17077p[i], (Drawable.Callback) null, (C6221s) null);
            C6190e.m23431d(drawable, (Drawable.Callback) null, (C6221s) null);
            C6190e.m23432e(drawable, this.f17076o);
            C6190e.m23428a(drawable, this);
            C6190e.m23431d(drawable, this, this);
            this.f17081t = false;
            this.f17077p[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f17077p.length == 0) {
            return -2;
        }
        int i = -1;
        int i2 = 1;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i2 >= drawableArr.length) {
                return i;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
            i2++;
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f17079r;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        if (!this.f17081t) {
            this.f17080s = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f17077p;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f17080s;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f17080s = z2 | z;
                i++;
            }
            this.f17081t = true;
        }
        return this.f17080s;
    }

    /* renamed from: l */
    public void mo18349l(RectF rectF) {
        C6221s sVar = this.f17075f;
        if (sVar != null) {
            sVar.mo18349l(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.f17082u = true;
                return this;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f17076o.mo18367b(i);
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i2 < drawableArr.length) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    drawable.setAlpha(i);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17076o.mo18368c(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setDither(boolean z) {
        this.f17076o.mo18369d(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f17076o.mo18370e(z);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f17077p;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
