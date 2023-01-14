package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0121e;
import androidx.appcompat.view.menu.C0124g;
import androidx.appcompat.view.menu.C0139m;
import androidx.appcompat.view.menu.C0141n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0209c0;
import androidx.appcompat.widget.C0210c1;
import androidx.appcompat.widget.C0213d1;
import androidx.appcompat.widget.C0222g0;
import androidx.appcompat.widget.C0231j;
import androidx.appcompat.widget.C0292x0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C1115g;
import androidx.core.content.C1135a;
import androidx.core.content.p022d.C1154f;
import androidx.core.util.C1173d;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1291g;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p027c.p028a.C1435a;
import p027c.p028a.C1437c;
import p027c.p028a.C1440f;
import p027c.p028a.C1441g;
import p027c.p028a.C1443i;
import p027c.p028a.C1444j;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p028a.p035o.C1466b;
import p027c.p028a.p035o.C1469d;
import p027c.p028a.p035o.C1471f;
import p027c.p028a.p035o.C1473g;
import p027c.p028a.p035o.C1478i;
import p027c.p060f.C1801g;
import p027c.p064i.p072j.C1906a0;
import p027c.p064i.p072j.C1927e;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1944f;
import p027c.p064i.p072j.C1984p;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.C2008y;
import p027c.p064i.p072j.C2012z;

/* renamed from: androidx.appcompat.app.f */
class C0067f extends C0066e implements C0124g.C0125a, LayoutInflater.Factory2 {

    /* renamed from: q */
    private static final C1801g<String, Integer> f224q = new C1801g<>();

    /* renamed from: r */
    private static final boolean f225r;

    /* renamed from: s */
    private static final int[] f226s = {16842836};

    /* renamed from: t */
    private static final boolean f227t = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: u */
    private static final boolean f228u;

    /* renamed from: v */
    private static boolean f229v = true;

    /* renamed from: A */
    final C0065d f230A;

    /* renamed from: B */
    C0058a f231B;

    /* renamed from: C */
    MenuInflater f232C;

    /* renamed from: D */
    private CharSequence f233D;

    /* renamed from: E */
    private C0209c0 f234E;

    /* renamed from: F */
    private C0076h f235F;

    /* renamed from: G */
    private C0090t f236G;

    /* renamed from: H */
    C1466b f237H;

    /* renamed from: I */
    ActionBarContextView f238I;

    /* renamed from: J */
    PopupWindow f239J;

    /* renamed from: K */
    Runnable f240K;

    /* renamed from: L */
    C2008y f241L;

    /* renamed from: M */
    private boolean f242M;

    /* renamed from: N */
    private boolean f243N;

    /* renamed from: O */
    ViewGroup f244O;

    /* renamed from: P */
    private TextView f245P;

    /* renamed from: Q */
    private View f246Q;

    /* renamed from: R */
    private boolean f247R;

    /* renamed from: S */
    private boolean f248S;

    /* renamed from: T */
    boolean f249T;

    /* renamed from: U */
    boolean f250U;

    /* renamed from: V */
    boolean f251V;

    /* renamed from: W */
    boolean f252W;

    /* renamed from: X */
    boolean f253X;

    /* renamed from: Y */
    private boolean f254Y;

    /* renamed from: Z */
    private C0089s[] f255Z;

    /* renamed from: a0 */
    private C0089s f256a0;

    /* renamed from: b0 */
    private boolean f257b0;

    /* renamed from: c0 */
    private boolean f258c0;

    /* renamed from: d0 */
    private boolean f259d0;

    /* renamed from: e0 */
    private boolean f260e0;

    /* renamed from: f0 */
    boolean f261f0;

    /* renamed from: g0 */
    private int f262g0;

    /* renamed from: h0 */
    private int f263h0;

    /* renamed from: i0 */
    private boolean f264i0;

    /* renamed from: j0 */
    private boolean f265j0;

    /* renamed from: k0 */
    private C0081l f266k0;

    /* renamed from: l0 */
    private C0081l f267l0;

    /* renamed from: m0 */
    boolean f268m0;

    /* renamed from: n0 */
    int f269n0;

    /* renamed from: o0 */
    private final Runnable f270o0;

    /* renamed from: p0 */
    private boolean f271p0;

    /* renamed from: q0 */
    private Rect f272q0;

    /* renamed from: r0 */
    private Rect f273r0;

    /* renamed from: s0 */
    private C0093h f274s0;

    /* renamed from: w */
    final Object f275w;

    /* renamed from: x */
    final Context f276x;

    /* renamed from: y */
    Window f277y;

    /* renamed from: z */
    private C0079j f278z;

    /* renamed from: androidx.appcompat.app.f$a */
    class C0068a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f279a;

        C0068a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f279a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m370a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m370a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f279a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f279a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.f$b */
    class C0069b implements Runnable {
        C0069b() {
        }

