package p174e.p199d.p218c.p226l;

import java.io.IOException;
import p174e.p199d.p217b.C5700b;
import p174e.p199d.p217b.C5705f;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5724c;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5736f;
import p174e.p199d.p218c.p226l.C5747b;
import p174e.p199d.p218c.p232q.C5860c;

/* renamed from: e.d.c.l.c */
public class C5755c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17223a(String str, C5732e eVar) {
        C5724c cVar = (C5724c) eVar.mo17170e(C5724c.class);
        if (cVar == null) {
            eVar.mo17166a(new C5724c(str));
        } else {
            cVar.mo17137a(str);
        }
    }

    /* renamed from: b */
    public void mo17224b(C5714o oVar, C5732e eVar) {
        oVar.mo17099s(false);
        mo17226d(oVar, eVar, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17225c(C5714o oVar, C5747b bVar, C5732e eVar) {
        String str;
        C5714o oVar2 = oVar;
        C5747b bVar2 = bVar;
        try {
            int j = bVar2.mo17146j(-2);
            long l = oVar.mo17083l();
            int f = oVar.mo17087f();
            bVar2.mo17125J(-1, f);
            if (f == 12 && j == 19778) {
                bVar2.mo17125J(2, oVar.mo17086e());
                bVar2.mo17125J(1, oVar.mo17086e());
                bVar2.mo17125J(3, oVar.mo17096p());
            } else if (f == 12) {
                bVar2.mo17125J(2, oVar.mo17096p());
                bVar2.mo17125J(1, oVar.mo17096p());
                bVar2.mo17125J(3, oVar.mo17096p());
            } else {
                long j2 = l;
                if (f != 16) {
                    if (f != 64) {
                        if (!(f == 40 || f == 52 || f == 56 || f == 108)) {
                            if (f != 124) {
                                bVar2.mo17137a("Unexpected DIB header size: " + f);
                                return;
                            }
                        }
                        bVar2.mo17125J(2, oVar.mo17087f());
                        bVar2.mo17125J(1, oVar.mo17087f());
                        bVar2.mo17125J(3, oVar.mo17096p());
                        bVar2.mo17125J(4, oVar.mo17096p());
                        bVar2.mo17125J(5, oVar.mo17087f());
                        oVar2.mo17084t(4);
                        bVar2.mo17125J(6, oVar.mo17087f());
                        bVar2.mo17125J(7, oVar.mo17087f());
                        bVar2.mo17125J(8, oVar.mo17087f());
                        bVar2.mo17125J(9, oVar.mo17087f());
                        if (f != 40) {
                            bVar2.mo17127L(12, oVar.mo17097q());
                            bVar2.mo17127L(13, oVar.mo17097q());
                            bVar2.mo17127L(14, oVar.mo17097q());
                            if (f != 52) {
                                bVar2.mo17127L(15, oVar.mo17097q());
                                if (f != 56) {
                                    long q = oVar.mo17097q();
                                    bVar2.mo17127L(16, q);
                                    oVar2.mo17084t(36);
                                    bVar2.mo17127L(17, oVar.mo17097q());
                                    bVar2.mo17127L(18, oVar.mo17097q());
                                    bVar2.mo17127L(19, oVar.mo17097q());
                                    if (f != 108) {
                                        bVar2.mo17125J(20, oVar.mo17087f());
                                        if (q != C5747b.C5751d.PROFILE_EMBEDDED.mo17218e()) {
                                            if (q != C5747b.C5751d.PROFILE_LINKED.mo17218e()) {
                                                oVar2.mo17084t(12);
                                                return;
                                            }
                                        }
                                        long q2 = oVar.mo17097q();
                                        int f2 = oVar.mo17087f();
                                        long j3 = q2 + j2;
                                        if (oVar.mo17083l() > j3) {
                                            bVar2.mo17137a("Invalid profile data offset 0x" + Long.toHexString(j3));
                                            return;
                                        }
                                        oVar2.mo17084t(j3 - oVar.mo17083l());
                                        if (q == C5747b.C5751d.PROFILE_LINKED.mo17218e()) {
                                            bVar2.mo17133R(21, oVar2.mo17091j(f2, C5705f.f16157g));
                                            return;
                                        }
                                        new C5860c().mo17776d(new C5700b(oVar2.mo17082d(f2)), eVar, bVar2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                bVar2.mo17125J(2, oVar.mo17087f());
                bVar2.mo17125J(1, oVar.mo17087f());
                bVar2.mo17125J(3, oVar.mo17096p());
                bVar2.mo17125J(4, oVar.mo17096p());
                if (f > 16) {
                    bVar2.mo17125J(5, oVar.mo17087f());
                    oVar2.mo17084t(4);
                    bVar2.mo17125J(6, oVar.mo17087f());
                    bVar2.mo17125J(7, oVar.mo17087f());
                    bVar2.mo17125J(8, oVar.mo17087f());
                    bVar2.mo17125J(9, oVar.mo17087f());
                    oVar2.mo17084t(6);
                    bVar2.mo17125J(10, oVar.mo17096p());
                    oVar2.mo17084t(8);
                    bVar2.mo17125J(11, oVar.mo17087f());
                    oVar2.mo17084t(4);
                    return;
                }
                return;
            }
            bVar2.mo17125J(4, oVar.mo17096p());
        } catch (IOException unused) {
            str = "Unable to read BMP header";
            bVar2.mo17137a(str);
        } catch (C5736f unused2) {
            str = "Internal error";
            bVar2.mo17137a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo17226d(C5714o oVar, C5732e eVar, boolean z) {
        try {
            int p = oVar.mo17096p();
            C5747b bVar = null;
            if (p != 16706) {
                if (p == 17225 || p == 18755 || p == 19778 || p == 20547 || p == 21584) {
                    C5747b bVar2 = new C5747b();
                    try {
                        eVar.mo17166a(bVar2);
                        bVar2.mo17125J(-2, p);
                        oVar.mo17084t(12);
                        mo17225c(oVar, bVar2, eVar);
                    } catch (IOException unused) {
                        bVar = bVar2;
                    }
                } else {
                    try {
                        eVar.mo17166a(new C5724c("Invalid BMP magic number 0x" + Integer.toHexString(p)));
                    } catch (IOException unused2) {
                        if (bVar == null) {
                            mo17223a("Unable to read BMP file header", eVar);
                        } else {
                            bVar.mo17137a("Unable to read BMP file header");
                        }
                    }
                }
            } else if (!z) {
                mo17223a("Invalid bitmap file - nested arrays not allowed", eVar);
            } else {
                oVar.mo17084t(4);
                long q = oVar.mo17097q();
                oVar.mo17084t(4);
                mo17226d(oVar, eVar, false);
                if (q != 0) {
                    if (oVar.mo17083l() > q) {
                        mo17223a("Invalid next header offset", eVar);
                        return;
                    }
                    oVar.mo17084t(q - oVar.mo17083l());
                    mo17226d(oVar, eVar, true);
                }
            }
        } catch (IOException e) {
            eVar.mo17166a(new C5724c("Couldn't determine bitmap type: " + e.getMessage()));
        }
    }
}
