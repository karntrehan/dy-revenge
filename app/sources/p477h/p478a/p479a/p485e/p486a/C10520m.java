package p477h.p478a.p479a.p485e.p486a;

import java.io.File;

/* renamed from: h.a.a.e.a.m */
public class C10520m extends C10515h {

    /* renamed from: s */
    private int f27792s;

    public C10520m(File file, boolean z, int i) {
        super(file, z, i);
        this.f27792s = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public File mo25930a(int i) {
        if (i == this.f27792s) {
            return this.f27775o;
        }
        String canonicalPath = this.f27775o.getCanonicalPath();
        String str = i >= 9 ? ".z" : ".z0";
        return new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")) + str + (i + 1));
    }
}
