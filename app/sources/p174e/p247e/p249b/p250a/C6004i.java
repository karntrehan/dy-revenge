package p174e.p247e.p249b.p250a;

import android.net.Uri;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.b.a.i */
public class C6004i implements C5999d {

    /* renamed from: a */
    final String f16593a;

    /* renamed from: b */
    final boolean f16594b;

    public C6004i(String str) {
        this(str, false);
    }

    public C6004i(String str, boolean z) {
        this.f16593a = (String) C6062k.m22839g(str);
        this.f16594b = z;
    }

    /* renamed from: a */
    public boolean mo17918a(Uri uri) {
        return this.f16593a.contains(uri.toString());
    }

    /* renamed from: b */
    public boolean mo17919b() {
        return this.f16594b;
    }

    /* renamed from: c */
    public String mo17920c() {
        return this.f16593a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6004i) {
            return this.f16593a.equals(((C6004i) obj).f16593a);
        }
        return false;
    }

    public int hashCode() {
        return this.f16593a.hashCode();
    }

    public String toString() {
        return this.f16593a;
    }
}
