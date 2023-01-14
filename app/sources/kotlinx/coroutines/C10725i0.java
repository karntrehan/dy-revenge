package kotlinx.coroutines;

import java.util.Objects;
import p455g.C10323s;
import p455g.p462v.C10372a;
import p455g.p462v.C10381g;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.i0 */
public final class C10725i0 extends C10372a implements C10705e2<String> {

    /* renamed from: f */
    public static final C10726a f28209f = new C10726a((C10452g) null);

    /* renamed from: o */
    private final long f28210o;

    /* renamed from: kotlinx.coroutines.i0$a */
    public static final class C10726a implements C10381g.C10386c<C10725i0> {
        private C10726a() {
        }

        public /* synthetic */ C10726a(C10452g gVar) {
            this();
        }
    }

    public C10725i0(long j) {
        super(f28209f);
        this.f28210o = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10725i0) && this.f28210o == ((C10725i0) obj).f28210o;
    }

    public int hashCode() {
        return C10772j0.m36624a(this.f28210o);
    }

    public String toString() {
        return "CoroutineId(" + this.f28210o + ')';
    }

    /* renamed from: u0 */
    public final long mo26684u0() {
        return this.f28210o;
    }

    /* renamed from: v0 */
    public void mo26660X(C10381g gVar, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: w0 */
    public String mo26661n0(C10381g gVar) {
        String u0;
        C10777k0 k0Var = (C10777k0) gVar.get(C10777k0.f28281f);
        String str = "coroutine";
        if (!(k0Var == null || (u0 = k0Var.mo26762u0()) == null)) {
            str = u0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int W = C10300q.m34966W(name, " @", 0, false, 6, (Object) null);
        if (W < 0) {
            W = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + W + 10);
        Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
        String substring = name.substring(0, W);
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(mo26684u0());
        C10323s sVar = C10323s.f27547a;
        String sb2 = sb.toString();
        C10457l.m35319d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb2);
        return name;
    }
}
