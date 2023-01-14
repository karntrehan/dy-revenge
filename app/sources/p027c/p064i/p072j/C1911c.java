package p027c.p064i.p072j;

import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C1173d;

/* renamed from: c.i.j.c */
public final class C1911c {

    /* renamed from: a */
    private final Object f5604a;

    private C1911c(Object obj) {
        this.f5604a = obj;
    }

    /* renamed from: e */
    static C1911c m8003e(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1911c(obj);
    }

    /* renamed from: a */
    public int mo6450a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5604a).getSafeInsetBottom();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo6451b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5604a).getSafeInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo6452c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5604a).getSafeInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo6453d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f5604a).getSafeInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1911c.class != obj.getClass()) {
            return false;
        }
        return C1173d.m4572a(this.f5604a, ((C1911c) obj).f5604a);
    }

    public int hashCode() {
        Object obj = this.f5604a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f5604a + "}";
    }
}
