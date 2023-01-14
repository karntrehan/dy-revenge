package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
final class C1169f extends Drawable.ConstantState {

    /* renamed from: a */
    int f3254a;

    /* renamed from: b */
    Drawable.ConstantState f3255b;

    /* renamed from: c */
    ColorStateList f3256c = null;

    /* renamed from: d */
    PorterDuff.Mode f3257d = C1167d.f3246f;

    C1169f(C1169f fVar) {
        if (fVar != null) {
            this.f3254a = fVar.f3254a;
            this.f3255b = fVar.f3255b;
            this.f3256c = fVar.f3256c;
            this.f3257d = fVar.f3257d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3697a() {
        return this.f3255b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f3254a;
        Drawable.ConstantState constantState = this.f3255b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C1168e(this, resources) : new C1167d(this, resources);
    }
}
