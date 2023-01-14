package p477h.p478a.p479a.p491h;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10503e;
import p477h.p478a.p479a.p484d.C10504f;
import p477h.p478a.p479a.p485e.p487b.C10529h;
import p477h.p478a.p479a.p485e.p487b.C10532k;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p491h.C10576k;
import p477h.p478a.p479a.p492i.C10579b;
import p477h.p478a.p479a.p492i.C10580c;
import p477h.p478a.p479a.p492i.C10581d;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.h.c */
public abstract class C10564c<T> extends C10572i<T> {

    /* renamed from: d */
    private C10549p f27991d;

    /* renamed from: e */
    private char[] f27992e;

    /* renamed from: f */
    private C10504f f27993f;

    /* renamed from: g */
    private byte[] f27994g = new byte[4096];

    /* renamed from: h */
    private int f27995h = -1;

    C10564c(C10549p pVar, char[] cArr, C10504f fVar, C10572i.C10573a aVar) {
        super(aVar);
        this.f27991d = pVar;
        this.f27992e = cArr;
        this.f27993f = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        throw r5;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35795i(java.io.File r4, p477h.p478a.p479a.p485e.p487b.C10532k r5, p477h.p478a.p479a.p488f.C10550q r6, p477h.p478a.p479a.p485e.p487b.C10529h r7, p477h.p478a.p479a.p490g.C10558a r8) {
        /*
            r3 = this;
            r5.mo26002L(r6)
            boolean r6 = r4.exists()
            r0 = 0
            if (r6 == 0) goto L_0x003f
            boolean r6 = r4.isDirectory()
            if (r6 != 0) goto L_0x003f
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r4)
        L_0x0015:
            byte[] r1 = r3.f27994g     // Catch:{ all -> 0x0033 }
            int r1 = r6.read(r1)     // Catch:{ all -> 0x0033 }
            r3.f27995h = r1     // Catch:{ all -> 0x0033 }
            r2 = -1
            if (r1 == r2) goto L_0x002f
            byte[] r2 = r3.f27994g     // Catch:{ all -> 0x0033 }
            r5.write(r2, r0, r1)     // Catch:{ all -> 0x0033 }
            int r1 = r3.f27995h     // Catch:{ all -> 0x0033 }
            long r1 = (long) r1     // Catch:{ all -> 0x0033 }
            r8.mo26210l(r1)     // Catch:{ all -> 0x0033 }
            r3.mo26237h()     // Catch:{ all -> 0x0033 }
            goto L_0x0015
        L_0x002f:
            r6.close()
            goto L_0x003f
        L_0x0033:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r5 = move-exception
            r6.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r6 = move-exception
            r4.addSuppressed(r6)
        L_0x003e:
            throw r5
        L_0x003f:
            r3.m35799o(r5, r7, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p491h.C10564c.m35795i(java.io.File, h.a.a.e.b.k, h.a.a.f.q, h.a.a.e.b.h, h.a.a.g.a):void");
    }

    /* renamed from: k */
    private boolean m35796k(C10550q qVar) {
        return C10550q.C10551a.INCLUDE_LINK_ONLY.equals(qVar.mo26179n()) || C10550q.C10551a.INCLUDE_LINK_AND_LINKED_FILE.equals(qVar.mo26179n());
    }

    /* renamed from: l */
    private void m35797l(File file, C10532k kVar, C10550q qVar, C10529h hVar) {
        C10550q qVar2 = new C10550q(qVar);
        qVar2.mo26162D(m35801t(qVar.mo26176k(), file.getName()));
        qVar2.mo26191z(false);
        qVar2.mo26189x(C10555d.STORE);
        kVar.mo26002L(qVar2);
        kVar.write(C10581d.m35881B(file).getBytes());
        m35799o(kVar, hVar, file, true);
    }

    /* renamed from: n */
    private C10550q m35798n(C10550q qVar, File file, C10558a aVar) {
        C10550q qVar2 = new C10550q(qVar);
        qVar2.mo26163E(C10585h.m35938e(file.lastModified()));
        if (file.isDirectory()) {
            qVar2.mo26161C(0);
        } else {
            qVar2.mo26161C(file.length());
        }
        qVar2.mo26164F(false);
        qVar2.mo26163E(file.lastModified());
        if (!C10585h.m35940g(qVar.mo26176k())) {
            qVar2.mo26162D(C10581d.m35903r(file, qVar));
        }
        if (file.isDirectory()) {
            qVar2.mo26189x(C10555d.STORE);
            qVar2.mo26159A(C10556e.NONE);
            qVar2.mo26191z(false);
        } else {
            if (qVar2.mo26180o() && qVar2.mo26171f() == C10556e.ZIP_STANDARD) {
                aVar.mo26205g(C10558a.C10561c.CALCULATE_CRC);
                qVar2.mo26160B(C10580c.m35879a(file, aVar));
                aVar.mo26205g(C10558a.C10561c.ADD_ENTRY);
            }
            if (file.length() == 0) {
                qVar2.mo26189x(C10555d.STORE);
            }
        }
        return qVar2;
    }

    /* renamed from: o */
    private void m35799o(C10532k kVar, C10529h hVar, File file, boolean z) {
        C10543j a = kVar.mo26003a();
        byte[] k = C10581d.m35896k(file);
        if (!z) {
            k[3] = C10579b.m35878c(k[3], 5);
        }
        a.mo26097U(k);
        mo26219u(a, hVar);
    }

    /* renamed from: s */
    private List<File> m35800s(List<File> list, C10550q qVar, C10558a aVar, Charset charset) {
        ArrayList arrayList = new ArrayList(list);
        if (!this.f27991d.mo26148j().exists()) {
            return arrayList;
        }
        for (File next : list) {
            C10543j b = C10503e.m35458b(this.f27991d, C10581d.m35903r(next, qVar));
            if (b != null) {
                if (qVar.mo26182q()) {
                    aVar.mo26205g(C10558a.C10561c.REMOVE_ENTRY);
                    mo26218r(b, aVar, charset);
                    mo26237h();
                    aVar.mo26205g(C10558a.C10561c.ADD_ENTRY);
                } else {
                    arrayList.remove(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: t */
    private String m35801t(String str, String str2) {
        if (!str.contains("/")) {
            return str2;
        }
        return str.substring(0, str.lastIndexOf("/") + 1) + str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10558a.C10561c mo26213d() {
        return C10558a.C10561c.ADD_ENTRY;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r11 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r8.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        throw r9;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26214j(java.util.List<java.io.File> r8, p477h.p478a.p479a.p490g.C10558a r9, p477h.p478a.p479a.p488f.C10550q r10, java.nio.charset.Charset r11) {
        /*
            r7 = this;
            h.a.a.f.q$a r0 = r10.mo26179n()
            p477h.p478a.p479a.p492i.C10581d.m35890e(r8, r0)
            java.util.List r8 = r7.m35800s(r8, r10, r9, r11)
            h.a.a.e.b.h r6 = new h.a.a.e.b.h
            h.a.a.f.p r0 = r7.f27991d
            java.io.File r0 = r0.mo26148j()
            h.a.a.f.p r1 = r7.f27991d
            long r1 = r1.mo26145f()
            r6.<init>(r0, r1)
            h.a.a.e.b.k r11 = r7.mo26217q(r6, r11)     // Catch:{ all -> 0x007a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x006c }
        L_0x0024:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x006c }
            r1 = r0
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x006c }
            r7.mo26237h()     // Catch:{ all -> 0x006c }
            h.a.a.f.q r3 = r7.m35798n(r10, r1, r9)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ all -> 0x006c }
            r9.mo26206h(r0)     // Catch:{ all -> 0x006c }
            boolean r0 = p477h.p478a.p479a.p492i.C10581d.m35908w(r1)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r7.m35796k(r3)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x005b
            r7.m35797l(r1, r11, r3, r6)     // Catch:{ all -> 0x006c }
            h.a.a.f.q$a r0 = p477h.p478a.p479a.p488f.C10550q.C10551a.INCLUDE_LINK_ONLY     // Catch:{ all -> 0x006c }
            h.a.a.f.q$a r2 = r3.mo26179n()     // Catch:{ all -> 0x006c }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x005b
            goto L_0x0024
        L_0x005b:
            r0 = r7
            r2 = r11
            r4 = r6
            r5 = r9
            r0.m35795i(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x006c }
            goto L_0x0024
        L_0x0063:
            if (r11 == 0) goto L_0x0068
            r11.close()     // Catch:{ all -> 0x007a }
        L_0x0068:
            r6.close()
            return
        L_0x006c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x006e }
        L_0x006e:
            r9 = move-exception
            if (r11 == 0) goto L_0x0079
            r11.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r10 = move-exception
            r8.addSuppressed(r10)     // Catch:{ all -> 0x007a }
        L_0x0079:
            throw r9     // Catch:{ all -> 0x007a }
        L_0x007a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x007c }
        L_0x007c:
            r9 = move-exception
            r6.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r10 = move-exception
            r8.addSuppressed(r10)
        L_0x0085:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p491h.C10564c.mo26214j(java.util.List, h.a.a.g.a, h.a.a.f.q, java.nio.charset.Charset):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo26215m(List<File> list, C10550q qVar) {
        long j = 0;
        for (File next : list) {
            if (next.exists()) {
                j += (!qVar.mo26180o() || qVar.mo26171f() != C10556e.ZIP_STANDARD) ? next.length() : next.length() * 2;
                C10543j b = C10503e.m35458b(mo26216p(), C10581d.m35903r(next, qVar));
                if (b != null) {
                    j += mo26216p().mo26148j().length() - b.mo26034d();
                }
            }
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C10549p mo26216p() {
        return this.f27991d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C10532k mo26217q(C10529h hVar, Charset charset) {
        if (this.f27991d.mo26148j().exists()) {
            hVar.mo25988I(C10503e.m35461e(this.f27991d));
        }
        return new C10532k(hVar, this.f27992e, charset, this.f27991d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo26218r(C10543j jVar, C10558a aVar, Charset charset) {
        new C10576k(this.f27991d, this.f27993f, new C10572i.C10573a((ExecutorService) null, false, aVar)).mo26235b(new C10576k.C10577a(Collections.singletonList(jVar.mo26042k()), charset));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo26219u(C10543j jVar, C10529h hVar) {
        this.f27993f.mo25906k(jVar, mo26216p(), hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo26220v(C10550q qVar) {
        if (qVar == null) {
            throw new C10497a("cannot validate zip parameters");
        } else if (qVar.mo26169d() != C10555d.STORE && qVar.mo26169d() != C10555d.DEFLATE) {
            throw new C10497a("unsupported compression type");
        } else if (!qVar.mo26180o()) {
            qVar.mo26159A(C10556e.NONE);
        } else if (qVar.mo26171f() != C10556e.NONE) {
            char[] cArr = this.f27992e;
            if (cArr == null || cArr.length <= 0) {
                throw new C10497a("input password is empty or null");
            }
        } else {
            throw new C10497a("Encryption method has to be set, when encrypt files flag is set");
        }
    }
}
