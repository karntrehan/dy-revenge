package p174e.p247e.p249b.p250a;

import android.net.Uri;
import java.util.List;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.b.a.f */
public class C6001f implements C5999d {

    /* renamed from: a */
    final List<C5999d> f16590a;

    public C6001f(List<C5999d> list) {
        this.f16590a = (List) C6062k.m22839g(list);
    }

    /* renamed from: a */
    public boolean mo17918a(Uri uri) {
        for (int i = 0; i < this.f16590a.size(); i++) {
            if (this.f16590a.get(i).mo17918a(uri)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo17919b() {
        return false;
    }

    /* renamed from: c */
    public String mo17920c() {
        return this.f16590a.get(0).mo17920c();
    }

    /* renamed from: d */
    public List<C5999d> mo17921d() {
        return this.f16590a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6001f) {
            return this.f16590a.equals(((C6001f) obj).f16590a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16590a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f16590a.toString();
    }
}
