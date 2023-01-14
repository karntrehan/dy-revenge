package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.h.j.z */
class C4613z implements C4560d0 {

    /* renamed from: a */
    private final File f13059a;

    /* renamed from: b */
    private final String f13060b;

    /* renamed from: c */
    private final String f13061c;

    C4613z(String str, String str2, File file) {
        this.f13060b = str;
        this.f13061c = str2;
        this.f13059a = file;
    }

    /* renamed from: d */
    private byte[] m17554d() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream b = mo14126b();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (b == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (b != null) {
                            b.close();
                        }
                        return null;
                    }
                    while (true) {
                        int read = b.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            b.close();
                            return byteArray;
                        }
                    }
                } catch (Throwable th) {
                    byteArrayOutputStream.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                if (b != null) {
                    b.close();
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /* renamed from: a */
    public String mo14125a() {
        return this.f13061c;
    }

    /* renamed from: b */
    public InputStream mo14126b() {
        if (this.f13059a.exists() && this.f13059a.isFile()) {
            try {
                return new FileInputStream(this.f13059a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public C4655a0.C4661d.C4663b mo14127c() {
        byte[] d = m17554d();
        if (d != null) {
            return C4655a0.C4661d.C4663b.m17745a().mo14353b(d).mo14354c(this.f13060b).mo14352a();
        }
        return null;
    }
}
