package p477h.p478a.p479a.p484d;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p485e.p486a.C10514g;
import p477h.p478a.p479a.p488f.C10534a;
import p477h.p478a.p479a.p488f.C10537d;
import p477h.p478a.p479a.p488f.C10538e;
import p477h.p478a.p479a.p488f.C10539f;
import p477h.p478a.p479a.p488f.C10540g;
import p477h.p478a.p479a.p488f.C10542i;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10544k;
import p477h.p478a.p479a.p488f.C10545l;
import p477h.p478a.p479a.p488f.C10546m;
import p477h.p478a.p479a.p488f.C10547n;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.p489r.C10552a;
import p477h.p478a.p479a.p488f.p489r.C10553b;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;
import p477h.p478a.p479a.p492i.C10579b;
import p477h.p478a.p479a.p492i.C10583f;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.d.c */
public class C10501c {

    /* renamed from: a */
    private C10549p f27718a;

    /* renamed from: b */
    private C10583f f27719b = new C10583f();

    /* renamed from: c */
    private byte[] f27720c = new byte[4];

    /* renamed from: a */
    private long m35433a(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4096];
        long filePointer = randomAccessFile.getFilePointer();
        do {
            int i = filePointer > 4096 ? 4096 : (int) filePointer;
            filePointer = (filePointer - ((long) i)) + 4;
            if (filePointer == 4) {
                filePointer = 0;
            }
            m35451v(randomAccessFile, filePointer);
            randomAccessFile.read(bArr, 0, i);
            for (int i2 = 0; i2 < i - 3; i2++) {
                if (((long) this.f27719b.mo26246e(bArr, i2)) == C10502d.END_OF_CENTRAL_DIRECTORY.mo25904e()) {
                    return filePointer + ((long) i2);
                }
            }
        } while (filePointer > 0);
        throw new C10497a("Zip headers not found. Probably not a zip file");
    }

    /* renamed from: b */
    private long m35434b(C10549p pVar) {
        return pVar.mo26150l() ? pVar.mo26147i().mo26117h() : (long) pVar.mo26143d().mo26074h();
    }

    /* renamed from: c */
    private List<C10542i> m35435c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < i) {
            C10542i iVar = new C10542i();
            iVar.mo26089g((long) this.f27719b.mo26254m(bArr, i2));
            int i3 = i2 + 2;
            int m = this.f27719b.mo26254m(bArr, i3);
            iVar.mo26090h(m);
            int i4 = i3 + 2;
            if (m > 0) {
                byte[] bArr2 = new byte[m];
                System.arraycopy(bArr, i4, bArr2, 0, m);
                iVar.mo26088f(bArr2);
            }
            i2 = i4 + m;
            arrayList.add(iVar);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: d */
    private C10534a m35436d(List<C10542i> list, C10583f fVar) {
        if (list == null) {
            return null;
        }
        for (C10542i next : list) {
            if (next != null) {
                long d = next.mo26086d();
                C10502d dVar = C10502d.AES_EXTRA_DATA_RECORD;
                if (d == dVar.mo25904e()) {
                    if (next.mo26085c() != null) {
                        C10534a aVar = new C10534a();
                        aVar.mo26140b(dVar);
                        aVar.mo26017k(next.mo26087e());
                        byte[] c = next.mo26085c();
                        aVar.mo26015i(C10553b.m35777e(fVar.mo26254m(c, 0)));
                        byte[] bArr = new byte[2];
                        System.arraycopy(c, 2, bArr, 0, 2);
                        aVar.mo26018l(new String(bArr));
                        aVar.mo26014h(C10552a.m35772e(c[4] & 255));
                        aVar.mo26016j(C10555d.m35780g(fVar.mo26254m(c, 5)));
                        return aVar;
                    }
                    throw new C10497a("corrupt AES extra data records");
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m35437e(C10543j jVar, C10583f fVar) {
        C10534a d;
        if (jVar.mo26040i() != null && jVar.mo26040i().size() > 0 && (d = m35436d(jVar.mo26040i(), fVar)) != null) {
            jVar.mo26053v(d);
            jVar.mo26022D(C10556e.AES);
        }
    }

    /* renamed from: f */
    private void m35438f(C10544k kVar, C10583f fVar) {
        C10534a d;
        if (kVar.mo26040i() != null && kVar.mo26040i().size() > 0 && (d = m35436d(kVar.mo26040i(), fVar)) != null) {
            kVar.mo26053v(d);
            kVar.mo26022D(C10556e.AES);
        }
    }

    /* renamed from: h */
    private C10537d m35439h(RandomAccessFile randomAccessFile, C10583f fVar, Charset charset) {
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        C10583f fVar2 = fVar;
        Charset charset2 = charset;
        C10537d dVar = new C10537d();
        ArrayList arrayList = new ArrayList();
        long e = C10503e.m35461e(this.f27718a);
        long b = m35434b(this.f27718a);
        randomAccessFile2.seek(e);
        int i = 2;
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[4];
        int i2 = 0;
        int i3 = 0;
        while (((long) i3) < b) {
            C10543j jVar = new C10543j();
            byte[] bArr3 = bArr2;
            long c = (long) fVar2.mo26244c(randomAccessFile2);
            C10502d dVar2 = C10502d.CENTRAL_DIRECTORY;
            if (c == dVar2.mo25904e()) {
                jVar.mo26140b(dVar2);
                jVar.mo26102Z(fVar2.mo26253l(randomAccessFile2));
                jVar.mo26031M(fVar2.mo26253l(randomAccessFile2));
                byte[] bArr4 = new byte[i];
                randomAccessFile2.readFully(bArr4);
                jVar.mo26021C(C10579b.m35876a(bArr4[i2], i2));
                jVar.mo26019A(C10579b.m35876a(bArr4[i2], 3));
                jVar.mo26027I(C10579b.m35876a(bArr4[1], 3));
                jVar.mo26028J((byte[]) bArr4.clone());
                jVar.mo26055x(C10555d.m35780g(fVar2.mo26253l(randomAccessFile2)));
                jVar.mo26029K((long) fVar2.mo26244c(randomAccessFile2));
                byte[] bArr5 = bArr3;
                randomAccessFile2.readFully(bArr5);
                jVar.mo26056y(fVar2.mo26251j(bArr5, i2));
                jVar.mo26057z(bArr5);
                jVar.mo26054w(fVar2.mo26250i(randomAccessFile2, 4));
                jVar.mo26030L(fVar2.mo26250i(randomAccessFile2, 4));
                int l = fVar2.mo26253l(randomAccessFile2);
                jVar.mo26026H(l);
                jVar.mo26024F(fVar2.mo26253l(randomAccessFile2));
                int l2 = fVar2.mo26253l(randomAccessFile2);
                jVar.mo26099W(l2);
                jVar.mo26096T(fVar2.mo26253l(randomAccessFile2));
                byte[] bArr6 = bArr;
                randomAccessFile2.readFully(bArr6);
                jVar.mo26100X((byte[]) bArr6.clone());
                randomAccessFile2.readFully(bArr5);
                jVar.mo26097U((byte[]) bArr5.clone());
                randomAccessFile2.readFully(bArr5);
                long j = b;
                jVar.mo26101Y(fVar2.mo26251j(bArr5, 0));
                if (l > 0) {
                    byte[] bArr7 = new byte[l];
                    randomAccessFile2.readFully(bArr7);
                    String a = C10503e.m35457a(bArr7, jVar.mo26052u(), charset2);
                    if (a.contains(":\\")) {
                        a = a.substring(a.indexOf(":\\") + 2);
                    }
                    jVar.mo26025G(a);
                    jVar.mo26020B(a.endsWith("/") || a.endsWith("\\"));
                } else {
                    jVar.mo26025G((String) null);
                }
                m35444n(randomAccessFile2, jVar);
                m35448s(jVar, fVar2);
                m35437e(jVar, fVar2);
                if (l2 > 0) {
                    byte[] bArr8 = new byte[l2];
                    randomAccessFile2.readFully(bArr8);
                    jVar.mo26098V(C10503e.m35457a(bArr8, jVar.mo26052u(), charset2));
                }
                if (jVar.mo26051t()) {
                    jVar.mo26022D(jVar.mo26033c() != null ? C10556e.AES : C10556e.ZIP_STANDARD);
                }
                arrayList.add(jVar);
                i3++;
                bArr = bArr6;
                bArr2 = bArr5;
                b = j;
                i = 2;
                i2 = 0;
            } else {
                throw new C10497a("Expected central directory entry not found (#" + (i3 + 1) + ")");
            }
        }
        dVar.mo26059b(arrayList);
        C10539f fVar3 = new C10539f();
        C10502d dVar3 = C10502d.DIGITAL_SIGNATURE;
        if (((long) fVar2.mo26244c(randomAccessFile2)) == dVar3.mo25904e()) {
            fVar3.mo26140b(dVar3);
            fVar3.mo26068e(fVar2.mo26253l(randomAccessFile2));
            if (fVar3.mo26066c() > 0) {
                byte[] bArr9 = new byte[fVar3.mo26066c()];
                randomAccessFile2.readFully(bArr9);
                fVar3.mo26067d(new String(bArr9));
            }
        }
        return dVar;
    }

    /* renamed from: j */
    private C10540g m35440j(RandomAccessFile randomAccessFile, C10583f fVar, Charset charset) {
        long length = randomAccessFile.length() - 22;
        m35451v(randomAccessFile, length);
        C10502d dVar = C10502d.END_OF_CENTRAL_DIRECTORY;
        if (((long) fVar.mo26244c(randomAccessFile)) != dVar.mo25904e()) {
            length = m35433a(randomAccessFile);
            randomAccessFile.seek(4 + length);
        }
        C10540g gVar = new C10540g();
        gVar.mo26140b(dVar);
        gVar.mo26077k(fVar.mo26253l(randomAccessFile));
        gVar.mo26078l(fVar.mo26253l(randomAccessFile));
        gVar.mo26083q(fVar.mo26253l(randomAccessFile));
        gVar.mo26082p(fVar.mo26253l(randomAccessFile));
        gVar.mo26081o(fVar.mo26244c(randomAccessFile));
        gVar.mo26079m(length);
        randomAccessFile.readFully(this.f27720c);
        boolean z = false;
        gVar.mo26080n(fVar.mo26251j(this.f27720c, 0));
        gVar.mo26076j(m35450u(randomAccessFile, fVar.mo26253l(randomAccessFile), charset));
        C10549p pVar = this.f27718a;
        if (gVar.mo26070d() > 0) {
            z = true;
        }
        pVar.mo26153p(z);
        return gVar;
    }

    /* renamed from: k */
    private List<C10542i> m35441k(InputStream inputStream, int i) {
        if (i >= 4) {
            byte[] bArr = new byte[i];
            C10585h.m35941h(inputStream, bArr);
            try {
                return m35435c(bArr, i);
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        } else if (i <= 0) {
            return null;
        } else {
            inputStream.skip((long) i);
            return null;
        }
    }

    /* renamed from: l */
    private List<C10542i> m35442l(RandomAccessFile randomAccessFile, int i) {
        if (i >= 4) {
            byte[] bArr = new byte[i];
            randomAccessFile.read(bArr);
            try {
                return m35435c(bArr, i);
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        } else if (i <= 0) {
            return null;
        } else {
            randomAccessFile.skipBytes(i);
            return null;
        }
    }

    /* renamed from: m */
    private void m35443m(InputStream inputStream, C10544k kVar) {
        int j = kVar.mo26041j();
        if (j > 0) {
            kVar.mo26023E(m35441k(inputStream, j));
        }
    }

    /* renamed from: n */
    private void m35444n(RandomAccessFile randomAccessFile, C10543j jVar) {
        int j = jVar.mo26041j();
        if (j > 0) {
            jVar.mo26023E(m35442l(randomAccessFile, j));
        }
    }

    /* renamed from: p */
    private C10546m m35445p(RandomAccessFile randomAccessFile, C10583f fVar) {
        if (this.f27718a.mo26146g() != null) {
            long d = this.f27718a.mo26146g().mo26107d();
            if (d >= 0) {
                randomAccessFile.seek(d);
                C10546m mVar = new C10546m();
                long c = (long) fVar.mo26244c(randomAccessFile);
                C10502d dVar = C10502d.ZIP64_END_CENTRAL_DIRECTORY_RECORD;
                if (c == dVar.mo25904e()) {
                    mVar.mo26140b(dVar);
                    mVar.mo26126q(fVar.mo26249h(randomAccessFile));
                    mVar.mo26129t(fVar.mo26253l(randomAccessFile));
                    mVar.mo26130u(fVar.mo26253l(randomAccessFile));
                    mVar.mo26122m(fVar.mo26244c(randomAccessFile));
                    mVar.mo26123n(fVar.mo26244c(randomAccessFile));
                    mVar.mo26128s(fVar.mo26249h(randomAccessFile));
                    mVar.mo26127r(fVar.mo26249h(randomAccessFile));
                    mVar.mo26125p(fVar.mo26249h(randomAccessFile));
                    mVar.mo26124o(fVar.mo26249h(randomAccessFile));
                    long g = mVar.mo26116g() - 44;
                    if (g > 0) {
                        byte[] bArr = new byte[((int) g)];
                        randomAccessFile.readFully(bArr);
                        mVar.mo26121l(bArr);
                    }
                    return mVar;
                }
                throw new C10497a("invalid signature for zip64 end of central directory record");
            }
            throw new C10497a("invalid offset for start of end of central directory record");
        }
        throw new C10497a("invalid zip64 end of central directory locator");
    }

    /* renamed from: q */
    private C10545l m35446q(RandomAccessFile randomAccessFile, C10583f fVar, long j) {
        C10545l lVar = new C10545l();
        m35452w(randomAccessFile, j);
        C10502d dVar = C10502d.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR;
        if (((long) fVar.mo26244c(randomAccessFile)) == dVar.mo25904e()) {
            this.f27718a.mo26157t(true);
            lVar.mo26140b(dVar);
            lVar.mo26109f(fVar.mo26244c(randomAccessFile));
            lVar.mo26110g(fVar.mo26249h(randomAccessFile));
            lVar.mo26111h(fVar.mo26244c(randomAccessFile));
            return lVar;
        }
        this.f27718a.mo26157t(false);
        return null;
    }

    /* renamed from: r */
    private C10547n m35447r(List<C10542i> list, C10583f fVar, long j, long j2, long j3, int i) {
        C10583f fVar2 = fVar;
        for (C10542i next : list) {
            if (next != null) {
                if (C10502d.ZIP64_EXTRA_FIELD_SIGNATURE.mo25904e() == next.mo26086d()) {
                    C10547n nVar = new C10547n();
                    byte[] c = next.mo26085c();
                    if (next.mo26087e() <= 0) {
                        return null;
                    }
                    int i2 = 0;
                    if (next.mo26087e() > 0 && j == 4294967295L) {
                        nVar.mo26138j(fVar.mo26251j(c, 0));
                        i2 = 8;
                    }
                    if (i2 < next.mo26087e() && j2 == 4294967295L) {
                        nVar.mo26135g(fVar.mo26251j(c, i2));
                        i2 += 8;
                    }
                    if (i2 < next.mo26087e() && j3 == 4294967295L) {
                        nVar.mo26137i(fVar.mo26251j(c, i2));
                        i2 += 8;
                    }
                    if (i2 < next.mo26087e() && i == 65535) {
                        nVar.mo26136h(fVar.mo26246e(c, i2));
                    }
                    return nVar;
                }
                int i3 = i;
            }
        }
        return null;
    }

    /* renamed from: s */
    private void m35448s(C10543j jVar, C10583f fVar) {
        C10547n r;
        if (jVar.mo26040i() != null && jVar.mo26040i().size() > 0 && (r = m35447r(jVar.mo26040i(), fVar, jVar.mo26046o(), jVar.mo26034d(), jVar.mo26094R(), jVar.mo26091O())) != null) {
            jVar.mo26032N(r);
            if (r.mo26134f() != -1) {
                jVar.mo26030L(r.mo26134f());
            }
            if (r.mo26131c() != -1) {
                jVar.mo26054w(r.mo26131c());
            }
            if (r.mo26133e() != -1) {
                jVar.mo26101Y(r.mo26133e());
            }
            if (r.mo26132d() != -1) {
                jVar.mo26096T(r.mo26132d());
            }
        }
    }

    /* renamed from: t */
    private void m35449t(C10544k kVar, C10583f fVar) {
        C10547n r;
        if (kVar == null) {
            throw new C10497a("file header is null in reading Zip64 Extended Info");
        } else if (kVar.mo26040i() != null && kVar.mo26040i().size() > 0 && (r = m35447r(kVar.mo26040i(), fVar, kVar.mo26046o(), kVar.mo26034d(), 0, 0)) != null) {
            kVar.mo26032N(r);
            if (r.mo26134f() != -1) {
                kVar.mo26030L(r.mo26134f());
            }
            if (r.mo26131c() != -1) {
                kVar.mo26054w(r.mo26131c());
            }
        }
    }

    /* renamed from: u */
    private String m35450u(RandomAccessFile randomAccessFile, int i, Charset charset) {
        if (i <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[i];
            randomAccessFile.readFully(bArr);
            return new String(bArr, charset);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: v */
    private void m35451v(RandomAccessFile randomAccessFile, long j) {
        if (randomAccessFile instanceof C10514g) {
            ((C10514g) randomAccessFile).mo25934o(j);
        } else {
            randomAccessFile.seek(j);
        }
    }

    /* renamed from: w */
    private void m35452w(RandomAccessFile randomAccessFile, long j) {
        m35451v(randomAccessFile, (((j - 4) - 8) - 4) - 4);
    }

    /* renamed from: g */
    public C10549p mo25901g(RandomAccessFile randomAccessFile, Charset charset) {
        boolean z;
        C10549p pVar;
        if (randomAccessFile.length() >= 22) {
            C10549p pVar2 = new C10549p();
            this.f27718a = pVar2;
            try {
                pVar2.mo26152n(m35440j(randomAccessFile, this.f27719b, charset));
                if (this.f27718a.mo26143d().mo26074h() == 0) {
                    return this.f27718a;
                }
                C10549p pVar3 = this.f27718a;
                pVar3.mo26155r(m35446q(randomAccessFile, this.f27719b, pVar3.mo26143d().mo26072f()));
                if (this.f27718a.mo26150l()) {
                    this.f27718a.mo26156s(m35445p(randomAccessFile, this.f27719b));
                    if (this.f27718a.mo26147i() == null || this.f27718a.mo26147i().mo26112c() <= 0) {
                        pVar = this.f27718a;
                        z = false;
                    } else {
                        pVar = this.f27718a;
                        z = true;
                    }
                    pVar.mo26153p(z);
                }
                this.f27718a.mo26151m(m35439h(randomAccessFile, this.f27719b, charset));
                return this.f27718a;
            } catch (C10497a e) {
                throw e;
            } catch (IOException e2) {
                throw new C10497a("Zip headers not found. Probably not a zip file or a corrupted zip file", (Exception) e2);
            }
        } else {
            throw new C10497a("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
    }

    /* renamed from: i */
    public C10538e mo25902i(InputStream inputStream, boolean z) {
        long j;
        C10538e eVar = new C10538e();
        byte[] bArr = new byte[4];
        C10585h.m35941h(inputStream, bArr);
        long j2 = this.f27719b.mo26251j(bArr, 0);
        C10502d dVar = C10502d.EXTRA_DATA_RECORD;
        if (j2 == dVar.mo25904e()) {
            eVar.mo26140b(dVar);
            C10585h.m35941h(inputStream, bArr);
            eVar.mo26064g(this.f27719b.mo26251j(bArr, 0));
        } else {
            eVar.mo26064g(j2);
        }
        if (z) {
            eVar.mo26063f(this.f27719b.mo26247f(inputStream));
            j = this.f27719b.mo26247f(inputStream);
        } else {
            eVar.mo26063f((long) this.f27719b.mo26243b(inputStream));
            j = (long) this.f27719b.mo26243b(inputStream);
        }
        eVar.mo26065h(j);
        return eVar;
    }

    /* renamed from: o */
    public C10544k mo25903o(InputStream inputStream, Charset charset) {
        C10544k kVar = new C10544k();
        byte[] bArr = new byte[4];
        C10502d dVar = C10502d.LOCAL_FILE_HEADER;
        if (((long) this.f27719b.mo26243b(inputStream)) != dVar.mo25904e()) {
            return null;
        }
        kVar.mo26140b(dVar);
        kVar.mo26031M(this.f27719b.mo26252k(inputStream));
        byte[] bArr2 = new byte[2];
        if (C10585h.m35941h(inputStream, bArr2) == 2) {
            kVar.mo26021C(C10579b.m35876a(bArr2[0], 0));
            kVar.mo26019A(C10579b.m35876a(bArr2[0], 3));
            boolean z = true;
            kVar.mo26027I(C10579b.m35876a(bArr2[1], 3));
            kVar.mo26028J((byte[]) bArr2.clone());
            kVar.mo26055x(C10555d.m35780g(this.f27719b.mo26252k(inputStream)));
            kVar.mo26029K((long) this.f27719b.mo26243b(inputStream));
            C10585h.m35941h(inputStream, bArr);
            kVar.mo26056y(this.f27719b.mo26251j(bArr, 0));
            kVar.mo26057z((byte[]) bArr.clone());
            kVar.mo26054w(this.f27719b.mo26248g(inputStream, 4));
            kVar.mo26030L(this.f27719b.mo26248g(inputStream, 4));
            int k = this.f27719b.mo26252k(inputStream);
            kVar.mo26026H(k);
            kVar.mo26024F(this.f27719b.mo26252k(inputStream));
            if (k > 0) {
                byte[] bArr3 = new byte[k];
                C10585h.m35941h(inputStream, bArr3);
                String a = C10503e.m35457a(bArr3, kVar.mo26052u(), charset);
                if (a != null) {
                    if (a.contains(":" + System.getProperty("file.separator"))) {
                        a = a.substring(a.indexOf(":" + System.getProperty("file.separator")) + 2);
                    }
                    kVar.mo26025G(a);
                    if (!a.endsWith("/") && !a.endsWith("\\")) {
                        z = false;
                    }
                    kVar.mo26020B(z);
                } else {
                    throw new C10497a("file name is null, cannot assign file name to local file header");
                }
            } else {
                kVar.mo26025G((String) null);
            }
            m35443m(inputStream, kVar);
            m35449t(kVar, this.f27719b);
            m35438f(kVar, this.f27719b);
            if (kVar.mo26051t() && kVar.mo26039h() != C10556e.AES) {
                kVar.mo26022D(BigInteger.valueOf((long) kVar.mo26044m()[0]).testBit(6) ? C10556e.ZIP_STANDARD_VARIANT_STRONG : C10556e.ZIP_STANDARD);
            }
            return kVar;
        }
        throw new C10497a("Could not read enough bytes for generalPurposeFlags");
    }
}
