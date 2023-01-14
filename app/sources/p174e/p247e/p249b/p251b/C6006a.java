package p174e.p247e.p249b.p251b;

import android.os.Environment;
import com.facebook.common.time.C2316a;
import com.facebook.common.time.C2318c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p174e.p247e.p248a.C5992a;
import p174e.p247e.p248a.C5993b;
import p174e.p247e.p249b.p250a.C5994a;
import p174e.p247e.p249b.p250a.C6005j;
import p174e.p247e.p249b.p251b.C6019d;
import p174e.p247e.p253d.p256c.C6042a;
import p174e.p247e.p253d.p256c.C6043b;
import p174e.p247e.p253d.p256c.C6044c;
import p174e.p247e.p253d.p257d.C6051c;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.b.b.a */
public class C6006a implements C6019d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Class<?> f16595a = C6006a.class;

    /* renamed from: b */
    static final long f16596b = TimeUnit.MINUTES.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final File f16597c;

    /* renamed from: d */
    private final boolean f16598d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final File f16599e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5994a f16600f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2316a f16601g = C2318c.m9629a();

    /* renamed from: e.e.b.b.a$b */
    private class C6008b implements C6043b {

        /* renamed from: a */
        private final List<C6019d.C6020a> f16602a;

        private C6008b() {
            this.f16602a = new ArrayList();
        }

        /* renamed from: a */
        public void mo17941a(File file) {
            C6010d j = C6006a.this.m22651v(file);
            if (j != null && j.f16608a == ".cnt") {
                this.f16602a.add(new C6009c(j.f16609b, file));
            }
        }

        /* renamed from: b */
        public void mo17942b(File file) {
        }

        /* renamed from: c */
        public void mo17943c(File file) {
        }

        /* renamed from: d */
        public List<C6019d.C6020a> mo17944d() {
            return Collections.unmodifiableList(this.f16602a);
        }
    }

    /* renamed from: e.e.b.b.a$c */
    static class C6009c implements C6019d.C6020a {

        /* renamed from: a */
        private final String f16604a;

        /* renamed from: b */
        private final C5993b f16605b;

        /* renamed from: c */
        private long f16606c;

        /* renamed from: d */
        private long f16607d;

        private C6009c(String str, File file) {
            C6062k.m22839g(file);
            this.f16604a = (String) C6062k.m22839g(str);
            this.f16605b = C5993b.m22600b(file);
            this.f16606c = -1;
            this.f16607d = -1;
        }

        /* renamed from: a */
        public String mo17945a() {
            return this.f16604a;
        }

        /* renamed from: b */
        public long mo17946b() {
            if (this.f16607d < 0) {
                this.f16607d = this.f16605b.mo17906d().lastModified();
            }
            return this.f16607d;
        }

        /* renamed from: c */
        public C5993b mo17947c() {
            return this.f16605b;
        }

        /* renamed from: h */
        public long mo17948h() {
            if (this.f16606c < 0) {
                this.f16606c = this.f16605b.size();
            }
            return this.f16606c;
        }
    }

    /* renamed from: e.e.b.b.a$d */
    private static class C6010d {

        /* renamed from: a */
        public final String f16608a;

        /* renamed from: b */
        public final String f16609b;

        private C6010d(String str, String str2) {
            this.f16608a = str;
            this.f16609b = str2;
        }

        /* renamed from: b */
        public static C6010d m22675b(File file) {
            String o;
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf <= 0 || (o = C6006a.m22649t(name.substring(lastIndexOf))) == null) {
                return null;
            }
            String substring = name.substring(0, lastIndexOf);
            if (o.equals(".tmp")) {
                int lastIndexOf2 = substring.lastIndexOf(46);
                if (lastIndexOf2 <= 0) {
                    return null;
                }
                substring = substring.substring(0, lastIndexOf2);
            }
            return new C6010d(o, substring);
        }

        /* renamed from: a */
        public File mo17949a(File file) {
            return File.createTempFile(this.f16609b + ".", ".tmp", file);
        }

        /* renamed from: c */
        public String mo17950c(String str) {
            return str + File.separator + this.f16609b + this.f16608a;
        }

        public String toString() {
            return this.f16608a + "(" + this.f16609b + ")";
        }
    }

    /* renamed from: e.e.b.b.a$e */
    private static class C6011e extends IOException {
        public C6011e(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
        }
    }

    /* renamed from: e.e.b.b.a$f */
    class C6012f implements C6019d.C6021b {

        /* renamed from: a */
        private final String f16610a;

        /* renamed from: b */
        final File f16611b;

        public C6012f(String str, File file) {
            this.f16610a = str;
            this.f16611b = file;
        }

        /* renamed from: a */
        public C5992a mo17952a(Object obj, long j) {
            C5994a.C5995a aVar;
            File r = C6006a.this.mo17938r(this.f16610a);
            try {
                C6044c.m22813b(this.f16611b, r);
                if (r.exists()) {
                    r.setLastModified(j);
                }
                return C5993b.m22600b(r);
            } catch (C6044c.C6048d e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    if (cause instanceof C6044c.C6047c) {
                        aVar = C5994a.C5995a.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND;
                    } else if (cause instanceof FileNotFoundException) {
                        aVar = C5994a.C5995a.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND;
                    }
                    C6006a.this.f16600f.mo17909a(aVar, C6006a.f16595a, "commit", e);
                    throw e;
                }
                aVar = C5994a.C5995a.WRITE_RENAME_FILE_OTHER;
                C6006a.this.f16600f.mo17909a(aVar, C6006a.f16595a, "commit", e);
                throw e;
            }
        }

        /* renamed from: i */
        public boolean mo17953i() {
            return !this.f16611b.exists() || this.f16611b.delete();
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: j */
        public void mo17954j(C6005j jVar, Object obj) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f16611b);
                try {
                    C6051c cVar = new C6051c(fileOutputStream);
                    jVar.mo17928a(cVar);
                    cVar.flush();
                    long a = cVar.mo18038a();
                    fileOutputStream.close();
                    if (this.f16611b.length() != a) {
                        throw new C6011e(a, this.f16611b.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e) {
                C6006a.this.f16600f.mo17909a(C5994a.C5995a.WRITE_UPDATE_FILE_NOT_FOUND, C6006a.f16595a, "updateResource", e);
                throw e;
            }
        }

        /* renamed from: k */
        public C5992a mo17955k(Object obj) {
            return mo17952a(obj, C6006a.this.f16601g.now());
        }
    }

    /* renamed from: e.e.b.b.a$g */
    private class C6013g implements C6043b {

        /* renamed from: a */
        private boolean f16613a;

        private C6013g() {
        }

        /* renamed from: d */
        private boolean m22682d(File file) {
            C6010d j = C6006a.this.m22651v(file);
            boolean z = false;
            if (j == null) {
                return false;
            }
            String str = j.f16608a;
            if (str == ".tmp") {
                return m22683e(file);
            }
            if (str == ".cnt") {
                z = true;
            }
            C6062k.m22841i(z);
            return true;
        }

        /* renamed from: e */
        private boolean m22683e(File file) {
            return file.lastModified() > C6006a.this.f16601g.now() - C6006a.f16596b;
        }

        /* renamed from: a */
        public void mo17941a(File file) {
            if (!this.f16613a || !m22682d(file)) {
                file.delete();
            }
        }

        /* renamed from: b */
        public void mo17942b(File file) {
            if (!this.f16613a && file.equals(C6006a.this.f16599e)) {
                this.f16613a = true;
            }
        }

        /* renamed from: c */
        public void mo17943c(File file) {
            if (!C6006a.this.f16597c.equals(file) && !this.f16613a) {
                file.delete();
            }
            if (this.f16613a && file.equals(C6006a.this.f16599e)) {
                this.f16613a = false;
            }
        }
    }

    public C6006a(File file, int i, C5994a aVar) {
        C6062k.m22839g(file);
        this.f16597c = file;
        this.f16598d = m22655z(file, aVar);
        this.f16599e = new File(file, m22654y(i));
        this.f16600f = aVar;
        m22640C();
    }

    /* renamed from: A */
    private void m22638A(File file, String str) {
        try {
            C6044c.m22812a(file);
        } catch (C6044c.C6045a e) {
            this.f16600f.mo17909a(C5994a.C5995a.WRITE_CREATE_DIR, f16595a, str, e);
            throw e;
        }
    }

    /* renamed from: B */
    private boolean m22639B(String str, boolean z) {
        File r = mo17938r(str);
        boolean exists = r.exists();
        if (z && exists) {
            r.setLastModified(this.f16601g.now());
        }
        return exists;
    }

    /* renamed from: C */
    private void m22640C() {
        boolean z = true;
        if (this.f16597c.exists()) {
            if (!this.f16599e.exists()) {
                C6042a.m22807b(this.f16597c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                C6044c.m22812a(this.f16599e);
            } catch (C6044c.C6045a unused) {
                C5994a aVar = this.f16600f;
                C5994a.C5995a aVar2 = C5994a.C5995a.WRITE_CREATE_DIR;
                Class<?> cls = f16595a;
                aVar.mo17909a(aVar2, cls, "version directory could not be created: " + this.f16599e, (Throwable) null);
            }
        }
    }

    /* renamed from: q */
    private long m22648q(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static String m22649t(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    /* renamed from: u */
    private String m22650u(String str) {
        C6010d dVar = new C6010d(".cnt", str);
        return dVar.mo17950c(m22653x(dVar.f16609b));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public C6010d m22651v(File file) {
        C6010d b = C6010d.m22675b(file);
        if (b == null) {
            return null;
        }
        if (m22652w(b.f16609b).equals(file.getParentFile())) {
            return b;
        }
        return null;
    }

    /* renamed from: w */
    private File m22652w(String str) {
        return new File(m22653x(str));
    }

    /* renamed from: x */
    private String m22653x(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f16599e + File.separator + valueOf;
    }

    /* renamed from: y */
    static String m22654y(int i) {
        return String.format((Locale) null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)});
    }

    /* renamed from: z */
    private static boolean m22655z(File file, C5994a aVar) {
        String str;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String file2 = externalStorageDirectory.toString();
            try {
                str = file.getCanonicalPath();
                try {
                    return str.contains(file2);
                } catch (IOException e) {
                    e = e;
                    C5994a.C5995a aVar2 = C5994a.C5995a.OTHER;
                    Class<?> cls = f16595a;
                    aVar.mo17909a(aVar2, cls, "failed to read folder to check if external: " + str, e);
                    return false;
                }
            } catch (IOException e2) {
                e = e2;
                str = null;
                C5994a.C5995a aVar22 = C5994a.C5995a.OTHER;
                Class<?> cls2 = f16595a;
                aVar.mo17909a(aVar22, cls2, "failed to read folder to check if external: " + str, e);
                return false;
            }
        } catch (Exception e3) {
            aVar.mo17909a(C5994a.C5995a.OTHER, f16595a, "failed to get the external storage directory!", e3);
            return false;
        }
    }

    /* renamed from: a */
    public void mo17929a() {
        C6042a.m22806a(this.f16597c);
    }

    /* renamed from: b */
    public boolean mo17930b() {
        return this.f16598d;
    }

    /* renamed from: c */
    public void mo17931c() {
        C6042a.m22808c(this.f16597c, new C6013g());
    }

    /* renamed from: d */
    public C6019d.C6021b mo17932d(String str, Object obj) {
        C6010d dVar = new C6010d(".tmp", str);
        File w = m22652w(dVar.f16609b);
        if (!w.exists()) {
            m22638A(w, "insert");
        }
        try {
            return new C6012f(str, dVar.mo17949a(w));
        } catch (IOException e) {
            this.f16600f.mo17909a(C5994a.C5995a.WRITE_CREATE_TEMPFILE, f16595a, "insert", e);
            throw e;
        }
    }

    /* renamed from: e */
    public boolean mo17933e(String str, Object obj) {
        return m22639B(str, true);
    }

    /* renamed from: f */
    public boolean mo17934f(String str, Object obj) {
        return m22639B(str, false);
    }

    /* renamed from: g */
    public C5992a mo17935g(String str, Object obj) {
        File r = mo17938r(str);
        if (!r.exists()) {
            return null;
        }
        r.setLastModified(this.f16601g.now());
        return C5993b.m22601c(r);
    }

    /* renamed from: i */
    public long mo17937i(C6019d.C6020a aVar) {
        return m22648q(((C6009c) aVar).mo17947c().mo17906d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public File mo17938r(String str) {
        return new File(m22650u(str));
    }

    public long remove(String str) {
        return m22648q(mo17938r(str));
    }

    /* renamed from: s */
    public List<C6019d.C6020a> mo17936h() {
        C6008b bVar = new C6008b();
        C6042a.m22808c(this.f16599e, bVar);
        return bVar.mo17944d();
    }
}
