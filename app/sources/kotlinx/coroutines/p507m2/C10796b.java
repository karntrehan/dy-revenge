package kotlinx.coroutines.p507m2;

import kotlinx.coroutines.C10707f0;
import kotlinx.coroutines.internal.C10764w;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.m2.b */
public final class C10796b extends C10797c {

    /* renamed from: u */
    public static final C10796b f28317u;

    /* renamed from: v */
    private static final C10707f0 f28318v;

    static {
        C10796b bVar = new C10796b();
        f28317u = bVar;
        f28318v = new C10799e(bVar, C10766y.m36608d("kotlinx.coroutines.io.parallelism", C10247f.m34826b(64, C10764w.m36596a()), 0, 0, 12, (Object) null), "Dispatchers.IO", 1);
    }

    private C10796b() {
        super(0, 0, (String) null, 7, (C10452g) null);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public String toString() {
        return "Dispatchers.Default";
    }

    /* renamed from: y0 */
    public final C10707f0 mo26786y0() {
        return f28318v;
    }
}
