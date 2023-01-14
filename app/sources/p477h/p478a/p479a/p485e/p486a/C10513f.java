package p477h.p478a.p479a.p485e.p486a;

import java.io.File;
import p477h.p478a.p479a.p492i.C10581d;

/* renamed from: h.a.a.e.a.f */
public class C10513f extends C10515h {
    public C10513f(File file, boolean z, int i) {
        super(file, z, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo25930a(int i) {
        String canonicalPath = this.f27775o.getCanonicalPath();
        String substring = canonicalPath.substring(0, canonicalPath.lastIndexOf("."));
        return new File(substring + C10581d.m35901p(i));
    }
}
