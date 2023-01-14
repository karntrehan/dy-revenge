package p477h.p478a.p479a;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10504f;
import p477h.p478a.p479a.p485e.p486a.C10514g;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10557f;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10568g;
import p477h.p478a.p479a.p491h.C10570h;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p491h.C10574j;
import p477h.p478a.p479a.p492i.C10581d;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.a */
public class C10483a {

    /* renamed from: a */
    private File f27652a;

    /* renamed from: b */
    private C10549p f27653b;

    /* renamed from: c */
    private boolean f27654c;

    /* renamed from: d */
    private C10558a f27655d;

    /* renamed from: e */
    private boolean f27656e;

    /* renamed from: f */
    private char[] f27657f;

    /* renamed from: g */
    private C10504f f27658g;

    /* renamed from: h */
    private Charset f27659h;

    /* renamed from: i */
    private ThreadFactory f27660i;

    /* renamed from: j */
    private ExecutorService f27661j;

    public C10483a(File file, char[] cArr) {
        this.f27658g = new C10504f();
        this.f27659h = C10582e.f28021b;
        this.f27652a = file;
        this.f27657f = cArr;
        this.f27656e = false;
        this.f27655d = new C10558a();
    }

    public C10483a(String str) {
        this(new File(str), (char[]) null);
    }

    public C10483a(String str, char[] cArr) {
        this(new File(str), cArr);
    }

