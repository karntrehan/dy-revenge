package p477h.p478a.p479a.p484d;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p492i.C10582e;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.d.e */
public class C10503e {
    /* renamed from: a */
    public static String m35457a(byte[] bArr, boolean z, Charset charset) {
        String str;
        Charset charset2 = C10582e.f28021b;
        if (charset2.equals(charset) && !z) {
            try {
                return new String(bArr, "Cp437");
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        } else if (charset != null) {
            return str;
        } else {
            str = new String(bArr, charset2);
            return str;
        }
    }

    /* renamed from: b */
    public static C10543j m35458b(C10549p pVar, String str) {
        C10543j c = m35459c(pVar, str);
        if (c != null) {
            return c;
        }
        String replaceAll = str.replaceAll("\\\\", "/");
        C10543j c2 = m35459c(pVar, replaceAll);
        return c2 == null ? m35459c(pVar, replaceAll.replaceAll("/", "\\\\")) : c2;
    }

    /* renamed from: c */
    private static C10543j m35459c(C10549p pVar, String str) {
        if (pVar == null) {
            throw new C10497a("zip model is null, cannot determine file header with exact match for fileName: " + str);
        } else if (!C10585h.m35940g(str)) {
            throw new C10497a("file name is null, cannot determine file header with exact match for fileName: " + str);
        } else if (pVar.mo26141c() == null) {
            throw new C10497a("central directory is null, cannot determine file header with exact match for fileName: " + str);
        } else if (pVar.mo26141c().mo26058a() == null) {
            throw new C10497a("file Headers are null, cannot determine file header with exact match for fileName: " + str);
        } else if (pVar.mo26141c().mo26058a().size() == 0) {
            return null;
        } else {
            for (C10543j next : pVar.mo26141c().mo26058a()) {
                String k = next.mo26042k();
                if (C10585h.m35940g(k) && str.equalsIgnoreCase(k)) {
                    return next;
                }
            }
            return null;
        }
    }

    /* renamed from: d */
    public static List<C10543j> m35460d(List<C10543j> list, C10543j jVar) {
        return !jVar.mo26050s() ? Collections.emptyList() : (List) list.stream().filter(new C10499a(jVar)).collect(Collectors.toList());
    }

    /* renamed from: e */
    public static long m35461e(C10549p pVar) {
        return pVar.mo26150l() ? pVar.mo26147i().mo26114e() : pVar.mo26143d().mo26073g();
    }

    /* renamed from: f */
    public static long m35462f(List<C10543j> list) {
        long j = 0;
        for (C10543j next : list) {
            j += (next.mo26048q() == null || next.mo26048q().mo26134f() <= 0) ? next.mo26046o() : next.mo26048q().mo26134f();
        }
        return j;
    }
}
