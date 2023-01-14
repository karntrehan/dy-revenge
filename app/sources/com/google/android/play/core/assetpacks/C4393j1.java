package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;
import p174e.p319f.p320a.p382e.p383a.p385b.C9146y;
import p174e.p319f.p320a.p382e.p383a.p387d.C9151a;

/* renamed from: com.google.android.play.core.assetpacks.j1 */
public final class C4393j1 {

    /* renamed from: a */
    private static C4367d f12533a;

    /* renamed from: a */
    static String m16865a(List<File> list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    C9146y.m30436a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: b */
    static long m16866b(byte[] bArr, int i) {
        return ((long) ((m16867c(bArr, i + 2) << 16) | m16867c(bArr, i))) & 4294967295L;
    }

    /* renamed from: c */
    static int m16867c(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: d */
    public static boolean m16868d(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: e */
    public static boolean m16869e(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: f */
    public static boolean m16870f(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: g */
    static boolean m16871g(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: h */
    static synchronized C4367d m16872h(Context context) {
        C4367d dVar;
        synchronized (C4393j1.class) {
            if (f12533a == null) {
                C4380g0 g0Var = new C4380g0((byte[]) null);
                g0Var.mo13855b(new C4398k2(C9151a.m30446b(context)));
                f12533a = g0Var.mo13854a();
            }
            dVar = f12533a;
        }
        return dVar;
    }
}
