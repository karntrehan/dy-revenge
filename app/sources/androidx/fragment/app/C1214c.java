package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0044c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C1098a;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1292h;
import androidx.lifecycle.C1311s;
import androidx.lifecycle.C1312t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import okhttp3.internal.http2.Settings;
import p027c.p060f.C1802h;
import p027c.p092r.p093a.C2068a;

/* renamed from: androidx.fragment.app.c */
public class C1214c extends ComponentActivity implements C1098a.C1101c, C1098a.C1103e {

    /* renamed from: A */
    boolean f3457A;

    /* renamed from: B */
    boolean f3458B;

    /* renamed from: C */
    int f3459C;

    /* renamed from: D */
    C1802h<String> f3460D;

    /* renamed from: u */
    final C1225g f3461u = C1225g.m4928b(new C1215a());

    /* renamed from: v */
    final C1292h f3462v = new C1292h(this);

    /* renamed from: w */
    boolean f3463w;

    /* renamed from: x */
    boolean f3464x;

    /* renamed from: y */
    boolean f3465y = true;

    /* renamed from: z */
    boolean f3466z;

    /* renamed from: androidx.fragment.app.c$a */
    class C1215a extends C1227i<C1214c> implements C1312t, C0044c {
        public C1215a() {
            super(C1214c.this);
        }

        /* renamed from: b */
        public OnBackPressedDispatcher mo128b() {
            return C1214c.this.mo128b();
        }

        /* renamed from: c */
        public View mo3955c(int i) {
            return C1214c.this.findViewById(i);
        }

        /* renamed from: d */
        public boolean mo3956d() {
            Window window = C1214c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public C1311s mo129g() {
            return C1214c.this.mo129g();
        }

        public C1286d getLifecycle() {
            return C1214c.this.f3462v;
        }

        /* renamed from: i */
        public void mo4017i(Fragment fragment) {
            C1214c.this.mo4012u(fragment);
        }

        /* renamed from: l */
        public LayoutInflater mo4019l() {
            return C1214c.this.getLayoutInflater().cloneInContext(C1214c.this);
        }

        /* renamed from: m */
        public void mo4020m(Fragment fragment, String[] strArr, int i) {
            C1214c.this.mo4015x(fragment, strArr, i);
        }

        /* renamed from: n */
        public boolean mo4021n(Fragment fragment) {
            return !C1214c.this.isFinishing();
        }

        /* renamed from: o */
        public boolean mo4022o(String str) {
            return C1098a.m4300n(C1214c.this, str);
        }

        /* renamed from: p */
        public void mo4023p(Fragment fragment, Intent intent, int i, Bundle bundle) {
            C1214c.this.mo4016y(fragment, intent, i, bundle);
        }

        /* renamed from: q */
        public void mo4024q() {
            C1214c.this.mo259z();
        }

        /* renamed from: r */
        public C1214c mo4018k() {
            return C1214c.this;
        }
    }

