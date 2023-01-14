package p477h.p478a.p479a.p491h;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10503e;
import p477h.p478a.p479a.p484d.C10504f;
import p477h.p478a.p479a.p485e.p487b.C10529h;
import p477h.p478a.p479a.p488f.C10540g;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.p489r.C10557f;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10572i;

/* renamed from: h.a.a.h.k */
public class C10576k extends C10566e<C10577a> {

    /* renamed from: d */
    private C10549p f28014d;

    /* renamed from: e */
    private C10504f f28015e;

    /* renamed from: h.a.a.h.k$a */
    public static class C10577a extends C10567f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<String> f28016b;

        public C10577a(List<String> list, Charset charset) {
            super(charset);
            this.f28016b = list;
        }
    }

    public C10576k(C10549p pVar, C10504f fVar, C10572i.C10573a aVar) {
        super(aVar);
        this.f28014d = pVar;
        this.f28015e = fVar;
    }

    /* renamed from: t */
    private List<String> m35866t(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (C10503e.m35458b(this.f28014d, next) != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: u */
    private long m35867u(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("long overflow");
    }

    /* renamed from: v */
    private boolean m35868v(C10543j jVar, List<String> list) {
        for (String startsWith : list) {
            if (jVar.mo26042k().startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    private void m35869w(List<C10543j> list, C10543j jVar, long j) {
        mo26228q(list, this.f28014d, jVar, m35867u(j));
        C10540g d = this.f28014d.mo26143d();
        d.mo26080n(d.mo26073g() - j);
        d.mo26082p(d.mo26074h() - 1);
        if (d.mo26075i() > 0) {
            d.mo26083q(d.mo26075i() - 1);
        }
        if (this.f28014d.mo26150l()) {
            this.f28014d.mo26147i().mo26124o(this.f28014d.mo26147i().mo26114e() - j);
            this.f28014d.mo26147i().mo26128s(this.f28014d.mo26147i().mo26117h() - 1);
            this.f28014d.mo26146g().mo26110g(this.f28014d.mo26146g().mo26107d() - j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10558a.C10561c mo26213d() {
        return C10558a.C10561c.REMOVE_ENTRY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public long mo26229a(C10577a aVar) {
        return this.f28014d.mo26148j().length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo26230c(C10577a aVar, C10558a aVar2) {
        Throwable th;
        if (!this.f28014d.mo26149k()) {
            List<String> t = m35866t(aVar.f28016b);
            if (!t.isEmpty()) {
                File n = mo26227n(this.f28014d.mo26148j().getPath());
                boolean z = false;
                try {
                    C10529h hVar = new C10529h(n);
                    try {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f28014d.mo26148j(), C10557f.READ.mo26199e());
                        try {
                            List<C10543j> j = mo26224j(this.f28014d.mo26141c().mo26058a());
                            long j2 = 0;
                            for (C10543j next : j) {
                                long m = mo26226m(j, next, this.f28014d) - hVar.mo25978b();
                                if (m35868v(next, t)) {
                                    m35869w(j, next, m);
                                    if (this.f28014d.mo26141c().mo26058a().remove(next)) {
                                        j2 += m;
                                    } else {
                                        throw new C10497a("Could not remove entry from list of central directory headers");
                                    }
                                } else {
                                    j2 += super.mo26225k(randomAccessFile, hVar, j2, m, aVar2);
                                }
                                mo26237h();
                            }
                            this.f28015e.mo25905d(this.f28014d, hVar, aVar.f27998a);
                            z = true;
                            randomAccessFile.close();
                            hVar.close();
                            mo26223i(true, this.f28014d.mo26148j(), n);
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            randomAccessFile.close();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    } finally {
                        th = th4;
                        try {
                        } catch (Throwable th5) {
                            Throwable th6 = th5;
                            hVar.close();
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    mo26223i(z, this.f28014d.mo26148j(), n);
                    throw th7;
                }
            }
        } else {
            throw new C10497a("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
    }
}
