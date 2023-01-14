package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C1117i;
import androidx.fragment.app.C1214c;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C3531h;
import com.google.android.gms.common.api.internal.C3556m1;
import com.google.android.gms.common.api.internal.C3560n1;
import com.google.android.gms.common.api.internal.C3577r1;
import com.google.android.gms.common.internal.C3667f0;
import com.google.android.gms.common.internal.C3676i0;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p133n.C3744a;
import com.google.android.gms.common.util.C3762i;
import com.google.android.gms.common.util.C3765l;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p342c.C6632a;
import p174e.p319f.p320a.p335c.p342c.C6633b;
import p174e.p319f.p320a.p335c.p345f.p350e.C6681e;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.android.gms.common.e */
public class C3629e extends C3631f {

    /* renamed from: c */
    public static final int f10201c = C3631f.f10208a;

    /* renamed from: d */
    private static final Object f10202d = new Object();

    /* renamed from: e */
    private static final C3629e f10203e = new C3629e();

    /* renamed from: f */
    private String f10204f;

    /* renamed from: q */
    public static C3629e m14086q() {
        return f10203e;
    }

    /* renamed from: A */
    public final boolean mo11479A(Activity activity, C3531h hVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog u = mo11493u(activity, i, C3676i0.m14291c(hVar, mo11481d(activity, i, "d"), 2), onCancelListener);
        if (u == null) {
            return false;
        }
        mo11496x(activity, u, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: B */
    public final boolean mo11480B(Context context, C3623b bVar, int i) {
        PendingIntent p;
        if (C3744a.m14486a(context) || (p = mo11489p(context, bVar)) == null) {
            return false;
        }
        mo11497y(context, bVar.mo11462o(), (String) null, C6681e.m25340a(context, 0, GoogleApiActivity.m13496a(context, p, i, true), C6681e.f18338a | 134217728));
        return true;
    }

    /* renamed from: d */
    public Intent mo11481d(Context context, int i, String str) {
        return super.mo11481d(context, i, str);
    }

    /* renamed from: e */
    public PendingIntent mo11482e(Context context, int i, int i2) {
        return super.mo11482e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo11483g(int i) {
        return super.mo11483g(i);
    }

    /* renamed from: i */
    public int mo11484i(Context context) {
        return super.mo11484i(context);
    }

    /* renamed from: j */
    public int mo11485j(Context context, int i) {
        return super.mo11485j(context, i);
    }

    /* renamed from: m */
    public final boolean mo11486m(int i) {
        return super.mo11486m(i);
    }

    /* renamed from: n */
    public Dialog mo11487n(Activity activity, int i, int i2) {
        return mo11488o(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: o */
    public Dialog mo11488o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo11493u(activity, i, C3676i0.m14290b(activity, mo11481d(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent mo11489p(Context context, C3623b bVar) {
        return bVar.mo11457C() ? bVar.mo11464r() : mo11482e(context, bVar.mo11462o(), 0);
    }

    /* renamed from: r */
    public C8963l<Void> mo11490r(Activity activity) {
        int i = f10201c;
        C3705r.m14341f("makeGooglePlayServicesAvailable must be called from the main thread");
        int j = mo11485j(activity, i);
        if (j == 0) {
            return C8969o.m29867f(null);
        }
        C3577r1 t = C3577r1.m13914t(activity);
        t.mo11428s(new C3623b(j, (PendingIntent) null), 0);
        return t.mo11413u();
    }

    /* renamed from: s */
    public boolean mo11491s(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo11488o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        mo11496x(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: t */
    public void mo11492t(Context context, int i) {
        mo11497y(context, i, (String) null, mo11506f(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Dialog mo11493u(Context context, int i, C3676i0 i0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C3667f0.m14255d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C3667f0.m14254c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, i0Var);
        }
        String g = C3667f0.m14258g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: v */
    public final Dialog mo11494v(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C3667f0.m14255d(activity, 18));
        builder.setPositiveButton(HttpUrl.FRAGMENT_ENCODE_SET, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo11496x(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: w */
    public final C3560n1 mo11495w(Context context, C3556m1 m1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C3560n1 n1Var = new C3560n1(m1Var);
        context.registerReceiver(n1Var, intentFilter);
        n1Var.mo11388a(context);
        if (mo11508l(context, "com.google.android.gms")) {
            return n1Var;
        }
        m1Var.mo11384a();
        n1Var.mo11389b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo11496x(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof C1214c) {
                SupportErrorDialogFragment.m13485G1(dialog, onCancelListener).mo3822F1(((C1214c) activity).mo4006q(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C3625c.m14082a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    /* renamed from: y */
    public final void mo11497y(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo11498z(context);
        } else if (pendingIntent != null) {
            String f = C3667f0.m14257f(context, i);
            String e = C3667f0.m14256e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C3705r.m14346k(context.getSystemService("notification"));
            C1117i.C1123d n = new C1117i.C1123d(context).mo3583k(true).mo3578e(true).mo3582i(f).mo3586n(new C1117i.C1119b().mo3574h(e));
            if (C3762i.m14516c(context)) {
                C3705r.m14349n(C3765l.m14528f());
                n.mo3585m(context.getApplicationInfo().icon).mo3584l(2);
                if (C3762i.m14517d(context)) {
                    n.mo3575a(C6632a.f18303a, resources.getString(C6633b.common_open_on_phone), pendingIntent);
                } else {
                    n.mo3580g(pendingIntent);
                }
            } else {
                n.mo3585m(17301642).mo3587o(resources.getString(C6633b.common_google_play_services_notification_ticker)).mo3588p(System.currentTimeMillis()).mo3580g(pendingIntent).mo3581h(e);
            }
            if (C3765l.m14531i()) {
                C3705r.m14349n(C3765l.m14531i());
                synchronized (f10202d) {
                    str2 = this.f10204f;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C3667f0.m14253b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                n.mo3579f(str2);
            }
            Notification b2 = n.mo3576b();
            if (i == 1 || i == 2 || i == 3) {
                C3637i.f10217b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo11498z(Context context) {
        new C3747o(this, context).sendEmptyMessageDelayed(1, 120000);
    }
}