    /* renamed from: n */
    private int m4893n(Fragment fragment) {
        if (this.f3460D.mo6283p() < 65534) {
            while (this.f3460D.mo6278j(this.f3459C) >= 0) {
                this.f3459C = (this.f3459C + 1) % 65534;
            }
            int i = this.f3459C;
            this.f3460D.mo6281m(i, fragment.f3397s);
            this.f3459C = (this.f3459C + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: o */
    static void m4894o(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: s */
    private void m4895s() {
        do {
        } while (m4896t(mo4006q(), C1286d.C1288b.CREATED));
    }

    /* renamed from: t */
    private static boolean m4896t(C1231l lVar, C1286d.C1288b bVar) {
        boolean z = false;
        for (Fragment next : lVar.mo4143i0()) {
            if (next != null) {
                if (next.mo3947x() != null) {
                    z |= m4896t(next.mo3927r(), bVar);
                }
                if (next.getLifecycle().mo4339b().mo4341e(C1286d.C1288b.STARTED)) {
                    next.f3388f0.mo4344p(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo3547a(int i) {
        if (!this.f3466z && i != -1) {
            m4894o(i);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f3463w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3464x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3465y);
        if (getApplication() != null) {
            C2068a.m8878b(this).mo6948a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3461u.mo4071u().mo4115M(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f3461u.mo4072v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String g = this.f3460D.mo6276g(i4);
            this.f3460D.mo6282n(i4);
            if (g == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f3461u.mo4070t(g);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g);
                return;
            }
            t.mo3888c0(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, i2, intent);
            return;
        }
        C1098a.C1102d k = C1098a.m4297k();
        if (k == null || !k.onActivityResult(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3461u.mo4072v();
        this.f3461u.mo4054d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f3461u.mo4052a((Fragment) null);
        if (bundle != null) {
            this.f3461u.mo4074x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f3459C = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f3460D = new C1802h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f3460D.mo6281m(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f3460D == null) {
            this.f3460D = new C1802h<>();
            this.f3459C = 0;
        }
        super.onCreate(bundle);
        this.f3462v.mo4342i(C1286d.C1287a.ON_CREATE);
        this.f3461u.mo4056f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return i == 0 ? super.onCreatePanelMenu(i, menu) | this.f3461u.mo4057g(menu, getMenuInflater()) : super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View p = mo4005p(view, str, context, attributeSet);
        return p == null ? super.onCreateView(view, str, context, attributeSet) : p;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View p = mo4005p((View) null, str, context, attributeSet);
        return p == null ? super.onCreateView(str, context, attributeSet) : p;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f3461u.mo4058h();
        this.f3462v.mo4342i(C1286d.C1287a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f3461u.mo4059i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f3461u.mo4061k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f3461u.mo4055e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f3461u.mo4060j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f3461u.mo4072v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f3461u.mo4062l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f3464x = false;
        this.f3461u.mo4063m();
        this.f3462v.mo4342i(C1286d.C1287a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f3461u.mo4064n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo4014w();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? mo4013v(view, menu) | this.f3461u.mo4065o(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3461u.mo4072v();
        int i2 = (i >> 16) & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String g = this.f3460D.mo6276g(i3);
            this.f3460D.mo6282n(i3);
            if (g == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f3461u.mo4070t(g);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + g);
                return;
            }
            t.mo3841B0(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f3464x = true;
        this.f3461u.mo4072v();
        this.f3461u.mo4069s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m4895s();
        this.f3462v.mo4342i(C1286d.C1287a.ON_STOP);
        Parcelable y = this.f3461u.mo4075y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.f3460D.mo6283p() > 0) {
            bundle.putInt("android:support:next_request_index", this.f3459C);
            int[] iArr = new int[this.f3460D.mo6283p()];
            String[] strArr = new String[this.f3460D.mo6283p()];
            for (int i = 0; i < this.f3460D.mo6283p(); i++) {
                iArr[i] = this.f3460D.mo6280l(i);
                strArr[i] = this.f3460D.mo6284q(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f3465y = false;
        if (!this.f3463w) {
            this.f3463w = true;
            this.f3461u.mo4053c();
        }
        this.f3461u.mo4072v();
        this.f3461u.mo4069s();
        this.f3462v.mo4342i(C1286d.C1287a.ON_START);
        this.f3461u.mo4067q();
    }

    public void onStateNotSaved() {
        this.f3461u.mo4072v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f3465y = true;
        m4895s();
        this.f3461u.mo4068r();
        this.f3462v.mo4342i(C1286d.C1287a.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final View mo4005p(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3461u.mo4073w(view, str, context, attributeSet);
    }

    /* renamed from: q */
    public C1231l mo4006q() {
        return this.f3461u.mo4071u();
    }

    @Deprecated
    /* renamed from: r */
    public C2068a mo4007r() {
        return C2068a.m8878b(this);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f3458B && i != -1) {
            m4894o(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f3458B && i != -1) {
            m4894o(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f3457A && i != -1) {
            m4894o(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f3457A && i != -1) {
            m4894o(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: u */
    public void mo4012u(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: v */
    public boolean mo4013v(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo4014w() {
        this.f3462v.mo4342i(C1286d.C1287a.ON_RESUME);
        this.f3461u.mo4066p();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4015x(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C1098a.m4299m(this, strArr, i);
            return;
        }
        m4894o(i);
        try {
            this.f3466z = true;
            C1098a.m4299m(this, strArr, ((m4893n(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            this.f3466z = false;
        } catch (Throwable th) {
            this.f3466z = false;
            throw th;
        }
    }

    /* renamed from: y */
    public void mo4016y(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f3458B = true;
        if (i == -1) {
            try {
                C1098a.m4301o(this, intent, -1, bundle);
            } finally {
                this.f3458B = false;
            }
        } else {
            m4894o(i);
            C1098a.m4301o(this, intent, ((m4893n(fragment) + 1) << 16) + (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE), bundle);
            this.f3458B = false;
        }
    }

    @Deprecated
    /* renamed from: z */
    public void mo259z() {
        invalidateOptionsMenu();
    }
}
