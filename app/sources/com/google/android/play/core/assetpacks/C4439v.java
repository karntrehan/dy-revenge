package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9146y;

/* renamed from: com.google.android.play.core.assetpacks.v */
final class C4439v {

    /* renamed from: a */
    private static final C9101a f12668a = new C9101a("AssetPackStorage");

    /* renamed from: b */
    private static final long f12669b;

    /* renamed from: c */
    private static final long f12670c;

    /* renamed from: d */
    private final Context f12671d;

    /* renamed from: e */
    private final C4437u1 f12672e;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f12669b = timeUnit.toMillis(14);
        f12670c = timeUnit.toMillis(28);
    }

    C4439v(Context context, C4437u1 u1Var) {
        this.f12671d = context;
        this.f12672e = u1Var;
    }

    /* renamed from: d */
    private final File m16957d(String str, int i) {
        return new File(m16958e(str), String.valueOf(i));
    }

    /* renamed from: e */
    private final File m16958e(String str) {
        return new File(m16967n(), str);
    }

    /* renamed from: f */
    private final File m16959f(String str, int i, long j) {
        return new File(mo13943x(str, i, j), "merge.tmp");
    }

    /* renamed from: g */
    private static void m16960g(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long j = m16963j(file);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(j)) && !file2.getName().equals("stale.tmp")) {
                    m16968o(file2);
                }
            }
        }
    }

    /* renamed from: h */
    private static long m16961h(File file) {
        return m16962i(file, true);
    }

    /* renamed from: i */
    private static long m16962i(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f12668a.mo23084e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f12668a.mo23082c(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: j */
    private static long m16963j(File file) {
        return m16962i(file, false);
    }

    /* renamed from: k */
    private final List<File> m16964k() {
        ArrayList arrayList = new ArrayList();
        try {
            if (m16967n().exists()) {
                if (m16967n().listFiles() != null) {
                    for (File file : m16967n().listFiles()) {
                        if (!file.getCanonicalPath().equals(m16966m().getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f12668a.mo23081b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: l */
    private final File m16965l(String str, int i, long j) {
        return new File(new File(new File(m16966m(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: m */
    private final File m16966m() {
        return new File(m16967n(), "_tmp");
    }

    /* renamed from: n */
    private final File m16967n() {
        return new File(this.f12671d.getFilesDir(), "assetpacks");
    }

    /* renamed from: o */
    private static boolean m16968o(File file) {
        boolean z;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            z = true;
            for (File o : listFiles) {
                z &= m16968o(o);
            }
        } else {
            z = true;
        }
        return file.delete() && true == z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final File mo13921A(String str, int i, long j, String str2) {
        return new File(mo13923C(str, i, j, str2), "checkpoint.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final File mo13922B(String str, int i, long j, String str2) {
        return new File(mo13923C(str, i, j, str2), "checkpoint_ext.dat");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final File mo13923C(String str, int i, long j, String str2) {
        return new File(mo13924D(str, i, j), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final File mo13924D(String str, int i, long j) {
        return new File(new File(m16965l(str, i, j), "_slices"), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo13925E(String str, int i, long j) {
        File e = m16958e(str);
        if (e.exists()) {
            for (File file : e.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    m16968o(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            m16968o(file2);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo13926F() {
        for (File next : m16964k()) {
            if (next.listFiles() != null) {
                m16960g(next);
                long j = m16963j(next);
                if (((long) this.f12672e.mo13920a()) != j) {
                    try {
                        new File(new File(next, String.valueOf(j)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        f12668a.mo23081b("Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File g : next.listFiles()) {
                    m16960g(g);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final int mo13927G(String str) {
        return (int) m16961h(m16958e(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final long mo13928H(String str) {
        return m16961h(m16957d(str, mo13927G(str)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo13929I() {
        for (File next : m16964k()) {
            if (next.listFiles() != null) {
                for (File file : next.listFiles()) {
                    File file2 = new File(file, "stale.tmp");
                    if (file2.exists() && System.currentTimeMillis() - file2.lastModified() > f12670c) {
                        m16968o(file);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo13930J() {
        if (m16966m().exists()) {
            for (File file : m16966m().listFiles()) {
                if (System.currentTimeMillis() - file.lastModified() > f12669b) {
                    m16968o(file);
                } else {
                    m16960g(file);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo13931K() {
        m16968o(m16967n());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13932a(List<String> list) {
        int a = this.f12672e.mo13920a();
        for (File next : m16964k()) {
            if (!list.contains(next.getName()) && m16961h(next) != ((long) a)) {
                m16968o(next);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13933b(String str, int i, long j) {
        if (m16965l(str, i, j).exists()) {
            m16968o(m16965l(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo13934c(String str, int i, long j) {
        if (mo13939t(str, i, j).exists()) {
            m16968o(mo13939t(str, i, j));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Map<String, C4359b> mo13935p() {
        HashMap hashMap = new HashMap();
        try {
            for (File next : m16964k()) {
                C4359b r = mo13937r(next.getName());
                if (r != null) {
                    hashMap.put(next.getName(), r);
                }
            }
        } catch (IOException e) {
            f12668a.mo23081b("Could not process directory while scanning installed packs: %s", e);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Map<String, Long> mo13936q() {
        HashMap hashMap = new HashMap();
        for (String next : mo13935p().keySet()) {
            hashMap.put(next, Long.valueOf(mo13928H(next)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final C4359b mo13937r(String str) {
        String s = mo13938s(str);
        if (s == null) {
            return null;
        }
        File file = new File(s, "assets");
        if (file.isDirectory()) {
            return C4359b.m16778b(s, file.getCanonicalPath());
        }
        f12668a.mo23081b("Failed to find assets directory: %s", file);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final String mo13938s(String str) {
        int length;
        File file = new File(m16967n(), str);
        if (!file.exists()) {
            f12668a.mo23080a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f12672e.mo13920a()));
        if (!file2.exists()) {
            f12668a.mo23080a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f12672e.mo13920a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f12668a.mo23080a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f12672e.mo13920a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f12668a.mo23081b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f12672e.mo13920a()));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final File mo13939t(String str, int i, long j) {
        return new File(m16957d(str, i), String.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final File mo13940u(String str, int i, long j) {
        return new File(mo13939t(str, i, j), "_metadata");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final File mo13941v(String str, int i, long j, String str2) {
        return new File(new File(new File(m16965l(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final File mo13942w(String str, int i, long j, String str2) {
        return new File(new File(new File(m16965l(str, i, j), "_slices"), "_verified"), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final File mo13943x(String str, int i, long j) {
        return new File(m16965l(str, i, j), "_packs");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final int mo13944y(String str, int i, long j) {
        File f = m16959f(str, i, j);
        if (!f.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(f);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new C4396k0("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new C4396k0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable th) {
            C9146y.m30436a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo13945z(String str, int i, long j, int i2) {
        File f = m16959f(str, i, j);
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i2));
        f.getParentFile().mkdirs();
        f.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }
}
