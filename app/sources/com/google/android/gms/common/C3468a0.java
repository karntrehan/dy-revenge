package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.C3649b1;
import com.google.android.gms.common.internal.C3658c1;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3754a;
import com.google.android.gms.common.util.C3763j;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: com.google.android.gms.common.a0 */
final class C3468a0 {

    /* renamed from: a */
    static final C3776y f9809a = new C3751s(C3774w.m14541m("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b */
    static final C3776y f9810b = new C3752t(C3774w.m14541m("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c */
    static final C3776y f9811c = new C3753u(C3774w.m14541m("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d */
    static final C3776y f9812d = new C3773v(C3774w.m14541m("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e */
    private static volatile C3658c1 f9813e;

    /* renamed from: f */
    private static final Object f9814f = new Object();

    /* renamed from: g */
    private static Context f9815g;

    /* renamed from: a */
    static C3741k0 m13489a(String str, C3774w wVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m13494f(str, wVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [e.f.a.c.d.a, android.os.IBinder] */
    /* renamed from: b */
    static C3741k0 m13490b(String str, boolean z, boolean z2, boolean z3) {
        C3741k0 k0Var;
        String concat;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C3705r.m14346k(f9815g);
            try {
                m13495g();
                C3630e0 X = f9813e.mo11520X(new C3624b0(str, z, false, C6636b.m25276Y(f9815g), false));
                if (X.mo11500p()) {
                    k0Var = C3741k0.m14469b();
                } else {
                    concat = X.mo11499o();
                    if (concat == null) {
                        concat = "error checking package certificate";
                    }
                    if (X.mo11501r() == 4) {
                        e = new PackageManager.NameNotFoundException();
                        k0Var = C3741k0.m14471d(concat, e);
                    } else {
                        k0Var = C3741k0.m14470c(concat);
                    }
                }
            } catch (DynamiteModule.C3778a e) {
                e = e;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                String valueOf = String.valueOf(e.getMessage());
                concat = valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: ");
            }
        } catch (RemoteException e2) {
            e = e2;
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            concat = "module call";
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return k0Var;
    }

    /* renamed from: c */
    static /* synthetic */ String m13491c(boolean z, String str, C3774w wVar) {
        String str2 = true != (!z && m13494f(str, wVar, true, false).f10423b) ? "not allowed" : "debug cert rejected";
        MessageDigest b = C3754a.m14499b("SHA-1");
        C3705r.m14346k(b);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{str2, str, C3763j.m14520a(b.digest(wVar.mo11735Y())), Boolean.valueOf(z), "12451000.false"});
    }

    /* renamed from: d */
    static synchronized void m13492d(Context context) {
        synchronized (C3468a0.class) {
            if (f9815g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f9815g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    static boolean m13493e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            m13495g();
            boolean h = f9813e.mo11521h();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return h;
        } catch (RemoteException | DynamiteModule.C3778a e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    /* renamed from: f */
    private static C3741k0 m13494f(String str, C3774w wVar, boolean z, boolean z2) {
        try {
            m13495g();
            C3705r.m14346k(f9815g);
            try {
                return f9813e.mo11519T(new C3634g0(str, wVar, z, z2), C6636b.m25276Y(f9815g.getPackageManager())) ? C3741k0.m14469b() : new C3739j0(new C3750r(z, str, wVar), (C3638i0) null);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C3741k0.m14471d("module call", e);
            }
        } catch (DynamiteModule.C3778a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return C3741k0.m14471d(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    /* renamed from: g */
    private static void m13495g() {
        if (f9813e == null) {
            C3705r.m14346k(f9815g);
            synchronized (f9814f) {
                if (f9813e == null) {
                    f9813e = C3649b1.m14153k(DynamiteModule.m14550d(f9815g, DynamiteModule.f10467e, "com.google.android.gms.googlecertificates").mo11738c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
