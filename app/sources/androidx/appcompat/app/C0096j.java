package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.widget.C0212d0;
import androidx.appcompat.widget.C0295y0;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p027c.p028a.p035o.C1478i;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.appcompat.app.j */
class C0096j extends C0058a {

    /* renamed from: a */
    C0212d0 f335a;

    /* renamed from: b */
    boolean f336b;

    /* renamed from: c */
    Window.Callback f337c;

    /* renamed from: d */
    private boolean f338d;

    /* renamed from: e */
    private boolean f339e;

    /* renamed from: f */
    private ArrayList<C0058a.C0060b> f340f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f341g = new C0097a();

    /* renamed from: h */
    private final Toolbar.C0185f f342h;

    /* renamed from: androidx.appcompat.app.j$a */
    class C0097a implements Runnable {
        C0097a() {
        }

        public void run() {
            C0096j.this.mo388B();
        }
    }

    /* renamed from: androidx.appcompat.app.j$b */
    class C0098b implements Toolbar.C0185f {
        C0098b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0096j.this.f337c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.j$c */
    private final class C0099c implements C0139m.C0140a {

        /* renamed from: f */
        private boolean f345f;

        C0099c() {
        }

        /* renamed from: c */
        public void mo326c(C0124g gVar, boolean z) {
            if (!this.f345f) {
                this.f345f = true;
                C0096j.this.f335a.mo1296i();
                Window.Callback callback = C0096j.this.f337c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f345f = false;
            }
        }

        /* renamed from: d */
        public boolean mo327d(C0124g gVar) {
            Window.Callback callback = C0096j.this.f337c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.j$d */
    private final class C0100d implements C0124g.C0125a {
        C0100d() {
        }

        /* renamed from: a */
        public boolean mo299a(C0124g gVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public void mo301b(C0124g gVar) {
            C0096j jVar = C0096j.this;
            if (jVar.f337c == null) {
                return;
            }
            if (jVar.f335a.mo1288c()) {
                C0096j.this.f337c.onPanelClosed(108, gVar);
            } else if (C0096j.this.f337c.onPreparePanel(0, (View) null, gVar)) {
                C0096j.this.f337c.onMenuOpened(108, gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.j$e */
    private class C0101e extends C1478i {
        public C0101e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            return i == 0 ? new View(C0096j.this.f335a.mo1286a()) : super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0096j jVar = C0096j.this;
                if (!jVar.f336b) {
                    jVar.f335a.mo1290d();
                    C0096j.this.f336b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0096j(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0098b bVar = new C0098b();
        this.f342h = bVar;
        this.f335a = new C0295y0(toolbar, false);
        C0101e eVar = new C0101e(callback);
        this.f337c = eVar;
        this.f335a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f335a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    private Menu m422z() {
        if (!this.f338d) {
            this.f335a.mo1304q(new C0099c(), new C0100d());
            this.f338d = true;
        }
        return this.f335a.mo1300m();
    }

    /* renamed from: A */
    public Window.Callback mo387A() {
        return this.f337c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo388B() {
        Menu z = m422z();
        C0124g gVar = z instanceof C0124g ? (C0124g) z : null;
        if (gVar != null) {
            gVar.mo626d0();
        }
        try {
            z.clear();
            if (!this.f337c.onCreatePanelMenu(0, z) || !this.f337c.onPreparePanel(0, (View) null, z)) {
                z.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo621c0();
            }
        }
    }

    /* renamed from: C */
    public void mo389C(int i, int i2) {
        this.f335a.mo1299l((i & i2) | ((~i2) & this.f335a.mo1313t()));
    }

    /* renamed from: g */
    public boolean mo182g() {
        return this.f335a.mo1293g();
    }

    /* renamed from: h */
    public boolean mo183h() {
        if (!this.f335a.mo1298k()) {
            return false;
        }
        this.f335a.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo184i(boolean z) {
        if (z != this.f339e) {
            this.f339e = z;
            int size = this.f340f.size();
            for (int i = 0; i < size; i++) {
                this.f340f.get(i).mo201a(z);
            }
        }
    }

    /* renamed from: j */
    public int mo185j() {
        return this.f335a.mo1313t();
    }

    /* renamed from: k */
    public Context mo186k() {
        return this.f335a.mo1286a();
    }

    /* renamed from: l */
    public boolean mo187l() {
        this.f335a.mo1305r().removeCallbacks(this.f341g);
        C1988t.m8378e0(this.f335a.mo1305r(), this.f341g);
        return true;
    }

    /* renamed from: m */
    public void mo188m(Configuration configuration) {
        super.mo188m(configuration);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo189n() {
        this.f335a.mo1305r().removeCallbacks(this.f341g);
    }

    /* renamed from: o */
    public boolean mo190o(int i, KeyEvent keyEvent) {
        Menu z = m422z();
        if (z == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z2 = false;
        }
        z.setQwertyMode(z2);
        return z.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: p */
    public boolean mo191p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo192q();
        }
        return true;
    }

    /* renamed from: q */
    public boolean mo192q() {
        return this.f335a.mo1295h();
    }

    /* renamed from: r */
    public void mo193r(boolean z) {
    }

    /* renamed from: s */
    public void mo194s(boolean z) {
        mo389C(z ? 4 : 0, 4);
    }

    /* renamed from: t */
    public void mo195t(boolean z) {
        mo389C(z ? 8 : 0, 8);
    }

    /* renamed from: u */
    public void mo196u(Drawable drawable) {
        this.f335a.mo1316w(drawable);
    }

    /* renamed from: v */
    public void mo197v(boolean z) {
    }

    /* renamed from: w */
    public void mo198w(CharSequence charSequence) {
        this.f335a.setTitle(charSequence);
    }

    /* renamed from: x */
    public void mo199x(CharSequence charSequence) {
        this.f335a.setWindowTitle(charSequence);
    }
}
