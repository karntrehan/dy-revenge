package p027c.p028a.p035o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p027c.p028a.C1443i;

/* renamed from: c.a.o.d */
public class C1469d extends ContextWrapper {

    /* renamed from: a */
    private int f4558a;

    /* renamed from: b */
    private Resources.Theme f4559b;

    /* renamed from: c */
    private LayoutInflater f4560c;

    /* renamed from: d */
    private Configuration f4561d;

    /* renamed from: e */
    private Resources f4562e;

    public C1469d() {
        super((Context) null);
    }

    public C1469d(Context context, int i) {
        super(context);
        this.f4558a = i;
    }

    public C1469d(Context context, Resources.Theme theme) {
        super(context);
        this.f4559b = theme;
    }

    /* renamed from: b */
    private Resources m6562b() {
        Resources resources;
        if (this.f4562e == null) {
            Configuration configuration = this.f4561d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f4561d);
                this.f4562e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f4562e = resources;
        }
        return this.f4562e;
    }

    /* renamed from: d */
    private void m6563d() {
        boolean z = this.f4559b == null;
        if (z) {
            this.f4559b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4559b.setTo(theme);
            }
        }
        mo5457e(this.f4559b, this.f4558a, z);
    }

    /* renamed from: a */
    public void mo5454a(Configuration configuration) {
        if (this.f4562e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f4561d == null) {
            this.f4561d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: c */
    public int mo5456c() {
        return this.f4558a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo5457e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m6562b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4560c == null) {
            this.f4560c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4560c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f4559b;
        if (theme != null) {
            return theme;
        }
        if (this.f4558a == 0) {
            this.f4558a = C1443i.Theme_AppCompat_Light;
        }
        m6563d();
        return this.f4559b;
    }

    public void setTheme(int i) {
        if (this.f4558a != i) {
            this.f4558a = i;
            m6563d();
        }
    }
}
