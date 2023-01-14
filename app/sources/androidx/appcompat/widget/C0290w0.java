package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.w0 */
class C0290w0 extends C0255n0 {

    /* renamed from: b */
    private final WeakReference<Context> f1241b;

    public C0290w0(Context context, Resources resources) {
        super(resources);
        this.f1241b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1241b.get();
        if (!(drawable == null || context == null)) {
            C0247m0.m1250h().mo1521x(context, i, drawable);
        }
        return drawable;
    }
}
