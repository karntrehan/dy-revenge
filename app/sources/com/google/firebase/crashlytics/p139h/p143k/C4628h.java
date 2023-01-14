package com.google.firebase.crashlytics.p139h.p143k;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p143k.C4623g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.google.firebase.crashlytics.h.k.h */
class C4628h implements C4616c {

    /* renamed from: a */
    private static final Charset f13089a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final File f13090b;

    /* renamed from: c */
    private final int f13091c;

    /* renamed from: d */
    private C4623g f13092d;

    /* renamed from: com.google.firebase.crashlytics.h.k.h$a */
    class C4629a implements C4623g.C4627d {

        /* renamed from: a */
        final /* synthetic */ byte[] f13093a;

        /* renamed from: b */
        final /* synthetic */ int[] f13094b;

        C4629a(byte[] bArr, int[] iArr) {
            this.f13093a = bArr;
            this.f13094b = iArr;
        }

        /* renamed from: a */
        public void mo14268a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f13093a, this.f13094b[0], i);
                int[] iArr = this.f13094b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.k.h$b */
    private static class C4630b {

        /* renamed from: a */
        public final byte[] f13096a;

        /* renamed from: b */
        public final int f13097b;

        C4630b(byte[] bArr, int i) {
            this.f13096a = bArr;
            this.f13097b = i;
        }
    }

    C4628h(File file, int i) {
        this.f13090b = file;
        this.f13091c = i;
    }

    /* renamed from: f */
    private void m17621f(long j, String str) {
        if (this.f13092d != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f13091c / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f13092d.mo14265r(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f13089a));
                while (!this.f13092d.mo14263X() && this.f13092d.mo14260A0() > this.f13091c) {
                    this.f13092d.mo14267w0();
                }
            } catch (IOException e) {
                C4542f.m17259f().mo14107e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    private C4630b m17622g() {
        if (!this.f13090b.exists()) {
            return null;
        }
        m17623h();
        C4623g gVar = this.f13092d;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.mo14260A0()];
        try {
            this.f13092d.mo14262L(new C4629a(bArr, iArr));
        } catch (IOException e) {
            C4542f.m17259f().mo14107e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C4630b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m17623h() {
        if (this.f13092d == null) {
            try {
                this.f13092d = new C4623g(this.f13090b);
            } catch (IOException e) {
                C4542f f = C4542f.m17259f();
                f.mo14107e("Could not open log file: " + this.f13090b, e);
            }
        }
    }

    /* renamed from: a */
    public void mo14238a() {
        C4577n.m17376e(this.f13092d, "There was a problem closing the Crashlytics log file.");
        this.f13092d = null;
    }

    /* renamed from: b */
    public String mo14239b() {
        byte[] c = mo14240c();
        if (c != null) {
            return new String(c, f13089a);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo14240c() {
        C4630b g = m17622g();
        if (g == null) {
            return null;
        }
        int i = g.f13097b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f13096a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo14241d() {
        mo14238a();
        this.f13090b.delete();
    }

    /* renamed from: e */
    public void mo14242e(long j, String str) {
        m17623h();
        m17621f(j, str);
    }
}
