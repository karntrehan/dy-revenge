package p174e.p181b.p182a.p195z;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5460j;

/* renamed from: e.b.a.z.c */
public class C5642c implements C5460j {

    /* renamed from: a */
    private static final Set<String> f15963a = new HashSet();

    /* renamed from: a */
    public void mo16566a(String str, Throwable th) {
        if (C5422c.f15141a) {
            Log.d("LOTTIE", str, th);
        }
    }

    /* renamed from: b */
    public void mo16567b(String str, Throwable th) {
        Set<String> set = f15963a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }

    /* renamed from: c */
    public void mo16568c(String str) {
        mo16567b(str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo16897d(String str, Throwable th) {
        if (C5422c.f15141a) {
            Log.d("LOTTIE", str, th);
        }
    }

    public void debug(String str) {
        mo16897d(str, (Throwable) null);
    }
}
