package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.c1 */
public class C0210c1 extends Resources {

    /* renamed from: a */
    private static boolean f935a = false;

    /* renamed from: b */
    private final WeakReference<Context> f936b;

    public C0210c1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f936b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1075a() {
        return f935a;
    }

    /* renamed from: b */
    public static void m1076b(boolean z) {
        f935a = z;
    }

    /* renamed from: c */
    public static boolean m1077c() {
        return m1075a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Drawable mo1274d(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f936b.get();
        return context != null ? C0247m0.m1250h().mo1519t(context, this, i) : super.getDrawable(i);
    }
}
