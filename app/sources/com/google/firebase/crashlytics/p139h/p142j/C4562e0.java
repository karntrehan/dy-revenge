package com.google.firebase.crashlytics.p139h.p142j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.h.j.e0 */
class C4562e0 {
    /* renamed from: a */
    private static void m17310a(InputStream inputStream, File file) {
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream2.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream2.finish();
                            C4577n.m17377f(gZIPOutputStream2);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        C4577n.m17377f(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C4577n.m17377f(gZIPOutputStream);
                throw th;
            }
        }
    }

    /* renamed from: b */
    static void m17311b(File file, List<C4560d0> list) {
        for (C4560d0 next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.mo14126b();
                if (inputStream != null) {
                    m17310a(inputStream, new File(file, next.mo14125a()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                C4577n.m17377f(inputStream);
                throw th;
            }
            C4577n.m17377f(inputStream);
        }
    }
}
