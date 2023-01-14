package p174e.p247e.p248a;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.a.b */
public class C5993b implements C5992a {

    /* renamed from: a */
    private final File f16566a;

    private C5993b(File file) {
        this.f16566a = (File) C6062k.m22839g(file);
    }

    /* renamed from: b */
    public static C5993b m22600b(File file) {
        return new C5993b(file);
    }

    /* renamed from: c */
    public static C5993b m22601c(File file) {
        if (file != null) {
            return new C5993b(file);
        }
        return null;
    }

    /* renamed from: a */
    public InputStream mo17904a() {
        return new FileInputStream(this.f16566a);
    }

    /* renamed from: d */
    public File mo17906d() {
        return this.f16566a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5993b)) {
            return false;
        }
        return this.f16566a.equals(((C5993b) obj).f16566a);
    }

    public int hashCode() {
        return this.f16566a.hashCode();
    }

    public long size() {
        return this.f16566a.length();
    }
}
