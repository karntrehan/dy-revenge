package p477h.p478a.p479a.p484d;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p485e.p487b.C10524d;
import p477h.p478a.p479a.p485e.p487b.C10528g;
import p477h.p478a.p479a.p485e.p487b.C10529h;
import p477h.p478a.p479a.p488f.C10534a;
import p477h.p478a.p479a.p488f.C10542i;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10545l;
import p477h.p478a.p479a.p488f.C10546m;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p492i.C10581d;
import p477h.p478a.p479a.p492i.C10583f;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.d.f */
public class C10504f {

    /* renamed from: a */
    private C10583f f27734a = new C10583f();

    /* renamed from: b */
    private byte[] f27735b = new byte[8];

    /* renamed from: c */
    private byte[] f27736c = new byte[4];

    /* renamed from: a */
    private C10546m m35464a(C10549p pVar, int i, long j) {
        C10546m mVar = new C10546m();
        mVar.mo26140b(C10502d.ZIP64_END_CENTRAL_DIRECTORY_RECORD);
        mVar.mo26126q(44);
        if (!(pVar.mo26141c() == null || pVar.mo26141c().mo26058a() == null || pVar.mo26141c().mo26058a().size() <= 0)) {
            C10543j jVar = pVar.mo26141c().mo26058a().get(0);
            mVar.mo26129t(jVar.mo26095S());
            mVar.mo26130u(jVar.mo26047p());
        }
        mVar.mo26122m(pVar.mo26143d().mo26070d());
        mVar.mo26123n(pVar.mo26143d().mo26071e());
        long size = (long) pVar.mo26141c().mo26058a().size();
        mVar.mo26128s(pVar.mo26149k() ? m35466c(pVar.mo26141c().mo26058a(), pVar.mo26143d().mo26070d()) : size);
        mVar.mo26127r(size);
        mVar.mo26125p((long) i);
        mVar.mo26124o(j);
        return mVar;
    }

