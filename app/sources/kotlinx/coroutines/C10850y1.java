package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.y1 */
public abstract class C10850y1 extends C10707f0 {
    public String toString() {
        String x0 = mo26880x0();
        if (x0 != null) {
            return x0;
        }
        return C10822q0.m36786a(this) + '@' + C10822q0.m36787b(this);
    }

    /* renamed from: w0 */
    public abstract C10850y1 mo26627w0();

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public final String mo26880x0() {
        C10850y1 y1Var;
        C10850y1 c = C10846x0.m36937c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            y1Var = c.mo26627w0();
        } catch (UnsupportedOperationException unused) {
            y1Var = null;
        }
        if (this == y1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
