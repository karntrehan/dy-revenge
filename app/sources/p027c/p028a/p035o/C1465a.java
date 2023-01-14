package p027c.p028a.p035o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import p027c.p028a.C1435a;
import p027c.p028a.C1436b;
import p027c.p028a.C1438d;
import p027c.p028a.C1444j;

/* renamed from: c.a.o.a */
public class C1465a {

    /* renamed from: a */
    private Context f4555a;

    private C1465a(Context context) {
        this.f4555a = context;
    }

    /* renamed from: b */
    public static C1465a m6531b(Context context) {
        return new C1465a(context);
    }

    /* renamed from: a */
    public boolean mo5444a() {
        return this.f4555a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int mo5445c() {
        return this.f4555a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int mo5446d() {
        Configuration configuration = this.f4555a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: e */
    public int mo5447e() {
        return this.f4555a.getResources().getDimensionPixelSize(C1438d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int mo5448f() {
        TypedArray obtainStyledAttributes = this.f4555a.obtainStyledAttributes((AttributeSet) null, C1444j.f4329a, C1435a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1444j.f4374j, 0);
        Resources resources = this.f4555a.getResources();
        if (!mo5449g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C1438d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean mo5449g() {
        return this.f4555a.getResources().getBoolean(C1436b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean mo5450h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f4555a).hasPermanentMenuKey();
    }
}
