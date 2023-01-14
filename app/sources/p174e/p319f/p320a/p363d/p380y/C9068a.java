package p174e.p319f.p320a.p363d.p380y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C1165b;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8997k;
import p174e.p319f.p320a.p363d.p364a0.C9012n;

/* renamed from: e.f.a.d.y.a */
public class C9068a extends Drawable implements C9012n, C1165b {

    /* renamed from: f */
    private C9070b f24902f;

    /* renamed from: e.f.a.d.y.a$b */
    static final class C9070b extends Drawable.ConstantState {

        /* renamed from: a */
        C8990g f24903a;

        /* renamed from: b */
        boolean f24904b;

        public C9070b(C8990g gVar) {
            this.f24903a = gVar;
            this.f24904b = false;
        }

        public C9070b(C9070b bVar) {
            this.f24903a = (C8990g) bVar.f24903a.getConstantState().newDrawable();
            this.f24904b = bVar.f24904b;
        }

        /* renamed from: a */
        public C9068a newDrawable() {
            return new C9068a(new C9070b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    public C9068a(C8997k kVar) {
        this(new C9070b(new C8990g(kVar)));
    }

    private C9068a(C9070b bVar) {
        this.f24902f = bVar;
    }

    /* renamed from: a */
    public C9068a mutate() {
        this.f24902f = new C9070b(this.f24902f);
        return this;
    }

    public void draw(Canvas canvas) {
        C9070b bVar = this.f24902f;
        if (bVar.f24904b) {
            bVar.f24903a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f24902f;
    }

    public int getOpacity() {
        return this.f24902f.f24903a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f24902f.f24903a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f24902f.f24903a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C9071b.m30224b(iArr);
        C9070b bVar = this.f24902f;
        if (bVar.f24904b == b) {
            return onStateChange;
        }
        bVar.f24904b = b;
        return true;
    }

    public void setAlpha(int i) {
        this.f24902f.f24903a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24902f.f24903a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(C8997k kVar) {
        this.f24902f.f24903a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i) {
        this.f24902f.f24903a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f24902f.f24903a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f24902f.f24903a.setTintMode(mode);
    }
}
