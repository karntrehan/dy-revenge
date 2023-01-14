package com.google.firebase.crashlytics.p139h.p147n;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.google.firebase.crashlytics.p139h.C4542f;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.crashlytics.h.n.f */
public class C4782f {

    /* renamed from: a */
    private final File f13467a;

    /* renamed from: b */
    private final File f13468b;

    /* renamed from: c */
    private final File f13469c;

    /* renamed from: d */
    private final File f13470d;

    /* renamed from: e */
    private final File f13471e;

    /* renamed from: f */
    private final File f13472f;

    public C4782f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f13467a = filesDir;
        if (m18286v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m18285u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q = m18281q(new File(filesDir, str));
        this.f13468b = q;
        this.f13469c = m18281q(new File(q, "open-sessions"));
        this.f13470d = m18281q(new File(q, "reports"));
        this.f13471e = m18281q(new File(q, "priority-reports"));
        this.f13472f = m18281q(new File(q, "native-reports"));
    }

    /* renamed from: a */
    private void m18279a(File file) {
        if (file.exists() && m18283s(file)) {
            C4542f f = C4542f.m17259f();
            f.mo14104b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m18280n(String str) {
        return m18282r(new File(this.f13469c, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m18281q(java.io.File r4) {
        /*
            java.lang.Class<com.google.firebase.crashlytics.h.n.f> r0 = com.google.firebase.crashlytics.p139h.p147n.C4782f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            com.google.firebase.crashlytics.h.f r1 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo14104b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            com.google.firebase.crashlytics.h.f r1 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo14106d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p147n.C4782f.m18281q(java.io.File):java.io.File");
    }

    /* renamed from: r */
    private static File m18282r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    static boolean m18283s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s : listFiles) {
                m18283s(s);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static <T> List<T> m18284t(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: u */
    static String m18285u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    private static boolean m18286v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void mo14671b() {
        m18279a(new File(this.f13467a, ".com.google.firebase.crashlytics"));
        m18279a(new File(this.f13467a, ".com.google.firebase.crashlytics-ndk"));
        if (m18286v()) {
            m18279a(new File(this.f13467a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean mo14672c(String str) {
        return m18283s(new File(this.f13469c, str));
    }

    /* renamed from: d */
    public List<String> mo14673d() {
        return m18284t(this.f13469c.list());
    }

    /* renamed from: e */
    public File mo14674e(String str) {
        return new File(this.f13468b, str);
    }

    /* renamed from: f */
    public List<File> mo14675f(FilenameFilter filenameFilter) {
        return m18284t(this.f13468b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File mo14676g(String str) {
        return new File(this.f13472f, str);
    }

    /* renamed from: h */
    public List<File> mo14677h() {
        return m18284t(this.f13472f.listFiles());
    }

    /* renamed from: i */
    public File mo14678i(String str) {
        return m18282r(new File(m18280n(str), "native"));
    }

    /* renamed from: j */
    public File mo14679j(String str) {
        return new File(this.f13471e, str);
    }

    /* renamed from: k */
    public List<File> mo14680k() {
        return m18284t(this.f13471e.listFiles());
    }

    /* renamed from: l */
    public File mo14681l(String str) {
        return new File(this.f13470d, str);
    }

    /* renamed from: m */
    public List<File> mo14682m() {
        return m18284t(this.f13470d.listFiles());
    }

    /* renamed from: o */
    public File mo14683o(String str, String str2) {
        return new File(m18280n(str), str2);
    }

    /* renamed from: p */
    public List<File> mo14684p(String str, FilenameFilter filenameFilter) {
        return m18284t(m18280n(str).listFiles(filenameFilter));
    }
}
