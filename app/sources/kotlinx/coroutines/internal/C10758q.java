package kotlinx.coroutines.internal;

import kotlinx.coroutines.C10850y1;
import okhttp3.HttpUrl;
import p455g.C10279d;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.q */
final class C10758q extends C10850y1 {

    /* renamed from: o */
    private final Throwable f28263o;

    /* renamed from: p */
    private final String f28264p;

    public C10758q(Throwable th, String str) {
        this.f28263o = th;
        this.f28264p = str;
    }

    /* renamed from: z0 */
    private final Void m36571z0() {
        String k;
        if (this.f28263o != null) {
            String str = this.f28264p;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (!(str == null || (k = C10457l.m35326k(". ", str)) == null)) {
                str2 = k;
            }
            throw new IllegalStateException(C10457l.m35326k("Module with the Main dispatcher had failed to initialize", str2), this.f28263o);
        }
        C10757p.m36569c();
        throw new C10279d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        Throwable th = this.f28263o;
        sb.append(th != null ? C10457l.m35326k(", cause=", th) : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v0 */
    public boolean mo26626v0(C10381g gVar) {
        m36571z0();
        throw new C10279d();
    }

    /* renamed from: w0 */
    public C10850y1 mo26627w0() {
        return this;
    }

    /* renamed from: y0 */
    public Void mo26625u0(C10381g gVar, Runnable runnable) {
        m36571z0();
        throw new C10279d();
    }
}