        public void run() {
            C0067f fVar = C0067f.this;
            if ((fVar.f269n0 & 1) != 0) {
                fVar.mo297W(0);
            }
            C0067f fVar2 = C0067f.this;
            if ((fVar2.f269n0 & 4096) != 0) {
                fVar2.mo297W(108);
            }
            C0067f fVar3 = C0067f.this;
            fVar3.f268m0 = false;
            fVar3.f269n0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.f$c */
    class C0070c implements C1984p {
        C0070c() {
        }

        /* renamed from: a */
        public C1929e0 mo319a(View view, C1929e0 e0Var) {
            int k = e0Var.mo6492k();
            int N0 = C0067f.this.mo291N0(e0Var, (Rect) null);
            if (k != N0) {
                e0Var = e0Var.mo6495o(e0Var.mo6490i(), N0, e0Var.mo6491j(), e0Var.mo6488h());
            }
            return C1988t.m8368Z(view, e0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.f$d */
    class C0071d implements C0222g0.C0223a {
        C0071d() {
        }

        /* renamed from: a */
        public void mo320a(Rect rect) {
            rect.top = C0067f.this.mo291N0((C1929e0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.f$e */
    class C0072e implements ContentFrameLayout.C0161a {
        C0072e() {
        }

        /* renamed from: a */
        public void mo321a() {
        }

        public void onDetachedFromWindow() {
            C0067f.this.mo295U();
        }
    }

    /* renamed from: androidx.appcompat.app.f$f */
    class C0073f implements Runnable {

        /* renamed from: androidx.appcompat.app.f$f$a */
        class C0074a extends C1906a0 {
            C0074a() {
            }

            /* renamed from: b */
            public void mo324b(View view) {
                C0067f.this.f238I.setAlpha(1.0f);
                C0067f.this.f241L.mo6701f((C2012z) null);
                C0067f.this.f241L = null;
            }

            /* renamed from: c */
            public void mo325c(View view) {
                C0067f.this.f238I.setVisibility(0);
            }
        }

        C0073f() {
        }

        public void run() {
            C0067f fVar = C0067f.this;
            fVar.f239J.showAtLocation(fVar.f238I, 55, 0, 0);
            C0067f.this.mo298X();
            if (C0067f.this.mo285F0()) {
                C0067f.this.f238I.setAlpha(0.0f);
                C0067f fVar2 = C0067f.this;
                fVar2.f241L = C1988t.m8373c(fVar2.f238I).mo6696a(1.0f);
                C0067f.this.f241L.mo6701f(new C0074a());
                return;
            }
            C0067f.this.f238I.setAlpha(1.0f);
            C0067f.this.f238I.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.f$g */
    class C0075g extends C1906a0 {
        C0075g() {
        }

        /* renamed from: b */
        public void mo324b(View view) {
            C0067f.this.f238I.setAlpha(1.0f);
            C0067f.this.f241L.mo6701f((C2012z) null);
            C0067f.this.f241L = null;
        }

        /* renamed from: c */
        public void mo325c(View view) {
            C0067f.this.f238I.setVisibility(0);
            C0067f.this.f238I.sendAccessibilityEvent(32);
            if (C0067f.this.f238I.getParent() instanceof View) {
                C1988t.m8388j0((View) C0067f.this.f238I.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$h */
    private final class C0076h implements C0139m.C0140a {
        C0076h() {
        }

        /* renamed from: c */
        public void mo326c(C0124g gVar, boolean z) {
            C0067f.this.mo290N(gVar);
        }

        /* renamed from: d */
        public boolean mo327d(C0124g gVar) {
            Window.Callback h0 = C0067f.this.mo305h0();
            if (h0 == null) {
                return true;
            }
            h0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.f$i */
    class C0077i implements C1466b.C1467a {

        /* renamed from: a */
        private C1466b.C1467a f288a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        class C0078a extends C1906a0 {
            C0078a() {
            }

            /* renamed from: b */
            public void mo324b(View view) {
                C0067f.this.f238I.setVisibility(8);
                C0067f fVar = C0067f.this;
                PopupWindow popupWindow = fVar.f239J;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.f238I.getParent() instanceof View) {
                    C1988t.m8388j0((View) C0067f.this.f238I.getParent());
                }
                C0067f.this.f238I.removeAllViews();
                C0067f.this.f241L.mo6701f((C2012z) null);
                C0067f fVar2 = C0067f.this;
                fVar2.f241L = null;
                C1988t.m8388j0(fVar2.f244O);
            }
        }

        public C0077i(C1466b.C1467a aVar) {
            this.f288a = aVar;
        }

        /* renamed from: a */
        public void mo328a(C1466b bVar) {
            this.f288a.mo328a(bVar);
            C0067f fVar = C0067f.this;
            if (fVar.f239J != null) {
                fVar.f277y.getDecorView().removeCallbacks(C0067f.this.f240K);
            }
            C0067f fVar2 = C0067f.this;
            if (fVar2.f238I != null) {
                fVar2.mo298X();
                C0067f fVar3 = C0067f.this;
                fVar3.f241L = C1988t.m8373c(fVar3.f238I).mo6696a(0.0f);
                C0067f.this.f241L.mo6701f(new C0078a());
            }
            C0067f fVar4 = C0067f.this;
            C0065d dVar = fVar4.f230A;
            if (dVar != null) {
                dVar.mo235e(fVar4.f237H);
            }
            C0067f fVar5 = C0067f.this;
            fVar5.f237H = null;
            C1988t.m8388j0(fVar5.f244O);
        }

        /* renamed from: b */
        public boolean mo329b(C1466b bVar, Menu menu) {
            return this.f288a.mo329b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo330c(C1466b bVar, Menu menu) {
            C1988t.m8388j0(C0067f.this.f244O);
            return this.f288a.mo330c(bVar, menu);
        }

        /* renamed from: d */
        public boolean mo331d(C1466b bVar, MenuItem menuItem) {
            return this.f288a.mo331d(bVar, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.f$j */
    class C0079j extends C1478i {
        C0079j(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final ActionMode mo332b(ActionMode.Callback callback) {
            C1471f.C1472a aVar = new C1471f.C1472a(C0067f.this.f276x, callback);
            C1466b H0 = C0067f.this.mo287H0(aVar);
            if (H0 != null) {
                return aVar.mo5480e(H0);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0067f.this.mo296V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0067f.this.mo312t0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0124g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            C0067f.this.mo314w0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            C0067f.this.mo315x0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0124g gVar = menu instanceof C0124g ? (C0124g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo609a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo609a0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0124g gVar;
            C0089s f0 = C0067f.this.mo303f0(0, true);
            if (f0 == null || (gVar = f0.f309j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return C0067f.this.mo306o0() ? mo332b(callback) : super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (!C0067f.this.mo306o0() || i != 0) ? super.onWindowStartingActionMode(callback, i) : mo332b(callback);
        }
    }

    /* renamed from: androidx.appcompat.app.f$k */
    private class C0080k extends C0081l {

        /* renamed from: c */
        private final PowerManager f292c;

        C0080k(Context context) {
            super();
            this.f292c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo343b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo344c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f292c.isPowerSaveMode()) ? 1 : 2;
        }

        /* renamed from: d */
        public void mo345d() {
            C0067f.this.mo286H();
        }
    }

    /* renamed from: androidx.appcompat.app.f$l */
    abstract class C0081l {

        /* renamed from: a */
        private BroadcastReceiver f294a;

        /* renamed from: androidx.appcompat.app.f$l$a */
        class C0082a extends BroadcastReceiver {
            C0082a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0081l.this.mo345d();
            }
        }

        C0081l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo346a() {
            BroadcastReceiver broadcastReceiver = this.f294a;
            if (broadcastReceiver != null) {
                try {
                    C0067f.this.f276x.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f294a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo343b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo344c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo345d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo347e() {
            mo346a();
            IntentFilter b = mo343b();
            if (b != null && b.countActions() != 0) {
                if (this.f294a == null) {
                    this.f294a = new C0082a();
                }
                C0067f.this.f276x.registerReceiver(this.f294a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$m */
    private class C0083m extends C0081l {

        /* renamed from: c */
        private final C0103l f297c;

        C0083m(C0103l lVar) {
            super();
            this.f297c = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo343b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo344c() {
            return this.f297c.mo394d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo345d() {
            C0067f.this.mo286H();
        }
    }

    /* renamed from: androidx.appcompat.app.f$n */
    static class C0084n {
        /* renamed from: a */
        static void m397a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$o */
    static class C0085o {
        /* renamed from: a */
        static void m398a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$p */
    static class C0086p {
        /* renamed from: a */
        static void m399a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$q */
    private static class C0087q {
        /* renamed from: a */
        static void m400a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.f$r */
    private class C0088r extends ContentFrameLayout {
        public C0088r(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m401c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0067f.this.mo296V(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m401c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0067f.this.mo292P(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1445a.m6446d(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.f$s */
    protected static final class C0089s {

        /* renamed from: a */
        int f300a;

        /* renamed from: b */
        int f301b;

        /* renamed from: c */
        int f302c;

        /* renamed from: d */
        int f303d;

        /* renamed from: e */
        int f304e;

        /* renamed from: f */
        int f305f;

        /* renamed from: g */
        ViewGroup f306g;

        /* renamed from: h */
        View f307h;

        /* renamed from: i */
        View f308i;

        /* renamed from: j */
        C0124g f309j;

        /* renamed from: k */
        C0121e f310k;

        /* renamed from: l */
        Context f311l;

        /* renamed from: m */
        boolean f312m;

        /* renamed from: n */
        boolean f313n;

        /* renamed from: o */
        boolean f314o;

        /* renamed from: p */
        public boolean f315p;

        /* renamed from: q */
        boolean f316q = false;

        /* renamed from: r */
        boolean f317r;

        /* renamed from: s */
        Bundle f318s;

        C0089s(int i) {
            this.f300a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0141n mo352a(C0139m.C0140a aVar) {
            if (this.f309j == null) {
                return null;
            }
            if (this.f310k == null) {
                C0121e eVar = new C0121e(this.f311l, C1441g.abc_list_menu_item_layout);
                this.f310k = eVar;
                eVar.mo528h(aVar);
                this.f309j.mo619b(this.f310k);
            }
            return this.f310k.mo567b(this.f306g);
        }

        /* renamed from: b */
        public boolean mo353b() {
            if (this.f307h == null) {
                return false;
            }
            return this.f308i != null || this.f310k.mo566a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo354c(C0124g gVar) {
            C0121e eVar;
            C0124g gVar2 = this.f309j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo597O(this.f310k);
                }
                this.f309j = gVar;
                if (gVar != null && (eVar = this.f310k) != null) {
                    gVar.mo619b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo355d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C1435a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C1435a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = C1443i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i2, true);
            C1469d dVar = new C1469d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f311l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C1444j.f4455z0);
            this.f301b = obtainStyledAttributes.getResourceId(C1444j.f4211C0, 0);
            this.f305f = obtainStyledAttributes.getResourceId(C1444j.f4206B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.f$t */
    private final class C0090t implements C0139m.C0140a {
        C0090t() {
        }

        /* renamed from: c */
        public void mo326c(C0124g gVar, boolean z) {
            C0124g D = gVar.mo587D();
            boolean z2 = D != gVar;
            C0067f fVar = C0067f.this;
            if (z2) {
                gVar = D;
            }
            C0089s a0 = fVar.mo300a0(gVar);
            if (a0 == null) {
                return;
            }
            if (z2) {
                C0067f.this.mo289M(a0.f300a, a0, D);
                C0067f.this.mo293Q(a0, true);
                return;
            }
            C0067f.this.mo293Q(a0, z);
        }

        /* renamed from: d */
        public boolean mo327d(C0124g gVar) {
            Window.Callback h0;
            if (gVar != gVar.mo587D()) {
                return true;
            }
            C0067f fVar = C0067f.this;
            if (!fVar.f249T || (h0 = fVar.mo305h0()) == null || C0067f.this.f261f0) {
                return true;
            }
            h0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f225r = z2;
        if (i >= 17) {
            z = true;
        }
        f228u = z;
        if (z2 && !f229v) {
            Thread.setDefaultUncaughtExceptionHandler(new C0068a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    C0067f(Activity activity, C0065d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    C0067f(Dialog dialog, C0065d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f224q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C0067f(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0065d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f241L = r0
            r0 = 1
            r2.f242M = r0
            r0 = -100
            r2.f262g0 = r0
            androidx.appcompat.app.f$b r1 = new androidx.appcompat.app.f$b
            r1.<init>()
            r2.f270o0 = r1
            r2.f276x = r3
            r2.f230A = r5
            r2.f275w = r6
            int r3 = r2.f262g0
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.c r3 = r2.m294K0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r3.mo220A()
            int r3 = r3.mo270k()
            r2.f262g0 = r3
        L_0x0032:
            int r3 = r2.f262g0
            if (r3 != r0) goto L_0x0059
            c.f.g<java.lang.String, java.lang.Integer> r3 = f224q
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.f262g0 = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.m293K(r4)
        L_0x005e:
            androidx.appcompat.widget.C0231j.m1180h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    /* renamed from: B0 */
    private boolean m285B0(C0089s sVar, int i, KeyEvent keyEvent, int i2) {
        C0124g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f312m || m286C0(sVar, keyEvent)) && (gVar = sVar.f309j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f234E == null) {
            mo293Q(sVar, true);
        }
        return z;
    }

    /* renamed from: C0 */
    private boolean m286C0(C0089s sVar, KeyEvent keyEvent) {
        C0209c0 c0Var;
        C0209c0 c0Var2;
        C0209c0 c0Var3;
        if (this.f261f0) {
            return false;
        }
        if (sVar.f312m) {
            return true;
        }
        C0089s sVar2 = this.f256a0;
        if (!(sVar2 == null || sVar2 == sVar)) {
            mo293Q(sVar2, false);
        }
        Window.Callback h0 = mo305h0();
        if (h0 != null) {
            sVar.f308i = h0.onCreatePanelView(sVar.f300a);
        }
        int i = sVar.f300a;
        boolean z = i == 0 || i == 108;
        if (z && (c0Var3 = this.f234E) != null) {
            c0Var3.mo904d();
        }
        if (sVar.f308i == null && (!z || !(mo284A0() instanceof C0096j))) {
            C0124g gVar = sVar.f309j;
            if (gVar == null || sVar.f317r) {
                if (gVar == null && (!m310l0(sVar) || sVar.f309j == null)) {
                    return false;
                }
                if (z && this.f234E != null) {
                    if (this.f235F == null) {
                        this.f235F = new C0076h();
                    }
                    this.f234E.mo901b(sVar.f309j, this.f235F);
                }
                sVar.f309j.mo626d0();
                if (!h0.onCreatePanelMenu(sVar.f300a, sVar.f309j)) {
                    sVar.mo354c((C0124g) null);
                    if (z && (c0Var2 = this.f234E) != null) {
                        c0Var2.mo901b((Menu) null, this.f235F);
                    }
                    return false;
                }
                sVar.f317r = false;
            }
            sVar.f309j.mo626d0();
            Bundle bundle = sVar.f318s;
            if (bundle != null) {
                sVar.f309j.mo598P(bundle);
                sVar.f318s = null;
            }
            if (!h0.onPreparePanel(0, sVar.f308i, sVar.f309j)) {
                if (z && (c0Var = this.f234E) != null) {
                    c0Var.mo901b((Menu) null, this.f235F);
                }
                sVar.f309j.mo621c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f315p = z2;
            sVar.f309j.setQwertyMode(z2);
            sVar.f309j.mo621c0();
        }
        sVar.f312m = true;
        sVar.f313n = false;
        this.f256a0 = sVar;
        return true;
    }

    /* renamed from: D0 */
    private void m287D0(boolean z) {
        C0209c0 c0Var = this.f234E;
        if (c0Var == null || !c0Var.mo906e() || (ViewConfiguration.get(this.f276x).hasPermanentMenuKey() && !this.f234E.mo907f())) {
            C0089s f0 = mo303f0(0, true);
            f0.f316q = true;
            mo293Q(f0, false);
            m315z0(f0, (KeyEvent) null);
            return;
        }
        Window.Callback h0 = mo305h0();
        if (this.f234E.mo902c() && z) {
            this.f234E.mo909g();
            if (!this.f261f0) {
                h0.onPanelClosed(108, mo303f0(0, true).f309j);
            }
        } else if (h0 != null && !this.f261f0) {
            if (this.f268m0 && (this.f269n0 & 1) != 0) {
                this.f277y.getDecorView().removeCallbacks(this.f270o0);
                this.f270o0.run();
            }
            C0089s f02 = mo303f0(0, true);
            C0124g gVar = f02.f309j;
            if (gVar != null && !f02.f317r && h0.onPreparePanel(0, f02.f308i, gVar)) {
                h0.onMenuOpened(108, f02.f309j);
                this.f234E.mo916h();
            }
        }
    }

    /* renamed from: E0 */
    private int m288E0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: G0 */
    private boolean m289G0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f277y.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1988t.m8359Q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: I */
    private boolean m290I(boolean z) {
        if (this.f261f0) {
            return false;
        }
        int L = m295L();
        boolean L0 = m296L0(mo309p0(this.f276x, L), z);
        if (L == 0) {
            m306e0(this.f276x).mo347e();
        } else {
            C0081l lVar = this.f266k0;
            if (lVar != null) {
                lVar.mo346a();
            }
        }
        if (L == 3) {
            m305d0(this.f276x).mo347e();
        } else {
            C0081l lVar2 = this.f267l0;
            if (lVar2 != null) {
                lVar2.mo346a();
            }
        }
        return L0;
    }

    /* renamed from: J */
    private void m291J() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f244O.findViewById(16908290);
        View decorView = this.f277y.getDecorView();
        contentFrameLayout.mo1000b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f276x.obtainStyledAttributes(C1444j.f4455z0);
        obtainStyledAttributes.getValue(C1444j.f4256L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1444j.f4261M0, contentFrameLayout.getMinWidthMinor());
        int i = C1444j.f4246J0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C1444j.f4251K0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C1444j.f4236H0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C1444j.f4241I0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: J0 */
    private void m292J0() {
        if (this.f243N) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: K */
    private void m293K(Window window) {
        if (this.f277y == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0079j)) {
                C0079j jVar = new C0079j(callback);
                this.f278z = jVar;
                window.setCallback(jVar);
                C0292x0 u = C0292x0.m1406u(this.f276x, (AttributeSet) null, f226s);
                Drawable h = u.mo1791h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo1803w();
                this.f277y = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: K0 */
    private C0064c m294K0() {
        Context context = this.f276x;
        while (context != null) {
            if (!(context instanceof C0064c)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0064c) context;
            }
        }
        return null;
    }

    /* renamed from: L */
    private int m295L() {
        int i = this.f262g0;
        return i != -100 ? i : C0066e.m258j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m296L0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f276x
            r1 = 0
            android.content.res.Configuration r0 = r6.m300R(r0, r7, r1)
            boolean r2 = r6.m312n0()
            android.content.Context r3 = r6.f276x
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f258c0
            if (r8 == 0) goto L_0x0047
            boolean r8 = f227t
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f259d0
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f275w
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f275w
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C1098a.m4298l(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m297M0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f275w
            boolean r0 = r8 instanceof androidx.appcompat.app.C0064c
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.C0064c) r8
            r8.mo223D(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.m296L0(int, boolean):boolean");
    }

    /* renamed from: M0 */
    private void m297M0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f276x.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0095i.m417a(resources);
        }
        int i3 = this.f263h0;
        if (i3 != 0) {
            this.f276x.setTheme(i3);
            if (i2 >= 23) {
                this.f276x.getTheme().applyStyle(this.f263h0, true);
            }
        }
        if (z) {
            Object obj = this.f275w;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C1291g) {
                    if (!((C1291g) activity).getLifecycle().mo4339b().mo4341e(C1286d.C1288b.STARTED)) {
                        return;
                    }
                } else if (!this.f260e0) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    /* renamed from: O */
    private void m298O() {
        C0081l lVar = this.f266k0;
        if (lVar != null) {
            lVar.mo346a();
        }
        C0081l lVar2 = this.f267l0;
        if (lVar2 != null) {
            lVar2.mo346a();
        }
    }

    /* renamed from: O0 */
    private void m299O0(View view) {
        int i;
        Context context;
        if ((C1988t.m8351J(view) & 8192) != 0) {
            context = this.f276x;
            i = C1437c.abc_decor_view_status_guard_light;
        } else {
            context = this.f276x;
            i = C1437c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(C1135a.m4417c(context, i));
    }

    /* renamed from: R */
    private Configuration m300R(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: S */
    private ViewGroup m301S() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f276x.obtainStyledAttributes(C1444j.f4455z0);
        int i = C1444j.f4221E0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C1444j.f4266N0, false)) {
                mo283z(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo283z(108);
            }
            if (obtainStyledAttributes.getBoolean(C1444j.f4226F0, false)) {
                mo283z(109);
            }
            if (obtainStyledAttributes.getBoolean(C1444j.f4231G0, false)) {
                mo283z(10);
            }
            this.f252W = obtainStyledAttributes.getBoolean(C1444j.f4201A0, false);
            obtainStyledAttributes.recycle();
            m303Z();
            this.f277y.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f276x);
            if (this.f253X) {
                viewGroup = (ViewGroup) from.inflate(this.f251V ? C1441g.abc_screen_simple_overlay_action_mode : C1441g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f252W) {
                viewGroup = (ViewGroup) from.inflate(C1441g.abc_dialog_title_material, (ViewGroup) null);
                this.f250U = false;
                this.f249T = false;
            } else if (this.f249T) {
                TypedValue typedValue = new TypedValue();
                this.f276x.getTheme().resolveAttribute(C1435a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1469d(this.f276x, typedValue.resourceId) : this.f276x).inflate(C1441g.abc_screen_toolbar, (ViewGroup) null);
                C0209c0 c0Var = (C0209c0) viewGroup.findViewById(C1440f.decor_content_parent);
                this.f234E = c0Var;
                c0Var.setWindowCallback(mo305h0());
                if (this.f250U) {
                    this.f234E.mo917i(109);
                }
                if (this.f247R) {
                    this.f234E.mo917i(2);
                }
                if (this.f248S) {
                    this.f234E.mo917i(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C1988t.m8334A0(viewGroup, new C0070c());
                } else if (viewGroup instanceof C0222g0) {
                    ((C0222g0) viewGroup).setOnFitSystemWindowsListener(new C0071d());
                }
                if (this.f234E == null) {
                    this.f245P = (TextView) viewGroup.findViewById(C1440f.title);
                }
                C0213d1.m1105c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1440f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f277y.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f277y.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0072e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f249T + ", windowActionBarOverlay: " + this.f250U + ", android:windowIsFloating: " + this.f252W + ", windowActionModeOverlay: " + this.f251V + ", windowNoTitle: " + this.f253X + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: Y */
    private void m302Y() {
        if (!this.f243N) {
            this.f244O = m301S();
            CharSequence g0 = mo304g0();
            if (!TextUtils.isEmpty(g0)) {
                C0209c0 c0Var = this.f234E;
                if (c0Var != null) {
                    c0Var.setWindowTitle(g0);
                } else if (mo284A0() != null) {
                    mo284A0().mo199x(g0);
                } else {
                    TextView textView = this.f245P;
                    if (textView != null) {
                        textView.setText(g0);
                    }
                }
            }
            m291J();
            mo316y0(this.f244O);
            this.f243N = true;
            C0089s f0 = mo303f0(0, false);
            if (this.f261f0) {
                return;
            }
            if (f0 == null || f0.f309j == null) {
                m311m0(108);
            }
        }
    }

    /* renamed from: Z */
    private void m303Z() {
        if (this.f277y == null) {
            Object obj = this.f275w;
            if (obj instanceof Activity) {
                m293K(((Activity) obj).getWindow());
            }
        }
        if (this.f277y == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: b0 */
    private static Configuration m304b0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0085o.m398a(configuration, configuration2, configuration3);
            } else if (!C1173d.m4572a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0086p.m399a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0084n.m397a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: d0 */
    private C0081l m305d0(Context context) {
        if (this.f267l0 == null) {
            this.f267l0 = new C0080k(context);
        }
        return this.f267l0;
    }

    /* renamed from: e0 */
    private C0081l m306e0(Context context) {
        if (this.f266k0 == null) {
            this.f266k0 = new C0083m(C0103l.m450a(context));
        }
        return this.f266k0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m307i0() {
        /*
            r3 = this;
            r3.m302Y()
            boolean r0 = r3.f249T
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f231B
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f275w
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f275w
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f250U
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f231B = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.m r0 = new androidx.appcompat.app.m
            java.lang.Object r1 = r3.f275w
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f231B
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f271p0
            r0.mo193r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.m307i0():void");
    }

    /* renamed from: j0 */
    private boolean m308j0(C0089s sVar) {
        View view = sVar.f308i;
        if (view != null) {
            sVar.f307h = view;
            return true;
        } else if (sVar.f309j == null) {
            return false;
        } else {
            if (this.f236G == null) {
                this.f236G = new C0090t();
            }
            View view2 = (View) sVar.mo352a(this.f236G);
            sVar.f307h = view2;
            return view2 != null;
        }
    }

    /* renamed from: k0 */
    private boolean m309k0(C0089s sVar) {
        sVar.mo355d(mo302c0());
        sVar.f306g = new C0088r(sVar.f311l);
        sVar.f302c = 81;
        return true;
    }

    /* renamed from: l0 */
    private boolean m310l0(C0089s sVar) {
        Context context = this.f276x;
        int i = sVar.f300a;
        if ((i == 0 || i == 108) && this.f234E != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C1435a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C1435a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C1435a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C1469d dVar = new C1469d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0124g gVar = new C0124g(context);
        gVar.mo600R(this);
        sVar.mo354c(gVar);
        return true;
    }

    /* renamed from: m0 */
    private void m311m0(int i) {
        this.f269n0 = (1 << i) | this.f269n0;
        if (!this.f268m0) {
            C1988t.m8378e0(this.f277y.getDecorView(), this.f270o0);
            this.f268m0 = true;
        }
    }

    /* renamed from: n0 */
    private boolean m312n0() {
        if (!this.f265j0 && (this.f275w instanceof Activity)) {
            PackageManager packageManager = this.f276x.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f276x, this.f275w.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f264i0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f264i0 = false;
            }
        }
        this.f265j0 = true;
        return this.f264i0;
    }

    /* renamed from: s0 */
    private boolean m313s0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C0089s f0 = mo303f0(i, true);
        if (!f0.f314o) {
            return m286C0(f0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m314v0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            c.a.o.b r0 = r4.f237H
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.f$s r2 = r4.mo303f0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r5 = r4.f234E
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo906e()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f276x
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.c0 r5 = r4.f234E
            boolean r5 = r5.mo902c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f261f0
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m286C0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.c0 r5 = r4.f234E
            boolean r0 = r5.mo916h()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.c0 r5 = r4.f234E
            boolean r0 = r5.mo909g()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f314o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f313n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f312m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f317r
            if (r5 == 0) goto L_0x005b
            r2.f312m = r1
            boolean r5 = r4.m286C0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m315z0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo293Q(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f276x
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.m314v0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: z0 */
    private void m315z0(C0089s sVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!sVar.f314o && !this.f261f0) {
            if (sVar.f300a == 0) {
                if ((this.f276x.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback h0 = mo305h0();
            if (h0 == null || h0.onMenuOpened(sVar.f300a, sVar.f309j)) {
                WindowManager windowManager = (WindowManager) this.f276x.getSystemService("window");
                if (windowManager != null && m286C0(sVar, keyEvent)) {
                    ViewGroup viewGroup = sVar.f306g;
                    if (viewGroup == null || sVar.f316q) {
                        if (viewGroup == null) {
                            if (!m309k0(sVar) || sVar.f306g == null) {
                                return;
                            }
                        } else if (sVar.f316q && viewGroup.getChildCount() > 0) {
                            sVar.f306g.removeAllViews();
                        }
                        if (!m308j0(sVar) || !sVar.mo353b()) {
                            sVar.f316q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = sVar.f307h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        sVar.f306g.setBackgroundResource(sVar.f301b);
                        ViewParent parent = sVar.f307h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(sVar.f307h);
                        }
                        sVar.f306g.addView(sVar.f307h, layoutParams2);
                        if (!sVar.f307h.hasFocus()) {
                            sVar.f307h.requestFocus();
                        }
                    } else {
                        View view = sVar.f308i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            sVar.f313n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, sVar.f303d, sVar.f304e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                            layoutParams3.gravity = sVar.f302c;
                            layoutParams3.windowAnimations = sVar.f305f;
                            windowManager.addView(sVar.f306g, layoutParams3);
                            sVar.f314o = true;
                            return;
                        }
                    }
                    i = -2;
                    sVar.f313n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, sVar.f303d, sVar.f304e, RNCWebViewManager.COMMAND_CLEAR_HISTORY, 8519680, -3);
                    layoutParams32.gravity = sVar.f302c;
                    layoutParams32.windowAnimations = sVar.f305f;
                    windowManager.addView(sVar.f306g, layoutParams32);
                    sVar.f314o = true;
                    return;
                }
                return;
            }
            mo293Q(sVar, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public final C0058a mo284A0() {
        return this.f231B;
    }

    /* renamed from: B */
    public void mo260B(int i) {
        m302Y();
        ViewGroup viewGroup = (ViewGroup) this.f244O.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f276x).inflate(i, viewGroup);
        this.f278z.mo5499a().onContentChanged();
    }

    /* renamed from: C */
    public void mo261C(View view) {
        m302Y();
        ViewGroup viewGroup = (ViewGroup) this.f244O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f278z.mo5499a().onContentChanged();
    }

    /* renamed from: D */
    public void mo262D(View view, ViewGroup.LayoutParams layoutParams) {
        m302Y();
        ViewGroup viewGroup = (ViewGroup) this.f244O.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f278z.mo5499a().onContentChanged();
    }

    /* renamed from: E */
    public void mo263E(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f275w instanceof Activity) {
            C0058a m = mo272m();
            if (!(m instanceof C0105m)) {
                this.f232C = null;
                if (m != null) {
                    m.mo189n();
                }
                if (toolbar != null) {
                    C0096j jVar = new C0096j(toolbar, mo304g0(), this.f278z);
                    this.f231B = jVar;
                    window = this.f277y;
                    callback = jVar.mo387A();
                } else {
                    this.f231B = null;
                    window = this.f277y;
                    callback = this.f278z;
                }
                window.setCallback(callback);
                mo274o();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: F */
    public void mo264F(int i) {
        this.f263h0 = i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f244O;
     */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo285F0() {
        /*
            r1 = this;
            boolean r0 = r1.f243N
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f244O
            if (r0 == 0) goto L_0x0010
            boolean r0 = p027c.p064i.p072j.C1988t.m8361S(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.mo285F0():boolean");
    }

    /* renamed from: G */
    public final void mo265G(CharSequence charSequence) {
        this.f233D = charSequence;
        C0209c0 c0Var = this.f234E;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
        } else if (mo284A0() != null) {
            mo284A0().mo199x(charSequence);
        } else {
            TextView textView = this.f245P;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: H */
    public boolean mo286H() {
        return m290I(true);
    }

    /* renamed from: H0 */
    public C1466b mo287H0(C1466b.C1467a aVar) {
        C0065d dVar;
        if (aVar != null) {
            C1466b bVar = this.f237H;
            if (bVar != null) {
                bVar.mo411c();
            }
            C0077i iVar = new C0077i(aVar);
            C0058a m = mo272m();
            if (m != null) {
                C1466b y = m.mo200y(iVar);
                this.f237H = y;
                if (!(y == null || (dVar = this.f230A) == null)) {
                    dVar.mo233d(y);
                }
            }
            if (this.f237H == null) {
                this.f237H = mo288I0(iVar);
            }
            return this.f237H;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p027c.p028a.p035o.C1466b mo288I0(p027c.p028a.p035o.C1466b.C1467a r8) {
        /*
            r7 = this;
            r7.mo298X()
            c.a.o.b r0 = r7.f237H
            if (r0 == 0) goto L_0x000a
            r0.mo411c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.C0067f.C0077i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.f$i r0 = new androidx.appcompat.app.f$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f230A
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f261f0
            if (r2 != 0) goto L_0x0022
            c.a.o.b r0 = r0.mo240h(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f237H = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f238I
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f252W
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f276x
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p027c.p028a.C1435a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f276x
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            c.a.o.d r4 = new c.a.o.d
            android.content.Context r6 = r7.f276x
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f276x
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f238I = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p027c.p028a.C1435a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f239J = r5
            r6 = 2
            androidx.core.widget.C1193h.m4692b(r5, r6)
            android.widget.PopupWindow r5 = r7.f239J
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f238I
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f239J
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p027c.p028a.C1435a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f238I
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f239J
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.f$f r0 = new androidx.appcompat.app.f$f
            r0.<init>()
            r7.f240K = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f244O
            int r4 = p027c.p028a.C1440f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo302c0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1208a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f238I = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f238I
            if (r0 == 0) goto L_0x0162
            r7.mo298X()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f238I
            r0.mo884k()
            c.a.o.e r0 = new c.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f238I
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f238I
            android.widget.PopupWindow r6 = r7.f239J
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo413e()
            boolean r8 = r8.mo329b(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.mo417k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            r8.mo882h(r0)
            r7.f237H = r0
            boolean r8 = r7.mo285F0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            c.i.j.y r8 = p027c.p064i.p072j.C1988t.m8373c(r8)
            c.i.j.y r8 = r8.mo6696a(r0)
            r7.f241L = r8
            androidx.appcompat.app.f$g r0 = new androidx.appcompat.app.f$g
            r0.<init>()
            r8.mo6701f(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f238I
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p027c.p064i.p072j.C1988t.m8388j0(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f239J
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f277y
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f240K
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f237H = r1
        L_0x0162:
            c.a.o.b r8 = r7.f237H
            if (r8 == 0) goto L_0x016d
            androidx.appcompat.app.d r0 = r7.f230A
            if (r0 == 0) goto L_0x016d
            r0.mo233d(r8)
        L_0x016d:
            c.a.o.b r8 = r7.f237H
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.mo288I0(c.a.o.b$a):c.a.o.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo289M(int i, C0089s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i >= 0) {
                C0089s[] sVarArr = this.f255Z;
                if (i < sVarArr.length) {
                    sVar = sVarArr[i];
                }
            }
            if (sVar != null) {
                menu = sVar.f309j;
            }
        }
        if ((sVar == null || sVar.f314o) && !this.f261f0) {
            this.f278z.mo5499a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo290N(C0124g gVar) {
        if (!this.f254Y) {
            this.f254Y = true;
            this.f234E.mo918j();
            Window.Callback h0 = mo305h0();
            if (h0 != null && !this.f261f0) {
                h0.onPanelClosed(108, gVar);
            }
            this.f254Y = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public final int mo291N0(C1929e0 e0Var, Rect rect) {
        boolean z;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2 = 0;
        int k = e0Var != null ? e0Var.mo6492k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f238I;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f238I.getLayoutParams();
            boolean z3 = true;
            if (this.f238I.isShown()) {
                if (this.f272q0 == null) {
                    this.f272q0 = new Rect();
                    this.f273r0 = new Rect();
                }
                Rect rect2 = this.f272q0;
                Rect rect3 = this.f273r0;
                if (e0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(e0Var.mo6490i(), e0Var.mo6492k(), e0Var.mo6491j(), e0Var.mo6488h());
                }
                C0213d1.m1103a(this.f244O, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                C1929e0 F = C1988t.m8343F(this.f244O);
                int i6 = F == null ? 0 : F.mo6490i();
                int j = F == null ? 0 : F.mo6491j();
                if (marginLayoutParams2.topMargin == i3 && marginLayoutParams2.leftMargin == i4 && marginLayoutParams2.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i3;
                    marginLayoutParams2.leftMargin = i4;
                    marginLayoutParams2.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.f246Q != null) {
                    View view = this.f246Q;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == j))) {
                        marginLayoutParams.height = i;
                        marginLayoutParams.leftMargin = i6;
                        marginLayoutParams.rightMargin = j;
                        this.f246Q.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f276x);
                    this.f246Q = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i6;
                    layoutParams.rightMargin = j;
                    this.f244O.addView(this.f246Q, -1, layoutParams);
                }
                View view3 = this.f246Q;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m299O0(this.f246Q);
                }
                if (!this.f251V && z3) {
                    k = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f238I.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f246Q;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo292P(int i) {
        mo293Q(mo303f0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo293Q(C0089s sVar, boolean z) {
        ViewGroup viewGroup;
        C0209c0 c0Var;
        if (!z || sVar.f300a != 0 || (c0Var = this.f234E) == null || !c0Var.mo902c()) {
            WindowManager windowManager = (WindowManager) this.f276x.getSystemService("window");
            if (!(windowManager == null || !sVar.f314o || (viewGroup = sVar.f306g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo289M(sVar.f300a, sVar, (Menu) null);
                }
            }
            sVar.f312m = false;
            sVar.f313n = false;
            sVar.f314o = false;
            sVar.f307h = null;
            sVar.f316q = true;
            if (this.f256a0 == sVar) {
                this.f256a0 = null;
                return;
            }
            return;
        }
        mo290N(sVar.f309j);
    }

    /* renamed from: T */
    public View mo294T(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0093h hVar;
        boolean z2 = false;
        if (this.f274s0 == null) {
            String string = this.f276x.obtainStyledAttributes(C1444j.f4455z0).getString(C1444j.f4216D0);
            if (string == null) {
                hVar = new C0093h();
            } else {
                try {
                    this.f274s0 = (C0093h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new C0093h();
                }
            }
            this.f274s0 = hVar;
        }
        boolean z3 = f225r;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m289G0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f274s0.createView(view, str, context, attributeSet, z, z3, true, C0210c1.m1077c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo295U() {
        C0124g gVar;
        C0209c0 c0Var = this.f234E;
        if (c0Var != null) {
            c0Var.mo918j();
        }
        if (this.f239J != null) {
            this.f277y.getDecorView().removeCallbacks(this.f240K);
            if (this.f239J.isShowing()) {
                try {
                    this.f239J.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f239J = null;
        }
        mo298X();
        C0089s f0 = mo303f0(0, false);
        if (f0 != null && (gVar = f0.f309j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo296V(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f275w;
        boolean z = true;
        if (((obj instanceof C1927e.C1928a) || (obj instanceof C0091g)) && (decorView = this.f277y.getDecorView()) != null && C1927e.m8052d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f278z.mo5499a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo311r0(keyCode, keyEvent) : mo313u0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo297W(int i) {
        C0089s f0;
        C0089s f02 = mo303f0(i, true);
        if (f02.f309j != null) {
            Bundle bundle = new Bundle();
            f02.f309j.mo599Q(bundle);
            if (bundle.size() > 0) {
                f02.f318s = bundle;
            }
            f02.f309j.mo626d0();
            f02.f309j.clear();
        }
        f02.f317r = true;
        f02.f316q = true;
        if ((i == 108 || i == 0) && this.f234E != null && (f0 = mo303f0(0, false)) != null) {
            f0.f312m = false;
            m286C0(f0, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo298X() {
        C2008y yVar = this.f241L;
        if (yVar != null) {
            yVar.mo6697b();
        }
    }

    /* renamed from: a */
    public boolean mo299a(C0124g gVar, MenuItem menuItem) {
        C0089s a0;
        Window.Callback h0 = mo305h0();
        if (h0 == null || this.f261f0 || (a0 = mo300a0(gVar.mo587D())) == null) {
            return false;
        }
        return h0.onMenuItemSelected(a0.f300a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public C0089s mo300a0(Menu menu) {
        C0089s[] sVarArr = this.f255Z;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C0089s sVar = sVarArr[i];
            if (sVar != null && sVar.f309j == menu) {
                return sVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo301b(C0124g gVar) {
        m287D0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final Context mo302c0() {
        C0058a m = mo272m();
        Context k = m != null ? m.mo186k() : null;
        return k == null ? this.f276x : k;
    }

    /* renamed from: d */
    public void mo266d(View view, ViewGroup.LayoutParams layoutParams) {
        m302Y();
        ((ViewGroup) this.f244O.findViewById(16908290)).addView(view, layoutParams);
        this.f278z.mo5499a().onContentChanged();
    }

    /* renamed from: f */
    public Context mo268f(Context context) {
        boolean z = true;
        this.f258c0 = true;
        int p0 = mo309p0(context, m295L());
        Configuration configuration = null;
        if (f228u && (context instanceof ContextThemeWrapper)) {
            try {
                C0087q.m400a((ContextThemeWrapper) context, m300R(context, p0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C1469d) {
            try {
                ((C1469d) context).mo5454a(m300R(context, p0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f227t) {
            return super.mo268f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m304b0(configuration2, configuration3);
            }
            Configuration R = m300R(context, p0, configuration);
            C1469d dVar = new C1469d(context, C1443i.Theme_AppCompat_Empty);
            dVar.mo5454a(R);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C1154f.C1160d.m4506a(dVar.getTheme());
            }
            return super.mo268f(dVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public C0089s mo303f0(int i, boolean z) {
        C0089s[] sVarArr = this.f255Z;
        if (sVarArr == null || sVarArr.length <= i) {
            C0089s[] sVarArr2 = new C0089s[(i + 1)];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f255Z = sVarArr2;
            sVarArr = sVarArr2;
        }
        C0089s sVar = sVarArr[i];
        if (sVar != null) {
            return sVar;
        }
        C0089s sVar2 = new C0089s(i);
        sVarArr[i] = sVar2;
        return sVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final CharSequence mo304g0() {
        Object obj = this.f275w;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f233D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final Window.Callback mo305h0() {
        return this.f277y.getCallback();
    }

    /* renamed from: i */
    public <T extends View> T mo269i(int i) {
        m302Y();
        return this.f277y.findViewById(i);
    }

    /* renamed from: k */
    public int mo270k() {
        return this.f262g0;
    }

    /* renamed from: l */
    public MenuInflater mo271l() {
        if (this.f232C == null) {
            m307i0();
            C0058a aVar = this.f231B;
            this.f232C = new C1473g(aVar != null ? aVar.mo186k() : this.f276x);
        }
        return this.f232C;
    }

    /* renamed from: m */
    public C0058a mo272m() {
        m307i0();
        return this.f231B;
    }

    /* renamed from: n */
    public void mo273n() {
        LayoutInflater from = LayoutInflater.from(this.f276x);
        if (from.getFactory() == null) {
            C1944f.m8156b(from, this);
        } else if (!(from.getFactory2() instanceof C0067f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: o */
    public void mo274o() {
        C0058a m = mo272m();
        if (m == null || !m.mo187l()) {
            m311m0(0);
        }
    }

    /* renamed from: o0 */
    public boolean mo306o0() {
        return this.f242M;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo294T(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo275p(Configuration configuration) {
        C0058a m;
        if (this.f249T && this.f243N && (m = mo272m()) != null) {
            m.mo188m(configuration);
        }
        C0231j.m1178b().mo1445g(this.f276x);
        m290I(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public int mo309p0(Context context, int i) {
        C0081l e0;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        e0 = m305d0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                e0 = m306e0(context);
            }
            return e0.mo344c();
        }
        return i;
    }

    /* renamed from: q */
    public void mo276q(Bundle bundle) {
        this.f258c0 = true;
        m290I(false);
        m303Z();
        Object obj = this.f275w;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C1115g.m4325c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                C0058a A0 = mo284A0();
                if (A0 == null) {
                    this.f271p0 = true;
                } else {
                    A0.mo193r(true);
                }
            }
            C0066e.m255c(this);
        }
        this.f259d0 = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo310q0() {
        C1466b bVar = this.f237H;
        if (bVar != null) {
            bVar.mo411c();
            return true;
        }
        C0058a m = mo272m();
        return m != null && m.mo183h();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo277r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f275w
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0066e.m259x(r3)
        L_0x0009:
            boolean r0 = r3.f268m0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f277y
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f270o0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f260e0 = r0
            r0 = 1
            r3.f261f0 = r0
            int r0 = r3.f262g0
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f275w
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            c.f.g<java.lang.String, java.lang.Integer> r0 = f224q
            java.lang.Object r1 = r3.f275w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f262g0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            c.f.g<java.lang.String, java.lang.Integer> r0 = f224q
            java.lang.Object r1 = r3.f275w
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f231B
            if (r0 == 0) goto L_0x005e
            r0.mo189n()
        L_0x005e:
            r3.m298O()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0067f.mo277r():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public boolean mo311r0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f257b0 = z;
        } else if (i == 82) {
            m313s0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void mo278s(Bundle bundle) {
        m302Y();
    }

    /* renamed from: t */
    public void mo279t() {
        C0058a m = mo272m();
        if (m != null) {
            m.mo197v(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo312t0(int i, KeyEvent keyEvent) {
        C0058a m = mo272m();
        if (m != null && m.mo190o(i, keyEvent)) {
            return true;
        }
        C0089s sVar = this.f256a0;
        if (sVar == null || !m285B0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f256a0 == null) {
                C0089s f0 = mo303f0(0, true);
                m286C0(f0, keyEvent);
                boolean B0 = m285B0(f0, keyEvent.getKeyCode(), keyEvent, 1);
                f0.f312m = false;
                if (B0) {
                    return true;
                }
            }
            return false;
        }
        C0089s sVar2 = this.f256a0;
        if (sVar2 != null) {
            sVar2.f313n = true;
        }
        return true;
    }

    /* renamed from: u */
    public void mo280u(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo313u0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f257b0;
            this.f257b0 = false;
            C0089s f0 = mo303f0(0, false);
            if (f0 != null && f0.f314o) {
                if (!z) {
                    mo293Q(f0, true);
                }
                return true;
            } else if (mo310q0()) {
                return true;
            }
        } else if (i == 82) {
            m314v0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void mo281v() {
        this.f260e0 = true;
        mo286H();
    }

    /* renamed from: w */
    public void mo282w() {
        this.f260e0 = false;
        C0058a m = mo272m();
        if (m != null) {
            m.mo197v(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo314w0(int i) {
        C0058a m;
        if (i == 108 && (m = mo272m()) != null) {
            m.mo184i(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo315x0(int i) {
        if (i == 108) {
            C0058a m = mo272m();
            if (m != null) {
                m.mo184i(false);
            }
        } else if (i == 0) {
            C0089s f0 = mo303f0(i, true);
            if (f0.f314o) {
                mo293Q(f0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo316y0(ViewGroup viewGroup) {
    }

    /* renamed from: z */
    public boolean mo283z(int i) {
        int E0 = m288E0(i);
        if (this.f253X && E0 == 108) {
            return false;
        }
        if (this.f249T && E0 == 1) {
            this.f249T = false;
        }
        if (E0 == 1) {
            m292J0();
            this.f253X = true;
            return true;
        } else if (E0 == 2) {
            m292J0();
            this.f247R = true;
            return true;
        } else if (E0 == 5) {
            m292J0();
            this.f248S = true;
            return true;
        } else if (E0 == 10) {
            m292J0();
            this.f251V = true;
            return true;
        } else if (E0 == 108) {
            m292J0();
            this.f249T = true;
            return true;
        } else if (E0 != 109) {
            return this.f277y.requestFeature(E0);
        } else {
            m292J0();
            this.f250U = true;
            return true;
        }
    }
}