    /* renamed from: d */
    private void m35358d(File file, C10550q qVar, boolean z) {
        m35362l();
        C10549p pVar = this.f27653b;
        if (pVar == null) {
            throw new C10497a("internal error: zip model is null");
        } else if (!z || !pVar.mo26149k()) {
            new C10570h(this.f27653b, this.f27657f, this.f27658g, m35359e()).mo26235b(new C10570h.C10571a(file, qVar, this.f27659h));
        } else {
            throw new C10497a("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
    }

    /* renamed from: e */
    private C10572i.C10573a m35359e() {
        if (this.f27656e) {
            if (this.f27660i == null) {
                this.f27660i = Executors.defaultThreadFactory();
            }
            this.f27661j = Executors.newSingleThreadExecutor(this.f27660i);
        }
        return new C10572i.C10573a(this.f27661j, this.f27656e, this.f27655d);
    }

    /* renamed from: f */
    private void m35360f() {
        C10549p pVar = new C10549p();
        this.f27653b = pVar;
        pVar.mo26158u(this.f27652a);
    }

    /* renamed from: j */
    private RandomAccessFile m35361j() {
        if (!C10581d.m35907v(this.f27652a)) {
            return new RandomAccessFile(this.f27652a, C10557f.READ.mo26199e());
        }
        C10514g gVar = new C10514g(this.f27652a, C10557f.READ.mo26199e(), C10581d.m35893h(this.f27652a));
        gVar.mo25931b();
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r0 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        throw r2;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35362l() {
        /*
            r3 = this;
            h.a.a.f.p r0 = r3.f27653b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.io.File r0 = r3.f27652a
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0011
            r3.m35360f()
            return
        L_0x0011:
            java.io.File r0 = r3.f27652a
            boolean r0 = r0.canRead()
            if (r0 == 0) goto L_0x004c
            java.io.RandomAccessFile r0 = r3.m35361j()     // Catch:{ a -> 0x004a, IOException -> 0x0043 }
            h.a.a.d.c r1 = new h.a.a.d.c     // Catch:{ all -> 0x0035 }
            r1.<init>()     // Catch:{ all -> 0x0035 }
            java.nio.charset.Charset r2 = r3.f27659h     // Catch:{ all -> 0x0035 }
            h.a.a.f.p r1 = r1.mo25901g(r0, r2)     // Catch:{ all -> 0x0035 }
            r3.f27653b = r1     // Catch:{ all -> 0x0035 }
            java.io.File r2 = r3.f27652a     // Catch:{ all -> 0x0035 }
            r1.mo26158u(r2)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            r0.close()     // Catch:{ a -> 0x004a, IOException -> 0x0043 }
        L_0x0034:
            return
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r2 = move-exception
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ all -> 0x003e }
            goto L_0x0042
        L_0x003e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ a -> 0x004a, IOException -> 0x0043 }
        L_0x0042:
            throw r2     // Catch:{ a -> 0x004a, IOException -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            h.a.a.c.a r1 = new h.a.a.c.a
            r1.<init>((java.lang.Exception) r0)
            throw r1
        L_0x004a:
            r0 = move-exception
            throw r0
        L_0x004c:
            h.a.a.c.a r0 = new h.a.a.c.a
            java.lang.String r1 = "no read access for the input zip file"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.C10483a.m35362l():void");
    }

    /* renamed from: a */
    public void mo25864a(File file, C10550q qVar) {
        mo25865b(Collections.singletonList(file), qVar);
    }

    /* renamed from: b */
    public void mo25865b(List<File> list, C10550q qVar) {
        if (list == null || list.size() == 0) {
            throw new C10497a("input file List is null or empty");
        } else if (qVar == null) {
            throw new C10497a("input parameters are null");
        } else if (this.f27655d.mo26203d() != C10558a.C10560b.BUSY) {
            m35362l();
            if (this.f27653b == null) {
                throw new C10497a("internal error: zip model is null");
            } else if (!this.f27652a.exists() || !this.f27653b.mo26149k()) {
                new C10568g(this.f27653b, this.f27657f, this.f27658g, m35359e()).mo26235b(new C10568g.C10569a(list, qVar, this.f27659h));
            } else {
                throw new C10497a("Zip file already exists. Zip file format does not allow updating split/spanned files");
            }
        } else {
            throw new C10497a("invalid operation - Zip4j is in busy state");
        }
    }

    /* renamed from: c */
    public void mo25866c(File file, C10550q qVar) {
        if (file == null) {
            throw new C10497a("input path is null, cannot add folder to zip file");
        } else if (!file.exists()) {
            throw new C10497a("folder does not exist");
        } else if (!file.isDirectory()) {
            throw new C10497a("input folder is not a directory");
        } else if (!file.canRead()) {
            throw new C10497a("cannot read input folder");
        } else if (qVar != null) {
            m35358d(file, qVar, true);
        } else {
            throw new C10497a("input parameters are null, cannot add folder to zip file");
        }
    }

    /* renamed from: g */
    public void mo25867g(C10543j jVar, String str) {
        mo25868h(jVar, str, (String) null);
    }

    /* renamed from: h */
    public void mo25868h(C10543j jVar, String str, String str2) {
        if (jVar == null) {
            throw new C10497a("input file header is null, cannot extract file");
        } else if (!C10585h.m35940g(str)) {
            throw new C10497a("destination path is empty or null, cannot extract file");
        } else if (this.f27655d.mo26203d() != C10558a.C10560b.BUSY) {
            m35362l();
            new C10574j(this.f27653b, this.f27657f, m35359e()).mo26235b(new C10574j.C10575a(str, jVar, str2, this.f27659h));
        } else {
            throw new C10497a("invalid operation - Zip4j is in busy state");
        }
    }

    /* renamed from: i */
    public List<C10543j> mo25869i() {
        m35362l();
        C10549p pVar = this.f27653b;
        return (pVar == null || pVar.mo26141c() == null) ? Collections.emptyList() : this.f27653b.mo26141c().mo26058a();
    }

    /* renamed from: k */
    public boolean mo25870k() {
        if (this.f27653b == null) {
            m35362l();
            if (this.f27653b == null) {
                throw new C10497a("Zip Model is null");
            }
        }
        if (this.f27653b.mo26141c() == null || this.f27653b.mo26141c().mo26058a() == null) {
            throw new C10497a("invalid zip file");
        }
        Iterator<C10543j> it = this.f27653b.mo26141c().mo26058a().iterator();
        while (true) {
            if (it.hasNext()) {
                C10543j next = it.next();
                if (next != null && next.mo26051t()) {
                    this.f27654c = true;
                    break;
                }
            } else {
                break;
            }
        }
        return this.f27654c;
    }

    /* renamed from: m */
    public void mo25871m(char[] cArr) {
        this.f27657f = cArr;
    }

    public String toString() {
        return this.f27652a.toString();
    }
}
