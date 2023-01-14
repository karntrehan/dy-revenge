package com.facebook.soloader;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.c */
public class C3263c extends C3282l {

    /* renamed from: a */
    protected final File f9259a;

    /* renamed from: b */
    protected final int f9260b;

    public C3263c(File file, int i) {
        this.f9259a = file;
        this.f9260b = i;
    }

    /* renamed from: d */
    private static String[] m12814d(File file) {
        boolean z = SoLoader.f9234a;
        if (z) {
            Api18TraceUtils.m12771a("SoLoader.getElfDependencies[", file.getName(), "]");
        }
        try {
            String[] a = C3277i.m12837a(file);
            if (z) {
                Api18TraceUtils.m12772b();
            }
            return a;
        } catch (Throwable th) {
            if (SoLoader.f9234a) {
                Api18TraceUtils.m12772b();
            }
            throw th;
        }
    }

    /* renamed from: e */
    private static void m12815e(File file, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] d = m12814d(file);
        Log.d("SoLoader", "Loading lib dependencies: " + Arrays.toString(d));
        for (String str : d) {
            if (!str.startsWith("/")) {
                SoLoader.m12784l(str, i | 1, threadPolicy);
            }
        }
    }

    /* renamed from: a */
    public int mo10726a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return mo10732f(str, i, this.f9259a, threadPolicy);
    }

    /* renamed from: c */
    public File mo10728c(String str) {
        File file = new File(this.f9259a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo10732f(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            Log.d("SoLoader", str + " not found on " + file.getCanonicalPath());
            return 0;
        }
        Log.d("SoLoader", str + " found on " + file.getCanonicalPath());
        if ((i & 1) == 0 || (this.f9260b & 2) == 0) {
            if ((this.f9260b & 1) != 0) {
                m12815e(file2, i, threadPolicy);
            } else {
                Log.d("SoLoader", "Not resolving dependencies for " + str);
            }
            try {
                SoLoader.f9235b.mo10722a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    return 3;
                }
                throw e;
            }
        } else {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f9259a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f9259a.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f9260b + ']';
    }
}
