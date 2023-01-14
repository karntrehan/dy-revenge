package p477h.p478a.p479a.p485e.p487b;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10500b;
import p477h.p478a.p479a.p484d.C10502d;
import p477h.p478a.p479a.p484d.C10504f;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10553b;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10583f;

/* renamed from: h.a.a.e.b.k */
public class C10532k extends OutputStream {

    /* renamed from: f */
    private C10524d f27811f;

    /* renamed from: o */
    private char[] f27812o;

    /* renamed from: p */
    private C10549p f27813p;

    /* renamed from: q */
    private C10523c f27814q;

    /* renamed from: r */
    private C10543j f27815r;

    /* renamed from: s */
    private C10544k f27816s;

    /* renamed from: t */
    private C10500b f27817t = new C10500b();

    /* renamed from: u */
    private C10504f f27818u = new C10504f();

    /* renamed from: v */
    private CRC32 f27819v = new CRC32();

    /* renamed from: w */
    private C10583f f27820w = new C10583f();

    /* renamed from: x */
    private long f27821x = 0;

    /* renamed from: y */
    private Charset f27822y;

    /* renamed from: z */
    private boolean f27823z;

    public C10532k(OutputStream outputStream, char[] cArr, Charset charset, C10549p pVar) {
        charset = charset == null ? C10582e.f28021b : charset;
        C10524d dVar = new C10524d(outputStream);
        this.f27811f = dVar;
        this.f27812o = cArr;
        this.f27822y = charset;
        this.f27813p = m35578E(pVar, dVar);
        this.f27823z = false;
        m35585i0();
    }

    /* renamed from: A */
    private C10523c m35577A(C10550q qVar) {
        return m35587r(m35586o(new C10531j(this.f27811f), qVar), qVar);
    }

    /* renamed from: E */
    private C10549p m35578E(C10549p pVar, C10524d dVar) {
        if (pVar == null) {
            pVar = new C10549p();
        }
        if (dVar.mo25976E()) {
            pVar.mo26153p(true);
            pVar.mo26154q(dVar.mo25975A());
        }
        return pVar;
    }

    /* renamed from: I */
    private boolean m35579I(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    /* renamed from: W */
    private void m35580W() {
        this.f27821x = 0;
        this.f27819v.reset();
        this.f27814q.close();
    }

    /* renamed from: X */
    private void m35581X(C10550q qVar) {
        if (qVar.mo26169d() == C10555d.STORE && qVar.mo26173h() < 0 && !m35579I(qVar.mo26176k()) && qVar.mo26186u()) {
            throw new IllegalArgumentException("uncompressed size should be set for zip entries of compression type store");
        }
    }

    /* renamed from: b */
    private void m35582b() {
        if (this.f27823z) {
            throw new IOException("Stream is closed");
        }
    }

    /* renamed from: e0 */
    private boolean m35583e0(C10543j jVar) {
        if (!(jVar.mo26051t() && jVar.mo26039h().equals(C10556e.AES))) {
            return true;
        }
        return jVar.mo26033c().mo26010d().equals(C10553b.ONE);
    }

    /* renamed from: h */
    private void m35584h(C10550q qVar) {
        C10543j d = this.f27817t.mo25899d(qVar, this.f27811f.mo25976E(), this.f27811f.mo25977a(), this.f27822y, this.f27820w);
        this.f27815r = d;
        d.mo26101Y(this.f27811f.mo25982r());
        C10544k f = this.f27817t.mo25900f(this.f27815r);
        this.f27816s = f;
        this.f27818u.mo25908p(this.f27813p, f, this.f27811f, this.f27822y);
    }

    /* renamed from: i0 */
    private void m35585i0() {
        if (this.f27811f.mo25976E()) {
            this.f27820w.mo26255o(this.f27811f, (int) C10502d.SPLIT_ZIP.mo25904e());
        }
    }

    /* renamed from: o */
    private C10522b m35586o(C10531j jVar, C10550q qVar) {
        if (!qVar.mo26180o()) {
            return new C10526f(jVar, qVar, (char[]) null);
        }
        char[] cArr = this.f27812o;
        if (cArr == null || cArr.length == 0) {
            throw new C10497a("password not set");
        } else if (qVar.mo26171f() == C10556e.AES) {
            return new C10521a(jVar, qVar, this.f27812o);
        } else {
            if (qVar.mo26171f() == C10556e.ZIP_STANDARD) {
                return new C10533l(jVar, qVar, this.f27812o);
            }
            throw new C10497a("Invalid encryption method");
        }
    }

    /* renamed from: r */
    private C10523c m35587r(C10522b bVar, C10550q qVar) {
        return qVar.mo26169d() == C10555d.DEFLATE ? new C10525e(bVar, qVar.mo26167c()) : new C10530i(bVar);
    }

    /* renamed from: L */
    public void mo26002L(C10550q qVar) {
        m35581X(qVar);
        m35584h(qVar);
        this.f27814q = m35577A(qVar);
    }

    /* renamed from: a */
    public C10543j mo26003a() {
        this.f27814q.mo25969a();
        long b = this.f27814q.mo25970b();
        this.f27815r.mo26054w(b);
        this.f27816s.mo26054w(b);
        this.f27815r.mo26030L(this.f27821x);
        this.f27816s.mo26030L(this.f27821x);
        if (m35583e0(this.f27815r)) {
            this.f27815r.mo26056y(this.f27819v.getValue());
            this.f27816s.mo26056y(this.f27819v.getValue());
        }
        this.f27813p.mo26144e().add(this.f27816s);
        this.f27813p.mo26141c().mo26058a().add(this.f27815r);
        if (this.f27816s.mo26049r()) {
            this.f27818u.mo25907n(this.f27816s, this.f27811f);
        }
        m35580W();
        return this.f27815r;
    }

    public void close() {
        this.f27813p.mo26143d().mo26080n(this.f27811f.mo25981o());
        this.f27818u.mo25905d(this.f27813p, this.f27811f, this.f27822y);
        this.f27811f.close();
        this.f27823z = true;
    }

    public void write(int i) {
        write(new byte[]{(byte) i});
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        m35582b();
        this.f27819v.update(bArr, i, i2);
        this.f27814q.write(bArr, i, i2);
        this.f27821x += (long) i2;
    }
}
