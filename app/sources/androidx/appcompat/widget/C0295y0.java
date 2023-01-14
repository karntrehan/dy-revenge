package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0112a;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.widget.Toolbar;
import p027c.p028a.C1435a;
import p027c.p028a.C1439e;
import p027c.p028a.C1440f;
import p027c.p028a.C1442h;
import p027c.p028a.C1444j;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p072j.C1906a0;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2008y;

/* renamed from: androidx.appcompat.widget.y0 */
public class C0295y0 implements C0212d0 {

    /* renamed from: a */
    Toolbar f1264a;

    /* renamed from: b */
    private int f1265b;

    /* renamed from: c */
    private View f1266c;

    /* renamed from: d */
    private View f1267d;

    /* renamed from: e */
    private Drawable f1268e;

    /* renamed from: f */
    private Drawable f1269f;

    /* renamed from: g */
    private Drawable f1270g;

    /* renamed from: h */
    private boolean f1271h;

    /* renamed from: i */
    CharSequence f1272i;

    /* renamed from: j */
    private CharSequence f1273j;

    /* renamed from: k */
    private CharSequence f1274k;

    /* renamed from: l */
    Window.Callback f1275l;

    /* renamed from: m */
    boolean f1276m;

    /* renamed from: n */
    private C0201c f1277n;

    /* renamed from: o */
    private int f1278o;

    /* renamed from: p */
    private int f1279p;

    /* renamed from: q */
    private Drawable f1280q;

    /* renamed from: androidx.appcompat.widget.y0$a */
    class C0296a implements View.OnClickListener {

        /* renamed from: f */
        final C0112a f1281f;

        C0296a() {
            this.f1281f = new C0112a(C0295y0.this.f1264a.getContext(), 0, 16908332, 0, 0, C0295y0.this.f1272i);
        }

