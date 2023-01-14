package p174e.p247e.p253d.p256c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.d.c.c */
public class C6044c {

    /* renamed from: e.e.d.c.c$a */
    public static class C6045a extends IOException {
        public C6045a(String str) {
            super(str);
        }

        public C6045a(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: e.e.d.c.c$b */
    public static class C6046b extends IOException {
        public C6046b(String str) {
            super(str);
        }
    }

    /* renamed from: e.e.d.c.c$c */
    public static class C6047c extends FileNotFoundException {
        public C6047c(String str) {
            super(str);
        }
    }

    /* renamed from: e.e.d.c.c$d */
    public static class C6048d extends IOException {
        public C6048d(String str, Throwable th) {
            super(str);
            initCause(th);
        }
    }

    /* renamed from: a */
    public static void m22812a(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    throw new C6045a(file.getAbsolutePath(), new C6046b(file.getAbsolutePath()));
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new C6045a(file.getAbsolutePath());
        }
    }

    /* renamed from: b */
    public static void m22813b(File file, File file2) {
        C6062k.m22839g(file);
        C6062k.m22839g(file2);
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable th = null;
            if (file2.exists()) {
                th = new C6046b(file2.getAbsolutePath());
            } else if (!file.getParentFile().exists()) {
                th = new C6047c(file.getAbsolutePath());
            } else if (!file.exists()) {
                th = new FileNotFoundException(file.getAbsolutePath());
            }
            throw new C6048d("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th);
        }
    }
}
