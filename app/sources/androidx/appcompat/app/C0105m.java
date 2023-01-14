package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0212d0;
import androidx.appcompat.widget.C0259p0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p027c.p028a.C1435a;
import p027c.p028a.C1440f;
import p027c.p028a.C1444j;
import p027c.p028a.p035o.C1465a;
import p027c.p028a.p035o.C1466b;
import p027c.p028a.p035o.C1473g;
import p027c.p028a.p035o.C1476h;
import p027c.p064i.p072j.C1906a0;
import p027c.p064i.p072j.C1910b0;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2008y;
import p027c.p064i.p072j.C2012z;

/* renamed from: androidx.appcompat.app.m */
public class C0105m extends C0058a implements ActionBarOverlayLayout.C0154d {

    /* renamed from: a */
    private static final Interpolator f363a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f364b = new DecelerateInterpolator();

    /* renamed from: A */
    C1476h f365A;

    /* renamed from: B */
    private boolean f366B;

    /* renamed from: C */
    boolean f367C;

    /* renamed from: D */
    final C2012z f368D = new C0106a();

    /* renamed from: E */
    final C2012z f369E = new C0107b();

    /* renamed from: F */
    final C1910b0 f370F = new C0108c();

    /* renamed from: c */
    Context f371c;

    /* renamed from: d */
    private Context f372d;

    /* renamed from: e */
    private Activity f373e;

    /* renamed from: f */
    ActionBarOverlayLayout f374f;

    /* renamed from: g */
    ActionBarContainer f375g;

    /* renamed from: h */
    C0212d0 f376h;

    /* renamed from: i */
    ActionBarContextView f377i;

    /* renamed from: j */
    View f378j;

    /* renamed from: k */
    C0259p0 f379k;

    /* renamed from: l */
    private ArrayList<?> f380l = new ArrayList<>();

    /* renamed from: m */
    private int f381m = -1;

    /* renamed from: n */
    private boolean f382n;

    /* renamed from: o */
    C0109d f383o;

    /* renamed from: p */
    C1466b f384p;

    /* renamed from: q */
    C1466b.C1467a f385q;

    /* renamed from: r */
    private boolean f386r;

    /* renamed from: s */
    private ArrayList<C0058a.C0060b> f387s = new ArrayList<>();

    /* renamed from: t */
    private boolean f388t;

    /* renamed from: u */
    private int f389u = 0;

    /* renamed from: v */
    boolean f390v = true;

    /* renamed from: w */
    boolean f391w;

    /* renamed from: x */
    boolean f392x;

    /* renamed from: y */
    private boolean f393y;

    /* renamed from: z */
    private boolean f394z = true;

    /* renamed from: androidx.appcompat.app.m$a */
    class C0106a extends C1906a0 {
        C0106a() {
        }

