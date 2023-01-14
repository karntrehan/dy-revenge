package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.util.Log;
import java.io.File;

/* renamed from: com.facebook.soloader.b */
public class C3262b extends C3282l {

    /* renamed from: a */
    private Context f9256a;

    /* renamed from: b */
    private int f9257b;

    /* renamed from: c */
    private C3263c f9258c;

    public C3262b(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f9256a = applicationContext;
        if (applicationContext == null) {
            Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.");
            this.f9256a = context;
        }
        this.f9257b = i;
        this.f9258c = new C3263c(new File(this.f9256a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: e */
    public static File m12808e(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    /* renamed from: a */
    public int mo10726a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f9258c.mo10726a(str, i, threadPolicy);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10727b(int i) {
        this.f9258c.mo10727b(i);
    }

    /* renamed from: c */
    public File mo10728c(String str) {
        return this.f9258c.mo10728c(str);
    }

    /* renamed from: d */
    public boolean mo10729d() {
        File file = this.f9258c.f9259a;
        Context f = mo10730f();
        File e = m12808e(f);
        if (file.equals(e)) {
            return false;
        }
        Log.d("SoLoader", "Native library directory updated from " + file + " to " + e);
        int i = this.f9257b | 1;
        this.f9257b = i;
        C3263c cVar = new C3263c(e, i);
        this.f9258c = cVar;
        cVar.mo10727b(this.f9257b);
        this.f9256a = f;
        return true;
    }

    /* renamed from: f */
    public Context mo10730f() {
        try {
            Context context = this.f9256a;
            return context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f9258c.toString();
    }
}
