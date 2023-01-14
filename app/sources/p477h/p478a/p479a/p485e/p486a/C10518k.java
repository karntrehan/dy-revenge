package p477h.p478a.p479a.p485e.p486a;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p484d.C10501c;
import p477h.p478a.p479a.p484d.C10502d;
import p477h.p478a.p479a.p488f.C10538e;
import p477h.p478a.p479a.p488f.C10542i;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.p489r.C10553b;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.e.a.k */
public class C10518k extends InputStream {

    /* renamed from: f */
    private PushbackInputStream f27783f;

    /* renamed from: o */
    private C10509c f27784o;

    /* renamed from: p */
    private C10501c f27785p = new C10501c();

    /* renamed from: q */
    private char[] f27786q;

    /* renamed from: r */
    private C10544k f27787r;

    /* renamed from: s */
    private CRC32 f27788s = new CRC32();

    /* renamed from: t */
    private byte[] f27789t;

    /* renamed from: u */
    private boolean f27790u = false;

    /* renamed from: v */
    private Charset f27791v;

    public C10518k(InputStream inputStream, char[] cArr, Charset charset) {
        charset = charset == null ? C10582e.f28021b : charset;
        this.f27783f = new PushbackInputStream(inputStream, 4096);
        this.f27786q = cArr;
        this.f27791v = charset;
    }

    /* renamed from: A */
    private C10508b m35521A(C10517j jVar, C10544k kVar) {
        if (!kVar.mo26051t()) {
            return new C10511e(jVar, kVar, this.f27786q);
        }
        if (kVar.mo26039h() == C10556e.AES) {
            return new C10507a(jVar, kVar, this.f27786q);
        }
        if (kVar.mo26039h() == C10556e.ZIP_STANDARD) {
            return new C10519l(jVar, kVar, this.f27786q);
        }
        throw new C10497a(String.format("Entry [%s] Strong Encryption not supported", new Object[]{kVar.mo26042k()}), C10497a.C10498a.UNSUPPORTED_ENCRYPTION);
    }

    /* renamed from: E */
    private C10509c m35522E(C10508b bVar, C10544k kVar) {
        return C10585h.m35939f(kVar) == C10555d.DEFLATE ? new C10510d(bVar) : new C10516i(bVar);
    }

    /* renamed from: I */
    private C10509c m35523I(C10544k kVar) {
        return m35522E(m35521A(new C10517j(this.f27783f, m35530h(kVar)), kVar), kVar);
    }

    /* renamed from: L */
    private boolean m35524L(C10544k kVar) {
        return kVar.mo26051t() && C10556e.ZIP_STANDARD.equals(kVar.mo26039h());
    }

    /* renamed from: W */
    private boolean m35525W(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    /* renamed from: X */
    private void m35526X() {
        if (this.f27787r.mo26049r() && !this.f27790u) {
            C10538e i = this.f27785p.mo25902i(this.f27783f, m35527a(this.f27787r.mo26040i()));
            this.f27787r.mo26054w(i.mo26060c());
            this.f27787r.mo26030L(i.mo26062e());
            this.f27787r.mo26056y(i.mo26061d());
        }
    }

    /* renamed from: a */
    private boolean m35527a(List<C10542i> list) {
        if (list == null) {
            return false;
        }
        for (C10542i d : list) {
            if (d.mo26086d() == C10502d.ZIP64_EXTRA_FIELD_SIGNATURE.mo25904e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m35528b() {
        this.f27784o.mo25926h(this.f27783f);
        this.f27784o.mo25923a(this.f27783f);
        m35526X();
        m35532n0();
        m35531i0();
    }

    /* renamed from: e0 */
    private void m35529e0() {
        if (!this.f27787r.mo26050s() && this.f27787r.mo26034d() != 0) {
            if (this.f27789t == null) {
                this.f27789t = new byte[512];
            }
            do {
            } while (read(this.f27789t) != -1);
        }
    }

    /* renamed from: h */
    private long m35530h(C10544k kVar) {
        if (C10585h.m35939f(kVar).equals(C10555d.STORE)) {
            return kVar.mo26046o();
        }
        if (!kVar.mo26049r() || this.f27790u) {
            return kVar.mo26034d() - ((long) m35533o(kVar));
        }
        return -1;
    }

    /* renamed from: i0 */
    private void m35531i0() {
        this.f27787r = null;
        this.f27788s.reset();
    }

    /* renamed from: n0 */
    private void m35532n0() {
        if ((this.f27787r.mo26039h() != C10556e.AES || !this.f27787r.mo26033c().mo26010d().equals(C10553b.TWO)) && this.f27787r.mo26037f() != this.f27788s.getValue()) {
            C10497a.C10498a aVar = C10497a.C10498a.CHECKSUM_MISMATCH;
            if (m35524L(this.f27787r)) {
                aVar = C10497a.C10498a.WRONG_PASSWORD;
            }
            throw new C10497a("Reached end of entry, but crc verification failed for " + this.f27787r.mo26042k(), aVar);
        }
    }

    /* renamed from: o */
    private int m35533o(C10544k kVar) {
        if (!kVar.mo26051t()) {
            return 0;
        }
        return kVar.mo26039h().equals(C10556e.AES) ? kVar.mo26033c().mo26009c().mo26195z() + 12 : kVar.mo26039h().equals(C10556e.ZIP_STANDARD) ? 12 : 0;
    }

    /* renamed from: s0 */
    private void m35534s0(C10544k kVar) {
        if (!m35525W(kVar.mo26042k()) && kVar.mo26035e() == C10555d.STORE && kVar.mo26046o() < 0) {
            throw new IOException("Invalid local file header for: " + kVar.mo26042k() + ". Uncompressed size has to be set for entry of compression type store which is not a directory");
        }
    }

    public void close() {
        C10509c cVar = this.f27784o;
        if (cVar != null) {
            cVar.close();
        }
    }

    /* renamed from: r */
    public C10544k mo25954r(C10543j jVar) {
        boolean z;
        if (this.f27787r != null) {
            m35529e0();
        }
        C10544k o = this.f27785p.mo25903o(this.f27783f, this.f27791v);
        this.f27787r = o;
        if (o == null) {
            return null;
        }
        m35534s0(o);
        this.f27788s.reset();
        if (jVar != null) {
            this.f27787r.mo26056y(jVar.mo26037f());
            this.f27787r.mo26054w(jVar.mo26034d());
            this.f27787r.mo26030L(jVar.mo26046o());
            z = true;
        } else {
            z = false;
        }
        this.f27790u = z;
        this.f27784o = m35523I(this.f27787r);
        return this.f27787r;
    }

    public int read() {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Negative read length");
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f27787r == null) {
                return -1;
            }
            try {
                int read = this.f27784o.read(bArr, i, i2);
                if (read == -1) {
                    m35528b();
                } else {
                    this.f27788s.update(bArr, i, read);
                }
                return read;
            } catch (IOException e) {
                if (e.getCause() == null || !(e.getCause() instanceof DataFormatException) || !m35524L(this.f27787r)) {
                    throw e;
                }
                throw new C10497a(e.getMessage(), e.getCause(), C10497a.C10498a.WRONG_PASSWORD);
            }
        }
    }
}
