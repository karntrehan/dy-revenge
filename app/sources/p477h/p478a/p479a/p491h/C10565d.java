package p477h.p478a.p479a.p491h;

import java.io.File;
import java.util.regex.Matcher;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p485e.p486a.C10518k;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p492i.C10579b;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.h.d */
public abstract class C10565d<T> extends C10572i<T> {

    /* renamed from: d */
    private C10549p f27996d;

    /* renamed from: e */
    private byte[] f27997e = new byte[4096];

    public C10565d(C10549p pVar, C10572i.C10573a aVar) {
        super(aVar);
        this.f27996d = pVar;
    }

    /* renamed from: i */
    private void m35810i(File file) {
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            throw new C10497a("Unable to create parent directories: " + file.getParentFile());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r4.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        throw r5;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35811j(p477h.p478a.p479a.p485e.p486a.C10518k r3, p477h.p478a.p479a.p488f.C10543j r4, java.io.File r5, p477h.p478a.p479a.p490g.C10558a r6) {
        /*
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r3 = r2.m35815p(r3, r4, r6)
            r0.<init>(r3)
            java.io.File r3 = r5.getParentFile()
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0026
            java.io.File r3 = r5.getParentFile()
            boolean r3 = r3.mkdirs()
            if (r3 == 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            h.a.a.c.a r3 = new h.a.a.c.a
            java.lang.String r4 = "Could not create parent directories"
            r3.<init>((java.lang.String) r4)
            throw r3
        L_0x0026:
            r3 = 0
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ NoSuchMethodError -> 0x003a }
            java.nio.file.Path r6 = java.nio.file.Paths.get(r0, r6)     // Catch:{ NoSuchMethodError -> 0x003a }
            java.nio.file.Path r1 = r5.toPath()     // Catch:{ NoSuchMethodError -> 0x003a }
            java.nio.file.attribute.FileAttribute[] r3 = new java.nio.file.attribute.FileAttribute[r3]     // Catch:{ NoSuchMethodError -> 0x003a }
            java.nio.file.Files.createSymbolicLink(r1, r6, r3)     // Catch:{ NoSuchMethodError -> 0x003a }
            p477h.p478a.p479a.p492i.C10584g.m35932a(r4, r5)     // Catch:{ NoSuchMethodError -> 0x003a }
            goto L_0x0049
        L_0x003a:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r5)
            byte[] r4 = r0.getBytes()     // Catch:{ all -> 0x004a }
            r3.write(r4)     // Catch:{ all -> 0x004a }
            r3.close()
        L_0x0049:
            return
        L_0x004a:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x004c }
        L_0x004c:
            r5 = move-exception
            r3.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r3 = move-exception
            r4.addSuppressed(r3)
        L_0x0055:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p491h.C10565d.m35811j(h.a.a.e.a.k, h.a.a.f.j, java.io.File, h.a.a.g.a):void");
    }

    /* renamed from: k */
    private File m35812k(C10543j jVar, String str, String str2) {
        if (!C10585h.m35940g(str2)) {
            str2 = m35813m(jVar.mo26042k());
        }
        return new File(str + C10582e.f28020a + str2);
    }

    /* renamed from: m */
    private String m35813m(String str) {
        return str.replaceAll("[/\\\\]", Matcher.quoteReplacement(C10582e.f28020a));
    }

    /* renamed from: o */
    private boolean m35814o(C10543j jVar) {
        byte[] P = jVar.mo26092P();
        if (P == null || P.length < 4) {
            return false;
        }
        return C10579b.m35876a(P[3], 5);
    }

    /* renamed from: p */
    private byte[] m35815p(C10518k kVar, C10543j jVar, C10558a aVar) {
        int o = (int) jVar.mo26046o();
        byte[] bArr = new byte[o];
        if (kVar.read(bArr) == o) {
            aVar.mo26210l((long) o);
            return bArr;
        }
        throw new C10497a("Could not read complete entry");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        throw r6;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35816q(p477h.p478a.p479a.p485e.p486a.C10518k r5, p477h.p478a.p479a.p488f.C10543j r6, java.io.File r7, p477h.p478a.p479a.p490g.C10558a r8) {
        /*
            r4 = this;
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002f }
            r0.<init>(r7)     // Catch:{ Exception -> 0x002f }
        L_0x0005:
            byte[] r1 = r4.f27997e     // Catch:{ all -> 0x0023 }
            int r1 = r5.read(r1)     // Catch:{ all -> 0x0023 }
            r2 = -1
            if (r1 == r2) goto L_0x001c
            byte[] r2 = r4.f27997e     // Catch:{ all -> 0x0023 }
            r3 = 0
            r0.write(r2, r3, r1)     // Catch:{ all -> 0x0023 }
            long r1 = (long) r1     // Catch:{ all -> 0x0023 }
            r8.mo26210l(r1)     // Catch:{ all -> 0x0023 }
            r4.mo26237h()     // Catch:{ all -> 0x0023 }
            goto L_0x0005
        L_0x001c:
            r0.close()     // Catch:{ Exception -> 0x002f }
            p477h.p478a.p479a.p492i.C10584g.m35932a(r6, r7)
            return
        L_0x0023:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r6 = move-exception
            r0.close()     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r8 = move-exception
            r5.addSuppressed(r8)     // Catch:{ Exception -> 0x002f }
        L_0x002e:
            throw r6     // Catch:{ Exception -> 0x002f }
        L_0x002f:
            r5 = move-exception
            boolean r6 = r7.exists()
            if (r6 == 0) goto L_0x0039
            r7.delete()
        L_0x0039:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p491h.C10565d.m35816q(h.a.a.e.a.k, h.a.a.f.j, java.io.File, h.a.a.g.a):void");
    }

    /* renamed from: r */
    private void m35817r(C10518k kVar, C10543j jVar) {
        if (!C10579b.m35876a(jVar.mo26044m()[0], 6)) {
            C10544k r = kVar.mo25954r(jVar);
            if (r == null) {
                throw new C10497a("Could not read corresponding local file header for file header: " + jVar.mo26042k());
            } else if (!jVar.mo26042k().equals(r.mo26042k())) {
                throw new C10497a("File header and local file header mismatch");
            }
        } else {
            throw new C10497a("Entry with name " + jVar.mo26042k() + " is encrypted with Strong Encryption. Zip4j does not support Strong Encryption, as this is patented.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10558a.C10561c mo26213d() {
        return C10558a.C10561c.EXTRACT_ENTRY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo26221l(C10518k kVar, C10543j jVar, String str, String str2, C10558a aVar) {
        String str3 = C10582e.f28020a;
        if (!str.endsWith(str3)) {
            str = str + str3;
        }
        File k = m35812k(jVar, str, str2);
        aVar.mo26206h(k.getAbsolutePath());
        if (k.getCanonicalPath().startsWith(new File(str).getCanonicalPath() + File.separator)) {
            m35817r(kVar, jVar);
            if (jVar.mo26050s()) {
                if (!k.exists() && !k.mkdirs()) {
                    throw new C10497a("Could not create directory: " + k);
                }
            } else if (m35814o(jVar)) {
                m35811j(kVar, jVar, k, aVar);
            } else {
                m35810i(k);
                m35816q(kVar, jVar, k, aVar);
            }
        } else {
            throw new C10497a("illegal file name that breaks out of the target directory: " + jVar.mo26042k());
        }
    }

    /* renamed from: n */
    public C10549p mo26222n() {
        return this.f27996d;
    }
}
