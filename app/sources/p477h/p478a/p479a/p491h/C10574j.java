package p477h.p478a.p479a.p491h;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p477h.p478a.p479a.p484d.C10503e;
import p477h.p478a.p479a.p485e.p486a.C10515h;
import p477h.p478a.p479a.p485e.p486a.C10518k;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p492i.C10584g;
import p477h.p478a.p479a.p492i.C10585h;

/* renamed from: h.a.a.h.j */
public class C10574j extends C10565d<C10575a> {

    /* renamed from: f */
    private char[] f28009f;

    /* renamed from: g */
    private C10515h f28010g;

    /* renamed from: h.a.a.h.j$a */
    public static class C10575a extends C10567f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f28011b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10543j f28012c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f28013d;

        public C10575a(String str, C10543j jVar, String str2, Charset charset) {
            super(charset);
            this.f28011b = str;
            this.f28012c = jVar;
            this.f28013d = str2;
        }
    }

    public C10574j(C10549p pVar, char[] cArr, C10572i.C10573a aVar) {
        super(pVar, aVar);
        this.f28009f = cArr;
    }

    /* renamed from: t */
    private C10518k m35856t(C10543j jVar, Charset charset) {
        C10515h b = C10584g.m35933b(mo26222n());
        this.f28010g = b;
        b.mo25944h(jVar);
        return new C10518k(this.f28010g, this.f28009f, charset);
    }

    /* renamed from: u */
    private String m35857u(String str, C10543j jVar, C10543j jVar2) {
        if (!C10585h.m35940g(str) || !jVar.mo26050s()) {
            return str;
        }
        String str2 = "/";
        if (str.endsWith(str2)) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String k = jVar2.mo26042k();
        String k2 = jVar.mo26042k();
        return k.replaceFirst(k2, str + str2);
    }

    /* renamed from: w */
    private List<C10543j> m35858w(C10543j jVar) {
        return !jVar.mo26050s() ? Collections.singletonList(jVar) : C10503e.m35460d(mo26222n().mo26141c().mo26058a(), jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public long mo26229a(C10575a aVar) {
        return C10503e.m35462f(m35858w(aVar.f28012c));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        throw r10;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26230c(p477h.p478a.p479a.p491h.C10574j.C10575a r9, p477h.p478a.p479a.p490g.C10558a r10) {
        /*
            r8 = this;
            h.a.a.f.j r0 = r9.f28012c     // Catch:{ all -> 0x0055 }
            java.nio.charset.Charset r1 = r9.f27998a     // Catch:{ all -> 0x0055 }
            h.a.a.e.a.k r0 = r8.m35856t(r0, r1)     // Catch:{ all -> 0x0055 }
            h.a.a.f.j r1 = r9.f28012c     // Catch:{ all -> 0x0047 }
            java.util.List r1 = r8.m35858w(r1)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0047 }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0047 }
            r4 = r2
            h.a.a.f.j r4 = (p477h.p478a.p479a.p488f.C10543j) r4     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r9.f28013d     // Catch:{ all -> 0x0047 }
            h.a.a.f.j r3 = r9.f28012c     // Catch:{ all -> 0x0047 }
            java.lang.String r6 = r8.m35857u(r2, r3, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = r9.f28011b     // Catch:{ all -> 0x0047 }
            r2 = r8
            r3 = r0
            r7 = r10
            r2.mo26221l(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            goto L_0x0016
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ all -> 0x0055 }
        L_0x003f:
            h.a.a.e.a.h r9 = r8.f28010g
            if (r9 == 0) goto L_0x0046
            r9.close()
        L_0x0046:
            return
        L_0x0047:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r10 = move-exception
            if (r0 == 0) goto L_0x0054
            r0.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            throw r10     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r9 = move-exception
            h.a.a.e.a.h r10 = r8.f28010g
            if (r10 == 0) goto L_0x005d
            r10.close()
        L_0x005d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p477h.p478a.p479a.p491h.C10574j.mo26230c(h.a.a.h.j$a, h.a.a.g.a):void");
    }
}
