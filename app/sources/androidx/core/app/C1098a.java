package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C1135a;
import java.util.Arrays;

/* renamed from: androidx.core.app.a */
public class C1098a extends C1135a {

    /* renamed from: d */
    private static C1102d f3070d;

    /* renamed from: androidx.core.app.a$a */
    class C1099a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String[] f3071f;

        /* renamed from: o */
        final /* synthetic */ Activity f3072o;

        /* renamed from: p */
        final /* synthetic */ int f3073p;

        C1099a(String[] strArr, Activity activity, int i) {
            this.f3071f = strArr;
            this.f3072o = activity;
            this.f3073p = i;
        }

        public void run() {
            int[] iArr = new int[this.f3071f.length];
            PackageManager packageManager = this.f3072o.getPackageManager();
            String packageName = this.f3072o.getPackageName();
            int length = this.f3071f.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f3071f[i], packageName);
            }
            ((C1101c) this.f3072o).onRequestPermissionsResult(this.f3073p, this.f3071f, iArr);
        }
    }

    /* renamed from: androidx.core.app.a$b */
    class C1100b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Activity f3074f;

        C1100b(Activity activity) {
            this.f3074f = activity;
        }

        public void run() {
            if (!this.f3074f.isFinishing() && !C1106c.m4315i(this.f3074f)) {
                this.f3074f.recreate();
            }
        }
    }

    /* renamed from: androidx.core.app.a$c */
    public interface C1101c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$d */
    public interface C1102d {
        /* renamed from: a */
        boolean mo3545a(Activity activity, String[] strArr, int i);

        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    /* renamed from: androidx.core.app.a$e */
    public interface C1103e {
        /* renamed from: a */
        void mo3547a(int i);
    }

    /* renamed from: j */
    public static void m4296j(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: k */
    public static C1102d m4297k() {
        return f3070d;
    }

    /* renamed from: l */
    public static void m4298l(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i <= 23) {
                new Handler(activity.getMainLooper()).post(new C1100b(activity));
                return;
            } else if (C1106c.m4315i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    /* renamed from: m */
    public static void m4299m(Activity activity, String[] strArr, int i) {
        C1102d dVar = f3070d;
        if (dVar == null || !dVar.mo3545a(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C1103e) {
                    ((C1103e) activity).mo3547a(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C1101c) {
                new Handler(Looper.getMainLooper()).post(new C1099a(strArr, activity, i));
            }
        }
    }

    /* renamed from: n */
    public static boolean m4300n(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: o */
    public static void m4301o(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }
}
