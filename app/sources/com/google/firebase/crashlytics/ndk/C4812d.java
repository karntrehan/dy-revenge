package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.ndk.C4816g;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: com.google.firebase.crashlytics.ndk.d */
public class C4812d {

    /* renamed from: a */
    private static final Charset f13554a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final Context f13555b;

    /* renamed from: c */
    private final C4815f f13556c;

    /* renamed from: d */
    private final C4782f f13557d;

    C4812d(Context context, C4815f fVar, C4782f fVar2) {
        this.f13555b = context;
        this.f13556c = fVar;
        this.f13557d = fVar2;
    }

    /* renamed from: b */
    private static File m18380b(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: h */
    private static void m18381h(C4782f fVar, String str, String str2, String str3) {
        m18382j(new File(fVar.mo14678i(str), str3), str2);
    }

    /* renamed from: j */
    private static void m18382j(File file, String str) {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f13554a));
            try {
                bufferedWriter2.write(str);
                C4577n.m17376e(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                C4577n.m17376e(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                C4577n.m17376e(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
            C4577n.m17376e(bufferedWriter, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            C4577n.m17376e(bufferedWriter, "Failed to close " + file);
            throw th;
        }
    }

    /* renamed from: a */
    public C4816g mo14710a(String str) {
        File i = this.f13557d.mo14678i(str);
        File file = new File(i, "pending");
        C4542f f = C4542f.m17259f();
        f.mo14110i("Minidump directory: " + file.getAbsolutePath());
        File b = m18380b(file, ".dmp");
        C4542f f2 = C4542f.m17259f();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((b == null || !b.exists()) ? "does not exist" : "exists");
        f2.mo14110i(sb.toString());
        C4816g.C4818b bVar = new C4816g.C4818b();
        if (i != null && i.exists() && file.exists()) {
            bVar.mo14722l(m18380b(file, ".dmp")).mo14721k(m18380b(i, ".device_info")).mo14724n(new File(i, "session.json")).mo14718h(new File(i, "app.json")).mo14720j(new File(i, "device.json")).mo14723m(new File(i, "os.json"));
        }
        return bVar.mo14719i();
    }

    /* renamed from: c */
    public boolean mo14711c(String str) {
        File file = mo14710a(str).f13563a;
        return file != null && file.exists();
    }

    /* renamed from: d */
    public boolean mo14712d(String str, String str2, long j, C4703c0 c0Var) {
        File i = this.f13557d.mo14678i(str);
        if (i == null) {
            return false;
        }
        try {
            if (!this.f13556c.mo14706a(i.getCanonicalPath(), this.f13555b.getAssets())) {
                return false;
            }
            mo14713e(str, str2, j);
            mo14714f(str, c0Var.mo14558a());
            mo14716i(str, c0Var.mo14560d());
            mo14715g(str, c0Var.mo14559c());
            return true;
        } catch (IOException e) {
            C4542f.m17259f().mo14107e("Error initializing Crashlytics NDK", e);
            return false;
        }
    }

    /* renamed from: e */
    public void mo14713e(String str, String str2, long j) {
        m18381h(this.f13557d, str, C4820i.m18420b(str, str2, j), "session.json");
    }

    /* renamed from: f */
    public void mo14714f(String str, C4703c0.C4704a aVar) {
        m18381h(this.f13557d, str, C4820i.m18421c(aVar.mo14561a(), aVar.mo14565f(), aVar.mo14566g(), aVar.mo14564e(), aVar.mo14562c(), aVar.mo14563d().mo14102d(), aVar.mo14563d().mo14103e()), "app.json");
    }

    /* renamed from: g */
    public void mo14715g(String str, C4703c0.C4705b bVar) {
        m18381h(this.f13557d, str, C4820i.m18422d(bVar.mo14567a(), bVar.mo14572g(), bVar.mo14568b(), bVar.mo14575j(), bVar.mo14569d(), bVar.mo14570e(), bVar.mo14574i(), bVar.mo14571f(), bVar.mo14573h()), "device.json");
    }

    /* renamed from: i */
    public void mo14716i(String str, C4703c0.C4706c cVar) {
        m18381h(this.f13557d, str, C4820i.m18423e(cVar.mo14578d(), cVar.mo14577c(), cVar.mo14576b()), "os.json");
    }
}
