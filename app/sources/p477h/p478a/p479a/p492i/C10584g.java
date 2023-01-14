package p477h.p478a.p479a.p492i;

import java.io.File;
import java.nio.file.Path;
import p477h.p478a.p479a.p485e.p486a.C10513f;
import p477h.p478a.p479a.p485e.p486a.C10515h;
import p477h.p478a.p479a.p485e.p486a.C10520m;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10549p;

/* renamed from: h.a.a.i.g */
public class C10584g {
    /* renamed from: a */
    public static void m35932a(C10543j jVar, File file) {
        try {
            Path path = file.toPath();
            C10581d.m35883D(path, jVar.mo26092P());
            C10581d.m35884E(path, jVar.mo26045n());
        } catch (NoSuchMethodError unused) {
            C10581d.m35885F(file, jVar.mo26045n());
        }
    }

    /* renamed from: b */
    public static C10515h m35933b(C10549p pVar) {
        return pVar.mo26148j().getName().endsWith(".zip.001") ? new C10513f(pVar.mo26148j(), true, pVar.mo26143d().mo26070d()) : new C10520m(pVar.mo26148j(), pVar.mo26149k(), pVar.mo26143d().mo26070d());
    }
}