        public void onClick(View view) {
            C0295y0 y0Var = C0295y0.this;
            Window.Callback callback = y0Var.f1275l;
            if (callback != null && y0Var.f1276m) {
                callback.onMenuItemSelected(0, this.f1281f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.y0$b */
    class C0297b extends C1906a0 {

        /* renamed from: a */
        private boolean f1283a = false;

        /* renamed from: b */
        final /* synthetic */ int f1284b;

        C0297b(int i) {
            this.f1284b = i;
        }

        /* renamed from: a */
        public void mo1224a(View view) {
            this.f1283a = true;
        }

        /* renamed from: b */
        public void mo324b(View view) {
            if (!this.f1283a) {
                C0295y0.this.f1264a.setVisibility(this.f1284b);
            }
        }

        /* renamed from: c */
        public void mo325c(View view) {
            C0295y0.this.f1264a.setVisibility(0);
        }
    }

    public C0295y0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C1442h.abc_action_bar_up_description, C1439e.abc_ic_ab_back_material);
    }

    public C0295y0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1278o = 0;
        this.f1279p = 0;
        this.f1264a = toolbar;
        this.f1272i = toolbar.getTitle();
        this.f1273j = toolbar.getSubtitle();
        this.f1271h = this.f1272i != null;
        this.f1270g = toolbar.getNavigationIcon();
        C0292x0 v = C0292x0.m1407v(toolbar.getContext(), (AttributeSet) null, C1444j.f4329a, C1435a.actionBarStyle, 0);
        this.f1280q = v.mo1790g(C1444j.f4384l);
        if (z) {
            CharSequence p = v.mo1799p(C1444j.f4414r);
            if (!TextUtils.isEmpty(p)) {
                setTitle(p);
            }
            CharSequence p2 = v.mo1799p(C1444j.f4404p);
            if (!TextUtils.isEmpty(p2)) {
                mo1832E(p2);
            }
            Drawable g = v.mo1790g(C1444j.f4394n);
            if (g != null) {
                mo1829B(g);
            }
            Drawable g2 = v.mo1790g(C1444j.f4389m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1270g == null && (drawable = this.f1280q) != null) {
                mo1316w(drawable);
            }
            mo1299l(v.mo1794k(C1444j.f4364h, 0));
            int n = v.mo1797n(C1444j.f4359g, 0);
            if (n != 0) {
                mo1833z(LayoutInflater.from(this.f1264a.getContext()).inflate(n, this.f1264a, false));
                mo1299l(this.f1265b | 16);
            }
            int m = v.mo1796m(C1444j.f4374j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1264a.getLayoutParams();
                layoutParams.height = m;
                this.f1264a.setLayoutParams(layoutParams);
            }
            int e = v.mo1788e(C1444j.f4354f, -1);
            int e2 = v.mo1788e(C1444j.f4349e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1264a.mo1108H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo1797n(C1444j.f4419s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1264a;
                toolbar2.mo1112L(toolbar2.getContext(), n2);
            }
            int n3 = v.mo1797n(C1444j.f4409q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1264a;
                toolbar3.mo1111K(toolbar3.getContext(), n3);
            }
            int n4 = v.mo1797n(C1444j.f4399o, 0);
            if (n4 != 0) {
                this.f1264a.setPopupTheme(n4);
            }
        } else {
            this.f1265b = m1462y();
        }
        v.mo1803w();
        mo1828A(i);
        this.f1274k = this.f1264a.getNavigationContentDescription();
        this.f1264a.setNavigationOnClickListener(new C0296a());
    }

    /* renamed from: F */
    private void m1458F(CharSequence charSequence) {
        this.f1272i = charSequence;
        if ((this.f1265b & 8) != 0) {
            this.f1264a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m1459G() {
        if ((this.f1265b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1274k)) {
            this.f1264a.setNavigationContentDescription(this.f1279p);
        } else {
            this.f1264a.setNavigationContentDescription(this.f1274k);
        }
    }

    /* renamed from: H */
    private void m1460H() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1265b & 4) != 0) {
            toolbar = this.f1264a;
            drawable = this.f1270g;
            if (drawable == null) {
                drawable = this.f1280q;
            }
        } else {
            toolbar = this.f1264a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: I */
    private void m1461I() {
        Drawable drawable;
        int i = this.f1265b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1269f) == null) {
            drawable = this.f1268e;
        }
        this.f1264a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m1462y() {
        if (this.f1264a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1280q = this.f1264a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo1828A(int i) {
        if (i != this.f1279p) {
            this.f1279p = i;
            if (TextUtils.isEmpty(this.f1264a.getNavigationContentDescription())) {
                mo1830C(this.f1279p);
            }
        }
    }

    /* renamed from: B */
    public void mo1829B(Drawable drawable) {
        this.f1269f = drawable;
        m1461I();
    }

    /* renamed from: C */
    public void mo1830C(int i) {
        mo1831D(i == 0 ? null : mo1286a().getString(i));
    }

    /* renamed from: D */
    public void mo1831D(CharSequence charSequence) {
        this.f1274k = charSequence;
        m1459G();
    }

    /* renamed from: E */
    public void mo1832E(CharSequence charSequence) {
        this.f1273j = charSequence;
        if ((this.f1265b & 8) != 0) {
            this.f1264a.setSubtitle(charSequence);
        }
    }

    /* renamed from: a */
    public Context mo1286a() {
        return this.f1264a.getContext();
    }

    /* renamed from: b */
    public void mo1287b(Menu menu, C0139m.C0140a aVar) {
        if (this.f1277n == null) {
            C0201c cVar = new C0201c(this.f1264a.getContext());
            this.f1277n = cVar;
            cVar.mo536p(C1440f.action_menu_presenter);
        }
        this.f1277n.mo528h(aVar);
        this.f1264a.mo1109I((C0124g) menu, this.f1277n);
    }

    /* renamed from: c */
    public boolean mo1288c() {
        return this.f1264a.mo1106A();
    }

    public void collapseActionView() {
        this.f1264a.mo1117e();
    }

    /* renamed from: d */
    public void mo1290d() {
        this.f1276m = true;
    }

    /* renamed from: e */
    public boolean mo1291e() {
        return this.f1264a.mo1116d();
    }

    /* renamed from: f */
    public boolean mo1292f() {
        return this.f1264a.mo1198z();
    }

    /* renamed from: g */
    public boolean mo1293g() {
        return this.f1264a.mo1196w();
    }

    public CharSequence getTitle() {
        return this.f1264a.getTitle();
    }

    /* renamed from: h */
    public boolean mo1295h() {
        return this.f1264a.mo1113O();
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f1264a.mo1118f();
    }

    /* renamed from: j */
    public void mo1297j(C0259p0 p0Var) {
        Toolbar toolbar;
        View view = this.f1266c;
        if (view != null && view.getParent() == (toolbar = this.f1264a)) {
            toolbar.removeView(this.f1266c);
        }
        this.f1266c = p0Var;
        if (p0Var != null && this.f1278o == 2) {
            this.f1264a.addView(p0Var, 0);
            Toolbar.C0184e eVar = (Toolbar.C0184e) this.f1266c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f215a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: k */
    public boolean mo1298k() {
        return this.f1264a.mo1195v();
    }

    /* renamed from: l */
    public void mo1299l(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1265b ^ i;
        this.f1265b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1459G();
                }
                m1460H();
            }
            if ((i2 & 3) != 0) {
                m1461I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1264a.setTitle(this.f1272i);
                    toolbar = this.f1264a;
                    charSequence = this.f1273j;
                } else {
                    charSequence = null;
                    this.f1264a.setTitle((CharSequence) null);
                    toolbar = this.f1264a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1267d) != null) {
                if ((i & 16) != 0) {
                    this.f1264a.addView(view);
                } else {
                    this.f1264a.removeView(view);
                }
            }
        }
    }

    /* renamed from: m */
    public Menu mo1300m() {
        return this.f1264a.getMenu();
    }

    /* renamed from: n */
    public void mo1301n(int i) {
        mo1829B(i != 0 ? C1445a.m6446d(mo1286a(), i) : null);
    }

    /* renamed from: o */
    public int mo1302o() {
        return this.f1278o;
    }

    /* renamed from: p */
    public C2008y mo1303p(int i, long j) {
        return C1988t.m8373c(this.f1264a).mo6696a(i == 0 ? 1.0f : 0.0f).mo6699d(j).mo6701f(new C0297b(i));
    }

    /* renamed from: q */
    public void mo1304q(C0139m.C0140a aVar, C0124g.C0125a aVar2) {
        this.f1264a.mo1110J(aVar, aVar2);
    }

    /* renamed from: r */
    public ViewGroup mo1305r() {
        return this.f1264a;
    }

    /* renamed from: s */
    public void mo1306s(boolean z) {
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C1445a.m6446d(mo1286a(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1268e = drawable;
        m1461I();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1271h = true;
        m1458F(charSequence);
    }

    public void setVisibility(int i) {
        this.f1264a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1275l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1271h) {
            m1458F(charSequence);
        }
    }

    /* renamed from: t */
    public int mo1313t() {
        return this.f1265b;
    }

    /* renamed from: u */
    public void mo1314u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: v */
    public void mo1315v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: w */
    public void mo1316w(Drawable drawable) {
        this.f1270g = drawable;
        m1460H();
    }

    /* renamed from: x */
    public void mo1317x(boolean z) {
        this.f1264a.setCollapsible(z);
    }

    /* renamed from: z */
    public void mo1833z(View view) {
        View view2 = this.f1267d;
        if (!(view2 == null || (this.f1265b & 16) == 0)) {
            this.f1264a.removeView(view2);
        }
        this.f1267d = view;
        if (view != null && (this.f1265b & 16) != 0) {
            this.f1264a.addView(view);
        }
    }
}
