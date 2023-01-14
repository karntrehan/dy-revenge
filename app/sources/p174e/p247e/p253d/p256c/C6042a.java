package p174e.p247e.p253d.p256c;

import java.io.File;

/* renamed from: e.e.d.c.a */
public class C6042a {
    /* renamed from: a */
    public static boolean m22806a(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File b : listFiles) {
                z &= m22807b(b);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static boolean m22807b(File file) {
        if (file.isDirectory()) {
            m22806a(file);
        }
        return file.delete();
    }

    /* renamed from: c */
    public static void m22808c(File file, C6043b bVar) {
        bVar.mo17942b(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m22808c(file2, bVar);
                } else {
                    bVar.mo17941a(file2);
                }
            }
        }
        bVar.mo17943c(file);
    }
}