    /* renamed from: b */
    private int m35465b(C10543j jVar, boolean z) {
        int i = z ? 32 : 0;
        if (jVar.mo26033c() != null) {
            i += 11;
        }
        if (jVar.mo26040i() != null) {
            for (C10542i next : jVar.mo26040i()) {
                if (!(next.mo26086d() == C10502d.AES_EXTRA_DATA_RECORD.mo25904e() || next.mo26086d() == C10502d.ZIP64_EXTRA_FIELD_SIGNATURE.mo25904e())) {
                    i += next.mo26087e() + 4;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    private long m35466c(List<C10543j> list, int i) {
        if (list != null) {
            int i2 = 0;
            for (C10543j O : list) {
                if (O.mo26091O() == i) {
                    i2++;
                }
            }
            return (long) i2;
        }
        throw new C10497a("file headers are null, cannot calculate number of entries on this disk");
    }

    /* renamed from: e */
    private int m35467e(OutputStream outputStream) {
        return outputStream instanceof C10529h ? ((C10529h) outputStream).mo25977a() : ((C10524d) outputStream).mo25977a();
    }

    /* renamed from: f */
    private long m35468f(C10549p pVar) {
        return (!pVar.mo26150l() || pVar.mo26147i() == null || pVar.mo26147i().mo26114e() == -1) ? pVar.mo26143d().mo26073g() : pVar.mo26147i().mo26114e();
    }

    /* renamed from: g */
    private boolean m35469g(OutputStream outputStream) {
        if (outputStream instanceof C10529h) {
            return ((C10529h) outputStream).mo25987E();
        }
        if (outputStream instanceof C10524d) {
            return ((C10524d) outputStream).mo25976E();
        }
        return false;
    }

    /* renamed from: h */
    private boolean m35470h(C10543j jVar) {
        return jVar.mo26034d() >= 4294967295L || jVar.mo26046o() >= 4294967295L || jVar.mo26094R() >= 4294967295L || jVar.mo26091O() >= 65535;
    }

    /* renamed from: i */
    private void m35471i(C10549p pVar, OutputStream outputStream) {
        int i;
        if (outputStream instanceof C10528g) {
            C10528g gVar = (C10528g) outputStream;
            pVar.mo26143d().mo26080n(gVar.mo25978b());
            i = gVar.mo25977a();
        } else {
            i = 0;
        }
        if (pVar.mo26150l()) {
            if (pVar.mo26147i() == null) {
                pVar.mo26156s(new C10546m());
            }
            if (pVar.mo26146g() == null) {
                pVar.mo26155r(new C10545l());
            }
            pVar.mo26147i().mo26124o(pVar.mo26143d().mo26073g());
            pVar.mo26146g().mo26109f(i);
            pVar.mo26146g().mo26111h(i + 1);
        }
        pVar.mo26143d().mo26077k(i);
        pVar.mo26143d().mo26078l(i);
    }

    /* renamed from: j */
    private void m35472j(C10529h hVar, C10543j jVar) {
        int i = (jVar.mo26046o() > 4294967295L ? 1 : (jVar.mo26046o() == 4294967295L ? 0 : -1));
        C10583f fVar = this.f27734a;
        byte[] bArr = this.f27735b;
        if (i >= 0) {
            fVar.mo26258r(bArr, 0, 4294967295L);
            hVar.write(this.f27735b, 0, 4);
            hVar.write(this.f27735b, 0, 4);
            int l = jVar.mo26043l() + 4 + 2 + 2;
            if (hVar.mo25989L(l) == l) {
                this.f27734a.mo26257q(hVar, jVar.mo26046o());
                this.f27734a.mo26257q(hVar, jVar.mo26034d());
                return;
            }
            throw new C10497a("Unable to skip " + l + " bytes to update LFH");
        }
        fVar.mo26258r(bArr, 0, jVar.mo26034d());
        hVar.write(this.f27735b, 0, 4);
        this.f27734a.mo26258r(this.f27735b, 0, jVar.mo26046o());
        hVar.write(this.f27735b, 0, 4);
    }

    /* renamed from: l */
    private void m35473l(C10549p pVar, ByteArrayOutputStream byteArrayOutputStream, C10583f fVar, Charset charset) {
        if (pVar.mo26141c() != null && pVar.mo26141c().mo26058a() != null && pVar.mo26141c().mo26058a().size() > 0) {
            for (C10543j o : pVar.mo26141c().mo26058a()) {
                m35475o(pVar, o, byteArrayOutputStream, fVar, charset);
            }
        }
    }

    /* renamed from: m */
    private void m35474m(C10549p pVar, int i, long j, ByteArrayOutputStream byteArrayOutputStream, C10583f fVar, Charset charset) {
        byte[] bArr = new byte[8];
        fVar.mo26255o(byteArrayOutputStream, (int) C10502d.END_OF_CENTRAL_DIRECTORY.mo25904e());
        fVar.mo26259s(byteArrayOutputStream, pVar.mo26143d().mo26070d());
        fVar.mo26259s(byteArrayOutputStream, pVar.mo26143d().mo26071e());
        long size = (long) pVar.mo26141c().mo26058a().size();
        long c = pVar.mo26149k() ? m35466c(pVar.mo26141c().mo26058a(), pVar.mo26143d().mo26070d()) : size;
        if (c > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            c = 65535;
        }
        fVar.mo26259s(byteArrayOutputStream, (int) c);
        if (size > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            size = 65535;
        }
        fVar.mo26259s(byteArrayOutputStream, (int) size);
        fVar.mo26255o(byteArrayOutputStream, i);
        if (j > 4294967295L) {
            fVar.mo26258r(bArr, 0, 4294967295L);
        } else {
            fVar.mo26258r(bArr, 0, j);
        }
        byteArrayOutputStream.write(bArr, 0, 4);
        String c2 = pVar.mo26143d().mo26069c();
        if (C10585h.m35940g(c2)) {
            byte[] bytes = c2.getBytes(charset);
            fVar.mo26259s(byteArrayOutputStream, bytes.length);
            byteArrayOutputStream.write(bytes);
            return;
        }
        fVar.mo26259s(byteArrayOutputStream, 0);
    }

    /* renamed from: o */
    private void m35475o(C10549p pVar, C10543j jVar, ByteArrayOutputStream byteArrayOutputStream, C10583f fVar, Charset charset) {
        byte[] bArr;
        C10549p pVar2 = pVar;
        C10543j jVar2 = jVar;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        C10583f fVar2 = fVar;
        Charset charset2 = charset;
        if (jVar2 != null) {
            try {
                byte[] bArr2 = {0, 0};
                boolean h = m35470h(jVar2);
                fVar2.mo26255o(byteArrayOutputStream2, (int) jVar.mo26139a().mo25904e());
                fVar2.mo26259s(byteArrayOutputStream2, jVar.mo26095S());
                fVar2.mo26259s(byteArrayOutputStream2, jVar.mo26047p());
                byteArrayOutputStream2.write(jVar.mo26044m());
                fVar2.mo26259s(byteArrayOutputStream2, jVar.mo26035e().mo26198e());
                fVar2.mo26258r(this.f27735b, 0, jVar.mo26045n());
                byteArrayOutputStream2.write(this.f27735b, 0, 4);
                fVar2.mo26258r(this.f27735b, 0, jVar.mo26037f());
                byteArrayOutputStream2.write(this.f27735b, 0, 4);
                if (h) {
                    fVar2.mo26258r(this.f27735b, 0, 4294967295L);
                    byteArrayOutputStream2.write(this.f27735b, 0, 4);
                    byteArrayOutputStream2.write(this.f27735b, 0, 4);
                    pVar2.mo26157t(true);
                    bArr = bArr2;
                } else {
                    bArr = bArr2;
                    fVar2.mo26258r(this.f27735b, 0, jVar.mo26034d());
                    byteArrayOutputStream2.write(this.f27735b, 0, 4);
                    fVar2.mo26258r(this.f27735b, 0, jVar.mo26046o());
                    byteArrayOutputStream2.write(this.f27735b, 0, 4);
                }
                byte[] bArr3 = new byte[0];
                if (C10585h.m35940g(jVar.mo26042k())) {
                    bArr3 = jVar.mo26042k().getBytes(charset2);
                }
                fVar2.mo26259s(byteArrayOutputStream2, bArr3.length);
                byte[] bArr4 = new byte[4];
                if (h) {
                    fVar2.mo26258r(this.f27735b, 0, 4294967295L);
                    System.arraycopy(this.f27735b, 0, bArr4, 0, 4);
                } else {
                    fVar2.mo26258r(this.f27735b, 0, jVar.mo26094R());
                    System.arraycopy(this.f27735b, 0, bArr4, 0, 4);
                }
                fVar2.mo26259s(byteArrayOutputStream2, m35465b(jVar2, h));
                String Q = jVar.mo26093Q();
                byte[] bArr5 = new byte[0];
                if (C10585h.m35940g(Q)) {
                    bArr5 = Q.getBytes(charset2);
                }
                fVar2.mo26259s(byteArrayOutputStream2, bArr5.length);
                if (h) {
                    fVar2.mo26256p(this.f27736c, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    byteArrayOutputStream2.write(this.f27736c, 0, 2);
                } else {
                    fVar2.mo26259s(byteArrayOutputStream2, jVar.mo26091O());
                }
                byteArrayOutputStream2.write(bArr);
                byteArrayOutputStream2.write(jVar.mo26092P());
                byteArrayOutputStream2.write(bArr4);
                if (bArr3.length > 0) {
                    byteArrayOutputStream2.write(bArr3);
                }
                if (h) {
                    pVar2.mo26157t(true);
                    fVar2.mo26259s(byteArrayOutputStream2, (int) C10502d.ZIP64_EXTRA_FIELD_SIGNATURE.mo25904e());
                    fVar2.mo26259s(byteArrayOutputStream2, 28);
                    fVar2.mo26257q(byteArrayOutputStream2, jVar.mo26046o());
                    fVar2.mo26257q(byteArrayOutputStream2, jVar.mo26034d());
                    fVar2.mo26257q(byteArrayOutputStream2, jVar.mo26094R());
                    fVar2.mo26255o(byteArrayOutputStream2, jVar.mo26091O());
                }
                if (jVar.mo26033c() != null) {
                    C10534a c = jVar.mo26033c();
                    fVar2.mo26259s(byteArrayOutputStream2, (int) c.mo26139a().mo25904e());
                    fVar2.mo26259s(byteArrayOutputStream2, c.mo26012f());
                    fVar2.mo26259s(byteArrayOutputStream2, c.mo26010d().mo26196g());
                    byteArrayOutputStream2.write(c.mo26013g().getBytes());
                    byteArrayOutputStream2.write(new byte[]{(byte) c.mo26009c().mo26194v()});
                    fVar2.mo26259s(byteArrayOutputStream2, c.mo26011e().mo26198e());
                }
                m35476q(jVar2, byteArrayOutputStream2);
                if (bArr5.length > 0) {
                    byteArrayOutputStream2.write(bArr5);
                }
            } catch (Exception e) {
                throw new C10497a(e);
            }
        } else {
            throw new C10497a("input parameters is null, cannot write local file header");
        }
    }

    /* renamed from: q */
    private void m35476q(C10543j jVar, OutputStream outputStream) {
        if (jVar.mo26040i() != null && jVar.mo26040i().size() != 0) {
            for (C10542i next : jVar.mo26040i()) {
                if (!(next.mo26086d() == C10502d.AES_EXTRA_DATA_RECORD.mo25904e() || next.mo26086d() == C10502d.ZIP64_EXTRA_FIELD_SIGNATURE.mo25904e())) {
                    this.f27734a.mo26259s(outputStream, (int) next.mo26086d());
                    this.f27734a.mo26259s(outputStream, next.mo26087e());
                    if (next.mo26087e() > 0 && next.mo26085c() != null) {
                        outputStream.write(next.mo26085c());
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private void m35477r(C10545l lVar, ByteArrayOutputStream byteArrayOutputStream, C10583f fVar) {
        fVar.mo26255o(byteArrayOutputStream, (int) C10502d.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.mo25904e());
        fVar.mo26255o(byteArrayOutputStream, lVar.mo26106c());
        fVar.mo26257q(byteArrayOutputStream, lVar.mo26107d());
        fVar.mo26255o(byteArrayOutputStream, lVar.mo26108e());
    }

    /* renamed from: s */
    private void m35478s(C10546m mVar, ByteArrayOutputStream byteArrayOutputStream, C10583f fVar) {
        fVar.mo26255o(byteArrayOutputStream, (int) mVar.mo26139a().mo25904e());
        fVar.mo26257q(byteArrayOutputStream, mVar.mo26116g());
        fVar.mo26259s(byteArrayOutputStream, mVar.mo26119j());
        fVar.mo26259s(byteArrayOutputStream, mVar.mo26120k());
        fVar.mo26255o(byteArrayOutputStream, mVar.mo26112c());
        fVar.mo26255o(byteArrayOutputStream, mVar.mo26113d());
        fVar.mo26257q(byteArrayOutputStream, mVar.mo26118i());
        fVar.mo26257q(byteArrayOutputStream, mVar.mo26117h());
        fVar.mo26257q(byteArrayOutputStream, mVar.mo26115f());
        fVar.mo26257q(byteArrayOutputStream, mVar.mo26114e());
    }

    /* renamed from: t */
    private void m35479t(C10549p pVar, OutputStream outputStream, byte[] bArr, Charset charset) {
        if (bArr == null) {
            throw new C10497a("invalid buff to write as zip headers");
        } else if (!(outputStream instanceof C10524d) || !((C10524d) outputStream).mo25980h(bArr.length)) {
            outputStream.write(bArr);
        } else {
            mo25905d(pVar, outputStream, charset);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b3, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b9, code lost:
        r10.addSuppressed(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        throw r11;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25905d(p477h.p478a.p479a.p488f.C10549p r10, java.io.OutputStream r11, java.nio.charset.Charset r12) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x00bd
            if (r11 == 0) goto L_0x00bd
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream
            r8.<init>()
            r9.m35471i(r10, r11)     // Catch:{ all -> 0x00b1 }
            long r3 = r9.m35468f(r10)     // Catch:{ all -> 0x00b1 }
            h.a.a.i.f r0 = r9.f27734a     // Catch:{ all -> 0x00b1 }
            r9.m35473l(r10, r8, r0, r12)     // Catch:{ all -> 0x00b1 }
            int r2 = r8.size()     // Catch:{ all -> 0x00b1 }
            boolean r0 = r10.mo26150l()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0039
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0039
            h.a.a.f.d r0 = r10.mo26141c()     // Catch:{ all -> 0x00b1 }
            java.util.List r0 = r0.mo26058a()     // Catch:{ all -> 0x00b1 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b1 }
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 < r1) goto L_0x009d
        L_0x0039:
            h.a.a.f.m r0 = r10.mo26147i()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0047
            h.a.a.f.m r0 = new h.a.a.f.m     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            r10.mo26156s(r0)     // Catch:{ all -> 0x00b1 }
        L_0x0047:
            h.a.a.f.l r0 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x0055
            h.a.a.f.l r0 = new h.a.a.f.l     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            r10.mo26155r(r0)     // Catch:{ all -> 0x00b1 }
        L_0x0055:
            h.a.a.f.l r0 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            long r5 = (long) r2     // Catch:{ all -> 0x00b1 }
            long r5 = r5 + r3
            r0.mo26110g(r5)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r9.m35469g(r11)     // Catch:{ all -> 0x00b1 }
            r1 = 1
            if (r0 == 0) goto L_0x0079
            int r0 = r9.m35467e(r11)     // Catch:{ all -> 0x00b1 }
            h.a.a.f.l r5 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            r5.mo26109f(r0)     // Catch:{ all -> 0x00b1 }
            h.a.a.f.l r5 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            int r0 = r0 + r1
            r5.mo26111h(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x0088
        L_0x0079:
            h.a.a.f.l r0 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            r5 = 0
            r0.mo26109f(r5)     // Catch:{ all -> 0x00b1 }
            h.a.a.f.l r0 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            r0.mo26111h(r1)     // Catch:{ all -> 0x00b1 }
        L_0x0088:
            h.a.a.f.m r0 = r9.m35464a(r10, r2, r3)     // Catch:{ all -> 0x00b1 }
            r10.mo26156s(r0)     // Catch:{ all -> 0x00b1 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x00b1 }
            r9.m35478s(r0, r8, r1)     // Catch:{ all -> 0x00b1 }
            h.a.a.f.l r0 = r10.mo26146g()     // Catch:{ all -> 0x00b1 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x00b1 }
            r9.m35477r(r0, r8, r1)     // Catch:{ all -> 0x00b1 }
        L_0x009d:
            h.a.a.i.f r6 = r9.f27734a     // Catch:{ all -> 0x00b1 }
            r0 = r9
            r1 = r10
            r5 = r8
            r7 = r12
            r0.m35474m(r1, r2, r3, r5, r6, r7)     // Catch:{ all -> 0x00b1 }
            byte[] r0 = r8.toByteArray()     // Catch:{ all -> 0x00b1 }
            r9.m35479t(r10, r11, r0, r12)     // Catch:{ all -> 0x00b1 }
            r8.close()
            return
        L_0x00b1:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r11 = move-exception
            r8.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            r12 = move-exception
            r10.addSuppressed(r12)
        L_0x00bc:
            throw r11
        L_0x00bd:
            h.a.a.c.a r10 = new h.a.a.c.a
            java.lang.String r11 = "input parameters is null, cannot finalize zip file"
            r10.<init>((java.lang.String) r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p484d.C10504f.mo25905d(h.a.a.f.p, java.io.OutputStream, java.nio.charset.Charset):void");
    }

    /* renamed from: k */
    public void mo25906k(C10543j jVar, C10549p pVar, C10529h hVar) {
        C10529h hVar2;
        String str;
        StringBuilder sb;
        if (jVar == null || pVar == null) {
            throw new C10497a("invalid input parameters, cannot update local file header");
        }
        boolean z = true;
        if (jVar.mo26091O() != hVar.mo25977a()) {
            String parent = pVar.mo26148j().getParent();
            String t = C10581d.m35905t(pVar.mo26148j().getName());
            String str2 = parent + System.getProperty("file.separator");
            if (jVar.mo26091O() < 9) {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(t);
                str = ".z0";
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                sb.append(t);
                str = ".z";
            }
            sb.append(str);
            sb.append(jVar.mo26091O() + 1);
            hVar2 = new C10529h(new File(sb.toString()));
        } else {
            hVar2 = hVar;
            z = false;
        }
        long b = hVar2.mo25978b();
        hVar2.mo25988I(jVar.mo26094R() + 14);
        this.f27734a.mo26258r(this.f27735b, 0, jVar.mo26037f());
        hVar2.write(this.f27735b, 0, 4);
        m35472j(hVar2, jVar);
        if (z) {
            hVar2.close();
        } else {
            hVar.mo25988I(b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r9.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        throw r10;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25907n(p477h.p478a.p479a.p488f.C10544k r9, java.io.OutputStream r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0077
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            h.a.a.d.d r2 = p477h.p478a.p479a.p484d.C10502d.EXTRA_DATA_RECORD     // Catch:{ all -> 0x006b }
            long r2 = r2.mo25904e()     // Catch:{ all -> 0x006b }
            int r3 = (int) r2     // Catch:{ all -> 0x006b }
            r1.mo26255o(r0, r3)     // Catch:{ all -> 0x006b }
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            byte[] r2 = r8.f27735b     // Catch:{ all -> 0x006b }
            long r3 = r9.mo26037f()     // Catch:{ all -> 0x006b }
            r5 = 0
            r1.mo26258r(r2, r5, r3)     // Catch:{ all -> 0x006b }
            byte[] r1 = r8.f27735b     // Catch:{ all -> 0x006b }
            r2 = 4
            r0.write(r1, r5, r2)     // Catch:{ all -> 0x006b }
            boolean r1 = r9.mo26104O()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0040
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            long r2 = r9.mo26034d()     // Catch:{ all -> 0x006b }
            r1.mo26257q(r0, r2)     // Catch:{ all -> 0x006b }
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            long r2 = r9.mo26046o()     // Catch:{ all -> 0x006b }
            r1.mo26257q(r0, r2)     // Catch:{ all -> 0x006b }
            goto L_0x0060
        L_0x0040:
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            byte[] r3 = r8.f27735b     // Catch:{ all -> 0x006b }
            long r6 = r9.mo26034d()     // Catch:{ all -> 0x006b }
            r1.mo26258r(r3, r5, r6)     // Catch:{ all -> 0x006b }
            byte[] r1 = r8.f27735b     // Catch:{ all -> 0x006b }
            r0.write(r1, r5, r2)     // Catch:{ all -> 0x006b }
            h.a.a.i.f r1 = r8.f27734a     // Catch:{ all -> 0x006b }
            byte[] r3 = r8.f27735b     // Catch:{ all -> 0x006b }
            long r6 = r9.mo26046o()     // Catch:{ all -> 0x006b }
            r1.mo26258r(r3, r5, r6)     // Catch:{ all -> 0x006b }
            byte[] r9 = r8.f27735b     // Catch:{ all -> 0x006b }
            r0.write(r9, r5, r2)     // Catch:{ all -> 0x006b }
        L_0x0060:
            byte[] r9 = r0.toByteArray()     // Catch:{ all -> 0x006b }
            r10.write(r9)     // Catch:{ all -> 0x006b }
            r0.close()
            return
        L_0x006b:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x006d }
        L_0x006d:
            r10 = move-exception
            r0.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            r9.addSuppressed(r0)
        L_0x0076:
            throw r10
        L_0x0077:
            h.a.a.c.a r9 = new h.a.a.c.a
            java.lang.String r10 = "input parameters is null, cannot write extended local header"
            r9.<init>((java.lang.String) r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p484d.C10504f.mo25907n(h.a.a.f.k, java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0166, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016b, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016c, code lost:
        r10.addSuppressed(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016f, code lost:
        throw r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006e A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0086 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b5 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c5 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c8 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cf A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d9 A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00de A[Catch:{ all -> 0x0166 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0109 A[Catch:{ all -> 0x0166 }] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25908p(p477h.p478a.p479a.p488f.C10549p r10, p477h.p478a.p479a.p488f.C10544k r11, java.io.OutputStream r12, java.nio.charset.Charset r13) {
        /*
            r9 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.d.d r2 = r11.mo26139a()     // Catch:{ all -> 0x0164 }
            long r2 = r2.mo25904e()     // Catch:{ all -> 0x0164 }
            int r3 = (int) r2     // Catch:{ all -> 0x0164 }
            r1.mo26255o(r0, r3)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x0164 }
            int r2 = r11.mo26047p()     // Catch:{ all -> 0x0164 }
            r1.mo26259s(r0, r2)     // Catch:{ all -> 0x0164 }
            byte[] r1 = r11.mo26044m()     // Catch:{ all -> 0x0164 }
            r0.write(r1)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.f.r.d r2 = r11.mo26035e()     // Catch:{ all -> 0x0164 }
            int r2 = r2.mo26198e()     // Catch:{ all -> 0x0164 }
            r1.mo26259s(r0, r2)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x0164 }
            byte[] r2 = r9.f27735b     // Catch:{ all -> 0x0164 }
            long r3 = r11.mo26045n()     // Catch:{ all -> 0x0164 }
            r5 = 0
            r1.mo26258r(r2, r5, r3)     // Catch:{ all -> 0x0164 }
            byte[] r1 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r2 = 4
            r0.write(r1, r5, r2)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r1 = r9.f27734a     // Catch:{ all -> 0x0164 }
            byte[] r3 = r9.f27735b     // Catch:{ all -> 0x0164 }
            long r6 = r11.mo26037f()     // Catch:{ all -> 0x0164 }
            r1.mo26258r(r3, r5, r6)     // Catch:{ all -> 0x0164 }
            byte[] r1 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r0.write(r1, r5, r2)     // Catch:{ all -> 0x0164 }
            long r3 = r11.mo26034d()     // Catch:{ all -> 0x0164 }
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x006b
            long r3 = r11.mo26046o()     // Catch:{ all -> 0x0164 }
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r3 = 0
            goto L_0x006c
        L_0x006b:
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x0086
            h.a.a.i.f r4 = r9.f27734a     // Catch:{ all -> 0x0164 }
            byte[] r8 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r4.mo26258r(r8, r5, r6)     // Catch:{ all -> 0x0164 }
            byte[] r4 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r0.write(r4, r5, r2)     // Catch:{ all -> 0x0164 }
            byte[] r4 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r0.write(r4, r5, r2)     // Catch:{ all -> 0x0164 }
            r10.mo26157t(r1)     // Catch:{ all -> 0x0164 }
            r11.mo26105P(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x00a9
        L_0x0086:
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            byte[] r4 = r9.f27735b     // Catch:{ all -> 0x0164 }
            long r6 = r11.mo26034d()     // Catch:{ all -> 0x0164 }
            r10.mo26258r(r4, r5, r6)     // Catch:{ all -> 0x0164 }
            byte[] r10 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r0.write(r10, r5, r2)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            byte[] r4 = r9.f27735b     // Catch:{ all -> 0x0164 }
            long r6 = r11.mo26046o()     // Catch:{ all -> 0x0164 }
            r10.mo26258r(r4, r5, r6)     // Catch:{ all -> 0x0164 }
            byte[] r10 = r9.f27735b     // Catch:{ all -> 0x0164 }
            r0.write(r10, r5, r2)     // Catch:{ all -> 0x0164 }
            r11.mo26105P(r5)     // Catch:{ all -> 0x0164 }
        L_0x00a9:
            byte[] r10 = new byte[r5]     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = r11.mo26042k()     // Catch:{ all -> 0x0164 }
            boolean r2 = p477h.p478a.p479a.p492i.C10585h.m35940g(r2)     // Catch:{ all -> 0x0164 }
            if (r2 == 0) goto L_0x00bd
            java.lang.String r10 = r11.mo26042k()     // Catch:{ all -> 0x0164 }
            byte[] r10 = r10.getBytes(r13)     // Catch:{ all -> 0x0164 }
        L_0x00bd:
            h.a.a.i.f r13 = r9.f27734a     // Catch:{ all -> 0x0164 }
            int r2 = r10.length     // Catch:{ all -> 0x0164 }
            r13.mo26259s(r0, r2)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x00c8
            r13 = 20
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            h.a.a.f.a r2 = r11.mo26033c()     // Catch:{ all -> 0x0164 }
            if (r2 == 0) goto L_0x00d1
            int r13 = r13 + 11
        L_0x00d1:
            h.a.a.i.f r2 = r9.f27734a     // Catch:{ all -> 0x0164 }
            r2.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            int r13 = r10.length     // Catch:{ all -> 0x0164 }
            if (r13 <= 0) goto L_0x00dc
            r0.write(r10)     // Catch:{ all -> 0x0164 }
        L_0x00dc:
            if (r3 == 0) goto L_0x0103
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.d.d r13 = p477h.p478a.p479a.p484d.C10502d.ZIP64_EXTRA_FIELD_SIGNATURE     // Catch:{ all -> 0x0164 }
            long r2 = r13.mo25904e()     // Catch:{ all -> 0x0164 }
            int r13 = (int) r2     // Catch:{ all -> 0x0164 }
            r10.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            r13 = 16
            r10.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            long r2 = r11.mo26046o()     // Catch:{ all -> 0x0164 }
            r10.mo26257q(r0, r2)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r10 = r9.f27734a     // Catch:{ all -> 0x0164 }
            long r2 = r11.mo26034d()     // Catch:{ all -> 0x0164 }
            r10.mo26257q(r0, r2)     // Catch:{ all -> 0x0164 }
        L_0x0103:
            h.a.a.f.a r10 = r11.mo26033c()     // Catch:{ all -> 0x0164 }
            if (r10 == 0) goto L_0x0159
            h.a.a.f.a r10 = r11.mo26033c()     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r11 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.d.d r13 = r10.mo26139a()     // Catch:{ all -> 0x0164 }
            long r2 = r13.mo25904e()     // Catch:{ all -> 0x0164 }
            int r13 = (int) r2     // Catch:{ all -> 0x0164 }
            r11.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r11 = r9.f27734a     // Catch:{ all -> 0x0164 }
            int r13 = r10.mo26012f()     // Catch:{ all -> 0x0164 }
            r11.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r11 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.f.r.b r13 = r10.mo26010d()     // Catch:{ all -> 0x0164 }
            int r13 = r13.mo26196g()     // Catch:{ all -> 0x0164 }
            r11.mo26259s(r0, r13)     // Catch:{ all -> 0x0164 }
            java.lang.String r11 = r10.mo26013g()     // Catch:{ all -> 0x0164 }
            byte[] r11 = r11.getBytes()     // Catch:{ all -> 0x0164 }
            r0.write(r11)     // Catch:{ all -> 0x0164 }
            byte[] r11 = new byte[r1]     // Catch:{ all -> 0x0164 }
            h.a.a.f.r.a r13 = r10.mo26009c()     // Catch:{ all -> 0x0164 }
            int r13 = r13.mo26194v()     // Catch:{ all -> 0x0164 }
            byte r13 = (byte) r13     // Catch:{ all -> 0x0164 }
            r11[r5] = r13     // Catch:{ all -> 0x0164 }
            r0.write(r11)     // Catch:{ all -> 0x0164 }
            h.a.a.i.f r11 = r9.f27734a     // Catch:{ all -> 0x0164 }
            h.a.a.f.r.d r10 = r10.mo26011e()     // Catch:{ all -> 0x0164 }
            int r10 = r10.mo26198e()     // Catch:{ all -> 0x0164 }
            r11.mo26259s(r0, r10)     // Catch:{ all -> 0x0164 }
        L_0x0159:
            byte[] r10 = r0.toByteArray()     // Catch:{ all -> 0x0164 }
            r12.write(r10)     // Catch:{ all -> 0x0164 }
            r0.close()
            return
        L_0x0164:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r11 = move-exception
            r0.close()     // Catch:{ all -> 0x016b }
            goto L_0x016f
        L_0x016b:
            r12 = move-exception
            r10.addSuppressed(r12)
        L_0x016f:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p484d.C10504f.mo25908p(h.a.a.f.p, h.a.a.f.k, java.io.OutputStream, java.nio.charset.Charset):void");
    }
}
