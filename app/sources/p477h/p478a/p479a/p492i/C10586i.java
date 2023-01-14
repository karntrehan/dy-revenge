package p477h.p478a.p479a.p492i;

import p477h.p478a.p479a.p484d.C10505g;
import p477h.p478a.p479a.p484d.C10506h;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;

/* renamed from: h.a.a.i.i */
public class C10586i {
    /* renamed from: a */
    public static int m35944a(C10550q qVar, C10583f fVar) {
        byte[] bArr = {C10505g.SPECIFICATION_VERSION.mo25909e(), C10505g.UNIX.mo25909e()};
        if (C10581d.m35910y() && !qVar.mo26185t()) {
            bArr[1] = C10505g.WINDOWS.mo25909e();
        }
        return fVar.mo26254m(bArr, 0);
    }

    /* renamed from: b */
    public static C10506h m35945b(C10550q qVar) {
        C10506h hVar = C10506h.DEFAULT;
        if (qVar.mo26169d() == C10555d.DEFLATE) {
            hVar = C10506h.DEFLATE_COMPRESSED;
        }
        if (qVar.mo26173h() > 4294967295L) {
            hVar = C10506h.ZIP_64_FORMAT;
        }
        return (!qVar.mo26180o() || !qVar.mo26171f().equals(C10556e.AES)) ? hVar : C10506h.AES_ENCRYPTED;
    }
}
