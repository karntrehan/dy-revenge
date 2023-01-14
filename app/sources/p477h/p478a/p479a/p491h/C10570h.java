package p477h.p478a.p479a.p491h;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import p477h.p478a.p479a.p484d.C10504f;
import p477h.p478a.p479a.p488f.C10549p;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p490g.C10558a;
import p477h.p478a.p479a.p491h.C10572i;
import p477h.p478a.p479a.p492i.C10581d;

/* renamed from: h.a.a.h.h */
public class C10570h extends C10564c<C10571a> {

    /* renamed from: h.a.a.h.h$a */
    public static class C10571a extends C10567f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public File f28001b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10550q f28002c;

        public C10571a(File file, C10550q qVar, Charset charset) {
            super(charset);
            this.f28001b = file;
            this.f28002c = qVar;
        }
    }

    public C10570h(C10549p pVar, char[] cArr, C10504f fVar, C10572i.C10573a aVar) {
        super(pVar, cArr, fVar, aVar);
    }

    /* renamed from: y */
    private List<File> m35837y(C10571a aVar) {
        List<File> n = C10581d.m35899n(aVar.f28001b, aVar.f28002c.mo26183r(), aVar.f28002c.mo26184s(), aVar.f28002c.mo26174i());
        if (aVar.f28002c.mo26181p()) {
            n.add(aVar.f28001b);
        }
        return n;
    }

    /* renamed from: z */
    private void m35838z(C10571a aVar) {
        File b = aVar.f28001b;
        if (aVar.f28002c.mo26181p() && b.getCanonicalFile().getParentFile() != null) {
            b = b.getCanonicalFile().getParentFile();
        }
        aVar.f28002c.mo26190y(b.getCanonicalPath());
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public long mo26229a(C10571a aVar) {
        List<File> n = C10581d.m35899n(aVar.f28001b, aVar.f28002c.mo26183r(), aVar.f28002c.mo26184s(), aVar.f28002c.mo26174i());
        if (aVar.f28002c.mo26181p()) {
            n.add(aVar.f28001b);
        }
        return mo26215m(n, aVar.f28002c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo26230c(C10571a aVar, C10558a aVar2) {
        List<File> y = m35837y(aVar);
        m35838z(aVar);
        mo26214j(y, aVar2, aVar.f28002c, aVar.f27998a);
    }
}
