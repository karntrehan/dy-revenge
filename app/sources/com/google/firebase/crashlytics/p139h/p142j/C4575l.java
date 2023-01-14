package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.h.j.l */
class C4575l implements C4560d0 {

    /* renamed from: a */
    private final byte[] f12926a;

    /* renamed from: b */
    private final String f12927b;

    /* renamed from: c */
    private final String f12928c;

    C4575l(String str, String str2, byte[] bArr) {
        this.f12927b = str;
        this.f12928c = str2;
        this.f12926a = bArr;
    }

    /* renamed from: d */
    private byte[] m17359d() {
        GZIPOutputStream gZIPOutputStream;
        if (m17360e()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(this.f12926a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* renamed from: e */
    private boolean m17360e() {
        byte[] bArr = this.f12926a;
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: a */
    public String mo14125a() {
        return this.f12928c;
    }

    /* renamed from: b */
    public InputStream mo14126b() {
        if (m17360e()) {
            return null;
        }
        return new ByteArrayInputStream(this.f12926a);
    }

    /* renamed from: c */
    public C4655a0.C4661d.C4663b mo14127c() {
        byte[] d = m17359d();
        if (d == null) {
            return null;
        }
        return C4655a0.C4661d.C4663b.m17745a().mo14353b(d).mo14354c(this.f12927b).mo14352a();
    }
}
