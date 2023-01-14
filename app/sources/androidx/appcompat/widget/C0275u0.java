package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.u0 */
public class C0275u0 extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1198a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0275u0>> f1199b;

    /* renamed from: c */
    private final Resources f1200c;

    /* renamed from: d */
    private final Resources.Theme f1201d;

    private C0275u0(Context context) {
        super(context);
        if (C0210c1.m1077c()) {
            C0210c1 c1Var = new C0210c1(this, context.getResources());
            this.f1200c = c1Var;
            Resources.Theme newTheme = c1Var.newTheme();
            this.f1201d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1200c = new C0290w0(this, context.getResources());
        this.f1201d = null;
    }

    /* renamed from: a */
    private static boolean m1355a(Context context) {
        if ((context instanceof C0275u0) || (context.getResources() instanceof C0290w0) || (context.getResources() instanceof C0210c1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0210c1.m1077c();
    }

    /* renamed from: b */
    public static Context m1356b(Context context) {
        if (!m1355a(context)) {
            return context;
        }
        synchronized (f1198a) {
            ArrayList<WeakReference<C0275u0>> arrayList = f1199b;
            if (arrayList == null) {
                f1199b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1199b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1199b.remove(size);
                    }
                }
                for (int size2 = f1199b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1199b.get(size2);
                    C0275u0 u0Var = weakReference2 != null ? (C0275u0) weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            C0275u0 u0Var2 = new C0275u0(context);
            f1199b.add(new WeakReference(u0Var2));
            return u0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1200c.getAssets();
    }

    public Resources getResources() {
        return this.f1200c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1201d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1201d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