        /* renamed from: b */
        public void mo324b(View view) {
            View view2;
            C0105m mVar = C0105m.this;
            if (mVar.f390v && (view2 = mVar.f378j) != null) {
                view2.setTranslationY(0.0f);
                C0105m.this.f375g.setTranslationY(0.0f);
            }
            C0105m.this.f375g.setVisibility(8);
            C0105m.this.f375g.setTransitioning(false);
            C0105m mVar2 = C0105m.this;
            mVar2.f365A = null;
            mVar2.mo395B();
            ActionBarOverlayLayout actionBarOverlayLayout = C0105m.this.f374f;
            if (actionBarOverlayLayout != null) {
                C1988t.m8388j0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    class C0107b extends C1906a0 {
        C0107b() {
        }

        /* renamed from: b */
        public void mo324b(View view) {
            C0105m mVar = C0105m.this;
            mVar.f365A = null;
            mVar.f375g.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    class C0108c implements C1910b0 {
        C0108c() {
        }

        /* renamed from: a */
        public void mo410a(View view) {
            ((View) C0105m.this.f375g.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    public class C0109d extends C1466b implements C0124g.C0125a {

        /* renamed from: p */
        private final Context f398p;

        /* renamed from: q */
        private final C0124g f399q;

        /* renamed from: r */
        private C1466b.C1467a f400r;

        /* renamed from: s */
        private WeakReference<View> f401s;

        public C0109d(Context context, C1466b.C1467a aVar) {
            this.f398p = context;
            this.f400r = aVar;
            C0124g S = new C0124g(context).mo601S(1);
            this.f399q = S;
            S.mo600R(this);
        }

        /* renamed from: a */
        public boolean mo299a(C0124g gVar, MenuItem menuItem) {
            C1466b.C1467a aVar = this.f400r;
            if (aVar != null) {
                return aVar.mo331d(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo301b(C0124g gVar) {
            if (this.f400r != null) {
                mo417k();
                C0105m.this.f377i.mo885l();
            }
        }

        /* renamed from: c */
        public void mo411c() {
            C0105m mVar = C0105m.this;
            if (mVar.f383o == this) {
                if (!C0105m.m456A(mVar.f391w, mVar.f392x, false)) {
                    C0105m mVar2 = C0105m.this;
                    mVar2.f384p = this;
                    mVar2.f385q = this.f400r;
                } else {
                    this.f400r.mo328a(this);
                }
                this.f400r = null;
                C0105m.this.mo409z(false);
                C0105m.this.f377i.mo875g();
                C0105m.this.f376h.mo1305r().sendAccessibilityEvent(32);
                C0105m mVar3 = C0105m.this;
                mVar3.f374f.setHideOnContentScrollEnabled(mVar3.f367C);
                C0105m.this.f383o = null;
            }
        }

        /* renamed from: d */
        public View mo412d() {
            WeakReference<View> weakReference = this.f401s;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public Menu mo413e() {
            return this.f399q;
        }

        /* renamed from: f */
        public MenuInflater mo414f() {
            return new C1473g(this.f398p);
        }

        /* renamed from: g */
        public CharSequence mo415g() {
            return C0105m.this.f377i.getSubtitle();
        }

        /* renamed from: i */
        public CharSequence mo416i() {
            return C0105m.this.f377i.getTitle();
        }

        /* renamed from: k */
        public void mo417k() {
            if (C0105m.this.f383o == this) {
                this.f399q.mo626d0();
                try {
                    this.f400r.mo330c(this, this.f399q);
                } finally {
                    this.f399q.mo621c0();
                }
            }
        }

        /* renamed from: l */
        public boolean mo418l() {
            return C0105m.this.f377i.mo883j();
        }

        /* renamed from: m */
        public void mo419m(View view) {
            C0105m.this.f377i.setCustomView(view);
            this.f401s = new WeakReference<>(view);
        }

        /* renamed from: n */
        public void mo420n(int i) {
            mo421o(C0105m.this.f371c.getResources().getString(i));
        }

        /* renamed from: o */
        public void mo421o(CharSequence charSequence) {
            C0105m.this.f377i.setSubtitle(charSequence);
        }

        /* renamed from: q */
        public void mo422q(int i) {
            mo423r(C0105m.this.f371c.getResources().getString(i));
        }

        /* renamed from: r */
        public void mo423r(CharSequence charSequence) {
            C0105m.this.f377i.setTitle(charSequence);
        }

        /* renamed from: s */
        public void mo424s(boolean z) {
            super.mo424s(z);
            C0105m.this.f377i.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo425t() {
            this.f399q.mo626d0();
            try {
                return this.f400r.mo329b(this, this.f399q);
            } finally {
                this.f399q.mo621c0();
            }
        }
    }

    public C0105m(Activity activity, boolean z) {
        this.f373e = activity;
        View decorView = activity.getWindow().getDecorView();
        m459H(decorView);
        if (!z) {
            this.f378j = decorView.findViewById(16908290);
        }
    }

    public C0105m(Dialog dialog) {
        m459H(dialog.getWindow().getDecorView());
    }

    /* renamed from: A */
    static boolean m456A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: E */
    private C0212d0 m457E(View view) {
        if (view instanceof C0212d0) {
            return (C0212d0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: G */
    private void m458G() {
        if (this.f393y) {
            this.f393y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f374f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m463P(false);
        }
    }

    /* renamed from: H */
    private void m459H(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1440f.decor_content_parent);
        this.f374f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f376h = m457E(view.findViewById(C1440f.action_bar));
        this.f377i = (ActionBarContextView) view.findViewById(C1440f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1440f.action_bar_container);
        this.f375g = actionBarContainer;
        C0212d0 d0Var = this.f376h;
        if (d0Var == null || this.f377i == null || actionBarContainer == null) {
            throw new IllegalStateException(C0105m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f371c = d0Var.mo1286a();
        boolean z = (this.f376h.mo1313t() & 4) != 0;
        if (z) {
            this.f382n = true;
        }
        C1465a b = C1465a.m6531b(this.f371c);
        mo402M(b.mo5444a() || z);
        m460K(b.mo5449g());
        TypedArray obtainStyledAttributes = this.f371c.obtainStyledAttributes((AttributeSet) null, C1444j.f4329a, C1435a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1444j.f4379k, false)) {
            mo401L(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1444j.f4369i, 0);
        if (dimensionPixelSize != 0) {
            mo400J((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: K */
    private void m460K(boolean z) {
        this.f388t = z;
        if (!z) {
            this.f376h.mo1297j((C0259p0) null);
            this.f375g.setTabContainer(this.f379k);
        } else {
            this.f375g.setTabContainer((C0259p0) null);
            this.f376h.mo1297j(this.f379k);
        }
        boolean z2 = true;
        boolean z3 = mo398F() == 2;
        C0259p0 p0Var = this.f379k;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f374f;
                if (actionBarOverlayLayout != null) {
                    C1988t.m8388j0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f376h.mo1317x(!this.f388t && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f374f;
        if (this.f388t || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: N */
    private boolean m461N() {
        return C1988t.m8361S(this.f375g);
    }

    /* renamed from: O */
    private void m462O() {
        if (!this.f393y) {
            this.f393y = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f374f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m463P(false);
        }
    }

    /* renamed from: P */
    private void m463P(boolean z) {
        if (m456A(this.f391w, this.f392x, this.f393y)) {
            if (!this.f394z) {
                this.f394z = true;
                mo397D(z);
            }
        } else if (this.f394z) {
            this.f394z = false;
            mo396C(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo395B() {
        C1466b.C1467a aVar = this.f385q;
        if (aVar != null) {
            aVar.mo328a(this.f384p);
            this.f384p = null;
            this.f385q = null;
        }
    }

    /* renamed from: C */
    public void mo396C(boolean z) {
        View view;
        C1476h hVar = this.f365A;
        if (hVar != null) {
            hVar.mo5490a();
        }
        if (this.f389u != 0 || (!this.f366B && !z)) {
            this.f368D.mo324b((View) null);
            return;
        }
        this.f375g.setAlpha(1.0f);
        this.f375g.setTransitioning(true);
        C1476h hVar2 = new C1476h();
        float f = (float) (-this.f375g.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f375g.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C2008y k = C1988t.m8373c(this.f375g).mo6705k(f);
        k.mo6703i(this.f370F);
        hVar2.mo5492c(k);
        if (this.f390v && (view = this.f378j) != null) {
            hVar2.mo5492c(C1988t.m8373c(view).mo6705k(f));
        }
        hVar2.mo5495f(f363a);
        hVar2.mo5494e(250);
        hVar2.mo5496g(this.f368D);
        this.f365A = hVar2;
        hVar2.mo5497h();
    }

    /* renamed from: D */
    public void mo397D(boolean z) {
        View view;
        View view2;
        C1476h hVar = this.f365A;
        if (hVar != null) {
            hVar.mo5490a();
        }
        this.f375g.setVisibility(0);
        if (this.f389u != 0 || (!this.f366B && !z)) {
            this.f375g.setAlpha(1.0f);
            this.f375g.setTranslationY(0.0f);
            if (this.f390v && (view = this.f378j) != null) {
                view.setTranslationY(0.0f);
            }
            this.f369E.mo324b((View) null);
        } else {
            this.f375g.setTranslationY(0.0f);
            float f = (float) (-this.f375g.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f375g.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f375g.setTranslationY(f);
            C1476h hVar2 = new C1476h();
            C2008y k = C1988t.m8373c(this.f375g).mo6705k(0.0f);
            k.mo6703i(this.f370F);
            hVar2.mo5492c(k);
            if (this.f390v && (view2 = this.f378j) != null) {
                view2.setTranslationY(f);
                hVar2.mo5492c(C1988t.m8373c(this.f378j).mo6705k(0.0f));
            }
            hVar2.mo5495f(f364b);
            hVar2.mo5494e(250);
            hVar2.mo5496g(this.f369E);
            this.f365A = hVar2;
            hVar2.mo5497h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f374f;
        if (actionBarOverlayLayout != null) {
            C1988t.m8388j0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public int mo398F() {
        return this.f376h.mo1302o();
    }

    /* renamed from: I */
    public void mo399I(int i, int i2) {
        int t = this.f376h.mo1313t();
        if ((i2 & 4) != 0) {
            this.f382n = true;
        }
        this.f376h.mo1299l((i & i2) | ((~i2) & t));
    }

    /* renamed from: J */
    public void mo400J(float f) {
        C1988t.m8408t0(this.f375g, f);
    }

    /* renamed from: L */
    public void mo401L(boolean z) {
        if (!z || this.f374f.mo954w()) {
            this.f367C = z;
            this.f374f.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: M */
    public void mo402M(boolean z) {
        this.f376h.mo1306s(z);
    }

    /* renamed from: a */
    public void mo403a() {
        if (this.f392x) {
            this.f392x = false;
            m463P(true);
        }
    }

    /* renamed from: b */
    public void mo404b() {
    }

    /* renamed from: c */
    public void mo405c(boolean z) {
        this.f390v = z;
    }

    /* renamed from: d */
    public void mo406d() {
        if (!this.f392x) {
            this.f392x = true;
            m463P(true);
        }
    }

    /* renamed from: e */
    public void mo407e() {
        C1476h hVar = this.f365A;
        if (hVar != null) {
            hVar.mo5490a();
            this.f365A = null;
        }
    }

    /* renamed from: f */
    public void mo408f(int i) {
        this.f389u = i;
    }

    /* renamed from: h */
    public boolean mo183h() {
        C0212d0 d0Var = this.f376h;
        if (d0Var == null || !d0Var.mo1298k()) {
            return false;
        }
        this.f376h.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo184i(boolean z) {
        if (z != this.f386r) {
            this.f386r = z;
            int size = this.f387s.size();
            for (int i = 0; i < size; i++) {
                this.f387s.get(i).mo201a(z);
            }
        }
    }

    /* renamed from: j */
    public int mo185j() {
        return this.f376h.mo1313t();
    }

    /* renamed from: k */
    public Context mo186k() {
        if (this.f372d == null) {
            TypedValue typedValue = new TypedValue();
            this.f371c.getTheme().resolveAttribute(C1435a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f372d = new ContextThemeWrapper(this.f371c, i);
            } else {
                this.f372d = this.f371c;
            }
        }
        return this.f372d;
    }

    /* renamed from: m */
    public void mo188m(Configuration configuration) {
        m460K(C1465a.m6531b(this.f371c).mo5449g());
    }

    /* renamed from: o */
    public boolean mo190o(int i, KeyEvent keyEvent) {
        Menu e;
        C0109d dVar = this.f383o;
        if (dVar == null || (e = dVar.mo413e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: r */
    public void mo193r(boolean z) {
        if (!this.f382n) {
            mo194s(z);
        }
    }

    /* renamed from: s */
    public void mo194s(boolean z) {
        mo399I(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo195t(boolean z) {
        mo399I(z ? 8 : 0, 8);
    }

    /* renamed from: u */
    public void mo196u(Drawable drawable) {
        this.f376h.mo1316w(drawable);
    }

    /* renamed from: v */
    public void mo197v(boolean z) {
        C1476h hVar;
        this.f366B = z;
        if (!z && (hVar = this.f365A) != null) {
            hVar.mo5490a();
        }
    }

    /* renamed from: w */
    public void mo198w(CharSequence charSequence) {
        this.f376h.setTitle(charSequence);
    }

    /* renamed from: x */
    public void mo199x(CharSequence charSequence) {
        this.f376h.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public C1466b mo200y(C1466b.C1467a aVar) {
        C0109d dVar = this.f383o;
        if (dVar != null) {
            dVar.mo411c();
        }
        this.f374f.setHideOnContentScrollEnabled(false);
        this.f377i.mo884k();
        C0109d dVar2 = new C0109d(this.f377i.getContext(), aVar);
        if (!dVar2.mo425t()) {
            return null;
        }
        this.f383o = dVar2;
        dVar2.mo417k();
        this.f377i.mo882h(dVar2);
        mo409z(true);
        this.f377i.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: z */
    public void mo409z(boolean z) {
        C2008y yVar;
        C2008y yVar2;
        if (z) {
            m462O();
        } else {
            m458G();
        }
        if (m461N()) {
            if (z) {
                yVar = this.f376h.mo1303p(4, 100);
                yVar2 = this.f377i.mo874f(0, 200);
            } else {
                yVar2 = this.f376h.mo1303p(0, 200);
                yVar = this.f377i.mo874f(8, 100);
            }
            C1476h hVar = new C1476h();
            hVar.mo5493d(yVar, yVar2);
            hVar.mo5497h();
        } else if (z) {
            this.f376h.setVisibility(4);
            this.f377i.setVisibility(0);
        } else {
            this.f376h.setVisibility(0);
            this.f377i.setVisibility(8);
        }
    }
}
