package androidx.camera.camera2.p003e;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.camera2.p003e.p004j3.C0418m0;
import androidx.camera.core.impl.C0875s0;
import androidx.camera.core.impl.C0879s2;
import androidx.camera.core.impl.C0908x2;
import androidx.core.util.C1177h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.c2 */
public final class C0334c2 implements C0875s0 {

    /* renamed from: a */
    private final Map<String, C0323a3> f1376a;

    /* renamed from: b */
    private final C0529r1 f1377b;

    /* renamed from: androidx.camera.camera2.e.c2$a */
    class C0335a implements C0529r1 {
        C0335a() {
        }

        /* renamed from: a */
        public CamcorderProfile mo1964a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        /* renamed from: b */
        public boolean mo1965b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    C0334c2(Context context, C0529r1 r1Var, Object obj, Set<String> set) {
        this.f1376a = new HashMap();
        C1177h.m4583e(r1Var);
        this.f1377b = r1Var;
        m1645c(context, obj instanceof C0418m0 ? (C0418m0) obj : C0418m0.m1869a(context), set);
    }

    public C0334c2(Context context, Object obj, Set<String> set) {
        this(context, new C0335a(), obj, set);
    }

    /* renamed from: c */
    private void m1645c(Context context, C0418m0 m0Var, Set<String> set) {
        C1177h.m4583e(context);
        for (String next : set) {
            this.f1376a.put(next, new C0323a3(context, next, m0Var, this.f1377b));
        }
    }

    /* renamed from: a */
    public C0879s2 mo1962a(String str, int i, Size size) {
        C0323a3 a3Var = this.f1376a.get(str);
        if (a3Var != null) {
            return a3Var.mo1927L(i, size);
        }
        return null;
    }

    /* renamed from: b */
    public Map<C0908x2<?>, Size> mo1963b(String str, List<C0879s2> list, List<C0908x2<?>> list2) {
        C1177h.m4580b(!list2.isEmpty(), "No new use cases to be bound.");
        C0323a3 a3Var = this.f1376a.get(str);
        if (a3Var != null) {
            return a3Var.mo1936y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }
}
